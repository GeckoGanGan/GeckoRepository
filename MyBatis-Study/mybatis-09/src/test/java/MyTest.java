import com.zhudake.dao.UserMapper;
import com.zhudake.pojo.User;
import com.zhudake.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void getUserById(){
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user1 = mapper1.getUserById(1);
        System.out.println(user1);
        sqlSession1.close();

        System.out.println("=============");
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.getUserById(1);
        System.out.println(user2);
        System.out.println(user1==user2);
        sqlSession2.close();

    }
}
