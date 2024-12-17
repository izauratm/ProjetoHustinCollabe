package hustincollabe.java;

import java.time.LocalDateTime;

/**
 *
 * @author Izaura
 */
public class AgendaVisitaImpl implements AgendaVisita {
    private Cliente clientenome;
    private Corretor corretornome;
    private Imovel imovelendereco;
    private LocalDateTime horarioVisita;

    public AgendaVisitaImpl(Cliente clientenome, Corretor corretornome, Imovel imovelendereco, LocalDateTime horarioVisita) {
        this.clientenome = clientenome;
        this.corretornome = corretornome;
        this.imovelendereco = imovelendereco;
        this.horarioVisita = horarioVisita;
    }

    public void realizarVisita() {
        System.out.println("Visitando " + imovelendereco.getImovelendereco() +
                " com o(a) cliente " + clientenome.getClientenome() +
                " com o(a) corretor(a) " + corretornome.getCorretornome() +
                " no horário " + horarioVisita);
    }
}
