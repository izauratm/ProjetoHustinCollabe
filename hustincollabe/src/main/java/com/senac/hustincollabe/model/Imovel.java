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
public class Imovel {

    private Long id;
    private String tipoResidencial;
    private String tipoComercial;
    private String bairro;
    private String valor;
}
