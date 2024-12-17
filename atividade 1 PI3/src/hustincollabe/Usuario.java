package hustincollabe;

/**
 *
 * @author Izaura
 */ 

import java.util.Date;

public class Usuario {
    private int idusuario;
    private String login;
    private String senha;
    private Date ultimo_acesso;

    public Usuario (int idusuario, String login, String senha, Date ultimo_acesso){
        this.idusuario = idusuario;
        this.login = login;
        this.senha = senha;
        this.ultimo_acesso = ultimo_acesso;
    }
    
    public int getIdusuario() {
        return idusuario;
    }
    public String getLogin() {
        return login;
    }
    public String getSenha() {
        return senha;
    }
    public Date getUltimo_acesso() {
        return ultimo_acesso;
    }
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setUltimo_acesso(Date ultimo_acesso) {
        this.ultimo_acesso = ultimo_acesso;
    }
}
