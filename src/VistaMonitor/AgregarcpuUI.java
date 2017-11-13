/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaMonitor;

import DAO.MarcaDAO;
import DAO.cpuDAO;
import Teclado.Teclado;
import VO.MarcaVO;
import VO.cpuVO;

/**
 *
 * @author Sergio
 */
public class AgregarcpuUI extends javax.swing.JPanel {
    
    private cpuDAO Lascpu;
    private MarcaDAO LasMarcas;
    private Teclado CUN = new Teclado();

    /**
     * Creates new form AgregarMoniUI
     */
    public AgregarcpuUI(cpuDAO local, MarcaDAO lasMarcas) {
        this.LasMarcas = lasMarcas;
        this.Lascpu = local;
        
        initComponents();
        Object Marca[] = this.LasMarcas.getBDMarca();
        for (int i = 0; i < this.LasMarcas.getSize(); i++) {
            MarcaVO tmp = (MarcaVO) Marca[i];
            this.JCB_Marcacpu.addItem(tmp);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_Tituloformulario = new javax.swing.JLabel();
        JL_ID = new javax.swing.JLabel();
        JL_Serie = new javax.swing.JLabel();
        JL_Marca = new javax.swing.JLabel();
        JT_Serie = new javax.swing.JTextField();
        JT_Tipo = new javax.swing.JTextField();
        JT_ID = new javax.swing.JTextField();
        JB_Registrar = new javax.swing.JButton();
        JB_Cancelar = new javax.swing.JButton();
        JL_TIpo = new javax.swing.JLabel();
        JCB_Marcacpu = new javax.swing.JComboBox<>();
        JB_saber = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 51, 0));

        JL_Tituloformulario.setBackground(new java.awt.Color(0, 204, 51));
        JL_Tituloformulario.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        JL_Tituloformulario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Tituloformulario.setText("Formulario para agregar CPU");

        JL_ID.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        JL_ID.setText("ID");

        JL_Serie.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        JL_Serie.setText("Serie");

        JL_Marca.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        JL_Marca.setText("Marca");

        JT_Serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_SerieActionPerformed(evt);
            }
        });

        JT_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_TipoActionPerformed(evt);
            }
        });

        JB_Registrar.setText("Registrar");
        JB_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_RegistrarActionPerformed(evt);
            }
        });

        JB_Cancelar.setText("Cancelar");

        JL_TIpo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        JL_TIpo.setText("Tipo");

        JCB_Marcacpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB_MarcacpuActionPerformed(evt);
            }
        });

        JB_saber.setText("Quien");
        JB_saber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_saberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(JL_Tituloformulario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JL_Serie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JL_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JL_Marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JL_TIpo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JT_Serie, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(JT_Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(JCB_Marcacpu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addComponent(JB_saber))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(JB_Registrar)
                        .addGap(108, 108, 108)
                        .addComponent(JB_Cancelar)))
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(201, 201, 201)
                    .addComponent(JT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(451, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(JL_Tituloformulario)
                .addGap(18, 18, 18)
                .addComponent(JL_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JL_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_saber))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JL_Marca, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(JCB_Marcacpu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_TIpo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_Registrar)
                    .addComponent(JB_Cancelar))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(JT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(344, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JT_SerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_SerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_SerieActionPerformed

    private void JT_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_TipoActionPerformed

    private void JB_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RegistrarActionPerformed
        
        try {
            String tipo = this.JT_Tipo.getText();
            String Serie = this.JT_Serie.getText();
            MarcaVO tmp = (MarcaVO) this.JCB_Marcacpu.getSelectedItem();
            
            String marca = "" + (tmp.getID());
            int ID = Integer.parseInt(this.JT_ID.getText());
            if (Lascpu.almacenar(tipo, ID, Serie, marca)) {
                CUN.Msn("cpu registrado");
                this.JT_Tipo.setText("");
                this.JT_Serie.setText("");
                this.JCB_Marcacpu.setSelectedIndex(0);
                this.JT_ID.setText("");
                
            } else {
                CUN.Msn("No hay cupo");
            }
        } catch (Exception e) {
            CUN.Msn("DATOS ERRADOS");
        }
    }//GEN-LAST:event_JB_RegistrarActionPerformed

    private void JB_saberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_saberActionPerformed
        
        int pos = this.JCB_Marcacpu.getSelectedIndex();
        cpuVO tmp = (cpuVO) this.JCB_Marcacpu.getSelectedItem();
        int ID = tmp.getID();
        System.out.println("La Marca que selecciono esta en la posicion  " + pos + "  y tiene un ID que es  " + ID);

    }//GEN-LAST:event_JB_saberActionPerformed

    private void JCB_MarcacpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB_MarcacpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCB_MarcacpuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Cancelar;
    private javax.swing.JButton JB_Registrar;
    private javax.swing.JButton JB_saber;
    private javax.swing.JComboBox<MarcaVO> JCB_Marcacpu;
    private javax.swing.JLabel JL_ID;
    private javax.swing.JLabel JL_Marca;
    private javax.swing.JLabel JL_Serie;
    private javax.swing.JLabel JL_TIpo;
    private javax.swing.JLabel JL_Tituloformulario;
    private javax.swing.JTextField JT_ID;
    private javax.swing.JTextField JT_Serie;
    private javax.swing.JTextField JT_Tipo;
    // End of variables declaration//GEN-END:variables
}
