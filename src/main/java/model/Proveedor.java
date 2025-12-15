package model;

public class Proveedor implements Registrable{
    private String rut;
    private String razonSocial;
    private String tipoServicio;

    public Proveedor() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("======================");
        System.out.println("PROVEEDOR");
        System.out.println("RUT: " + rut);
        System.out.println("Razón Social: " + razonSocial);
        System.out.println("Servicio: " + tipoServicio);
        System.out.println("======================");
    }

    @Override
    public String getIdentificador() {
        return rut;
    }
}
