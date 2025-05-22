package entidades;

/**
 * Entidad DietaDetalle - Relaciona dietas con alimentos
 * @author ferna
 */
public class dietaDetalle {
    private int idDetalle;
    private int idDieta;
    private int idAlimento;
    private String comida; // "desayuno", "almuerzo", "merienda", "cena", "colacion"
    private int posicion; // 1, 2, 3 para distinguir los 3 alimentos por comida
    private int porciones;
    private double calorias;
    
    // Constructores
    public dietaDetalle() {
    }
    
    public dietaDetalle(int idDieta, int idAlimento, String comida, 
                       int posicion, int porciones, double calorias) {
        this.idDieta = idDieta;
        this.idAlimento = idAlimento;
        this.comida = comida;
        this.posicion = posicion;
        this.porciones = porciones;
        this.calorias = calorias;
    }
    
    // Getters y Setters
    public int getIdDetalle() {
        return idDetalle;
    }
    
    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }
    
    public int getIdDieta() {
        return idDieta;
    }
    
    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }
    
    public int getIdAlimento() {
        return idAlimento;
    }
    
    public void setIdAlimento(int idAlimento) {
        this.idAlimento = idAlimento;
    }
    
    public String getComida() {
        return comida;
    }
    
    public void setComida(String comida) {
        this.comida = comida;
    }
    
    public int getPosicion() {
        return posicion;
    }
    
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public int getPorciones() {
        return porciones;
    }
    
    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }
    
    public double getCalorias() {
        return calorias;
    }
    
    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
}