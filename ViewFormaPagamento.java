/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerFormaPagamento;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.ModelFormaPagamento;
import util.ModeloTabela;

/**
 *
 * @author Veronica
 */
public class ViewFormaPagamento extends javax.swing.JFrame {

    String alterarSalvar;
    ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
    ArrayList<ModelFormaPagamento> listaModelFormaPagamento = new ArrayList<>();
    ControllerFormaPagamento controllerFormaPagamento = new ControllerFormaPagamento();

    /**
     * Creates new form ViewFormaPagamento
     */
    public ViewFormaPagamento() {
        initComponents();
        setLocationRelativeTo(null);
        habilitaDesabilitaCampos(false);
        carregarFormaPagamento();
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

        uJPanelImagem1 = new componentes.UJPanelImagem();
        jLabel1 = new javax.swing.JLabel();
        jbExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfDesconto = new javax.swing.JTextField();
        jtfParcelas = new javax.swing.JTextField();
        jbAlterar = new javax.swing.JButton();
        jtfSituacao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPagamento = new javax.swing.JTable();
        jtfCodigo = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jtfDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORMAS DE PAGAMENTO");
        setResizable(false);

        uJPanelImagem1.setImagem(new java.io.File("D:\\VendasRenan\\src\\imagens\\flamengo.png"));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código:");

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/excluir.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descrição:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Parcelas:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Situação:");

        jtfDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescontoActionPerformed(evt);
            }
        });

        jtfParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfParcelasActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/alterar.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jtfSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSituacaoActionPerformed(evt);
            }
        });

        jtPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtPagamento);

        jtfCodigo.setEnabled(false);

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/novo.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/cancelar.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/salvar2.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jtfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescricaoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Desconto:");

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jtfParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jtfSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbExcluir)
                    .addComponent(jbNovo)
                    .addComponent(jbAlterar)
                    .addComponent(jbSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // Excluir um produto do banco
        int linha = jtPagamento.getSelectedRow();

        try {

            int codigoFormaPagamento = (int) jtPagamento.getValueAt(linha, 0);

            switch (JOptionPane.showConfirmDialog(null, "Deseja excluir a forma de pagamento selecionada", "EXCLUSÃO DE FORMA DE PAGAMENTO", JOptionPane.YES_NO_OPTION)) {
                case 0:
                controllerFormaPagamento.excluirFormaPagamentoController(codigoFormaPagamento);
                this.carregarFormaPagamento();
                this.habilitaDesabilitaCampos(false);

                break;
                case 1:
                JOptionPane.showMessageDialog(this, "Operação cancelada!", "ERRO", JOptionPane.ERROR_MESSAGE);
                break;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtfDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescontoActionPerformed
        // TODO add your handling code here:
        jtfParcelas.requestFocus();
        jtfParcelas.selectAll();
    }//GEN-LAST:event_jtfDescontoActionPerformed

    private void jtfParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfParcelasActionPerformed
        // TODO add your handling code here:
        jtfSituacao.requestFocus();
        jtfSituacao.selectAll();
    }//GEN-LAST:event_jtfParcelasActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        try {
            this.habilitaDesabilitaCampos(true);
            alterarSalvar = "alterar";
            int linha = this.jtPagamento.getSelectedRow();
            int codigoPagamento = (int) this.jtPagamento.getValueAt(linha, 0);
            //recuperar dados do banco
            modelFormaPagamento = controllerFormaPagamento.getFormaPagamentoController(codigoPagamento);
            //setar na interface
            this.jtfCodigo.setText(String.valueOf(modelFormaPagamento.getIdFormaPagamento()));
            this.jtfDescricao.setText(modelFormaPagamento.getDescricaoFormaPagamento());
            this.jtfDesconto.setText(String.valueOf(modelFormaPagamento.getDescontoFormaPagamento()));
            this.jtfParcelas.setText(String.valueOf(modelFormaPagamento.getParcelaFormaPagamento()));
            this.jtfSituacao.setText(String.valueOf(modelFormaPagamento.getSituacaoFormaPagamento()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado!", "ERRO", JOptionPane.ERROR_MESSAGE);
            this.habilitaDesabilitaCampos(false);
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jtfSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSituacaoActionPerformed
        // TODO add your handling code here:
        if (alterarSalvar.equals("salvar")) {
            salvarFormaPagamento();
        } else if (alterarSalvar.equals("alterar")) {
            alterarFormaPagamento();
        }
    }//GEN-LAST:event_jtfSituacaoActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // TODO add your handling code here:
        alterarSalvar = "salvar";
        this.habilitaDesabilitaCampos(true);
        this.limpaCampos();
        jtfDescricao.requestFocus();
        jtfDescricao.selectAll();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        this.limpaCampos();
        this.habilitaDesabilitaCampos(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
        if (alterarSalvar.equals("salvar")) {
            salvarFormaPagamento();
        } else if (alterarSalvar.equals("alterar")) {
            alterarFormaPagamento();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescricaoActionPerformed
        // TODO add your handling code here:
        jtfDesconto.requestFocus();
        jtfDesconto.selectAll();
    }//GEN-LAST:event_jtfDescricaoActionPerformed

    private void salvarFormaPagamento() {
        modelFormaPagamento.setDescricaoFormaPagamento(this.jtfDescricao.getText());
        modelFormaPagamento.setDescontoFormaPagamento(Float.parseFloat(this.jtfDesconto.getText()));
        modelFormaPagamento.setParcelaFormaPagamento(Integer.parseInt(this.jtfParcelas.getText()));
        modelFormaPagamento.setSituacaoFormaPagamento(Integer.parseInt(this.jtfSituacao.getText()));
        if (controllerFormaPagamento.salvarFormaPagamentoController(modelFormaPagamento)>0) {
            JOptionPane.showMessageDialog(null, "Forma de pagamento salva com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.habilitaDesabilitaCampos(false);
            this.limpaCampos();
            carregarFormaPagamento();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao salvar forma de pagamento!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterarFormaPagamento() {
        modelFormaPagamento.setDescricaoFormaPagamento(this.jtfDescricao.getText());
        modelFormaPagamento.setDescontoFormaPagamento(Float.parseFloat(this.jtfDesconto.getText()));
        modelFormaPagamento.setParcelaFormaPagamento(Integer.parseInt(this.jtfParcelas.getText()));
        modelFormaPagamento.setSituacaoFormaPagamento(Integer.parseInt(this.jtfSituacao.getText()));
        if (controllerFormaPagamento.atualizarFormaPagamentoController(modelFormaPagamento)) {
            JOptionPane.showMessageDialog(null, "Forma de pagamento alterada com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.habilitaDesabilitaCampos(false);
            this.limpaCampos();
            carregarFormaPagamento();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao alterar forma de pagamento!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Preenche a tabela de produtos com os produtos cadastrados no banco
     */
    private void carregarFormaPagamento() {
        ArrayList dados = new ArrayList();

        String[] colunas = new String[]{"Código", "Descrição", "Desconto", "Parcela", "Situação"};

        listaModelFormaPagamento = controllerFormaPagamento.getListaFormaPagamentoController();
        try {
            for (int i = 0; i < listaModelFormaPagamento.size(); i++) {
                dados.add(new Object[]{
                    listaModelFormaPagamento.get(i).getIdFormaPagamento(),
                    listaModelFormaPagamento.get(i).getDescricaoFormaPagamento(),
                    listaModelFormaPagamento.get(i).getDescontoFormaPagamento(),
                    listaModelFormaPagamento.get(i).getParcelaFormaPagamento(),
                    listaModelFormaPagamento.get(i).getSituacaoFormaPagamento()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jtPagamento.setModel(modelo);
        jtPagamento.getColumnModel().getColumn(0).setPreferredWidth(50);
        jtPagamento.getColumnModel().getColumn(0).setResizable(false);
        jtPagamento.getColumnModel().getColumn(1).setPreferredWidth(192);
        jtPagamento.getColumnModel().getColumn(1).setResizable(false);
        jtPagamento.getColumnModel().getColumn(2).setPreferredWidth(70);
        jtPagamento.getColumnModel().getColumn(2).setResizable(false);
        jtPagamento.getColumnModel().getColumn(3).setPreferredWidth(70);
        jtPagamento.getColumnModel().getColumn(3).setResizable(false);
        jtPagamento.getColumnModel().getColumn(4).setPreferredWidth(70);
        jtPagamento.getColumnModel().getColumn(4).setResizable(false);
        jtPagamento.getTableHeader().setReorderingAllowed(false);
        jtPagamento.setAutoResizeMode(jtPagamento.AUTO_RESIZE_OFF);
        jtPagamento.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void limpaCampos() {
        jtfCodigo.setText("");
        jtfDesconto.setText("");
        jtfDescricao.setText("");
        jtfParcelas.setText("");
        jtfSituacao.setText("");
    }

    private void habilitaDesabilitaCampos(boolean condicao) {
        jtfDesconto.setEnabled(condicao);
        jtfDescricao.setEnabled(condicao);
        jtfParcelas.setEnabled(condicao);
        jtfSituacao.setEnabled(condicao);
        jbSalvar.setEnabled(condicao);
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
            java.util.logging.Logger.getLogger(ViewFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFormaPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable jtPagamento;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfDesconto;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfParcelas;
    private javax.swing.JTextField jtfSituacao;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables

    private void setIcone() {
        URL caminhoIcone = getClass().getResource("/imagens/icon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
    }
}