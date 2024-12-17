package hustincollabe;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Izaura
 */
  public class Conexao {
    
    public Connection conn; //criando um objeto do tipo connection chamado conn
    public String url = "jdbc:mysql://localhost:3306/hustincollabe"; //Nome da base de dados
    public String user = "root"; //nome do usuário do MySQL
    public String password = "spyke289"; //senha do MySQL  
            
         
    public boolean conectar(){
        
        try {                    
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso");
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM cliente");
           
            rs.next();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Falha na conexão com o banco" +" "+ ex.getMessage());
            return false;
        }
    }
    
    public void desconectar(){
  
        try {
              if (conn != null && !conn.isClosed()) {
                  conn.close();
                  System.out.println("Voce se desconectou do banco de dados.");
              }
          } catch (SQLException ex) {
              System.out.println("Nao foi possivel desconectar do banco dados.");
          }
      }
  } 