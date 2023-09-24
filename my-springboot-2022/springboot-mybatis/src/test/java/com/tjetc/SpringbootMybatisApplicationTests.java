package com.tjetc;

import com.github.pagehelper.PageInfo;
import com.tjetc.entity.User;
import com.tjetc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private DataSource dataSource;

    @Test
    void testDataSource(){
        System.out.println(dataSource.getClass());
    }
    @Autowired
    private UserService userService;
    @Test
    void testPage(){
        PageInfo<User> page=userService.findPage(1,5);
        //打印当前页
        System.out.println(page.getPageNum());
        //打印每一页的记录数
        System.out.println(page.getPageSize());
        //打印user
        List<User> list = page.getList();
        for(User user:list){
            System.out.println(user);
        }

    }

}
