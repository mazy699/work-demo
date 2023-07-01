package com.example.workdemo.util;

import com.example.workdemo.validate.ExcelHeader;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExcelExportUtils {
    public static List<List<Object>> readExcel(File file) throws Exception {
        //File file = new File("C:\\user\\desktop\\文件.xlsx");
        XSSFWorkbook sheets = new XSSFWorkbook(new FileInputStream(file));
        //System.out.println(sheets.getNumberOfSheets());  获取总sheet表个数
        for (int i = 0; i < sheets.getNumberOfSheets(); i++) {
            //获取单个sheet
            XSSFSheet sheet = sheets.getSheetAt(i);
            //获取首行
            XSSFRow title = sheet.getRow(0);

            for (int j = 1; j < sheet.getPhysicalNumberOfRows(); j++) {
                //获取单行
                XSSFRow row = sheet.getRow(j);
                //获取单个单元格
                XSSFCell cell = row.getCell(0);
                //设置单元格格式
                cell.setCellType(CellType.STRING);

                //...对单元格进行操作
                String value = cell.getStringCellValue();
            }
        }
        return new ArrayList<List<Object>>();
    }

    /**
     * @param data 需要导出的数据
     * @param clz  数据对应的实体类
     * @param <T>  泛型
     * @return Excel文件
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static <T> HSSFWorkbook exportExcel(List<T> data, Class<T> clz) throws NoSuchFieldException, IllegalAccessException {

        Field[] fields = clz.getDeclaredFields();
        List<String> headers = new LinkedList<>();
        List<String> variables = new LinkedList<>();

        // 创建工作薄对象
        HSSFWorkbook workbook = new HSSFWorkbook();//这里也可以设置sheet的Name
        // 创建工作表对象
        HSSFSheet sheet = workbook.createSheet();
        // 创建表头
        Row rowHeader = sheet.createRow(0);

        // 表头处理
        //根据实体类的自定义注解来创建表头值
        for (int h = 0; h < fields.length; h++) {
            Field field = fields[h];
            if (field.isAnnotationPresent(ExcelHeader.class)) {
                // 表头
                ExcelHeader annotation = field.getAnnotation(ExcelHeader.class);
                headers.add(annotation.value());
                rowHeader.createCell(h).setCellValue(annotation.value());

                // 每个字段名
                variables.add(field.getName());
            }
        }

        // 数据处理
        for (int i = 0; i < data.size(); i++) {

            //创建工作表的行(表头占用1行, 这里从第二行开始)
            HSSFRow row = sheet.createRow(i + 1);
            // 获取一行数据
            T t = data.get(i);
            Class<?> aClass = t.getClass();
            // 填充列数据
            for (int j = 0; j < variables.size(); j++) {

                Field declaredField = aClass.getDeclaredField(variables.get(j));
                declaredField.setAccessible(true);

                String key = declaredField.getName();
                Object value = declaredField.get(t);

                row.createCell(j).setCellValue(value.toString());
            }
        }
        //log.info("Excel文件创建成功");
        return workbook;
    }
}
