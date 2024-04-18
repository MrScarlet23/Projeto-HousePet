package projetofinal;

import java.sql.SQLException;
import Banco.Conexao;
import Dados.Login;
import Banco.LoginDB;
import java.sql.*;
import Dados.Login;
import javax.swing.JOptionPane;
import Dados.Usuarios;
import Banco.UsuariosBD;
import Dados.centroDeAdoção;
import Banco.CentroAdoçãoBD;
import Dados.Doadores;
import Banco.DoadoresBD;

/**
 *
 * @author bubu_ e Samuhel
 */
public class TelaLogin extends javax.swing.JFrame {

    private TelaCadastro TelaCadastro;
    private TelaPrincipal TelaPrincipal;
    private TelaPrincipalCentroAdoção TelaPrincipalCentroAdoção;
    private TelaPrincipalPerfilDoadores TelaPrincipalPerfilDoadores;
    private TelaCadastroPets TelaCadastroPets;
    private TelaPrincipalPerfilUsuario TelaPrincipalPerfilUsuario;
    private TelaEsqueceuSenha TelaEsqueceuSenha;
    
    public TelaLogin() {
        initComponents();
        TelaCadastro = new TelaCadastro();
        TelaPrincipal = new TelaPrincipal();
        TelaPrincipalCentroAdoção = new TelaPrincipalCentroAdoção();
        TelaPrincipalPerfilDoadores = new TelaPrincipalPerfilDoadores();
        TelaCadastroPets = new TelaCadastroPets();
        TelaPrincipalPerfilUsuario = new TelaPrincipalPerfilUsuario();
        TelaEsqueceuSenha = new TelaEsqueceuSenha();
    }
    


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoEntrarCentro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        TxtLogin = new javax.swing.JTextField();
        BotaoEntrarUsuario = new javax.swing.JButton();
        TxtSenha = new javax.swing.JPasswordField();
        BotaoEntrarDoador = new javax.swing.JButton();
        BotaoEsqueceuSenha = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("House Pet");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(77, 255, 148));
        jPanel1.setForeground(new java.awt.Color(77, 255, 148));

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        BotaoEntrarCentro.setText("Entrar como Centro de Adoção");
        BotaoEntrarCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarCentroActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo 2.png"))); // NOI18N

        login.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(51, 51, 51));
        login.setText("Email");

        senha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        senha.setForeground(new java.awt.Color(51, 51, 51));
        senha.setText("Senha");

        TxtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLoginActionPerformed(evt);
            }
        });

        BotaoEntrarUsuario.setText("Entrar como Usuário");
        BotaoEntrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarUsuarioActionPerformed(evt);
            }
        });

        BotaoEntrarDoador.setText("Entrar como Doador");
        BotaoEntrarDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarDoadorActionPerformed(evt);
            }
        });

        BotaoEsqueceuSenha.setText("Esqueci minha Senha");
        BotaoEsqueceuSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEsqueceuSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoEsqueceuSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtLogin)
                            .addComponent(TxtSenha)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoEntrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoEntrarDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotaoEntrarCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel3))
                            .addComponent(login)
                            .addComponent(senha))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoEntrarUsuario)
                    .addComponent(BotaoEntrarDoador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(BotaoEntrarCentro)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCadastrar)
                    .addComponent(BotaoEsqueceuSenha))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/gatinho.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGO.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
    TelaCadastro.setVisible(true);    
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoEntrarCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarCentroActionPerformed
    try 
        {
            String senha, usuario;
        
            usuario = TxtLogin.getText();
            senha = TxtSenha.getText();
            
            centroDeAdoção objCentro = new centroDeAdoção();
            objCentro.setEmail(usuario);    
            objCentro.setSenha(senha);
            
            CentroAdoçãoBD objCentroBD = new CentroAdoçãoBD();
            ResultSet resul = objCentroBD.autenticacaoCentro(objCentro);
            
            
            if (resul.next()) 
            {
                
                objCentro.setEmail(usuario);
                String emailAutenticado = objCentro.getEmail();
                String nomeFantasia = resul.getString("NomeFantasia");
                String cnpj = resul.getString("CNPJ");
                String endereco = resul.getString("Endereco");
                String celular = resul.getString("Celular");
                String instagram = resul.getString("Instagram");
                
                TelaPrincipalCentroAdoção.setNomeFantasiaText(nomeFantasia);
                TelaPrincipalCentroAdoção.setCnpjText(cnpj);
                TelaPrincipalCentroAdoção.setEnderecoText(endereco);
                TelaPrincipalCentroAdoção.setCelularText(celular);
                TelaPrincipalCentroAdoção.setInstagramText(instagram);
                TelaPrincipalCentroAdoção.setEmailText(emailAutenticado);
                TelaPrincipalCentroAdoção.setVisible(true);
                
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
    }//GEN-LAST:event_BotaoEntrarCentroActionPerformed

    private void BotaoEntrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarUsuarioActionPerformed
    try 
        {
            String senha, usuario;
        
            usuario = TxtLogin.getText();
            senha = TxtSenha.getText();
            
            Usuarios objUsuario = new Usuarios();
            objUsuario.setEmail(usuario);
            objUsuario.setSenha(senha);
            
            UsuariosBD objUsuarioBD = new UsuariosBD();
            ResultSet resul = objUsuarioBD.autenticaçãoUsuario(objUsuario);
            
            if (resul.next()) 
            {
                
                objUsuario.setEmail(usuario);
                String emailAutenticado = objUsuario.getEmail();
                String nome = resul.getString("Nome");
                
                
                TelaPrincipal.setNomeText(nome);
                TelaPrincipal.setVisible(true);
                
                
                
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
    }//GEN-LAST:event_BotaoEntrarUsuarioActionPerformed

    private void TxtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLoginActionPerformed

    private void BotaoEntrarDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarDoadorActionPerformed
    
    try 
        {
            String senha, usuario;
        
            usuario = TxtLogin.getText();
            senha = TxtSenha.getText();
            
            Doadores objDoador = new Doadores();
            objDoador.setEmail(usuario);
            objDoador.setSenha(senha);
            
            DoadoresBD objDoadorBD = new DoadoresBD();
            ResultSet resul = objDoadorBD.autenticacaoDoador(objDoador);
            
            if (resul.next()) 
            {
                
                
                
                objDoador.setEmail(usuario);
                String emailAutenticado = objDoador.getEmail();
                String nome = resul.getString("Nome");
                String nascimento = resul.getString("DataNascimento");
                String cpf = resul.getString("CPF");
                String endereco = resul.getString("Endereco");
                String celular = resul.getString("Celular");
                String instagram = resul.getString("Instagram");
                String sexo = resul.getString("DataNascimento");
                
                TelaPrincipalPerfilDoadores.setNomeText(nome);
                TelaPrincipalPerfilDoadores.setCnpjText(cpf);
                TelaPrincipalPerfilDoadores.setNascimentoText(nascimento);
                TelaPrincipalPerfilDoadores.setEnderecoText(endereco);
                TelaPrincipalPerfilDoadores.setCelularText(celular);
                TelaPrincipalPerfilDoadores.setInstagramText(instagram);
                TelaPrincipalPerfilDoadores.setEmailText(emailAutenticado);
                TelaPrincipalPerfilDoadores.setSexoText("Sexo");
                TelaPrincipalPerfilDoadores.setVisible(true);
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
        
    }//GEN-LAST:event_BotaoEntrarDoadorActionPerformed

    private void BotaoEsqueceuSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEsqueceuSenhaActionPerformed
        TelaEsqueceuSenha.setVisible(true);
    }//GEN-LAST:event_BotaoEsqueceuSenhaActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoEntrarCentro;
    private javax.swing.JButton BotaoEntrarDoador;
    private javax.swing.JButton BotaoEntrarUsuario;
    private javax.swing.JButton BotaoEsqueceuSenha;
    private javax.swing.JTextField TxtLogin;
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login;
    private javax.swing.JLabel senha;
    // End of variables declaration//GEN-END:variables
}
