package projetofinal;

import Dados.centroDeAdoção;
import Banco.CentroAdoçãoBD;
import Banco.Conexao;
import Banco.UsuariosBD;
import Dados.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class TelaPrincipalPerfilUsuario extends javax.swing.JFrame {

    public TelaCadastroPets TelaCadastroPets;
    private centroDeAdoção centroDeAdoção;
    private CentroAdoçãoBD CentroAdoçãoBD;
    private AlterarCadastroUsuario AlterarCadastroUsuario;
    private TelaLogin TelaLogin;
    private TelaPrincipal TelaPrincipal;
    
    Connection connection = Conexao.getInstance().getConnection();
    
            
    public TelaPrincipalPerfilUsuario() {
        initComponents();
        
        TelaCadastroPets = new TelaCadastroPets();
        centroDeAdoção = new centroDeAdoção();
        CentroAdoçãoBD = new CentroAdoçãoBD();
        AlterarCadastroUsuario = new AlterarCadastroUsuario();
      
    }
    
    public void setEmailText(String email) {
        TxtEmailPerfilUsuario.setText(email);
    }
    public void setNomeText(String nome) {
        TxtNomePerfilUsuario.setText(nome);
    }
    public void setCpfText (String cpf){
        TxtCpfPerfilUsuario.setText(cpf);
    }
    public void setEnderecoText(String endereco){
        TxtEnderecoPerfilUsuario.setText(endereco);
    }
    public void setCelularText(String celular){
        TxtCelularPerfilUsuario.setText(celular);
    }
    public void setSexoText(String sexo){
        TxtSexoPerfilUsuario.setText(sexo);
    }
    public void setNascimentoText(String nascimento){
        TxtDataNascimentoPerfilUsuario.setText(nascimento);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NomePerfil = new javax.swing.JLabel();
        TxtNomePerfilUsuario = new javax.swing.JTextField();
        CpfPerfil = new javax.swing.JLabel();
        TxtCpfPerfilUsuario = new javax.swing.JTextField();
        DataNascimentoPerfil = new javax.swing.JLabel();
        TxtDataNascimentoPerfilUsuario = new javax.swing.JTextField();
        sexoPerfil = new javax.swing.JLabel();
        TxtSexoPerfilUsuario = new javax.swing.JTextField();
        endereçoPerfil = new javax.swing.JLabel();
        TxtEnderecoPerfilUsuario = new javax.swing.JTextField();
        endereçoPerfil1 = new javax.swing.JLabel();
        TxtCelularPerfilUsuario = new javax.swing.JTextField();
        emailPerfil = new javax.swing.JLabel();
        TxtEmailPerfilUsuario = new javax.swing.JTextField();
        BotaoAlterarDados = new javax.swing.JButton();
        BotaoSairPerfil = new javax.swing.JButton();
        BotaoExcluirPerfil = new javax.swing.JButton();
        TxtPerfilUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(77, 255, 148));
        jPanel1.setForeground(new java.awt.Color(77, 255, 148));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        NomePerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        NomePerfil.setText("Nome");

        TxtNomePerfilUsuario.setEditable(false);
        TxtNomePerfilUsuario.setBackground(new java.awt.Color(204, 204, 204));
        TxtNomePerfilUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TxtNomePerfilUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomePerfilUsuarioActionPerformed(evt);
            }
        });

        CpfPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CpfPerfil.setText("CPF");

        TxtCpfPerfilUsuario.setEditable(false);
        TxtCpfPerfilUsuario.setBackground(new java.awt.Color(204, 204, 204));
        TxtCpfPerfilUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        DataNascimentoPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DataNascimentoPerfil.setText("Data de Nascimento");

        TxtDataNascimentoPerfilUsuario.setEditable(false);
        TxtDataNascimentoPerfilUsuario.setBackground(new java.awt.Color(204, 204, 204));
        TxtDataNascimentoPerfilUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        sexoPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sexoPerfil.setText("Sexo");

        TxtSexoPerfilUsuario.setEditable(false);
        TxtSexoPerfilUsuario.setBackground(new java.awt.Color(204, 204, 204));
        TxtSexoPerfilUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        endereçoPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        endereçoPerfil.setText("Endereço");

        TxtEnderecoPerfilUsuario.setEditable(false);
        TxtEnderecoPerfilUsuario.setBackground(new java.awt.Color(204, 204, 204));
        TxtEnderecoPerfilUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        endereçoPerfil1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        endereçoPerfil1.setText("Celular");

        TxtCelularPerfilUsuario.setEditable(false);
        TxtCelularPerfilUsuario.setBackground(new java.awt.Color(204, 204, 204));
        TxtCelularPerfilUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        emailPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        emailPerfil.setText("Email");

        TxtEmailPerfilUsuario.setEditable(false);
        TxtEmailPerfilUsuario.setBackground(new java.awt.Color(204, 204, 204));
        TxtEmailPerfilUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        BotaoAlterarDados.setBackground(new java.awt.Color(77, 255, 148));
        BotaoAlterarDados.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotaoAlterarDados.setText("Alterar Dados");
        BotaoAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarDadosActionPerformed(evt);
            }
        });

        BotaoSairPerfil.setBackground(new java.awt.Color(77, 255, 148));
        BotaoSairPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotaoSairPerfil.setText("Sair");
        BotaoSairPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairPerfilActionPerformed(evt);
            }
        });

        BotaoExcluirPerfil.setBackground(new java.awt.Color(77, 255, 148));
        BotaoExcluirPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotaoExcluirPerfil.setText("Excluir conta");
        BotaoExcluirPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TxtNomePerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endereçoPerfil)
                            .addComponent(TxtEnderecoPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NomePerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CpfPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TxtCpfPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(71, 71, 71))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DataNascimentoPerfil)
                                            .addComponent(TxtDataNascimentoPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TxtSexoPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(sexoPerfil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailPerfil)
                            .addComponent(endereçoPerfil1)
                            .addComponent(TxtEmailPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCelularPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BotaoAlterarDados, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(BotaoSairPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoExcluirPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(endereçoPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtEnderecoPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NomePerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNomePerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(endereçoPerfil1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCelularPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DataNascimentoPerfil)
                            .addComponent(emailPerfil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtDataNascimentoPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEmailPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(sexoPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtSexoPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CpfPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCpfPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoAlterarDados)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoExcluirPerfil)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoSairPerfil)
                        .addGap(116, 116, 116))))
        );

        TxtPerfilUsuario.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        TxtPerfilUsuario.setText("Meu Perfil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(TxtPerfilUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TxtPerfilUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarDadosActionPerformed
        String email = TxtEmailPerfilUsuario.getText();
        try 
        {
            String usuario;
        
            usuario = TxtNomePerfilUsuario.getText();
            
            
            Usuarios objUsuario = new Usuarios();
            objUsuario.setNome(usuario);
            
            
            UsuariosBD objUsuarioBD = new UsuariosBD();
            ResultSet resul = objUsuarioBD.PedirDadosUsuario(objUsuario);
            
            if (resul.next()) 
            {
                
                 //objUsuario.setEmail(usuario);
                String emailAutenticado = resul.getString("Email");
                String nome = resul.getString("Nome");
                String cpf = resul.getString("CPF");
                String endereco = resul.getString("Endereco");
                String celular = resul.getString("Celular");
                String nascimento = resul.getString("DataNascimento");
                String sexo = resul.getString("Sexo");
                String senha = resul.getString("Senha");
                int id = resul.getInt("ID");
                
                AlterarCadastroUsuario.setId(id);
                AlterarCadastroUsuario.setNomeText(nome);
                AlterarCadastroUsuario.setCpfText(cpf);
                AlterarCadastroUsuario.setEnderecoText(endereco);
                AlterarCadastroUsuario.setCelularText(celular);
                AlterarCadastroUsuario.setNascimentoText(nascimento);
                AlterarCadastroUsuario.setEmailText(emailAutenticado);
                AlterarCadastroUsuario.setSexoText(sexo);
                AlterarCadastroUsuario.setSenhaText(senha);
                AlterarCadastroUsuario.setVisible(true);
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
        
        
    }//GEN-LAST:event_BotaoAlterarDadosActionPerformed

    private void BotaoSairPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairPerfilActionPerformed
        
        this.dispose();
        TelaPrincipal = new TelaPrincipal();
        
        String nome = TxtNomePerfilUsuario.getText();
        TelaPrincipal.setNomeText(nome);
        TelaPrincipal.setVisible(true);
    }//GEN-LAST:event_BotaoSairPerfilActionPerformed

    private void TxtNomePerfilUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomePerfilUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomePerfilUsuarioActionPerformed

    private void BotaoExcluirPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirPerfilActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir a conta?");
            
            
            
            if (resposta == JOptionPane.YES_OPTION) {
            RemoverUsuario();
            JOptionPane.showMessageDialog(null, "Usuário Removido");
            System.exit(0);
        } else if (resposta == JOptionPane.NO_OPTION) {
            
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        } else {
            
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
    }//GEN-LAST:event_BotaoExcluirPerfilActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterarDados;
    private javax.swing.JButton BotaoExcluirPerfil;
    private javax.swing.JButton BotaoSairPerfil;
    private javax.swing.JLabel CpfPerfil;
    private javax.swing.JLabel DataNascimentoPerfil;
    private javax.swing.JLabel NomePerfil;
    private javax.swing.JTextField TxtCelularPerfilUsuario;
    private javax.swing.JTextField TxtCpfPerfilUsuario;
    private javax.swing.JTextField TxtDataNascimentoPerfilUsuario;
    private javax.swing.JTextField TxtEmailPerfilUsuario;
    private javax.swing.JTextField TxtEnderecoPerfilUsuario;
    private javax.swing.JTextField TxtNomePerfilUsuario;
    private javax.swing.JLabel TxtPerfilUsuario;
    private javax.swing.JTextField TxtSexoPerfilUsuario;
    private javax.swing.JLabel emailPerfil;
    private javax.swing.JLabel endereçoPerfil;
    private javax.swing.JLabel endereçoPerfil1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel sexoPerfil;
    // End of variables declaration//GEN-END:variables


    private void RemoverUsuario(){
        String sql = "DELETE from usuarios WHERE Nome = ?";
        connection = Conexao.getInstance().getConnection();
        PreparedStatement stmt = null;
        try {
            
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, TxtNomePerfilUsuario.getText());
            stmt.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    
    }




}
