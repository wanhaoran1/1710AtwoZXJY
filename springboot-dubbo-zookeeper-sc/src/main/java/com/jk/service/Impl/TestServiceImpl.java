package com.jk.service.Impl;

import com.jk.mapper.UserMapper;
import com.jk.model.User;
import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/5/10.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String geting(String name, String sex) {

        return name+"*******************"+sex;
    }

    @Override
    public List<User> queryUser() {
        return userMapper.queryUser();
    }
}
