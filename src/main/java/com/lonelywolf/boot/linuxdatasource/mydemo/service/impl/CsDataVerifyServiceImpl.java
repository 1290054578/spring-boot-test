package com.lonelywolf.boot.linuxdatasource.mydemo.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lonelywolf.boot.linuxdatasource.mydemo.entity.CsDataVerify;
import com.lonelywolf.boot.linuxdatasource.mydemo.mapper.CsDataVerifyMapper;
import com.lonelywolf.boot.linuxdatasource.mydemo.service.ICsDataVerifyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiangyong.zeng
 * @since 2019-07-19
 */
@Service
public class CsDataVerifyServiceImpl extends ServiceImpl<CsDataVerifyMapper, CsDataVerify> implements ICsDataVerifyService {

    @Resource
    private CsDataVerifyMapper csDataVerifyMapper;

    @Override
    public List<CsDataVerify> queryAll(CsDataVerify csDataVerify) {
        List<CsDataVerify> list = null;
        try{
           list = csDataVerifyMapper.queryAllInfo(csDataVerify);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }


    @Override
    public List<CsDataVerify> queryByBaseMapper(CsDataVerify csDataVerify) {
        return this.baseMapper.selectList(new LambdaQueryWrapper<CsDataVerify>());
    }
}
