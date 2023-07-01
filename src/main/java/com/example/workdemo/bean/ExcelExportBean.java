package com.example.workdemo.bean;

import com.example.workdemo.validate.ExcelHeader;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExcelExportBean {

    @ExcelHeader(value = "账号")
    private String username;

    @ExcelHeader(value = "密码")
    private String password;

    @ExcelHeader(value = "生日")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime birthday;

    // 该字段没有添加注解, Excel不导出
    private Integer age;

    public ExcelExportBean(String username, String password, LocalDateTime birthday) {
        this.username = username;
        this.password = password;
        this.birthday = birthday;
    }
}

