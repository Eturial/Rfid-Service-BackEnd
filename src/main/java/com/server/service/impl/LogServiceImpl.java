package com.server.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.pojo.Log;
import com.server.service.LogService;
import com.server.mapper.LogMapper;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService{

}
