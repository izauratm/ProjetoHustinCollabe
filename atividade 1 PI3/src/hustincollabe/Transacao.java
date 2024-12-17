package hustincollabe;

/**
 *
 * @author Izaura
 */
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
    private int idTransacao;
    private Date datavenda;
    private double valor;
    private String condicaovenda;
    private int corretor_idcorretor;
    private int imovel_idimovel;
    private double comissao;
    private String nomecliente;

    public Transacao (double valor,String condicaovenda, int corretor_idcorretor, int Imovel_idimovel, double comissao, String nomecliente){
        this.idTransacao = idTransacao;
        this.datavenda = datavenda;
        this.valor = valor;
        this.condicaovenda = condicaovenda;
        this.corretor_idcorretor= 
        this.imovel_idimovel = imovel_idimovel;
        this.comissao = comissao;
        this.nomecliente = nomecliente;
}
    public void realizarVenda(LocalDateTime horarioVisita) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy 'às' HH:mm ");
        String dataHoraFormatada = horarioVisita.format(formatter);
        System.out.println("Visita realizada para o cliente " + nomecliente +
                " no imovel " + imovel_idimovel +
                " pelo corretor de ID " + corretor_idcorretor +
                " no horario " + dataHoraFormatada);
    
        
    }  // Getters e Setters para os atributos da classe Transacao
    public int getIdTransacao() {
        return idTransacao;
    }
    public Date getDataVenda() {
        return datavenda;
    }
    public double getValor() {
        return valor;
    }
    public String getCondicaovenda() {
        return condicaovenda;
    }
    public int getCorretor_idcorretor() {
        return corretor_idcorretor;
    }
    public int getImovel_idimovel() {
        return imovel_idimovel;
    }
    public double getComissao() {
        return comissao;
    }
    public String getNomecliente() {
        return nomecliente;
    }
    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }
    public void setDataVenda(Date datavenda) {
        this.datavenda = datavenda;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setCondicaovenda(String condicaovenda) {
        this.condicaovenda = condicaovenda;
    }
    public void setCorretor_idcorretor(int corretor_idcorretor) {
        this.corretor_idcorretor = corretor_idcorretor;
    }
    public void setImovel_idimovel(int imovel_idimovel) {
        this.imovel_idimovel = imovel_idimovel;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public void setNomecliente (String nomecliente) {
        this.nomecliente = nomecliente;
    }
}
