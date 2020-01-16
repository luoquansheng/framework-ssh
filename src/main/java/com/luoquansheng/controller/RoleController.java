package com.luoquansheng.controller;

import com.luoquansheng.entity.Role;
import com.luoquansheng.service.IRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @project_name：framework-ssh
 * @classname：RoleController
 * @description:
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/15 10:45
 */
@Controller
@RequestMapping("role")
public class RoleController {

    private static Logger logger = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    private IRoleService roleService;

    @GetMapping("list")
    public String list(Model model) {

        List<Role> roles = roleService.findAll();

        model.addAttribute("roles", roles);

        return "role/list";

    }

    @GetMapping
    public String toAdd(@ModelAttribute Role role, Model model) {

        model.addAttribute(role);

        return "role/add";

    }

    @PostMapping
    public String add(Role role, Model model) {

        try {
            roleService.insertRole(role);
        } catch (Exception e) {
            logger.error("新增角色异常：" + e.getMessage(), e);
            e.printStackTrace();
            model.addAttribute(e);
            return "error/403";
        }

        return "redirect:role/list";
    }

}
