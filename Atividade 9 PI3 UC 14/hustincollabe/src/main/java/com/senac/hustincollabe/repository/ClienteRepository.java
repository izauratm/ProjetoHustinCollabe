package com.senac.hustincollabe.repository;

import com.senac.hustincollabe.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Izaura
 */
public interface ClienteRepository extends JpaRepository<Cliente, Integer>
{

    public void deleteBy(int id);
    
}

