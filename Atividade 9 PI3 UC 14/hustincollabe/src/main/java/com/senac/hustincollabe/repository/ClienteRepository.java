package com.senac.hustincollabe.repository;

import com.senac.hustincollabe.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Izaura
 */

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>
{

    public void deleteById(int id);
    
}