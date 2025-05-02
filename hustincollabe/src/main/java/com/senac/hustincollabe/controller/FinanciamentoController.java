package com.senac.hustincollabe.controller;

import com.senac.hustincollabe.model.SimulacaoFinanciamento;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Izaura
 */
@Controller
@RequestMapping("/simulacao")
public class FinanciamentoController {

    @PostMapping("/calcular")
    public String calcularFinanciamento(@ModelAttribute SimulacaoFinanciamento simulacao, Model model) {
        System.out.println("Nome: " + simulacao.getNome());
        System.out.println("Valor Empreendimento: " + simulacao.getValorEmpreendimento());
        System.out.println("Valor Entrada: " + simulacao.getValorEntrada());

        double comissao = simulacao.getValorEmpreendimento() * 0.06;
        double valorTotal = simulacao.getValorEmpreendimento() - simulacao.getValorEntrada();

        //cálculo do valor das parcelas
        int numeroParcelas = simulacao.getNumeroParcelas();
        double valorParcela = numeroParcelas > 0 ? valorTotal / numeroParcelas : 0;

        model.addAttribute("comissao", comissao);
        model.addAttribute("valorTotal", valorTotal);
        model.addAttribute("valorParcela", valorParcela);
        model.addAttribute("simulacao", simulacao);

        System.out.println("Valor da parcela: " + valorParcela);

        return "resultado-financiamento";
    }

    @GetMapping
    public String simulacao() {
        return "simulacao";
    }
}
