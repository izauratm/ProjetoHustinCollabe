package hustincollabe;

/**
 *
 * @author Izaura
 */
import java.util.Date;
import java.sql.Time;

public class AgendaVisita {
    private int idAgenda_Visita;
    private Date datavenda;
    private Time hora;
    private String nomecliente;
    private String corretornome;
    private String imovelcodigo;
    private String email;
    private String telefone;
    private int corretor_idcorretor;

    public AgendaVisita (int idAgenda_Visita,Date datavenda,Time hora, String nomecliente,String corretornome,String imovelcodigo,String email, String telefone,int corretor_idcorretor){
        this.idAgenda_Visita = idAgenda_Visita;
        this.datavenda = datavenda;
        this.hora = hora;
        this.nomecliente = nomecliente;
        this.corretornome = corretornome;
        this.imovelcodigo = imovelcodigo;
        this.email = email;
        this.telefone = telefone;
        this.corretor_idcorretor = corretor_idcorretor;
         }
     public int getIdAgenda_Visita() {
        return idAgenda_Visita;
    }
    public void setIdAgenda_Visita(int idAgenda_Visita) {
        this.idAgenda_Visita = idAgenda_Visita;
    }
    public Date getDatavenda() {
        return datavenda;
    }
    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }
    public Time getHora() {
        return hora;
    }
    public void setHora(Time hora) {
        this.hora = hora;
    }
    public String getNomecliente() {
        return nomecliente;
    }
    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }
    public String getCorretornome() {
        return corretornome;
    }
    public void setCorretornome(String corretornome) {
        this.corretornome = corretornome;
    }
    public String getImovelcodigo() {
        return imovelcodigo;
    }
    public void setImovelcodigo(String imovelcodigo) {
        this.imovelcodigo = imovelcodigo;
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
    public int getCorretor_idcorretor() {
        return corretor_idcorretor;
    }
    public void setCorretor_idcorretor(int corretor_idcorretor) {
        this.corretor_idcorretor = corretor_idcorretor;
    }
}