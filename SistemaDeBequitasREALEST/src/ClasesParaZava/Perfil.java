package ClasesParaZava;
import java.io.Serializable;

public class Perfil implements Serializable{
    private double promedio;
    private String situacionEconomica;
    private int ordenDeMerito;

    public Perfil(double promedio, String situacionEconomica, int ordenDeMerito) {
        this.promedio = promedio;
        this.situacionEconomica = situacionEconomica;
        this.ordenDeMerito = ordenDeMerito;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getSituacionEconomica() {
        return situacionEconomica;
    }

    public void setSituacionEconomica(String situacionEconomica) {
        this.situacionEconomica = situacionEconomica;
    }

    public int getOrdenDeMerito() {
        return ordenDeMerito;
    }

    public void setOrdenDeMerito(int ordenDeMerito) {
        this.ordenDeMerito = ordenDeMerito;
    }

    @Override
    public String toString() {
        return "Perfil{" + "promedio=" + promedio + ", situacionEconomica=" + situacionEconomica + ", ordenDeMerito=" + ordenDeMerito + '}';
    }
        
}
