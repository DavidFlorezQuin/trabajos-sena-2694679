/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajos;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author SENA
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public void ejercicio(){
         String[] opciones = {"rojo", "amarillo", "blanco"};
        String opcion;
        int compra;
        Scanner scan = new Scanner(System.in);
        float total = 0;
        double valor;
        
        do {
            System.out.println("Ingrese el valor de su compra");
            compra = scan.nextInt();
            Random rand = new Random();
            int indiceAleatorio = rand.nextInt(opciones.length);
            String palabraAlAzar = opciones[indiceAleatorio];
            System.out.println("El color que le ha tocado ha sido " + palabraAlAzar);
            System.out.println("------------------------------------------ ");
            System.out.println(" ");
            
            switch (palabraAlAzar) {
                case "rojo":
                    System.out.println("Tiene un descuento del 40%");
                    valor = compra * 0.60;
                    System.out.println("El total a pagar con descuento es: " + valor);
                    break;
                case "amarillo":
                    System.out.println("Tiene un descuento del 25%");
                    valor = compra * 0.75;
                    System.out.println("El total a pagar con descuento es: " + valor);
                    break;
                case "blanco":
                    System.out.println("No tiene descuento");
                    System.out.println("El total a pagar es: " + compra);
                    valor = compra;
                    break;
                default:
                    System.out.println("Opción no válida");
                    valor = 0;
                    break;
            }
            
            total += (float)valor;
            
            System.out.println("------------------------------------------ ");
            System.out.println("¿Desea cerrar?");
            opcion = scan.next().toLowerCase();
        } while (!opcion.equals("si"));
        
        System.out.println("------------------------------------------ ");
        System.out.println("El total del día fue: " + total);
   }
}
