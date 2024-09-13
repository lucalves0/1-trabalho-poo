package interfaces;

import java.util.List;
import java.util.ArrayList;
import registros.Consulta;
import javax.persistence.EntityManagerFactory;
import javax.swing.DefaultListModel;
import registros.Paciente;
import servicos.Secretaria;
import servicos.GerenciadorMensagens;

public class RelSec extends javax.swing.JFrame {
    
    private static EntityManagerFactory emf;
    
    public RelSec(EntityManagerFactory emf) {
        initComponents();
        setLocationRelativeTo(null);
        
        Secretaria sec = new Secretaria();
        GerenciadorMensagens germsg = new GerenciadorMensagens();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        
        List<Consulta> Consultas = sec.searchAllConsultas(emf);
        List<Paciente> Pacientes = new ArrayList<>();
        
        for(int i = 0; i < Consultas.size(); i++){
            Paciente pac = sec.searchPaciente(emf, Consultas.get(i).getPaciente());
            Pacientes.add(pac);
        }
        
        List<String> ConsultasAm = germsg.getConsultasAmanha(Consultas, Pacientes);
        
        for(int i = 0; i < ConsultasAm.size(); i++){
            listModel.addElement(ConsultasAm.get(i));
        }
        
        listConsult.setModel(listModel);
     
        Voltar.addActionListener(e -> {
            this.dispose();
            new MenuSecretaria(emf).setVisible(true);
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        panelGerMsgs = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        listConsult = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Voltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Mensagens");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Relatório Secretaria");

        label1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label1.setText("Consulas Agendadas para Amanhã:");

        jScrollPane1.setViewportView(listConsult);

        javax.swing.GroupLayout panelGerMsgsLayout = new javax.swing.GroupLayout(panelGerMsgs);
        panelGerMsgs.setLayout(panelGerMsgsLayout);
        panelGerMsgsLayout.setHorizontalGroup(
            panelGerMsgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGerMsgsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGerMsgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGerMsgsLayout.setVerticalGroup(
            panelGerMsgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGerMsgsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelGerMsgs);

        jMenu1.setText("Ações");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Voltar.setText("Voltar");
        jMenu1.add(Voltar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelSec(emf).setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.List list1;
    private javax.swing.JList<String> listConsult;
    private javax.swing.JPanel panelGerMsgs;
    // End of variables declaration//GEN-END:variables
}
