package data;

//import hustincollabe.java.Imovel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Izaura
 */
public class ImovelDao {
    
    private Connection conn;
    private PreparedStatement st;
    private ResultSet rs;
    
    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hustincollabe", "root", "spyke289");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }
     public int buscar(Imovel imovel) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO imovel (imovelnome, tipoimovel, imovelcodigo, descricao, valorimovel, bairro, condicaovenda, cliente_idcliente, corretor_idcorretor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            st.setString(1, imovel.getImovelnome());
            st.setString(2, imovel.getTipoimovel());
            st.setString(3, imovel.getImovelcodigo());
            st.setString(4, imovel.getDescricao());
            st.setDouble(5, imovel.getValorimovel());
            st.setString(6, imovel.getBairro());
            st.setString(7, imovel.getCondicaovenda());
            st.setInt(8, imovel.getCliente_idcliente());
            st.setInt(9, imovel.getCorretor_idcorretor());

            status = st.executeUpdate();
            return status; 
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar: " + ex.getMessage());
            return ex.getErrorCode();
        }
     }
      public Imovel telabuscaimovel(String imovelnome) {
       try {
            Imovel imovel = null;
           String query = "SELECT * FROM imovel WHERE imovelnome = ?";
            st = conn.prepareStatement(query);
            st.setString(1, imovelnome);
            rs = st.executeQuery();
            if (rs.next()) {
                imovel = new Imovel();
                imovel.setImovelnome(rs.getString("imovelnome"));
                imovel.setTipoimovel(rs.getString("tipoimovel"));
                imovel.setImovelcodigo(rs.getString("imovelcodigo"));
                imovel.setDescricao(rs.getString("descricao"));
                imovel.setValorimovel(rs.getDouble("valorimovel"));
                imovel.setBairro(rs.getString("bairro"));
                imovel.setCondicaovenda(rs.getString("condicaovenda"));
                imovel.setCliente_idcliente(rs.getInt("cliente_idcliente"));
                imovel.setCorretor_idcorretor(rs.getInt("corretor_idcorretor"));
            }
            return imovel;
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar o imove." + ex.getMessage());
            return null;
        }
    }
      
      public List<Imovel> listagem(String imovelnome) {
        List<Imovel> listaImovel = new ArrayList<>();
        try {
            String query = "SELECT * FROM imovel WHERE imovelnome LIKE ?";
            st = conn.prepareStatement(query);
            st.setString(1, "%" + imovelnome + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                Imovel imovel = new Imovel();
                imovel.setImovelnome(rs.getString("imovelnome"));
                imovel.setTipoimovel(rs.getString("tipoimovel"));
                imovel.setImovelcodigo(rs.getString("imovelcodigo"));
                imovel.setDescricao(rs.getString("descricao"));
                imovel.setValorimovel(rs.getDouble("valorimovel"));
                imovel.setBairro(rs.getString("bairro"));
                imovel.setCondicaovenda(rs.getString("condicaovenda"));
                imovel.setCliente_idcliente(rs.getInt("cliente_idcliente"));
                imovel.setCorretor_idcorretor(rs.getInt("corretor_idcorretor"));
                listaImovel.add(imovel);
            }
            return listaImovel;
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar imovel por nome." + ex.getMessage());
            return null;
        }
    }
      public int salvar(Imovel imovel) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO imovel (imovelnome, tipoimovel, imovelcodigo, descricao, valorimovel, bairro, condicaovenda, cliente_idcliente, corretor_idcorretor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            st.setString(1, imovel.getImovelnome());
            st.setString(2, imovel.getTipoimovel());
            st.setString(3, imovel.getImovelcodigo());
            st.setString(4, imovel.getDescricao());
            st.setDouble(5, imovel.getValorimovel());
            st.setString(6, imovel.getBairro());
            st.setString(7, imovel.getCondicaovenda());
            st.setInt(8, imovel.getCliente_idcliente());
            st.setInt(9, imovel.getCorretor_idcorretor()); 
            

            status = st.executeUpdate();
            return status; 
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar." + ex.getMessage());
            return ex.getErrorCode();
        }
     }
      public void desconectar() {
              try {
              conn.close();
      }   catch (SQLException ex) {
        System.out.println("Erro ao desconectar." + ex.getMessage());
    }
}
}