/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays7;
import java.util.Scanner;

/**
 *
 * @author Ambiente 209-3
 */
public class ARRAYS7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n]; // Crear un vector de tamaño n
        
        // Almacenar los números del 1 al n en el vector
        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }
        
        // Imprimir los números primos
        System.out.println("Números primos:");
        for (int i = 0; i < n; i++) {
            if (esPrimo(numeros[i])) {
                System.out.println(numeros[i]);
            }
        }
    }
    
    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;    
    }
    
}
