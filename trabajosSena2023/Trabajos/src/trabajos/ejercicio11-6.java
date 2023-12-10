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
        Scanner sc = new Scanner(System.in);
        int jovenesSolteras = 0;
        for (int i = 1; i <= 1000; i++) {
            System.out.print("Ingrese el número de censo: ");
            int numeroCenso = sc.nextInt();
            System.out.print("Ingrese el sexo (M/F): ");
            String sexo = sc.next();
            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();
            System.out.print("Ingrese el estado civil (a. Soltero, b. Casado, c. Viudo, d. Divorciado): ");
            String estadoCivil = sc.next();
            if (sexo.equalsIgnoreCase("F") && estadoCivil.equalsIgnoreCase("a") && edad >= 16 && edad <= 21) {
                jovenesSolteras++;
                System.out.println("Número de censo de joven soltera: " + numeroCenso);
            }
        }
        System.out.println("El número de jóvenes solteras entre 16 y 21 años es: " + jovenesSolteras);
    }

}
