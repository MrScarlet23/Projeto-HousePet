package projetofinal;

import Banco.UsuariosBD;
import Dados.Usuarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class TelaPrincipal extends javax.swing.JFrame {

   private RelatorioPets relatorioPets;
   private RelatorioPetsFelinos relatorioPetsFelinos;
   private RelatorioPetsCaes relatorioPetsCaes;
   private RelatorioCentroDeAdoção relatorioCentroDeAdoção;
   private RelatorioDoadores relatorioDoadores;
   private TelaPrincipalPerfilUsuario TelaPrincipalPerfilUsuario;
   private TelaLogin TelaLogin;
            
    public TelaPrincipal() {
        initComponents();
      
        TelaPrincipalPerfilUsuario = new TelaPrincipalPerfilUsuario();
        
    }

    public void setNomeText(String nome) {
        TxtNomeUsuario.setText(nome);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BotaoCentros = new javax.swing.JButton();
        BotaoDoadores = new javax.swing.JButton();
        BotaoCaes = new javax.swing.JButton();
        BotaoFelinos = new javax.swing.JButton();
        BotaoPetsDiversos = new javax.swing.JButton();
        BotaoCentros1 = new javax.swing.JButton();
        TxtNomeUsuario = new javax.swing.JTextField();
        BotaoCentros2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(77, 255, 148));
        jPanel1.setForeground(new java.awt.Color(77, 255, 148));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BotaoCentros.setBackground(new java.awt.Color(77, 255, 148));
        BotaoCentros.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        BotaoCentros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/coracao-de-casa.png"))); // NOI18N
        BotaoCentros.setText("Centros de adoção");
        BotaoCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCentrosActionPerformed(evt);
            }
        });

        BotaoDoadores.setBackground(new java.awt.Color(77, 255, 148));
        BotaoDoadores.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        BotaoDoadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/comercial.png"))); // NOI18N
        BotaoDoadores.setText("Doadores");
        BotaoDoadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDoadoresActionPerformed(evt);
            }
        });

        BotaoCaes.setBackground(new java.awt.Color(77, 255, 148));
        BotaoCaes.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        BotaoCaes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/animal.png"))); // NOI18N
        BotaoCaes.setText("Cães");
        BotaoCaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCaesActionPerformed(evt);
            }
        });

        BotaoFelinos.setBackground(new java.awt.Color(77, 255, 148));
        BotaoFelinos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        BotaoFelinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/gato.png"))); // NOI18N
        BotaoFelinos.setText("Felinos");
        BotaoFelinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFelinosActionPerformed(evt);
            }
        });

        BotaoPetsDiversos.setBackground(new java.awt.Color(77, 255, 148));
        BotaoPetsDiversos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        BotaoPetsDiversos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/gado.png"))); // NOI18N
        BotaoPetsDiversos.setText("Pets Diversos");
        BotaoPetsDiversos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPetsDiversosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoPetsDiversos, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoDoadores, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCentros)
                    .addComponent(BotaoCaes, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoFelinos, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(BotaoCentros)
                .addGap(31, 31, 31)
                .addComponent(BotaoDoadores)
                .addGap(30, 30, 30)
                .addComponent(BotaoCaes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(BotaoFelinos)
                .addGap(38, 38, 38)
                .addComponent(BotaoPetsDiversos)
                .addGap(24, 24, 24))
        );

        BotaoCentros1.setBackground(new java.awt.Color(77, 255, 148));
        BotaoCentros1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotaoCentros1.setText("Meu Perfil");
        BotaoCentros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCentros1ActionPerformed(evt);
            }
        });

        TxtNomeUsuario.setEditable(false);
        TxtNomeUsuario.setBackground(new java.awt.Color(77, 255, 148));
        TxtNomeUsuario.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        TxtNomeUsuario.setBorder(null);
        TxtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeUsuarioActionPerformed(evt);
            }
        });

        BotaoCentros2.setBackground(new java.awt.Color(77, 255, 148));
        BotaoCentros2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotaoCentros2.setText("Sair");
        BotaoCentros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCentros2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoCentros1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoCentros2))
                    .addComponent(TxtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(TxtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCentros1)
                    .addComponent(BotaoCentros2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCaesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCaesActionPerformed
        relatorioPetsCaes = new RelatorioPetsCaes(); 
    }//GEN-LAST:event_BotaoCaesActionPerformed

    private void BotaoCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCentrosActionPerformed
        relatorioCentroDeAdoção = new RelatorioCentroDeAdoção();
    }//GEN-LAST:event_BotaoCentrosActionPerformed

    private void BotaoFelinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFelinosActionPerformed
        relatorioPetsFelinos = new RelatorioPetsFelinos();
    }//GEN-LAST:event_BotaoFelinosActionPerformed

    private void BotaoPetsDiversosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPetsDiversosActionPerformed
        relatorioPets = new RelatorioPets();
    }//GEN-LAST:event_BotaoPetsDiversosActionPerformed

    private void BotaoDoadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDoadoresActionPerformed
        relatorioDoadores = new RelatorioDoadores();
    }//GEN-LAST:event_BotaoDoadoresActionPerformed

    private void BotaoCentros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCentros1ActionPerformed
        try 
        {
            String usuario;
        
            usuario = TxtNomeUsuario.getText();
            
            
            Usuarios objUsuario = new Usuarios();
            objUsuario.setNome(usuario);
            
            
            UsuariosBD objUsuarioBD = new UsuariosBD();
            ResultSet resul = objUsuarioBD.PedirDadosUsuario(objUsuario);
            
            if (resul.next()) 
            {
                
          
                String emailAutenticado = resul.getString("Email");
                String nomeUsuario = resul.getString("Nome");
                String cpf = resul.getString("CPF");
                String endereco = resul.getString("Endereco");
                String celular = resul.getString("Celular");
                String nascimento = resul.getString("DataNascimento");
                String sexo = resul.getString("Sexo");
                
                TelaPrincipalPerfilUsuario.setNomeText(nomeUsuario);
                TelaPrincipalPerfilUsuario.setCpfText(cpf);
                TelaPrincipalPerfilUsuario.setEnderecoText(endereco);
                TelaPrincipalPerfilUsuario.setCelularText(celular);
                TelaPrincipalPerfilUsuario.setNascimentoText(nascimento);
                TelaPrincipalPerfilUsuario.setEmailText(emailAutenticado);
                TelaPrincipalPerfilUsuario.setSexoText(sexo);
                TelaPrincipalPerfilUsuario.setVisible(true);
                this.dispose();
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Email ou Senha inválida");
                
            }
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "LOGIN" + erro);
        }    
     
        
    }//GEN-LAST:event_BotaoCentros1ActionPerformed

    private void TxtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeUsuarioActionPerformed

    private void BotaoCentros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCentros2ActionPerformed
        TelaLogin = new TelaLogin();
        TelaLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoCentros2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCaes;
    private javax.swing.JButton BotaoCentros;
    private javax.swing.JButton BotaoCentros1;
    private javax.swing.JButton BotaoCentros2;
    private javax.swing.JButton BotaoDoadores;
    private javax.swing.JButton BotaoFelinos;
    private javax.swing.JButton BotaoPetsDiversos;
    private javax.swing.JTextField TxtNomeUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
