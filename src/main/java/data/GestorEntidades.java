package data;

import model.*;

import java.util.ArrayList;

public class GestorEntidades {
    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        this.entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad){
        entidades.add(entidad);
        System.out.println("Entidad ingresada.");
    }

    public void mostrarEntidades(){
        System.out.println("====================");
        System.out.println("    ENTIDADES");
        System.out.println("====================");

        if (entidades.isEmpty()){
            System.out.println("No hay entidades registradas.");
            return;
        }

        for (Registrable entidad : entidades){
            entidad.mostrarResumen();
            System.out.println();
        }

        System.out.println("Total de entidades: " + entidades.size());
    }

    public void mostrarPorTipo(){
        System.out.println("====================");
        System.out.println("    ENTIDADES POR TIPO DE DATO (instanceof)");
        System.out.println("====================");

        int cantidadEmpleados = 0;
        int cantidadProveedores = 0;
        int cantidadClientes = 0;
        int cantidadPersonas = 0;

        for (Registrable entidad : entidades){

            if (entidad instanceof Empleado){
                Empleado emp = (Empleado) entidad;
                System.out.println("→ Empleado: " + emp.getNombre() + " (" + emp.getCargo() + ")");
                cantidadEmpleados++;
            } else if (entidad instanceof Persona) {
                Persona per = (Persona) entidad;
                System.out.println("→ Persona: " + per.getNombre());
                cantidadPersonas++;
            } else if (entidad instanceof Proveedor){
                Proveedor pro = (Proveedor) entidad;
                System.out.println("→ Proveedor: " + pro.getRazonSocial() + " (" + pro.getTipoServicio() + ")");
                cantidadProveedores++;
            } else if (entidad instanceof Cliente) {
                Cliente cli = (Cliente) entidad;
                System.out.println("→ Cliente: " + cli.getNombreEmpresa() + " (" + cli.getTipoProducto() + ")");
                cantidadClientes++;
            }
        }

        System.out.println("=== CANTIDADES POR TIPO ===");
        System.out.println("Empleados: " + cantidadEmpleados);
        System.out.println("Personas: " + cantidadPersonas);
        System.out.println("Proveedor: " + cantidadProveedores);
        System.out.println("Clientes: " + cantidadClientes);
        System.out.println("TOTAL: " + entidades.size());

    }

    public Registrable buscarPorIdentificador(String id){
        for (Registrable entidad : entidades){
            if (entidad.getIdentificador().equals(id)){
                return entidad;
            }
        }
        return null;
    }

    public ArrayList<Registrable> getEntidades(){
        return entidades;
    }
}
