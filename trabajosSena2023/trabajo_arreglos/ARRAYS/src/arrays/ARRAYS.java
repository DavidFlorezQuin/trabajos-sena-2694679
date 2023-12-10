/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Ambiente 209-3
 */
public class ARRAYS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[100]; // Crear un vector de tamaño 100
        
        // Almacenar los números del 1 al 100 en el vector
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }
        
        // Imprimir los números almacenados en el vector
        for (int i = 0; i < 100; i++) {
            System.out.println(numeros[i]);
        }
        }
    
}
