package com.movie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stormpath.sdk.application.Application;
 
@Controller
public class MainController {
 
	@Autowired
    Application app;
	@RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", app.getName());
        model.addAttribute("appDescription", app.getDescription());
 
        return "home";
    }
}
