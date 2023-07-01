package com.example.workdemo;

import com.example.workdemo.util.ExcelUtils;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.*;

class ExcelUtilsTests {

    @Test
    void contextLoads() {
        // 文件路径
        String basePath = "src/main/resources/excelFile/";
        String fileName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".xlsx";
        System.out.println(fileName);
        List<String> headList = new ArrayList<>();
        headList.add("账号");
        headList.add("密码");
        headList.add("生日");
        List<String> fieldList = new ArrayList<>();
        fieldList.add("username");
        fieldList.add("password");
        fieldList.add("birthday");
        List<Map<String, Object>> dataList = new ArrayList<>();
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("username", "admin");
        dataMap.put("password", "123456");
        dataMap.put("birthday", "20010101");
        dataList.add(dataMap);
        Map<String, Object> dataMap1 = new HashMap<>();
        dataMap1.put("username", "admin");
        dataMap1.put("password", "123456");
        dataMap1.put("birthday", "20010102");
        dataList.add(dataMap1);
        // 将Excel写入文件
        try {
            ExcelUtils.createExcel(basePath + fileName, headList.toArray(new String[headList.size()]), fieldList.toArray(new String[fieldList.size()]), dataList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

