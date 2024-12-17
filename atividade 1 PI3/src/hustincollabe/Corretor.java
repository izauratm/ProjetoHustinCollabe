package hustincollabe;

/**
 *
 * @author Izaura
 */
public class Corretor {
   
    private int idcorretor;
    private String corretornome;
    private String corretorcodigo;
    private String endereco;
    private String email;
    private String telefone;
    private String rg;
    private String cpf;
    private String creci;

    public Corretor (int idcorretor, String corretornome, String corretorcodigo, String endereco,String email, String telefone, String rg, String cpf, String creci){
       this.idcorretor = idcorretor;
       this.corretornome = corretornome;
       this.corretorcodigo = corretorcodigo;
       this.endereco = endereco;
       this.email = email;
       this.telefone = telefone;
       this.rg = rg;
       this.cpf = cpf;
       this.creci = creci;

    }
     public int getIdcorretor() {
        return idcorretor;
    }
    public String getCorretornome() {
        return corretornome;
    }
    public String getCorretorcodigo() {
        return corretorcodigo;
    }
    public String getEndereco() {
        return endereco;
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
    public String getCreci() {
        return creci;
    }
    public void setIdcorretor(int idcorretor) {
        this.idcorretor = idcorretor;
    }
    public void setCorretornome(String corretornome) {
        this.corretornome = corretornome;
    }
    public void setCorretorcodigo(String corretorcodigo) {
        this.corretorcodigo = corretorcodigo;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
    public void setCreci(String creci) {
        this.creci = creci;
    }
   }
