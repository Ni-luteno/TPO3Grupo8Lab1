package tpo3grupo8lab1;

public class Telefono {

    private long numero;

    public long getNumero() {
        return numero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (this.numero ^ (this.numero >>> 32));
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
        final Telefono other = (Telefono) obj;
        return this.numero == other.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Telefono(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefono: " + "numero: " + numero;
    }

    public Telefono() {
    }

}
