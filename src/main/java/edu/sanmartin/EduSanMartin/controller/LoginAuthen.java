package edu.sanmartin.EduSanMartin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*@Controller: anotacion para designar una clase Controlador del patron MVC*/

@Controller

public class LoginAuthen {

    @GetMapping({"/"})
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/autenticacion", method = RequestMethod.POST)
    // @PostMapping("/autenticacion")

    public String autenticacion(Model model, @RequestParam(name = "usuario") String username,
            @RequestParam(name = "passwrd") String passwrd) {

        String mensaje = "";
        if (passwrd.equals("1234")) {
            mensaje = "Inicio sesion correctamente";
            model.addAttribute("msg", mensaje);
            model.addAttribute("user", username);
            return "index";
        } else {
            mensaje = "Clave incorrecta";
            model.addAttribute("msg", mensaje);
            model.addAttribute("user", username);
            return "login";
        }
    }
}
