package com.wpf.app;

import com.wpf.model.User;
import com.wpf.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Wang pengfei
 * @date 2019/8/23 23:46
 * @ClassName: Application
 * @Description:
 */

//@ComponentScan("com.wpf")//这个OK
//@ComponentScan(basePackages = {"com.wpf.dao","com.wpf.service"})//这个OK
@ComponentScan  //无法注入dao包和service包下的类
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = null;
        try {
            applicationContext = new AnnotationConfigApplicationContext(Main.class);//初始化IOC容器
            UserService userService = applicationContext.getBean(UserService.class);//通过IOC容器获得你要执行的业务代码的类
            User user = userService.findById();//通过IOC容器获取到的类执行你的业务代码
            System.out.println(user);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (applicationContext != null){
                applicationContext.close();
                System.out.println("普通java程序执行完成,IOC容器关闭。。。");
            }

        }
    }
}
