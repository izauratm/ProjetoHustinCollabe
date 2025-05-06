package com.senac.hustincollabe.model;
import java.time.LocalDate;
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
public class SimulacaoFinanciamento {
    private String nome;
    private LocalDate dataVenda;
    private Double valorEmpreendimento;
    private String condicaoFinanciamento;
    private boolean entrada;
    private Double valorEntrada;
    private Integer numeroParcelas;
}
