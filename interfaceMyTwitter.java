package interfaceGrafica;

import excecoes.MFPException;
import excecoes.PDException;
import excecoes.PEException;
import excecoes.PIException;
import excecoes.SIException;
import excecoes.UJCException;
import java.util.Calendar;
import mytwitter.MyTwitter;
import mytwitter.perfil.Perfil;
import mytwitter.perfil.PessoaFisica;
import mytwitter.perfil.PessoaJuridica;
import mytwitter.perfil.tweet.Tweet;


public class interfaceMyTwitter extends javax.swing.JFrame {

    /**
     * Creates new form interfaceMyTwitter
     */
    public interfaceMyTwitter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        textoProcurarUsuario = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textoCriarPerfil = new javax.swing.JTextField();
        bCriarPerfil = new javax.swing.JButton();
        bSeguir = new javax.swing.JButton();
        textoUsuarioSeguir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bPessoaFisica = new javax.swing.JRadioButton();
        bPessoaJuridica = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        textoInfo = new javax.swing.JLabel();
        textoCpfCnpj = new javax.swing.JTextField();
        labelBuscar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        avisoProcurar = new javax.swing.JLabel();
        avisoCriar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textoUsuario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoTweetAtual = new javax.swing.JEditorPane();
        bTimeline = new javax.swing.JButton();
        textoStatus = new javax.swing.JLabel();
        lista = new java.awt.List();
        bTweetar = new javax.swing.JButton();
        bCancelarPerfil = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        avisoPerfilAtual = new javax.swing.JLabel();
        textoTrocar = new javax.swing.JTextField();
        bTrocar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        avisoTroca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoProcurarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoProcurarUsuarioActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Criar Perfil");

        textoCriarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCriarPerfilActionPerformed(evt);
            }
        });

        bCriarPerfil.setText("Criar");
        bCriarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCriarPerfilActionPerformed(evt);
            }
        });

        bSeguir.setText("Seguir");
        bSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSeguirActionPerformed(evt);
            }
        });

        textoUsuarioSeguir.setText("Usuário: ");

        jLabel2.setText("Nome:");

        buttonGroup1.add(bPessoaFisica);
        bPessoaFisica.setText("Pessoa Física");
        bPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPessoaFisicaActionPerformed(evt);
            }
        });

        buttonGroup1.add(bPessoaJuridica);
        bPessoaJuridica.setText("Pessoa Jurídica");
        bPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPessoaJuridicaActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo de conta: ");

        textoInfo.setText("Info:");

        labelBuscar.setText("Procurar usuário");

        avisoProcurar.setText("Aviso: ");

        avisoCriar.setText("Aviso: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(textoCriarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelBuscar)
                                    .addComponent(textoProcurarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bPessoaJuridica)
                                            .addComponent(bPessoaFisica)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(textoInfo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(bCriarPerfil)
                                                    .addComponent(textoCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(avisoCriar)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bBuscar)
                                    .addComponent(textoUsuarioSeguir)
                                    .addComponent(bSeguir))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(avisoProcurar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator2))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCriarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bPessoaFisica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bPessoaJuridica)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoInfo)
                    .addComponent(textoCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bCriarPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avisoCriar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelBuscar)
                .addGap(18, 18, 18)
                .addComponent(textoProcurarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoUsuarioSeguir)
                .addGap(18, 18, 18)
                .addComponent(bSeguir)
                .addGap(12, 12, 12)
                .addComponent(avisoProcurar)
                .addContainerGap())
        );

        textoUsuario.setText("Nome: ");

        jScrollPane2.setViewportView(textoTweetAtual);

        bTimeline.setText("Mostrar Timeline");
        bTimeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTimelineActionPerformed(evt);
            }
        });

        textoStatus.setText("Status:");

        bTweetar.setText("Tweetar");
        bTweetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTweetarActionPerformed(evt);
            }
        });

        bCancelarPerfil.setText("Cancelar Perfil");
        bCancelarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarPerfilActionPerformed(evt);
            }
        });

        avisoPerfilAtual.setText("Aviso: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bCancelarPerfil))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(textoUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bTimeline))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bTweetar))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(avisoPerfilAtual)
                                            .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textoStatus))
                                        .addGap(0, 120, Short.MAX_VALUE)))))
                        .addGap(14, 14, 14))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTimeline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoStatus)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(bTweetar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(avisoPerfilAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCancelarPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        textoTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTrocarActionPerformed(evt);
            }
        });

        bTrocar.setText("Trocar");
        bTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTrocarActionPerformed(evt);
            }
        });

        jLabel5.setText("Trocar de Usuário: ");

        avisoTroca.setText("Aviso: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoTrocar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(bTrocar))
                            .addComponent(jLabel5)
                            .addComponent(avisoTroca))))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoTrocar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bTrocar))
                        .addGap(18, 18, 18)
                        .addComponent(avisoTroca)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTimelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTimelineActionPerformed
        try {
            lista.removeAll();
            Tweet[] vetor = rede.mostrar(rede.timeline(perfilUsuario2.getUsuario()));
            for(int i = 0; i < vetor.length; i++){
                lista.add(vetor[i].getMensagem() + " " + vetor[i].getHora().get(Calendar.HOUR_OF_DAY) + ":" + vetor[i].getHora().get(Calendar.MINUTE)+ ":" + vetor[i].getHora().get(Calendar.SECOND) + " " + vetor[i].getHora().get(Calendar.DAY_OF_MONTH) + "/" + vetor[i].getHora().get(Calendar.MONTH)+ "/" + vetor[i].getHora().get(Calendar.YEAR));
            }
        } catch (PIException ex) {
            avisoPerfilAtual.setText("Aviso: Perfil Inexistente!");
        } catch (PDException ex) {
            avisoPerfilAtual.setText("Aviso: Perfil já desativado!");
        }
    }//GEN-LAST:event_bTimelineActionPerformed

    private void bCancelarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarPerfilActionPerformed
        try {
            rede.cancelarPerfil(perfilUsuario2.getUsuario());
            textoStatus.setText("Status: " + perfilUsuario2.isAtivo());
        } catch (PIException ex) {
            avisoPerfilAtual.setText("Aviso: Perfil Inexistente!");
        } catch (PDException ex) {
            avisoPerfilAtual.setText("Aviso: Perfil já desativado!");
        }
    }//GEN-LAST:event_bCancelarPerfilActionPerformed

    private void bTweetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTweetarActionPerformed
        try {
            rede.tweetar(perfilUsuario2.getUsuario(), textoTweetAtual.getText());
            textoTweetAtual.setText("");
            lista.removeAll();
            for(int i = rede.tweets(perfilUsuario2.getUsuario()).size() - 1; i >= 0; i--){
                lista.add(rede.tweets(perfilUsuario2.getUsuario()).get(i).getUsuario() + ": " + rede.tweets(perfilUsuario2.getUsuario()).get(i).getMensagem() + rede.tweets(perfilUsuario2.getUsuario()).get(i).getHora().get(Calendar.HOUR_OF_DAY) + ":" + rede.tweets(perfilUsuario2.getUsuario()).get(i).getHora().get(Calendar.MINUTE) + ":" + rede.tweets(perfilUsuario2.getUsuario()).get(i).getHora().get(Calendar.SECOND) + " " + rede.tweets(perfilUsuario2.getUsuario()).get(i).getHora().get(Calendar.DAY_OF_MONTH) + "/" + rede.tweets(perfilUsuario2.getUsuario()).get(i).getHora().get(Calendar.MONTH) + "/" + rede.tweets(perfilUsuario2.getUsuario()).get(i).getHora().get(Calendar.YEAR));
            }
        } catch (PIException ex) {
            avisoPerfilAtual.setText("Aviso: Perfil Inexistente!");
        } catch (MFPException ex) {
            avisoPerfilAtual.setText("Aviso: Mensagem fora do padrão!");
        } catch (PDException ex) {
            avisoPerfilAtual.setText("Aviso: Perfil já desativado!");
        }
    }//GEN-LAST:event_bTweetarActionPerformed

    private void bSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSeguirActionPerformed
        try{
            rede.seguir(perfilUsuario1.getUsuario(), perfilUsuario2.getUsuario());
            textoProcurarUsuario.setText("");
            textoUsuarioSeguir.setText(perfilUsuario1.getUsuario());
        } catch (PIException ex) {
            avisoProcurar.setText("Aviso: Perfil Inexistente!");
        } catch (PDException ex) {
            avisoProcurar.setText("Aviso: Perfil desativado!");
        } catch (SIException ex) {
            avisoProcurar.setText("Aviso: Seguidor Inexistente!");
        }
    }//GEN-LAST:event_bSeguirActionPerformed

    private void bCriarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCriarPerfilActionPerformed
        try{
            String nome = textoCriarPerfil.getText();
            if(nome.isEmpty() || (!bPessoaFisica.isSelected() && !bPessoaJuridica.isSelected()) || textoCpfCnpj.getText().isEmpty()){
                return;
            } else {
                if(bPessoaFisica.isSelected()){
                    perfilPF = new PessoaFisica(nome);
                    rede.criarPerfil(perfilPF);
                    try {
                        perfilPF.setCpf(Long.valueOf(textoCpfCnpj.getText()).longValue());
                        textoCriarPerfil.setText("");
                        textoCpfCnpj.setText("");
                    } catch (NumberFormatException ex){
                        avisoCriar.setText("Aviso: Digite apenas números!");
                        textoCriarPerfil.setText("");
                        textoCpfCnpj.setText("");
                    }
                } else {
                    perfilPJ = new PessoaJuridica(nome);
                    rede.criarPerfil(perfilPJ);
                    try {
                        perfilPJ.setCnpj(Long.valueOf(textoCpfCnpj.getText()).longValue());
                        textoCriarPerfil.setText("");
                        textoCpfCnpj.setText("");
                    } catch(NumberFormatException ex){
                        avisoCriar.setText("Aviso: Digite apenas números!");
                        textoCriarPerfil.setText("");
                        textoCpfCnpj.setText("");
                    }
                }        
            }
        } catch (PEException ex) {
            avisoCriar.setText("Aviso: Já existe um perfil com esse nome!");
            textoCriarPerfil.setText("");
            textoCpfCnpj.setText("");
        } catch (UJCException ex) {
            avisoCriar.setText("Aviso: Já existe um Usuário com esse nome!");
            textoCriarPerfil.setText("");
            textoCpfCnpj.setText("");
        }
    }//GEN-LAST:event_bCriarPerfilActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        String nome = textoProcurarUsuario.getText();
        if(nome.isEmpty()){
            return;
        } else {
            perfilUsuario1 = rede.getRepositorio().buscar(nome);
            if(perfilUsuario1 == null){
                avisoProcurar.setText("Não há usuário");
                textoProcurarUsuario.setText("");
                lista.removeAll();
                return;
            } else{
                textoProcurarUsuario.setText("");
                textoUsuarioSeguir.setText("Usuário: " + nome);
                System.out.println(perfilUsuario1.getUsuario());
                lista.removeAll();
                return;
            }
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void textoProcurarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoProcurarUsuarioActionPerformed
    }//GEN-LAST:event_textoProcurarUsuarioActionPerformed

    private void textoCriarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCriarPerfilActionPerformed
    }//GEN-LAST:event_textoCriarPerfilActionPerformed

    private void bPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPessoaFisicaActionPerformed
         textoInfo.setText("CPF: ");
    }//GEN-LAST:event_bPessoaFisicaActionPerformed

    private void bPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPessoaJuridicaActionPerformed
        textoInfo.setText("CNPJ: ");
    }//GEN-LAST:event_bPessoaJuridicaActionPerformed

    private void bTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTrocarActionPerformed
        String nome = textoTrocar.getText();
        if(nome.isEmpty()){
            return;
        } else {
            perfilUsuario2 = rede.getRepositorio().buscar(nome);
            if(perfilUsuario2 == null || !(perfilUsuario2.isAtivo())){
                if(!(perfilUsuario2.isAtivo())){
                    avisoTroca.setText("Aviso: Desativado!");
                }
                textoTrocar.setText("");
                lista.removeAll();
                return;
            } else{
                textoTrocar.setText("");
                textoUsuario.setText("Usuário: " + nome);
                textoStatus.setText("Status: " + perfilUsuario2.isAtivo());
                lista.removeAll();
                return;
            }
        }
    }//GEN-LAST:event_bTrocarActionPerformed

    private void textoTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTrocarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTrocarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaceMyTwitter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceMyTwitter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceMyTwitter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceMyTwitter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaceMyTwitter().setVisible(true);
            }
        });
    }
    MyTwitter rede = new MyTwitter();
    Perfil perfilUsuario1;
    Perfil perfilUsuario2;
    PessoaFisica perfilPF;
    PessoaJuridica perfilPJ;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoCriar;
    private javax.swing.JLabel avisoPerfilAtual;
    private javax.swing.JLabel avisoProcurar;
    private javax.swing.JLabel avisoTroca;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelarPerfil;
    private javax.swing.JButton bCriarPerfil;
    private javax.swing.JRadioButton bPessoaFisica;
    private javax.swing.JRadioButton bPessoaJuridica;
    private javax.swing.JButton bSeguir;
    private javax.swing.JButton bTimeline;
    private javax.swing.JButton bTrocar;
    private javax.swing.JButton bTweetar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelBuscar;
    private java.awt.List lista;
    private javax.swing.JTextField textoCpfCnpj;
    private javax.swing.JTextField textoCriarPerfil;
    private javax.swing.JLabel textoInfo;
    private javax.swing.JTextField textoProcurarUsuario;
    private javax.swing.JLabel textoStatus;
    private javax.swing.JTextField textoTrocar;
    private javax.swing.JEditorPane textoTweetAtual;
    private javax.swing.JLabel textoUsuario;
    private javax.swing.JLabel textoUsuarioSeguir;
    // End of variables declaration//GEN-END:variables
}
