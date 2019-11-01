package com.itheima.springboot_quick2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController {

    @RequestMapping("/quick")
    public String Quick(){

        return "FUCK";
    }
}
