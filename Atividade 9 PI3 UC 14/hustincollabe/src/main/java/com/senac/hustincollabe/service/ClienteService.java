package com.senac.hustincollabe.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.senac.hustincollabe.model.Cliente;
import com.senac.hustincollabe.repository.ClienteRepository;

/**
 *
 * @author Izaura
 */
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deletar(int id) {
         clienteRepository.deleteById(id);
                }
}
