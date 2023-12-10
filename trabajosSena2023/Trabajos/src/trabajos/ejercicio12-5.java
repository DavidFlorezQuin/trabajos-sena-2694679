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
public class ejercicio125 {
    public void ejercicio() {

        Scanner sc = new Scanner(System.in);
        int base, exponente, resultado = 1;
        System.out.print("Ingrese la base: ");
        base = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        exponente = sc.nextInt();
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);
        sc.close();
    }
}
