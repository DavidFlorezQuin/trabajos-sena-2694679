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
public class ejercicio6 {
    public void ejercicio() {
        Scanner scan = new Scanner(System.in);

        int n;
        double peso, altura, huevos, calidad, sumCalidad = 0, promCalidad, precioKilo;

        System.out.print("Ingrese la cantidad de gallinas en la granja: ");
        n = scan.nextInt();

        int i = 0;
        do {
            System.out.println("Gallina #" + (i+1));
            System.out.print("Ingrese el peso en kg de la gallina: ");
            peso = scan.nextDouble();
            System.out.print("Ingrese la altura en cm de la gallina: ");
            altura = scan.nextDouble();
            System.out.print("Ingrese la cantidad de huevos que pone la gallina: ");
            huevos = scan.nextDouble();

            calidad = peso * altura / huevos;
            sumCalidad += calidad;

            i++;
        } while (i < n);

        promCalidad = sumCalidad / n;

        if (promCalidad >= 15) {
            precioKilo = 1.2 * promCalidad;
        } else if (promCalidad > 8 && promCalidad < 15) {
            precioKilo = 1.0 * promCalidad;
        } else {
            precioKilo = 0.8 * promCalidad;
        }

        System.out.println("El precio por kilo de huevo es: $" + precioKilo);

        scan.close();
    }

}
