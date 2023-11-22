package Logic;

public class PostulanteClass {
    private String nombreCompletos;
    private String direccion;
    private String DNI;
    private String IE;
    private String carrera;
    private String promedio;
    private String ingresosFamiliares;
    private String numeroPersonasHogar;
    private String beca;
    private String telefono;
    private String estado;

    public PostulanteClass(String nombreCompletos, String direccion, String DNI, String IE, String carrera, String promedio,
            String ingresosFamiliares, String numeroPersonasHogar, String beca, String telefono, String estado) {
        this.nombreCompletos = nombreCompletos;
        this.direccion = direccion;
        this.DNI = DNI;
        this.IE = IE;
        this.carrera = carrera;
        this.promedio = promedio;
        this.ingresosFamiliares = ingresosFamiliares;
        this.numeroPersonasHogar = numeroPersonasHogar;
        this.beca = beca;
        this.telefono = telefono;
        this.estado = estado;
    }

    public String getNombreCompletos() {
        return nombreCompletos;
    }

    public void setNombreCompletos(String nombreCompletos) {
        this.nombreCompletos = nombreCompletos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public String getIngresosFamiliares() {
        return ingresosFamiliares;
    }

    public void setIngresosFamiliares(String ingresosFamiliares) {
        this.ingresosFamiliares = ingresosFamiliares;
    }

    public String getNumeroPersonasHogar() {
        return numeroPersonasHogar;
    }

    public void setNumeroPersonasHogar(String numeroPersonasHogar) {
        this.numeroPersonasHogar = numeroPersonasHogar;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
