package com.zhudake.demo02;

public class UserServiceProxy implements UserService{
    private UserService userService;

    public void setUserService(UserServiceImpl userServiceImpl) {
        this.userService = userServiceImpl;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();

    }

    @Override
    public void update() {
        log("update");
     userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    //增加日志实现
    public void log(String msg){
        System.out.println("日志：使用了"+msg+"方法");
    }
}
