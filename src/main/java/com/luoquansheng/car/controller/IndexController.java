package com.luoquansheng.car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @project_name：car-manager
 * @classname：IndexController
 * @description:
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/14 12:32
 */
@Controller
@RequestMapping("index")
public class IndexController {

    @GetMapping
    public String home() {
        return "index";
    }

}
