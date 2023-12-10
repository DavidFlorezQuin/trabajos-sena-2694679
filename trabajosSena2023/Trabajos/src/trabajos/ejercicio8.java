/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajos;
    import java.util.Scanner;

/**
 *    import java.util.Scanner;

 * @author SENA
 */
public class ejercicio8 {
    public void ejercicio() {
                Scanner scan = new Scanner(System.in);
        double total = 0;

        // Bucle para ir sumando los precios de los artículos
        char seguir;
        do {
            System.out.print("Ingrese el precio del artículo: $");
            double precio = scan.nextDouble();

            System.out.print("¿La etiqueta es roja? (S/N): ");
            char etiqueta = scan.next().toUpperCase().charAt(0);

            if (etiqueta == 'S') {
                total += precio * 0.8; // Aplicar descuento del 20%
            } else {
                total += precio;
            }

            System.out.print("¿Desea ingresar otro artículo? (S/N): ");
            seguir = scan.next().toUpperCase().charAt(0);
        } while (seguir == 'S');

        System.out.printf("El total a pagar es: $%.2f", total);
    }

}
