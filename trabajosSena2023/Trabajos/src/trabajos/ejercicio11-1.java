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
public class ejercicio111 {
    public void ejercicio() {
                Scanner input = new Scanner(System.in);
        int alumnosSinDerecho = 0;
        
        for (int i = 1; i <= 40; i++) {
            int sumaCalificaciones = 0;
            
            System.out.println("Ingrese las calificaciones del alumno " + i + ":");
            
            for (int j = 1; j <= 5; j++) {
                System.out.print("Calificación " + j + ": ");
                int calificacion = input.nextInt();
                sumaCalificaciones += calificacion;
            }
            
            double promedio = sumaCalificaciones / 5.0;
            
            if (promedio < 6) {
                alumnosSinDerecho++;
            }
        }
        
        System.out.println("La cantidad de alumnos sin derecho al examen de nivelación es: " + alumnosSinDerecho);
    }

}
