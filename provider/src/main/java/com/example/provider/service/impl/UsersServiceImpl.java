package com.example.provider.service.impl;

import com.example.common.entity.User;
import com.example.common.service.UsersService;
import com.example.provider.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaoxingyu
 * @description
 * @created 2019/8/23
 * @modified by zhaoxingyu on 2019/8/23
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser() {
        return userMapper.getOne(1);
    }
}
