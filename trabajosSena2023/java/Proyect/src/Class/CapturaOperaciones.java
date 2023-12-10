/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Ambiente 209-2
 */
public abstract class CapturaOperaciones {
    //crea el atributo
    private Double numero2;
    private Double numero1;
    private Double resultado;
    //se ponen metodos para que se pueda agregar y mostrar los datos de los atributos

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }
//las subclases sí pueden tener acceso al campo o método.
    protected Double getResultado() {
        return resultado;
    }

    protected void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public Double GenerarResultado(){
        return null;
    }
    
}
