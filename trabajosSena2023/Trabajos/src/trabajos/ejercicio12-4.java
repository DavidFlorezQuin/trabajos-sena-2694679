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
public class ejercicio116 {
    public void ejercicio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el multiplicando: ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el multiplicador: ");
        int n = scanner.nextInt();
        int producto = 0;
        for (int i = 0; i <= n; i++) {
            producto = m*i;
            System.out.println(m + " * " + i + " = " + producto);
        }
    }

}
