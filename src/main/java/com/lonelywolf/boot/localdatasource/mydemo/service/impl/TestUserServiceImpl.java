package com.lonelywolf.boot.localdatasource.mydemo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lonelywolf.boot.localdatasource.mydemo.entity.TestUser;
import com.lonelywolf.boot.localdatasource.mydemo.mapper.TestUserMapper;
import com.lonelywolf.boot.localdatasource.mydemo.service.ITestUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lonelywolf.boot.localdatasource.mydemo.vo.TestUserVO;
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

    @Override
    public IPage<TestUser> queryUserByPage(TestUserVO testUserVO) {
        Page page = new Page(testUserVO.getCurrent(),testUserVO.getPageSize());
        System.out.println(this.baseMapper.queryAll(null));

        System.out.println(this.baseMapper.selectList(null));

        System.out.println("--------------------------------");

        System.out.println( this.baseMapper.selectPage(page,null));
        System.out.println("--------------------------------");

        System.out.println(this.baseMapper.queryUserByPage(page,testUserVO));
        try{
   //         System.out.println(this.baseMapper.queryUserByPage(page,testUserVO));
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
