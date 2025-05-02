package com.senac.hustincollabe.controller;

import com.senac.hustincollabe.model.Contato;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author Izaura
 */

@Controller
@RequestMapping("/faleconosco")
public class ContatoController {

    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("contato", new Contato());
        return "faleconosco";  
    }

    @PostMapping("/enviar")
    public String enviarMensagem(@ModelAttribute ContatoController contato, Model model) {
        model.addAttribute("mensagem", "Mensagem enviada com sucesso!");
        return "faleconosco";  
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/contato")
    public String contato() {
        return "contato"; 
    }
    }    
