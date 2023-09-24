package com.zhudake.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

public class JsonUtil {

    public static String getJson(Object object){
        return getJson(object,"yyyy-MM-dd HH:mm:ss");
    }
    public static String getJson(Object object,String dateFormat){
        ObjectMapper mapper = new ObjectMapper();
        //关闭时间类型转换为时间戳
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);

        //指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

        try {
            return mapper.writeValueAsString(sdf.format(object));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;

    }
}
