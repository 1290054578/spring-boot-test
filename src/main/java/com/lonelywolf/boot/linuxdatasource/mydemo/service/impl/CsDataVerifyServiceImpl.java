package com.lonelywolf.boot.linuxdatasource.mydemo.service.impl;


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
        return csDataVerifyMapper.queryAllInfo(csDataVerify);
    }
}
