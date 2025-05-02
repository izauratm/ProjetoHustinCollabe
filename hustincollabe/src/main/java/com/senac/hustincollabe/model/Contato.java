package com.senac.hustincollabe.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Izaura
 */

/*Faleconosco*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contato {
    private String nome;
    private String email;
    private String mensagem;
}
