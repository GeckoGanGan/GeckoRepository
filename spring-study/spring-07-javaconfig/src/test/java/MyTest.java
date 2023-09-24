import com.zhudake.javaconfig.JavaConfig;
import com.zhudake.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test(){
        //如果完全使用了配置类方式去做，我们就只能通过 AnnotationConfig 上下文来获取容器，通过配置类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user.name);
    }
}
