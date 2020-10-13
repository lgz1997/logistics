/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: FreightcalculationService
 * Author:   没闹~
 * Date:     2020/10/7 14:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.ytc.model.Freightcalculation;
import com.ytc.model.Suser;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/7
 * @since 1.0.0
 */
public interface FreightcalculationService {

    Freightcalculation sel(Suser suser);

    void upf(Freightcalculation freightcalculation);

    void add(Integer id);
}