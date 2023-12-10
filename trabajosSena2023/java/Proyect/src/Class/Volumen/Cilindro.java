/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Volumen;

/**
 *
 * @author MI PC
 */
public class Cilindro extends Volumen{
    //atributos
    private Double radio;
    private Double altura;
    //metodos
    
    public Double getRadio (){
        return radio;
    }
    public void setRadio (Double radio){
        this.radio = radio;
    }
    
    
    public Double getAltura (){
        return altura;
    }
    public void setAltura (Double altura){
        this.altura = altura;
    }
    //llamamos al main
    @Override
    
    public Double Volumen(){
        Double volumen;
        volumen = (Math.PI*Math.pow(radio, 2)*altura);
        this.setVolumen(volumen);
        
        return this.getVolumen();
    }
    
}
