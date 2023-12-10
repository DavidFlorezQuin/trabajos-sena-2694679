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
public class ejercicio122 {
    public void ejercicio() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        int producto = 0;
        for (int i = 1; i <= b; i++) {
            producto += a;
        }
        System.out.println("El producto de " + a + " por " + b + " es: " + producto);
    }
}
