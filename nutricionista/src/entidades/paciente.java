/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author ferna
 */

public class paciente {
    private int idPaciente;
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double altura;
    private String sexo; // "hombre" o "mujer"
    private String objetivo; // "bajar de peso", "subir de peso", "mantener"
    private boolean vegetariano;
    private boolean celiaco;
    private boolean intoleranteLactosa;
    
    // Constructor vacío
    public paciente() {
    }
    
    // Constructor con todos los atributos (sin id, para inserciones)
    public paciente(String nombre, String apellido, int edad, double peso, double altura,
                    String sexo, String objetivo, boolean vegetariano, boolean celiaco, boolean intoleranteLactosa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.objetivo = objetivo;
        this.vegetariano = vegetariano;
        this.celiaco = celiaco;
        this.intoleranteLactosa = intoleranteLactosa;
    }
    
    // Constructor completo con id (para lecturas y actualizaciones)
    public paciente(int idPaciente, String nombre, String apellido, int edad, double peso, double altura,
                    String sexo, String objetivo, boolean vegetariano, boolean celiaco, boolean intoleranteLactosa) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.objetivo = objetivo;
        this.vegetariano = vegetariano;
        this.celiaco = celiaco;
        this.intoleranteLactosa = intoleranteLactosa;
    }

    // Getters y Setters
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
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }
    
    public boolean isCeliaco() {
        return celiaco;
    }

    public void setCeliaco(boolean celiaco) {
        this.celiaco = celiaco;
    }
    
    public boolean isIntoleranteLactosa() {
        return intoleranteLactosa;
    }

    public void setIntoleranteLactosa(boolean intoleranteLactosa) {
        this.intoleranteLactosa = intoleranteLactosa;
    }
    
    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                ", sexo='" + sexo + '\'' +
                ", objetivo='" + objetivo + '\'' +
                ", vegetariano=" + vegetariano +
                ", celiaco=" + celiaco +
                ", intoleranteLactosa=" + intoleranteLactosa +
                '}';
    }
}

    

