package ClasesParaZava;
import java.io.Serializable;

public class Postulante implements Serializable{
    private String nombre;
    private String apellido;
    private int edad;
    private String DNI;
    private String usuario;
    private String contra;
    private Perfil perfil;

    public Postulante(String nombre, String apellido, int edad, String DNI, String usuario, String contra, Perfil perfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.usuario = usuario;
        this.contra = contra;
        this.perfil = perfil;
    }     

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "Postulante{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNI=" + DNI + ", usuario=" + usuario + ", contra=" + contra + ", perfil=" + perfil + '}';
    }


    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
