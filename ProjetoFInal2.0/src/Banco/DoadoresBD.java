package Banco;

import Dados.CadastroPets;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Dados.Doadores;
import Dados.Usuarios;
import Dados.centroDeAdoção;
import java.sql.PreparedStatement;

public class DoadoresBD
{

    Connection connection = null;
    PreparedStatement stmt;
        
    
    
    ArrayList<CadastroPets> lista = new ArrayList<>();
     
    public ArrayList<CadastroPets> MostraPetsCentro()
    {
            Doadores objDoador = new Doadores();
    try {
        
        connection = Conexao.getInstance().getConnection();   
        String sql = "SELECT * FROM dadospets";
        stmt = connection.prepareStatement(sql);
        //stmt.setString(1, objCentro.getNomeFantasia()); 
        ResultSet resultado = stmt.executeQuery();
        
        while (resultado.next()) {
        CadastroPets objpets = new CadastroPets();
        objpets.setId(resultado.getInt("ID"));
        objpets.setEspecie(resultado.getString("Especie"));
        objpets.setOutro(resultado.getString("Outro"));
        objpets.setCor(resultado.getString("Cor"));
        objpets.setRaca(resultado.getString("Raca"));
        objpets.setIdade(resultado.getString("Idade"));
        objpets.setTipoIdade(resultado.getString("TipoIdade"));
        objpets.setPorte(resultado.getString("Porte"));
        objpets.setSexo(resultado.getString("Sexo"));
        objpets.setDoador(resultado.getString("Doador"));
        objpets.setContato(resultado.getString("Contato"));

        lista.add(objpets);
    }

        } 
            catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
            
        }
            return lista;   
    }
    
   
   
    
    public ResultSet PedirDadosDoadores(Doadores objDoador)
    {
    connection = Conexao.getInstance().getConnection();   
    PreparedStatement stmt = null;
    ResultSet resultado = null;
    
    try {
        String sql = "SELECT * FROM doadores WHERE Email = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, objDoador.getEmail());
        resultado = stmt.executeQuery();
        return resultado;
    
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
        return null;
    }

    
    }
    public ResultSet RecuperarSenhaDOador(Doadores objDoadores) {
    connection = Conexao.getInstance().getConnection();
    stmt = null;
    ResultSet resultado = null;

    try {
        String sql = "SELECT * FROM doadores  WHERE Email = ? AND CPF = ? AND Celular = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, objDoadores.getEmail());
        stmt.setString(2, objDoadores.getCpf());  
        stmt.setString(3, objDoadores.getCelular());  
        resultado = stmt.executeQuery();
        return resultado;

    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
        return null;
    }
}
    
    public ResultSet VerificarCadastroEmail(Doadores objUsuario)
    {
    connection = Conexao.getInstance().getConnection();   
    stmt = null;
    ResultSet resultado = null;
    
    try {
        String sql = "SELECT * FROM doadores WHERE Email = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, objUsuario.getEmail());
        resultado = stmt.executeQuery();
        return resultado;
    
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
        return null;
    }

    
    }
    
    
    
    public ResultSet autenticacaoDoador(Doadores objDoadores) {
    connection = Conexao.getInstance().getConnection();
    stmt = null;
    ResultSet resultado = null;

    try {
        String sql = "SELECT * FROM doadores  WHERE Email = ? AND Senha = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, objDoadores.getEmail());
        stmt.setString(2, objDoadores.getSenha());  
        resultado = stmt.executeQuery();
        return resultado;

    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
        return null;
    }
}
    
    public boolean inserirDoadores(Doadores doador) 
    {
    	boolean status = true;
    	
        System.out.println("Inserir Doador");
        
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

            
            
            String sql = "INSERT INTO `doadores` (Nome,CPF,DataNascimento,Sexo,Endereco,Celular,Instagram,Email,Senha) "
               + "VALUES('"+doador.getNome()+"','"+doador.getCpf()+"','"+doador.getData()+"','"
                    +doador.getSexo()+"','"+doador.getEndereco()+"','"+doador.getCelular()+"','"
                    +doador.getInstagram()+"','"+doador.getEmail()+"','"+doador.getSenha()+"');";
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

    public boolean atualizarDoadores(Doadores doador) 
    {
        System.out.println("Atualizar Doadores");
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

            String sql = "UPDATE doadores SET Nome = '" + doador.getNome() + "' WHERE ID = " + doador.getId() + ";";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            
            return true;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
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
            }
        }
    } 

    
    public void MostrarDoadores(Doadores doador, DefaultTableModel modelo)      
    {
       connection = Conexao.getInstance().getConnection();
       System.out.println("Conectado!! Preparando a exclusao");
       Statement stmt = null;
         
  	        
  	   try
  	   {  		    
  		   stmt = connection.createStatement();
           ResultSet res = stmt.executeQuery("SELECT * FROM doadores ORDER BY ID");
         
  		   while(res.next())
  		   {
  			   doador.setId(res.getInt("ID"));
  			   doador.setNome(res.getString("Nome"));	
  			   doador.setCpf(res.getString("CPF"));
                           doador.setData(res.getString("DataNascimento"));
                           doador.setSexo(res.getString("Sexo"));
                           doador.setEndereco(res.getString("Endereco"));
                           doador.setCelular(res.getString("Celular"));
  			   doador.setInstagram(res.getString("Instagram"));
                           doador.setEmail(res.getString("Email"));	
			   doador.setSenha(res.getString("Senha"));
			   
  			   modelo.addRow(new Object[] {doador.getId(), doador.getNome(),
  					   doador.getCpf(),doador.getData(),doador.getSexo(),doador.getEndereco(),doador.getCelular(),doador.getInstagram(),
  					   doador.getEmail(),doador.getSenha()});		    
	   
  		   }
  	   }
  	   catch(SQLException ex)
  	   {
  		   System.out.println("Erro SQL: " + ex.getMessage());
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
         }
     }
  	
    	
    }
    
    
    
    public boolean excluirAluno(Doadores doador)
    {
        System.out.println("Excluir Doador");
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado!! Preparando a exclusao");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();

            String sql = "DELETE FROM 'doadores' WHERE ID = " + doador.getId() + ";";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            
            return true;
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
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
            }
        }
    }
}