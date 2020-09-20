package interfaceGrafica;

import excecoes.PEException;
import excecoes.PIException;
import excecoes.UJCException;
import java.awt.event.ActionEvent;
import mytwitter.MyTwitter;
import mytwitter.perfil.Perfil;
import mytwitter.perfil.PessoaFisica;


public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textoBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textoCriarPerfil = new javax.swing.JTextField();
        bCriarPerfil = new javax.swing.JButton();
        bSeguir = new javax.swing.JButton();
        bTweets = new javax.swing.JButton();
        bTimeline = new javax.swing.JButton();
        bCancelarPerfil = new javax.swing.JButton();
        bTweetar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoTweetar = new javax.swing.JTextArea();
        textoTeste = new javax.swing.JLabel();
        texto_Usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Procurar Usuário");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Criar perfil");

        bCriarPerfil.setText("Criar Perfil");
        bCriarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCriarPerfilActionPerformed(evt);
            }
        });

        bSeguir.setText("Seguir");

        bTweets.setText("Tweets");
        bTweets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTweetsActionPerformed(evt);
            }
        });

        bTimeline.setText("Timeline");
        bTimeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTimelineActionPerformed(evt);
            }
        });
        bTimeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTimelineActionPerformed(evt);
            }
        });

        bCancelarPerfil.setText("Cancelar Perfil");
        bCancelarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoCriarPerfil, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(bCriarPerfil))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bTweets)
                                    .addComponent(bSeguir)
                                    .addComponent(bTimeline)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(bCancelarPerfil)))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(textoBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(bBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bBuscar)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoCriarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bCriarPerfil)
                .addGap(18, 18, 18)
                .addComponent(bSeguir)
                .addGap(18, 18, 18)
                .addComponent(bTweets)
                .addGap(18, 18, 18)
                .addComponent(bTimeline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(bCancelarPerfil)
                .addGap(22, 22, 22))
        );

        bTweetar.setText("Tweetar");
        bTweetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTweetarActionPerformed(evt);
            }
        });

        textoTweetar.setColumns(20);
        textoTweetar.setRows(5);
        jScrollPane1.setViewportView(textoTweetar);

        texto_Usuario.setText("Usuário: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(textoTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_Usuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(bTweetar)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoTeste)
                .addGap(175, 175, 175)
                .addComponent(texto_Usuario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bTweetar)
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        String nome = textoBuscar.getText();
        if(nome.isEmpty()){
            return;
        } else {
            perfilUsuario = rede.getRepositorio().buscar(nome);
            if(perfilUsuario == null){
                System.out.println("Não há usuário.");
                textoBuscar.setText("");
                return;
            } else{
                textoBuscar.setText("");
                texto_Usuario.setText("Usuário: " + nome);
                System.out.println(perfilUsuario.getUsuario());
                return;
            }
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bTweetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTweetsActionPerformed

    }//GEN-LAST:event_bTweetsActionPerformed

    private void bCriarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCriarPerfilActionPerformed
       try{
           String nome = textoCriarPerfil.getText();
           if(nome.isEmpty()){
               return;
           } else {
               rede.criarPerfil(new PessoaFisica(nome));
               textoCriarPerfil.setText("");
           }
        } catch (PEException ex) {
            System.out.println("Já existe um perfil com esse nome de usuário.");
            textoCriarPerfil.setText("");
        } catch (UJCException ex) {
            System.out.println("Já existe um Usuário com esse nome.");
            textoCriarPerfil.setText("");
        }
    }//GEN-LAST:event_bCriarPerfilActionPerformed
    
    private void bTweetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTweetarActionPerformed
        
    }//GEN-LAST:event_bTweetarActionPerformed

    private void bTimelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTimelineActionPerformed
        
    }//GEN-LAST:event_bTimelineActionPerformed

    private void bCancelarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarPerfilActionPerformed
        
    }//GEN-LAST:event_bCancelarPerfilActionPerformed

    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
        //MyTwitter rede = new MyTwitter();
        
    }
    MyTwitter rede = new MyTwitter();
    Perfil perfilUsuario;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelarPerfil;
    private javax.swing.JButton bCriarPerfil;
    private javax.swing.JButton bSeguir;
    private javax.swing.JButton bTimeline;
    private javax.swing.JButton bTweetar;
    private javax.swing.JButton bTweets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textoBuscar;
    private javax.swing.JTextField textoCriarPerfil;
    private javax.swing.JLabel textoTeste;
    private javax.swing.JTextArea textoTweetar;
    private javax.swing.JLabel texto_Usuario;
    // End of variables declaration//GEN-END:variables
}
