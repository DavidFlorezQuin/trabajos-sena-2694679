/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author MI PC
 */
//estas son las clases en las que se enlazaran la clase del area
public class Triangulo extends Area{
    //creamos los atributos 
    private Double base;
    private Double altura;
     //se pone un codio para recibir y mostrar informacion para cada atributo
    
    public Double getBase(){
        return base;
    }
    public void setBase(Double base){
        this.base = base;
    }
    
    public Double getAltura(){
        return altura;
    }
    public void setAltura(Double altura){
        this.altura = altura;
    }
    
    //lo unimos con el main

    /**
     *
     * @return
     */
     @Override
    public Double Area() {
        double area;
        area = (this.getBase()*getAltura())/2;
        this.setArea(area);

        return this.getArea();
    }
     
    
}
