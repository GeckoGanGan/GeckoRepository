package com.oop.Demo09;

//  interface 关键字,接口都需要实现类
public interface UserService {

    //常量    ~public static final
    int AGE = 99;

    //接口中的所有定义都是抽象的public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
