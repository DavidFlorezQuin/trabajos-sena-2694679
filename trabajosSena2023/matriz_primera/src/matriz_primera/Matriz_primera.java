/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz_primera;
import java.util.Scanner;

/**
 *
 * @author Ambiente 209-3
 */
public class Matriz_primera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[4][4];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese el valor para " + (i + 1) + "," + (j + 1));
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matriz ingresada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

        System.out.println("Ingrese el número que desea buscar:");
        int buscarNumero = scan.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (buscarNumero == matriz[i][j]) {
                    
                    System.out.println("El número se encontró en la posición: " + (i + 1) + "," + (j + 1));
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El número no se encontró en la matriz.");
        }

        scan.close();
        }
    }
    
