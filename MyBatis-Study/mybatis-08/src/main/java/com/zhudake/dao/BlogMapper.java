package com.zhudake.dao;

import com.zhudake.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入数据
    int addBook(Blog blog);

    //按照title和author
    List<Blog> getBlogByIf(Map map);

    List<Blog> getBlogWhere(Map map);
    List<Blog> getBlogChoose(Map map);

    //更新blog
    int updateBlog(Map map);

    //foreach
    List<Blog> getBlogForeach(Map map);

}
