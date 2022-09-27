package tpo3grupo8lab1;

public class Domicilio {

    private String ciudad, direccion;

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Domicilio(String ciudad, String direccion) {
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    
    public Domicilio() {
    }

    @Override
    public String toString() {
        return "Domicilio: " + "Ciudad: " + ciudad + ", direccion: "+direccion+'.';
    }

}
