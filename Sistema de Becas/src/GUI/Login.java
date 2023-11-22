/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author GBP17
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelUsuarioLogin = new javax.swing.JLabel();
        fieldUsuarioLogin = new javax.swing.JTextField();
        labelContraseniaLogin = new javax.swing.JLabel();
        fieldContraseniaLogin = new javax.swing.JPasswordField();
        botonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Iosevka NF SemiBold", 0, 24)); // NOI18N
        jLabel1.setText("Sistema de Becas");

        labelUsuarioLogin.setFont(new java.awt.Font("Iosevka NFP SemiBold", 0, 20)); // NOI18N
        labelUsuarioLogin.setText("Usuario:");

        fieldUsuarioLogin.setFont(new java.awt.Font("Iosevka NFM Medium", 0, 18)); // NOI18N
        fieldUsuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsuarioLoginActionPerformed(evt);
            }
        });

        labelContraseniaLogin.setFont(new java.awt.Font("Iosevka NFP SemiBold", 0, 20)); // NOI18N
        labelContraseniaLogin.setText("Contraseña:");

        fieldContraseniaLogin.setFont(new java.awt.Font("Iosevka NFM Medium", 0, 18)); // NOI18N

        botonLogin.setFont(new java.awt.Font("Iosevka NFM Medium", 1, 18)); // NOI18N
        botonLogin.setText("Iniciar Sesión");
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
                panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(panelLoginLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLoginLayout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel1))
                                        .addGroup(panelLoginLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(labelContraseniaLogin)
                                                .addComponent(fieldUsuarioLogin)
                                                .addComponent(labelUsuarioLogin)
                                                .addComponent(fieldContraseniaLogin,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 271,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                panelLoginLayout.createSequentialGroup()
                                                        .addGap(58, 58, 58)
                                                        .addComponent(botonLogin)
                                                        .addGap(50, 50, 50)))
                                .addContainerGap(66, Short.MAX_VALUE)));
        panelLoginLayout.setVerticalGroup(
                panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1)
                                .addGap(53, 53, 53)
                                .addComponent(labelUsuarioLogin)
                                .addGap(18, 18, 18)
                                .addComponent(fieldUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelContraseniaLogin)
                                .addGap(27, 27, 27)
                                .addComponent(fieldContraseniaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(botonLogin)
                                .addContainerGap(90, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUsuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_fieldUsuarioLoginActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_fieldUsuarioLoginActionPerformed

    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonLoginActionPerformed
        if (fieldUsuarioLogin.getText().equals("evaluador") && fieldContraseniaLogin.getText().equals("evaluador")) {
            this.setVisible(false);
            new Evaluador().setVisible(true);
        } else if (fieldUsuarioLogin.getText().equals("postulante") && fieldContraseniaLogin.getText().equals("postulante")) {
            this.setVisible(false);
            new Postulante().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }
    }// GEN-LAST:event_botonLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLogin;
    private javax.swing.JPasswordField fieldContraseniaLogin;
    private javax.swing.JTextField fieldUsuarioLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelContraseniaLogin;
    private javax.swing.JLabel labelUsuarioLogin;
    private javax.swing.JPanel panelLogin;
    // End of variables declaration//GEN-END:variables
}
