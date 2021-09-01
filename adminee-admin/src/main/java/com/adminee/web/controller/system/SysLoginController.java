package com.adminee.web.controller.system;


import com.adminee.common.constant.Constants;
import com.adminee.common.core.domain.AjaxResult;
import com.adminee.common.core.domain.model.LoginBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录验证
 * @author gavin
 */
@RestController /* @Controller + @ResponseBody*/
public class SysLoginController {
    /**
     * 登录方法
     *
     * @param loginBody 登录信息
     * @return 结果
     */
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBody loginBody){
        AjaxResult ajax = AjaxResult.success();
        ajax.put(Constants.TOKEN, "token");
        return ajax;
    }

    /**
     * 获取用户信息
     *
     * @return 用户信息
     */
    @GetMapping("getInfo")
    public AjaxResult getInfo()
    {
        AjaxResult ajax = AjaxResult.success();
        return ajax;
    }

    /**
     * 获取路由信息
     *
     * @return 路由信息
     */
    @GetMapping("getRouters")
    public AjaxResult getRouters()
    {
        return AjaxResult.success();
    }
}
