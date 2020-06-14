package edu.sanmartin.EduSanMartin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//Gestiona request-peticiones
public class LoginController {

    @GetMapping("/") //Raiz, de aqui podemos ir a cualquier lado ej: localhost/index/pagina
    public String Solicitud(){

        return "login";
    }
    
}