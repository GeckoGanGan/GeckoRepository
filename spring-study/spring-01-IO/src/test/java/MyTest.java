import com.zhudake.dao.UserDao;
import com.zhudake.dao.UserDaoImpl;
import com.zhudake.dao.UserDaoImpl1;
import com.zhudake.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取ApplicationContext
/*        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
        userService.getUser();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserDaoImpl1 userDaoImpl1 = context.getBean("userDaoImpl1", UserDaoImpl1.class);

        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);

        userServiceImpl.setUserDao(userDaoImpl1);
        userServiceImpl.getUser();
    }

}
