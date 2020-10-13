/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: BillService
 * Author:   没闹~
 * Date:     2020/10/8 9:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.ytc.model.Bill;
import com.ytc.util.PageUtil;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/8
 * @since 1.0.0
 */
public interface BillService {

    void water(Bill bill);

    PageUtil<Bill> select(Integer suserid, PageUtil<Bill> page);

    void tuidan(Bill bill);
}