package com.kbstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    // http://127.0.0.1/
    @RequestMapping("/")
    public String main(){
        return "index";
    }

    @RequestMapping("/charts")
    public String login(Model model){
        model.addAttribute("center", "charts");
        return "index";
    }

    @RequestMapping("/table")
    public String register(Model model){
        model.addAttribute("center", "table");
        return "index";
    }
}
