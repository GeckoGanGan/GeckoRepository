import com.zhudake.pojo.Books;
import com.zhudake.service.BooksService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksServiceImpl = context.getBean("booksServiceImpl", BooksService.class);
        for (Books books : booksServiceImpl.queryAllBooks()) {
            System.out.println(books);
        }
    }
}
