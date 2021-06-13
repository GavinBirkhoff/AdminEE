package com.adminee.web.controller.system;

import com.adminee.common.core.controller.BaseController;
import com.adminee.common.core.domain.entity.SysUser;
import com.adminee.common.core.page.TableDataInfo;
import com.adminee.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/user")
public class SysUserController extends BaseController {
    @Autowired
    private ISysUserService userService;
    /**
     * 获取用户列表
     */
    @GetMapping("/list")
    public TableDataInfo list(SysUser user)
    {
//        startPage();
        List<SysUser> list = userService.selectUserList(user);
        return getDataTable(list);
    }

}
