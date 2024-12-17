package hustincollabe;

/**
 *
 * @author Izaura
 */
import java.util.Date;

public class Funcionario {
    private int idfuncionario;
    private String funcionarionome;
    private String cargo;
    private int matricula;
    private String endereco;
    private Date datanasc;
    private String email;
    private String telefone;
    private String rg;
    private String cpf;
    private int Usuario_idusuario;

    public Funcionario( int idfuncionario, String funcionarionome , String cargo, int matricula, String endereco, Date datanasc, String email, String telefone, String rg,String cpf, int Usuario_idusuario) {
       this.idfuncionario = idfuncionario;
       this.funcionarionome = funcionarionome;
       this.cargo = cargo;
       this.matricula = matricula;
       this.endereco = endereco;
       this.datanasc = datanasc;
       this.email = email;
       this.telefone = telefone;
       this.rg = rg;
       this.cpf = cpf;
       this.Usuario_idusuario = Usuario_idusuario;     
    }   

    public int getIdfuncionario() {
        return idfuncionario;
    }
    public String getFuncionarionome() {
        return funcionarionome;
    }
    public String getCargo() {
        return cargo;
    }
    public int getMatricula() {
        return matricula;
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
    public int getUsuario_idusuario() {
        return Usuario_idusuario;
    }
    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }
    public void setFuncionarionome(String funcionarionome) {
        this.funcionarionome = funcionarionome;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
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
    public void setUsuario_idusuario(int Usuario_idusuario) {
        this.Usuario_idusuario = Usuario_idusuario;
    }
}