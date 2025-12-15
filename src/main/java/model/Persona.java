package model;

public class Persona implements Registrable{
    //Atributos
    private String rut;
    private String nombre;
    private Direccion direccion;

    //Constructor
    public Persona() {
    }

    public Persona(String rut, String nombre, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
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

    @Override
    public void mostrarResumen() {
        System.out.println("======================");
        System.out.println("PERSONA");
        System.out.println("RUT: " + rut);
        System.out.println("Nombre: " + nombre);
        if (direccion != null){
            System.out.println("Ciudad: " + direccion.getCiudad());
        }
        System.out.println("======================");
    }

    /*
    Este metodo nos retorna el rut como identificador
     */
    @Override
    public String getIdentificador() {
        return rut;
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
