/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author CENTIC
 */
public class clsCirculo extends clsFiguras{
    final double  pi =Math.PI;
    private double radio;

    public clsCirculo(double radio, float x, float y) {
        super(x, y);
        this.radio = radio;
    }

    public clsCirculo(double radio) {
        this.radio = radio;
    }
    
    public clsCirculo() {
    }
    
    
      @Override
    public float obtenerArea (){
        double area = pi*Math.pow(radio, pi);
        float area2= (float) area;
        
        return area2;
    }
    
    @Override
    public float obtenerPerimetro (){
        double perimetro =2*pi*radio;
        float perimetro2 = (float) perimetro;
        
        return perimetro2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
}
