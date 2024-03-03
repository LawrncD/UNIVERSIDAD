package co.edu.uniquindio.poo;

public class Mascota {
    private int id;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String genero;
    private String color;
    private double peso;

    public Mascota(int id, String nombre, String especie, String raza, int edad, String genero, String color, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.color = color;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }
    
}
    

