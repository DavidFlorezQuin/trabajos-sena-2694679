/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author MI PC
 */
public class Rectangulo extends Area{
    
    //ponemos los atributos
    private Double base;
    private Double altura;
    
    //ponemos los metodos
    public Double getBase (){
        return base;
    }
    public void setBase (Double base){
        this.base = base;
    }
    
    public Double getAltura (){
        return altura;
    }
    public void setAltura (Double altura){
        this.altura = altura;
    }
    //llamamos el main
    @Override
    
    public Double Area(){
        Double area;
        area = (this.base*this.altura);
        this.setArea(area);
        
        return this.getArea();
    }
}
