package com.luoquansheng.controller;

import com.luoquansheng.entity.UserInfo;
import com.luoquansheng.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @project_name：framework-ssh
 * @classname：UserInfoController
 * @description:
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/16 11:05
 */
@Controller
@RequestMapping("userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("list")
    public String userInfos(Model model) {

        List<UserInfo> userInfos = userInfoService.findAll();

        model.addAttribute("userInfos", userInfos);

        return "userInfo/list";
    }

}
