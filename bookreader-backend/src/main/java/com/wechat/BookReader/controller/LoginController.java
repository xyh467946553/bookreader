package com.wechat.BookReader.controller;

import com.wechat.BookReader.bl.LoginService;
import com.wechat.BookReader.parameter.UserLoginParam;
import com.wechat.BookReader.response.BasicResponse;
import com.wechat.BookReader.util.CommonUtil;
import io.micrometer.core.instrument.util.StringUtils;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @Value("${weixin.app_id}")
    private String appId;

    @Value("${weixin.app_secret}")
    private String secret;

    @PostMapping(value = "/userLogin")
    public BasicResponse userLogin(@RequestBody UserLoginParam param){
        String openId = getOpenId(param.getCode());
        if(openId.equals("")){
            return new BasicResponse(false,"获取openId发生异常！");
        }
        return loginService.userLogin(openId, param.getUsername());
    }

    private String getOpenId(String code){
        String openId = "";
        Map<String, Object> map = new HashMap<String, Object>();
        String status = "1";
        String msg = "ok";
        String WX_URL = "https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";
        try {
            if(StringUtils.isBlank(code)){
                status = "0";//失败状态
                msg = "code为空";
            }else {
                String requestUrl = WX_URL.replace("APPID", appId).
                        replace("SECRET", secret).replace("JSCODE", code).
                        replace("authorization_code", "authorization_code");
                // 发起GET请求获取凭证
                JSONObject jsonObject = CommonUtil.httpsRequest(requestUrl, "GET", null);
                if (jsonObject != null) {
                    try {
                        openId = jsonObject.getString("openid");
                    } catch (JSONException e) {
                        // 获取token失败
                        status = "0";
                        msg = "code无效";
                        return "";
                    }
                }else {
                    status = "0";
                    msg = "code无效";
                }
            }
        } catch (Exception e) {
            return "";
        }
        return openId;
    }
}
