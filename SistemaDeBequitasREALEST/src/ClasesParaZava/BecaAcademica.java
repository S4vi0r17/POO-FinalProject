package ClasesParaZava;

public class BecaAcademica extends Beca{
    private String AreaAcademica;

    public BecaAcademica(String AreaAcademica) {
        this.AreaAcademica = AreaAcademica;
    }   
    
    public BecaAcademica(String descripcion, double monto, int duracion, String AreaAcademica) {
        super(descripcion, monto, duracion);
        this.AreaAcademica = AreaAcademica;
    }
   
    public String getAreaAcademica() {
        return AreaAcademica;
    }

    public void setAreaAcademica(String AreaAcademica) {
        this.AreaAcademica = AreaAcademica;
    }

    @Override
    public String toString() {
        return "Beca{" + "tipo=" + super.getDescripcion() + ", monto=" + super.getMonto()+ ", duracion=" + super.getDuracion() + ", area= "+ this.getAreaAcademica() + '}';
    }
    
    
    
}
