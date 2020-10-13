/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: BalanceServiceImpl
 * Author:   没闹~
 * Date:     2020/10/8 9:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.mapper.BalanceMapper;
import com.ytc.model.Balance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/8
 * @since 1.0.0
 */
@Service
@Component
public class BalanceServiceImpl implements BalanceService{

    @Autowired
    private BalanceMapper balanceMapper;

    @Override
    public Balance select(int suserid) {
        return balanceMapper.select(suserid);
    }

    @Override
    public void tixian(Integer suserid, Double money) {
        balanceMapper.tixian(suserid,money);
    }

    @Override
    public void add(Integer id) {
        balanceMapper.add(id);
    }

    @Override
    public void tuidan(Integer suserid, Double price) {
        balanceMapper.tuidan(suserid,price);
    }
}