package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BienvenidaAControler {
    @GetMapping("/bienvenida")
    public String Bienvenida(){
        return "bienvenida";
    }
}
