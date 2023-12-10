/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import Class.CapturaNumero;

/**
 *
 * @author Ambiente 209-2
 */
public class Tienda {
    
     public static void main(String[] args) {
        //Los Aprendices de la ficha 79 fin de semana, desea saber el porcentaje
        // de los que aprobaron. 
        // se sabe que apruba con 70 0 más
        Integer cantidad, i, contApr, contDes;
        Double porApr, porDes, nota;
        
        
         CapturaNumero cap = new CapturaNumero();

        cap.setMensaje("Digite la cantidad de Aprendices: ");
        cantidad = cap.Capturar().intValue();
        
        i=0;
        contApr=0;
        contDes=0;
        while (i<cantidad){
            nota= 0.0;
            i++;
            do{
                cap.setMensaje("digite la nota del aprendiz "+i+": ");
                nota = cap.Capturar();
            }while (nota<0 || nota>100);
            if (nota>=70){
                contApr++;
            }else{
                contDes++;
            }
        }
        
        porApr = (double)(contApr*100/cantidad);
        porDes = (double)(contDes*100/cantidad);

        System.out.println("De "+cantidad+" aprobaron %"+porApr);
        System.out.println("De "+cantidad+" desaprobaron %"+porDes);
     }
}
