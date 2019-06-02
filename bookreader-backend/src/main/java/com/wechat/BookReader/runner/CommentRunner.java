package com.wechat.BookReader.runner;

import com.wechat.BookReader.dao.CommentRepo;
import com.wechat.BookReader.entity.Comment;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Component
@Order(value = 2)
public class CommentRunner implements ApplicationRunner {
    @Autowired
    private CommentRepo commentRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String separator = System.getProperty("file.separator");
        String path = "src"
                + separator + "main"
                + separator + "java"
                + separator + "com"
                + separator + "wechat"
                + separator + "BookReader"
                + separator + "comment.xlsx";
        File file = new File(path);
        Workbook workbook = null;
        try {
            InputStream inputStream = new FileInputStream(file);
            workbook = new XSSFWorkbook(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Sheet sheet = workbook.getSheetAt(0);
        int rowNum = sheet.getLastRowNum();
        for (int i = 1; i <= rowNum; i++) {
            Row row = sheet.getRow(i);
            String[] temp = new String[6];
            for (int index = 0; index < 6; index++) {
                try {
                    row.getCell(index).setCellType(CellType.STRING);
                    temp[index] = row.getCell(index).getStringCellValue();
                } catch (Exception e) {
                    temp[index] = "";
                }
            }
            int id = Integer.valueOf(temp[0]);
            int bookId = Integer.valueOf(temp[1]);
            String comment = temp[2];
            double star = Double.valueOf(temp[3]);
            String time = temp[4];
            String username = temp[5];
            Comment comment1 = new Comment(id,comment,username,bookId,time,star);
            commentRepo.save(comment1);
        }
    }
}
