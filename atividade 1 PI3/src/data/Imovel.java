package data;

import java.util.Date;

/**
 *
 * @author Izaura
 */

public class Imovel {
    private int idimovel;
    private String imovelnome;
    private String tipoimovel;
    private String imovelcodigo;
    private String descricao;
    private Double valorimovel;
    private String bairro;
    private String condicaovenda;
    private int cliente_idcliente;
    private int corretor_idcorretor;
    
public Imovel(){
} 

    public int getIdimovel() {
        return idimovel;
    }
    public void setIdimovel(int idimovel) {
        this.idimovel = idimovel;
    }
    public String getImovelnome() {
        return imovelnome;
    }
    public void setImovelnome(String imovelnome) {
        this.imovelnome = imovelnome;
    }
    public String getTipoimovel() {
        return tipoimovel;
    }
    public void setTipoimovel(String tipoimovel) {
        this.tipoimovel = tipoimovel;
    }
    public String getImovelcodigo() {
        return imovelcodigo;
    }
    public void setImovelcodigo(String imovelcodigo) {
        this.imovelcodigo = imovelcodigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValorimovel() {
        return valorimovel;
    }
    public void setValorimovel(Double valorimovel) {
        this.valorimovel = valorimovel;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCondicaovenda() {
        return condicaovenda;
    }
    public void setCondicaovenda(String condicaovenda) {
        this.condicaovenda = condicaovenda;
    }
    public int getCliente_idcliente() {
        return cliente_idcliente;
   }
    public void setCliente_idcliente(int cliente_idcliente) {
        this.cliente_idcliente = cliente_idcliente;
    }
    public int getCorretor_idcorretor() {
        return corretor_idcorretor;
    }
    public void setCorretor_idcorretor(int corretor_idcorretor) {
        this.corretor_idcorretor = corretor_idcorretor;
    }
}
