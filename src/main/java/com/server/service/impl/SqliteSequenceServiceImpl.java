package com.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.pojo.SqliteSequence;
import com.server.service.SqliteSequenceService;
import com.server.mapper.SqliteSequenceMapper;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
public class SqliteSequenceServiceImpl extends ServiceImpl<SqliteSequenceMapper, SqliteSequence>
implements SqliteSequenceService{

}
