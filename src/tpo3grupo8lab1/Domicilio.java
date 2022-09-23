package tpo3grupo8lab1;

public class Domicilio {

    private String ciudad, calle;
    private int altura;

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Domicilio(String ciudad, String calle, int altura) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.altura = altura;
    }

    public Domicilio() {
    }

    @Override
    public String toString() {
        return "Domicilio: " + "Ciudad: " + ciudad + ", calle: " + calle + ", altura: " + altura + '.';
    }

}
