package GUI;

import java.awt.*;

/**
 *
 * @author GBP17
 */
public class Postulante extends javax.swing.JFrame {

    Page1 p1 = new Page1();
    Page2 p2 = new Page2();
    public Postulante() {
        initComponents();
        this.setLocationRelativeTo(null);
        showPanel(p1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPostulante = new javax.swing.JPanel();
        botonSeccionRegistro = new javax.swing.JButton();
        botonSeccionEstado = new javax.swing.JButton();
        panelContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonSeccionRegistro.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        botonSeccionRegistro.setText("Registro");
        botonSeccionRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeccionRegistroActionPerformed(evt);
            }
        });

        botonSeccionEstado.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        botonSeccionEstado.setText("Estado de Solicitud");
        botonSeccionEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeccionEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPostulanteLayout = new javax.swing.GroupLayout(panelPostulante);
        panelPostulante.setLayout(panelPostulanteLayout);
        panelPostulanteLayout.setHorizontalGroup(
            panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostulanteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(botonSeccionRegistro)
                .addGap(27, 27, 27)
                .addComponent(botonSeccionEstado)
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPostulanteLayout.setVerticalGroup(
            panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostulanteLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSeccionRegistro)
                    .addComponent(botonSeccionEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPostulante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSeccionEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeccionEstadoActionPerformed
        showPanel(p2);
    }

    private void botonSeccionRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeccionRegistroActionPerformed
        showPanel(p1);
    }

    private void showPanel(javax.swing.JPanel panel) {
        panel.setSize(panelContent.getSize());
        panel.setLocation(0, 0);

        panelContent.removeAll();
        panelContent.add(panel, BorderLayout.CENTER);
        panelContent.revalidate();
        panelContent.repaint();
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
    private javax.swing.JButton botonSeccionEstado;
    private javax.swing.JButton botonSeccionRegistro;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelPostulante;
    // End of variables declaration//GEN-END:variables
}
