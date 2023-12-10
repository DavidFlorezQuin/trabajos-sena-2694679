/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Volumen ;

/**
 *
 * @author MI PC
 */
public class Esfera extends Volumen{
    //atributo
    private Double radio;
    
    //metodos
    public Double getRadio (){
        return radio;
    }
    public void setRadio (Double radio){
        this.radio = radio;
    }
    //llamamos al main
    @Override
    
    public Double Volumen (){
        Double volumen;
        volumen =(Math.PI*Math.pow(radio, 3)*4/3);
        this.setVolumen(volumen);
        
        return this.getVolumen();
    }
    
}
