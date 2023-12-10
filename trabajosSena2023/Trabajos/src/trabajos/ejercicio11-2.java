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
public class ejercicio112 {
    public void ejercicio() {
        
      Scanner sc = new Scanner(System.in);
      
      int candidato1 = 0, candidato2 = 0, candidato3 = 0;
      int totalVotos = 2500000;
      
      for (int i = 1; i <= totalVotos; i++) {
         System.out.print("Ingrese el número del candidato por el cual votó el votante " + i + ": ");
         int voto = sc.nextInt();
         
         switch (voto) {
            case 1:
               candidato1++;
               break;
            case 2:
               candidato2++;
               break;
            case 3:
               candidato3++;
               break;
            default:
               System.out.println("Voto inválido. Ingrese 1, 2 o 3 solamente.");
               i--;
               break;
         }
      }
      
      int ganador = 0;
      int votosGanador = 0;
      
      if (candidato1 > votosGanador) {
         ganador = 1;
         votosGanador = candidato1;
      }
      
      if (candidato2 > votosGanador) {
         ganador = 2;
         votosGanador = candidato2;
      }
      
      if (candidato3 > votosGanador) {
         ganador = 3;
         votosGanador = candidato3;
      }
      
      System.out.println("El ganador de las elecciones es el candidato número " + ganador + " con " + votosGanador + " votos.");
   }

}
