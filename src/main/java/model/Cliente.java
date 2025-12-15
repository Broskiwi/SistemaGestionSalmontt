package model;

public class Cliente implements Registrable{
    private String codigo;
    private String nombreEmpresa;
    private String tipoProducto;
    private String email;

    public Cliente() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("======================");
        System.out.println("CLIENTE");
        System.out.println("Código: " + codigo);
        System.out.println("Empresa: " + nombreEmpresa);
        System.out.println("Producto: " + tipoProducto);
        System.out.println("Email: " + email);;
        System.out.println("======================");
    }

    @Override
    public String getIdentificador() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Cliente:\n" +
                " - Código: " + codigo + '\n' +
                " - Empresa: " + nombreEmpresa + '\n' +
                " - Tipo Producto: " + tipoProducto + '\n' +
                " - Email: " + email;
    }
}
