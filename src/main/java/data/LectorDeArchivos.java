package data;

import model.Direccion;
import model.Empleado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorDeArchivos {

    /**
     * Metodo que lee empleados desde un archivo de texto
     * Formato esperado: rut, nombre, numEmpleado, cargo, dpto, calle, ciudad, region
     * @param rutaArchivo
     * @return
     */
    public static ArrayList<Empleado> leerEmpleados(String rutaArchivo){
        ArrayList<Empleado> empleados = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;
            int numLinea = 0;

            while ((linea = br.readLine()) != null){
                numLinea++;
                try {
                    //Se divide la línea por comas
                    String[] datos = linea.split(",");

                    //Valida que archivo tenga 8 campos
                    if (datos.length != 8){
                        System.out.println("Línea " + numLinea + " ignorada: formato incorrecto.");
                        continue;
                    }

                    //Se crea dirección
                    Direccion direccion = new Direccion();
                    direccion.setCalle(datos[5].trim());
                    direccion.setCiudad(datos[6].trim());
                    direccion.setRegion(datos[7].trim());

                    //Se crea empleado
                    Empleado empleado = new Empleado();
                    empleado.setRut(datos[0].trim());
                    empleado.setNombre(datos[1].trim());
                    empleado.setNumeroEmpleado(datos[2].trim());
                    empleado.setCargo(datos[3].trim());
                    empleado.setDepartamento(datos[4].trim());
                    empleado.setDireccion(direccion);

                    empleados.add(empleado);
                } catch (Exception e) {
                    System.out.println("Error al procesar línea: " + numLinea + ": " + e.getMessage());
                }
            }
            System.out.println("Se cargaron " + empleados.size() + " empleados correctamente");
        } catch (IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
            System.out.println("Valida que el archivo 'empleados.txt' se encuentre en la raíz del proyecto.");
        }

        return empleados;
    }
}
