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
        int idPostulante;
        try (Connection connection = conexion.conectar()) {
            System.out.println("Conexión exitosa a la base de datos");
            do {
                System.out.println("Ingrese una opcion del menu:");
                System.out.println("1. Listar postulantes");
                System.out.println("2. Eliminar postulante y solicitud por DNI");
                System.out.println("3. Actualizar estado de solicitud");
                System.out.println("4. Eliminar solicitud"); // Eliminar solicitud por ID
                System.out.println("5. Actualizar datos de postulante");
                System.out.println("6. Añadir postulante");
                System.out.println("7. Salir");
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
                        System.out.println("Ingrese el ID del postulante:");
                        idPostulante = scanner.nextInt();
                        scanner.nextLine(); // Consumir el carácter de nueva línea pendiente
                        eliminarSolicitud(connection, idPostulante);
                        break;
                    case 5:
                        System.out.println("Ingrese el ID del postulante a actualizar:");
                        idPostulante = scanner.nextInt();
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
                        aniadirPostulante(connection, scanner);
                        break;
                    case 7:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } while (opcion != 7);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // C = Create
    private static void aniadirPostulante(Connection connection, Scanner scanner) throws SQLException {
        scanner.nextLine();
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Apellido:");
        String apellido = scanner.nextLine();
        // Resto del código sin cambios
        System.out.println("Edad:");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("DNI:");
        String dni = scanner.nextLine();
        System.out.println("Usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Contraseña:");
        String contrasena = scanner.nextLine();

        // Solicitar datos del perfil
        System.out.println("Ingrese los datos del perfil:");
        System.out.println("Promedio:");
        double promedio = Double.parseDouble(scanner.nextLine());
        System.out.println("Situación Económica:");
        String situacionEconomica = scanner.nextLine();
        System.out.println("Orden de Mérito:");
        int ordenDeMerito = Integer.parseInt(scanner.nextLine());

        // Insertar datos en la tabla Perfil
        String insertPerfilQuery = "INSERT INTO Perfil (Promedio, SituacionEconomica, OrdenDeMerito) VALUES (?, ?, ?)";
        int idPerfil = -1;

        try (PreparedStatement perfilStatement = connection.prepareStatement(insertPerfilQuery,
                Statement.RETURN_GENERATED_KEYS)) {
            perfilStatement.setDouble(1, promedio);
            perfilStatement.setString(2, situacionEconomica);
            perfilStatement.setInt(3, ordenDeMerito);

            int filasAfectadas = perfilStatement.executeUpdate();

            if (filasAfectadas > 0) {
                ResultSet generatedKeys = perfilStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    idPerfil = generatedKeys.getInt(1);
                }
                System.out.println("Perfil añadido correctamente con ID " + idPerfil);
            } else {
                System.out.println("No se pudo añadir el perfil.");
            }
        } catch (SQLException e) {
            System.out.println("Error al intentar añadir el perfil: " + e.getMessage());
        }

        // Insertar datos en la tabla Postulante
        if (idPerfil != -1) {
            String insertPostulanteQuery = "INSERT INTO Postulante (Nombre, Apellido, Edad, DNI, Usuario, Contra, Perfil_ID) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement postulanteStatement = connection.prepareStatement(insertPostulanteQuery)) {
                postulanteStatement.setString(1, nombre);
                postulanteStatement.setString(2, apellido);
                postulanteStatement.setInt(3, edad);
                postulanteStatement.setString(4, dni);
                postulanteStatement.setString(5, usuario);
                postulanteStatement.setString(6, contrasena);
                postulanteStatement.setInt(7, idPerfil);

                int filasAfectadas = postulanteStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Postulante añadido correctamente.");
                } else {
                    System.out.println("No se pudo añadir el postulante.");
                }
            } catch (SQLException e) {
                System.out.println("Error al intentar añadir el postulante: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo añadir el postulante debido a un problema con el perfil.");
        }
    }

    // R = Read
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

    // U = Update
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

    // U = Update
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

    // D = Delete
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

    // D = Delete
    private static void eliminarSolicitud(Connection connection, int idPostulante) throws SQLException {
        String deleteSolicitudQuery = "DELETE FROM Solicitud WHERE Postulante_ID = ?";

        try (PreparedStatement deleteStatement = connection.prepareStatement(deleteSolicitudQuery)) {
            deleteStatement.setInt(1, idPostulante);

            int filasAfectadas = deleteStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println(
                        "Se eliminaron " + filasAfectadas + " solicitud(es) para el postulante con ID " + idPostulante);
            } else {
                System.out.println("No se encontraron solicitudes para el postulante con ID " + idPostulante);
            }
        } catch (SQLException e) {
            System.out.println("Error al intentar eliminar la solicitud: " + e.getMessage());
        }
    }
}