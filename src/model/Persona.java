package model;

public class Persona {
    //Atributos
    private String rut;
    private String nombre;
    private Direccion direccion;

    //Constructor
    public Persona() {
    }

    //Getters y Setters
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    //Representación en texto de los datos de la persona
    @Override
    public String toString() {
        return "Persona:\n" +
                " - RUT: " + rut + '\n' +
                " - Nombre: " + nombre + '\n' +
                direccion + "\n";
    }
}
