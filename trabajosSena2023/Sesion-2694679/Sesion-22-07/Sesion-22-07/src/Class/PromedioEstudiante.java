/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author david
 */
public class PromedioEstudiante {
    private Double ExamMate,ExamFisica, ExamQuimica, MateNota1, MateNota2, MateNota3, FisicaNota1, FisicaNota2, QuimNota1, QuimNota2, QuimNota3, PromMate, PromFisica, PromQuimica, PromTotal;

    public Double getExamMate() {
        return ExamMate;
    }

    public void setExamMate(Double ExamMate) {
        this.ExamMate = ExamMate;
    }

    public Double getExamFisica() {
        return ExamFisica;
    }

    public void setExamFisica(Double ExamFisica) {
        this.ExamFisica = ExamFisica;
    }

    public Double getExamQuimica() {
        return ExamQuimica;
    }

    public void setExamQuimica(Double ExamQuimica) {
        this.ExamQuimica = ExamQuimica;
    }

    public Double getMateNota1() {
        return MateNota1;
    }

    public void setMateNota1(Double MateNota1) {
        this.MateNota1 = MateNota1;
    }

    public Double getMateNota2() {
        return MateNota2;
    }

    public void setMateNota2(Double MateNota2) {
        this.MateNota2 = MateNota2;
    }

    public Double getMateNota3() {
        return MateNota3;
    }

    public void setMateNota3(Double MateNota3) {
        this.MateNota3 = MateNota3;
    }

    public Double getFisicaNota1() {
        return FisicaNota1;
    }

    public void setFisicaNota1(Double FisicaNota1) {
        this.FisicaNota1 = FisicaNota1;
    }

    public Double getFisicaNota2() {
        return FisicaNota2;
    }

    public void setFisicaNota2(Double FisicaNota2) {
        this.FisicaNota2 = FisicaNota2;
    }


    public Double getQuimNota1() {
        return QuimNota1;
    }

    public void setQuimNota1(Double QuimNota1) {
        this.QuimNota1 = QuimNota1;
    }

    public Double getQuimNota2() {
        return QuimNota2;
    }

    public void setQuimNota2(Double QuimNota2) {
        this.QuimNota2 = QuimNota2;
    }

    public Double getQuimNota3() {
        return QuimNota3;
    }

    public void setQuimNota3(Double QuimNota3) {
        this.QuimNota3 = QuimNota3;
    }

    public Double getPromTotal() {
        return PromTotal;
    }

    public void setPromTotal(Double PromTotal) {
        this.PromTotal = PromTotal;
    }
    public Double getPromMate() {
        return PromMate;
    }

    public void setPromMate(Double PromMate) {
        this.PromMate = PromMate;
    }

    public Double getPromFisica() {
        return PromFisica;
    }

    public void setPromFisica(Double PromFisica) {
        this.PromFisica = PromFisica;
    }

    public Double getPromQuimica() {
        return PromQuimica;
    }

    public void setPromQuimica(Double PromQuimica) {
        this.PromQuimica = PromQuimica;
    }
    
    public Double MostrarMate(){
        this.setPromMate((this.getExamMate()*0.9)+(((this.getMateNota1()+this.getMateNota2()+this.getMateNota3())/3)*0.1));
        return this.getPromMate();
    }
    public Double MostrarFisica(){
       this.setPromFisica((this.getExamFisica()*0.8)+(((this.getFisicaNota1()+this.getFisicaNota2())/2)*0.2));
       return this.PromFisica;
    }
    public Double MostrarQuimica(){
       this.setPromQuimica((this.getExamQuimica()*0.8)+(((this.getQuimNota1()+this.getQuimNota1()+this.getQuimNota3())/3)*0.2));
       return this.PromQuimica;
    }
    
    public Double Mostrar(){
       this.setPromTotal(this.getPromMate()+this.getPromQuimica()+this.getPromFisica()/3);
       return this.PromTotal;
    }
    
}
