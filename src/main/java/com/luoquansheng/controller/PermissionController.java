package com.luoquansheng.controller;

import com.luoquansheng.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @project_name：framework-ssh
 * @classname：PermissionController
 * @description:
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/16 9:36
 */
@Controller
@RequestMapping("permission")
public class PermissionController {

    @Autowired
    private IPermissionService permissionService;

    @GetMapping("list")
    public String getPermissions(Model model) {
        return "list";
    }


}
