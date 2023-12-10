/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Class.PromedioEstudiante;

/**
 *
 * @author david
 */
public class ViewEstudiante {
    
    public static void main(String[] args) {
        PromedioEstudiante obj = new PromedioEstudiante ();
        obj.setExamMate(4.0);
        obj.setMateNota1(3.0);
        obj.setMateNota2(3.6);
        obj.setMateNota3(4.0);
        
        obj.setExamFisica(2.8);
        obj.setFisicaNota1(3.0);
        obj.setFisicaNota2(3.6);
        
        obj.setExamQuimica(4.5);
        obj.setQuimNota1(3.0);
        obj.setQuimNota2(4.0);
        obj.setQuimNota3(3.0);
        System.out.println(obj.MostrarMate());
        System.out.println(obj.MostrarFisica());
        System.out.println(obj.MostrarQuimica());
        System.out.println(obj.Mostrar());
    }
}
