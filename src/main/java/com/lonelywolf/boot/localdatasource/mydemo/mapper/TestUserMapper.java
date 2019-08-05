package com.lonelywolf.boot.localdatasource.mydemo.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lonelywolf.boot.localdatasource.mydemo.entity.TestUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lonelywolf.boot.localdatasource.mydemo.model.UserDO;
import com.lonelywolf.boot.localdatasource.mydemo.vo.TestUserVO;

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

    IPage<UserDO> queryUserByPage(Page page, TestUserVO testUserVO);
}
