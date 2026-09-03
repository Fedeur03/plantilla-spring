package com.quijoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {

    @GetMapping("/saludo")
    public String saludar(Model model) {
        String mensajePosible = "Hola mundo utilizando Spring y Thymeleaf";
        String nombreEstudiante = "Federico";

        model.addAttribute("saludo", mensajePosible);
        model.addAttribute("nombre", nombreEstudiante);

        return "hola";
    }
}
