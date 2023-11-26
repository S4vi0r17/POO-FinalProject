package ClasesParaZava;
import java.io.Serializable;

public class Beca implements Serializable{
    private String descripcion;
    private double monto;
    private int duracion;

    public Beca() {
    }

    public Beca(String descripcion, double monto, int duracion) {
        this.descripcion = descripcion;
        this.monto = monto;
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String tipo) {
        this.descripcion = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Beca{" + "descripcion=" + descripcion + ", monto=" + monto + ", duracion=" + duracion + '}';
    }
       
    
    
}
