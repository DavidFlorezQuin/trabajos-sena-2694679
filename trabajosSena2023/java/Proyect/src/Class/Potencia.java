/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Ambiente 209-2
 */
public class Potencia extends CapturaOperaciones {
    
    @Override
    public Double GenerarResultado() {
        this.setResultado(Math.pow(super.getNumero1(), super.getNumero2()));
        return super.getResultado();
    }
}
