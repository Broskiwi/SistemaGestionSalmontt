package ui;

import data.GestorEntidades;
import model.Cliente;
import model.Empleado;
import model.Proveedor;
import model.Registrable;

import javax.swing.*;

/**
 * Clase principal del Sistema de Gestión Salmontt v2.0
 */
public class Main {
    private static GestorEntidades gestor = new GestorEntidades();

    public static void main(String[] args) {

        boolean continuar = true;

        /*
        Estructura de control While se compone de 3 partes:
            1. Establece lista para definir el menú de opciones que aparecerá
            2. Establece el menú GUI con JOptionPane.showOptionDialog y se establece sus características (Titulo, mensaje, Tipo de opciones, Tipo de mensaje, icono, opciones y opción por defecto.
            3. Se usa declaración switch para condicionar ejecución de métodos al momento de elegir una opcion
         */
        while (continuar) {
            String[] opciones = {
                    "Agregar Empleado",
                    "Agregar Proveedor",
                    "Agregar Cliente",
                    "Mostrar todas las entidades",
                    "Mostrar por tipo",
                    "Buscar por ID",
                    "Salir"
            };

            int opcion = JOptionPane.showOptionDialog(null,
                    "Bienvenido al menú de gestión Salmontt. Favor elige una opción para continuar",
                    "Menú de gestión Salmontt",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (opcion) {
                case 0:
                    agregarEmpleado();
                    break;
                case 1:
                    agregarProveedor();
                    break;
                case 2:
                    agregarCliente();
                    break;
                case 3:
                    mostrarTodas();
                    break;
                case 4:
                    mostrarPorTipo();
                    break;
                case 5:
                    buscarPorID();
                    break;
                case 6:
                default:
                    continuar = false;
            }
        }

        JOptionPane.showMessageDialog(null, "Sistema finalizado.\nTotal de entidades: " + gestor.getEntidades().size());

    }

    /*
    Metodo para crear una entidad de empleado.
    1. Se crean objetos para almacenar los atributos que se ingresen
    2. Se estructura array de objetos para definir etiquetas y componentes. Ordenando la visualización de la data.
    3. Validación por si campos se envían vacíos
    4. Se setea los datos ingresados en los objetos creados previamente y se crea la entidad.
     */
    private static void agregarEmpleado() {

        JTextField txtRut = new JTextField();
        JTextField txtNombre = new JTextField();
        JTextField txtNEmpleado = new JTextField();
        JTextField txtCargo = new JTextField();
        JTextField txtDepto = new JTextField();

        Object[] mensaje = {
                "Rut: ", txtRut,
                "Nombre: ", txtNombre,
                "N° Empleado: ", txtNEmpleado,
                "Cargo: ", txtCargo,
                "Departamento: ", txtDepto
        };

        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Agregar Empleado", JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {

            if (txtRut.getText().isEmpty() || txtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nombre y RUT son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Empleado emp = new Empleado();
            emp.setRut(txtRut.getText());
            emp.setNombre(txtNombre.getText());
            emp.setNumeroEmpleado(txtNEmpleado.getText());
            emp.setCargo(txtCargo.getText());
            emp.setDepartamento(txtDepto.getText());

            gestor.agregarEntidad(emp);

            JOptionPane.showMessageDialog(null,"Empleado fue creado con éxito.", "Empleado creado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void agregarProveedor() {

        JTextField txtRut = new JTextField();
        JTextField txtRazonSocial = new JTextField();
        JTextField txtTipoServicio = new JTextField();

        Object[] mensaje = {
                "Rut: ", txtRut,
                "RazonSocial: ", txtRazonSocial,
                "Tipo de Servicioo: ", txtTipoServicio,
        };

        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Agregar Proveedor", JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {

            if (txtRut.getText().isEmpty() || txtRazonSocial.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "RUT y RazonSocial son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Proveedor pro = new Proveedor();
            pro.setRut(txtRut.getText());
            pro.setRazonSocial(txtRazonSocial.getText());
            pro.setTipoServicio(txtTipoServicio.getText());

            gestor.agregarEntidad(pro);

            JOptionPane.showMessageDialog(null, "Proveedor fue creado con éxito.", "Proveedor creado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void agregarCliente(){
        JTextField txtCodigo = new JTextField();
        JTextField txtNombreEmpresa = new JTextField();
        JTextField txtTipoProducto = new JTextField();
        JTextField txtEmail = new JTextField();

        Object[] mensaje = {
                "Código: ", txtCodigo,
                "Nombre Empresa: ", txtNombreEmpresa,
                "Tipo de Producto: ", txtTipoProducto,
                "Email: ", txtEmail,
        };

        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Agregar Cliente", JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {

            if (txtCodigo.getText().isEmpty() || txtNombreEmpresa.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Código y Nombre de la Empresa son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Cliente cli = new Cliente();
            cli.setCodigo(txtCodigo.getText());
            cli.setNombreEmpresa(txtNombreEmpresa.getText());
            cli.setTipoProducto(txtTipoProducto.getText());
            cli.setEmail(txtEmail.getText());

            gestor.agregarEntidad(cli);

            JOptionPane.showMessageDialog(null, "Cliente fue creado con éxito.", "Cliente creado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /*
    Metodo para mostrar todas las entidades registradas por detalle
    1. Se valida si lista está vacía
    2. Realiza downcasting seguro para acceder a los atributos específicos de cada clase
    3. Muestra todas las entidades registradas identificando su tipo con instanceof
     */
    private static void mostrarTodas(){
        if (gestor.getEntidades().isEmpty()){
            JOptionPane.showMessageDialog(null,"No se registran entidades.","Entidades vacías",JOptionPane.ERROR_MESSAGE);
            return;
        }

        String resultado = "Todas las entidades:\n\n";

        int i = 1;

        for (Registrable entidad : gestor.getEntidades()){
            resultado += i + ". ";

            if (entidad instanceof Empleado){
                Empleado emp = (Empleado) entidad;
                resultado += "Empleado: " + emp.getNombre() + " - " + emp.getCargo() + " - " + emp.getDepartamento();
            } else if (entidad instanceof Proveedor) {
                Proveedor pro = (Proveedor) entidad;
                resultado += "Proveedor: " + pro.getRazonSocial() + " - " + pro.getTipoServicio();
            }else if (entidad instanceof Cliente){
                Cliente cli = (Cliente) entidad;
                resultado += "Cliente: " + cli.getNombreEmpresa();
            }

            resultado += "(ID: " + entidad.getIdentificador() + ")\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, resultado, "Mostrar todas las entidades",JOptionPane.INFORMATION_MESSAGE);
    }

    /*
    1. Se valida si lista está vacía
    2. Muestra el conteo de entidades agrupadas por tipo
    3. Se utiliza instanceof para diferenciar entre Empleado, Proveedor y Cliente
     */
    private static void mostrarPorTipo(){
        if (gestor.getEntidades().isEmpty()){
            JOptionPane.showMessageDialog(null,"No se registran entidades.","Entidades vacías",JOptionPane.ERROR_MESSAGE);
            return;
        }

        int total = gestor.getEntidades().size();

        int empleados = 0;
        int proveedores = 0;
        int clientes = 0;

        for (Registrable entidad : gestor.getEntidades()){
            if (entidad instanceof Empleado){
                empleados++;
            } else if (entidad instanceof Proveedor) {
                proveedores++;
            }else if (entidad instanceof Cliente){
                clientes++;
            }
        }

        String todas = "RESUMEN \n\n" +
                "Total entidades: " + total + "\n\n" +
                "Empleados: " + empleados + "\n\n" +
                "Proveedores: " + proveedores + "\n\n" +
                "Clientes: " + clientes;

        JOptionPane.showMessageDialog(null, todas, "Conteo por Tipo",JOptionPane.INFORMATION_MESSAGE);
    }

    private static void buscarPorID(){
        if (gestor.getEntidades().isEmpty()){
            JOptionPane.showMessageDialog(null,"No se registran entidades.","Entidades vacías",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String id = JOptionPane.showInputDialog("Ingrese ID para buscar: ");

        Registrable encontrado = gestor.buscarPorIdentificador(id.trim());

        if (encontrado != null){

            String mensaje = "Entidad encontrada\n\n";

            if (encontrado instanceof Empleado){
                Empleado emp = (Empleado) encontrado;
                mensaje += "Empleado: \n";
                mensaje += "- N° Empleado: " + emp.getIdentificador() + "\n";
                mensaje += "- Nombre: " + emp.getNombre() + "\n";
                mensaje += "- RUT: " + emp.getRut() + "\n";
                mensaje += "- Cargo: " + emp.getCargo() + "\n";
                mensaje += "- Departamento: " + emp.getDepartamento();
            }else if (encontrado instanceof Proveedor){
                Proveedor pro = (Proveedor) encontrado;
                mensaje += "Proveedor: \n";
                mensaje += "- RUT: " + pro.getRut() + "\n";
                mensaje += "- Razón social: " + pro.getRazonSocial() + "\n";
                mensaje += "- Servicio: " + pro.getTipoServicio();
            } else if (encontrado instanceof Cliente){
                Cliente cli = (Cliente) encontrado;
                mensaje += "Cliente: \n";
                mensaje += "- Código: " + cli.getCodigo() + "\n";
                mensaje += "- Empresa: " + cli.getNombreEmpresa() + "\n";
                mensaje += "- Producto: " + cli.getTipoProducto() + "\n";
                mensaje += "- Email: " + cli.getEmail();
            }

            JOptionPane.showMessageDialog(null,mensaje,"Entidad encontrada.",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"No se encontró ninguna entidad con ID: " + id, "No encontrado",JOptionPane.WARNING_MESSAGE);
        }

    }
}
