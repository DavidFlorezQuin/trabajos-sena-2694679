package trabajos;

import java.util.Scanner;
import trabajos.ejercicio1;
import trabajos.ejercicio2;

public class Trabajos {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int opcion;
        System.out.println("1. Ejercicio_bolas de colores");
        System.out.println("2. Ejercicio_carrito de mercado");

        opcion=scan.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1 ejer1=new ejercicio1();
                ejer1.ejercicio();
                break;
            case 2:
                ejercicio2 ejer2=new ejercicio2();
                ejer2.ejercicio();
                break;

            default:
                throw new AssertionError();
        }
    }
}
