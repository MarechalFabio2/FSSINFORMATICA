/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.ModelSessaoUsuario;
import controller.ControllerUsuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.ModelUsuario;
import util.LetrasMaiusculas;

/**
 *
 * @author Fabio
 */
public class ViewLogin extends javax.swing.JFrame {

    ControllerUsuario controllerUsuario = new ControllerUsuario();
    ModelUsuario modelUsuario = new ModelUsuario();
    ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();

    /**
     * Creates new form ViewLogin
     */
    public ViewLogin() {
        initComponents();
        setLocationRelativeTo(null);
        letraMaiuscula();
        setIcone();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uJPanelImagem2 = new componentes.UJPanelImagem();
        jLabel4 = new javax.swing.JLabel();
        uJPanelImagem1 = new componentes.UJPanelImagem();
        uJPanelImagem3 = new componentes.UJPanelImagem();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JPasswordField();
        jbEntrar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        uJPanelImagem2.setImagem(new java.io.File("D:\\VendasRenan\\src\\imagens\\flamengo.png"));
        uJPanelImagem2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FSS INFORMÁTICA");
        uJPanelImagem2.add(jLabel4);
        jLabel4.setBounds(178, 30, 227, 29);

        uJPanelImagem1.setImagem(new java.io.File("D:\\VendasRenan\\src\\imagens\\Logo.png"));

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        uJPanelImagem2.add(uJPanelImagem1);
        uJPanelImagem1.setBounds(10, 100, 247, 185);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(251, 251, 251));
        jLabel3.setText("Login do Sistema");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário:");

        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jtfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfUsuarioKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 251, 251));
        jLabel2.setText("Senha:");

        jtfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSenhaActionPerformed(evt);
            }
        });
        jtfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfSenhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfSenhaKeyReleased(evt);
            }
        });

        jbEntrar.setBackground(new java.awt.Color(0, 153, 51));
        jbEntrar.setText("Entrar");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });
        jbEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbEntrarKeyPressed(evt);
            }
        });

        jbSair.setBackground(new java.awt.Color(255, 0, 0));
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jbSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbSairKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout uJPanelImagem3Layout = new javax.swing.GroupLayout(uJPanelImagem3);
        uJPanelImagem3.setLayout(uJPanelImagem3Layout);
        uJPanelImagem3Layout.setHorizontalGroup(
            uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem3Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSair)
                .addContainerGap())
            .addGroup(uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(uJPanelImagem3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(uJPanelImagem3Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(10, 10, 10)
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(uJPanelImagem3Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(16, 16, 16)
                            .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        uJPanelImagem3Layout.setVerticalGroup(
            uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem3Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSair)
                    .addComponent(jbEntrar))
                .addGap(26, 26, 26))
            .addGroup(uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(uJPanelImagem3Layout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(23, 23, 23)
                    .addGroup(uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 78, Short.MAX_VALUE)))
        );

        uJPanelImagem2.add(uJPanelImagem3);
        uJPanelImagem3.setBounds(280, 100, 270, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(uJPanelImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
        jtfSenha.requestFocus();
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jtfUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUsuarioKeyReleased
        // TODO add your handling code here:
        sairSistema(evt);
    }//GEN-LAST:event_jtfUsuarioKeyReleased

    private void jtfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSenhaActionPerformed
        // TODO add your handling code here:
        entrarSistema();
    }//GEN-LAST:event_jtfSenhaActionPerformed

    private void jtfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSenhaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSenhaKeyPressed

    private void jtfSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSenhaKeyReleased
        // TODO add your handling code here:
        sairSistema(evt);
    }//GEN-LAST:event_jtfSenhaKeyReleased

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        // TODO add your handling code here:
        entrarSistema();
    }//GEN-LAST:event_jbEntrarActionPerformed

    private void jbEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbEntrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEntrarKeyPressed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbSairKeyPressed
        // TODO add your handling code here:;
    }//GEN-LAST:event_jbSairKeyPressed

    private void entrarSistema() {
        modelUsuario.setUsuLogin(jtfUsuario.getText());
        modelUsuario.setUsuSenha(String.valueOf(jtfSenha.getPassword()));

        if (controllerUsuario.getValidarUsuarioController(modelUsuario)) {
            modelUsuario = controllerUsuario.getUsuarioController(jtfUsuario.getText());
            modelSessaoUsuario.codigo = modelUsuario.getIdUsuario();
            modelSessaoUsuario.nome = modelUsuario.getUsuNome();
            modelSessaoUsuario.login = modelUsuario.getUsuLogin();
            new ViewPrincipal().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário/Senha inválido!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void sairSistema(java.awt.event.KeyEvent e) {
        if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }
    
    private void letraMaiuscula() {
        jtfUsuario.setDocument(new LetrasMaiusculas());
    }

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
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                //começa o look aqui
                LookAndFeel lf = UIManager.getLookAndFeel();

                try {

                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (UnsupportedLookAndFeelException exc) {
                } catch (ClassNotFoundException exc) {
                } catch (InstantiationException exc) {
                } catch (IllegalAccessException exc) {
                }

                UIManager.put("nimbusBase", new Color(80, 100, 242));

                UIManager.put("nimbusBlueGrey", new Color(190, 189, 170));

                UIManager.put("control", new Color(242, 242, 242));
                //termina o look aqui

                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JButton jbSair;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JTextField jtfUsuario;
    private componentes.UJPanelImagem uJPanelImagem1;
    private componentes.UJPanelImagem uJPanelImagem2;
    private componentes.UJPanelImagem uJPanelImagem3;
    // End of variables declaration//GEN-END:variables

    private void setIcone() {
        URL caminhoIcone = getClass().getResource("/imagens/icon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
    }
}
