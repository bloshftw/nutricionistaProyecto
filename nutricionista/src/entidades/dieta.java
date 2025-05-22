package entidades;

import java.time.LocalDate;

/**
 * Entidad Dieta
 * @author ferna
 */
public class dieta{
    private int idDieta;
    private int idPaciente;
    private String nombre;
    private String descripcion;
    private String tipo; // "manual" o "automatica"
    private double calorias;
    private double tasaMetabolica;
    private LocalDate fechaCreacion;
    private boolean estado;
    
    // Constructores
    public dieta() {
        this.fechaCreacion = LocalDate.now();
        this.estado = true;
    }
    
    public dieta(int idPaciente, String nombre, String descripcion, String tipo, double calorias, double tasaMetabolica) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.calorias = calorias;
        this.tasaMetabolica = tasaMetabolica;
        this.fechaCreacion = LocalDate.now();
        this.estado = true;
    }
    
    // Getters y Setters
    public int getIdDieta() {
        return idDieta;
    }
    
    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }
    
    public int getIdPaciente() {
        return idPaciente;
    }
    
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getCalorias() {
        return calorias;
    }
    
    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
    
    public double getTasaMetabolica() {
        return tasaMetabolica;
    }
    
    public void setTasaMetabolica(double tasaMetabolica) {
        this.tasaMetabolica = tasaMetabolica;
    }
    
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public boolean isEstado() {
        return estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return nombre + " - " + fechaCreacion;
    }
}