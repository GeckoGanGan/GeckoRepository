package com.zhudake.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private String id;
    protected String title;
    private String author;
    private Date createTime;
    private int views;


}
