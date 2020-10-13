/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: BalanceService
 * Author:   没闹~
 * Date:     2020/10/8 9:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.ytc.model.Balance;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/8
 * @since 1.0.0
 */
public interface BalanceService {

    Balance select(int suserid);

    void tixian(Integer suserid, Double money);

    void add(Integer id);

    void tuidan(Integer suserid, Double price);
}