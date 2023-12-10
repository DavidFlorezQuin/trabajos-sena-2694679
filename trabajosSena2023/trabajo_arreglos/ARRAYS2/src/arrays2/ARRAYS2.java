/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays2;
import java.util.Scanner;

/**
 *
 * @author Ambiente 209-3
 */
public class ARRAYS2 {

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
        
        // Imprimir los números almacenados en el vector
        System.out.println("Los números almacenados en el vector son:");
        for (int i = 0; i < n; i++) {
            System.out.println(numeros[i]);
        }
        }
    
}
