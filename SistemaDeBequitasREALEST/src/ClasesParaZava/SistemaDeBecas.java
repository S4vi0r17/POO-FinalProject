package ClasesParaZava;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SistemaDeBecas {
    static ArrayList<Beca> listaBecas = new ArrayList<>();
    static ArrayList<Personal> listaPersonal = new ArrayList<>();
    static ArrayList<Solicitud> listaSolicitudes = new ArrayList<>();    
    static ArrayList<Postulante> listaPostulante = new ArrayList<>();
    
    public void registrarBeca(ArrayList<Beca> listaBecas1){
        /*recibir un postulante agregar a lista*/
        listaBecas = listaBecas1;     
    }
    
    static public void registrarBeca(Beca nuevaBeca) {
        listaBecas.add(nuevaBeca);
    }      
    
    static public void mostrarBecas() {
        System.out.println(listaBecas);
    System.out.println("Lista de Becas:");

    for (Beca beca : listaBecas) {
        System.out.println(beca.toString());
        System.out.println("--------------------");
    }
    }

    static public ArrayList<Beca> getListaBecas() {
        return listaBecas;
    }

    static public ArrayList<Personal> getListaPersonal() {
        return listaPersonal;
    }

    static public ArrayList<Solicitud> getListaSolicitudes() {
        return listaSolicitudes;
    }

    static public ArrayList<Postulante> getListaPostulante() {
        return listaPostulante;
    }
        
    public void setPostulante(ArrayList<Postulante> listaPostulantes1){
        /*recibir un postulante agregar a lista*/
        this.listaPostulante = listaPostulantes1;     
    }
    
    public void registrarPostulante(Postulante nuevoPostulante) {
        this.listaPostulante.add(nuevoPostulante);
    }       
    //duda
    public void mostrarPostulantes() {
    System.out.println("Lista de Postulantes:");

    for (Postulante postulante : listaPostulante) {
        System.out.println(postulante.toString());
        System.out.println("--------------------");
    }
    }
    
    public void setPersonal(ArrayList<Personal> listaPersonal1) {
        listaPersonal = listaPersonal1;
    }

    public void registrarPersonal(Personal nuevoPersonal) {
        listaPersonal.add(nuevoPersonal);
    }
    //duda
    public void mostrarPersonal() {
    System.out.println("Lista de Personal:");

    for (Personal personal : listaPersonal) {
        System.out.println(personal.toString());
        System.out.println("--------------------");
    }
    }
    
    public void setSolicitud(ArrayList<Solicitud> listaSolicitudes1) {
        listaSolicitudes = listaSolicitudes1;
    }

    public void registrarSolicitud(Solicitud nuevoSolicitud) {
        listaSolicitudes.add(nuevoSolicitud);
    }
    //duda
    public void mostrarSolicitudes() {
    System.out.println("Lista de Solicitudes:");

    for (Solicitud solicitud : listaSolicitudes) {
        System.out.println(solicitud.toString());
        System.out.println("--------------------");
    }
    }
    
    static public void realizarEvaluacion(int n){
        Scanner scanner = new Scanner(System.in);

            System.out.println("::: EVALUAR SOLICITUD :::");

            Perfil perfil = SistemaDeBecas.listaSolicitudes.get(n).getPostulante().getPerfil();

            System.out.println("Perfil del Postulante:");
            System.out.println(perfil);

            
            if (perfil.getPromedio() >= 14.0 && perfil.getSituacionEconomica().equals("Mala") && perfil.getOrdenDeMerito()<10) {
                System.out.println("Solicitud Aprobada");
                SistemaDeBecas.listaSolicitudes.get(n).setAprobada(true);
                SistemaDeBecas.listaSolicitudes.get(n).setEstado("Evaluado");
            } else {
                System.out.println("Solicitud Rechazada");
                SistemaDeBecas.listaSolicitudes.get(n).setAprobada(false);
                SistemaDeBecas.listaSolicitudes.get(n).setEstado("Evaluado");
            }

            System.out.println("Resultado de la Evaluación: " + SistemaDeBecas.listaSolicitudes.get(n).getEstado());

            actualizarListaSolicitudes(SistemaDeBecas.listaSolicitudes.get(n));
        
}
    
    static public void actualizarListaSolicitudes(Solicitud solicitud) {
    
        for (Solicitud s : SistemaDeBecas.listaSolicitudes) {
            if (s.equals(solicitud)) {
                s.setAprobada(solicitud.isAprobada());
                s.setEstado(solicitud.getEstado());
                break; 
            }
        }
    }
        
       static public void realizarEntrevista(int n) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Realizando entrevista...");
      try {
        TimeUnit.SECONDS.sleep(2);
      } catch (InterruptedException e) {
      }
      System.out.println("La entrevista fue exitosa.");

      int respuesta;
      do {
        System.out.print("¿El postulante pasó la prueba? (Ingrese 1 si pasó o 2 para no pasó): ");
        respuesta = scanner.nextInt();
      } while (respuesta < 1 || respuesta > 2);

    }
        
        public void consultarEstadoSolicitud(int n){            
           listaSolicitudes.get(n).getEstado();
    }
   
}
