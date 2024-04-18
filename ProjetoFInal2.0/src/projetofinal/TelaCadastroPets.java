package projetofinal;

import javax.swing.*;
import Banco.CadastroPetsBD;
import Dados.CadastroPets;




public class TelaCadastroPets extends javax.swing.JFrame {
    
    private campoOutraEspecie campoOutraEspecie; 
    private telaEspeciePet telaEspeciePet;
    private telaEspeciePetDoador telaEspeciePetDoador;
    
    
    String especie;

    public TelaCadastroPets() {
        initComponents();
        
       
        
        
    } 
    
private void LimparCadastroPets()
{
    campoEspeciePet.setSelectedIndex(0);
    TxtOutroEspecie.setText("");
    TxtRacaPet.setText("");
    TxtCorPet.setText("");
    TxtIdadePet.setText("");
    campoTipoIdadePet.setSelectedIndex(0);
    campoPortePet.setSelectedIndex(0);
    campoSexoPet.setSelectedIndex(0);
    TxtDoador.setText("");
    TxtContato1.setText("");
}

    
        public void setNomeText(String nome) {
        TxtOutroEspecie.setText(nome);
    }
        public void setespecieText(String especie) {
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) campoEspeciePet.getModel();
        model.setSelectedItem(especie);
    }
        public void setContato(String contato){
            TxtContato1.setText(contato);
        }
        public void setCentro(String centro){
            TxtDoador.setText(centro);
        }
        


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idadePet = new javax.swing.JLabel();
        campoEspeciePet = new javax.swing.JComboBox<>();
        racaPet = new javax.swing.JLabel();
        TxtRacaPet = new javax.swing.JTextField();
        corPet = new javax.swing.JLabel();
        TxtCorPet = new javax.swing.JTextField();
        especiePet = new javax.swing.JLabel();
        portePet = new javax.swing.JLabel();
        campoPortePet = new javax.swing.JComboBox<>();
        sexoPet = new javax.swing.JLabel();
        campoSexoPet = new javax.swing.JComboBox<>();
        botaoCadastrarPet = new javax.swing.JButton();
        campoTipoIdadePet = new javax.swing.JComboBox<>();
        TxtIdadePet = new javax.swing.JFormattedTextField();
        TxtOutroEspecie = new javax.swing.JTextField();
        TxtDoador = new javax.swing.JTextField();
        Doador = new javax.swing.JLabel();
        Contato = new javax.swing.JLabel();
        especiePet1 = new javax.swing.JLabel();
        TxtContato1 = new javax.swing.JFormattedTextField();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pets");
        setResizable(false);

        idadePet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idadePet.setText("Idade");

        campoEspeciePet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Cão", "Felino", "Outro Tipo" }));
        campoEspeciePet.setEnabled(false);
        campoEspeciePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEspeciePetActionPerformed(evt);
            }
        });

        racaPet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        racaPet.setText("Raça");

        TxtRacaPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRacaPetActionPerformed(evt);
            }
        });

        corPet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        corPet.setText("Cor");

        TxtCorPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCorPetActionPerformed(evt);
            }
        });

        especiePet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        especiePet.setText("Espécie");

        portePet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        portePet.setText("Porte");

        campoPortePet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Pequeno", "Médio", "Grande" }));

        sexoPet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sexoPet.setText("Sexo");

        campoSexoPet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Macho", "Fêmea" }));

        botaoCadastrarPet.setText("Cadastrar");
        botaoCadastrarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarPetActionPerformed(evt);
            }
        });

        campoTipoIdadePet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anos", "Meses", "Semanas", "Dias" }));

        TxtIdadePet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));
        TxtIdadePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdadePetActionPerformed(evt);
            }
        });

        TxtOutroEspecie.setEditable(false);
        TxtOutroEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOutroEspecieActionPerformed(evt);
            }
        });

        TxtDoador.setEditable(false);
        TxtDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDoadorActionPerformed(evt);
            }
        });

        Doador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Doador.setText("Email");

        Contato.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Contato.setText("Contato");

        especiePet1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        especiePet1.setText("Específico");

        TxtContato1.setEditable(false);
        try {
            TxtContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtIdadePet, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTipoIdadePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(idadePet))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portePet)
                            .addComponent(campoPortePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(sexoPet)
                                .addGap(160, 160, 160))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(campoSexoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoCadastrarPet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoCancelar)
                                .addGap(30, 30, 30))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoEspeciePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(especiePet))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtOutroEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(especiePet1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(racaPet)
                                    .addComponent(TxtRacaPet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(corPet)
                                        .addGap(125, 125, 125))
                                    .addComponent(TxtCorPet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Doador)
                                    .addComponent(TxtDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Contato)
                                    .addComponent(TxtContato1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(162, 162, 162)))
                        .addGap(0, 41, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(especiePet)
                                    .addComponent(especiePet1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoEspeciePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtOutroEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(racaPet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtRacaPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(corPet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCorPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addComponent(sexoPet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoSexoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portePet, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idadePet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoPortePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTipoIdadePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtIdadePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Doador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Contato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtContato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarPet)
                    .addComponent(botaoCancelar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtRacaPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRacaPetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRacaPetActionPerformed

    private void TxtCorPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCorPetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCorPetActionPerformed

    private void campoEspeciePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEspeciePetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEspeciePetActionPerformed

    private void botaoCadastrarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarPetActionPerformed
        
        
        if(TxtRacaPet.getText().isEmpty() || TxtCorPet.getText().isEmpty() 
        || TxtIdadePet.getText().isEmpty() || TxtDoador.getText().isEmpty() || TxtContato1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!");
        }
        else if(campoEspeciePet.getSelectedItem().toString().equals("Selecionar"))
        {
            campoOutraEspecie = new campoOutraEspecie();
            campoOutraEspecie.setVisible(true);
            setVisible(false);
           
        }
        else if(!TxtRacaPet.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ\\s]+"))
        {
            JOptionPane.showMessageDialog(null, "Raca inválida");
        }
        else if(!TxtCorPet.getText().matches("[a-zA-ZÀ-ÖØ-öø-ÿ\\s]+"))
        {
            JOptionPane.showMessageDialog(null, "Cor inválida");
        }
        else if(campoPortePet.getSelectedItem().toString().equals("Selecionar"))
        {
            JOptionPane.showMessageDialog(null, "Selecione uma porte");
        }
        else if(campoSexoPet.getSelectedItem().toString().equals("Selecionar"))
        {
            JOptionPane.showMessageDialog(null, "Sexo inválido");
        }
        else
        {
            
            CadastroPets pets = new CadastroPets();
            pets.setEspecie(campoEspeciePet.getSelectedItem().toString());
            pets.setOutro(TxtOutroEspecie.getText());
            pets.setRaca(TxtRacaPet.getText());
            pets.setCor(TxtCorPet.getText());
            pets.setIdade(TxtIdadePet.getText());
            pets.setTipoIdade(campoTipoIdadePet.getSelectedItem().toString());
            pets.setPorte(campoPortePet.getSelectedItem().toString());
            pets.setSexo(campoSexoPet.getSelectedItem().toString());
            pets.setEmail(TxtDoador.getText());
            pets.setContato(TxtContato1.getText());
            CadastroPetsBD pet = new CadastroPetsBD();
            pet.inserirCadastroPets(pets);
            JOptionPane.showMessageDialog(null, "Pet cadastrado");
            
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro pet?");
            if (resposta == JOptionPane.YES_OPTION) {
                telaEspeciePet = new telaEspeciePet();
                
                String email, contato;
                email = TxtDoador.getText();
                contato = TxtContato1.getText();
                
                telaEspeciePet.setnome(email);
                telaEspeciePet.setcontato(contato);
                
                telaEspeciePet.setVisible(true);
                this.dispose();
           
            }
            else if (resposta == JOptionPane.NO_OPTION) {
            
                this.dispose();
            }
            else {
            
                this.dispose();
            }   
            LimparCadastroPets();
        }
    }//GEN-LAST:event_botaoCadastrarPetActionPerformed

    private void TxtIdadePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdadePetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdadePetActionPerformed

    private void TxtOutroEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOutroEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOutroEspecieActionPerformed

    private void TxtDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDoadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDoadorActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contato;
    private javax.swing.JLabel Doador;
    private javax.swing.JFormattedTextField TxtContato1;
    private javax.swing.JTextField TxtCorPet;
    private javax.swing.JTextField TxtDoador;
    private javax.swing.JFormattedTextField TxtIdadePet;
    private javax.swing.JTextField TxtOutroEspecie;
    private javax.swing.JTextField TxtRacaPet;
    private javax.swing.JButton botaoCadastrarPet;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JComboBox<String> campoEspeciePet;
    private javax.swing.JComboBox<String> campoPortePet;
    private javax.swing.JComboBox<String> campoSexoPet;
    private javax.swing.JComboBox<String> campoTipoIdadePet;
    private javax.swing.JLabel corPet;
    private javax.swing.JLabel especiePet;
    private javax.swing.JLabel especiePet1;
    private javax.swing.JLabel idadePet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel portePet;
    private javax.swing.JLabel racaPet;
    private javax.swing.JLabel sexoPet;
    // End of variables declaration//GEN-END:variables
}
