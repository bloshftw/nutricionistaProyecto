
package entidades;


public class alimento {
    private int idAlimento;
    private String nombre;
    private String categoria;
    private double calorias;
    private boolean aptoCeliacos;
    private boolean bajoLactosa;

    // Constructor sin id, para cuando se inserta un nuevo alimento (id generado automáticamente)
    public alimento(String nombre, String categoria, double calorias, boolean aptoCeliacos, boolean bajoLactosa) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.calorias = calorias;
        this.aptoCeliacos = aptoCeliacos;
        this.bajoLactosa = bajoLactosa;
    }

    // Constructor completo con id, útil para lecturas o actualizaciones
    public alimento(int idAlimento, String nombre, String categoria, double calorias, boolean aptoCeliacos, boolean bajoLactosa) {
        this.idAlimento = idAlimento;
        this.nombre = nombre;
        this.categoria = categoria;
        this.calorias = calorias;
        this.aptoCeliacos = aptoCeliacos;
        this.bajoLactosa = bajoLactosa;
    }

    // Getters y Setters
    public int getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(int idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public boolean isAptoCeliacos() {
        return aptoCeliacos;
    }

    public void setAptoCeliacos(boolean aptoCeliacos) {
        this.aptoCeliacos = aptoCeliacos;
    }

    public boolean isBajoLactosa() {
        return bajoLactosa;
    }

    public void setBajoLactosa(boolean bajoLactosa) {
        this.bajoLactosa = bajoLactosa;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "idAlimento=" + idAlimento +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", calorias=" + calorias +
                ", aptoCeliacos=" + aptoCeliacos +
                ", bajoLactosa=" + bajoLactosa +
                '}';
    }
}

    

