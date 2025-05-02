package com.senac.hustincollabe.controller;

import com.senac.hustincollabe.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Izaura
 */

@Controller
@RequestMapping("/home")
public class ClienteController {

    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("cliente", new Cliente()); // Inicializa o objeto Cliente
        return "home"; // Garante que a página correta será carregada
    }

    @PostMapping("/enviarDados")
    public String receberDados(@ModelAttribute Cliente cliente, Model model) {
        model.addAttribute("mensagem", "Dados enviados com sucesso! Nossa equipe entrará em contato em breve.");
        model.addAttribute("cliente", cliente);
        return "home"; // Retorna para a página correta
    }
}

