package com.example.workdemo;

import com.example.workdemo.bean.ExcelExportBean;
import com.example.workdemo.util.ExcelExportUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

class ExcelExportUtilsTests {

    @Test
    void contextLoads() throws NoSuchFieldException, IllegalAccessException, IOException {
        // 创建模拟数据
        ExcelExportBean user1 = new ExcelExportBean("admin", "123456", LocalDateTime.now());
        ExcelExportBean user2 = new ExcelExportBean("test", "123456", LocalDateTime.now());
        List<ExcelExportBean> users = Arrays.asList(user1, user2);

        // 文件路径
        String basePath = "src/main/resources/excelFile";
        String fileName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".xls";
        System.out.println(fileName);

        // 将Excel写入文件
        HSSFWorkbook workbook = ExcelExportUtils.exportExcel(users, ExcelExportBean.class);
        workbook.setSheetName(0, "sheetName");//设置sheet的Name

        // 无论是通过HttpServletResponse导出还是导出到本地磁盘,本质都是IO操作，所以这里将IO操作提取到外层。
        workbook.write(new File(basePath + File.separator + fileName));
    }
}

