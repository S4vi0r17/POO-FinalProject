package ClasesParaZava;

import javax.swing.*;
import java.awt.*;

public class VentanaEstadoSolicitud extends JFrame {
    int actual;
    public VentanaEstadoSolicitud(int actual) {
        this.actual = actual;
        setTitle("Estado de Solicitud");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel contenidoPanel = new JPanel();
        contenidoPanel.setLayout(new BoxLayout(contenidoPanel, BoxLayout.Y_AXIS));

        String mensaje = null;

        switch (SistemaDeBecas.listaSolicitudes.get(actual).getEstado()) {
            case "Enviada":
                mensaje = "La solicitud está derivada.";
                break;
            case "Aprobada":
                mensaje = "La solicitud ha sido Aprobada.";
                break;
            case "Rechazada":
                mensaje = "Lo sentimos, la solicitud ha sido desaprobada.";
                break;
        }

        JLabel labelTitulo = new JLabel("Estado de Solicitud:");
        JLabel labelMensaje = new JLabel(mensaje);
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 14)); 
        labelMensaje.setFont(new Font("Arial", Font.PLAIN, 14));

        contenidoPanel.add(labelTitulo);
        contenidoPanel.add(Box.createVerticalStrut(10)); 
        contenidoPanel.add(labelMensaje);

        mainPanel.add(contenidoPanel, BorderLayout.CENTER);

        getContentPane().add(mainPanel);

        setSize(350, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaEstadoSolicitud(0));
    }
}