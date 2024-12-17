package data;

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
public class ClienteDao {
    
    private Connection conn;
    private PreparedStatement st;
    private ResultSet rs;
    
    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hustincollabe", "root", "spyke289");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar." + ex.getMessage());
            return false;
        }
    }
     public int salvar(Cliente cliente) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO cliente (nomecliente, endereco, datanasc, email, telefone, rg, cpf) VALUES (?, ?, ?, ?, ?, ?, ?)");
            st.setString(1, cliente.getNomeCliente());
            st.setString(2, cliente.getEndereco());
            st.setDate(3, new java.sql.Date(cliente.getDatanasc().getTime()));
            st.setString(4, cliente.getEmail());
            st.setString(5, cliente.getTelefone());
            st.setString(6, cliente.getRg());
            st.setString(7, cliente.getCpf());

            status = st.executeUpdate();
            return status; 
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar." + ex.getMessage());
            return ex.getErrorCode();
        }
     }
      public Cliente telabuscacliente(String nomecliente) {
       try {
            Cliente cliente = null;
            String query = "SELECT * FROM cliente WHERE nomecliente = ?";
            st = conn.prepareStatement(query);
            st.setString(1, nomecliente);
            rs = st.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setNomeCliente(rs.getString("nomecliente"));
                cliente.setEndereco(rs.getString("endereço"));
                cliente.setDataNasc(rs.getDate("datanasc"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setRg(rs.getString("rg"));
                cliente.setCpf(rs.getString("cpf"));
            }
            return cliente;
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar o cliente." + ex.getMessage());
            return null;
        }
    }
      
      public List<Cliente> listagem(String nomecliente) {
        List<Cliente> listaCliente = new ArrayList<>();
        try {
            String query = "SELECT * FROM cliente WHERE nomecliente LIKE ?";
            st = conn.prepareStatement(query);
            st.setString(1, "%" + nomecliente + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNomeCliente(rs.getString("nomecliente"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setDataNasc(rs.getDate("datanasc"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setRg(rs.getString("rg"));
                cliente.setCpf(rs.getString("cpf"));
                listaCliente.add(cliente);
            }
            return listaCliente;
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar cliente por nome." + ex.getMessage());
            return null;
        }
    }
      public void desconectar() {
        try {
            conn.close();
    } catch (SQLException ex) {
        System.out.println("Erro ao desconectar." + ex.getMessage());
    }
}
}


