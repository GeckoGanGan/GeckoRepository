import com.zhudake.pojo.Blog;
import com.zhudake.utils.IDUtils;
import com.zhudake.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.zhudake.dao.BlogMapper;

import java.util.*;

public class MyTest {
    @Test
    public void addBook(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java");
        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring");
        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务");
        mapper.addBook(blog);

        sqlSession.close();
    }
    @Test
    public void getBolgByIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map<Object, Object> map = new HashMap<>();
        //map.put("title","Java");
       // map.put("author","狂神说");

        List<Blog> blogList = mapper.getBlogByIf(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void getBlogWhere(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map<Object, Object> map = new HashMap<>();
        map.put("title","Java");
        // map.put("author","狂神说");

        List<Blog> blogList = mapper.getBlogWhere(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void getBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map<Object, Object> map = new HashMap<>();
        //map.put("title","Java");
       // map.put("author","狂神说");
        map.put("views","9999");

        List<Blog> blogList = mapper.getBlogChoose(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map<Object, Object> map = new HashMap<>();
        //map.put("title","Mybatis2");
       // map.put("author","张三");
        map.put("id","be6337bedc7e412cb38e8c5d4c46a362");

       mapper.updateBlog(map);
       sqlSession.close();
    }
    @Test
    public void getBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        Map<Object, Object> map = new HashMap<>();
        map.put("idList",list);

        List<Blog> blogList = mapper.getBlogForeach(map);

        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.close();


    }
}
