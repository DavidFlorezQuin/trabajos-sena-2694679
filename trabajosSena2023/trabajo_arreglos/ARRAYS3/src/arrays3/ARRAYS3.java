/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays3;
import java.util.Scanner;

/**
 *
ESTE ES EL PUNTO 3 Y 4
*/

/**
 *
 * @author Ambiente 209-3
 */
public class ARRAYS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n]; // Crear un vector de tamaño n
        
        // Almacenar los números del 1 al n en el vector
        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }
        
        // Imprimir los números pares e impares
        System.out.println("Números pares:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
        
        System.out.println("Números impares:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}

