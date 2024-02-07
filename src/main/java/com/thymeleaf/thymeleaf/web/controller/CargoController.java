package com.thymeleaf.thymeleaf.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class CargoController {
    @GetMapping("/cadastrar")
    public String cadastrar( ) {
        return "cargo/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap model) {
        // model.addAttribute("cargos", cargoService.buscarTodos());
        return "cargo/lista";
    }
}
