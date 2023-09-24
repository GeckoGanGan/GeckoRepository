package com.zhudake.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.zhudake.pojo.User;
import com.zhudake.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class JsonTest {
    //@RequestMapping(value = "/j1",produces = "application/json;charset=utf-8") produces解决json乱码问题
    @RequestMapping(value = "/j1")
    public String test1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        User user = new User("朱大可1号", 18, "男");
        return  JsonUtil.getJson(user) ;
    }

    //测试集合
    @RequestMapping(value = "/j2")
    public String test2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        User user1 = new User("朱大可1号", 18, "男");
        User user2 = new User("朱大可2号", 18, "男");
        User user3 = new User("朱大可3号", 18, "男");
        User user4 = new User("朱大可4号", 18, "男");

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        return JsonUtil.getJson(userList);
    }
    @RequestMapping(value = "/j3")
    public String test3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        //mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String formatDate = sdf.format(new Date());
        //mapper.setDateFormat(sdf);
        Date date = new Date();
        return JsonUtil.getJson(date,"yyyy-MM-dd");
        //return mapper.writeValueAsString(formatDate);
    }
    //Fastjson测试
    @RequestMapping(value = "/j4")
    public String test4() throws JsonProcessingException {

        User user1 = new User("朱大可1号", 18, "男");
        User user2 = new User("朱大可2号", 18, "男");
        User user3 = new User("朱大可3号", 18, "男");
        User user4 = new User("朱大可4号", 18, "男");

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        System.out.println("*******Java对象 转 JSON字符串*******");
        String str1 = JSON.toJSONString(userList);
        System.out.println("JSON.toJSONString(list)==>"+str1);
        String str2 = JSON.toJSONString(user1);
        System.out.println("JSON.toJSONString(user1)==>"+str2);

        System.out.println("\n****** JSON字符串 转 Java对象*******");
        User jp_user1=JSON.parseObject(str2,User.class);
        System.out.println("JSON.parseObject(str2,User.class)==>"+jp_user1);

        System.out.println("\n****** Java对象 转 JSON对象 ******");
        JSONObject jsonObject1 = (JSONObject) JSON.toJSON(user2);
        System.out.println("(JSONObject) JSON.toJSON(user2)==>"+jsonObject1.getString("name"));

        System.out.println("\n****** JSON对象 转 Java对象 ******");
        User to_java_user = JSON.toJavaObject(jsonObject1, User.class);
        System.out.println("JSON.toJavaObject(jsonObject1, User.class)==>"+to_java_user);

        return "hello";
    }
}
