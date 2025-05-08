package com.senac.hustincollabe.controller;

import com.senac.hustincollabe.model.Cliente;
import com.senac.hustincollabe.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/enviarDados")
    public String receberDados(@ModelAttribute Cliente cliente, Model model) {
        clienteRepository.save(cliente); //faz salvar cliente no banco de dados
        model.addAttribute("mensagem", "Dados enviados com sucesso! Nossa equipe entrará em contato em breve.");
       // model.addAttribute("cliente", cliente);
        return "home";
        
    }
}