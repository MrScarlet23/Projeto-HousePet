package Banco;

import Dados.Doadores;
import Dados.Usuarios;
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

import Dados.centroDeAdoção;
import java.sql.PreparedStatement;

import projetofinal.TelaPrincipalCentroAdoção;
public class CentroAdoçãoBD
{

    
    
    Connection connection = null;
    PreparedStatement stmt;
    ResultSet resultado;
   
    ArrayList<CadastroPets> lista = new ArrayList<>();
     
    public ArrayList<CadastroPets> MostraPetsCentro()
    {
            centroDeAdoção objCentro = new centroDeAdoção();
    try {
        
        connection = Conexao.getInstance().getConnection();   
        String sql = "SELECT ID, Especie, Outro, Cor, Raca, Idade, TipoIdade, Porte, Sexo, Email, Contato FROM dadospets";
        PreparedStatement stmt = connection.prepareStatement(sql);
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
        objpets.setEmail(resultado.getString("Email"));
        objpets.setContato(resultado.getString("Contato"));

        lista.add(objpets);
    }

        } 
            catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
            
        }
            return lista;   
    }
    
    public void ExcluirPets(centroDeAdoção objcentro){
        connection = Conexao.getInstance().getConnection();   
       
        
        try {
        String sql = "DELETE FROM dadospets WHERE ID = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setInt(1, objcentro.getId());
        
        stmt.execute();
        stmt.close();
       
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
        
    }
    
    }
        
    
    
    
    
    public ResultSet PedirDadosCentros(centroDeAdoção objCentro)
    {
    connection = Conexao.getInstance().getConnection();   
    PreparedStatement stmt = null;
    ResultSet resultado = null;
    
    try {
        String sql = "SELECT * FROM centrosdeadocao WHERE Email = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, objCentro.getEmail());
        resultado = stmt.executeQuery();
        return resultado;
    
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
        return null;
    }
    
    }
    
    
    public ResultSet VerificarCadastroEmail(centroDeAdoção objUsuario)
    {
    connection = Conexao.getInstance().getConnection();   
    stmt = null;
    ResultSet resultado = null;
    
    try {
        String sql = "SELECT * FROM centrosdeadocao WHERE Email = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, objUsuario.getEmail());
        resultado = stmt.executeQuery();
        return resultado;
    
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
        return null;
    }

    
    }
    
    public ResultSet RecuperarSenhaCentro(centroDeAdoção objCentro) {
    connection = Conexao.getInstance().getConnection();
    stmt = null;
    ResultSet resultado = null;

    try {
        String sql = "SELECT * FROM centrosdeadocao  WHERE Email = ? AND CNPJ = ? AND Celular = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, objCentro.getEmail());
        stmt.setString(2, objCentro.getCnpj());  
        stmt.setString(3, objCentro.getCelular());  
        resultado = stmt.executeQuery();
        return resultado;

    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
        return null;
    }
}
    
    
    public ResultSet autenticacaoCentro (centroDeAdoção objCentro) {
    connection = Conexao.getInstance().getConnection();
    PreparedStatement stmt = null;
    ResultSet resultado = null;

    try {
        String sql = "SELECT * FROM centrosdeadocao  WHERE Email = ? AND Senha = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, objCentro.getEmail());
        stmt.setString(2, objCentro.getSenha());  
        resultado = stmt.executeQuery();
        return resultado;

    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de autenticação: " + erro.getMessage());
        return null;
    }
}
    
    
    public boolean inserircentroDeAdoção(centroDeAdoção centro) 
    {
    	boolean status = true;
    	
        System.out.println("Inserir Centro de Adocao");
        
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

            
            
            String sql = "INSERT INTO `centrosdeadocao` (NomeFantasia,CNPJ,Endereco,Celular,Instagram,Email,Senha) "
               + "VALUES('"+centro.getNomeFantasia()+"','"+centro.getCnpj()+"','"+centro.getEndereco()+"',"
                    + "'"+centro.getCelular()+"','"+centro.getInstagram()+"','"+centro.getEmail()+"',"
                    + "'"+centro.getSenha()+"');";
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

    public boolean atualizarCentroDeAdocao(centroDeAdoção centro) 
    {
        System.out.println("Atualizar Centro de adoção");
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

            String sql = "UPDATE centrosdeadocao SET NomeFantasia = '" + centro.getNomeFantasia() + "' WHERE ID = " + centro.getId() + ";";
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

    
    public void MostrarCentros(centroDeAdoção centro, DefaultTableModel modelo)      
    {
       connection = Conexao.getInstance().getConnection();
       System.out.println("Conectado!");
       Statement stmt = null;
         
  	        
  	   try
  	   {  		    
  		   stmt = connection.createStatement();
           ResultSet res = stmt.executeQuery("SELECT * FROM centrosdeadocao ORDER BY ID");
         
  		   while(res.next())
  		   {
  			   centro.setId(res.getInt("ID"));
  			   centro.setNomeFantasia(res.getString("NomeFantasia"));	
  			   centro.setCnpj(res.getString("CNPJ"));
                           centro.setEndereco(res.getString("Endereco"));
                           centro.setCelular(res.getString("Celular"));
  			   centro.setInstagram(res.getString("Instagram"));
                           centro.setEmail(res.getString("Email"));	
			   centro.setSenha(res.getString("Senha"));
			   
  			   modelo.addRow(new Object[] {centro.getId(), centro.getNomeFantasia(),
  					   centro.getCnpj(),centro.getEndereco(),centro.getCelular(),
                                           centro.getInstagram(),centro.getEmail(), centro.getSenha()});		    
	   
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
    
    
    
    public boolean excluirAluno(centroDeAdoção centro)
    {
        System.out.println("Excluir Centro de Adoção");
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado!! Preparando a exclusao");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();

            String sql = "DELETE FROM 'centrosdeadocao' WHERE ID = " + centro.getId() + ";";
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