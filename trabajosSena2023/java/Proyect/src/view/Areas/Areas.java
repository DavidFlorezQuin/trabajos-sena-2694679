 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.Areas;

import Class.Areas.Triangulo;
import Class.CapturaNumero;
import Class.Areas.Cuadrado;
import Class.Areas.Rectangulo;
import Class.Areas.Circunfe;
import Class.Areas.Trapecio;
import Class.Areas.Rombo;
import Class.Volumen.Cubo;
import Class.Volumen.Esfera;
import Class.Volumen.Cilindro;
import Class.Volumen.Cono;

/**
 *
 * @author MI PC
 *
 */
//este archivos es lo que se va a visualizar en pantalla por lo tanto
//las otras clases van ligadas a esta 
public class Areas {
    public static void main(String[] args) {
        //Objeto para capturar datos
        CapturaNumero x = new CapturaNumero();

        //Hallar área del triángulo
        Triangulo triangulo = new Triangulo();
        x.setMensaje("Digite la base del triángulo:");
        triangulo.setBase(x.Capturar());
        x.setMensaje("Digite la altura del triángulo:");
        triangulo.setAltura(x.Capturar());
        System.out.println("El área del triángulo es: "+triangulo.Area());
        
        //hallar el area del cuadrado
        Cuadrado cuadrado = new Cuadrado();
        x.setMensaje("digite el lado del cuadrado: ");
        cuadrado.setLado(x.Capturar());
        System.out.println("El área del cuadrado es: "+cuadrado.Area());
        
        //hallar el rectangulo
        
        Rectangulo rectangulo=new Rectangulo();
        x.setMensaje("digite la base del rectangulo: ");
        rectangulo.setBase(x.Capturar());
        x.setMensaje("diite la altura o lado del rectangulo: ");
        rectangulo.setAltura(x.Capturar());
        System.out.println("El area del rectangulo es: "+rectangulo.Area());
        
        //hallar el área de la circunferencia
        Circunfe circunfe = new Circunfe();
        x.setMensaje("Digite el radio de la circunferencia: ");
        circunfe.setRadio(x.Capturar());
        System.out.println("El área de la circunferencia es: "+circunfe.Area());
        
        
        //hallar el área del trapecio
        Trapecio trapecio = new Trapecio();
        x.setMensaje("Digite la primera base del trapecio: ");
        trapecio.setB1(x.Capturar());
        x.setMensaje("Digite la segunda basse del trapecio: ");
        trapecio.setB2(x.Capturar());
        x.setMensaje("Digite la altura perpendicular del trapecio: ");
        trapecio.setH(x.Capturar());
        System.out.println("El área del trapecio es: "+trapecio.Area());
                
         //hallar el área del rombo
           Rombo rombo = new Rombo();
          x.setMensaje("Digite la diagonal mayor del rombo: ");
          rombo.setDiama(x.Capturar());
          x.setMensaje("Digite la diagonal menor del rombo: ");
          rombo.setDiame(x.Capturar());
          System.out.println("El área del rombo es: "+rombo.Area());
                
                
           //hallar e volumen de cubo
                
          Cubo cubo = new Cubo();
          x.setMensaje("Digite la base del cubo: ");
           cubo.setBase(x.Capturar());
            x.setMensaje("Digite la profundidad del cubo: ");
           cubo.setProfun(x.Capturar());
                x.setMensaje("Digite la altura del cubo: ");
                cubo.setAltura(x.Capturar());
                System.out.println("El volumen del cubo es: "+cubo.Volumen());
                
            //hallar e volumen de la esfera
                
               Esfera esfera = new Esfera();
               x.setMensaje("Digite la radio de la esfera: ");
               esfera.setRadio(x.Capturar());
               System.out.println("el volumen de la esfera es: "+esfera.Volumen());
               
               //hallar el volumen del cilindro
               Cilindro cilindro = new Cilindro();
               x.setMensaje("Digite el radio del cilindro: ");
               cilindro.setRadio(x.Capturar());
               x.setMensaje("Digite la altura del cilindro: ");
               cilindro.setAltura(x.Capturar());
               System.out.println("El volumen del cilindro es: "+cilindro.Volumen());
               
               //hallar el volumen del cono
               Cono cono = new Cono ();
               x.setMensaje("Digite el radio del cono: ");
               cono.setRadio(x.Capturar());
               x.setMensaje("Digite la altura del cono: ");
               cono.setAltura(x.Capturar());
               System.out.println("El volumen del cono es: "+cono.Volumen());
               
    }
    
}
