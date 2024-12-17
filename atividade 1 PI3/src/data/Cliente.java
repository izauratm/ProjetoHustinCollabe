package data;

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

    public Cliente(){
    }       
    public int getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    public String getNomeCliente() {
        return nomecliente;
    }
    public void setNomeCliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Date getDatanasc() {
        return datanasc;
    }
    public void setDataNasc(Date datanasc) {
        this.datanasc = datanasc;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}