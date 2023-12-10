/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author MI PC
 */
public class Cuadrado extends Area {
    //creamo el atributo
    private Double lado;
    //ponemos para que al atributo se le pueda
    //ingresar y mostrar informacion
    
    public Double getLado (){
        return lado;
    }
    
    public void setLado (Double lado){
        this.lado = lado;
    }
    //llamamos al main
    @Override
    
    public Double Area(){
        Double area;
        area = (this.lado*this.lado);
        this.setArea(area);
        
        return this.getArea();
    }
    
    
}
