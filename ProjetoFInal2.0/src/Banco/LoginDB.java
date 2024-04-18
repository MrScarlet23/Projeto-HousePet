
package Banco;
import Dados.Login;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDB {
    Connection connection = null;

    
    public boolean inserirCliente(Login cliente) 
    {
    	boolean status = true;
    	
        System.out.println("Inserir Cliente");
        
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

            String sql = "INSERT INTO test (name) "
               + "VALUES('"+cliente.getNome()+"');";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            
            status = true;
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false;
        }
        finally
        {
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
                status = false;
            }
        }
        
        return status;
    } 
}
