/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: LoginConfig
 * Author:   没闹~
 * Date:     2020/10/15 10:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/15
 * @since 1.0.0
 */
@Configuration
public class LoginConfig implements WebMvcConfigurer{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new AdminInterceptor());
        registration.addPathPatterns("/**");                      //所有路径都被拦截
        registration.excludePathPatterns(                         //添加不拦截路径
                "/logistics/index",
                "/logistics/cuserLogin",
                "/logistics/suserLogin",
                "/logistics/bossLogin",
                "/boss/bossLogin",
                "/boss/imgCode",
                "/boss/reg",
                "/boss/toReg",
                "/cuser/queryCuserList",
                "/cuser/regiter",
                "/cuser/AddCuser",
                "/cuser/succeReg",
                "/suser/suserLogin",
                "/suser/imgCode",
                "/suser/reg",
                "/suser/toReg"
        );
    }
}