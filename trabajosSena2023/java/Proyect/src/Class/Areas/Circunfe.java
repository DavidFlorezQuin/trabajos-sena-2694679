/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author MI PC
 */
public class Circunfe extends Area {
    //los atributos
    private Double radio;
    //metodos
    public Double getRadio(){
        return radio;
    }
    public void setRadio(Double radio){
        this.radio = radio;
    }
    
    //llamamos al main
    @Override
    
    public Double Area (){
        Double area;
        area = (Math.PI*Math.pow(radio, 2));
        this.setArea(area);
        
        return this.getArea();
                
    }
}
