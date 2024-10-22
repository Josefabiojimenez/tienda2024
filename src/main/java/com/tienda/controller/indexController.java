
package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    
    @RequestMapping("/")
    public String paginaIncio(Model model) {
        //model.addAttribute("attribute", "value");
        return "index";
    }
    
    @RequestMapping("/contacto")
    public String paginaContacto(Model model) {
        //model.addAttribute("attribute", "value");
        return "info";
    }
    
}
