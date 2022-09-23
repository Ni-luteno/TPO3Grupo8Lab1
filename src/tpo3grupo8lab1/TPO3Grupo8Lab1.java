package tpo3grupo8lab1;

import java.util.Scanner;

public class TPO3Grupo8Lab1 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        Directorio d = new Directorio();
        System.out.println("¿Que desea hacer?");
        boolean sale = false;
        int opc;
        do {
//            try {

            System.out.println("1 - Mostrar registro de clientes");
            System.out.println("2 - Agregar cliente");
            System.out.println("3 - Borrar cliente");
            System.out.println("4 - Buscar cliente(por telefono)");
            System.out.println("5 - Buscar telefono");
            System.out.println("6 - Buscar clientes(por ciudad)");
            System.out.println("7 - Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println(d);
                    break;
                case 2:
                    System.out.println("Ingrese datos del cliente:");
                    System.out.println("Nombre:");
                    String nom = leer.next();
                    System.out.println("Apellido:");
                    String ape = leer.next();
                    System.out.println("Documento:");
                    long DNI = leer.nextLong();
                    System.out.println("Telefono:");
                    long numTel = leer.nextLong();
                    System.out.println("Ciudad: ");
                    String ciudad = leer.next();
                    System.out.println("Calle: ");
                    String calle = leer.next();
                    System.out.println("Altura:");
                    int altura = leer.nextInt();
                    Domicilio domicilio = new Domicilio(ciudad, calle, altura);
                    Cliente cliente = new Cliente(nom, ape, DNI, numTel, domicilio);
                    d.agregarCliente(cliente,cliente.getNumTel());
                    break;
                case 3:
                    System.out.println("Ingrese el numero que desea borrar del directorio.");
                    Telefono aux = new Telefono(leer.nextLong());
                    d.borrarCliente(aux);
                    break;
                case 4:
                    System.out.println("Ingrese el numero del cliente que desea buscar.");
                    Telefono aux2 = new Telefono(leer.nextLong());
                    System.out.println(d.buscarCliente(aux2));
                    break;
                case 5:
                    System.out.println("Ingrese el apellido del cliente cuyo telefono desea buscar.");
                    System.out.println(d.buscarTelefono(leer.next()));
                    break;
                case 6:
                    System.out.println("Ingrese la ciudad y se mostraran los clientes correspondientes.");
                    System.out.println(d.buscarClientes(leer.next()));
                    break;
                case 7:
                    sale = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }
//            } catch () {}
        } while (!sale);
    }

}
