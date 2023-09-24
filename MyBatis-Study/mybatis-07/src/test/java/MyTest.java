import com.zhudake.dao.TeacherMapper;
import com.zhudake.pojo.Teacher;
import com.zhudake.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    /*一对多处理*/
    //第一种方式
    @Test
    public void testTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherById(1);
        System.out.println(teacher);
        sqlSession.close();
    }
    //第二种方式
    @Test
    public void testTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherById2(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
