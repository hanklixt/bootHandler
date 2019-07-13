package com.boot.demo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "emp")
@Data
public class Emp {

//
//
    private String name;
    private Integer age;
    private Boolean sex;
    private Double salary;
    private Map<String,String> map;
    private List<String> list;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate date;
    private Forte forte;

}
