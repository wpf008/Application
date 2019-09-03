package com.wpf.dao;

import com.wpf.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Wang pengfei
 * @date 2019/8/23 23:29
 * @ClassName: Application
 * @Description:
 */
@Repository
public class UserDao {

    //这里可以 @Autowired 来注入SqlSession
    // 然后findById方法可以真正从数据库获取数据


    public User findById(){//模拟从数据库查数据等
        User user =new User();
        user.setId("2019");
        user.setName("pengfei.wang");
        user.setAge(25);
        return user;
    }
}
