package projetofinal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;


import Dados.CadastroPets;
import Banco.CadastroPetsFelinosBD;

import java.awt.Toolkit;


public class RelatorioPetsFelinos extends JFrame
{
   private DefaultTableModel modelo;
   private JTable tabela;
   
   
   private CadastroPets cadastroPets;
   private CadastroPetsFelinosBD cadastroPetsFelinosBD;
   
   
   public RelatorioPetsFelinos()
   {
      
	   cadastroPets = new CadastroPets();
	   cadastroPetsFelinosBD = new CadastroPetsFelinosBD();
	   
	   
	   modelo = new DefaultTableModel();
	   tabela = new JTable(modelo);
           
           
	   modelo.addColumn("ID");
	   modelo.addColumn("Outro");
           modelo.addColumn("Especie");
	   modelo.addColumn("Raca");
	   modelo.addColumn("Cor");
	   modelo.addColumn("Idade");
	   modelo.addColumn("TipoIdade");
	   modelo.addColumn("Porte");
	   modelo.addColumn("Sexo");
           modelo.addColumn("Email");
           modelo.addColumn("Contato");
          
	   
	   
	   cadastroPetsFelinosBD.MostrarFelinos(cadastroPets, modelo);
           
           
	  
	   
	   tabela.setPreferredScrollableViewportSize(new Dimension(1100,200));
	   Container c = getContentPane();
	   c.setLayout(new FlowLayout());
	   JScrollPane scarollPane = new JScrollPane(tabela);
           tabela.getColumnModel().getColumn(0).setPreferredWidth(5);
           tabela.getColumnModel().getColumn(5).setPreferredWidth(5);
           tabela.getColumnModel().getColumn(6).setPreferredWidth(10);
           tabela.getColumnModel().getColumn(1).setPreferredWidth(50);
           tabela.getColumnModel().getColumn(7).setPreferredWidth(20);
           tabela.getColumnModel().getColumn(8).setPreferredWidth(20);
           tabela.getColumnModel().getColumn(9).setPreferredWidth(100);
	   c.add(scarollPane);
	   setSize(1150,300);
	   setTitle("Pets Cadastrados");
           setLocationRelativeTo(null);
           setResizable(false);
	   setVisible(true);
	   
   }
       
}
