package hustincollabe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HustinCollabe {
    public static void main(String[] args) {
      /* Scanner scanner = new Scanner(System.in);

        class Cliente {
            private String nomecliente;

            public Cliente(String nomecliente) {
                this.nomecliente = nomecliente;
            }

            public String getNomeCliente() {
                return nomecliente;
            }
        }
        class Corretor {
            private String corretornome;

            public Corretor(String corretornome) {
                this.corretornome = corretornome;
            }

            public String getCorretornome() {
                return corretornome;
            }
        }

        class Imovel {
            private String imovelendereco;

            public Imovel(String imovelendereco) {
                this.imovelendereco = imovelendereco;
            }

            public String getImovelendereco() {
                return imovelendereco;
            }
        }

        class Agendavisita {
            private Cliente nomecliente;
            private Corretor corretornome;
            private Imovel imovelendereco;
            private LocalDateTime horarioVisita;

            public Agendavisita(Cliente nomecliente, Corretor corretornome, Imovel imovelendereco, LocalDateTime horarioVisita) {
                this.nomecliente = nomecliente;
                this.corretornome = corretornome;
                this.imovelendereco = imovelendereco;
                this.horarioVisita = horarioVisita;
            }

            public void realizarVisita() {
                System.out.println("Visitando " + imovelendereco.getImovelendereco() +
                        " com o(a) cliente " + nomecliente.getNomeCliente() +
                        " com o(a) corretor(a) " + corretornome.getCorretornome() +
                        " no horário " + horarioVisita);
            }
        }

        class Transacao {
            private Imovel imovelendereco;
            private Cliente nomecliente;
            private Corretor corretornome;

            public Transacao(Imovel imovelendereco, Cliente nomecliente, Corretor corretornome) {
                this.imovelendereco = imovelendereco;
                this.nomecliente = nomecliente;
                this.corretornome = corretornome;
            }

            public void realizarVenda(LocalDateTime horarioVisita) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy 'às' HH:mm");
                String dataHoraFormatada = horarioVisita.format(formatter);
                System.out.println("Visita realizada para o(a)" + nomecliente.getNomeCliente() +
                        " no imovel " + imovelendereco.getImovelendereco() +
                        " com o(a) corretor(a) " + corretornome.getCorretornome() +
                        " no horario " + dataHoraFormatada);
            }
        }
        System.out.print("Digite o nome do(a) cliente: ");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente);
        System.out.print("Digite o nome do(a) corretor(a): ");
        String nomeCorretor = scanner.nextLine();
        Corretor corretor = new Corretor(nomeCorretor);
        System.out.print("Digite o endereco do imovel: ");
        String enderecoImovel = scanner.nextLine();
        System.out.print("Digite o horario da visita (formato: yyyy-MM-ddTHH:mm:ss): ");
        String horarioVisitaStr = scanner.nextLine();
        LocalDateTime horarioVisita = LocalDateTime.parse(horarioVisitaStr);
        
        Imovel imovel = new Imovel(enderecoImovel);
        Agendavisita visita = new Agendavisita(cliente, corretor, imovel, horarioVisita);
        visita.realizarVisita();
        
        Transacao transacao = new Transacao(imovel, cliente, corretor);
        transacao.realizarVenda(horarioVisita);
        
        scanner.close();
    }
}*/
Connection con = null;
        Statement stmt = null;

        try {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            System.out.println( "Driver JDBC carregado" );
        } catch ( ClassNotFoundException cnfe ) {
            System.out.println( "Driver JDBC nao encontrado : " + cnfe.getMessage() );
        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hustincollabe","root","spyke289");
            System.out.println( "Conexao com o banco de dados estabelecida." );
        } catch ( SQLException sqle ) {
            System.out.println( "Erro na conexao ao Bando de Dados : " + sqle.getMessage() );
        }
    
        try {
          stmt = con.createStatement();
          System.out.println( "Pronto para execucao de comandos sql." );
       } catch ( SQLException sqle ) {
          System.out.println( "Erro no acesso ao Banco de Dados : " + sqle.getMessage() );
      }
         
         try{
           String sql = null;
           sql = "insert into cliente (nomecliente, endereco, datanasc, email, telefone, rg, cpf) values (?,?,?,?,?,?,?)";
           stmt.executeUpdate(sql);
           System.out.println("Dados inseridos.");
      }
         catch (SQLException sqle ){
         System.out.println( "Erro inserindo : " + sqle.getMessage() );

    }
         try {
              if (con != null && !con.isClosed()) {
                  con.close();
                  System.out.println("Voce se desconectou do banco de dados.");
              }
          } catch (SQLException ex) {
              System.out.println("Nao foi possivel desconectar do banco dados.");
          }
      }
}
       


