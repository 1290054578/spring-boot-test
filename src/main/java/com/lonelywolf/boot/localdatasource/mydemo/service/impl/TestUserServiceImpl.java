package com.lonelywolf.boot.localdatasource.mydemo.service.impl;

import com.lonelywolf.boot.localdatasource.mydemo.entity.TestUser;
import com.lonelywolf.boot.localdatasource.mydemo.mapper.TestUserMapper;
import com.lonelywolf.boot.localdatasource.mydemo.service.ITestUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiangyong.zeng
 * @since 2019-07-23
 */
@Service
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUser> implements ITestUserService {



    @Override
    public List<TestUser> queryAllUser(TestUser testUser) {
       return  this.baseMapper.queryAll(null);
    }
}
