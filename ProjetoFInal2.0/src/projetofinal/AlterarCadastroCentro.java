package projetofinal;

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

import Dados.Usuarios;
import Banco.UsuariosBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AlterarCadastroCentro extends javax.swing.JFrame {
    
    Connection connection = Conexao.getInstance().getConnection();

    
    public AlterarCadastroCentro() {
        initComponents();
    }
    
    public void setId(int id) {
        TxtIdCentro.setText(Integer.toString(id));
    }
    public void setEmailText(String email) {
        TxtAlterarEmailCentro.setText(email);
    }
    public void setNomeText(String nome) {
        TxtAlterarNomeCentro.setText(nome);
    }
    public void setCnpjCentroText (String cnpj){
        TxtCnpjCentro.setText(cnpj);
    }
    public void setEnderecoText(String endereco){
        TxtAlterarEnderecoCentro.setText(endereco);
    }
    public void setCelularText(String celular){
        TxtAlterarCelularCentro.setText(celular);
    }
    public void setInstagram(String instagram){
        TxtAlterarInstagramCentro.setText(instagram);
    }
    public void setSenhaText(String senha){
        TxtAlterarSenhaCentro.setText(senha);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NomeDoador = new javax.swing.JLabel();
        TxtAlterarNomeCentro = new javax.swing.JTextField();
        CpfDoador = new javax.swing.JLabel();
        CelularDoador = new javax.swing.JLabel();
        TxtAlterarCelularCentro = new javax.swing.JFormattedTextField();
        DataNascimentoDoador = new javax.swing.JLabel();
        EmailDoador = new javax.swing.JLabel();
        TxtAlterarEmailCentro = new javax.swing.JTextField();
        EnderecoDoador = new javax.swing.JLabel();
        TxtAlterarEnderecoCentro = new javax.swing.JTextField();
        SenhaCentro1 = new javax.swing.JLabel();
        TxtAlterarSenhaCentro = new javax.swing.JTextField();
        BotaoAlterarDados = new javax.swing.JButton();
        TxtIdCentro = new javax.swing.JTextField();
        IdDoador = new javax.swing.JLabel();
        BotãoCancelar = new javax.swing.JButton();
        TxtAlterarInstagramCentro = new javax.swing.JTextField();
        TxtCnpjCentro = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        NomeDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NomeDoador.setText("Nome* (pelo menos 8 caracteres)");

        CpfDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CpfDoador.setText("CNPJ");

        CelularDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CelularDoador.setText("Celular*");

        try {
            TxtAlterarCelularCentro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        DataNascimentoDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DataNascimentoDoador.setText("Instagram");

        EmailDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EmailDoador.setText("Email*");

        TxtAlterarEmailCentro.setEditable(false);

        EnderecoDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EnderecoDoador.setText("Endereço*");

        SenhaCentro1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SenhaCentro1.setText("Senha (entre 6 e 10 letras ou numeros)");

        TxtAlterarSenhaCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAlterarSenhaCentroActionPerformed(evt);
            }
        });

        BotaoAlterarDados.setText("Alterar Dados");
        BotaoAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarDadosActionPerformed(evt);
            }
        });

        TxtIdCentro.setEditable(false);

        IdDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        IdDoador.setText("ID");

        BotãoCancelar.setText("Cancelar");
        BotãoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCancelarActionPerformed(evt);
            }
        });

        TxtCnpjCentro.setEditable(false);
        try {
            TxtCnpjCentro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(EnderecoDoador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TxtAlterarEnderecoCentro, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtAlterarCelularCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CpfDoador)
                            .addComponent(CelularDoador)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtIdCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IdDoador)))
                            .addComponent(TxtCnpjCentro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtAlterarNomeCentro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtAlterarEmailCentro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NomeDoador)
                                    .addComponent(EmailDoador)
                                    .addComponent(TxtAlterarInstagramCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DataNascimentoDoador))
                                .addGap(0, 10, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotãoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoAlterarDados, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(SenhaCentro1)
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtAlterarSenhaCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeDoador)
                    .addComponent(IdDoador)
                    .addComponent(SenhaCentro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAlterarNomeCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIdCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAlterarSenhaCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpfDoador)
                    .addComponent(DataNascimentoDoador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAlterarInstagramCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCnpjCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CelularDoador)
                    .addComponent(EmailDoador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtAlterarCelularCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtAlterarEmailCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(EnderecoDoador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotãoCancelar)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAlterarEnderecoCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoAlterarDados))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAlterarSenhaCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAlterarSenhaCentroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAlterarSenhaCentroActionPerformed

    private void BotaoAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarDadosActionPerformed
        
     atualizarDados();  
    
    }//GEN-LAST:event_BotaoAlterarDadosActionPerformed

    private void BotãoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotãoCancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterarDados;
    private javax.swing.JButton BotãoCancelar;
    private javax.swing.JLabel CelularDoador;
    private javax.swing.JLabel CpfDoador;
    private javax.swing.JLabel DataNascimentoDoador;
    private javax.swing.JLabel EmailDoador;
    private javax.swing.JLabel EnderecoDoador;
    private javax.swing.JLabel IdDoador;
    private javax.swing.JLabel NomeDoador;
    private javax.swing.JLabel SenhaCentro1;
    private javax.swing.JFormattedTextField TxtAlterarCelularCentro;
    private javax.swing.JTextField TxtAlterarEmailCentro;
    private javax.swing.JTextField TxtAlterarEnderecoCentro;
    private javax.swing.JTextField TxtAlterarInstagramCentro;
    private javax.swing.JTextField TxtAlterarNomeCentro;
    private javax.swing.JTextField TxtAlterarSenhaCentro;
    private javax.swing.JFormattedTextField TxtCnpjCentro;
    private javax.swing.JTextField TxtIdCentro;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
    
    
    public void atualizarDados(){
        String sql = "UPDATE centrosdeadocao set NomeFantasia = ?, CNPJ = ?, Instagram = ?, Endereco = ?, Celular = ?, Senha = ?, Email = ? WHERE ID = ?";
        connection = Conexao.getInstance().getConnection();
        PreparedStatement stmt = null;
   
        
        try {
            
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, TxtAlterarNomeCentro.getText());
            stmt.setString(2, TxtCnpjCentro.getText());
            stmt.setString(3,TxtAlterarInstagramCentro.getText());
            stmt.setString(4, TxtAlterarEnderecoCentro.getText());
            stmt.setString(5, TxtAlterarCelularCentro.getText());
            stmt.setString(6,TxtAlterarSenhaCentro.getText());
            stmt.setString(7, TxtAlterarEmailCentro.getText());
            stmt.setString(8, TxtIdCentro.getText());
            if(TxtAlterarNomeCentro.getText().isEmpty() || TxtAlterarCelularCentro.getText().isEmpty() 
            || TxtAlterarSenhaCentro.getText().isEmpty() || TxtAlterarEnderecoCentro.getText().isEmpty()) 
            {       
                JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!");
            }
            else if(TxtAlterarNomeCentro.getText().length() < 8 || TxtAlterarNomeCentro.getText().length() > 30 
            || !TxtAlterarNomeCentro.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ\\s]+"))
            {   
                JOptionPane.showMessageDialog(null, "nome inválido");
            }
            else if(TxtAlterarEnderecoCentro.getText().length() < 10 || !TxtAlterarEnderecoCentro.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ,\\s0-9]+"))
            {
                JOptionPane.showMessageDialog(null, "Endereco inválido");
            }
            else if(TxtAlterarSenhaCentro.getText().length() > 15 || TxtAlterarSenhaCentro.getText().length() < 6 
            || !TxtAlterarSenhaCentro.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ0-9]+"))
            {
                    JOptionPane.showMessageDialog(null, "senha inválida");
            }
            else
            {
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"dados alterados");
                this.dispose();
            }
            
    
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de alteração: " + erro.getMessage());
        
    }
        
    }



}


