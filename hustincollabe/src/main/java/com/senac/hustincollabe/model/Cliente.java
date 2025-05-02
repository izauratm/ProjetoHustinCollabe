package com.senac.hustincollabe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Izaura
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    private String nome;
    private String telefone;
    private String email;
    private String tipoInteresse;
}
