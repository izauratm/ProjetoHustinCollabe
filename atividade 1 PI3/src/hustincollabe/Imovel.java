package hustincollabe;

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
    private double valorimovel;
    private String imovelendereco;
    private String condicaovenda;
    private int Tipo_imovel_idtipo_imovel;
    private int cliente_idcliente;
    private int corretor_idcorretor;

    public Imovel(int idimovel, String imovelnome, String tipoimovel, String imovelcodigo, String descricao, double valorimovel, String imovelendereco, String condicaovenda, int Tipo_imovel_idtipo_imovel, int cliente_idcliente, int corretor_idcorretor) {
        this.idimovel = idimovel;
        this.imovelnome = imovelnome;
        this.tipoimovel = tipoimovel;
        this.imovelcodigo = imovelcodigo;
        this.descricao = descricao;
        this.valorimovel = valorimovel;
        this.imovelendereco = imovelendereco;
        this.condicaovenda = condicaovenda;
        this.Tipo_imovel_idtipo_imovel = Tipo_imovel_idtipo_imovel;
        this.cliente_idcliente = cliente_idcliente;
        this.corretor_idcorretor = corretor_idcorretor;
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
    public double getValorimovel() {
        return valorimovel;
    }
    public void setValorimovel(double valorimovel) {
        this.valorimovel = valorimovel;
    }
    public String getImovelendereco() {
        return imovelendereco;
    }
    public void setImovelendereco(String imovelendereco) {
        this.imovelendereco = imovelendereco;
    }
    public String getCondicaovenda() {
        return condicaovenda;
    }
    public void setCondicaovenda(String condicaovenda) {
        this.condicaovenda = condicaovenda;
    }
    public int getTipo_imovel_idtipo_imovel() {
        return Tipo_imovel_idtipo_imovel;
    }
    public void setTipo_imovel_idtipo_imovel(int Tipo_imovel_idtipo_imovel) {
        this.Tipo_imovel_idtipo_imovel = Tipo_imovel_idtipo_imovel;
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