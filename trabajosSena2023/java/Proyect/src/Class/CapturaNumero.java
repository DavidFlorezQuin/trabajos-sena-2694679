package Class;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 import java.util.Scanner;
/**
 *
 * @author 
 */
public class CapturaNumero {
    //crea el atributo
    private Double numero;
    private String mensaje;
    
    private void setNumero(Double numero) {
        this.numero = numero; //este es el metodo que mete datos
    }
    
    private Double getNumero() {
        return this.numero; //este metodo saca el dato
    }
    
   public String getMensaje() {
        return mensaje;
    }
   
   public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }   
   public Double Capturar(){ //dentro de aqui ponemos el metodo try que
       //sirve para hacer ecepciones a la hora de ejecutar
       Scanner scanner = new Scanner (System.in);
       //el do es para que tener el try por dentro y asi las ecpeciones se hagan mientras este la condicion
       do{
           try{
               System.out.println(this.getMensaje());
               //se modifica el valor del atributo
               this.setNumero(Double.parseDouble(scanner.next())); //conversion para que admita el numero entero
                if (this.getNumero()<=0){
                    System.out.println("Dato no válido, solo números positivos.");
                }
            } catch (Exception e) {
                System.out.println("Dato no válido, no se admite caracteres alfanumericos.");
                this.setNumero(Double.parseDouble("0"));
            
           }
       } while(this.getNumero() <= 0);
         //Retorna el valor del atributo
        return this.getNumero();//esto es para mostrar al final el numero
       
   
   }
}

