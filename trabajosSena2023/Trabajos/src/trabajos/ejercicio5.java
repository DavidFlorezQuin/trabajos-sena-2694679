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
public class ejercicio5 {
    public void ejercicio() {
        
        Scanner sc = new Scanner(System.in);
        int n, horasTrabajadas;
        double salarioSemanal, salarioNormal, salarioExtra, salarioTriple;
        char continuar;
        
        do {
            System.out.print("Ingrese la cantidad de obreros: ");
            n = sc.nextInt();
            
            for (int i = 1; i <= n; i++) {
                System.out.println("Obrero " + i + ":");
                System.out.print("Ingrese las horas trabajadas en la semana: ");
                horasTrabajadas = sc.nextInt();
                
                if (horasTrabajadas > 40) {
                    salarioNormal = 40 * 100; // Supongamos que el salario normal es de $100 por hora
                    if (horasTrabajadas <= 48) {
                        salarioExtra = (horasTrabajadas - 40) * 200;
                        salarioSemanal = salarioNormal + salarioExtra;
                    } else {
                        salarioExtra = 8 * 200;
                        salarioTriple = (horasTrabajadas - 48) * 300;
                        salarioSemanal = salarioNormal + salarioExtra + salarioTriple;
                    }
                } else {
                    salarioSemanal = horasTrabajadas * 100;
                }
                
                System.out.println("El salario semanal del obrero es: $" + salarioSemanal);
            }
            
            System.out.print("¿Desea continuar (S/N)? ");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
        
        System.out.println("Fin del programa.");
    }
}
