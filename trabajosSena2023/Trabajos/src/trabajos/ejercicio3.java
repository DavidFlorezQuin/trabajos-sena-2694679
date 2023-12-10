/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajos;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class ejercicio3 {

    public void ejercicio() {
    Scanner entrada = new Scanner(System.in);
        int edad;
        double precio = 100.0;
        double descuento;
        double perdida1 = 0.0, perdida2 = 0.0, perdida3 = 0.0, perdida4 = 0.0, perdida5 = 0.0;
        int opcion;
        
        do {
            System.out.println("Menú:");
            System.out.println("1. Consultar descuento por edad");
            System.out.println("2. Mostrar pérdida por categoría");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la edad del cliente: ");
                    edad = entrada.nextInt();
                    
                    if (edad < 5) {
                        System.out.println("Los niños menores de 5 años no pueden entrar al teatro.");
                    } else if (edad >= 5 && edad <= 14) {
                        descuento = precio * 0.35;
                        System.out.println("El descuento para la categoría 1 es de $" + descuento);
                        perdida1 += descuento;
                    } else if (edad >= 15 && edad <= 19) {
                        descuento = precio * 0.25;
                        System.out.println("El descuento para la categoría 2 es de $" + descuento);
                        perdida2 += descuento;
                    } else if (edad >= 20 && edad <= 45) {
                        descuento = precio * 0.10;
                        System.out.println("El descuento para la categoría 3 es de $" + descuento);
                        perdida3 += descuento;
                    } else if (edad >= 46 && edad <= 65) {
                        descuento = precio * 0.25;
                        System.out.println("El descuento para la categoría 4 es de $" + descuento);
                        perdida4 += descuento;
                    } else {
                        descuento = precio * 0.35;
                        System.out.println("El descuento para la categoría 5 es de $" + descuento);
                        perdida5 += descuento;
                    }
                    break;
                case 2:
                    System.out.println("La pérdida por categoría es la siguiente:");
                    System.out.println("Categoría 1: $" + perdida1);
                    System.out.println("Categoría 2: $" + perdida2);
                    System.out.println("Categoría 3: $" + perdida3);
                    System.out.println("Categoría 4: $" + perdida4);
                    System.out.println("Categoría 5: $" + perdida5);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);
        
        entrada.close();
    }
}