package com.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.pojo.Repo;
import com.server.service.RepoService;
import com.server.mapper.RepoMapper;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
public class RepoServiceImpl extends ServiceImpl<RepoMapper, Repo>
implements RepoService{

}
