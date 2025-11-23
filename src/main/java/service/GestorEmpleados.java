package service;

import model.Empleado;

import java.util.ArrayList;

/**
 * Clase para gestionar opearciones sobre empleados
 * Integra busquedas, filtros y listados
 */
public class GestorEmpleados {
    /**
     * Lista de empleados gestionados
     */
    private ArrayList<Empleado> empleados;

    /**
     * Constructor para inicializar el gestor con una lista de empleados
     * @param empleados
     */
    public GestorEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * Metodo para mostrar todos los empleados de la lista
     * Integra validación por si la lista se encuentra vacía
     * Utiliza bucle 'for' para iterar sobre el tamaño de la lista y mostrar en consola por medio de toString
     */
    public void mostrarTodos(){
        System.out.println("============================== \n" +
                            "LISTA DE EMPLEADOS \n" +
                            "============================== \n");
        if (empleados.isEmpty()){
            System.out.println("No hay empleados registrados. Favor revisa que el archivo no esté vacío.\n");
            return;
        }

        for (int i = 0; i < empleados.size(); i++){
            System.out.println("Empleado #" + (i + 1));
            System.out.println(empleados.get(i).toString());
        }
    }

    /**
     * Metodo para buscar empleados por departamento
     * Instacia lista para almacenar empleados encontrados
     * Valida que empleado exista y que el parametro ingresado acepte uso de mayusculas
     * Utiliza operadores condicionales if-else para informar si lista está vacía, de lo contrario, muestra cantidad de encontrados en base al parametro ingresado y la lista por medio de toString
     * @param departamento
     */
    public void buscarPorDepartamento(String departamento){
        System.out.println("============================== \n" +
                "BUSQUEDA POR DEPARTAMENTO: " + departamento + "\n" +
                "============================== \n");
        ArrayList<Empleado> encontrados = new ArrayList<>();

        for (Empleado empleado : empleados){
            if (empleado.getDepartamento() != null && empleado.getDepartamento().equalsIgnoreCase(departamento)){
                encontrados.add(empleado);
            }
        }
        if (encontrados.isEmpty()){
            System.out.println("No se encontraron empleados en el departamento " + departamento + "\n");
        }else{
            System.out.println("Se encontraron " + encontrados.size() + " empleado(s):\n");
            for (Empleado empleado : encontrados){
                System.out.println(empleado.toString());
            }
        }
    }

    /**
     * Metodo para buscar empleados por rut
     * Por medio de bucle 'for-each' y operador 'if' valida que el rut ingresado exista y sea igual en la lista de empleados y lo muestra por medio de toString
     * De lo contrario, indica que no se encontró rut
     * @param rut
     * @return
     */
    public Empleado buscarPorRut(String rut){
        System.out.println("============================== \n" +
                "BUSQUEDA POR RUT: " + rut + "\n" +
                "============================== \n");

        for (Empleado empleado : empleados){
            if (empleado.getRut() != null && empleado.getRut().equals(rut)) {
                System.out.println("Empleados encontrados:\n");
                System.out.println(empleado.toString());
                return empleado;
            }
        }

        System.out.println("No se encontró empleado con el RUT: " + rut + "\n");
        return null;
    }

    /**
     * Obtiene la cantidad total de empleados registrados.
     * @return número entero con el total de empleados
     */
    public int contarEmpleados(){
        return empleados.size();
    }
}
