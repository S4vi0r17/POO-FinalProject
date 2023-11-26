package ClasesParaZava;
import java.io.*;
import java.util.ArrayList;

public class File {
    public static <T> void guardar(ArrayList<T> lista, String archivo) {
        try (ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream(archivo))) {
            guardar.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
            e.printStackTrace();
        }
    }

    public static <T> ArrayList<T> extraer(String archivo) {
        ArrayList<T> lista = new ArrayList<>();
        try (ObjectInputStream extraer = new ObjectInputStream(new FileInputStream(archivo))) {
            lista = (ArrayList<T>) extraer.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
        }
        return lista;
    }
    
    public static <T> void imprimirDatos(ArrayList<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento.toString());
            System.out.println("\n-----------------\n");
        }
    }
}
