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
public class ejercicio4 {
    public void ejercicio() {
        
        Scanner input = new Scanner(System.in);

        int n, i = 1;
        double promedio = 0, presion, volumen, temperatura, masa;

        System.out.print("Ingrese la cantidad de vehículos en compostura: ");
        n = input.nextInt();

        do {
            System.out.println("\nVehículo #" + i);
            System.out.print("Ingrese el tipo de vehículo (1: motocicleta, 2: automóvil): ");
            int tipo = input.nextInt();

            System.out.print("Ingrese la presión del neumático (en psi): ");
            presion = input.nextDouble();

            System.out.print("Ingrese el volumen del neumático (en pies cúbicos): ");
            volumen = input.nextDouble();

            System.out.print("Ingrese la temperatura del aire (en grados Fahrenheit): ");
            temperatura = input.nextDouble();
            
            masa = presion * volumen * Math.pow((temperatura + 460), 0.37);

            promedio += masa;

            i++; 
        } while (i <= n);
        promedio /= n;

        System.out.println("\nEl promedio de la masa de aire de los neumáticos es: " + promedio + " libras.");
    }
}

