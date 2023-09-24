package com.tjetc.controller;

import com.tjetc.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class LoginController {
    @PostMapping("login")
    public Map login(@RequestBody User user){
        //登录失败
        String flag = "fail";
        if (!"admin".equals(user.getUsername()) || !"123456".equals(user.getPassword())) {
            Map<String , Object> map =  new HashMap<>();
            map.put("flag", flag);
            return map;
        } else {//登录成功
            User user1 = new User("admin", "123456");
            flag="ok";
            Map<String , Object> map =  new HashMap<>();
            map.put("flag", flag);
            map.put("user", user1);
            return map;
        }
    }
}
