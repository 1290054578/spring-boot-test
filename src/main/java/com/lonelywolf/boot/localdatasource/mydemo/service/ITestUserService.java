package com.lonelywolf.boot.localdatasource.mydemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lonelywolf.boot.localdatasource.mydemo.entity.TestUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lonelywolf.boot.localdatasource.mydemo.vo.TestUserVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiangyong.zeng
 * @since 2019-07-23
 */
public interface ITestUserService extends IService<TestUser> {
    List<TestUser> queryAllUser(TestUser testUser);


    IPage<TestUser> queryUserByPage(TestUserVO testUserVO);
}
