package com.wpf.service.impl;

import com.wpf.dao.UserDao;
import com.wpf.model.User;
import com.wpf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Wang pengfei
 * @date 2019/8/23 23:34
 * @ClassName: Application
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findById() {
        return userDao.findById();
    }
}
