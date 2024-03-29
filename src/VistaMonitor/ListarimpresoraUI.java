/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaMonitor;

import DAO.impresoraDAO;
import DAO.MarcaDAO;
import Tabla.TablaSimple;
import javax.swing.table.TableModel;


/**
 *
 * @author Sergio
 */
public class ListarimpresoraUI extends javax.swing.JPanel {

    private impresoraDAO Lasimpresoras;
    private MarcaDAO LasMarcas;

    /**
     * Creates new form ListarMoniUI
     */
    public ListarimpresoraUI(impresoraDAO local, MarcaDAO LasMarcas) {

        this.Lasimpresoras = local;
        this.LasMarcas = LasMarcas;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_TituloListaimpresora = new javax.swing.JLabel();
        JB_CargarLista = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));

        JL_TituloListaimpresora.setBackground(new java.awt.Color(0, 255, 255));
        JL_TituloListaimpresora.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        JL_TituloListaimpresora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_TituloListaimpresora.setText("Formulario para listar impresora");

        JB_CargarLista.setText("Cargar Lista");
        JB_CargarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CargarListaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(JB_CargarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(JL_TituloListaimpresora))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(JL_TituloListaimpresora)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(JB_CargarLista))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JB_CargarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CargarListaActionPerformed

        
        this.jTable1.setModel(this.Lasimpresoras.crearTabla(LasMarcas));
        
        
        
     //   this.JTA_ListaMoni.setText(this.LosMoni.listaMonitor(this.LasMarcas));

    }//GEN-LAST:event_JB_CargarListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_CargarLista;
    private javax.swing.JLabel JL_TituloListaimpresora;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
