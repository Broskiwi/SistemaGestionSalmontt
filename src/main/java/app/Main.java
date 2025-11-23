package app;

import model.Empleado;
import service.GestorEmpleados;
import util.LectorDeArchivos;

import java.util.ArrayList;

/**
 * Clase principal del Sistema de Gestión Salmontt v2.0
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("SISTEMA DE GESTION SALMONTT v2.0");
        System.out.println("==============================\n");

        System.out.println("Cargando empleados desde archivo... \n");

        //Se declara variable empleado de tipo ArrayList y se almacena la lista de empleados a partir del archivo
        ArrayList<Empleado> empleados = LectorDeArchivos.leerEmpleados("empleados.txt");

        //Se declara variable gestor de tipo GestorEmpleados y se instancia su clase.
        GestorEmpleados gestor = new GestorEmpleados(empleados);

        //Se llama la metodo para mostrar todos los empleados del archivo
        gestor.mostrarTodos();

        System.out.println("\n");

        //Usamos el metodo para buscar por departamento en el gestor de empleados
        gestor.buscarPorDepartamento("Control de Calidad");

        System.out.println("\n");

        //Usamos el metodo para buscar por rut en el gestor de empleados
        gestor.buscarPorRut("98.765.432-1");

        //Mostramos la cantidad total de empleados registrados en el archivo.
        System.out.println("==============================");
        System.out.println("        ESTADÍSTICAS");
        System.out.println("==============================");
        System.out.println("Total de empleados registrados: " + gestor.contarEmpleados());
        System.out.println("Sistema ejecutado correctamente");
        System.out.println("Gracias por usar el Sistema de Gestión Salmontt v2.0");
    }
}
