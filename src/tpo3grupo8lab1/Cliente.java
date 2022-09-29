package tpo3grupo8lab1;

import java.util.Objects;

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

    public Cliente(String nombre, String apellido, long DNI, long numTel, Domicilio direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.numTel = new Telefono(numTel);
        this.direccion = direccion;
    }
    
    public Cliente() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.apellido);
        hash = 79 * hash + (int) (this.DNI ^ (this.DNI >>> 32));
        hash = 79 * hash + Objects.hashCode(this.numTel);
        hash = 79 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return this.DNI == other.DNI;
    }

    @Override
    public String toString() {
        return "Cliente: " + "Nombre: " + nombre + ", apellido: " + apellido + ", DNI: " + DNI + ", numTel: " + numTel.getNumero() + ", " + direccion + "\n";
    }

}
