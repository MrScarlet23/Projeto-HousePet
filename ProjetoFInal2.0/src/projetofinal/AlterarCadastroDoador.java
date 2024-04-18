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

public class AlterarCadastroDoador extends javax.swing.JFrame {
    
    Connection connection = Conexao.getInstance().getConnection();
    
    private TelaPrincipalPerfilDoadores TelaPrincipalPerfilDoadores;

    
    public AlterarCadastroDoador() {
        initComponents();
    }
    
    public void setId(int id) {
        TxtIDoador.setText(Integer.toString(id));
    }
    public void setEmailText(String email) {
        TxtAlterarEmailDoador.setText(email);
    }
    public void setNomeText(String nome) {
        TxtAlterarNomeDoador.setText(nome);
    }
    public void setCpfText (String cpf){
        TxtAlterarCpfDoador.setText(cpf);
    }
    public void setEnderecoText(String endereco){
        TxtAlterarEnderecoDoador.setText(endereco);
    }
    public void setCelularText(String celular){
        TxtAlterarCelularDoador.setText(celular);
    }
    public void setSexoText(String sexo){
        TxtAlterarSexoDoador.setSelectedItem(sexo);
    }
    public void setNascimentoText(String nascimento){
        TxtAlterarNascimentoDoador.setText(nascimento);
    }
    public void setSenhaText(String senha){
        TxtAlterarSenhaDoador1.setText(senha);
    }
    public void setInstagram(String instagram){
        TxtAlterarInstagramDoador.setText(instagram);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NomeDoador = new javax.swing.JLabel();
        TxtAlterarNomeDoador = new javax.swing.JTextField();
        CpfDoador = new javax.swing.JLabel();
        TxtAlterarCpfDoador = new javax.swing.JFormattedTextField();
        CelularDoador = new javax.swing.JLabel();
        TxtAlterarCelularDoador = new javax.swing.JFormattedTextField();
        DataNascimentoDoador = new javax.swing.JLabel();
        TxtAlterarNascimentoDoador = new javax.swing.JFormattedTextField();
        SexoDoador = new javax.swing.JLabel();
        EmailDoador = new javax.swing.JLabel();
        TxtAlterarEmailDoador = new javax.swing.JTextField();
        EnderecoDoador = new javax.swing.JLabel();
        TxtAlterarEnderecoDoador = new javax.swing.JTextField();
        SenhaCentro1 = new javax.swing.JLabel();
        TxtAlterarSenhaDoador1 = new javax.swing.JTextField();
        BotaoAlterarDados = new javax.swing.JButton();
        TxtIDoador = new javax.swing.JTextField();
        TxtAlterarSexoDoador = new javax.swing.JComboBox<>();
        IdDoador = new javax.swing.JLabel();
        BotãoCancelar = new javax.swing.JButton();
        TxtAlterarInstagramDoador = new javax.swing.JTextField();
        InstagramCentro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        NomeDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NomeDoador.setText("Nome* (pelo menos 8 caracteres)");

        CpfDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CpfDoador.setText("CPF*");

        TxtAlterarCpfDoador.setEditable(false);
        try {
            TxtAlterarCpfDoador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        CelularDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CelularDoador.setText("Celular*");

        try {
            TxtAlterarCelularDoador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        DataNascimentoDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DataNascimentoDoador.setText("Data de nascimento*");

        try {
            TxtAlterarNascimentoDoador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        SexoDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SexoDoador.setText("Sexo*");

        EmailDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EmailDoador.setText("Email*");

        TxtAlterarEmailDoador.setEditable(false);

        EnderecoDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EnderecoDoador.setText("Endereço*");

        SenhaCentro1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SenhaCentro1.setText("Senha (entre 6 e 10 letras ou numeros)");

        TxtAlterarSenhaDoador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAlterarSenhaDoador1ActionPerformed(evt);
            }
        });

        BotaoAlterarDados.setText("Alterar Dados");
        BotaoAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarDadosActionPerformed(evt);
            }
        });

        TxtIDoador.setEditable(false);

        TxtAlterarSexoDoador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Indefinido", "Não selecionar" }));

        IdDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        IdDoador.setText("ID");

        BotãoCancelar.setText("Cancelar");
        BotãoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCancelarActionPerformed(evt);
            }
        });

        TxtAlterarInstagramDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAlterarInstagramDoadorActionPerformed(evt);
            }
        });

        InstagramCentro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        InstagramCentro.setText("Instagram");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(EnderecoDoador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TxtAlterarEnderecoDoador, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtAlterarCelularDoador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(TxtAlterarCpfDoador, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CpfDoador, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(CelularDoador)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtIDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IdDoador))))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeDoador)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtAlterarNomeDoador, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TxtAlterarEmailDoador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(TxtAlterarSexoDoador, 0, 250, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EmailDoador)
                                        .addComponent(SexoDoador))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SenhaCentro1)
                            .addComponent(TxtAlterarNascimentoDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DataNascimentoDoador)
                            .addComponent(TxtAlterarSenhaDoador1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtAlterarInstagramDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InstagramCentro)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(BotãoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoAlterarDados)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeDoador)
                    .addComponent(DataNascimentoDoador)
                    .addComponent(IdDoador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAlterarNomeDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAlterarNascimentoDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpfDoador)
                    .addComponent(SexoDoador)
                    .addComponent(SenhaCentro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAlterarCpfDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAlterarSenhaDoador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAlterarSexoDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CelularDoador)
                    .addComponent(EmailDoador)
                    .addComponent(InstagramCentro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAlterarCelularDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAlterarEmailDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAlterarInstagramDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(EnderecoDoador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAlterarEnderecoDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoAlterarDados)
                    .addComponent(BotãoCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void TxtAlterarSenhaDoador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAlterarSenhaDoador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAlterarSenhaDoador1ActionPerformed

    private void BotaoAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarDadosActionPerformed
        
     atualizarDadosDoador();  
    
    }//GEN-LAST:event_BotaoAlterarDadosActionPerformed

    private void BotãoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCancelarActionPerformed
        
        retornarDadosDoador();
        this.dispose();
    }//GEN-LAST:event_BotãoCancelarActionPerformed

    private void TxtAlterarInstagramDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAlterarInstagramDoadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAlterarInstagramDoadorActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterarDados;
    private javax.swing.JButton BotãoCancelar;
    private javax.swing.JLabel CelularDoador;
    private javax.swing.JLabel CpfDoador;
    private javax.swing.JLabel DataNascimentoDoador;
    private javax.swing.JLabel EmailDoador;
    private javax.swing.JLabel EnderecoDoador;
    private javax.swing.JLabel IdDoador;
    private javax.swing.JLabel InstagramCentro;
    private javax.swing.JLabel NomeDoador;
    private javax.swing.JLabel SenhaCentro1;
    private javax.swing.JLabel SexoDoador;
    private javax.swing.JFormattedTextField TxtAlterarCelularDoador;
    private javax.swing.JFormattedTextField TxtAlterarCpfDoador;
    private javax.swing.JTextField TxtAlterarEmailDoador;
    private javax.swing.JTextField TxtAlterarEnderecoDoador;
    private javax.swing.JTextField TxtAlterarInstagramDoador;
    private javax.swing.JFormattedTextField TxtAlterarNascimentoDoador;
    private javax.swing.JTextField TxtAlterarNomeDoador;
    private javax.swing.JTextField TxtAlterarSenhaDoador1;
    private javax.swing.JComboBox<String> TxtAlterarSexoDoador;
    private javax.swing.JTextField TxtIDoador;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
    
    
    public void atualizarDadosDoador(){
        String sql = "UPDATE doadores set Nome = ?, CPF = ?, DataNascimento = ?, Endereco = ?, Celular = ?, Senha = ?, Sexo = ?, Email = ?, Instagram =? WHERE ID = ?";
        connection = Conexao.getInstance().getConnection();
        PreparedStatement stmt = null;
   
        
        try {
            
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, TxtAlterarNomeDoador.getText());
            stmt.setString(2, TxtAlterarCpfDoador.getText());
            stmt.setString(3,TxtAlterarNascimentoDoador.getText());
            stmt.setString(4, TxtAlterarEnderecoDoador.getText());
            stmt.setString(5, TxtAlterarCelularDoador.getText());
            stmt.setString(6,TxtAlterarSenhaDoador1.getText());
            stmt.setString(7, TxtAlterarSexoDoador.getSelectedItem().toString());
            stmt.setString(8, TxtAlterarEmailDoador.getText());
            stmt.setString(9, TxtAlterarInstagramDoador.getText());
            stmt.setString(10, TxtIDoador.getText());
            if(TxtAlterarNomeDoador.getText().isEmpty() || TxtAlterarCelularDoador.getText().isEmpty() 
            || TxtAlterarNascimentoDoador.getText().isEmpty() || TxtAlterarSenhaDoador1.getText().isEmpty() 
            || TxtAlterarEnderecoDoador.getText().isEmpty()) 
            {       
                JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!");
           }
            else if(TxtAlterarNomeDoador.getText().length() < 8 || TxtAlterarNomeDoador.getText().length() > 30 
            || !TxtAlterarNomeDoador.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ\\s]+"))
           {   
                JOptionPane.showMessageDialog(null, "nome inválido");
           }
            else if(TxtAlterarEnderecoDoador.getText().length() < 10 || !TxtAlterarEnderecoDoador.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ,\\s0-9]+"))
            {    
                JOptionPane.showMessageDialog(null, "Endereco inválido");
            }
            else if(TxtAlterarSenhaDoador1.getText().length() > 15 || TxtAlterarSenhaDoador1.getText().length() < 6 
           || !TxtAlterarSenhaDoador1.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ0-9]+"))
            {
                JOptionPane.showMessageDialog(null, "senha inválida");
            }
            else
            {
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"dados alterados");
                retornarDadosDoador();
                this.dispose();
            }
            
    
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de alteração: " + erro.getMessage());
        
        
        
    }
        
    }

public void retornarDadosDoador()
    {
        TelaPrincipalPerfilDoadores = new TelaPrincipalPerfilDoadores();
        String nome, endereco, cpf, celular, data, email, sexo, instagram;
        nome = TxtAlterarNomeDoador.getText();
        endereco = TxtAlterarEnderecoDoador.getText();
        cpf = TxtAlterarCpfDoador.getText();
        celular = TxtAlterarCelularDoador.getText();
        data = TxtAlterarNascimentoDoador.getText();
        email = TxtAlterarEmailDoador.getText();
        sexo = TxtAlterarSexoDoador.getSelectedItem().toString();
        instagram = TxtAlterarInstagramDoador.getText();
        
        TelaPrincipalPerfilDoadores.setNomeText(nome);
        TelaPrincipalPerfilDoadores.setEnderecoText(endereco);
        TelaPrincipalPerfilDoadores.setCnpjText(cpf);
        TelaPrincipalPerfilDoadores.setCelularText(celular);
        TelaPrincipalPerfilDoadores.setNascimentoText(data);
        TelaPrincipalPerfilDoadores.setEmailText(email);
        TelaPrincipalPerfilDoadores.setSexoText(sexo);
        TelaPrincipalPerfilDoadores.setInstagramText(instagram);
        TelaPrincipalPerfilDoadores.setVisible(true);
    }

}


