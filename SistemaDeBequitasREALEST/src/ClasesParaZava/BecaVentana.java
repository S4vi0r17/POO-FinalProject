package ClasesParaZava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BecaVentana extends JFrame {

    int actual;
    private BecaPanel academicaPanel;
    private BecaPanel deportivaPanel;
    private JButton guardarBoton;

    public BecaVentana(int actual) {
        this.actual = actual;
        setTitle("Solicitud de Beca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        academicaPanel = new BecaPanel("Académica", "Descripción ", "300", "12 meses");
        deportivaPanel = new BecaPanel("Deportiva", "Descripción", "700", "6 meses");

        guardarBoton = new JButton("Guardar");
        guardarBoton.addActionListener((ActionEvent e) -> {
            String tipoBeca = getBecaSeleccionada();
            System.out.println("Guardando la solicitud de beca: " + tipoBeca);
            JOptionPane.showMessageDialog(BecaVentana.this, "Usted ya ha solicitado la beca", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        });

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();
        grid.gridx = 0;
        grid.gridy = 0;
        grid.anchor = GridBagConstraints.WEST;
        grid.insets = new Insets(6, 8, 8, 8);

        panel.add(academicaPanel, grid);
        grid.gridy++;
        panel.add(deportivaPanel, grid);
        grid.gridy++;
        panel.add(guardarBoton, grid);

        add(panel);
        pack();
        setSize(300, 300);  
        setVisible(true);
    }

    public BecaVentana() {
        setTitle("Solicitud de Beca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        academicaPanel = new BecaPanel("Académica", "Descripción ", "300", "12 meses");
        deportivaPanel = new BecaPanel("Deportiva", "Descripción", "700", "6 meses");

        guardarBoton = new JButton("Guardar");
        guardarBoton.addActionListener((ActionEvent e) -> {
            String tipoBeca = getBecaSeleccionada();
            System.out.println("Guardando la solicitud de beca: " + tipoBeca);
            JOptionPane.showMessageDialog(BecaVentana.this, "Usted ya ha solicitado la beca", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        });

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();
        grid.gridx = 0;
        grid.gridy = 0;
        grid.anchor = GridBagConstraints.WEST;
        grid.insets = new Insets(6, 8, 8, 8);

        panel.add(academicaPanel, grid);
        grid.gridy++;
        panel.add(deportivaPanel, grid);
        grid.gridy++;
        panel.add(guardarBoton, grid);

        add(panel);
        pack();
        setSize(300, 300);  
        setVisible(true);
    }
    
    private String getBecaSeleccionada() {
        if (academicaPanel.seleccionada()) {
            Solicitud solicitud = new Solicitud(SistemaDeBecas.listaPostulante.get(actual),SistemaDeBecas.listaBecas.get(0));
            SistemaDeBecas.listaSolicitudes.add(solicitud);
            File.guardar(SistemaDeBecas.listaSolicitudes, "SOLICITUDES.txt");
            return academicaPanel.getTipoBeca();
        } else if (deportivaPanel.seleccionada()) {
            Solicitud solicitud = new Solicitud(SistemaDeBecas.listaPostulante.get(actual),SistemaDeBecas.listaBecas.get(1));
            SistemaDeBecas.listaSolicitudes.add(solicitud);
            File.guardar(SistemaDeBecas.listaSolicitudes, "SOLICITUDES.txt");
            return deportivaPanel.getTipoBeca();
        } else {
            return "Ninguna";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BecaVentana::new);
    }
}

class BecaPanel extends JPanel {

    private JRadioButton radioB;

    public BecaPanel(String tipoBeca, String descripcion, String monto, String duracion) {
        setLayout(new BorderLayout());

        radioB = new JRadioButton(tipoBeca);
        add(radioB, BorderLayout.WEST);

        JPanel detailsPanel = new JPanel(new GridLayout(3, 1));
        detailsPanel.add(new JLabel("Descripción: " + descripcion));
        detailsPanel.add(new JLabel("Monto: " + monto));
        detailsPanel.add(new JLabel("Duración: " + duracion));
        add(detailsPanel, BorderLayout.CENTER);
    }

    public boolean seleccionada() {
        return radioB.isSelected();
    }

    public String getTipoBeca() {
        return radioB.getText();
    }
}