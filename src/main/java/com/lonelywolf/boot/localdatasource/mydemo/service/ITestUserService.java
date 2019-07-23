package com.lonelywolf.boot.localdatasource.mydemo.service;

import com.lonelywolf.boot.localdatasource.mydemo.entity.TestUser;
import com.baomidou.mybatisplus.extension.service.IService;

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

}
