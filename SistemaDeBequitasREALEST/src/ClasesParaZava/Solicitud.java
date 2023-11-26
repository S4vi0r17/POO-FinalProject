package ClasesParaZava;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Solicitud implements Serializable{
    
    private Postulante postulante;
    private Beca beca;
    private Date creacion;
    private boolean aprobada;
    private String estado;
    private List<String> documentos;

    public Solicitud(Postulante postulante,Beca beca) {
        this.postulante = postulante;
        this.beca = beca;
        this.estado= "Enviada";
        this.creacion= new Date();
        this.aprobada= false;
    }

    public Postulante getPostulante() {
        return postulante;
    }

    public Beca getBeca() {
        return beca;
    }

    public Date getCreacion() {
        return creacion;
    }

    public boolean isAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<String> getDocumentos() {
        return documentos;
    }

    public void addDocumentos(String documento) {
        documentos.add(documento);
    }
    
    public void deleteDocumentos(String documento) {
        documentos.remove(documento);
    }  
}