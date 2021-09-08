package com.bolsadeideas.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {
    @GetMapping({"/index","/", "home"})
    public String index(ModelMap model){
        model.addAttribute("titulo","Hola spring framework!");
        return "index";
    }
}
