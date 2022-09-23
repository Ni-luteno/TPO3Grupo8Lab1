package tpo3grupo8lab1;

import java.util.Scanner;

public class TPO3Grupo8Lab1 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(
                "¿Que desea hacer?");
        boolean sale = false;
        int opc;
        do {
            try {

                System.out.println("1 - Mostrar registro de clientes");
                System.out.println("2 - Agregar cliente");
                System.out.println("3 - Borrar cliente");
                System.out.println("4 - Buscar cliente(por telefono)");
                System.out.println("5 - Buscar telefono");
                System.out.println("6 - Buscar clientes(por ciudad)");
                System.out.println("7 - Mostrar cliente(individual)");
                System.out.println("8 - Salir");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    default:
                }
            } catch () {
            }
        } while (!sale);
    }

}
