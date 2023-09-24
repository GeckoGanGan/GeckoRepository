import com.sun.deploy.association.utility.AppUtility;
import com.zhudake.dao.UserMapper;
import com.zhudake.pojo.User;
import com.zhudake.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(7,"嘿嘿","111111"));


        sqlSession.close();
    }

}
