package com.senac.hustincollabe.repository;

import com.senac.hustincollabe.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Izaura
 */
@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Integer> {
}
