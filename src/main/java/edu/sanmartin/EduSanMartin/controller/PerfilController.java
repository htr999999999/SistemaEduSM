package edu.sanmartin.EduSanMartin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.sanmartin.EduSanMartin.service.PerfilService;



@Controller
@RequestMapping("/perfil")

public class PerfilController {
    private PerfilService PerfilService;

    @RequestMapping(value={"/wachar"}, method=RequestMethod.GET)
    public String ListarInfo(Model model) {
        model.addAttribute("verIDalumnos", PerfilService.lAlumnos());
        return "idlumnos";
    }
    
    
}