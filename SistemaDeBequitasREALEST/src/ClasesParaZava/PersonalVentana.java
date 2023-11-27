/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ClasesParaZava;

import static ClasesParaZava.main.comprobarExistencia;
import static ClasesParaZava.main.numSolicitud;
import javax.swing.JOptionPane;


/**
 *
 * @author diegu
 */
public class PersonalVentana extends javax.swing.JFrame {
    int actual;
     
    public PersonalVentana(int actual){
        this.actual = actual;
        jButton2 = new javax.swing.JButton();
        jButton2.setVisible(false);
        initComponents(); 
    }
    
    public PersonalVentana(){
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingresarDNI = new javax.swing.JTextPane();
        realizarEvaluacion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mostrarSE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mostrarEdad = new javax.swing.JTextField();
        mostrarNombre = new javax.swing.JTextField();
        mostrarOM = new javax.swing.JTextField();
        mostrarPromedio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mostrarResultado = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("DNI del estudiante a evaluar:");

        jScrollPane1.setViewportView(ingresarDNI);

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Evaluar Solicitud");

        jLabel3.setText("Nombres y Apellidos");

        mostrarSE.setEditable(false);

        jLabel4.setText("Edad");

        jLabel5.setText("Promedio");

        jLabel6.setText("Situación Económica");

        jLabel7.setText("Orden de Mérito");

        mostrarEdad.setEditable(false);

        mostrarNombre.setEditable(false);

        mostrarOM.setEditable(false);

        mostrarPromedio.setEditable(false);

        jLabel8.setText("Resultado");

        mostrarResultado.setEditable(false);

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout realizarEvaluacionLayout = new javax.swing.GroupLayout(realizarEvaluacion);
        realizarEvaluacion.setLayout(realizarEvaluacionLayout);
        realizarEvaluacionLayout.setHorizontalGroup(
            realizarEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, realizarEvaluacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(realizarEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mostrarOM, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(67, 67, 67))
            .addGroup(realizarEvaluacionLayout.createSequentialGroup()
                .addGroup(realizarEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(realizarEvaluacionLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel2))
                    .addGroup(realizarEvaluacionLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(realizarEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(realizarEvaluacionLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButton2)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(realizarEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(realizarEvaluacionLayout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addGroup(realizarEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(realizarEvaluacionLayout.createSequentialGroup()
                            .addGroup(realizarEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(realizarEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, realizarEvaluacionLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(163, 163, 163))
                                    .addGroup(realizarEvaluacionLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(64, 64, 64))
                                    .addGroup(realizarEvaluacionLayout.createSequentialGroup()
                                        .addComponent(mostrarPromedio)
                                        .addGap(105, 105, 105)))
                                .addGroup(realizarEvaluacionLayout.createSequentialGroup()
                                    .addComponent(mostrarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(105, 105, 105)))
                            .addGroup(realizarEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mostrarSE)))
                        .addComponent(mostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        realizarEvaluacionLayout.setVerticalGroup(
            realizarEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(realizarEvaluacionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarOM, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(realizarEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(realizarEvaluacionLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel3)
                    .addGap(10, 10, 10)
                    .addComponent(mostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(mostrarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)
                    .addGroup(realizarEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, realizarEvaluacionLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mostrarPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, realizarEvaluacionLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mostrarSE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(111, Short.MAX_VALUE)))
        );

        jButton1.setText("Evaluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(realizarEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(realizarEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int n;
        if (comprobarExistencia(ingresarDNI.getText(), SistemaDeBecas.listaSolicitudes)) {
            n=numSolicitud(ingresarDNI.getText(),SistemaDeBecas.listaSolicitudes);
            jButton2.show();
            
            mostrarNombre.setText(SistemaDeBecas.listaPostulante.get(n).getNombre() + " " + SistemaDeBecas.listaPostulante.get(n).getApellido());
            mostrarEdad.setText(String.valueOf(SistemaDeBecas.listaPostulante.get(n).getEdad()));
            mostrarPromedio.setText(String.valueOf(SistemaDeBecas.listaPostulante.get(n).getPerfil().getPromedio()));
            mostrarSE.setText(String.valueOf(SistemaDeBecas.listaPostulante.get(n).getPerfil().getSituacionEconomica()));
            mostrarOM.setText(String.valueOf(SistemaDeBecas.listaPostulante.get(n).getPerfil().getOrdenDeMerito()));
        }         
            else
        {
            JOptionPane.showMessageDialog(this, "El postulante no tiene solicitud", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int n;
        n=numSolicitud(ingresarDNI.getText(),SistemaDeBecas.listaSolicitudes);
        Perfil perfil = SistemaDeBecas.listaSolicitudes.get(n).getPostulante().getPerfil();
        
            if (perfil.getPromedio() >= 14.0 && perfil.getSituacionEconomica().equals("Mala") && perfil.getOrdenDeMerito()>10) {
                JOptionPane.showMessageDialog(this, "Solicitud Aprobada", "OK", JOptionPane.INFORMATION_MESSAGE);
                SistemaDeBecas.listaSolicitudes.get(n).setAprobada(true);
                SistemaDeBecas.listaSolicitudes.get(n).setEstado("Aprobada");
            } else {
                JOptionPane.showMessageDialog(this, "Solicitud Reprobada", "OK", JOptionPane.INFORMATION_MESSAGE);
                SistemaDeBecas.listaSolicitudes.get(n).setAprobada(false);
                SistemaDeBecas.listaSolicitudes.get(n).setEstado("Rechazada");
            }

            SistemaDeBecas.actualizarListaSolicitudes(SistemaDeBecas.listaSolicitudes.get(n));
            File.guardar(SistemaDeBecas.listaSolicitudes, "SOLICITUDES.txt");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PersonalVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane ingresarDNI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mostrarEdad;
    private javax.swing.JTextField mostrarNombre;
    private javax.swing.JTextField mostrarOM;
    private javax.swing.JTextField mostrarPromedio;
    private javax.swing.JTextField mostrarResultado;
    private javax.swing.JTextField mostrarSE;
    private javax.swing.JPanel realizarEvaluacion;
    // End of variables declaration//GEN-END:variables
}
