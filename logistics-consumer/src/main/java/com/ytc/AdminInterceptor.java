/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: AdminInterceptor
 * Author:   没闹~
 * Date:     2020/10/15 10:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc;

import com.ytc.model.Boss;
import com.ytc.model.Cuser;
import com.ytc.model.Suser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/15
 * @since 1.0.0
 */
public class AdminInterceptor implements HandlerInterceptor {

    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
//        System.out.println("执行了TestInterceptor的preHandle方法");
        try {
            //统一拦截（查询当前session是否存在user）(这里user会在每次登陆成功后，写入session)
            Cuser cuser=(Cuser)request.getSession().getAttribute("cuser");
            if(cuser!=null){
                return true;
            }
            //统一拦截（查询当前session是否存在user）(这里user会在每次登陆成功后，写入session)
            Suser suser=(Suser)request.getSession().getAttribute("suser");
            if(suser!=null){
                return true;
            }
            //统一拦截（查询当前session是否存在user）(这里user会在每次登陆成功后，写入session)
            Boss boss=(Boss) request.getSession().getAttribute("boss");
            if(boss!=null){
                return true;
            }
            response.sendRedirect(request.getContextPath()+"/logistics/index");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;//如果设置为false时，被请求时，拦截器执行到此处将不会继续操作
        //如果设置为true时，请求将会继续执行后面的操作
    }

    /**
     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
//         System.out.println("执行了TestInterceptor的postHandle方法");
    }

    /**
     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
//        System.out.println("执行了TestInterceptor的afterCompletion方法");
    }

}