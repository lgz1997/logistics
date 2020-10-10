/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: AcceptService
 * Author:   没闹~
 * Date:     2020/10/5 11:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/5
 * @since 1.0.0
 */
public interface AcceptService {

    void accept(Integer id);

    void noaccept(Integer id, String idea);
}