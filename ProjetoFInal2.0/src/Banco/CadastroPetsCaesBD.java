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

import Dados.CadastroPets;

public class CadastroPetsCaesBD
{

    Connection connection = null;

    public boolean inserirCadastroPets(CadastroPets pets) 
    {
    	boolean status = true;
    	
        System.out.println("Inserir Dados do Pet");
        
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

            
            
            String sql = "INSERT INTO `dadospets` (Especie,Raca,Cor,Idade,TipoIdade,Porte,Sexo) "
               + "VALUES('"+pets.getEspecie()+"','"+pets.getRaca()+"','"+pets.getCor()+"','"+pets.getIdade()+"','"+pets.getTipoIdade()+
                    "','"+pets.getPorte()+"','"+pets.getSexo()+"');";
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

    public boolean atualizarCadastroPets(CadastroPets pets) 
    {
        System.out.println("Atualizar Cadastro de Pets");
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

            String sql = "UPDATE dadospets SET Especie = '" + pets.getEspecie() + "' WHERE ID = " + pets.getId() + ";";
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

    
    public void MostrarCaes(CadastroPets pets, DefaultTableModel modelo)      
    {
       connection = Conexao.getInstance().getConnection();
       System.out.println("Conectado!");
       Statement stmt = null;
         
  	        
  	   try
  	   {  		    
  		   stmt = connection.createStatement();
           ResultSet res = stmt.executeQuery("SELECT * FROM dadospets WHERE Especie = 'Cão' ORDER BY ID");
         
  		   while(res.next())
  		   {
  			   pets.setId(res.getInt("ID"));	
                           pets.setEspecie(res.getString("Especie"));
                           pets.setOutro("Outro");
                           pets.setRaca(res.getString("Raca"));
  			   pets.setCor(res.getString("Cor"));
                           pets.setIdade(res.getString("Idade"));
                           pets.setTipoIdade(res.getString("TipoIdade"));
			   pets.setPorte(res.getString("Porte"));
			   pets.setSexo(res.getString("Sexo"));
			   pets.setEmail(res.getString("Email"));
			   pets.setContato(res.getString("Contato"));
                           
  			   modelo.addRow(new Object[] {pets.getId(),pets.getEspecie(),pets.getOutro(),
                                           pets.getRaca(),pets.getCor(),pets.getIdade(),
                                           pets.getTipoIdade(),pets.getPorte(),pets.getSexo(), pets.getEmail(), 
                                           pets.getContato()});		    
	   
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
    
    
    
    public boolean excluirAluno(CadastroPets pets)
    {
        System.out.println("Excluir Cadastro de Pet");
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado!! Preparando a exclusao");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();

            String sql = "DELETE FROM 'dadospets' WHERE ID = " + pets.getId() + ";";
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