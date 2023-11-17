import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Postulantes extends JFrame{
    private JPanel panel1;
    private JTextField nombres;
    private JTextField apellidos;
    private JTextField dni;
    private JTextField direccion;
    private JButton guardarbtn;
    private JLabel labelTitulo;
    private JLabel labelDireccion;
    private JLabel labelDNI;
    private JLabel labelApellidos;
    private JLabel labelNombres;
    private JButton consultarbtn;
    private JList lista;
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    DefaultListModel mod = new DefaultListModel();

    public Postulantes(){
        consultarbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    listar();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        guardarbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    insertar();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public static void main(String[] args) {
        Postulantes f = new Postulantes();
        f.setContentPane(new Postulantes().panel1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.pack();
    }

    public void listar() throws SQLException {
        conectar();
        lista.setModel(mod);
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM estudiantes");
        mod.removeAllElements();

        while (rs.next()){
            mod.addElement(rs.getString("nombre") + " " + rs.getString("apellido") + " " + rs.getString("dni") + " " + rs.getString("direccion"));

        }
    }

    public void insertar() throws SQLException {
        conectar();
        ps = con.prepareStatement("INSERT INTO estudiantes (nombre, apellido, dni, direccion) VALUES (?,?,?,?)");
        ps.setString(1, nombres.getText());
        ps.setString(2, apellidos.getText());
        ps.setString(3, dni.getText());
        ps.setString(4, direccion.getText());

        if (ps.executeUpdate() > 0){
            lista.setModel(mod);

            mod.addElement("Insercion exitosa");

            JOptionPane.showMessageDialog(null, "Postulante agregado");

            nombres.setText("");
            apellidos.setText("");
            dni.setText("");
            direccion.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Error al agregar postulante");
        }
    }

    public void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/postulantes", "root", "benites1234");
            JOptionPane.showMessageDialog(null, "Conectado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar");
        }
    }
}



