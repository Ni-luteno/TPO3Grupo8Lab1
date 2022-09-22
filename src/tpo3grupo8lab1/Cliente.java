package tpo3grupo8lab1;

public class Cliente {

    private String nombre, apellido;
    private long DNI;
    private Telefono numTel;
    private Domicilio direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public Telefono getNumTel() {
        return numTel;
    }

    public void setNumTel(Telefono numTel) {
        this.numTel = numTel;
    }

    public Domicilio getDireccion() {
        return direccion;
    }

    public void setDireccion(Domicilio direccion) {
        this.direccion = direccion;
    }

    public Cliente(String nombre, String apellido, long DNI, Telefono numTel, Domicilio direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.numTel = numTel;
        this.direccion = direccion;
    }

    public Cliente() {
    }

}
