package com.tjetc;

//import com.tjetc.entity.Student;
import com.tjetc.config.MyDataSource;
import com.tjetc.entity.Student;
import com.tjetc.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
@SpringBootTest
@ImportResource("classpath:applicationContext.xml")
class SpringbootFirstApplicationTests {

   @Autowired
    private Student student;

    @Test
    void testStudent(){
        System.out.println(student);
    }
    @Autowired
    private HelloService helloService;
    @Test
    void testService(){
        System.out.println(helloService.sayHello());
    }
    @Autowired
    private MyDataSource myDataSource;
    @Test
    void contextLoads() {
        //System.out.println(student);
        System.out.println(myDataSource);
    }


}
