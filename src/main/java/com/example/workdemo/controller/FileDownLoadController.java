package com.example.workdemo.controller;

import com.example.workdemo.bean.ExcelExportBean;
import com.example.workdemo.util.ExcelExportUtils;
import com.example.workdemo.util.ExcelUtils;
import com.example.workdemo.util.FileDownLoad;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

@RestController
@Slf4j
public class FileDownLoadController {
    private final static Logger logger = LoggerFactory.getLogger(FileDownLoadController.class);
    @Autowired
    FileDownLoad fileDownLoad;

    @GetMapping("/excel")
    public String excelDownLoad() {
        try {
            //String filePathName = excelExportUtils();
            String filePathName = excelUtils();
            File file = new File(filePathName);
            if ((!file.exists()) || (!file.isFile())) {
                logger.info("文件不存在:" + file.getAbsolutePath());
                throw new FileNotFoundException();
            }
            fileDownLoad.downLoad(file);
            //下载后删除本地文件
            file.delete();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "下载成功！";
    }

    private String excelUtils() {

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
        return basePath + fileName;
    }

    private String excelExportUtils() throws NoSuchFieldException, IllegalAccessException, IOException {
        // 创建模拟数据
        ExcelExportBean user1 = new ExcelExportBean("admin", "123456", LocalDateTime.now());
        ExcelExportBean user2 = new ExcelExportBean("test", "123456", LocalDateTime.now());
        List<ExcelExportBean> users = Arrays.asList(user1, user2);

        // 文件路径
        String basePath = "src/main/resources/excelFile";
        String fileName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".xls";
        logger.info(basePath + fileName);

        // 将Excel写入文件
        HSSFWorkbook workbook = ExcelExportUtils.exportExcel(users, ExcelExportBean.class);
        workbook.setSheetName(0, "sheetName");//设置sheet的Name

        // 无论是通过HttpServletResponse导出还是导出到本地磁盘,本质都是IO操作，所以这里将IO操作提取到外层。
        workbook.write(new File(basePath + File.separator + fileName));

        return basePath + File.separator + fileName;

    }
}
