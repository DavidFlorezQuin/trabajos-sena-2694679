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
public class ejercicio113 {
    public void ejercicio() {
      Scanner sc = new Scanner(System.in);
      
      double totalVentas = 0.0;
      int clientes = 0;
      
      String respuesta;
      
      do {
         System.out.print("Ingrese el monto total de la compra del cliente: ");
         double monto = sc.nextDouble();
         
         totalVentas += monto;
         clientes++;
         
         System.out.print("¿Hay más ventas por registrar? (s/n): ");
         respuesta = sc.next();
      } while (respuesta.equalsIgnoreCase("s"));
      
      System.out.println("Cantidad total de ventas: " + totalVentas);
      System.out.println("Número de clientes atendidos: " + clientes);
   }

}
