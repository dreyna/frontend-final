
package com.example.frontEnd.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;





/**
 *
 * @author Docente
 */
@Controller
@RequestMapping("/auth")
public class OAuthController {
    
    @GetMapping("/dashboard")
    public String dashboard(Model model){
        model.addAttribute("titulo", "dashboard");
        return "dashboard";
    }
    @GetMapping("/categorias")
    public String categorias(Model model){
        return "categoria";
    }
    @GetMapping("/secciones")
    public String secciones(Model model){
        return "seccion";
    }
}
