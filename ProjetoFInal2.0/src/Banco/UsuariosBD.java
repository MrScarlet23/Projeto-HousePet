package Banco;

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

import Dados.Usuarios;
import Dados.Login;
import Banco.Conexao;
import java.sql.PreparedStatement;

public class UsuariosBD
{
    Connection connection = Conexao.getInstance().getConnection();
    PreparedStatement stmt;
    
    
    public ResultSet PedirDadosUsuario(Usuarios objUsuario)
    {
    connection = Conexao.getInstance().getConnection();   
    PreparedStatement stmt = null;
    ResultSet resultado = null;
    
    try {
        String sql = "SELECT * FROM usuarios WHERE Nome = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, objUsuario.getNome());
        resultado = stmt.executeQuery();
        return resultado;
    
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
        return null;
    }

    
    }
    
     public ResultSet RecuperarSenhaUsuario(Usuarios objUsuarios) {
    connection = Conexao.getInstance().getConnection();
    stmt = null;
    ResultSet resultado = null;

    try {
        String sql = "SELECT * FROM usuarios  WHERE Email = ? AND CPF = ? AND Celular = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, objUsuarios.getEmail());
        stmt.setString(2, objUsuarios.getCpf());  
        stmt.setString(3, objUsuarios.getCelular());  
        resultado = stmt.executeQuery();
        return resultado;

    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
        return null;
    }
}
    
    
    public ResultSet autenticaçãoUsuario(Usuarios objUsuario)
    {
    connection = Conexao.getInstance().getConnection();   
    PreparedStatement stmt = null;
    ResultSet resultado = null;
    
    try {
        String sql = "SELECT * FROM usuarios WHERE Email = ? AND Senha = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, objUsuario.getEmail());
        stmt.setString(2, objUsuario.getSenha());
        resultado = stmt.executeQuery();
        return resultado;
    
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
        return null;
    }

    
    }
    
    public ResultSet VerificarCadastroEmail(Usuarios objUsuario)
    {
    connection = Conexao.getInstance().getConnection();   
    stmt = null;
    ResultSet resultado = null;
    
    try {
        String sql = "SELECT * FROM usuarios WHERE Email = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, objUsuario.getEmail());
        resultado = stmt.executeQuery();
        return resultado;
    
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
        return null;
    }

    
    }
    
    
    public boolean inserirUsuarios(Usuarios usuario) 
    {
    	boolean status = true;
    	
        System.out.println("Inserir Usuario");
        
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

            
            
            String sql = "INSERT INTO `usuarios` (Nome,CPF,DataNascimento,Sexo,Endereco,Celular,Email,Senha) "
               + "VALUES('"+usuario.getNome()+"','"+usuario.getCpf()+"','"+usuario.getData()+"','"+usuario.getSexo()+"','"+usuario.getEndereco()+"','"+usuario.getCelular()+"','"+usuario.getEmail()+"','"+usuario.getSenha()+"');";
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

   

    
    public void relatorioCliente(Usuarios usuario, DefaultTableModel modelo)      
    {
       connection = Conexao.getInstance().getConnection();
       System.out.println("Conectado!! Preparando a exclusao");
       Statement stmt = null;
         
  	        
  	   try
  	   {  		    
  		   stmt = connection.createStatement();
           ResultSet res = stmt.executeQuery("SELECT * FROM usuarios ORDER BY ID");
         
  		   while(res.next())
  		   {
  			   usuario.setId(res.getString("ID"));
  			   usuario.setNome(res.getString("Nome"));	
  			   usuario.setCpf(res.getString("CPF"));
                           usuario.setData(res.getString("DataNascimento"));
                           usuario.setSexo(res.getString("Sexo"));
                           usuario.setEndereco(res.getString("Endereço"));
                           usuario.setCelular(res.getString("Celular"));
  			   usuario.setEmail(res.getString("Email"));	
			   usuario.setSenha(res.getString("Senha"));
			   
  			   modelo.addRow(new Object[] {usuario.getId(), usuario.getNome(),
  					   usuario.getCpf(),usuario.getData(),usuario.getSexo(),usuario.getEndereco(),usuario.getCelular(),
  					   usuario.getEmail(),usuario.getSenha()});		    
	   
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
    
    
    
    public boolean excluirAluno(Usuarios usuario)
    {
        System.out.println("Excluir Usuario");
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado!! Preparando a exclusao");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();

            String sql = "DELETE FROM 'usuarios' WHERE ID = " + usuario.getId() + ";";
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