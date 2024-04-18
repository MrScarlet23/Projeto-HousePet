package projetofinal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;


import Dados.centroDeAdoção;
import Banco.CentroAdoçãoBD;

import java.awt.Toolkit;


public class RelatorioCentroDeAdoção extends JFrame
{
   private DefaultTableModel modelo;
   private JTable tabela;
   
   
   private centroDeAdoção centrodeadoção;
   private CentroAdoçãoBD centroadoçãoBD;
   
   
   public RelatorioCentroDeAdoção()
   {
      
	   centrodeadoção = new centroDeAdoção();
	   centroadoçãoBD = new CentroAdoçãoBD();
	   
	   
	   modelo = new DefaultTableModel();
	   tabela = new JTable(modelo);
           
           
	   modelo.addColumn("ID");
	   modelo.addColumn("NomeFantasia");
	   modelo.addColumn("CNPJ");
	   modelo.addColumn("Endereco");
	   modelo.addColumn("Celular");
	   modelo.addColumn("Instagram");
	   modelo.addColumn("Email");
	   
          
	   
	   
	   centroadoçãoBD.MostrarCentros(centrodeadoção, modelo);
           
           
	  
	   
	   tabela.setPreferredScrollableViewportSize(new Dimension(1100,200));
	   Container c = getContentPane();
	   c.setLayout(new FlowLayout());
	   JScrollPane scarollPane = new JScrollPane(tabela);
           tabela.getColumnModel().getColumn(0).setPreferredWidth(5);
           tabela.getColumnModel().getColumn(3).setPreferredWidth(30);
           tabela.getColumnModel().getColumn(4).setPreferredWidth(30);
           tabela.getColumnModel().getColumn(1).setPreferredWidth(50);
	   c.add(scarollPane);
	   setSize(1150,300);
	   setTitle("Centros de Adoção Cadastrados");
           setLocationRelativeTo(null);
           setResizable(false);
	   setVisible(true);
	   
   }
       
}
