/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: BillServiceImpl
 * Author:   没闹~
 * Date:     2020/10/8 9:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.mapper.BillMapper;
import com.ytc.model.Bill;
import com.ytc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
public class BillServiceImpl implements BillService{

    @Autowired
    private BillMapper billMapper;

    @Override
    public void water(Bill bill) {
        billMapper.water(bill);
    }

    @Override
    public PageUtil<Bill> select(Integer suserid, PageUtil<Bill> page) {
        long count=billMapper.selectCount(suserid);
        page=new PageUtil<Bill>(page.getCpage(),count, page.getPageSize());
        List<Bill> list=billMapper.select(suserid,page.getStart(),page.getPageSize());
        page.setList(list);
        return page;
    }
}