package model;

public class Empleado extends Persona {
    //Atributos
    private String numeroEmpleado;
    private String cargo;
    private String departamento;

    //Constructor
    public Empleado() {
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
