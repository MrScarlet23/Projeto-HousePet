
package projetofinal;

import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Toolkit;
import java.text.ParseException;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Dados.centroDeAdoção;
import Banco.CentroAdoçãoBD;
import Dados.Doadores;
import Banco.DoadoresBD;
import Dados.Usuarios;
import Banco.UsuariosBD;
import Banco.Conexao;
import java.sql.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 *
 * @author bubu_ e Samuhel
 */
public class TelaCadastro extends javax.swing.JFrame {

    private centroDeAdoção centro;
    private CentroAdoçãoBD centroBD;
   
    public TelaCadastro() {
        initComponents();
        
        centro = new centroDeAdoção();
        centroBD = new CentroAdoçãoBD();
    }
    
    

    private void limparCamposCadastro()
        {
            TxtCadastroNomeDoador.setText("");
            TxtCadastroCpfDoador.setText("");
            TxtCadastroCelularDoador.setText("");
            TxtCadastroNascimentoDoador.setText("");
            campoSexoDoador.setSelectedIndex(0);
            TxtCadastroEmailDoador.setText("");
            TxtCadastroNomeCentro.setText("");
            TxtCadastroCnpjCentro.setText("");
            TxtCadastroTelefoneCentro.setText("");
            TxtCadastroEmailCentro.setText("");
            TxtCadastroNomeUsuario.setText("");
            TxtCadastroCpfUsuario.setText("");
            TxtCadastroCelularUsuario.setText("");
            TxtCadastroNascimentoUsuario.setText("");
            campoSexoUsuario.setSelectedIndex(0);
            TxtCadastroEmailUsuario.setText("");
            TxtCadastroEnderecoDoador.setText("");
            TxtCadastroInstagramDoador.setText("");
            TxtCadastroSenhaCentro.setText("");
            TxtCadastroSenhaDoador.setText("");
            TxtCadastroInstagramCentro.setText("");
            TxtCadastroEnderecoUsuario.setText("");
            TxtCadastroEnderecoCentro1.setText("");
            
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaCadastro = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        NomeDoador = new javax.swing.JLabel();
        CpfDoador = new javax.swing.JLabel();
        TxtCadastroCpfDoador = new javax.swing.JFormattedTextField();
        CelularDoador = new javax.swing.JLabel();
        TxtCadastroCelularDoador = new javax.swing.JFormattedTextField();
        TxtCadastroNomeDoador = new javax.swing.JTextField();
        DataNascimentoDoador = new javax.swing.JLabel();
        TxtCadastroNascimentoDoador = new javax.swing.JFormattedTextField();
        SexoDoador = new javax.swing.JLabel();
        campoSexoDoador = new javax.swing.JComboBox<>();
        EmailDoador = new javax.swing.JLabel();
        TxtCadastroEmailDoador = new javax.swing.JTextField();
        BotaoCadastrarDoador = new javax.swing.JButton();
        EnderecoDoador = new javax.swing.JLabel();
        TxtCadastroEnderecoDoador = new javax.swing.JTextField();
        InstagramDoador = new javax.swing.JLabel();
        TxtCadastroInstagramDoador = new javax.swing.JTextField();
        TxtCadastroSenhaDoador = new javax.swing.JTextField();
        SenhaCentro1 = new javax.swing.JLabel();
        campoTipoEmailDoador = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        NomeCentro = new javax.swing.JLabel();
        CpfDoador1 = new javax.swing.JLabel();
        TxtCadastroCnpjCentro = new javax.swing.JFormattedTextField();
        TxtCadastroNomeCentro = new javax.swing.JTextField();
        EmailCentro = new javax.swing.JLabel();
        TxtCadastroEmailCentro = new javax.swing.JTextField();
        BotaoCadastrarCentro = new javax.swing.JButton();
        TelefoneCentro = new javax.swing.JLabel();
        TxtCadastroTelefoneCentro = new javax.swing.JFormattedTextField();
        EnderecoCentro = new javax.swing.JLabel();
        TxtCadastroInstagramCentro = new javax.swing.JTextField();
        InstagramCentro = new javax.swing.JLabel();
        TxtCadastroSenhaCentro = new javax.swing.JTextField();
        SenhaCentro = new javax.swing.JLabel();
        TxtCadastroEnderecoCentro1 = new javax.swing.JTextField();
        campoTipoEmailCentro = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        NomeUsuário = new javax.swing.JLabel();
        CpfUsuario = new javax.swing.JLabel();
        TxtCadastroCpfUsuario = new javax.swing.JFormattedTextField();
        CelularUsuario = new javax.swing.JLabel();
        TxtCadastroCelularUsuario = new javax.swing.JFormattedTextField();
        TxtCadastroNomeUsuario = new javax.swing.JTextField();
        EmailUsuario = new javax.swing.JLabel();
        TxtCadastroEmailUsuario = new javax.swing.JTextField();
        BotaoCadastrarUsuario = new javax.swing.JButton();
        SexoUsuario = new javax.swing.JLabel();
        campoSexoUsuario = new javax.swing.JComboBox<>();
        DataNascimentoUsuario = new javax.swing.JLabel();
        TxtCadastroNascimentoUsuario = new javax.swing.JFormattedTextField();
        DataNascimentoUsuario1 = new javax.swing.JLabel();
        TxtCadastroEnderecoUsuario = new javax.swing.JTextField();
        TxtCadastroSenhaUsuario = new javax.swing.JTextField();
        SenhaCentro2 = new javax.swing.JLabel();
        campoTipoEmail = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        TelaCadastro.setName(""); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar como doador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        NomeDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NomeDoador.setText("Nome* (pelo menos 8 caracteres)");

        CpfDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CpfDoador.setText("CPF*");

        try {
            TxtCadastroCpfDoador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        CelularDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CelularDoador.setText("Celular*");

        try {
            TxtCadastroCelularDoador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        DataNascimentoDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DataNascimentoDoador.setText("Data de nascimento*");

        try {
            TxtCadastroNascimentoDoador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        SexoDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SexoDoador.setText("Sexo*");

        campoSexoDoador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Masculino", "Feminino", "Indefinido", "Não selecionar" }));

        EmailDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EmailDoador.setText("Email*");

        BotaoCadastrarDoador.setText("Cadastrar");
        BotaoCadastrarDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarDoadorActionPerformed(evt);
            }
        });

        EnderecoDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EnderecoDoador.setText("Endereço*");

        InstagramDoador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        InstagramDoador.setText("instagram");

        TxtCadastroSenhaDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCadastroSenhaDoadorActionPerformed(evt);
            }
        });

        SenhaCentro1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SenhaCentro1.setText("Senha (entre 6 e 10 letras ou numeros)");

        campoTipoEmailDoador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@fatec.sp.gov.br", "@gmail.com", "@outlook.com", "@hotmail.com", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CpfDoador)
                    .addComponent(TxtCadastroCpfDoador)
                    .addComponent(CelularDoador)
                    .addComponent(TxtCadastroCelularDoador, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(TxtCadastroNomeDoador)
                    .addComponent(NomeDoador))
                .addGap(103, 103, 103)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TxtCadastroEmailDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoCadastrarDoador))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtCadastroNascimentoDoador, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoSexoDoador, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(238, 238, 238)
                        .addComponent(TxtCadastroEnderecoDoador))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(DataNascimentoDoador)
                                .addGap(213, 213, 213)
                                .addComponent(EnderecoDoador))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(SexoDoador)
                                .addGap(315, 315, 315)
                                .addComponent(InstagramDoador))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailDoador)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(campoTipoEmailDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCadastroSenhaDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SenhaCentro1)
                                    .addComponent(TxtCadastroInstagramDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeDoador)
                    .addComponent(DataNascimentoDoador)
                    .addComponent(EnderecoDoador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCadastroNomeDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCadastroNascimentoDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCadastroEnderecoDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpfDoador)
                    .addComponent(SexoDoador)
                    .addComponent(InstagramDoador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCadastroCpfDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoSexoDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCadastroInstagramDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CelularDoador)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EmailDoador)
                        .addComponent(SenhaCentro1)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCadastroCelularDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCadastroEmailDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCadastroSenhaDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTipoEmailDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoCadastrarDoador)))
                .addGap(14, 14, 14))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar como centro de adoção", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        NomeCentro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NomeCentro.setText("Nome Fantasia*");

        CpfDoador1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CpfDoador1.setText("CNPJ*");

        try {
            TxtCadastroCnpjCentro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        EmailCentro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EmailCentro.setText("Email*");

        TxtCadastroEmailCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCadastroEmailCentroActionPerformed(evt);
            }
        });

        BotaoCadastrarCentro.setText("Cadastrar");
        BotaoCadastrarCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarCentroActionPerformed(evt);
            }
        });

        TelefoneCentro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TelefoneCentro.setText("Celular*");

        try {
            TxtCadastroTelefoneCentro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtCadastroTelefoneCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCadastroTelefoneCentroActionPerformed(evt);
            }
        });

        EnderecoCentro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EnderecoCentro.setText("Endereço*");

        InstagramCentro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        InstagramCentro.setText("Instagram");

        TxtCadastroSenhaCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCadastroSenhaCentroActionPerformed(evt);
            }
        });

        SenhaCentro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SenhaCentro.setText("Senha (entre 6 e 10 letras ou numeros)");

        TxtCadastroEnderecoCentro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCadastroEnderecoCentro1ActionPerformed(evt);
            }
        });

        campoTipoEmailCentro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@fatec.sp.gov.br", "@gmail.com", "@outlook.com", "@hotmail.com", " " }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCadastroNomeCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeCentro))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(EnderecoCentro)
                                .addGap(0, 326, Short.MAX_VALUE))
                            .addComponent(TxtCadastroEnderecoCentro1))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCadastroSenhaCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SenhaCentro))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TxtCadastroCnpjCentro, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addComponent(CpfDoador1))
                            .addComponent(TxtCadastroTelefoneCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefoneCentro))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(TxtCadastroEmailCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTipoEmailCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotaoCadastrarCentro))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EmailCentro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InstagramCentro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCadastroInstagramCentro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeCentro)
                    .addComponent(EnderecoCentro)
                    .addComponent(SenhaCentro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCadastroNomeCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCadastroSenhaCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCadastroEnderecoCentro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CpfDoador1)
                            .addComponent(InstagramCentro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCadastroCnpjCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCadastroInstagramCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailCentro)
                            .addComponent(TelefoneCentro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCadastroEmailCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCadastroTelefoneCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTipoEmailCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotaoCadastrarCentro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar como usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        NomeUsuário.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NomeUsuário.setText("Nome e sobrenome*");

        CpfUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CpfUsuario.setText("CPF*");

        try {
            TxtCadastroCpfUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        CelularUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CelularUsuario.setText("Celular*");

        try {
            TxtCadastroCelularUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        EmailUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EmailUsuario.setText("Email*");

        BotaoCadastrarUsuario.setText("Cadastrar");
        BotaoCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarUsuarioActionPerformed(evt);
            }
        });

        SexoUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SexoUsuario.setText("Sexo*");

        campoSexoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Masculino", "Feminino", "Indefinido", "Não selecionar" }));

        DataNascimentoUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DataNascimentoUsuario.setText("Data de nascimento*");

        try {
            TxtCadastroNascimentoUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        DataNascimentoUsuario1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DataNascimentoUsuario1.setText("Endereço*");

        TxtCadastroSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCadastroSenhaUsuarioActionPerformed(evt);
            }
        });

        SenhaCentro2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SenhaCentro2.setText("Senha (entre 6 e 10 letras ou numeros)");

        campoTipoEmail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@fatec.sp.gov.br", "@gmail.com", "@outlook.com", "@hotmail.com", " " }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtCadastroCpfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(CelularUsuario)
                    .addComponent(TxtCadastroCelularUsuario)
                    .addComponent(TxtCadastroNomeUsuario)
                    .addComponent(CpfUsuario)
                    .addComponent(NomeUsuário))
                .addGap(103, 103, 103)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(TxtCadastroEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTipoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoCadastrarUsuario))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailUsuario)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(DataNascimentoUsuario)
                                .addGap(219, 219, 219)
                                .addComponent(DataNascimentoUsuario1))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCadastroNascimentoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SexoUsuario)
                                    .addComponent(campoSexoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(250, 250, 250)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCadastroSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SenhaCentro2)
                                    .addComponent(TxtCadastroEnderecoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 99, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(NomeUsuário)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCadastroNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DataNascimentoUsuario)
                                    .addComponent(DataNascimentoUsuario1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtCadastroNascimentoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCadastroEnderecoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(CpfUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCadastroCpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(SexoUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoSexoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(SenhaCentro2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCadastroSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CelularUsuario)
                    .addComponent(EmailUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCadastroCelularUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCadastroEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTipoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoCadastrarUsuario)
                .addContainerGap())
        );

        javax.swing.GroupLayout TelaCadastroLayout = new javax.swing.GroupLayout(TelaCadastro);
        TelaCadastro.setLayout(TelaCadastroLayout);
        TelaCadastroLayout.setHorizontalGroup(
            TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TelaCadastroLayout.setVerticalGroup(
            TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarDoadorActionPerformed
        
        try 
        {
            String email, emailatutenticado;
          
        
            
            email = TxtCadastroEmailDoador.getText() + campoTipoEmailDoador.getSelectedItem().toString();
            
            
            Doadores objUsuario = new Doadores();
            objUsuario.setEmail(email);
            System.out.printf("%s", email);
          
            
            DoadoresBD objUsuarioBD = new DoadoresBD();
            ResultSet resul = objUsuarioBD.VerificarCadastroEmail(objUsuario);
            
            if (resul.next()) 
            {
                emailatutenticado = resul.getString("Email");
                JOptionPane.showMessageDialog(null, "Email já cadastrado");
      
            }
            else
            {   
                if(TxtCadastroNomeDoador.getText().isEmpty() || TxtCadastroCpfDoador.getText().isEmpty() || TxtCadastroCelularDoador.getText().isEmpty() 
                || TxtCadastroNascimentoDoador.getText().isEmpty() || TxtCadastroEmailDoador.getText().isEmpty() || TxtCadastroEnderecoDoador.getText().isEmpty() 
                || TxtCadastroSenhaDoador.getText().isEmpty()) 
                {
                    JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!");
                }
                else if(TxtCadastroNomeDoador.getText().length() < 8 || TxtCadastroNomeDoador.getText().length() > 30 
                || !TxtCadastroNomeDoador.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ\\s]+"))
                {
                    JOptionPane.showMessageDialog(null, "nome inválido");
                }
                else if(TxtCadastroEnderecoDoador.getText().length() < 10 || !TxtCadastroEnderecoDoador.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ,\\s0-9]+"))
                {
                JOptionPane.showMessageDialog(null, "Endereco inválido");
                }
                else if(campoSexoDoador.getSelectedItem().toString().equals("Selecionar"))
                {
                    JOptionPane.showMessageDialog(null, "Sexo inválido");
                }
                else if(TxtCadastroSenhaDoador.getText().length() > 15 || TxtCadastroSenhaDoador.getText().length() < 6 || !TxtCadastroSenhaDoador.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ0-9]+"))
                {
                    JOptionPane.showMessageDialog(null, "senha inválida");
                }
                else if(TxtCadastroEmailDoador.getText().contains("@"))
                {
                    JOptionPane.showMessageDialog(null, "Email inválido"); 
                }
                else
                {
            
            Doadores doador = new Doadores();
            doador.setNome(TxtCadastroNomeDoador.getText());
            doador.setCpf(TxtCadastroCpfDoador.getText());
            doador.setCelular(TxtCadastroCelularDoador.getText());
            doador.setData(TxtCadastroNascimentoDoador.getText());
            doador.setSexo(campoSexoDoador.getSelectedItem().toString());
            doador.setEmail(TxtCadastroEmailDoador.getText()  + campoTipoEmailDoador.getSelectedItem().toString());
            doador.setEndereco(TxtCadastroEnderecoDoador.getText());
            doador.setInstagram(TxtCadastroInstagramDoador.getText());
            doador.setSenha(TxtCadastroSenhaDoador.getText());
            DoadoresBD usu = new DoadoresBD();
            usu.inserirDoadores(doador);
            
            
            JOptionPane.showMessageDialog(null, "Dados Cadastrados");
            JOptionPane.showMessageDialog(null, "Retornar para tela de login");
            limparCamposCadastro();
            this.dispose();
        }
            }
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "LOGIN" + erro);
        }
        
        
        
        
        
        
        
       
    }//GEN-LAST:event_BotaoCadastrarDoadorActionPerformed

    
    
    
    
    private void BotaoCadastrarCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarCentroActionPerformed

        
        try 
        {
            String email, emailatutenticado;
          
        
            
            email = TxtCadastroEmailCentro.getText() + campoTipoEmailCentro.getSelectedItem().toString();
            
            
            centroDeAdoção objUsuario = new centroDeAdoção();
            objUsuario.setEmail(email);
            System.out.printf("%s", email);
          
            
            CentroAdoçãoBD objUsuarioBD = new CentroAdoçãoBD();
            ResultSet resul = objUsuarioBD.VerificarCadastroEmail(objUsuario);
            
            if (resul.next()) 
            {
                emailatutenticado = resul.getString("Email");
                JOptionPane.showMessageDialog(null, "Email já cadastrado");
      
            }
            else
            {
                if(TxtCadastroNomeCentro.getText().isEmpty() || TxtCadastroCnpjCentro.getText().isEmpty() 
       || TxtCadastroTelefoneCentro.getText().isEmpty() || TxtCadastroEmailCentro.getText().isEmpty() 
       || TxtCadastroEnderecoCentro1.getText().isEmpty() || TxtCadastroSenhaCentro.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!");
        }
        else if(TxtCadastroNomeCentro.getText().length() < 8 || TxtCadastroNomeCentro.getText().length() > 30 
        || !TxtCadastroNomeCentro.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ\\s]+"))
        {
            JOptionPane.showMessageDialog(null, "nome inválido");
        }
        else if(TxtCadastroEnderecoCentro1.getText().length() < 10 || !TxtCadastroEnderecoCentro1.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ,\\s0-9]+"))
        {
           JOptionPane.showMessageDialog(null, "Endereco inválido");
        }
        else if(TxtCadastroSenhaCentro.getText().length() > 15 || TxtCadastroSenhaCentro.getText().length() < 6 || !TxtCadastroSenhaCentro.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ0-9]+"))
        {
            JOptionPane.showMessageDialog(null, "senha inválida");
        }
        else if(TxtCadastroEmailCentro.getText().contains("@"))
        {
            JOptionPane.showMessageDialog(null, "Email inválido"); 
        }
        else
        {
            centroDeAdoção centro = new centroDeAdoção();
            centro.setNomeFantasia(TxtCadastroNomeCentro.getText());
            centro.setCnpj(TxtCadastroCnpjCentro.getText());
            centro.setCelular(TxtCadastroTelefoneCentro.getText());
            centro.setEmail(TxtCadastroEmailCentro.getText()  + campoTipoEmailCentro.getSelectedItem().toString()); 
            centro.setEndereco(TxtCadastroEnderecoCentro1.getText());
            centro.setInstagram(TxtCadastroInstagramCentro.getText());
            centro.setSenha(TxtCadastroSenhaCentro.getText());   
            CentroAdoçãoBD usuario = new CentroAdoçãoBD();
            usuario.inserircentroDeAdoção(centro);
            
            JOptionPane.showMessageDialog(null, "Dados Cadastrados");
            JOptionPane.showMessageDialog(null, "Retornar para tela de login");
            limparCamposCadastro();
            this.dispose();       
        }
            }
            } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "LOGIN" + erro);
        }
            
        
        
       
       
        

    }//GEN-LAST:event_BotaoCadastrarCentroActionPerformed

    private void BotaoCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarUsuarioActionPerformed
        try 
        {
            String email, emailatutenticado;
          
        
            
            email = TxtCadastroEmailUsuario.getText() + campoTipoEmail.getSelectedItem().toString();
            
            
            Usuarios objUsuario = new Usuarios();
            objUsuario.setEmail(email);
            System.out.printf("%s", email);
          
            
            UsuariosBD objUsuarioBD = new UsuariosBD();
            ResultSet resul = objUsuarioBD.VerificarCadastroEmail(objUsuario);
            
            if (resul.next()) 
            {
                emailatutenticado = resul.getString("Email");
                JOptionPane.showMessageDialog(null, "Email já cadastrado");
      
            }
            else
            {
                
                if(TxtCadastroNomeUsuario.getText().isEmpty() || TxtCadastroCpfUsuario.getText().isEmpty() 
        || TxtCadastroCelularUsuario.getText().isEmpty() || TxtCadastroNascimentoUsuario.getText().isEmpty() 
        || TxtCadastroSenhaUsuario.getText().isEmpty() || TxtCadastroEmailUsuario.getText().isEmpty()
        || TxtCadastroEnderecoUsuario.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!");
        }
        else if(TxtCadastroNomeUsuario.getText().length() < 8 || TxtCadastroNomeUsuario.getText().length() > 30 
        || !TxtCadastroNomeUsuario.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ\\s]+"))
        {
            JOptionPane.showMessageDialog(null, "nome inválido");
        }
        else if(TxtCadastroEnderecoUsuario.getText().length() < 10 || !TxtCadastroEnderecoUsuario.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ,\\s0-9]+"))
        {
            JOptionPane.showMessageDialog(null, "Endereco inválido");
        }
        else if(campoSexoUsuario.getSelectedItem().toString().equals("Selecionar"))
        {
            JOptionPane.showMessageDialog(null, "Sexo inválido");
        }
        else if(TxtCadastroSenhaUsuario.getText().length() > 15 || TxtCadastroSenhaUsuario.getText().length() < 6 || !TxtCadastroSenhaUsuario.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ0-9]+"))
        {
            JOptionPane.showMessageDialog(null, "senha inválida");
        }
        else if(TxtCadastroEmailUsuario.getText().contains("@"))
        {
            JOptionPane.showMessageDialog(null, "Email inválido"); 
        }
        else
        {
            
            Usuarios usuario = new Usuarios();
            usuario.setNome(TxtCadastroNomeUsuario.getText());
            usuario.setCpf(TxtCadastroCpfUsuario.getText());
            usuario.setCelular(TxtCadastroCelularUsuario.getText());
            usuario.setData(TxtCadastroNascimentoUsuario.getText());
            usuario.setSexo(campoSexoUsuario.getSelectedItem().toString());
            usuario.setEmail(TxtCadastroEmailUsuario.getText() + campoTipoEmail.getSelectedItem().toString());
            usuario.setEndereco(TxtCadastroEnderecoUsuario.getText());
            usuario.setSenha(TxtCadastroSenhaUsuario.getText());
            UsuariosBD usua = new UsuariosBD();
            usua.inserirUsuarios(usuario);
            
            JOptionPane.showMessageDialog(null, "Dados Cadastrados");
            JOptionPane.showMessageDialog(null, "Retornar para tela de login");
            limparCamposCadastro();
            this.dispose();
        }
                
                
            }
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "LOGIN" + erro);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_BotaoCadastrarUsuarioActionPerformed

    private void TxtCadastroSenhaCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCadastroSenhaCentroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCadastroSenhaCentroActionPerformed

    private void TxtCadastroEnderecoCentro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCadastroEnderecoCentro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCadastroEnderecoCentro1ActionPerformed

    private void TxtCadastroTelefoneCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCadastroTelefoneCentroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCadastroTelefoneCentroActionPerformed

    private void TxtCadastroSenhaDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCadastroSenhaDoadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCadastroSenhaDoadorActionPerformed

    private void TxtCadastroSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCadastroSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCadastroSenhaUsuarioActionPerformed

    private void TxtCadastroEmailCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCadastroEmailCentroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCadastroEmailCentroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrarCentro;
    private javax.swing.JButton BotaoCadastrarDoador;
    private javax.swing.JButton BotaoCadastrarUsuario;
    private javax.swing.JLabel CelularDoador;
    private javax.swing.JLabel CelularUsuario;
    private javax.swing.JLabel CpfDoador;
    private javax.swing.JLabel CpfDoador1;
    private javax.swing.JLabel CpfUsuario;
    private javax.swing.JLabel DataNascimentoDoador;
    private javax.swing.JLabel DataNascimentoUsuario;
    private javax.swing.JLabel DataNascimentoUsuario1;
    private javax.swing.JLabel EmailCentro;
    private javax.swing.JLabel EmailDoador;
    private javax.swing.JLabel EmailUsuario;
    private javax.swing.JLabel EnderecoCentro;
    private javax.swing.JLabel EnderecoDoador;
    private javax.swing.JLabel InstagramCentro;
    private javax.swing.JLabel InstagramDoador;
    private javax.swing.JLabel NomeCentro;
    private javax.swing.JLabel NomeDoador;
    private javax.swing.JLabel NomeUsuário;
    private javax.swing.JLabel SenhaCentro;
    private javax.swing.JLabel SenhaCentro1;
    private javax.swing.JLabel SenhaCentro2;
    private javax.swing.JLabel SexoDoador;
    private javax.swing.JLabel SexoUsuario;
    private javax.swing.JPanel TelaCadastro;
    private javax.swing.JLabel TelefoneCentro;
    private javax.swing.JFormattedTextField TxtCadastroCelularDoador;
    private javax.swing.JFormattedTextField TxtCadastroCelularUsuario;
    private javax.swing.JFormattedTextField TxtCadastroCnpjCentro;
    private javax.swing.JFormattedTextField TxtCadastroCpfDoador;
    private javax.swing.JFormattedTextField TxtCadastroCpfUsuario;
    private javax.swing.JTextField TxtCadastroEmailCentro;
    private javax.swing.JTextField TxtCadastroEmailDoador;
    private javax.swing.JTextField TxtCadastroEmailUsuario;
    private javax.swing.JTextField TxtCadastroEnderecoCentro1;
    private javax.swing.JTextField TxtCadastroEnderecoDoador;
    private javax.swing.JTextField TxtCadastroEnderecoUsuario;
    private javax.swing.JTextField TxtCadastroInstagramCentro;
    private javax.swing.JTextField TxtCadastroInstagramDoador;
    private javax.swing.JFormattedTextField TxtCadastroNascimentoDoador;
    private javax.swing.JFormattedTextField TxtCadastroNascimentoUsuario;
    private javax.swing.JTextField TxtCadastroNomeCentro;
    private javax.swing.JTextField TxtCadastroNomeDoador;
    private javax.swing.JTextField TxtCadastroNomeUsuario;
    private javax.swing.JTextField TxtCadastroSenhaCentro;
    private javax.swing.JTextField TxtCadastroSenhaDoador;
    private javax.swing.JTextField TxtCadastroSenhaUsuario;
    private javax.swing.JFormattedTextField TxtCadastroTelefoneCentro;
    private javax.swing.JComboBox<String> campoSexoDoador;
    private javax.swing.JComboBox<String> campoSexoUsuario;
    private javax.swing.JComboBox<String> campoTipoEmail;
    private javax.swing.JComboBox<String> campoTipoEmailCentro;
    private javax.swing.JComboBox<String> campoTipoEmailDoador;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
