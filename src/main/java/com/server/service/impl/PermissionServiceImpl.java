package com.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.pojo.Permission;
import com.server.service.PermissionService;
import com.server.mapper.PermissionMapper;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService{

}
