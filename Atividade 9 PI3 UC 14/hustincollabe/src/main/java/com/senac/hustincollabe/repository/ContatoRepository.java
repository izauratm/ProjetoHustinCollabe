package com.senac.hustincollabe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senac.hustincollabe.model.Contato;

/**
 *
 * @author Izaura
 */
public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
