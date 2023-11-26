package ClasesParaZava;
import java.util.ArrayList;
import java.util.Scanner;

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
        menu.show();
        
    }
     
    public static void ingresar1(int actual) {
     
        Scanner scanner = new Scanner(System.in);
        int numero;
        clearScreen();

        if (comprobarExistencia(SistemaDeBecas.getListaPostulante().get(actual).getDNI(), SistemaDeBecas.listaSolicitudes)) {
            System.out.println("Ya tiene una solicitud");
        } else {
            System.out.println("-----Realizar solicitud---------");
            System.out.println("Seleccione Beca");

            for (int j = 0; j < SistemaDeBecas.listaBecas.size(); j++) {
                System.out.print((j + 1) + ".- ");
                System.out.print(SistemaDeBecas.getListaBecas().get(j).getDescripcion());
                System.out.print("\n");
            }

            numero = scanner.nextInt();
            Solicitud s1 = new Solicitud(SistemaDeBecas.listaPostulante.get(actual), SistemaDeBecas.listaBecas.get(numero-1));
            SistemaDeBecas.listaSolicitudes.add(s1);
            System.out.println("---Solicitud realizada----");
            File.guardar(SistemaDeBecas.listaSolicitudes, "SOLICITUDES.txt");
            
        }  
    }
    
     public static void ingresar2(int actual) {
     
        int num;
        if (comprobarExistencia(SistemaDeBecas.getListaPostulante().get(actual).getDNI(), SistemaDeBecas.listaSolicitudes)) {
            num = numSolicitud(SistemaDeBecas.getListaPostulante().get(actual).getDNI(), SistemaDeBecas.listaSolicitudes);
            System.out.print("\nEstado de Solicitud: ");
            System.out.println(SistemaDeBecas.getListaSolicitudes().get(num).getEstado());
        } else {
            System.out.println("No tiene hecha ninguna solicitud");
        }
    }
    
    public static int ingresar() {
     
        Ingresar ing = new Ingresar();
        ing.show();
        return 1;
    }
    
    public static int postulantes(int actual)
    {
         Scanner scanner = new Scanner(System.in);
        clearScreen();
        System.out.println("----Opcion-----");
        System.out.println("1.-Realizar solicitud");
        System.out.println("2.-Revisar estado de solicitud");
                        
        switch (scanner.nextInt()) {
            case 1:
                ingresar1(actual);
                break;
            case 2:
                ingresar2(actual);
                break;
            default:
                System.out.println("Número no válido");
            }
        return retorno();
    }
     
    
    public static int personal(int actual)
    {
         clearScreen();
         Scanner scanner = new Scanner(System.in);
                        int n;
                        String D;
                        if(SistemaDeBecas.listaPersonal.get(actual) instanceof Evaluador)
                        {
                            System.out.println("Digitar DNI de postulante a evaluar solicitud");
                            D=scanner.nextLine();
                            
                            if (comprobarExistencia(D, SistemaDeBecas.listaSolicitudes)) {
                                n=numSolicitud(D,SistemaDeBecas.listaSolicitudes);
                                SistemaDeBecas.realizarEvaluacion(n);
                                File.guardar(SistemaDeBecas.listaSolicitudes, "SOLICITUDES.txt");
                            }         
                            else
                            {
                              System.out.println("El postulante no gestiono ninguna solicitud");
                            }
                            return retorno();
                        }
                        
                        else
                        {
                           if(SistemaDeBecas.listaPersonal.get(actual) instanceof Entrevistador)
                        {
                            System.out.println("Digitar DNI de postulante Entrevistar");
                            D=scanner.nextLine();
                            
                            if (comprobarExistencia(D, SistemaDeBecas.listaSolicitudes)) {
                                n=numSolicitud(D,SistemaDeBecas.listaSolicitudes);
                            
                                if(SistemaDeBecas.listaSolicitudes.get(n).isAprobada()==true)
                                {
                                    SistemaDeBecas.realizarEntrevista(n);
                                }
                                else
                                {
                                    System.out.println("Todavia no ha sido evaluada la solicitud del postulante");
                                }
                            }         
                            else
                            {
                              System.out.println("Error no se cuenta con ninguna solicitud");
                            }
                            
                            return retorno();
                        }
                        }
        return 0;
    }
    
    public static int administrador()
    {
        //Abre el menú de administrador
        //desde la base Admin
        Admin admin = new Admin(SistemaDeBecas.listaSolicitudes,SistemaDeBecas.listaPersonal,SistemaDeBecas.listaBecas);
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
      
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static int retorno()
    {
        Scanner scanner = new Scanner(System.in);
        clearScreen();
        System.out.println("(0) Retornar");
        System.out.println("(1) Exit");
        return scanner.nextInt();
    }  
}