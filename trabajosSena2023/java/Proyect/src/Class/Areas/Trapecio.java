/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author MI PC
 */
public class Trapecio extends Area {
    //atributos
    private Double b1, b2, h;
    //metodos
    public Double getB1 (){
        return b1;
    }
    public void setB1(Double b1){
        this.b1 = b1;
    }
    
    public Double getB2 (){
        return b2;
    }
    public void setB2 (Double b2){
        this.b2 = b2;
    }
    
    public Double getH (){
        return h;
    }
    public void setH (Double h){
        this.h = h;
    }
    
    //llamamos al main
    @Override
    public Double Area(){
        Double area;
        area = ((this.b1*this.b2)*h)/2;
        this.setArea(area);
        
        return this.getArea();
    }
}
