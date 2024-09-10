package interfaces;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pessoas.Paciente;

public class GerPacientes extends javax.swing.JFrame {
    
    private EntityManagerFactory emf;
    
    public GerPacientes() {
        initComponents();
        setLocationRelativeTo(null);

        // Inicializa o EntityManagerFactory e atribui ao atributo da classe
        emf = Persistence.createEntityManagerFactory("DBCLIENT");
        buscarPacientesCad(emf);

        cadPacientes.addActionListener(e -> {
            setVisible(false);

            // Código para abrir a nova tela
            CadPacientes telaCadPaciente = new CadPacientes();
            telaCadPaciente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            telaCadPaciente.setVisible(true);
        });

        upPaciente.addActionListener(e -> {
            int confirmacao = JOptionPane.showConfirmDialog(null, 
            "Recomendamos que antes de prosseguir, verifique o identificados do paciente. Deseja prosseguir?", 
            "Confirmar", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.INFORMATION_MESSAGE);

            if (confirmacao == JOptionPane.YES_OPTION) {
                // Solicita o ID do paciente ao usuário
                String idPacienteStr = JOptionPane.showInputDialog(null, "Digite o ID do paciente que deseja atualizar suas informações");

                // Verifica se o ID foi inserido ou se o usuário clicou em cancelar
                if (idPacienteStr != null && !idPacienteStr.trim().isEmpty()) {
                    try {
                        // Tenta converter o ID para um inteiro
                        Integer idPaciente = Integer.parseInt(idPacienteStr);

                        EntityManager em = emf.createEntityManager();

                        try {
                            // Criar a query para buscar pacientes pelo ID
                            Query query = em.createQuery("SELECT p FROM Paciente p WHERE p.id = :idPaciente");
                            query.setParameter("idPaciente", idPaciente);

                            List<Paciente> pacientes = query.getResultList();

                            if (!pacientes.isEmpty()) {
                                // Se o paciente for encontrado, oculta a tela atual e abre a nova tela
                                setVisible(false);
                                UpInforPacientes telaUpInforPacientes = new UpInforPacientes(idPaciente);
                                telaUpInforPacientes.setVisible(true);
                                telaUpInforPacientes.setLocationRelativeTo(null); // Opcional: centraliza a nova tela
                            } else {
                                // Exibe mensagem informando que o paciente não foi encontrado
                                JOptionPane.showMessageDialog(null, "Paciente com o ID '" + idPaciente + "' não encontrado.", "Paciente não encontrado", JOptionPane.WARNING_MESSAGE);
                            }
                        } finally {
                            // Fechar o EntityManager
                            em.close();
                        }
                    } catch (NumberFormatException ex) {
                        // Exibe mensagem de erro se o ID não for um número válido
                        JOptionPane.showMessageDialog(null, "ID inválido. Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ID do paciente não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        deletePacientes.addActionListener(e -> {
            int confirmacao = JOptionPane.showConfirmDialog(null, 
            "Recomendamos que antes de deleter o usuário, verifique o identificador do paciente. Deseja prosseguir?", 
            "Confirmar", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.INFORMATION_MESSAGE);
            
            if (confirmacao == JOptionPane.YES_OPTION) {
                
                // Solicita o ID do paciente ao usuário
                String idPacienteStr = JOptionPane.showInputDialog(null, "Digite o ID do paciente que deseja remover do sistema");
                
                // Verifica se o ID foi inserido ou se o usuário clicou em cancelar
                if (idPacienteStr != null && !idPacienteStr.trim().isEmpty()) {
                    try {
                        // Tenta converter o ID para um inteiro
                        Integer idPaciente = Integer.parseInt(idPacienteStr);

                        EntityManager em = emf.createEntityManager();

                        try {
                            // Criar a query para buscar pacientes pelo ID
                            em.getTransaction().begin();
                            Paciente paciente = new Paciente();
                            paciente = em.find(Paciente.class, idPaciente);

                            if (paciente != null){
                                int conf = JOptionPane.showConfirmDialog(null, 
                                "Ao apagar o paciente você perderá todas as informações relacionado ao paciente. Deseja excluir mesmo?", 
                                "Confirmar", 
                                JOptionPane.YES_NO_OPTION, 
                                JOptionPane.INFORMATION_MESSAGE);
                                
                                if (confirmacao == JOptionPane.YES_OPTION){
                                    em.remove(paciente);
                                }   
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Usuário não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                            }
                            
                            em.getTransaction().commit();
                            
                        } finally {
                            // Fechar o EntityManager
                            em.close();
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "ID inválido. Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ID do paciente não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        
        });

        // Adicionar WindowListener para fechar o EMF quando a janela for fechada
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                // Fechar a EntityManagerFactory quando a janela for fechada
                if (emf != null && emf.isOpen()) {
                    emf.close();
                }
                dispose(); // Fechar a janela
            }
        });
        
    }
    
    private void buscarPacientesCad(EntityManagerFactory emf){

        btnBuscarPaciente.addActionListener(avt -> {
            String nomeBuscar = txtBuscaNomePaciente.getText();
            EntityManager em = emf.createEntityManager();

            try {
                
                // Criar a query usando parâmetros nomeados para evitar SQL injection
                Query query = em.createQuery("SELECT p FROM Paciente p WHERE p.nome LIKE :nomeBuscar");
                query.setParameter("nomeBuscar", "%" + nomeBuscar + "%"); // Busca por nomes que contenham a string

                List<Paciente> pacientes = query.getResultList(); 

                if (pacientes.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            null, 
                            "Nenhum paciente encontrado com o nome " + nomeBuscar + ".", 
                            "Paciente não encontrado", JOptionPane.WARNING_MESSAGE);
                } else {
 
                    DefaultListModel<String> listModel = new DefaultListModel<>();

                    for (Paciente paciente : pacientes) {
                        String infoPaciente = String.format("Identificador do paciente: %d | Nome do paciente: %s", 
                                                            paciente.getId(), 
                                                            paciente.getNome());
                        listModel.addElement(infoPaciente);
                    }
                    listPacientesCad.setModel(listModel);
                }
            } finally {
                // Fechar o EntityManager
                em.close();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        panelGerPacientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        txtBuscaNomePaciente = new java.awt.TextField();
        btnBuscarPaciente = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPacientesCad = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadPacientes = new javax.swing.JMenuItem();
        upPaciente = new javax.swing.JMenuItem();
        deletePacientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Pacientes Cadastrados");
        setPreferredSize(new java.awt.Dimension(684, 464));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GERENCIAMENTO DE PACIENTES");

        label1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label1.setText("Buscar por pacientes:");

        txtBuscaNomePaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnBuscarPaciente.setActionCommand("Buscar");
        btnBuscarPaciente.setBackground(new java.awt.Color(0, 204, 0));
        btnBuscarPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnBuscarPaciente.setLabel("Buscar");

        jScrollPane1.setViewportView(listPacientesCad);

        javax.swing.GroupLayout panelGerPacientesLayout = new javax.swing.GroupLayout(panelGerPacientes);
        panelGerPacientes.setLayout(panelGerPacientesLayout);
        panelGerPacientesLayout.setHorizontalGroup(
            panelGerPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGerPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGerPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGerPacientesLayout.createSequentialGroup()
                        .addComponent(txtBuscaNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelGerPacientesLayout.setVerticalGroup(
            panelGerPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGerPacientesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGerPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscaNomePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBuscarPaciente.getAccessibleContext().setAccessibleName("Buscar");

        getContentPane().add(panelGerPacientes);

        jMenu1.setText("Ações");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cadPacientes.setText("Cadastro de pacientes");
        cadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPacientesActionPerformed(evt);
            }
        });
        jMenu1.add(cadPacientes);

        upPaciente.setText("Atualizar informações de pacientes");
        jMenu1.add(upPaciente);

        deletePacientes.setText("Remover pacientes");
        jMenu1.add(deletePacientes);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadPacientesActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerPacientes().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnBuscarPaciente;
    private javax.swing.JMenuItem cadPacientes;
    private javax.swing.JMenuItem deletePacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.List list1;
    private javax.swing.JList<String> listPacientesCad;
    private javax.swing.JPanel panelGerPacientes;
    private java.awt.TextField txtBuscaNomePaciente;
    private javax.swing.JMenuItem upPaciente;
    // End of variables declaration//GEN-END:variables
}
