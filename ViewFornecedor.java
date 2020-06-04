/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerCidade;
import controller.ControllerFornecedor;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCidade;
import model.ModelFornecedor;
import util.CNPJ;
import util.CPF;
import util.LetrasMaiusculas;

/**
 *
 * @author FABIO
 */
public class ViewFornecedor extends javax.swing.JFrame {

    ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
    ControllerCidade controllerCidade = new ControllerCidade();
    ModelFornecedor modelFornecedor = new ModelFornecedor();
    ModelCidade modelCidade = new ModelCidade();
    ArrayList<ModelFornecedor> listaModelFornecedor = new ArrayList<>();
    ArrayList<ModelCidade> listaModelCidade = new ArrayList<>();
    String salvarAlterar;

    /**
     * Creates new form ViewFornecedor
     */
    public ViewFornecedor() {
        initComponents();
        setLocationRelativeTo(null);
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();
        letraMaiuscula();
        formatarCampoPessoa();
        carregarFornecedor();
        listarCidades();
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

        bgTipoCadastro = new javax.swing.ButtonGroup();
        uJPanelImagem1 = new componentes.UJPanelImagem();
        jtfCodigo = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtFornecedor = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfCEP = new javax.swing.JFormattedTextField();
        jtfNome = new javax.swing.JTextField();
        jbAlterar = new javax.swing.JButton();
        jtfCidade = new componentes.UJComboBox();
        jcbEstado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrbJuridica = new javax.swing.JRadioButton();
        jlCPFouCNPJ = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jrbFisica = new javax.swing.JRadioButton();
        jbNovo = new javax.swing.JButton();
        jtfCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbExcluir = new javax.swing.JButton();
        jtfEndenco = new javax.swing.JTextField();
        jbAdicionarCidade = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Fornecedores");
        setResizable(false);

        uJPanelImagem1.setImagem(new java.io.File("D:\\VendasRenan\\src\\imagens\\flamengo.png"));

        jtfCodigo.setEditable(false);
        jtfCodigo.setEnabled(false);

        try {
            jtfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Telefone");

        jbSalvar.setBackground(new java.awt.Color(255, 255, 255));
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/salvar2.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jtFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do Fornecedor", "CPF/CNPJ", "Cidade", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtFornecedor);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cidade");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo");

        try {
            jtfCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jbAlterar.setBackground(new java.awt.Color(255, 255, 255));
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/alterar.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jtfCidade.setAutocompletar(true);

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Endereço");

        bgTipoCadastro.add(jrbJuridica);
        jrbJuridica.setForeground(new java.awt.Color(255, 255, 255));
        jrbJuridica.setSelected(true);
        jrbJuridica.setText("P. Jurídica");
        jrbJuridica.setActionCommand("p2");
        jrbJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbJuridicaActionPerformed(evt);
            }
        });

        jlCPFouCNPJ.setForeground(new java.awt.Color(255, 255, 255));

        jbCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/cancelar.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bairro");

        bgTipoCadastro.add(jrbFisica);
        jrbFisica.setForeground(new java.awt.Color(255, 255, 255));
        jrbFisica.setText("P. Física");
        jrbFisica.setActionCommand("p1");
        jrbFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFisicaActionPerformed(evt);
            }
        });

        jbNovo.setBackground(new java.awt.Color(255, 255, 255));
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/novo.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CEP");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        jbExcluir.setBackground(new java.awt.Color(255, 255, 255));
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/excluir.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jtfEndenco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEndencoActionPerformed(evt);
            }
        });

        jbAdicionarCidade.setBackground(new java.awt.Color(255, 255, 255));
        jbAdicionarCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/adicionar.png"))); // NOI18N
        jbAdicionarCidade.setToolTipText("Adicionar Cidade");
        jbAdicionarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarCidadeActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado");

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem1Layout.createSequentialGroup()
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCPFouCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(168, 168, 168))
                                    .addComponent(jtfTelefone)))
                            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jtfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jtfEndenco))))
                        .addGap(99, 99, 99))
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                                .addComponent(jbCancelar)
                                .addGap(31, 31, 31)
                                .addComponent(jbNovo)
                                .addGap(33, 33, 33)
                                .addComponent(jbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbAlterar)
                                .addGap(38, 38, 38)
                                .addComponent(jbSalvar))
                            .addComponent(jScrollPane2)
                            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jbAdicionarCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbFisica)
                                    .addComponent(jrbJuridica))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCPFouCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfEndenco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                            .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jbAdicionarCidade))
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jrbFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbJuridica)))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbNovo)
                    .addComponent(jbExcluir)
                    .addComponent(jbAlterar)
                    .addComponent(jbSalvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
        try {
            if (salvarAlterar.equals("salvar")) {
                salvarFornecedor();
            } else {
                alterarFornecedor();
            }
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // Altera cliente do banco:
        int linha = jtFornecedor.getSelectedRow();
        try {
            int codigoFornecedor = (int) jtFornecedor.getValueAt(linha, 0);
            salvarAlterar = "alterar";

            modelFornecedor = controllerFornecedor.getFornecedorController2(codigoFornecedor);
            jtfCodigo.setText(String.valueOf(modelFornecedor.getIdFornecedor()));
            jtfNome.setText(modelFornecedor.getNomeFornecedor());
            jtfCPF.setText(modelFornecedor.getCNPJFornecedor());
            jtfEndenco.setText(modelFornecedor.getEnderecoFornecedor());
            jtfBairro.setText(modelFornecedor.getBairroFornecedor());
            jtfCidade.setSelectedItem(modelFornecedor.getCidadeFornecedor());
            jcbEstado.setSelectedItem(modelFornecedor.getEstadoFornecedor());
            jtfCEP.setText(modelFornecedor.getCEPFornecedor());
            jtfTelefone.setText(modelFornecedor.getTelefoneFornecedor());
            this.habilitarDesabilitarCampos(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jrbJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbJuridicaActionPerformed
        // TODO add your handling code here:
        formatarCampoPessoa();
    }//GEN-LAST:event_jrbJuridicaActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jrbFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFisicaActionPerformed
        // TODO add your handling code here:
        formatarCampoPessoa();
    }//GEN-LAST:event_jrbFisicaActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // TODO add your handling code here:
        jtfNome.grabFocus();
        this.habilitarDesabilitarCampos(true);
        this.limparCampos();
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // Exclui cliente do banco
        int linha = jtFornecedor.getSelectedRow();
        try {
            int codigoFornecedor = (int) jtFornecedor.getValueAt(linha, 0);

            switch (JOptionPane.showConfirmDialog(null, "Deseja excluir o fornecedor selecionado?", "EXCLUSÃO DE FORNECEDOR", JOptionPane.YES_NO_OPTION)) {
                case 0:
                controllerFornecedor.excluirFornecedorController(codigoFornecedor);
                this.carregarFornecedor();
                this.habilitarDesabilitarCampos(false);
                break;

                case 1:
                JOptionPane.showMessageDialog(this, "Nenhum fornecedor foi excluído!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtfEndencoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEndencoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEndencoActionPerformed

    private void jbAdicionarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarCidadeActionPerformed
        // TODO add your handling code here:
        new ViewCidade().setVisible(true);
    }//GEN-LAST:event_jbAdicionarCidadeActionPerformed

    /**
     * preenche o combobox com todos as cidades
     */
    private void listarCidades() {
        listaModelCidade = controllerCidade.getListaCidadeController();
        jtfCidade.removeAllItems();
        for (int i = 0; i < listaModelCidade.size(); i++) {
            jtfCidade.addItem(listaModelCidade.get(i).getCidade());
        }
    }

    //Habilita ou desabilita campos
    private void habilitarDesabilitarCampos(boolean condicao) {
        jtfNome.setEnabled(condicao);
        jtfCPF.setEnabled(condicao);
        jtfEndenco.setEnabled(condicao);
        jtfBairro.setEnabled(condicao);
        jtfCidade.setEnabled(condicao);
        jcbEstado.setEnabled(condicao);
        jtfCEP.setEnabled(condicao);
        jtfTelefone.setEnabled(condicao);
        jbSalvar.setEnabled(condicao);
        jbAdicionarCidade.setEnabled(condicao);
        jrbFisica.setEnabled(condicao);
        jrbJuridica.setEnabled(condicao);
    }

    //Limpa os campos do formulario
    private void limparCampos() {
        jtfCodigo.setText("");
        jtfNome.setText("");
        jtfCPF.setText("");
        jtfEndenco.setText("");
        jtfBairro.setText("");
        jtfCidade.setSelectedItem("");
        jcbEstado.setSelectedItem("");
        jtfCEP.setText("");
        jtfTelefone.setText("");
    }

    private void carregarFornecedor() {
        listaModelFornecedor = controllerFornecedor.getListaFornecedorController();
        DefaultTableModel modelo = (DefaultTableModel) jtFornecedor.getModel();
        modelo.setNumRows(0);
        int cont = listaModelFornecedor.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelFornecedor.get(i).getIdFornecedor(),
                listaModelFornecedor.get(i).getNomeFornecedor(),
                listaModelFornecedor.get(i).getCNPJFornecedor(),
                listaModelFornecedor.get(i).getCidadeFornecedor(),
                listaModelFornecedor.get(i).getTelefoneFornecedor()
            });

        }
    }

    /**
     * Formatar o campo tipo de pessoa
     */
    private void formatarCampoPessoa() {
        jtfCPF.setValue(null);
        try {
            switch (bgTipoCadastro.getSelection().getActionCommand()) {
                case "p1":
                    jtfCPF.setFormatterFactory(CPF.getFormat());
                    jtfCPF.requestFocus();
                    jlCPFouCNPJ.setText("CPF");
                    break;
                case "p2":
                    jtfCPF.setFormatterFactory(CNPJ.getFormat());
                    jtfCPF.requestFocus();
                    jlCPFouCNPJ.setText("CNPJ");
                    break;
            }
        } catch (Exception e) {
        }
    }

    private void salvarFornecedor() {
        try {
            modelFornecedor.setIdFornecedor(Integer.parseInt(this.jtfCodigo.getText()));
        } catch (NumberFormatException e) {
        }
        modelFornecedor.setNomeFornecedor(this.jtfNome.getText());
        modelFornecedor.setCNPJFornecedor(this.jtfCPF.getText());
        modelFornecedor.setEnderecoFornecedor(this.jtfEndenco.getText());
        modelFornecedor.setBairroFornecedor(this.jtfBairro.getText());
        modelFornecedor.setCidadeFornecedor((String) this.jtfCidade.getSelectedItem());
        modelFornecedor.setEstadoFornecedor(this.jcbEstado.getSelectedItem().toString());
        modelFornecedor.setCEPFornecedor(this.jtfCEP.getText());
        modelFornecedor.setTelefoneFornecedor(this.jtfTelefone.getText());
        if (controllerFornecedor.salvarFornecedorController(modelFornecedor)>0) {
            JOptionPane.showMessageDialog(this, "Fornecedor cadastrado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            carregarFornecedor();
            this.habilitarDesabilitarCampos(false);
            this.limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar fornecedor", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterarFornecedor() {
        try {
            modelFornecedor.setIdFornecedor(Integer.parseInt(this.jtfCodigo.getText()));
        } catch (NumberFormatException e) {
        }
        modelFornecedor.setNomeFornecedor(this.jtfNome.getText());
        modelFornecedor.setCNPJFornecedor(this.jtfCPF.getText());
        modelFornecedor.setEnderecoFornecedor(this.jtfEndenco.getText());
        modelFornecedor.setBairroFornecedor(this.jtfBairro.getText());
        modelFornecedor.setCidadeFornecedor((String) this.jtfCidade.getSelectedItem());
        modelFornecedor.setEstadoFornecedor(this.jcbEstado.getSelectedItem().toString());
        modelFornecedor.setCEPFornecedor(this.jtfCEP.getText());
        modelFornecedor.setTelefoneFornecedor(this.jtfTelefone.getText());
        if (controllerFornecedor.atualizarFornecedorController(modelFornecedor)) {
            JOptionPane.showMessageDialog(this, "Fornecedor alterado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            carregarFornecedor();
            this.habilitarDesabilitarCampos(false);
            this.limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar Fornecedor", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void letraMaiuscula() {
        jtfNome.setDocument(new LetrasMaiusculas());
        jtfBairro.setDocument(new LetrasMaiusculas());
        jtfEndenco.setDocument(new LetrasMaiusculas());
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
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAdicionarCidade;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JLabel jlCPFouCNPJ;
    private javax.swing.JRadioButton jrbFisica;
    private javax.swing.JRadioButton jrbJuridica;
    private javax.swing.JTable jtFornecedor;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JFormattedTextField jtfCEP;
    private javax.swing.JFormattedTextField jtfCPF;
    private componentes.UJComboBox jtfCidade;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfEndenco;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JFormattedTextField jtfTelefone;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables

    private void setIcone() {
        URL caminhoIcone = getClass().getResource("/imagens/icon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
    }
}
