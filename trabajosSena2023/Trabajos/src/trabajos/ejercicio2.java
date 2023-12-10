/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajos;
import java.util.Scanner;
import trabajos.producto;

/**
 *
 * @author SENA
 */
public class ejercicio2 {

    /**
     */
   public void ejercicio(){
        // TODO code application logic here
    String pregunta;
    String producto; 
    Byte cantidad;
    float precio; 
    float total_producto;
    float total_precio = 0; 
    byte total_productos = 0; 
    Scanner scan = new Scanner(System.in);
    producto[] productos = new producto[10];
    int contadorProductos = 0;
    
    do {
        System.out.println("Nombre del producto");
        producto = scan.nextLine();
        System.out.println("Cantidad el producto");
        cantidad = scan.nextByte();
        System.out.println("Precio del producto");
        precio = scan.nextFloat();
        
        total_producto = precio * cantidad;
        total_precio += total_producto;
        total_productos += cantidad;
        
        producto productoComprado = new producto(producto, cantidad, precio);
        productos[contadorProductos] = productoComprado;
        contadorProductos++;
        
        System.out.println("------------------------------------------ ");

        System.out.println("¿Desea agregar más productos?");   
        scan.nextLine(); // consume the '\n' character in the buffer
        pregunta = scan.nextLine().toLowerCase();
        
    } while (!pregunta.equals("no"));
    
    System.out.println("------------------------------------------ ");
    System.out.println("Productos comprados:");
    for (int i = 0; i < contadorProductos; i++) {
        System.out.println(productos[i].nombre + " x " + productos[i].cantidad + " = $" + (productos[i].precio * productos[i].cantidad));
    }
    
    System.out.println("El total a pagar es: $" + total_precio);
    System.out.println("Cantidad de productos: " + total_productos);
    } 
   
    
}
