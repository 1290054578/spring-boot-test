package com.lonelywolf.boot.linuxdatasource.mydemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lonelywolf.boot.linuxdatasource.mydemo.entity.CsDataVerify;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiangyong.zeng
 * @since 2019-07-19
 */
public interface CsDataVerifyMapper extends BaseMapper<CsDataVerify> {

    List<CsDataVerify> queryAllInfo(CsDataVerify csDataVerify);
}
