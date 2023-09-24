import com.zhudake.pojo.Student;
import com.zhudake.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /*
        Student{name='王麻子',
        address=Address{address='贵州'},
        books=[西游记, 红楼梦, 水浒传, 三国演义],
        hobbies=[唱, 跳, rap, 篮球],
        card={
          身份证=12212123342561,
          银行卡=12123424131324514
          },
        games=[地平线, 极限过度, 双人成行],
        wife='null',
        info={
            学号=2011650132,
            性别=男, 年龄=18
            }
        }
         */
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");
        User user1 = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user1==user2);

    }
}
