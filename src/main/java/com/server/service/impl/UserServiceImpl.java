package com.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.pojo.User;
import com.server.service.UserService;
import com.server.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}
