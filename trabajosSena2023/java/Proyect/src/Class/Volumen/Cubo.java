/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Volumen;

/**
 *
 * @author MI PC
 */
public class Cubo extends Volumen {
    //atributos
    private Double base;
    private Double profun;
    private Double altura;
    //metodos
    public Double getBase (){
        return base;
    }
    public void setBase (Double base){
        this.base = base;
    }
    
    public Double getProfun (){
        return profun;
    }
    public void setProfun (Double profun){
        this.profun = profun;
    }
    
    public Double getAltura (){
        return altura;
    }
    public void setAltura (Double altura){
        this.altura = altura;
    }
    //llamamos al main
    
    @Override
    
    public Double Volumen (){
        Double volumen;
        volumen = (this.base*this.profun*this.altura);
        this.setVolumen(volumen);
        
        return this.getVolumen();    
    }
}
