package com.senac.hustincollabe.controller;

import com.senac.hustincollabe.model.Imovel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Izaura
 */
@Controller
@RequestMapping("/imoveis")
public class ImovelController {

    private List<Imovel> imoveis = new ArrayList<>();
    @GetMapping
    public String listarImoveis(Model model) {
        model.addAttribute("imoveis", imoveis);
        return "encontre"; 
    }
    @PostMapping("imoveis/buscar")
    public String filtrarImoveis(
            @RequestParam("residencial") String residencial,
            @RequestParam("comercial") String comercial,
            @RequestParam("bairro") String bairro,
            @RequestParam("valor") String valor,
            Model model) {
        if (residencial == null || residencial.isEmpty() || bairro == null || bairro.isEmpty() || valor == null || valor.isEmpty()) {
            model.addAttribute("mensagemErro", "Por favor, preencha todos os campos obrigatórios.");
            return "resultado"; 
        }
        List<Imovel> filtrados = imoveis.stream()
                .filter(i -> i.getTipoResidencial().equalsIgnoreCase(residencial))
                .filter(i -> i.getTipoComercial().equalsIgnoreCase(comercial))
                .filter(i -> i.getBairro().equalsIgnoreCase(bairro))
                .filter(i -> i.getValor().equalsIgnoreCase(valor))
                .toList();

        if (filtrados.isEmpty()) {
            model.addAttribute("mensagemErro", "Nenhum imóvel encontrado para os critérios selecionados.");
            return "resultado"; 
        }

        model.addAttribute("imoveis", filtrados);
        return "resultado"; 
    }
}
