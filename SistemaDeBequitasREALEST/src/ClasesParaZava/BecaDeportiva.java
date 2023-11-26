package ClasesParaZava;

public class BecaDeportiva extends Beca{
    private String deporte;

    public BecaDeportiva(String deporte) {
        this.deporte = deporte;
    }

    public BecaDeportiva(String deporte, String descripcion, double monto, int duracion) {
        super(descripcion, monto, duracion);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }  

    @Override
    public String toString() {
        return "Beca{" + "tipo=" + super.getDescripcion() + ", monto=" + super.getMonto()+ ", duracion=" + super.getDuracion() + ", area= "+ this.getDeporte()+ '}';
    }
    
    
    
}
