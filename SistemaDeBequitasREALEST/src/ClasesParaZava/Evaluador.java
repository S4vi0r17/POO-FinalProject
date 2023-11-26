package ClasesParaZava;

import java.util.Scanner;

public class Evaluador extends Personal{

    
    public Evaluador(String nombre, String apellido, int edad, String DNI, int credencial, String usuario, String contra) {
        super(nombre, apellido, edad, DNI, credencial, usuario, contra);
    }

    public void evaluarSolicitud(Solicitud solicitud) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("::: EVALUAR SOLICITUD :::");
        
        Perfil perfil = solicitud.getPostulante().getPerfil();

        System.out.println("Perfil del Postulante:");
        System.out.println(perfil);

        if (perfil.getPromedio() >= 14.0 && perfil.getSituacionEconomica().equals("Mala") && perfil.getOrdenDeMerito()<10) {
            System.out.println("Solicitud Aprobada");
            solicitud.setAprobada(true);
            solicitud.setEstado("Aprobada la solicitud");
        } else {
            System.out.println("Solicitud Rechazada");
            solicitud.setAprobada(false);
            solicitud.setEstado("Rechazada");
        }

        System.out.println("Resultado de la Evaluación: " + solicitud.getEstado());

        actualizarListaSolicitudes(solicitud);
    }

    
    
    private void actualizarListaSolicitudes(Solicitud solicitud) {
    
        for (Solicitud s : SistemaDeBecas.listaSolicitudes) {
            if (s.equals(solicitud)) {
                s.setAprobada(solicitud.isAprobada());
                s.setEstado(solicitud.getEstado());
                break; 
            }
        }
    }
}
