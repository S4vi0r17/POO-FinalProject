package ClasesParaZava;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Entrevistador extends Personal{

    public Entrevistador(String nombre, String apellido, int edad, String DNI, int credencial, String usuario, String contra) {
        super(nombre, apellido, edad, DNI, credencial, usuario, contra);
    }

      public boolean realizarEntrevista() {
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

      return respuesta == 1;
    }
}