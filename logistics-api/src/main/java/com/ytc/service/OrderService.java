/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: OrderService
 * Author:   没闹~
 * Date:     2020/10/5 11:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.ytc.model.Cuser;
import com.ytc.model.Order;
import com.ytc.util.PageUtil;

import java.util.List;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/5
 * @since 1.0.0
 */
public interface OrderService {

    PageUtil<Order> select(Order o,PageUtil<Order> page);

    Order details(Integer id);

    void pztuidan(Integer id);

    void addSendCuser(Order order);

    List<Order> queryCuserSend(Cuser cuser);

    void tuidan(Integer orderid);
}