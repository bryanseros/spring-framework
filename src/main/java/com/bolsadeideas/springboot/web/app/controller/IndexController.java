package com.bolsadeideas.springboot.web.app.controller;

import com.bolsadeideas.springboot.web.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {
    @GetMapping({"/index","/", "home"})
    public String index(ModelMap model){
        model.addAttribute("titulo","Hola spring framework!");
        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Bryan");
        usuario.setApellido("seros");
        usuario.setEmail("spring@spring.com");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario ".concat(usuario.getNombre()));

        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model){

        model.addAttribute("titulo", "Listar usuarios");

        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios(){
        List<Usuario> usuarios = Arrays.asList(new Usuario("Bryan","seros","spring@spring.com"),new Usuario("Bryan","seros","spring@spring.com"),new Usuario("Bryan","seros","spring@spring.com"));
        return usuarios;
    }
}
