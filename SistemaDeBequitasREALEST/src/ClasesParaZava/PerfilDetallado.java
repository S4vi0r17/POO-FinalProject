package ClasesParaZava;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class PerfilDetallado extends javax.swing.JFrame {

    int index;
    
    public PerfilDetallado(int index) {
        this.index = index;
        initComponents();
        
        //Muestra los datos según el index seleccionado anteriormente
        mostrarNombre.setText(SistemaDeBecas.listaPostulante.get(index).getNombre() + " " + SistemaDeBecas.listaPostulante.get(index).getApellido());
        mostrarEdad.setText(String.valueOf(SistemaDeBecas.listaPostulante.get(index).getEdad()));
        mostrarDNI.setText(String.valueOf(SistemaDeBecas.listaPostulante.get(index).getDNI()));
        mostrarPromedio.setText(String.valueOf(SistemaDeBecas.listaPostulante.get(index).getPerfil().getPromedio()));
        mostrarSE.setText(String.valueOf(SistemaDeBecas.listaPostulante.get(index).getPerfil().getSituacionEconomica()));
        mostrarOM.setText(String.valueOf(SistemaDeBecas.listaPostulante.get(index).getPerfil().getOrdenDeMerito()));
        mostrarES.setText(String.valueOf(SistemaDeBecas.listaSolicitudes.get(index).getEstado()));
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        beca1 = new ClasesParaZava.Beca();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cambioBeca = new javax.swing.JButton();
        mostrarEdad = new javax.swing.JTextField();
        mostrarNombre = new javax.swing.JTextField();
        mostrarOM = new javax.swing.JTextField();
        mostrarPromedio = new javax.swing.JTextField();
        mostrarSE = new javax.swing.JTextField();
        mostrarDNI = new javax.swing.JTextField();
        mostrarES = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cambioBeca1 = new javax.swing.JButton();

        jLabel3.setText("DNI");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombres y Apellidos");

        jLabel2.setText("Edad");

        jLabel4.setText("Promedio");

        jLabel5.setText("Situación Económica");

        jLabel6.setText("Orden de Mérito");

        jLabel7.setText("Estado de Solicitud");

        cambioBeca.setText("Desaprobar Beca");
        cambioBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioBecaActionPerformed(evt);
            }
        });

        mostrarEdad.setEditable(false);

        mostrarNombre.setEditable(false);

        mostrarOM.setEditable(false);

        mostrarPromedio.setEditable(false);

        mostrarSE.setEditable(false);

        mostrarDNI.setEditable(false);

        mostrarES.setEditable(false);

        jLabel8.setText("DNI");

        cambioBeca1.setText("Aprobar Beca");
        cambioBeca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioBeca1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(117, 117, 117))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(mostrarPromedio)
                                            .addGap(59, 59, 59)))
                                    .addComponent(mostrarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mostrarOM, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mostrarSE)
                                            .addComponent(mostrarES, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(mostrarDNI, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addComponent(mostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(cambioBeca1)
                        .addGap(18, 18, 18)
                        .addComponent(cambioBeca)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(mostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrarPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrarSE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrarOM, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(mostrarES, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambioBeca)
                    .addComponent(cambioBeca1))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambioBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioBecaActionPerformed
            //Cambia el estado de la beca a desaprobada
            //si ya esta desaprobada muestra error
            if(SistemaDeBecas.listaSolicitudes.get(index).isAprobada()==true){
            SistemaDeBecas.listaSolicitudes.get(index).setAprobada(false);
            SistemaDeBecas.listaSolicitudes.get(index).setEstado("Desaprobada");
            JOptionPane.showMessageDialog(this, "Estado Cambiado con Éxito", "!", JOptionPane.INFORMATION_MESSAGE);
            mostrarES.setText(String.valueOf(SistemaDeBecas.listaSolicitudes.get(index).getEstado()));
            }else JOptionPane.showMessageDialog(this, "Ya está desaprobada", "Error", JOptionPane.ERROR_MESSAGE);
            
    }//GEN-LAST:event_cambioBecaActionPerformed

    private void cambioBeca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioBeca1ActionPerformed
            //Cambia el estado de la beca a aprobada
            //si ya esta aprobada muestra error
            if(SistemaDeBecas.listaSolicitudes.get(index).isAprobada()==false){
            SistemaDeBecas.listaSolicitudes.get(index).setAprobada(true);
            SistemaDeBecas.listaSolicitudes.get(index).setEstado("Aprobada");
            JOptionPane.showMessageDialog(this, "Estado Cambiado con Éxito", "!", JOptionPane.INFORMATION_MESSAGE);
            mostrarES.setText(String.valueOf(SistemaDeBecas.listaSolicitudes.get(index).getEstado()));
            }else JOptionPane.showMessageDialog(this, "Ya está aprobada", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_cambioBeca1ActionPerformed

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
            java.util.logging.Logger.getLogger(PerfilDetallado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilDetallado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilDetallado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilDetallado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            private int index;
            public void run() {
                new PerfilDetallado(this.index).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ClasesParaZava.Beca beca1;
    private javax.swing.JButton cambioBeca;
    private javax.swing.JButton cambioBeca1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mostrarDNI;
    private javax.swing.JTextField mostrarES;
    private javax.swing.JTextField mostrarEdad;
    private javax.swing.JTextField mostrarNombre;
    private javax.swing.JTextField mostrarOM;
    private javax.swing.JTextField mostrarPromedio;
    private javax.swing.JTextField mostrarSE;
    // End of variables declaration//GEN-END:variables
}
