package projetofinal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;


import Dados.Doadores;
import Banco.DoadoresBD;

import java.awt.Toolkit;


public class RelatorioDoadores extends JFrame
{
   private DefaultTableModel modelo;
   private JTable tabela;
   
   
   private Doadores doadores;
   private DoadoresBD doadoresBD;
   
   
   public RelatorioDoadores()
   {
      
	   doadores = new Doadores();
	   doadoresBD = new DoadoresBD();
	   
	   
	   modelo = new DefaultTableModel();
	   tabela = new JTable(modelo);
           
           
	   modelo.addColumn("ID");
	   modelo.addColumn("Nome");
	   modelo.addColumn("CPF");
           modelo.addColumn("DataNascimento");
           modelo.addColumn("Sexo");
	   modelo.addColumn("Endereco");
	   modelo.addColumn("Celular");
	   modelo.addColumn("Instagram");
	   modelo.addColumn("Email");
	   
          
	   
	   
	   doadoresBD.MostrarDoadores(doadores, modelo);
           
           
	  
	   
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
	   setTitle("Doadores Cadastrados");
           setLocationRelativeTo(null);
           setResizable(false);
	   setVisible(true);
	   
   }
       
}
