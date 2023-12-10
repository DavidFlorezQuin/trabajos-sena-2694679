/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays6;
import java.util.Scanner;

/**
 *
 * @author Ambiente 209-3
 */
public class ARRAYS6 {

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
        
        // Imprimir los números menores a 500
        System.out.println("Números menores a 500:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] < 500) {
                System.out.println(numeros[i]);
            }
        }
    }

}
