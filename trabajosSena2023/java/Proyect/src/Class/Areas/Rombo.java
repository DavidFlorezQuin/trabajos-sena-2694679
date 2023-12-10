/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author MI PC
 */
public class Rombo extends Area {
    //atributos
    private Double diama;
    private Double diame;
    //metodos
    
    public Double getDiama(){
        return diama;
    }
    public void setDiama(Double diama){
        this.diama = diama;
    }
    
    public Double getDiame(){
        return diame;
    }
    public void setDiame(Double diame){
        this.diame = diame;
    }
    
    //llamamos al main
    @Override
    public Double Area(){
        Double area;
        area =(this.diama*this.diame)/2;
        this.setArea(area);
        
        return this.getArea();
    }
}
