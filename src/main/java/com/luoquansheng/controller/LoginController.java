package com.luoquansheng.controller;

import com.luoquansheng.constant.ShiroConstant;
import com.luoquansheng.entity.UserInfo;
import com.luoquansheng.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @project_name：framework-ssh
 * @classname：LoginController
 * @description:
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/14 14:47
 */
@Controller
public class LoginController {

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("register")
    public String sendRegister(@ModelAttribute UserInfo userInfo, Model model) {
        model.addAttribute(userInfo);
        return "userInfo/register";
    }

    @GetMapping("login")
    public String sendLogin(@ModelAttribute UserInfo userInfo, Model model) {
        model.addAttribute(userInfo);
        return "login";
    }

    @PostMapping("register")
    public String register(UserInfo userInfo, Model model) {

        try {

            this.userInfoService.register(userInfo);

            model.addAttribute("userInfo", userInfo);

            return "redirect:info";

        } catch (Exception e) {
            logger.error("用户注册异常：" + e.getMessage(), e);
            model.addAttribute("e", e);
            return "error/403";
        }
    }

    @PostMapping("login")
    public String login(UserInfo userInfo, Model model, HttpServletRequest request) {

        try {

            userInfoService.login(userInfo);

            HttpSession session = request.getSession();

            session.setAttribute(ShiroConstant.CURRENT_SESSION, userInfo.getUserName());

            System.out.println("登录成功：" + session);

            return "userInfo/info";

        } catch (Exception e) {
            model.addAttribute("e", e);
            logger.error("登录异常：" + e.getMessage(), e);
            e.printStackTrace();
            return "error/403";
        }
    }

    @GetMapping("logout")
    public String logout() {

        userInfoService.logout();

        return "login";

    }

    @GetMapping("info")
    public String info() {

        return "userInfo/info";

    }

}
