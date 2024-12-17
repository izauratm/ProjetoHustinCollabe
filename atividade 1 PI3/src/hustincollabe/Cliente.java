package hustincollabe;

/**
 *
 * @author Izaura
 */

import java.util.Date;

public class Cliente {
    private int idcliente;
    private String nomecliente;
    private String endereco;
    private Date datanasc;
    private String email;
    private String telefone;
    private String rg;
    private String cpf;
    
    public Cliente (int idcliente, String nomecliente, String endereco, Date datanasc, String email, String telefone, String rg, String cpf){
       this.idcliente = idcliente;
       this.nomecliente = nomecliente;
       this.endereco = endereco;
       this.datanasc = datanasc;
       this.email = email;
       this.telefone= telefone;
       this.rg = rg;
       this.cpf = cpf;
    }
    
    public int getIdcliente() {
      return idcliente;
    }
    public String getNomecliente() {
      return nomecliente;
    }
    public String getEndereco() {
      return endereco;
    }
    public Date getDatanasc() {
      return datanasc;
    }
    public String getEmail() {
      return email;
    }
    public String getTelefone() {
      return telefone;
    }
    public String getRg() {
      return rg;
    }
    public String getCpf() {
      return cpf;
    }
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    public void setNomeliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
