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
public class ejercicio114 {
    public void ejercicio() {

      Scanner sc = new Scanner(System.in);
      
      double totalVentas = 0.0;
      double totalIVA = 0.0;
      double totalPago = 0.0;
      double totalCambio = 0.0;
      
      String respuesta;
      
      do {
         System.out.print("Ingrese el monto de la venta: ");
         double montoVenta = sc.nextDouble();
         
         double iva = montoVenta * 0.13;
         double totalPagar = montoVenta + iva;
         System.out.println("El IVA es: " + iva);
         System.out.println("El total a pagar es: " + totalPagar);
         
         System.out.print("Ingrese la cantidad con que paga el cliente: ");
         double cantidadPago = sc.nextDouble();
         
         double cambio = cantidadPago - totalPagar;
         System.out.println("El cambio es: " + cambio);
         
         totalVentas += montoVenta;
         totalIVA += iva;
         totalPago += cantidadPago;
         totalCambio += cambio;
         
         System.out.print("¿Hay más ventas por registrar? (s/n): ");
         respuesta = sc.next();
      } while (respuesta.equalsIgnoreCase("s"));
      
      System.out.println("Total de ventas: " + totalVentas);
      System.out.println("Total de IVA: " + totalIVA);
      System.out.println("Total de pagos: " + totalPago);
      System.out.println("Total de cambio: " + totalCambio);
   }

}
