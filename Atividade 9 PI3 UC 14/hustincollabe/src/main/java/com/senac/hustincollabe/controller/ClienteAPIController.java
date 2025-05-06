package com.senac.hustincollabe.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.senac.hustincollabe.model.Cliente;
import com.senac.hustincollabe.service.ClienteService;

/**
 *
 * @author Izaura
 */

@RestController
@RequestMapping("/clientes")
public class ClienteAPIController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteService.listarTodos();
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        clienteService.deletar(id);
    }
}
