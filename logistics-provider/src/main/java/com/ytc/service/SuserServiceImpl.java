/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: SuserServiceImpl
 * Author:   没闹~
 * Date:     2020/10/7 14:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.mapper.SuserMapper;
import com.ytc.model.Suser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
public class SuserServiceImpl implements SuserService{

    @Autowired
    private SuserMapper suserMapper;

    @Override//207
    public Suser suserLogin(Suser suser) {//207
        return suserMapper.suserLogin(suser);//207处理爆红;
    }//207

    @Override//106
    public Suser querySuserByName(Suser suser) {//106
        return suserMapper.querySuserByName(suser);//106处理爆红
    }

    @Override//113
    public void reg(Suser suser) {//113
        suserMapper.reg(suser);//113处理爆红
    }

    @Override
    public void del(Suser suser) {
        suserMapper.del(suser);
    }

    @Override
    public List<Suser> sel() {
        return suserMapper.sel();
    }

    @Override
    public void sh(Integer id) {
        suserMapper.sh(id);
    }

    @Override
    public void nosh(Integer id) {
        suserMapper.nosh(id);
    }

    @Override
    public List<Suser> querySuser() {
        return suserMapper.querySuser();
    }
}