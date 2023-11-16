package Screens;

import Controller.ProjectControl;
import Model.UserDAO;
import Model.ProjectDAO;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListModel;

public class Register extends javax.swing.JFrame {

    public Register() {
        projectControl = new ProjectControl();
        initComponents();
        DefaultListModel model = new DefaultListModel();
        listProjects.setModel(model);
        fillList();
    }

    ProjectControl projectControl;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listProjects = new javax.swing.JList<>();
        NovoBtn = new javax.swing.JButton();
        EditarBtn = new javax.swing.JButton();
        ExcluirBtn = new javax.swing.JButton();
        CadastrarBtn = new javax.swing.JButton();
        CancelarBtn = new javax.swing.JButton();
        BuscarBtn = new javax.swing.JButton();
        FieldEvento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FieldCampus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        FieldCoordenador = new javax.swing.JTextField();
        FieldEstudante = new javax.swing.JTextField();
        FieldTitulo = new javax.swing.JTextField();
        FieldMatricula = new javax.swing.JTextField();
        FieldCPF = new javax.swing.JTextField();
        FieldBanco = new javax.swing.JTextField();
        FieldConta = new javax.swing.JTextField();
        FieldAgencia = new javax.swing.JTextField();
        FieldCelular = new javax.swing.JTextField();
        FieldEmail = new javax.swing.JTextField();
        SalvarEdicaoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        listProjects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        listProjects.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listProjectsValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listProjects);

        NovoBtn.setText("Novo");
        NovoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoBtnActionPerformed(evt);
            }
        });

        EditarBtn.setText("Editar");
        EditarBtn.setEnabled(false);
        EditarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBtnActionPerformed(evt);
            }
        });

        ExcluirBtn.setText("Excluir");
        ExcluirBtn.setEnabled(false);
        ExcluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirBtnActionPerformed(evt);
            }
        });

        CadastrarBtn.setText("Cadastrar");
        CadastrarBtn.setEnabled(false);
        CadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarBtnActionPerformed(evt);
            }
        });

        CancelarBtn.setText("Cancelar");
        CancelarBtn.setEnabled(false);
        CancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBtnActionPerformed(evt);
            }
        });

        BuscarBtn.setText("Buscar");
        BuscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBtnActionPerformed(evt);
            }
        });

        FieldEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldEventoKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel1.setText("Evento:");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel2.setText("Estudante:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel3.setText("Coordenador: ");

        FieldCampus.setEnabled(false);
        FieldCampus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCampusKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel4.setText("Câmpus:");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel5.setText("Título:");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel6.setText("Número de matrícula:");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel7.setText("CPF:");

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel8.setText("Nº do Banco:");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel9.setText("Conta corrente:");

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel10.setText("Agência:");

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel11.setText("Celular:");

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel12.setText("Email:");

        FieldCoordenador.setEnabled(false);
        FieldCoordenador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCoordenadorKeyReleased(evt);
            }
        });

        FieldEstudante.setEnabled(false);
        FieldEstudante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldEstudanteKeyReleased(evt);
            }
        });

        FieldTitulo.setEnabled(false);
        FieldTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldTituloKeyReleased(evt);
            }
        });

        FieldMatricula.setEnabled(false);
        FieldMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldMatriculaKeyReleased(evt);
            }
        });

        FieldCPF.setEnabled(false);
        FieldCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCPFKeyReleased(evt);
            }
        });

        FieldBanco.setEnabled(false);
        FieldBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldBancoKeyReleased(evt);
            }
        });

        FieldConta.setEnabled(false);
        FieldConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldContaKeyReleased(evt);
            }
        });

        FieldAgencia.setEnabled(false);
        FieldAgencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldAgenciaKeyReleased(evt);
            }
        });

        FieldCelular.setEnabled(false);
        FieldCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCelularKeyReleased(evt);
            }
        });

        FieldEmail.setEnabled(false);
        FieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldEmailKeyReleased(evt);
            }
        });

        SalvarEdicaoBtn.setText("Salvar Edição");
        SalvarEdicaoBtn.setEnabled(false);
        SalvarEdicaoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarEdicaoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldCampus))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldEstudante))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldEvento))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldCoordenador, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FieldCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                            .addComponent(FieldEmail)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(FieldAgencia))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(12, 12, 12)
                                            .addComponent(FieldConta))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(12, 12, 12)
                                            .addComponent(FieldBanco))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(12, 12, 12)
                                            .addComponent(FieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(CadastrarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SalvarEdicaoBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExcluirBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelarBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(BuscarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(NovoBtn)
                        .addGap(18, 18, 18)
                        .addComponent(EditarBtn)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarBtn)
                    .addComponent(NovoBtn)
                    .addComponent(EditarBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(144, 144, 144))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FieldBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(FieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FieldCoordenador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FieldCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(FieldConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(FieldAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FieldEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(FieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarBtn)
                    .addComponent(ExcluirBtn)
                    .addComponent(CancelarBtn)
                    .addComponent(SalvarEdicaoBtn))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        // TODO add your handling code here:
        functionBtnSearch();
        String nameProject = FieldEvento.getText();
        int index = findIndexElement(nameProject);
        listProjects.setSelectedIndex(index);
    }//GEN-LAST:event_BuscarBtnActionPerformed

    private void NovoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoBtnActionPerformed
        // TODO add your handling code here:

        cleanFields();
        enableFields();
        FieldEvento.setText("");
        disableButtons();
        CancelarBtn.setEnabled(true);
        listProjects.clearSelection();
    }//GEN-LAST:event_NovoBtnActionPerformed


    private void FieldCoordenadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCoordenadorKeyReleased
        // TODO add your handling code here:
        /*if(FieldCoordenador.getText().isEmpty()){
            System.out.println("Não possui texto");
            System.out.println(FieldCoordenador.getText().isEmpty());
        }else{
            System.out.println("Possui texto");           
        }*/
        verificarCamposPreenchidos();
        checkFieldsToAlter();
    }//GEN-LAST:event_FieldCoordenadorKeyReleased

    private void FieldCPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCPFKeyReleased
        // TODO add your handling code here:
        verificarCamposPreenchidos();
        checkFieldsToAlter();
    }//GEN-LAST:event_FieldCPFKeyReleased

    private void FieldEventoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldEventoKeyReleased
        // TODO add your handling code here:
        verificarCamposPreenchidos();
        checkFieldsToAlter();
    }//GEN-LAST:event_FieldEventoKeyReleased

    private void FieldBancoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldBancoKeyReleased
        // TODO add your handling code here:
        verificarCamposPreenchidos();
        checkFieldsToAlter();
    }//GEN-LAST:event_FieldBancoKeyReleased

    private void FieldCampusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCampusKeyReleased
        // TODO add your handling code here:
        verificarCamposPreenchidos();
        checkFieldsToAlter();
    }//GEN-LAST:event_FieldCampusKeyReleased

    private void FieldContaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldContaKeyReleased
        // TODO add your handling code here:
        verificarCamposPreenchidos();
        checkFieldsToAlter();
    }//GEN-LAST:event_FieldContaKeyReleased

    private void FieldTituloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldTituloKeyReleased
        // TODO add your handling code here:
        verificarCamposPreenchidos();
        checkFieldsToAlter();
    }//GEN-LAST:event_FieldTituloKeyReleased

    private void FieldAgenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldAgenciaKeyReleased
        // TODO add your handling code here:
        verificarCamposPreenchidos();
        checkFieldsToAlter();
    }//GEN-LAST:event_FieldAgenciaKeyReleased

    private void FieldEstudanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldEstudanteKeyReleased
        // TODO add your handling code here:
        verificarCamposPreenchidos();
        checkFieldsToAlter();
    }//GEN-LAST:event_FieldEstudanteKeyReleased

    private void FieldCelularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCelularKeyReleased
        // TODO add your handling code here:
        verificarCamposPreenchidos();
        checkFieldsToAlter();
    }//GEN-LAST:event_FieldCelularKeyReleased

    private void FieldMatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldMatriculaKeyReleased
        // TODO add your handling code here:
        verificarCamposPreenchidos();
        checkFieldsToAlter();
    }//GEN-LAST:event_FieldMatriculaKeyReleased

    private void FieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldEmailKeyReleased
        // TODO add your handling code here:
        verificarCamposPreenchidos();
        checkFieldsToAlter();
    }//GEN-LAST:event_FieldEmailKeyReleased

    private void CadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarBtnActionPerformed
        // TODO add your handling code here:
        String coordenador = FieldCoordenador.getText();
        String agencia = FieldAgencia.getText();
        String banco = FieldBanco.getText();
        String cpf = FieldCPF.getText();
        String campus = FieldCampus.getText();
        String celular = FieldCelular.getText();
        String conta = FieldConta.getText();
        String email = FieldEmail.getText();
        String estudante = FieldEstudante.getText();
        String evento = FieldEvento.getText();
        String matricula = FieldMatricula.getText();
        String titulo = FieldTitulo.getText();

        insertElement(coordenador, agencia, banco, cpf, campus, celular,
                conta, email, estudante, evento, matricula, titulo);

        cleanFields();
        FieldEvento.setText("");
        disableFields();
        disableButtons();
        BuscarBtn.setEnabled(true);
    }//GEN-LAST:event_CadastrarBtnActionPerformed

    private void ExcluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirBtnActionPerformed
        // TODO add your handling code here:
        String nameProject = FieldEvento.getText();
        deleteElement(nameProject);

        cleanFields();
        FieldEvento.setText("");
        disableFields();
    }//GEN-LAST:event_ExcluirBtnActionPerformed

    private void CancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBtnActionPerformed
        // TODO add your handling code here:
        cleanFields();
        FieldEvento.setText("");
        disableFields();
        disableButtons();
        BuscarBtn.setEnabled(true);
    }//GEN-LAST:event_CancelarBtnActionPerformed

    private void listProjectsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listProjectsValueChanged
        // TODO add your handling code here:
        
        if(listProjects.getSelectedValue() != null){
            FieldEvento.setText(listProjects.getSelectedValue());
            functionBtnSearch();
        }    
    }//GEN-LAST:event_listProjectsValueChanged

    private void EditarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBtnActionPerformed
        // TODO add your handling code here:       
        listProjects.setEnabled(false);
        disableButtons();
        enableFields();
        NovoBtn.setEnabled(false);
        SalvarEdicaoBtn.setEnabled(true);
        CancelarBtn.setEnabled(true);

    }//GEN-LAST:event_EditarBtnActionPerformed

    private void SalvarEdicaoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarEdicaoBtnActionPerformed
        // TODO add your handling code here:
        String oldNameEvent = listProjects.getSelectedValue();

        String coordenador = FieldCoordenador.getText();
        String agencia = FieldAgencia.getText();
        String banco = FieldBanco.getText();
        String cpf = FieldCPF.getText();
        String campus = FieldCampus.getText();
        String celular = FieldCelular.getText();
        String conta = FieldConta.getText();
        String email = FieldEmail.getText();
        String estudante = FieldEstudante.getText();
        String NewNameEvento = FieldEvento.getText();
        String matricula = FieldMatricula.getText();
        String titulo = FieldTitulo.getText();

        alterElementProject(oldNameEvent, coordenador, agencia, banco, cpf, campus, celular, conta, email, estudante, NewNameEvento, matricula, titulo);
        listProjects.clearSelection();
        listProjects.setEnabled(true);
        //cleanFields();
        disableFields();
        disableButtons();
        BuscarBtn.setEnabled(true);
        NovoBtn.setEnabled(true);
    }//GEN-LAST:event_SalvarEdicaoBtnActionPerformed

    /*Functions of fields*/
    boolean verificarCamposPreenchidos() {
        if (FieldCoordenador.getText().isEmpty() || FieldAgencia.getText().isEmpty() || FieldBanco.getText().isEmpty() || FieldCPF.getText().isEmpty()
                || FieldCampus.getText().isEmpty() || FieldCelular.getText().isEmpty() || FieldConta.getText().isEmpty() || FieldEmail.getText().isEmpty()
                || FieldEstudante.getText().isEmpty() || FieldEvento.getText().isEmpty() || FieldMatricula.getText().isEmpty() || FieldTitulo.getText().isEmpty()) {

            CadastrarBtn.setEnabled(false);
        } else {
            CadastrarBtn.setEnabled(true);
            return true;
        }
        return false;
    }

    void checkFieldsToAlter() {
        if (listProjects.getSelectedValue() != null) {
            if (verificarCamposPreenchidos()) {
                SalvarEdicaoBtn.setEnabled(true);
                CadastrarBtn.setEnabled(false);
            } else {
                SalvarEdicaoBtn.setEnabled(false);
            }
        }
    }

    void enableFields() {
        FieldCoordenador.setEnabled(true);
        FieldAgencia.setEnabled(true);
        FieldBanco.setEnabled(true);
        FieldCPF.setEnabled(true);
        FieldCampus.setEnabled(true);
        FieldCelular.setEnabled(true);
        FieldConta.setEnabled(true);
        FieldEmail.setEnabled(true);
        FieldEstudante.setEnabled(true);
        FieldMatricula.setEnabled(true);
        FieldTitulo.setEnabled(true);
    }

    void disableFields() {
        FieldCoordenador.setEnabled(false);
        FieldAgencia.setEnabled(false);
        FieldBanco.setEnabled(false);
        FieldCPF.setEnabled(false);
        FieldCampus.setEnabled(false);
        FieldCelular.setEnabled(false);
        FieldConta.setEnabled(false);
        FieldEmail.setEnabled(false);
        FieldEstudante.setEnabled(false);
        FieldMatricula.setEnabled(false);
        FieldTitulo.setEnabled(false);
    }

    void cleanFields() {
        //FieldEvento.setText("");
        FieldCoordenador.setText("");
        FieldAgencia.setText("");
        FieldBanco.setText("");
        FieldCPF.setText("");
        FieldCampus.setText("");
        FieldCelular.setText("");
        FieldConta.setText("");
        FieldEmail.setText("");
        FieldEstudante.setText("");
        FieldMatricula.setText("");
        FieldTitulo.setText("");
    }

    void enableButtons() {
        EditarBtn.setEnabled(true);
        ExcluirBtn.setEnabled(true);
        CancelarBtn.setEnabled(true);
    }

    void disableButtons() {
        BuscarBtn.setEnabled(false);
        EditarBtn.setEnabled(false);
        CadastrarBtn.setEnabled(false);
        ExcluirBtn.setEnabled(false);
        SalvarEdicaoBtn.setEnabled(false);
        CancelarBtn.setEnabled(false);
    }

    //Function Search, Save, Alter and Exclue in JList//
    public void functionBtnSearch() {

        String nameEvent = FieldEvento.getText();
        ResultSet resultSet = projectControl.selectProject(nameEvent);
        disableFields();
        cleanFields();

        try {
            FieldCoordenador.setText(resultSet.getString("coordenador"));
            FieldAgencia.setText(resultSet.getString("agencia"));
            FieldBanco.setText(resultSet.getString("banco"));
            FieldCPF.setText(resultSet.getString("cpf"));
            FieldCampus.setText(resultSet.getString("campus"));
            FieldCelular.setText(resultSet.getString("celular"));
            FieldConta.setText(resultSet.getString("conta"));
            FieldEmail.setText(resultSet.getString("email"));
            FieldEstudante.setText(resultSet.getString("estudante"));
            FieldEvento.setText(resultSet.getString("evento"));
            FieldMatricula.setText(resultSet.getString("matricula"));
            FieldTitulo.setText(resultSet.getString("titulo"));
            enableButtons();

        } catch (SQLException ex) {
            System.out.println("Error" + ex);
            JOptionPane.showMessageDialog(null, "Error to search.");
        }
    }

    private DefaultListModel fillList() {
        DefaultListModel model = (DefaultListModel) listProjects.getModel();
        ResultSet resultSet = projectControl.takeProjectsNames();

        try {
            while (resultSet.next()) {
                model.addElement(resultSet.getString("evento"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros: " + ex);
        }

        return model;
    }

    public DefaultListModel insertElement(String coordenador, String agencia, String banco, String cpf, String campus, String celular,
            String conta, String email, String estudante, String evento, String matricula, String titulo) {

        DefaultListModel model = (DefaultListModel) listProjects.getModel();

        projectControl.insertIntoDatabase(coordenador, agencia, banco, cpf, campus, celular,
                conta, email, estudante, evento, matricula, titulo);

        model.addElement(evento);

        return model;
    }

    public DefaultListModel deleteElement(String nameElement) {
        DefaultListModel model = (DefaultListModel) listProjects.getModel();
        int valid = projectControl.removeProject(nameElement);

        if (valid != -1) {
            int idProject = findIndexElement(nameElement);
            model.remove(idProject);
        }

        return model;
    }

    public int findIndexElement(String nameElement) { //GPT
        ListModel<String> model = listProjects.getModel();
        int size = model.getSize();

        for (int i = 0; i < size; i++) {
            if (nameElement.equals(model.getElementAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public DefaultListModel alterElementProject(String oldNameEvent, String coordenador, String agencia, String banco, String cpf, String campus, String celular,
            String conta, String email, String estudante, String NewNameEvento, String matricula, String titulo) {

        DefaultListModel model = (DefaultListModel) listProjects.getModel();

        ResultSet resultSet = projectControl.selectProject(oldNameEvent);

        try {
            int idProject = findIndexElement(oldNameEvent); //coletando index da lista
            int id = resultSet.getInt("id"); //coletando index do banco
            projectControl.alterProject(id, coordenador, agencia, banco, cpf, campus,
                    celular, conta, email, estudante, NewNameEvento, matricula, titulo);
            
            model.remove(idProject);
            model.add(idProject, NewNameEvento);
            //model.addElement(NewNameEvento);

        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }

        return model;
    }

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JButton CadastrarBtn;
    private javax.swing.JButton CancelarBtn;
    private javax.swing.JButton EditarBtn;
    private javax.swing.JButton ExcluirBtn;
    private javax.swing.JTextField FieldAgencia;
    private javax.swing.JTextField FieldBanco;
    private javax.swing.JTextField FieldCPF;
    private javax.swing.JTextField FieldCampus;
    private javax.swing.JTextField FieldCelular;
    private javax.swing.JTextField FieldConta;
    private javax.swing.JTextField FieldCoordenador;
    private javax.swing.JTextField FieldEmail;
    private javax.swing.JTextField FieldEstudante;
    private javax.swing.JTextField FieldEvento;
    private javax.swing.JTextField FieldMatricula;
    private javax.swing.JTextField FieldTitulo;
    private javax.swing.JButton NovoBtn;
    private javax.swing.JButton SalvarEdicaoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listProjects;
    // End of variables declaration//GEN-END:variables
}
