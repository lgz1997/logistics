/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: BossController
 * Author:   没闹~
 * Date:     2020/10/9 7:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ytc.model.Boss;
import com.ytc.model.Suser;
import com.ytc.service.*;
import com.ytc.util.CheckImgUtil;
import com.ytc.util.Md5Util;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/9
 * @since 1.0.0
 */
@Controller
@RequestMapping("/boss")
public class BossController {

    @Reference
    private AcceptService acceptService;

    @Reference
    private BossService bossService;

    @Reference
    private CityService cityService;

    @Reference
    private CuserService cuserService;

    @Reference
    private FreightcalculationService freightcalculationService;

    @Reference
    private FreightService freightService;

    @Reference
    private GoodsService goodsService;

    @Reference
    private HarvestService harvestService;

    @Reference
    private OrderService orderService;

    @Reference
    private ProvinceService provinceService;

    @Reference
    private SuserService suserService;

    @Reference
    private BalanceService balanceService;

    @Reference
    private BillService billService;

    @RequestMapping("bossLogin")
    @ResponseBody
    public String bossLogin(Boss boss, String imgcode , HttpServletRequest request){
        HttpSession session = request.getSession();//205处理爆红
        String checkcode = (String)session.getAttribute("checkcode");//205处理爆红
        if(!imgcode.equals(checkcode)){//205处理爆红
            return "3";//205处理爆红
        }//205处理爆红

        Boss bossReturn =bossService.bossLogin(boss);//205处理爆红

        if(bossReturn!=null){//205处理爆红
            String md516 = Md5Util.getMd516(boss.getBosspwd());/*111*/
            if(md516.equals(bossReturn.getBosspwd())){//205处理爆红
                //登录成功
                session.setAttribute("boss",bossReturn);//205处理爆红
                return "3";//205处理爆红
            }else {//205处理爆红
                //密码不正确
                return "2";//205处理爆红
            }//205处理爆红
        }else {//205处理爆红
            //当前用户不在
            return "1";//205处理爆红
        }//205

    }
    @RequestMapping("bossShow")
    public String bossShow(Model model){
        List<Suser> list=suserService.sel();
        model.addAttribute("list",list);
        return "/boss/bossShow.html";
    }

    @RequestMapping("sh")
    @ResponseBody
    public void sh(Integer id){
        suserService.sh(id);
        balanceService.add(id);
        freightcalculationService.add(id);
    }
    @RequestMapping("nosh")
    @ResponseBody
    public void nosh(Integer id){
        suserService.nosh(id);
    }


    @RequestMapping("imgCode")//202
    @ResponseBody//202
    public String imgCode(HttpServletRequest request , HttpServletResponse response){//202
        String s ="";//202
        try {//202
            s = CheckImgUtil.checkImg(request,response);//202
        } catch (Exception e) {//202
            e.printStackTrace();//202
        }//202
        return s;//202
    }//202


    //注册
    @RequestMapping("reg")/*111*/
    @ResponseBody
    public String reg(Boss boss){/*111*/
        Boss bossRet=bossService.queryBossByName(boss);//104处理爆红
        if(bossRet==null){
            //加密
            String bosspwd = boss.getBosspwd();/*111*/
            String md516 = Md5Util.getMd516(bosspwd);/*111*/
            boss.setBosspwd(md516);/*111*/
            bossService.reg(boss);/*111.处理爆红*/
            return "1";
        }else {
            return "2";
        }
    }

    @RequestMapping("toReg")
    public String toReg(){
        return "boss/reg";
    }
}
