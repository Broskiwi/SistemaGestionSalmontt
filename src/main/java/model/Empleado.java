package model;

public class Empleado extends Persona implements Registrable{
    //Atributos
    private String numeroEmpleado;
    private String cargo;
    private String departamento;

    //Constructor
    public Empleado() {
    }

    public Empleado(String rut, String nombre, Direccion direccion, String numeroEmpleado, String cargo, String departamento) {
        super(rut, nombre, direccion);
        this.numeroEmpleado = numeroEmpleado;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    //Getters y Setters
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("======================");
        System.out.println("EMPLEADO");
        System.out.println("RUT: " + getRut());
        System.out.println("Nombre: " + getNombre());
        System.out.println("N° Empleado: " + numeroEmpleado);
        System.out.println("Cargo: " + cargo);
        System.out.println("Departamento " + departamento);
        System.out.println("======================");
    }

    @Override
    public String getIdentificador() {
        return numeroEmpleado;
    }

    //Representación en texto de los datos del empleado
    @Override
    public String toString() {
        return "Empleado:\n" +
                " - RUT: " + getRut() + '\n' +
                " - Nombre: " + getNombre() + '\n' +
                " - Numero de Empleado: " + numeroEmpleado + '\n' +
                " - Cargo: " + cargo + '\n' +
                " - Departamento: " + departamento + '\n' +
                getDireccion() + "\n";
    }
}
