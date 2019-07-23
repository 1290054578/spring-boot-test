package com.lonelywolf.boot.localdatasource.mydemo.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.lonelywolf.boot.localdatasource.mydemo.entity.TestUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiangyong.zeng
 * @since 2019-07-23
 */
public interface TestUserMapper extends BaseMapper<TestUser> {

    List<TestUser> queryAll(TestUser testUser);
}
