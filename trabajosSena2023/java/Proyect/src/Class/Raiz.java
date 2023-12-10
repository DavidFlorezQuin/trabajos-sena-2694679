/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Ambiente 209-2
 */
public class Raiz extends CapturaOperaciones {
     @Override
    public Double GenerarResultado(){
        this.setResultado(Math.sqrt(super.getNumero1()));
       return super.getResultado();
    }
    
}
