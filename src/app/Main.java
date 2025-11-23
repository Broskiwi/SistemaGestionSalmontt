package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

public class Main {

    public static void main(String[] args) {

        //CREACION DE PRIMERA PERSONA

        //Instancia de dirección para la primera persona
        Direccion dir1 = new Direccion();

        dir1.setCalle("Calle Falsa 123");
        dir1.setCiudad("Pelotillehue");
        dir1.setRegion("Región de Los Lagos");

        //Instancia de persona con datos básicos
        Persona persona = new Persona();

        persona.setNombre("Condorito");
        persona.setRut("12.345.678-9");
        persona.setDireccion(dir1);

        //CREACION DE PRIMERA EMPLEADO

        //Instancia de dirección para primer empleado
        Direccion dir2 = new Direccion();

        dir2.setCalle("Calle Verdadera 321");
        dir2.setCiudad("Llelotipehue");
        dir2.setRegion("Región de Los Ríos");

        //Instancia de empleado (con herencia de Persona)
        Empleado empleado = new Empleado();
        //Atributos heredados de Persona
        empleado.setNombre("Pepe Cortisona");
        empleado.setRut("98.765.432-1");
        empleado.setDireccion(dir2);
        //Atributos propios de Empleado
        empleado.setNumeroEmpleado("Chambeador-001");
        empleado.setCargo("Administrador de Jefes");
        empleado.setDepartamento("Finanzas");

        //CREACION DE SEGUNDA PERSONA
        Direccion dir3 = new Direccion();
        dir3.setCalle("Calle Dubai 987");
        dir3.setCiudad("Puerto Varas");
        dir3.setRegion("Región de Los Lagos");

        //Instancia del segundo empleado
        Empleado empleado2 = new Empleado();
        //Atributos heredados de Persona
        empleado2.setNombre("Yayita");
        empleado2.setRut("11.222.333-4");
        empleado2.setDireccion(dir3);
        //Atributos propios de Empleado
        empleado2.setNumeroEmpleado("Chambeador-002");
        empleado2.setCargo("Analista de Salmones");
        empleado2.setDepartamento("Control de Calidad");

        //SALIDA
        System.out.println("=== SISTEMA DE GESTIÓN SALMONTT ===\n");
        //Se muestra info de todos los objetos creados usando toString()
        System.out.println(persona.toString() + "\n" + empleado.toString() + "\n" + empleado2.toString());
    }

}
