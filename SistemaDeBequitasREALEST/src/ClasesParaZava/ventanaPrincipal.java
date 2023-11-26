package ClasesParaZava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ventanaPrincipal extends JFrame {
    static ArrayList<Postulante> listaPostulante = new ArrayList<>();
    
    public JPanel panel;
    public JLabel exito;
    public JTextField espacio;
    public JTextField esp_apellidos;
    public JTextField esp_DNI;
    public JTextField esp_edad;
    public JTextField esp_usuario;
    public JTextField esp_contra;
    public JTextField esp_promedio;
    public JTextField esp_SE;
    public JTextField esp_OM;

    public ventanaPrincipal() {
        this.setSize(500, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Sistema de becas - Registro de datos");
        setLocationRelativeTo(null);

        Panel();
        Etiquetas();
        Botones();
        C_Texto();
    }

    private void Panel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void Etiquetas() {
        JLabel etiqueta = new JLabel("Nombres:", SwingConstants.CENTER);
        JLabel etiqueta1 = new JLabel("Apellidos: ", SwingConstants.CENTER);
        JLabel etiqueta2 = new JLabel("Edad: ", SwingConstants.CENTER);
        JLabel etiqueta3 = new JLabel("DNI: ", SwingConstants.CENTER);
        JLabel etiqueta5 = new JLabel("Crear usuario:", SwingConstants.CENTER);
        JLabel etiqueta6 = new JLabel("Crear clave:", SwingConstants.CENTER);
        JLabel etiqueta7 = new JLabel("Promedio:", SwingConstants.CENTER);
        JLabel etiqueta8 = new JLabel("Situación económica:", SwingConstants.CENTER);
        JLabel etiqueta9 = new JLabel("Orden de mérito:", SwingConstants.CENTER);
        
      
        etiqueta.setOpaque(true);
        etiqueta.setBounds(20, 20, 100, 30);
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(etiqueta);

        etiqueta1.setOpaque(true);
        etiqueta1.setBounds(20, 60, 100, 30);
        etiqueta1.setForeground(Color.BLACK);
        etiqueta1.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(etiqueta1);

        etiqueta2.setOpaque(true);
        etiqueta2.setBounds(20, 100, 100, 30);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(etiqueta2);

        etiqueta3.setOpaque(true);
        etiqueta3.setBounds(20, 140, 100, 30);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(etiqueta3);
        
        
        etiqueta5.setOpaque(true);
        etiqueta5.setBounds(20, 180, 100, 30);
        etiqueta5.setForeground(Color.BLACK);
        etiqueta5.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(etiqueta5);
        
        
        etiqueta6.setOpaque(true);
        etiqueta6.setBounds(20, 220, 100, 30);
        etiqueta6.setForeground(Color.BLACK);
        etiqueta6.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(etiqueta6);
        
        
        etiqueta7.setOpaque(true);
        etiqueta7.setBounds(20, 260, 100, 30);
        etiqueta7.setForeground(Color.BLACK);
        etiqueta7.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(etiqueta7);
        
        
        etiqueta8.setOpaque(true);
        etiqueta8.setBounds(20, 300, 100, 30);
        etiqueta8.setForeground(Color.BLACK);
        etiqueta8.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(etiqueta8);
        
        
        etiqueta9.setOpaque(true);
        etiqueta9.setBounds(20, 340, 100, 30);
        etiqueta9.setForeground(Color.BLACK);
        etiqueta9.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(etiqueta9);
        
        
    }

    private void Botones() {
        JButton boton = new JButton();
        boton.setText("Guardar");
        boton.setBounds(200, 390, 100, 30);
        boton.setEnabled(true);
        boton.setForeground(Color.RED);
        boton.setBackground(Color.WHITE);
        boton.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(boton);

        exito = new JLabel();
        exito.setBounds(180, 400, 200, 30);
        panel.add(exito);

        // Evento
        ActionListener evento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent action) {
                registrarPostulante();
                mostrarPostulantes();
                exito.setText("Datos guardados con éxito " + espacio.getText());
            }
        };

        boton.addActionListener(evento);
    }

    private void C_Texto() {
        espacio = new JTextField();
        espacio.setBounds(140, 20, 300, 30);
        panel.add(espacio);

        esp_apellidos = new JTextField();
        esp_apellidos.setBounds(140, 60, 300, 30);
        panel.add(esp_apellidos);
        
        esp_edad = new JTextField();
        esp_edad.setBounds(140, 100, 300, 30);
        panel.add(esp_edad);
        
        esp_DNI = new JTextField();
        esp_DNI.setBounds(140, 140, 300, 30);
        panel.add(esp_DNI);
        
        esp_contra= new JTextField();
        esp_contra.setBounds(140,180,300,30);
        panel.add(esp_contra);
        
        esp_usuario=new JTextField();
        esp_usuario.setBounds(140,220,300,30);
        panel.add(esp_usuario);
        
        esp_promedio=new JTextField();
        esp_promedio.setBounds(140,260,300,30);
        panel.add(esp_promedio);
        
        esp_SE=new JTextField();
        esp_SE.setBounds(140,300,300,30);
        panel.add(esp_SE);
        
        esp_OM=new JTextField();
        esp_OM.setBounds(140,340,300,30);
        panel.add(esp_OM);

        
    }
private void registrarPostulante() {
    String nombre = espacio.getText();
    String apellidos = esp_apellidos.getText();
    String dni = esp_DNI.getText();
    String edad = esp_edad.getText(); 
    String usuario = esp_usuario.getText(); 
    String contra = esp_contra.getText(); 
    Double promedio = Double.valueOf(esp_promedio.getText());
    String SE = esp_SE.getText();
    int OM = Integer.parseInt(esp_OM.getText());
    
    Perfil perfil = new Perfil(promedio,SE,OM);
   
    Postulante nuevoPostulante = new Postulante(nombre, apellidos, Integer.parseInt(edad), dni, usuario, contra,perfil);

    SistemaDeBecas.listaPostulante.add(nuevoPostulante);
    
    File.guardar(SistemaDeBecas.listaPostulante, "POSTULANTES.txt");
    
    System.out.println("Nuevo postulante registrado: " + nuevoPostulante);
    


    espacio.setText("");
    esp_apellidos.setText("");
    esp_edad.setText("");
    esp_DNI.setText("");
    esp_usuario.setText("");
    esp_contra.setText("");
}


    void mostrarPostulantes() {
        System.out.println("Lista de Postulantes:");

        for (Postulante postulante : listaPostulante) {
            System.out.println(postulante.toString());
            System.out.println("--------------------");
        }
    }

}
