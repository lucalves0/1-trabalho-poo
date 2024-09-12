/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import registros.ProntuarioAtendimento;
import registros.ProntuarioPaciente;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import serviços.Medico;
import registros.Paciente;

public class MenuMedicoProntuarios extends javax.swing.JFrame {
    private EntityManagerFactory EMF;
    private MenuMedicoInicial MENU_ANTERIOR;
    private Medico MEDICO;
    private Paciente PACIENTE;
    private ArrayList<ProntuarioAtendimento> HISTORICO_ATENDIMENTOS;
    /**
     * Creates new form MenuMedicoProntuarios
     */
    public MenuMedicoProntuarios(EntityManagerFactory emf, MenuMedicoInicial menuAnterior, Medico medico, Paciente paciente) {
        this.EMF = emf;
        this.MENU_ANTERIOR = menuAnterior;
        this.MEDICO = medico;
        this.PACIENTE = paciente;
        this.HISTORICO_ATENDIMENTOS = paciente.getHistoricoAtendimento();
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDprontuarioPaciente = new javax.swing.JDialog();
        JLnome = new javax.swing.JLabel();
        JLdataNascimento = new javax.swing.JLabel();
        JLendereco = new javax.swing.JLabel();
        JLcelular = new javax.swing.JLabel();
        JLemail = new javax.swing.JLabel();
        JLconvenio = new javax.swing.JLabel();
        JLfuma = new javax.swing.JLabel();
        JLbebe = new javax.swing.JLabel();
        JLcolesterol = new javax.swing.JLabel();
        JLdiabetes = new javax.swing.JLabel();
        JLdoencaCardiaca = new javax.swing.JLabel();
        JLcircurgias = new javax.swing.JLabel();
        JLalergias = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        JDcadastrarPAT = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        JBsalvarPAT = new javax.swing.JButton();
        JDatualizarPAT = new javax.swing.JDialog();
        jButton5 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jDialog4 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JBatualizarPAT = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        JDprontuarioPaciente.setTitle("PRONTUÁRIO DO PACIENTE");
        JDprontuarioPaciente.setResizable(false);
        JDprontuarioPaciente.setSize(new java.awt.Dimension(400, 500));

        JLnome.setText("NOME:");

        JLdataNascimento.setText("DATA DE NASCIMENTO");

        JLendereco.setText("ENDERECO");

        JLcelular.setText("CELULAR");

        JLemail.setText("E-MAIL:");

        JLconvenio.setText("CONVENIO");

        JLfuma.setText("FUMA?:");

        JLbebe.setText("BEBE?:");

        JLcolesterol.setText("COLESTEROL:");

        JLdiabetes.setText("DIABETES:");

        JLdoencaCardiaca.setText("DOENÇAS CARDÍACAS:");

        JLcircurgias.setText("CIRURGIAS:");

        JLalergias.setText("ALERGIAS:");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        jLabel15.setText("jLabel15");

        jLabel16.setText("PRONTUÁRIO DO PACIENTE");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel17.setText("HISTÓRICO DE CONSULTAS");

        javax.swing.GroupLayout JDprontuarioPacienteLayout = new javax.swing.GroupLayout(JDprontuarioPaciente.getContentPane());
        JDprontuarioPaciente.getContentPane().setLayout(JDprontuarioPacienteLayout);
        JDprontuarioPacienteLayout.setHorizontalGroup(
            JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDprontuarioPacienteLayout.createSequentialGroup()
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDprontuarioPacienteLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel16))
                    .addGroup(JDprontuarioPacienteLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JDprontuarioPacienteLayout.createSequentialGroup()
                                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JLalergias)
                                    .addComponent(JLcircurgias)
                                    .addComponent(JLdoencaCardiaca)
                                    .addComponent(JLdiabetes)
                                    .addComponent(JLnome)
                                    .addComponent(JLdataNascimento)
                                    .addComponent(JLendereco)
                                    .addComponent(JLcelular)
                                    .addComponent(JLemail)
                                    .addComponent(JLconvenio)
                                    .addComponent(JLfuma)
                                    .addComponent(JLbebe)
                                    .addComponent(JLcolesterol))
                                .addGap(18, 18, 18)
                                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(JDprontuarioPacienteLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        JDprontuarioPacienteLayout.setVerticalGroup(
            JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDprontuarioPacienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel16)
                .addGap(32, 32, 32)
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnome)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLdataNascimento)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLendereco)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcelular)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLemail)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLconvenio)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLfuma)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLbebe)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcolesterol)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLdiabetes)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLdoencaCardiaca)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcircurgias)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLalergias)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        JDprontuarioPaciente.getAccessibleContext().setAccessibleDescription("");

        JDcadastrarPAT.setTitle("CADASTRAR PRONTUÁRIO DE ATENDIMENTO");
        JDcadastrarPAT.setResizable(false);
        JDcadastrarPAT.setSize(new java.awt.Dimension(400, 300));

        jLabel18.setText("CADASTRAR PRONTUÁRIO DE ATENDIMENTO");

        jLabel19.setText("Data do atendimento:");

        jLabel20.setText("Sintomas:");

        jLabel21.setText("Diagnóstico:");

        jLabel22.setText("Prescrição:");

        jLabel23.setText("Data de retorno:");

        JBsalvarPAT.setText("SALVAR");
        JBsalvarPAT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBsalvarPATMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JDcadastrarPATLayout = new javax.swing.GroupLayout(JDcadastrarPAT.getContentPane());
        JDcadastrarPAT.getContentPane().setLayout(JDcadastrarPATLayout);
        JDcadastrarPATLayout.setHorizontalGroup(
            JDcadastrarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDcadastrarPATLayout.createSequentialGroup()
                .addGroup(JDcadastrarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDcadastrarPATLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel18))
                    .addGroup(JDcadastrarPATLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(JDcadastrarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(JDcadastrarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBsalvarPAT)
                            .addGroup(JDcadastrarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jTextField4)
                                .addComponent(jTextField3)
                                .addComponent(jTextField2)
                                .addComponent(jTextField1)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        JDcadastrarPATLayout.setVerticalGroup(
            JDcadastrarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDcadastrarPATLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18)
                .addGap(45, 45, 45)
                .addGroup(JDcadastrarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JDcadastrarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JDcadastrarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JDcadastrarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JDcadastrarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(JBsalvarPAT)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        JDatualizarPAT.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        JDatualizarPAT.setResizable(false);
        JDatualizarPAT.setSize(new java.awt.Dimension(400, 300));

        jButton5.setText("OK");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jLabel24.setText("ATUALIZAR PRONTUÁRIO DE ATENDIMENTO");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout JDatualizarPATLayout = new javax.swing.GroupLayout(JDatualizarPAT.getContentPane());
        JDatualizarPAT.getContentPane().setLayout(JDatualizarPATLayout);
        JDatualizarPATLayout.setHorizontalGroup(
            JDatualizarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDatualizarPATLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(89, 89, 89))
            .addGroup(JDatualizarPATLayout.createSequentialGroup()
                .addGroup(JDatualizarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDatualizarPATLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JDatualizarPATLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jButton5)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        JDatualizarPATLayout.setVerticalGroup(
            JDatualizarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDatualizarPATLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel24)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton5)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jDialog4.setSize(new java.awt.Dimension(400, 300));

        jLabel1.setText("OPÇÃO SELECIONADA NO COMBOBOX");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addGroup(jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog4Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(jDialog4Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel2)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRONTUÁRIOS");

        jButton1.setText("CONSULTAR PRONTUÁRIO DO PACIENTE");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CADASTRAR PRONTUÁRIO DE ATENDIMENTO");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        JBatualizarPAT.setText("ATUALIZAR PRONTUÁRIO DE ATENDIMENTO");
        JBatualizarPAT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBatualizarPATMouseClicked(evt);
            }
        });
        JBatualizarPAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBatualizarPATActionPerformed(evt);
            }
        });

        jButton4.setText("APAGAR PRONTUÁRIO DE ATENDIMENTO");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("VOLTAR");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBatualizarPAT, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(JBatualizarPAT)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        jLabel3.setText(this.PACIENTE.getNome());
        jLabel4.setText(this.PACIENTE.getData_nascimento());
        jLabel5.setText(this.PACIENTE.getEndereco());
        jLabel6.setText(this.PACIENTE.getInfo_contatoCelular().toString());
        jLabel7.setText(this.PACIENTE.getInfo_contatoEmail());
        jLabel8.setText(this.PACIENTE.getTipo_convenio());
        jLabel9.setText(this.PACIENTE.getFuma());
        jLabel10.setText(this.PACIENTE.getBebe());
        jLabel11.setText(this.PACIENTE.getNivelColesterol());
        jLabel12.setText(this.PACIENTE.getDiabete());
        jLabel13.setText(this.PACIENTE.getDoencaCardiaca());
        jLabel14.setText(this.PACIENTE.getCirurgias());
        jLabel15.setText(this.PACIENTE.getAlergias());
        
        /*
        List<Paciente> listaPacientes = this.MEDICO.searchPacienteByName(this.EMF, nomeBuscado);
        
        this.PACIETNES_BUSCADOS = listaPacientes;
        
        if (listaPacientes.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Nenhum paciente encontrado com o nome " + nomeBuscado + ".", 
                    "Paciente não encontrado", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultListModel<String> listModel = new DefaultListModel<>();

            for (Paciente paciente : listaPacientes) {
                String infoPaciente = String.format("Identificador do paciente: %d | "
                                                  + "Nome do paciente: %s | " 
                                                  + "Data de Nascimento: %s | " 
                                                  + "Celular: %d | " 
                                                  + "Convenio: %s |" ,
                                                    paciente.getId(), 
                                                    paciente.getNome(),
                                                    paciente.getData_nascimento(),
                                                    paciente.getInfo_contatoCelular(),
                                                    paciente.getTipo_convenio());
                listModel.addElement(infoPaciente);
            }
            jList1.setModel(listModel);
            jButton6.setVisible(true);
        }
        JDprontuarioPaciente.setVisible(true);*/
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        JDcadastrarPAT.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void JBatualizarPATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBatualizarPATMouseClicked
        // TODO add your handling code here:
        // busacar o histórico de prontuários de atendimento por meio do prontuário do paciente
        
        JDatualizarPAT.setVisible(true);
    }//GEN-LAST:event_JBatualizarPATMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        JDatualizarPAT.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //BOTÃO VOLTAR
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        this.MENU_ANTERIOR.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        
        int indexSelecionado = jList2.getSelectedIndex();
        ProntuarioAtendimento prontuarioEscolhido = this.HISTORICO_ATENDIMENTOS.get(indexSelecionado);
        new MenuMedicoAtualizarPAT(this.EMF, this.MEDICO, prontuarioEscolhido);
        jDialog4.setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void JBsalvarPATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBsalvarPATMouseClicked
        // TODO add your handling code here:
        ProntuarioAtendimento PAT = new ProntuarioAtendimento();
        
        String dataAtendimento = jTextField1.getText();
        PAT.setDataAtendimento(dataAtendimento);
        String sintomas = jTextField2.getText();
        PAT.setSintomas(sintomas);
        String diagnostico = jTextField3.getText();
        PAT.setDignostico(diagnostico);
        String prescricao = jTextField4.getText();
        PAT.setPrescricao(prescricao);
        String dataRetorno = jTextField5.getText();
        PAT.setDataRetorno(dataRetorno);
        
        this.MEDICO.cadastrarProntuarioAtendimento(this.EMF, PAT);
    }//GEN-LAST:event_JBsalvarPATMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void JBatualizarPATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBatualizarPATActionPerformed
        // TODO add your handling code here:
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (ProntuarioAtendimento PAT : this.HISTORICO_ATENDIMENTOS) {
            String infoAtendimento = String.format("|ID: %d |ATENDIMENTO: %s |PACIENTE: %s |", PAT.getId(), PAT.getDataAtendimento(), PAT.getNomePaciente());
            listModel.addElement(infoAtendimento);
        }
        jList2.setModel(listModel);
        
        JDatualizarPAT.setVisible(true);
    }//GEN-LAST:event_JBatualizarPATActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuMedicoProntuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMedicoProntuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMedicoProntuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMedicoProntuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMedicoProntuarios().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBatualizarPAT;
    private javax.swing.JButton JBsalvarPAT;
    private javax.swing.JDialog JDatualizarPAT;
    private javax.swing.JDialog JDcadastrarPAT;
    private javax.swing.JDialog JDprontuarioPaciente;
    private javax.swing.JLabel JLalergias;
    private javax.swing.JLabel JLbebe;
    private javax.swing.JLabel JLcelular;
    private javax.swing.JLabel JLcircurgias;
    private javax.swing.JLabel JLcolesterol;
    private javax.swing.JLabel JLconvenio;
    private javax.swing.JLabel JLdataNascimento;
    private javax.swing.JLabel JLdiabetes;
    private javax.swing.JLabel JLdoencaCardiaca;
    private javax.swing.JLabel JLemail;
    private javax.swing.JLabel JLendereco;
    private javax.swing.JLabel JLfuma;
    private javax.swing.JLabel JLnome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
