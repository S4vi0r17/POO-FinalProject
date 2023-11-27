package ClasesParaZava;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int a=0;
        ArrayList<Postulante> postulantes = new ArrayList<>();
        ArrayList<Beca> becas = new ArrayList<>();
        ArrayList<Solicitud> solicitudes = new ArrayList<>();
        ArrayList<Personal> personales = new ArrayList<>();
        
        postulantes=File.extraer("POSTULANTES.txt");
        becas=File.extraer("BECAS.txt");
        solicitudes=File.extraer("SOLICITUDES.txt");
        personales=File.extraer("PERSONALES.txt");
        
        SistemaDeBecas.listaPostulante = postulantes;
        SistemaDeBecas.listaBecas = becas;
        SistemaDeBecas.listaPersonal = personales;
        SistemaDeBecas.listaSolicitudes= solicitudes;
        

        menu();
    }     
    
    public static void menu() {
        
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        
    }
     
    public static void ingresar1(int actual) {
     
        BecaVentana bv = new BecaVentana(actual);
        bv.setVisible(true);
        
    }
    
     public static void ingresar2(int actual) {
     
        VentanaEstadoSolicitud ves = new VentanaEstadoSolicitud(actual);
        ves.setVisible(true);
    }
    
    public static int ingresar() {
     
        Ingresar ing = new Ingresar();
        ing.show();
        return 1;
    }
    
    public static int postulantes(int actual)
    {
        PostulantesVentana posv = new PostulantesVentana(actual);
        posv.show();
        return 1;
    }
     
    
    public static int personal(int actual)
    {
         if(SistemaDeBecas.listaPersonal.get(actual) instanceof Evaluador)
                        {
                                    PersonalVentana pv = new PersonalVentana(actual);
                                    pv.show();
                        }
                        else
                        {
                                    PersonalVentana2 pv2 = new PersonalVentana2(actual);
                                    pv2.show();
                        }
         return 0;
    }       
    
    public static int administrador()
    {
        //Abre el menú de administrador
        //desde la base Admin
        Admin admin = new Admin();
        admin.setTitle("Administrador");
        admin.show();
        return 1;
    }
    
    public static int registrarPostulante() {
        
        ventanaPrincipal nv = new ventanaPrincipal();
        nv.show();
       
       
           return 1;
        }
    
    public static int numPersonal(String DNI,ArrayList<Personal> personal) {
        
        for(int t=0; t<personal.size();t++)
        {
            if(personal.get(t).getDNI().equals(DNI))
            {
                return t;
            }
        }
        return 0;
    }
    
    public static int numSolicitud(String DNI,ArrayList<Solicitud> solicitudes) {
        
        for(int t=0; t<solicitudes.size();t++)
        {
            if(solicitudes.get(t).getPostulante().getDNI().equals(DNI))
            {
                return t;
            }
        }
        return 0;
    }
    
    public static boolean comprobarExistencia(String DNI,ArrayList<Solicitud> solicitudes) {
        
        for(int t=0; t<solicitudes.size();t++)
        {
            if(solicitudes.get(t).getPostulante().getDNI().equals(DNI))
            {
                return true;
            }
        }
        return false;
    }
    
    public static boolean comprobarPostulante(String DNI,ArrayList<Postulante> Postulante) {
        
        for(int h=0; h<Postulante.size();h++)
        {
            if(Postulante.get(h).getDNI().equals(DNI))
            {
                return true;
            }
        }
        return false;
    }
    public static boolean comprobarEmpleado(String DNI,ArrayList<Personal> Personal) {
        
        for(int p=0; p<Personal.size();p++)
        {
            if(Personal.get(p).getDNI().equals(DNI))
            {
                return true;
            }
        }
        return false;
    }
      
}