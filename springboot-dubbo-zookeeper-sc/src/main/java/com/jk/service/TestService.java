package com.jk.service;

import com.jk.model.User;

import java.util.List;

/**
 * Created by Administrator on 2018/5/10.
 */
public interface TestService {

     String geting (String name,String sex);
    List<User> queryUser();
}
