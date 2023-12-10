/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import Class.Potencia;
import Class.Suma;
import Class.Resta;
import Class.Division;
import Class.Modulo;
import Class.Multip;
import Class.Raiz;
import javax.swing.JOptionPane;

/**
 *
 * @author Ambiente 209-2
 */
public class Ejercicio2 {
   public static void main(String[] args) {
        Potencia potencia = new Potencia();              
        potencia.setNumero1(2.0);        
        potencia.setNumero2(4.0);
        JOptionPane.showMessageDialog(null, "La potencia es: " +potencia.GenerarResultado());

        Suma suma = new Suma();
        suma.setNumero1(2.0);        
        suma.setNumero2(4.0);
        JOptionPane.showMessageDialog(null, "La suma es: " +suma.GenerarResultado());
        
        Resta resta = new Resta();
        resta.setNumero1(2.0);
        resta.setNumero2(4.0);
        JOptionPane.showMessageDialog(null, "la resta es: "+resta.GenerarResultado());
        
        Division division = new Division();
        division.setNumero1(2.0);
        division.setNumero2(4.0);
        JOptionPane.showMessageDialog(null, "la division es: "+division.GenerarResultado());
        
        
       Modulo modulo = new Modulo();
       modulo.setNumero1(2.0);
       modulo.setNumero2(4.0);
       JOptionPane.showMessageDialog(null,"el MOD es: "+ modulo.GenerarResultado());
       
       Multip multip = new Multip();
       modulo.setNumero1(2.0);
       
       JOptionPane.showMessageDialog(null,"la multiplicacion es: "+ multip.GenerarResultado());
       
       Raiz raiz  = new Raiz();
       raiz.setNumero1(2.0);
       raiz.setNumero2(4.0);
       JOptionPane.showMessageDialog(null,"la raiz es: "+ raiz.GenerarResultado());
   }
    
}
