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
public class ejercicio7 {

    public void ejercicio() {
        Scanner scan = new Scanner(System.in);
        int n, aFavor = 0, enContra = 0, abstencion = 0;
        char continuar;
        float porcFavor, porcContra, porcAbstencion;
        
        do {
            System.out.print("Ingrese la cantidad de diputados en la encuesta: ");
            n = scan.nextInt();
            
            for (int i = 1; i <= n; i++) {
                System.out.print("¿Está a favor (F), en contra (C) o se abstiene (A) el diputado " + i + " del Tratado de Libre Comercio? ");
                char respuesta = scan.next().charAt(0);
                
                switch (respuesta) {
                    case 'F':
                    case 'f':
                        aFavor++;
                        break;
                    case 'C':
                    case 'c':
                        enContra++;
                        break;
                    case 'A':
                    case 'a':
                        abstencion++;
                        break;
                    default:
                        System.out.println("Respuesta inválida. Intente de nuevo.");
                        i--;
                        break;
                }
            }
            
            porcFavor = (float) aFavor / n * 100;
            porcContra = (float) enContra / n * 100;
            porcAbstencion = (float) abstencion / n * 100;
            
            System.out.println("Resultados de la encuesta:\n");
            System.out.printf("A favor: %.2f%%\n", porcFavor);
            System.out.printf("En contra: %.2f%%\n", porcContra);
            System.out.printf("Abstenciones: %.2f%%\n", porcAbstencion);
            
            System.out.print("¿Desea realizar otra encuesta? (S/N): ");
            continuar = scan.next().charAt(0);
            aFavor = 0;
            enContra = 0;
            abstencion = 0;
            
        } while (continuar == 'S' || continuar == 's');
        
        System.out.println("Fin del programa.");
        
    }


}
