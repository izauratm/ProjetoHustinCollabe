package hustincollabe.java;
/**
 *
 * @author Izaura
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransacaoImpl extends Transacao {
    private Imovel imovelendereco;
    private Cliente clientenome;
    private Corretor corretornome;

    public TransacaoImpl(Imovel imovelendereco, Cliente clientenome, Corretor corretornome) {
        this.imovelendereco = imovelendereco;
        this.clientenome = clientenome;
        this.corretornome = corretornome;
    }

    public void realizarVenda(LocalDateTime horarioVisita) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy 'às' HH:mm");
        String dataHoraFormatada = horarioVisita.format(formatter);

        System.out.println("Visita realizada para " + clientenome.getClientenome() +
                " no imóvel " + imovelendereco.getImovelendereco() +
                " com o corretor " + corretornome.getCorretornome() +
                " no horário " + dataHoraFormatada);
    }
}
