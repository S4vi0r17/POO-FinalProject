package ClasesParaZava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaE {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaE();
            }
        });
    }

    public VentanaE() {
        JFrame frame = new JFrame("¡Aviso!");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mostrarVentanaEmergente();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void mostrarVentanaEmergente() {
        JOptionPane.showMessageDialog(null, "Usted ya ha solicitado la beca", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
