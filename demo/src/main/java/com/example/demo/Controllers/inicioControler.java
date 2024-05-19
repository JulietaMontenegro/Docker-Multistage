package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class inicioControler {
    @GetMapping("/")
    public String Inicio(){
        return "redirect:/inicio.html";
    }
}
