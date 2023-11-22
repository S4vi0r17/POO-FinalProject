/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;

/**
 *
 * @author GBP17
 */
public class Postulante extends javax.swing.JFrame {

    /**
     * Creates new form Postulante
     */

    Page1Postulante page1Postulante = new Page1Postulante();
    Page2Postulante page2Postulante = new Page2Postulante();

    public Postulante() {
        initComponents();
        this.setLocationRelativeTo(null);
        showPanel(page1Postulante);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPostulante = new javax.swing.JPanel();
        lavelPostulante = new javax.swing.JLabel();
        botonRegistroPostulante = new javax.swing.JButton();
        botonEstadoPostulante = new javax.swing.JButton();
        panelPostulanteContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lavelPostulante.setFont(new java.awt.Font("Iosevka NFM Medium", 3, 30)); // NOI18N
        lavelPostulante.setText("Postulante");

        botonRegistroPostulante.setFont(new java.awt.Font("Iosevka NF Medium", 0, 18)); // NOI18N
        botonRegistroPostulante.setText("Registro");
        botonRegistroPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroPostulanteActionPerformed(evt);
            }
        });

        botonEstadoPostulante.setFont(new java.awt.Font("Iosevka NF Medium", 0, 18)); // NOI18N
        botonEstadoPostulante.setText("Estado");
        botonEstadoPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstadoPostulanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPostulanteContentLayout = new javax.swing.GroupLayout(panelPostulanteContent);
        panelPostulanteContent.setLayout(panelPostulanteContentLayout);
        panelPostulanteContentLayout.setHorizontalGroup(
            panelPostulanteContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        panelPostulanteContentLayout.setVerticalGroup(
            panelPostulanteContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPostulanteLayout = new javax.swing.GroupLayout(panelPostulante);
        panelPostulante.setLayout(panelPostulanteLayout);
        panelPostulanteLayout.setHorizontalGroup(
            panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostulanteLayout.createSequentialGroup()
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(lavelPostulante))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(botonRegistroPostulante)
                        .addGap(209, 209, 209)
                        .addComponent(botonEstadoPostulante)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPostulanteLayout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addComponent(panelPostulanteContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        panelPostulanteLayout.setVerticalGroup(
            panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostulanteLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lavelPostulante)
                .addGap(35, 35, 35)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEstadoPostulante)
                    .addComponent(botonRegistroPostulante))
                .addGap(18, 18, 18)
                .addComponent(panelPostulanteContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEstadoPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstadoPostulanteActionPerformed
        showPanel(page2Postulante);
    }//GEN-LAST:event_botonEstadoPostulanteActionPerformed

    private void botonRegistroPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroPostulanteActionPerformed
        showPanel(page1Postulante);
    }//GEN-LAST:event_botonRegistroPostulanteActionPerformed

    /**
     * @param args the command line arguments
     */
    

    private void showPanel(javax.swing.JPanel panel) {
        panel.setSize(panelPostulanteContent.getSize());
        panel.setLocation(0, 0);

        panelPostulanteContent.removeAll();
        panelPostulanteContent.add(panel, BorderLayout.CENTER);
        panelPostulanteContent.revalidate();
        panelPostulanteContent.repaint();
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
            java.util.logging.Logger.getLogger(Postulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Postulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Postulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Postulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Postulante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEstadoPostulante;
    private javax.swing.JButton botonRegistroPostulante;
    private javax.swing.JLabel lavelPostulante;
    private javax.swing.JPanel panelPostulante;
    private javax.swing.JPanel panelPostulanteContent;
    // End of variables declaration//GEN-END:variables
}