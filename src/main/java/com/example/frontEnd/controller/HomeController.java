package com.example.frontEnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Docente
 */
@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index(){
        return "login";
    }
}
