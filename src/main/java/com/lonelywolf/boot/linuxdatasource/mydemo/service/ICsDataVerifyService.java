package com.lonelywolf.boot.linuxdatasource.mydemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lonelywolf.boot.linuxdatasource.mydemo.entity.CsDataVerify;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiangyong.zeng
 * @since 2019-07-19
 */
public interface ICsDataVerifyService extends IService<CsDataVerify> {
    List<CsDataVerify> queryAll(CsDataVerify csDataVerify);

    List<CsDataVerify> queryByBaseMapper(CsDataVerify csDataVerify);
}
