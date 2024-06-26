package projetofinal;

import Dados.centroDeAdoção;
import Banco.CentroAdoçãoBD;
import Banco.Conexao;
import Banco.DoadoresBD;
import Banco.UsuariosBD;
import Dados.Doadores;
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
public class TelaPrincipalPerfilDoadores extends javax.swing.JFrame {

    public TelaCadastroPets TelaCadastroPets;
    private centroDeAdoção centroDeAdoção;
    private CentroAdoçãoBD CentroAdoçãoBD;
    private AlterarCadastroDoador AlterarCadastroDoador;
    private telaEspeciePet telaEspeciePet;
    private telaEspeciePetDoador telaEspeciePetDoador;
    private TelaLogin TelaLogin;
    private ExcluirPets ExcluirPets;
    
 Connection connection = Conexao.getInstance().getConnection();
    
    
            
    public TelaPrincipalPerfilDoadores() {
        initComponents();
        
        TelaCadastroPets = new TelaCadastroPets();
        centroDeAdoção = new centroDeAdoção();
        CentroAdoçãoBD = new CentroAdoçãoBD();
        AlterarCadastroDoador = new AlterarCadastroDoador();
        telaEspeciePet = new telaEspeciePet();
        telaEspeciePetDoador = new telaEspeciePetDoador();
        
      
    }
    
    public void setEmailText(String email) {
        TxtEmailPerfil.setText(email);
    }
    public void setNomeText(String nome) {
        TxtNomePerfil.setText(nome);
    }
    public void setCnpjText (String cpf){
        TxtCpfPerfil.setText(cpf);
    }
    public void setEnderecoText(String endereco){
        TxtEndereçoPerfil.setText(endereco);
    }
    public void setCelularText(String celular){
        TxtCelularPerfil.setText(celular);
    }
    public void setInstagramText(String instagram){
        TxtInstagramPerfil.setText(instagram);
    }
    public void setSexoText(String sexo){
        TxtNomePerfil1.setText(sexo);
    }
    public void setNascimentoText(String nascimento){
        TxtDataNascimentoPerfil.setText(nascimento);
    }
    public void setInstagramDodaor(String instagram){
        TxtInstagramPerfil.setText(instagram);
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
        TxtNomePerfil = new javax.swing.JTextField();
        CpfPerfil = new javax.swing.JLabel();
        TxtCpfPerfil = new javax.swing.JTextField();
        DataNascimentoPerfil = new javax.swing.JLabel();
        TxtDataNascimentoPerfil = new javax.swing.JTextField();
        sexoPerfil = new javax.swing.JLabel();
        TxtNomePerfil1 = new javax.swing.JTextField();
        endereçoPerfil = new javax.swing.JLabel();
        TxtEndereçoPerfil = new javax.swing.JTextField();
        endereçoPerfil1 = new javax.swing.JLabel();
        TxtCelularPerfil = new javax.swing.JTextField();
        instagramPerfil = new javax.swing.JLabel();
        TxtInstagramPerfil = new javax.swing.JTextField();
        emailPerfil = new javax.swing.JLabel();
        TxtEmailPerfil = new javax.swing.JTextField();
        BotaoCadastrarPets = new javax.swing.JButton();
        BotaoAlterarDados = new javax.swing.JButton();
        BotaoSairPerfil = new javax.swing.JButton();
        BotaoExcluirPerfil = new javax.swing.JButton();
        BotaoExcluirPets = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(77, 255, 148));
        jPanel1.setForeground(new java.awt.Color(77, 255, 148));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        NomePerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        NomePerfil.setText("Nome");

        TxtNomePerfil.setEditable(false);
        TxtNomePerfil.setBackground(new java.awt.Color(204, 204, 204));
        TxtNomePerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TxtNomePerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomePerfilActionPerformed(evt);
            }
        });

        CpfPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CpfPerfil.setText("CPF");

        TxtCpfPerfil.setEditable(false);
        TxtCpfPerfil.setBackground(new java.awt.Color(204, 204, 204));
        TxtCpfPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        DataNascimentoPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DataNascimentoPerfil.setText("Data de Nascimento");

        TxtDataNascimentoPerfil.setEditable(false);
        TxtDataNascimentoPerfil.setBackground(new java.awt.Color(204, 204, 204));
        TxtDataNascimentoPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        sexoPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sexoPerfil.setText("Sexo");

        TxtNomePerfil1.setEditable(false);
        TxtNomePerfil1.setBackground(new java.awt.Color(204, 204, 204));
        TxtNomePerfil1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        endereçoPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        endereçoPerfil.setText("Endereço");

        TxtEndereçoPerfil.setEditable(false);
        TxtEndereçoPerfil.setBackground(new java.awt.Color(204, 204, 204));
        TxtEndereçoPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        endereçoPerfil1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        endereçoPerfil1.setText("Celular");

        TxtCelularPerfil.setEditable(false);
        TxtCelularPerfil.setBackground(new java.awt.Color(204, 204, 204));
        TxtCelularPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        instagramPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        instagramPerfil.setText("Instagram");

        TxtInstagramPerfil.setEditable(false);
        TxtInstagramPerfil.setBackground(new java.awt.Color(204, 204, 204));
        TxtInstagramPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TxtInstagramPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtInstagramPerfilActionPerformed(evt);
            }
        });

        emailPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        emailPerfil.setText("Email");

        TxtEmailPerfil.setEditable(false);
        TxtEmailPerfil.setBackground(new java.awt.Color(204, 204, 204));
        TxtEmailPerfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        BotaoCadastrarPets.setBackground(new java.awt.Color(77, 255, 148));
        BotaoCadastrarPets.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotaoCadastrarPets.setText("Cadastrar Pets");
        BotaoCadastrarPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarPetsActionPerformed(evt);
            }
        });

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

        BotaoExcluirPets.setBackground(new java.awt.Color(77, 255, 148));
        BotaoExcluirPets.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotaoExcluirPets.setText("Excluir Pets");
        BotaoExcluirPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirPetsActionPerformed(evt);
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
                        .addComponent(TxtNomePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endereçoPerfil)
                            .addComponent(TxtEndereçoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(NomePerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(111, 111, 111))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCpfPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtNomePerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtDataNascimentoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DataNascimentoPerfil)
                                    .addComponent(CpfPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sexoPerfil))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailPerfil)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtInstagramPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(TxtEmailPerfil, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(endereçoPerfil1)
                            .addComponent(instagramPerfil)
                            .addComponent(TxtCelularPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BotaoCadastrarPets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotaoAlterarDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(BotaoExcluirPets, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotaoExcluirPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoSairPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(TxtEndereçoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NomePerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNomePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endereçoPerfil1)
                            .addComponent(CpfPerfil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCelularPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCpfPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoCadastrarPets)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailPerfil)
                            .addComponent(sexoPerfil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtEmailPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNomePerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instagramPerfil)
                            .addComponent(DataNascimentoPerfil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtInstagramPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDataNascimentoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BotaoAlterarDados)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoExcluirPets)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoExcluirPerfil)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoSairPerfil)))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setText("Perfil Doadores");

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
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
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

    private void BotaoCadastrarPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarPetsActionPerformed
        telaEspeciePetDoador.LimparBox();
        
        String nome, contato;
        nome = TxtEmailPerfil.getText();
        contato = TxtCelularPerfil.getText();
        
        telaEspeciePetDoador.setnome(nome);
        telaEspeciePetDoador.setcontato(contato);
       
       
        telaEspeciePetDoador.setVisible(true);
    }//GEN-LAST:event_BotaoCadastrarPetsActionPerformed
        
    private void BotaoAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarDadosActionPerformed
    try 
        {
            String usuario;
        
            usuario = TxtEmailPerfil.getText();
            
            
            Doadores objDoador = new Doadores();
            objDoador.setEmail(usuario);
            
            
            DoadoresBD objDoadorBD = new DoadoresBD();
            ResultSet resul = objDoadorBD.PedirDadosDoadores(objDoador);
            
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
                String instagram = resul.getString("Instagram");
                
                AlterarCadastroDoador.setId(id);
                AlterarCadastroDoador.setNomeText(nome);
                AlterarCadastroDoador.setCpfText(cpf);
                AlterarCadastroDoador.setEnderecoText(endereco);
                AlterarCadastroDoador.setCelularText(celular);
                AlterarCadastroDoador.setNascimentoText(nascimento);
                AlterarCadastroDoador.setEmailText(emailAutenticado);
                AlterarCadastroDoador.setSexoText(sexo);
                AlterarCadastroDoador.setSenhaText(senha);
                AlterarCadastroDoador.setInstagram(instagram);
                AlterarCadastroDoador.setVisible(true);
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
        TelaLogin = new TelaLogin();
        TelaLogin.setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_BotaoSairPerfilActionPerformed

    private void TxtNomePerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomePerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomePerfilActionPerformed

    private void TxtInstagramPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtInstagramPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtInstagramPerfilActionPerformed

    private void BotaoExcluirPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirPerfilActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir a conta?");
            
            
            
            if (resposta == JOptionPane.YES_OPTION) {
            RemoverDoador();
            JOptionPane.showMessageDialog(null, "Doador Removido");
            System.exit(0);
        } else if (resposta == JOptionPane.NO_OPTION) {
            
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        } else {
            
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
    }//GEN-LAST:event_BotaoExcluirPerfilActionPerformed

    private void BotaoExcluirPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirPetsActionPerformed
        ExcluirPets = new ExcluirPets();
        
        try 
        {
            String usuario;
        
            usuario = TxtEmailPerfil.getText();
            
            
            Doadores objDoador = new Doadores();
            objDoador.setEmail(usuario);
            
            
            DoadoresBD objDoadorBD = new DoadoresBD();
            ResultSet resul = objDoadorBD.PedirDadosDoadores(objDoador);
            if (resul.next()) 
            {
                
                
                String nome = resul.getString("Email");
                ExcluirPets.setNomeText(nome);
                ExcluirPets.setVisible(true);
                  
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Email ou Senha inválida");
                
            }
            
            
            
             } 
        catch (Exception erro) 
        {
            JOptionPane.showMessageDialog(null, "LOGIN" + erro);
        }    
        
    
    }//GEN-LAST:event_BotaoExcluirPetsActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterarDados;
    private javax.swing.JButton BotaoCadastrarPets;
    private javax.swing.JButton BotaoExcluirPerfil;
    private javax.swing.JButton BotaoExcluirPets;
    private javax.swing.JButton BotaoSairPerfil;
    private javax.swing.JLabel CpfPerfil;
    private javax.swing.JLabel DataNascimentoPerfil;
    private javax.swing.JLabel NomePerfil;
    private javax.swing.JTextField TxtCelularPerfil;
    private javax.swing.JTextField TxtCpfPerfil;
    private javax.swing.JTextField TxtDataNascimentoPerfil;
    private javax.swing.JTextField TxtEmailPerfil;
    private javax.swing.JTextField TxtEndereçoPerfil;
    private javax.swing.JTextField TxtInstagramPerfil;
    private javax.swing.JTextField TxtNomePerfil;
    private javax.swing.JTextField TxtNomePerfil1;
    private javax.swing.JLabel emailPerfil;
    private javax.swing.JLabel endereçoPerfil;
    private javax.swing.JLabel endereçoPerfil1;
    private javax.swing.JLabel instagramPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel sexoPerfil;
    // End of variables declaration//GEN-END:variables

private void RemoverDoador(){
        String sql = "DELETE from doadores WHERE Nome = ?";
        connection = Conexao.getInstance().getConnection();
        PreparedStatement stmt = null;
        try {
            
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, TxtNomePerfil.getText());
            stmt.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }    

}
