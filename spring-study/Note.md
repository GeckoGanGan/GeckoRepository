## 1、常用依赖和配置
- 自动注入注解配置
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd">

    <!--配置注解扫描的包，在这个包下注解才生效-->
    <context:component-scan base-package="com.zhudake"/>
    <!--开启注解自动装配-->
    <context:annotation-config/>
</beans>
```
- AOP JDK实现,需要导入约束
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/aop
       http://www.springframework.org/schema/aop/spring-aop.xsd
">
    <!--注册bean-->
   <!-- <bean id="userService" class="com.zhudake.service.UserServiceImpl"></bean>

    <bean id="beforeLog" class="com.zhudake.log.LogAfter"/>
    <bean id="afterLog" class="com.zhudake.log.LogBefore"/>-->

    <!--方式一：使用原生Spring API接口-->
    <!--配置aop:需要导入aop的约束-->
<!--    <aop:config>
        &lt;!&ndash;切入点：expression：表达式，execution(要执行的位置！* * * * *)&ndash;&gt;
        <aop:pointcut id="pointcut" expression="execution(* com.zhudake.service.UserServiceImpl.*(..))"/>
        &lt;!&ndash;执行环绕增加！&ndash;&gt;
        <aop:advisor advice-ref="beforeLog" pointcut-ref="pointcut"/>
        <aop:advisor advice-ref="afterLog" pointcut-ref="pointcut"/>
    </aop:config>-->
</beans>
```


## 2、常用注解
- @AutoWired:注解实现自动注入，先通过byType,再通过byName来实现
- @Qualifier(value = “xxx”):可以通过改注解配合@AutoWired来确定唯一的bean
- @Resource(name = "xxx"):java自带的自动注入的注解，范围更广，byName+byType实现

注解开发：
- @Component :将当前类注册到Spring容器
- @Scope:作用域
- @value:装配类的属性值，可以写在属性上面或者set方法上面

纯Java配置bean：
- @Configuration:这个也会Spring容器托管，注册到容器中，因为它本来就是一个@Component
。@Configuration代表这是一个配置类，就和我们之前看的beans.xml
- @Import(JavaConfig2.class):合并配置类
- @Bean:    @Bean(name = "user") @Bean里面可以设置name相当于bean里的id；
  注册一个bean，就相当于我们之前写的一个bean标签；
  这个方法的名字，就相当于bean标签中id属性；
  这个方法的返回值，就相当于bean标签中的class属性。
- 