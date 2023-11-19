package GUI;

/**
 *
 * @author GBP17
 */
public class Evaluador extends javax.swing.JFrame {

    public Evaluador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEvaluador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPostulantes = new javax.swing.JList<>();
        labelNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        labelApellido = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        labelDNI = new javax.swing.JLabel();
        campoDNI = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        labelEstado = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        botonGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Iosevka NFM Light", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido User");

        jScrollPane1.setViewportView(listaPostulantes);

        labelNombre.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 20)); // NOI18N
        labelNombre.setText("Nombres:");

        campoNombre.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 18)); // NOI18N

        labelApellido.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 20)); // NOI18N
        labelApellido.setText("Apellidos:");

        campoApellido.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 18)); // NOI18N

        labelDNI.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 20)); // NOI18N
        labelDNI.setText("DNI:");

        campoDNI.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 18)); // NOI18N

        labelDireccion.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 20)); // NOI18N
        labelDireccion.setText("Dirección:");

        campoDireccion.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 18)); // NOI18N

        labelEstado.setFont(new java.awt.Font("RobotoMono Nerd Font", 0, 20)); // NOI18N
        labelEstado.setText("Estado:");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Aprobado", "Rechazado" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        botonGuardarCambios.setFont(new java.awt.Font("Iosevka NFP ExtraBold", 0, 24)); // NOI18N
        botonGuardarCambios.setText("Guardar Cambios");

        javax.swing.GroupLayout panelEvaluadorLayout = new javax.swing.GroupLayout(panelEvaluador);
        panelEvaluador.setLayout(panelEvaluadorLayout);
        panelEvaluadorLayout.setHorizontalGroup(
            panelEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEvaluadorLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panelEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEvaluadorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEvaluadorLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(panelEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEstado)
                            .addComponent(labelApellido)
                            .addComponent(labelNombre)
                            .addComponent(labelDNI)
                            .addComponent(labelDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoDireccion)
                            .addComponent(campoDNI)
                            .addComponent(campoNombre)
                            .addComponent(campoApellido)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEvaluadorLayout.createSequentialGroup()
                        .addComponent(botonGuardarCambios)
                        .addGap(111, 111, 111))))
        );
        panelEvaluadorLayout.setVerticalGroup(
            panelEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEvaluadorLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(panelEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEvaluadorLayout.createSequentialGroup()
                        .addGroup(panelEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelApellido)
                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(panelEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDNI))
                        .addGap(18, 18, 18)
                        .addGroup(panelEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDireccion))
                        .addGap(18, 18, 18)
                        .addGroup(panelEvaluadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEstado)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(botonGuardarCambios)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEvaluador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEvaluador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Evaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evaluador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardarCambios;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JList<String> listaPostulantes;
    private javax.swing.JPanel panelEvaluador;
    // End of variables declaration//GEN-END:variables
}
