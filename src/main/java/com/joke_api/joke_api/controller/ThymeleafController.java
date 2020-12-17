package com.joke_api.joke_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThymeleafController {
    @GetMapping(value = "/")
    public String home(Model model) {
        model.addAttribute("name", "Mike");
        return "signIn";
    }

    @GetMapping(value = "/jokes")
    public String jokes(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
