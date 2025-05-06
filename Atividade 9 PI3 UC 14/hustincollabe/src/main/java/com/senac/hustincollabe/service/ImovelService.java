package com.senac.hustincollabe.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.senac.hustincollabe.model.Imovel;
import com.senac.hustincollabe.repository.ImovelRepository;

/**
 *
 * @author Izaura
 */
@Service
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    public List<Imovel> listarTodos() {
        return imovelRepository.findAll();
    }

    public Imovel salvar(Imovel imovel) {
        return imovelRepository.save(imovel);
    }
}
