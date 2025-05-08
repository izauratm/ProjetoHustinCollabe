package com.senac.hustincollabe.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Izaura
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimulacaoFinanciamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    
    private String nome;
    private LocalDate dataVenda;
    private Double valorEmpreendimento;
    private String condicaoFinanciamento;
    //private boolean entrada;
    private Double valorEntrada;
    private Integer numeroParcelas;
}


