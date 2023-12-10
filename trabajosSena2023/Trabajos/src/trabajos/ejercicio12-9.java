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
public class ejercicio129 {
    public void ejercicio() {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        
        int mcm = 0;
        
        if (num2 % 2 != 0) { // Si el segundo número es impar
            int max = Math.max(num1, num2);
            int min = Math.min(num1, num2);
            
            int i = 1;
            while (mcm == 0) {
                int temp = max * i;
                if (temp % min == 0) {
                    mcm = temp;
                }
                i++;
            }
            System.out.println("El mínimo común múltiplo es: " + mcm);
        } else {
            System.out.println("El segundo número debe ser impar para calcular el mínimo común múltiplo.");
        }
    }
}
