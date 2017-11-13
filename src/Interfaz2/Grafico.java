/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import DAO.MarcaDAO;
import DAO.MonitorDAO;
import DAO.cpuDAO;
import DAO.impresoraDAO;
import Teclado.Teclado;
import VistaMonitor.AgregarMoniUI;
import VistaMonitor.AgregarcpuUI;
import VistaMonitor.AgregarimpresoraUI;
import VistaMonitor.BuscarMoniUI;
import VistaMonitor.BuscarcpuiUI;
import VistaMonitor.BuscarimpresoraiUI;
import VistaMonitor.ListarMoniUI;
import VistaMonitor.ListarcpuUI;
import VistaMonitor.ListarimpresoraUI;
import javax.swing.JPanel;

/**
 *
 * @author Sergio
 */
public class Grafico extends javax.swing.JFrame {

    private Teclado CUN = new Teclado();
    private MonitorDAO LosMoni = new MonitorDAO();
    private MarcaDAO LasMarcas = new MarcaDAO();
    private JPanel todos;
    private cpuDAO Lascpu = new cpuDAO();
    private impresoraDAO Lasimpresoras = new impresoraDAO();

    private void cambio(JPanel vista) {

        try {
            this.getContentPane().remove(todos);
        } catch (Exception e) {

        }
        todos = vista;
        todos.setBounds(0, 0, this.getWidth(), this.getHeight());
        this.getContentPane().add(todos);
        this.repaint();
        this.pack();

    }

    public Grafico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        JM_Archivo = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JMI_Salir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        JM_AgregarMoni = new javax.swing.JMenuItem();
        JM_ListarMoni = new javax.swing.JMenuItem();
        JM_BuscarMoni = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        JMI_GuardarFile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JM_Agregarcpu = new javax.swing.JMenuItem();
        JM_Listarcpu = new javax.swing.JMenuItem();
        JM_Buscarcpu = new javax.swing.JMenuItem();
        JMI_GuardarFilecpu = new javax.swing.JMenuItem();
        JM_impresora = new javax.swing.JMenu();
        JM_Agregarimpr = new javax.swing.JMenuItem();
        JM_Listarimpre = new javax.swing.JMenuItem();
        JM_Buscarimpr = new javax.swing.JMenuItem();
        JMI_GuardarFileimp = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        JM_Agregarpers = new javax.swing.JMenuItem();
        JM_Listarpers = new javax.swing.JMenuItem();
        JM_Buscarpers = new javax.swing.JMenuItem();
        JMI_GuardarFilepers = new javax.swing.JMenuItem();
        JM_Ayuda = new javax.swing.JMenu();
        JMI_Ayuda = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA INFORMACION CUN");

        JM_Archivo.setText("Archivo");
        JM_Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_ArchivoActionPerformed(evt);
            }
        });
        JM_Archivo.add(jSeparator1);

        JMI_Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        JMI_Salir.setText("Salir");
        JMI_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_SalirActionPerformed(evt);
            }
        });
        JM_Archivo.add(JMI_Salir);

        jMenuBar2.add(JM_Archivo);

        jMenu1.setText("Monitores");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        JM_AgregarMoni.setText("Agregar");
        JM_AgregarMoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_AgregarMoniActionPerformed(evt);
            }
        });
        jMenu1.add(JM_AgregarMoni);

        JM_ListarMoni.setText("Listar");
        JM_ListarMoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_ListarMoniActionPerformed(evt);
            }
        });
        jMenu1.add(JM_ListarMoni);

        JM_BuscarMoni.setText("Buscar");
        JM_BuscarMoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_BuscarMoniActionPerformed(evt);
            }
        });
        jMenu1.add(JM_BuscarMoni);
        jMenu1.add(jSeparator2);

        JMI_GuardarFile.setText("Guardar File");
        JMI_GuardarFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_GuardarFileActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_GuardarFile);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Cpu");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        JM_Agregarcpu.setText("Agregar");
        JM_Agregarcpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_AgregarcpuActionPerformed(evt);
            }
        });
        jMenu2.add(JM_Agregarcpu);

        JM_Listarcpu.setText("Listar");
        JM_Listarcpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_ListarcpuActionPerformed(evt);
            }
        });
        jMenu2.add(JM_Listarcpu);

        JM_Buscarcpu.setText("Buscar");
        JM_Buscarcpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_BuscarcpuActionPerformed(evt);
            }
        });
        jMenu2.add(JM_Buscarcpu);

        JMI_GuardarFilecpu.setText("Guardar File");
        JMI_GuardarFilecpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_GuardarFilecpuActionPerformed(evt);
            }
        });
        jMenu2.add(JMI_GuardarFilecpu);

        jMenuBar2.add(jMenu2);

        JM_impresora.setText("Impresora");

        JM_Agregarimpr.setText("Agregar");
        JM_Agregarimpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_AgregarimprActionPerformed(evt);
            }
        });
        JM_impresora.add(JM_Agregarimpr);

        JM_Listarimpre.setText("Listar");
        JM_Listarimpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_ListarimpreActionPerformed(evt);
            }
        });
        JM_impresora.add(JM_Listarimpre);

        JM_Buscarimpr.setText("Buscar");
        JM_Buscarimpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_BuscarimprActionPerformed(evt);
            }
        });
        JM_impresora.add(JM_Buscarimpr);

        JMI_GuardarFileimp.setText("Guardar File");
        JMI_GuardarFileimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_GuardarFileimpActionPerformed(evt);
            }
        });
        JM_impresora.add(JMI_GuardarFileimp);

        jMenuBar2.add(JM_impresora);

        jMenu4.setText("Persona");

        JM_Agregarpers.setText("Agregar");
        jMenu4.add(JM_Agregarpers);

        JM_Listarpers.setText("Listar");
        jMenu4.add(JM_Listarpers);

        JM_Buscarpers.setText("Buscar");
        JM_Buscarpers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_BuscarpersActionPerformed(evt);
            }
        });
        jMenu4.add(JM_Buscarpers);

        JMI_GuardarFilepers.setText("Guardar File");
        jMenu4.add(JMI_GuardarFilepers);

        jMenuBar2.add(jMenu4);

        JM_Ayuda.setText("Ayuda");

        JMI_Ayuda.setText("Acerca de...");
        JMI_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_AyudaActionPerformed(evt);
            }
        });
        JM_Ayuda.add(JMI_Ayuda);

        jMenuBar2.add(JM_Ayuda);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JM_ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_ArchivoActionPerformed

    }//GEN-LAST:event_JM_ArchivoActionPerformed

    private void JMI_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_AyudaActionPerformed
        CUN.Msn("Sistema de informacion desarrollado en la CUN");
    }//GEN-LAST:event_JMI_AyudaActionPerformed

    private void JMI_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_SalirActionPerformed
        CUN.Msn("Good Bye");
        System.exit(0);

    }//GEN-LAST:event_JMI_SalirActionPerformed

    private void JM_BuscarMoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_BuscarMoniActionPerformed
        this.cambio(new BuscarMoniUI(this.LosMoni, this.LasMarcas));
    }//GEN-LAST:event_JM_BuscarMoniActionPerformed

    private void JM_AgregarMoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_AgregarMoniActionPerformed
        this.cambio(new AgregarMoniUI(this.LosMoni, this.LasMarcas));


    }//GEN-LAST:event_JM_AgregarMoniActionPerformed

    private void JM_ListarMoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_ListarMoniActionPerformed
        this.cambio(new ListarMoniUI(this.LosMoni, this.LasMarcas));
    }//GEN-LAST:event_JM_ListarMoniActionPerformed

    private void JMI_GuardarFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_GuardarFileActionPerformed

        if (this.LosMoni.Salvar()) {
            this.CUN.Captext("Archivo Guardado");
        } else {
            this.CUN.Msn("No tiene permisos");
        }

    }//GEN-LAST:event_JMI_GuardarFileActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void JM_AgregarcpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_AgregarcpuActionPerformed
        this.cambio(new AgregarcpuUI(this.Lascpu, this.LasMarcas));

    }//GEN-LAST:event_JM_AgregarcpuActionPerformed

    private void JM_AgregarimprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_AgregarimprActionPerformed

        this.cambio(new AgregarimpresoraUI(this.Lasimpresoras, this.LasMarcas));

        // TODO add your handling code here:
    }//GEN-LAST:event_JM_AgregarimprActionPerformed

    private void JM_BuscarpersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_BuscarpersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_BuscarpersActionPerformed

    private void JM_ListarcpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_ListarcpuActionPerformed
        this.cambio(new ListarcpuUI(this.Lascpu, this.LasMarcas));        // TODO add your handling code here:
    }//GEN-LAST:event_JM_ListarcpuActionPerformed

    private void JM_ListarimpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_ListarimpreActionPerformed
        this.cambio(new ListarimpresoraUI(this.Lasimpresoras, this.LasMarcas));        // TODO add your handling code here:
    }//GEN-LAST:event_JM_ListarimpreActionPerformed

    private void JM_BuscarcpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_BuscarcpuActionPerformed
        this.cambio(new BuscarcpuiUI(this.Lascpu, this.LasMarcas));        // TODO add your handling code here:
    }//GEN-LAST:event_JM_BuscarcpuActionPerformed

    private void JM_BuscarimprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_BuscarimprActionPerformed
        this.cambio(new BuscarimpresoraiUI(this.Lasimpresoras, this.LasMarcas));        // TODO add your handling code here:
    }//GEN-LAST:event_JM_BuscarimprActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void JMI_GuardarFilecpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_GuardarFilecpuActionPerformed
        if (this.Lascpu.Salvar()) {
            this.CUN.Captext("Archivo Guardado");
        } else {
            this.CUN.Msn("No tiene permisos");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JMI_GuardarFilecpuActionPerformed

    private void JMI_GuardarFileimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_GuardarFileimpActionPerformed
        if (this.Lasimpresoras.Salvar()) {
            this.CUN.Captext("Archivo Guardado");
        } else {
            this.CUN.Msn("No tiene permisos");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JMI_GuardarFileimpActionPerformed

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
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMI_Ayuda;
    private javax.swing.JMenuItem JMI_GuardarFile;
    private javax.swing.JMenuItem JMI_GuardarFilecpu;
    private javax.swing.JMenuItem JMI_GuardarFileimp;
    private javax.swing.JMenuItem JMI_GuardarFilepers;
    private javax.swing.JMenuItem JMI_Salir;
    private javax.swing.JMenuItem JM_AgregarMoni;
    private javax.swing.JMenuItem JM_Agregarcpu;
    private javax.swing.JMenuItem JM_Agregarimpr;
    private javax.swing.JMenuItem JM_Agregarpers;
    private javax.swing.JMenu JM_Archivo;
    private javax.swing.JMenu JM_Ayuda;
    private javax.swing.JMenuItem JM_BuscarMoni;
    private javax.swing.JMenuItem JM_Buscarcpu;
    private javax.swing.JMenuItem JM_Buscarimpr;
    private javax.swing.JMenuItem JM_Buscarpers;
    private javax.swing.JMenuItem JM_ListarMoni;
    private javax.swing.JMenuItem JM_Listarcpu;
    private javax.swing.JMenuItem JM_Listarimpre;
    private javax.swing.JMenuItem JM_Listarpers;
    private javax.swing.JMenu JM_impresora;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
