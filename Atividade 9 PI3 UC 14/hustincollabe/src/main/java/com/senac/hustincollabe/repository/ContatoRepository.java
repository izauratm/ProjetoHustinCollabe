package com.senac.hustincollabe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senac.hustincollabe.model.Contato;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Izaura
 */

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}

