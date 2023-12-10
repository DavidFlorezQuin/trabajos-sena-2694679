/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz_segundo;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-3
 */
public class Matriz_segundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //DECLARAR LA PRIMER MATRIZ
        int[][] matriz = new int[2][2];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Ingrese el valor para " + (i + 1) + "," + (j + 1));
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("PRIMER MATRIZ:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

        //DECLARAR LA SEGUNDA MATRIZ

        int[][] matrizdos = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Ingrese el valor para " + (i + 1) + "," + (j + 1));
                matrizdos[i][j] = scan.nextInt();
            }
        }

        System.out.println("SEGUNDA MATRIZ:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizdos[i][j] + "|");
            }
            System.out.println();
        }
        
        
        //TERCER MATRIZ
         int[][] matriztres = new int[2][2];

            for (int i = 0; i<2; i++ ){
                for (int j = 0; j<2; j++){
                    matriztres [i][j] = matriz[i][j] + matrizdos[i][j]; 
                }
            }
            System.out.println("TERCER MATRIZ:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriztres[i][j] + "|");
            }
            System.out.println();
        }
        
        
        
        
    }
}


