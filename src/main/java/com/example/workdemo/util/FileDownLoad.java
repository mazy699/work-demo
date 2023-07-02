package com.example.workdemo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Component
public class FileDownLoad {

    @Autowired
    private HttpServletResponse response;

    public void downLoad(File file) {

        try (InputStream inStream = new FileInputStream(file); ServletOutputStream servletOS = response.getOutputStream()) {
            String fileName = file.getName();

            /* 设置response头信息 */
            response.reset();
            response.setContentType("application/octet-stream");    //代表任意二进制数据
            response.addHeader("Content-Disposition", "attachment;filename=\"" + URLEncoder.encode(fileName, StandardCharsets.UTF_8) + "\"");
            response.setContentLength((int) file.length());


            byte[] buf = new byte[4096];
            int readLength = 0;
            while ((readLength = inStream.read()) != -1) {
                servletOS.write(readLength);
            }
            servletOS.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
