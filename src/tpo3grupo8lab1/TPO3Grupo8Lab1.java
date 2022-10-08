package tpo3grupo8lab1;

import Vistas.Tpo3Vista;

public class TPO3Grupo8Lab1 {

    public static void main(String[] args) {

        Directorio d = new Directorio();
        Tpo3Vista vista = new Tpo3Vista(d);
        vista.setVisible(true);

    }

}
