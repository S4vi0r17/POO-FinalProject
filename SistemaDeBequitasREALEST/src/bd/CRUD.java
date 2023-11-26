package bd;

import java.sql.*;
import java.util.Scanner;

public class CRUD {

    Scanner scanner = new Scanner(System.in);

    Conexion conexion = new Conexion();

    public static void main(String[] args) {
        CRUD crud = new CRUD();
        crud.menu();
    }

    private void menu() {
        int opcion;
        int dniPostulante;
        try (Connection connection = conexion.conectar()) {
            System.out.println("Conexión exitosa a la base de datos");
            do {
                System.out.println("Ingrese una opcion del menu:");
                System.out.println("1. Listar postulantes");
                System.out.println("2. Eliminar postulante y solicitud por DNI");
                System.out.println("3. Actualizar estado de solicitud");
                System.out.println("4. Eliminar solicitud"); // TODO: Eliminar solicitud por ID
                System.out.println("5. Actualizar datos de postulante");
                System.out.println("6. Salir");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        mostrarPostulantes(connection);
                        break;
                    case 2:
                        System.out.println("Ingrese el DNI del postulante a eliminar:");
                        dniPostulante = scanner.nextInt();
                        eliminarPostulanteYsolicitud(connection, dniPostulante);
                        break;
                    case 3:
                        System.out.println("Ingrese el DNI del postulante a actualizar:");
                        dniPostulante = scanner.nextInt();
                        System.out.println("Ingrese el nuevo estado de la solicitud:");
                        String nuevoEstado = scanner.next();
                        actualizarEstadoSolicitud(connection, dniPostulante, nuevoEstado);
                        break;
                    case 4:
                        eliminarSolicitud(connection, 3);
                        break;
                    case 5:
                        System.out.println("Ingrese el ID del postulante a actualizar:");
                        int idPostulante = scanner.nextInt();
                        // Ingrese los nuevos datos del postulante
                        System.out.println("Ingrese el nuevo nombre del postulante:");
                        String nuevoNombre = scanner.next();
                        System.out.println("Ingrese el nuevo apellido del postulante:");
                        String nuevoApellido = scanner.next();
                        System.out.println("Ingrese la nueva edad del postulante:");
                        int nuevaEdad = scanner.nextInt();
                        System.out.println("Ingrese el nuevo DNI del postulante:");
                        String nuevoDNI = scanner.next();

                        actualizarPostulante(connection, nuevoNombre, nuevoApellido, nuevaEdad,
                                Integer.parseInt(nuevoDNI), idPostulante);
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } while (opcion != 6);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void eliminarPostulanteYsolicitud(Connection connection, int dniPostulante) throws SQLException {
        String deleteSolicitudQuery = "DELETE FROM Solicitud WHERE Postulante_ID = (SELECT ID FROM Postulante WHERE DNI = ?)";
        try (PreparedStatement deleteSolicitudStatement = connection.prepareStatement(deleteSolicitudQuery)) {
            deleteSolicitudStatement.setInt(1, dniPostulante);
            int filasSolicitudAfectadas = deleteSolicitudStatement.executeUpdate();

            String deletePostulanteQuery = "DELETE FROM Postulante WHERE DNI = ?";
            try (PreparedStatement deletePostulanteStatement = connection.prepareStatement(deletePostulanteQuery)) {
                deletePostulanteStatement.setInt(1, dniPostulante);
                int filasPostulanteAfectadas = deletePostulanteStatement.executeUpdate();

                if (filasPostulanteAfectadas > 0) {
                    System.out.println("Postulante con DNI " + dniPostulante + " eliminado correctamente.");
                    System.out.println("Se eliminaron " + filasSolicitudAfectadas + " solicitud(es) asociada(s).");
                } else {
                    System.out.println("No se encontró ningún postulante con el DNI proporcionado.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al intentar eliminar el postulante y sus solicitudes: " + e.getMessage());
        }
    }

    private static void actualizarEstadoSolicitud(Connection connection, int dniPostulante, String nuevoEstado)
            throws SQLException {
        String updateEstadoQuery = "UPDATE Solicitud SET Estado = ? WHERE Postulante_ID = (SELECT ID FROM Postulante WHERE DNI = ?)";
        try (PreparedStatement statement = connection.prepareStatement(updateEstadoQuery)) {
            statement.setString(1, nuevoEstado);
            statement.setInt(2, dniPostulante);
            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println(
                        "Estado de la solicitud actualizado correctamente para el postulante con DNI " + dniPostulante);
            } else {
                System.out.println(
                        "No se encontró ningún postulante con el DNI proporcionado o no hay solicitudes asociadas.");
            }
        } catch (SQLException e) {
            System.out.println("Error al intentar actualizar el estado de la solicitud: " + e.getMessage());
        }
    }

    private static void eliminarSolicitud(Connection connection, int idPostulante) throws SQLException {
        String deleteSolicitudQuery = "DELETE FROM Solicitud WHERE Postulante_ID = ?";
        try (PreparedStatement statement = connection.prepareStatement(deleteSolicitudQuery)) {
            statement.setInt(1, idPostulante);
            statement.executeUpdate();
        }
        System.out.println("Solicitud eliminada correctamente.");
    }

    private static void actualizarPostulante(Connection connection, String nuevoNombre, String nuevoApellido,
            int nuevaEdad, int nuevoDNI, int idPostulante) throws SQLException {

        String updatePostulanteQuery = "UPDATE Postulante SET Nombre = ?, Apellido = ?, Edad = ?, DNI = ? WHERE ID = ?";
        try (PreparedStatement statement = connection.prepareStatement(updatePostulanteQuery)) {
            statement.setString(1, nuevoNombre);
            statement.setString(2, nuevoApellido);
            statement.setInt(3, nuevaEdad);
            statement.setInt(4, nuevoDNI);
            statement.setInt(5, idPostulante);

            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Datos del postulante actualizados correctamente.");
            } else {
                System.out.println("No se encontró ningún postulante con el ID proporcionado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al intentar actualizar los datos del postulante: " + e.getMessage());
        }
    }

    private static void mostrarPostulantes(Connection connection) throws SQLException {
        String selectPostulantesQuery = "SELECT p.ID, p.Nombre, p.Apellido, p.DNI, s.Estado " +
                "FROM Postulante p " +
                "LEFT JOIN Solicitud s ON p.ID = s.Postulante_ID";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(selectPostulantesQuery);
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String nombre = resultSet.getString("Nombre");
                String apellido = resultSet.getString("Apellido");
                String dni = resultSet.getString("DNI");
                String estadoSolicitud = resultSet.getString("Estado");

                System.out.println("ID: " + id +
                        ", Nombre: " + nombre +
                        ", Apellido: " + apellido +
                        ", DNI: " + dni +
                        ", Estado de solicitud: " + estadoSolicitud);
            }
        }
    }

}