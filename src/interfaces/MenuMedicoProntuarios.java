package interfaces;

import registros.ProntuarioAtendimento;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import servicos.Medico;
import registros.Paciente;

public class MenuMedicoProntuarios extends javax.swing.JFrame {
    private EntityManagerFactory EMF;
    private MenuMedicoInicial MENU_ANTERIOR;
    private Medico MEDICO;
    private Paciente PACIENTE;
    private List<ProntuarioAtendimento> HISTORICO_ATENDIMENTOS;
    private String OPCAO_SELECIONADA;

    public MenuMedicoProntuarios(EntityManagerFactory emf, MenuMedicoInicial menuAnterior, Medico medico, Paciente paciente) {
        this.EMF = emf;
        this.MENU_ANTERIOR = menuAnterior;
        this.MEDICO = medico;
        this.PACIENTE = paciente;
        this.HISTORICO_ATENDIMENTOS = medico.buscaHistoricoAtendimento(emf, paciente);
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.MENU_ANTERIOR.apagaJanelaBusca();
    }
    private void setHISTORICO_ATENDIMENTO(){
        this.HISTORICO_ATENDIMENTOS = this.MEDICO.buscaHistoricoAtendimento(this.EMF, this.PACIENTE);
    }
    private void refreshJDselecionarPAT(){
        JDselecionarPAT.dispose();
        setHISTORICO_ATENDIMENTO();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (ProntuarioAtendimento PAT : this.HISTORICO_ATENDIMENTOS) {
            String infoAtendimento = String.format("|ID: %d |ATENDIMENTO: %s |PACIENTE: %s |", PAT.getId(), PAT.getDataAtendimento(), PAT.getPaciente().getNome());
            listModel.addElement(infoAtendimento);
        }
        JLhistoricoAtendimentos.setModel(listModel);

        // tornamos visível a caixa de diálogo com a lista
        JDselecionarPAT.setVisible(true);        
    }
    
    private void limpaJDcadastrarPAT(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        JDcadastrarPAT.setVisible(false);
    }

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
        jSeparator1 = new javax.swing.JSeparator();
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
        JDselecionarPAT = new javax.swing.JDialog();
        JBselecionarPATok = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JLhistoricoAtendimentos = new javax.swing.JList<>();
        JBconsultarPPAC = new javax.swing.JButton();
        JBcadastrarPAT = new javax.swing.JButton();
        JBatualizarPAT = new javax.swing.JButton();
        JBapagarPAT = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        JDprontuarioPaciente.setTitle("PRONTUÁRIO DO PACIENTE");
        JDprontuarioPaciente.setResizable(false);
        JDprontuarioPaciente.setSize(new java.awt.Dimension(460, 700));

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

        jLabel3.setText(" ");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setText(" ");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setText(" ");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setText(" ");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel7.setText(" ");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel8.setText(" ");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel9.setText(" ");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel10.setText(" ");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel11.setText(" ");
        jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel12.setText(" ");
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel13.setText(" ");
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel14.setText(" ");
        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel15.setText(" ");
        jLabel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel16.setText("PRONTUÁRIO DO PACIENTE");

        jScrollPane1.setViewportView(jList1);

        jLabel17.setText("HISTÓRICO DE ATENDIMENTOS");

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
                        .addGap(16, 16, 16)
                        .addGroup(JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JDprontuarioPacienteLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel17))
                    .addGroup(JDprontuarioPacienteLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
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
                .addContainerGap(26, Short.MAX_VALUE))
        );
        JDprontuarioPacienteLayout.setVerticalGroup(
            JDprontuarioPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDprontuarioPacienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        JDprontuarioPaciente.getAccessibleContext().setAccessibleDescription("");

        JDcadastrarPAT.setTitle("CADASTRAR PRONTUÁRIO DE ATENDIMENTO");
        JDcadastrarPAT.setResizable(false);
        JDcadastrarPAT.setSize(new java.awt.Dimension(450, 360));

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

        JDselecionarPAT.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        JDselecionarPAT.setResizable(false);
        JDselecionarPAT.setSize(new java.awt.Dimension(400, 300));

        JBselecionarPATok.setText("OK");
        JBselecionarPATok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBselecionarPATokMouseClicked(evt);
            }
        });

        jLabel24.setText("ESCOLHA O PRONTUÁRIO DE ATENDIMENTO");

        JLhistoricoAtendimentos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(JLhistoricoAtendimentos);

        javax.swing.GroupLayout JDselecionarPATLayout = new javax.swing.GroupLayout(JDselecionarPAT.getContentPane());
        JDselecionarPAT.getContentPane().setLayout(JDselecionarPATLayout);
        JDselecionarPATLayout.setHorizontalGroup(
            JDselecionarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDselecionarPATLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(89, 89, 89))
            .addGroup(JDselecionarPATLayout.createSequentialGroup()
                .addGroup(JDselecionarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDselecionarPATLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JDselecionarPATLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(JBselecionarPATok)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        JDselecionarPATLayout.setVerticalGroup(
            JDselecionarPATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDselecionarPATLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel24)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(JBselecionarPATok)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Prontuários");

        JBconsultarPPAC.setText("CONSULTAR PRONTUÁRIO DO PACIENTE");
        JBconsultarPPAC.setToolTipText("");
        JBconsultarPPAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBconsultarPPACMouseClicked(evt);
            }
        });

        JBcadastrarPAT.setText("CADASTRAR PRONTUÁRIO DE ATENDIMENTO");
        JBcadastrarPAT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBcadastrarPATMouseClicked(evt);
            }
        });

        JBatualizarPAT.setText("ATUALIZAR PRONTUÁRIO DE ATENDIMENTO");
        JBatualizarPAT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBatualizarPATMouseClicked(evt);
            }
        });

        JBapagarPAT.setText("APAGAR PRONTUÁRIO DE ATENDIMENTO");
        JBapagarPAT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBapagarPATMouseClicked(evt);
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
                    .addComponent(JBcadastrarPAT, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBconsultarPPAC, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBapagarPAT, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(JBconsultarPPAC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBcadastrarPAT)
                .addGap(18, 18, 18)
                .addComponent(JBatualizarPAT)
                .addGap(18, 18, 18)
                .addComponent(JBapagarPAT)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBconsultarPPACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBconsultarPPACMouseClicked
        // preenchemos os campos da janlea JDprontuarioPaciente
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

        
        if (!this.HISTORICO_ATENDIMENTOS.isEmpty()) {
            DefaultListModel<String> listModel = new DefaultListModel<>();
            for (ProntuarioAtendimento PAT : this.HISTORICO_ATENDIMENTOS) {
                String infoPaciente = String.format("Id atendimento: %d | "
                                                  + "Data: %s | " 
                                                  + "Paciente: %s | ",
                                                    PAT.getId(),
                                                    PAT.getDataAtendimento(), 
                                                    PAT.getPaciente().getNome());
                listModel.addElement(infoPaciente);
            }
            jList1.setModel(listModel);
            jButton6.setVisible(true);
            
        }
        JDprontuarioPaciente.setLocationRelativeTo(null);
        JDprontuarioPaciente.setVisible(true);
    }//GEN-LAST:event_JBconsultarPPACMouseClicked
    // BOTÃO CADASTRAR PRONTUÁRIO DE ATENDIMENTO
    private void JBcadastrarPATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBcadastrarPATMouseClicked
        limpaJDcadastrarPAT();
        JDcadastrarPAT.setLocationRelativeTo(null);
        JDcadastrarPAT.setVisible(true);
    }//GEN-LAST:event_JBcadastrarPATMouseClicked

    private void JBatualizarPATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBatualizarPATMouseClicked
        // busacar o histórico de prontuários de atendimento por meio do prontuário do paciente
        this.OPCAO_SELECIONADA = "ATUALIZAR";
        setHISTORICO_ATENDIMENTO();
        // primeiro verificamos se o paciente possui histórico de atendimentos
        if (this.HISTORICO_ATENDIMENTOS.isEmpty()){
            JOptionPane.showMessageDialog(
                    null, 
                    "O paciente não possui histórico de atendimentos", 
                    null, JOptionPane.INFORMATION_MESSAGE);
        } else {
            // construimos a lista de historico de atendimentos
            DefaultListModel<String> listModel = new DefaultListModel<>();
            for (ProntuarioAtendimento PAT : this.HISTORICO_ATENDIMENTOS) {
                String infoAtendimento = String.format("|ID: %d |ATENDIMENTO: %s |PACIENTE: %s |", PAT.getId(), PAT.getDataAtendimento(), PAT.getPaciente().getNome());
                listModel.addElement(infoAtendimento);
            }
            JLhistoricoAtendimentos.setModel(listModel);
            
            // tornamos visível a caixa de diálogo com a lista
            JDselecionarPAT.setLocationRelativeTo(null);
            JDselecionarPAT.setVisible(true);
        }     
    }//GEN-LAST:event_JBatualizarPATMouseClicked

    private void JBapagarPATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBapagarPATMouseClicked
        this.OPCAO_SELECIONADA = "APAGAR";
        
        // primeiro verificamos se o paciente possui histórico de atendimentos
        setHISTORICO_ATENDIMENTO();
        if (this.HISTORICO_ATENDIMENTOS.isEmpty()){
            JOptionPane.showMessageDialog(
                    null, 
                    "O paciente não possui histórico de atendimentos", 
                    null, JOptionPane.INFORMATION_MESSAGE);
        } else {
            // construimos a lista de historico de atendimentos
            DefaultListModel<String> listModel = new DefaultListModel<>();
            for (ProntuarioAtendimento PAT : this.HISTORICO_ATENDIMENTOS) {
                String infoAtendimento = String.format("|ID: %d |ATENDIMENTO: %s |PACIENTE: %s |", PAT.getId(), PAT.getDataAtendimento(), PAT.getPaciente().getNome());
                listModel.addElement(infoAtendimento);
            }
            JLhistoricoAtendimentos.setModel(listModel);
            
            // tornamos visível a caixa de diálogo com a lista
            JDselecionarPAT.setLocationRelativeTo(null);
            JDselecionarPAT.setVisible(true);
        }
    }//GEN-LAST:event_JBapagarPATMouseClicked
    
    //BOTÃO VOLTAR
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        this.MENU_ANTERIOR.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6MouseClicked

    private void JBselecionarPATokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBselecionarPATokMouseClicked
        int indexSelecionado = JLhistoricoAtendimentos.getSelectedIndex();
        ProntuarioAtendimento prontuarioEscolhido = this.HISTORICO_ATENDIMENTOS.get(indexSelecionado);
        
        if(this.OPCAO_SELECIONADA.equalsIgnoreCase("ATUALIZAR")){
            new MenuMedicoAtualizarPAT(this.EMF, this.MEDICO, prontuarioEscolhido).setVisible(true);
        } else if (this.OPCAO_SELECIONADA.equalsIgnoreCase("APAGAR")){
            this.MEDICO.removerProntuarioAtendimento(this.EMF, prontuarioEscolhido);
            refreshJDselecionarPAT();
        }
    }//GEN-LAST:event_JBselecionarPATokMouseClicked

    private void JBsalvarPATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBsalvarPATMouseClicked
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
        
        this.MEDICO.cadastrarProntuarioAtendimento(this.EMF, this.PACIENTE, PAT);
        setHISTORICO_ATENDIMENTO();
        
        JDcadastrarPAT.dispose();
        limpaJDcadastrarPAT();
    }//GEN-LAST:event_JBsalvarPATMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBapagarPAT;
    private javax.swing.JButton JBatualizarPAT;
    private javax.swing.JButton JBcadastrarPAT;
    private javax.swing.JButton JBconsultarPPAC;
    private javax.swing.JButton JBsalvarPAT;
    private javax.swing.JButton JBselecionarPATok;
    private javax.swing.JDialog JDcadastrarPAT;
    private javax.swing.JDialog JDprontuarioPaciente;
    private javax.swing.JDialog JDselecionarPAT;
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
    private javax.swing.JList<String> JLhistoricoAtendimentos;
    private javax.swing.JLabel JLnome;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
