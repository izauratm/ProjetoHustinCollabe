package com.senac.hustincollabe.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.senac.hustincollabe.model.Contato;
import com.senac.hustincollabe.repository.ContatoRepository;
 
/*
 * @author Izaura
 */

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public List<Contato> listarTodos() {
        return contatoRepository.findAll();
    }

    public Contato salvar(Contato contato) {
        return contatoRepository.save(contato);
    }

   // public void deletar(Integer, id) {
     //   contatoRepository.deleteById(id);
    }

