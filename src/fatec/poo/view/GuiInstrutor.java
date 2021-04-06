package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoInstrutor;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Pessoa;
import javax.swing.JOptionPane;

public class GuiInstrutor extends javax.swing.JFrame {

    /**
     * Creates new form GuiInstrutor
     */
    public GuiInstrutor() {
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

        jLblCPF = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jLblSexo = new javax.swing.JLabel();
        jLblEndereco = new javax.swing.JLabel();
        jLblBairro = new javax.swing.JLabel();
        jLblCidade = new javax.swing.JLabel();
        jLblEstado = new javax.swing.JLabel();
        jLblFormacao = new javax.swing.JLabel();
        jLblEmail = new javax.swing.JLabel();
        jLblDataNascto = new javax.swing.JLabel();
        jLblEstadoCivil = new javax.swing.JLabel();
        jLblNoEndereco = new javax.swing.JLabel();
        jLblCEP = new javax.swing.JLabel();
        jLblTelRes = new javax.swing.JLabel();
        jLblCel = new javax.swing.JLabel();
        jLblAreaAtuac = new javax.swing.JLabel();
        formatCPF = new javax.swing.JFormattedTextField();
        formatRG = new javax.swing.JFormattedTextField();
        formatDataNasc = new javax.swing.JFormattedTextField();
        formatCEP = new javax.swing.JFormattedTextField();
        formatTelefone = new javax.swing.JFormattedTextField();
        formatCelular = new javax.swing.JFormattedTextField();
        txtNomeInstrutor = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtFormacao = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNumeroEndereco = new javax.swing.JTextField();
        txtAreaAtuacao = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        cbxEstado = new javax.swing.JComboBox<>();
        cbxEstadoCivil = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLblCPF1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastar Instrutor");
        setPreferredSize(new java.awt.Dimension(650, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLblCPF.setText("CPF");

        jLblNome.setText("Nome");

        jLblSexo.setText("Sexo");

        jLblEndereco.setText("Endereço");

        jLblBairro.setText("Bairro");

        jLblCidade.setText("Cidade");

        jLblEstado.setText("Estado");

        jLblFormacao.setText("Formação");

        jLblEmail.setText("Email");

        jLblDataNascto.setText("Data Nascto.");

        jLblEstadoCivil.setText("Estado Civil");

        jLblNoEndereco.setText("Nº");

        jLblCEP.setText("CEP");

        jLblTelRes.setText("Tel. Res.");

        jLblCel.setText("Celular");

        jLblAreaAtuac.setText("Área de Atuação");

        try {
            formatCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            formatRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-A")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formatRG.setEnabled(false);

        try {
            formatDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formatDataNasc.setEnabled(false);

        try {
            formatCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formatCEP.setEnabled(false);

        try {
            formatTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formatTelefone.setEnabled(false);

        try {
            formatCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formatCelular.setEnabled(false);

        txtNomeInstrutor.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtBairro.setEnabled(false);

        txtCidade.setEnabled(false);

        txtFormacao.setEnabled(false);

        txtEmail.setEnabled(false);

        txtNumeroEndereco.setEnabled(false);

        txtAreaAtuacao.setEnabled(false);

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        cbxSexo.setEnabled(false);

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbxEstado.setEnabled(false);

        cbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casado", "Solteiro" }));
        cbxEstadoCivil.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLblCPF1.setText("RG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLblAreaAtuac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblCPF)
                            .addComponent(jLblNome)
                            .addComponent(jLblSexo)
                            .addComponent(jLblEndereco)
                            .addComponent(jLblBairro)
                            .addComponent(jLblCidade)
                            .addComponent(jLblFormacao)
                            .addComponent(jLblEmail)
                            .addComponent(jLblCPF1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formatCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(173, 173, 173)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLblDataNascto)
                                            .addComponent(jLblEstadoCivil)
                                            .addComponent(jLblNoEndereco)
                                            .addComponent(jLblCEP)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLblEstado)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLblTelRes))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(formatRG, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLblCel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(formatDataNasc)
                                    .addComponent(formatTelefone)
                                    .addComponent(formatCEP)
                                    .addComponent(txtNumeroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(formatCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLblCPF)
                    .addComponent(formatCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLblNome)
                    .addComponent(txtNomeInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblDataNascto)
                    .addComponent(formatDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLblSexo)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblEstadoCivil)
                    .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblNoEndereco)
                    .addComponent(txtNumeroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblCEP)
                    .addComponent(formatCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblEstado)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblTelRes)
                    .addComponent(formatTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(formatRG, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblCel)
                    .addComponent(formatCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblCPF1))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLblFormacao)
                    .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblAreaAtuac)
                    .addComponent(txtAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Cadastrar Instrutor");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        instrutor = null;

        if (Pessoa.validarCPF(formatCPF.getText().replaceAll("[.,-]", ""))) {
            instrutor = daoInstrutor.consultar(formatCPF.getText().replaceAll("[.,-]", ""));
            if (instrutor == null) {
                btnExcluir.setEnabled(false);
                btnInserir.setEnabled(true);
            } else {
                txtNomeInstrutor.setText(instrutor.getNome());
                cbxSexo.setSelectedItem(instrutor.getSexo());
                txtEndereco.setText(instrutor.getEndereco());
                txtBairro.setText(instrutor.getBairro());
                txtCidade.setText(instrutor.getCidade());
                cbxEstado.setSelectedItem(instrutor.getEstado());
                formatRG.setText(instrutor.getRg());
                txtFormacao.setText(instrutor.getFormacao());
                txtEmail.setText(instrutor.getEmail());
                formatDataNasc.setText(instrutor.getDataNasc());
                cbxEstadoCivil.setSelectedItem(instrutor.getEstadoCivil());
                txtNumeroEndereco.setText(String.valueOf(instrutor.getNumero()));
                formatCEP.setText(String.valueOf(instrutor.getCep()));
                formatTelefone.setText(String.valueOf(instrutor.getTelefone()));
                formatCelular.setText(String.valueOf(instrutor.getCelular()));
                txtAreaAtuacao.setText(instrutor.getAreaAtuacao());

                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
            formatCPF.setEnabled(false);
            txtNomeInstrutor.setEnabled(true);
            cbxSexo.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtBairro.setEnabled(true);
            txtCidade.setEnabled(true);
            cbxEstado.setEnabled(true);
            formatRG.setEnabled(true);
            txtFormacao.setEnabled(true);
            txtEmail.setEnabled(true);
            formatDataNasc.setEnabled(true);
            cbxEstadoCivil.setEnabled(true);
            txtNumeroEndereco.setEnabled(true);
            formatCEP.setEnabled(true);
            formatTelefone.setEnabled(true);
            formatCelular.setEnabled(true);
            txtAreaAtuacao.setEnabled(true);
            txtNomeInstrutor.requestFocus();

            btnConsultar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "CPF Inválido");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("BD1811019", "BD1811019");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoInstrutor = new DaoInstrutor(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        instrutor = new Instrutor((txtNomeInstrutor.getText()), formatCPF.getText().replaceAll("[.,-]", ""));

        instrutor.setSexo(cbxSexo.getSelectedItem().toString());
        instrutor.setEstado(cbxEstado.getSelectedItem().toString());
        instrutor.setEstadoCivil(cbxEstadoCivil.getSelectedItem().toString());

        instrutor.setRg(formatRG.getText().replaceAll("[.,-]", ""));
        instrutor.setDataNasc(formatDataNasc.getText());
        instrutor.setTelefone(formatTelefone.getText().replaceAll("[(,),-]", ""));
        instrutor.setCelular(formatCelular.getText().replaceAll("[(,),-]", ""));
        instrutor.setCep(formatCEP.getText().replaceAll("-", ""));

        instrutor.setEndereco(txtEndereco.getText());
        instrutor.setBairro(txtBairro.getText());
        instrutor.setCidade(txtCidade.getText());
        instrutor.setNumero(Integer.parseInt(txtNumeroEndereco.getText()));
        instrutor.setFormacao(txtFormacao.getText());
        instrutor.setAreaAtuacao(txtAreaAtuacao.getText());
        instrutor.setEmail(txtEmail.getText());

        daoInstrutor.inserir(instrutor);

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        formatCPF.setText("");
        txtNomeInstrutor.setText("");
        cbxSexo.setSelectedIndex(0);
        txtEndereco.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        cbxEstado.setSelectedIndex(0);
        formatRG.setText("");
        txtFormacao.setText("");
        txtEmail.setText("");
        formatDataNasc.setText("");
        cbxEstadoCivil.setSelectedIndex(0);
        txtNumeroEndereco.setText("");
        formatCEP.setText("");
        formatTelefone.setText("");
        formatCelular.setText("");
        txtAreaAtuacao.setText("");

        formatCPF.setEnabled(true);
        txtNomeInstrutor.setEnabled(false);
        cbxSexo.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        cbxEstado.setEnabled(false);
        formatRG.setEnabled(false);
        txtFormacao.setEnabled(false);
        txtEmail.setEnabled(false);
        formatDataNasc.setEnabled(false);
        cbxEstadoCivil.setEnabled(false);
        txtNumeroEndereco.setEnabled(false);
        formatCEP.setEnabled(false);
        formatTelefone.setEnabled(false);
        formatCelular.setEnabled(false);
        txtAreaAtuacao.setEnabled(false);

        txtNomeInstrutor.requestFocus();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {
            instrutor.setNome(txtNomeInstrutor.getText());
            instrutor.setSexo(cbxSexo.getSelectedItem().toString());
            instrutor.setEstado(cbxEstado.getSelectedItem().toString());
            instrutor.setEstadoCivil(cbxEstadoCivil.getSelectedItem().toString());

            instrutor.setRg(formatRG.getText().replaceAll("[.,-]", ""));
            instrutor.setDataNasc(formatDataNasc.getText());
            instrutor.setTelefone(formatTelefone.getText().replaceAll("[(,),-]", ""));
            instrutor.setCelular(formatCelular.getText().replaceAll("[(,),-]", ""));
            instrutor.setCep(formatCEP.getText().replaceAll("-", ""));

            instrutor.setEndereco(txtEndereco.getText());
            instrutor.setBairro(txtBairro.getText());
            instrutor.setCidade(txtCidade.getText());
            instrutor.setNumero(Integer.parseInt(txtNumeroEndereco.getText()));
            instrutor.setFormacao(txtFormacao.getText());
            instrutor.setAreaAtuacao(txtAreaAtuacao.getText());
            instrutor.setEmail(txtEmail.getText());

            daoInstrutor.alterar(instrutor);
        }

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        formatCPF.setText("");
        txtNomeInstrutor.setText("");
        cbxSexo.setSelectedIndex(0);
        txtEndereco.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        cbxEstado.setSelectedIndex(0);
        formatRG.setText("");
        txtFormacao.setText("");
        txtEmail.setText("");
        formatDataNasc.setText("");
        cbxEstadoCivil.setSelectedIndex(0);
        txtNumeroEndereco.setText("");
        formatCEP.setText("");
        formatTelefone.setText("");
        formatCelular.setText("");
        txtAreaAtuacao.setText("");

        formatCPF.setEnabled(true);
        txtNomeInstrutor.setEnabled(false);
        cbxSexo.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        cbxEstado.setEnabled(false);
        formatRG.setEnabled(false);
        txtFormacao.setEnabled(false);
        txtEmail.setEnabled(false);
        formatDataNasc.setEnabled(false);
        cbxEstadoCivil.setEnabled(false);
        txtNumeroEndereco.setEnabled(false);
        formatCEP.setEnabled(false);
        formatTelefone.setEnabled(false);
        formatCelular.setEnabled(false);
        txtAreaAtuacao.setEnabled(false);

        txtNomeInstrutor.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {
            daoInstrutor.excluir(instrutor);

            formatCPF.setText("");
            txtNomeInstrutor.setText("");
            cbxSexo.setSelectedIndex(0);
            txtEndereco.setText("");
            txtBairro.setText("");
            txtCidade.setText("");
            cbxEstado.setSelectedIndex(0);
            formatRG.setText("");
            txtFormacao.setText("");
            txtEmail.setText("");
            formatDataNasc.setText("");
            cbxEstadoCivil.setSelectedIndex(0);
            txtNumeroEndereco.setText("");
            formatCEP.setText("");
            formatTelefone.setText("");
            formatCelular.setText("");
            txtAreaAtuacao.setText("");

            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

            formatCPF.setEnabled(true);
            txtNomeInstrutor.setEnabled(false);
            cbxSexo.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtBairro.setEnabled(false);
            txtCidade.setEnabled(false);
            cbxEstado.setEnabled(false);
            formatRG.setEnabled(false);
            txtFormacao.setEnabled(false);
            txtEmail.setEnabled(false);
            formatDataNasc.setEnabled(false);
            cbxEstadoCivil.setEnabled(false);
            txtNumeroEndereco.setEnabled(false);
            formatCEP.setEnabled(false);
            formatTelefone.setEnabled(false);
            formatCelular.setEnabled(false);
            txtAreaAtuacao.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(GuiInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiInstrutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxEstadoCivil;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JFormattedTextField formatCEP;
    private javax.swing.JFormattedTextField formatCPF;
    private javax.swing.JFormattedTextField formatCelular;
    private javax.swing.JFormattedTextField formatDataNasc;
    private javax.swing.JFormattedTextField formatRG;
    private javax.swing.JFormattedTextField formatTelefone;
    private javax.swing.JLabel jLblAreaAtuac;
    private javax.swing.JLabel jLblBairro;
    private javax.swing.JLabel jLblCEP;
    private javax.swing.JLabel jLblCPF;
    private javax.swing.JLabel jLblCPF1;
    private javax.swing.JLabel jLblCel;
    private javax.swing.JLabel jLblCidade;
    private javax.swing.JLabel jLblDataNascto;
    private javax.swing.JLabel jLblEmail;
    private javax.swing.JLabel jLblEndereco;
    private javax.swing.JLabel jLblEstado;
    private javax.swing.JLabel jLblEstadoCivil;
    private javax.swing.JLabel jLblFormacao;
    private javax.swing.JLabel jLblNoEndereco;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblSexo;
    private javax.swing.JLabel jLblTelRes;
    private javax.swing.JTextField txtAreaAtuacao;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFormacao;
    private javax.swing.JTextField txtNomeInstrutor;
    private javax.swing.JTextField txtNumeroEndereco;
    // End of variables declaration//GEN-END:variables
    private DaoInstrutor daoInstrutor = null;
    private Instrutor instrutor = null;
    private Conexao conexao = null;
}