package model;

public class Direccion {
    //Atributos
    private String calle;
    private String ciudad;
    private String region;

    //Constructor
    public Direccion() {
    }

    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    //Getters y Setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    //Representación en texto de los datos de la dirección de la persona
    @Override
    public String toString() {
        return " - Calle: " + calle + '\n' +
                " - Ciudad: " + ciudad + '\n' +
                " - Region: " + region;
    }
}