/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: CuserServiceImpl
 * Author:   没闹~
 * Date:     2020/10/7 14:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.mapper.CuserMapper;
import com.ytc.model.Cuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/7
 * @since 1.0.0
 */
@Service
@Component
public class CuserServiceImpl implements CuserService{

    @Autowired
    private CuserMapper cuserMapper;

    public Cuser queryCuserName(Cuser cuser) {
        return cuserMapper.queryCuserName(cuser);
    }

    @Override
    public void AddCuser(Cuser cuser) {
        cuserMapper.AddCuser(cuser);
    }
}