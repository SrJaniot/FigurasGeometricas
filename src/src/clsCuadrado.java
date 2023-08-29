/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author CENTIC
 */
public class clsCuadrado extends clsRectangulo{
    
    private float lado;

    public clsCuadrado(float lado, float base, float altura, float x, float y) {
        super(base, altura, x, y);
        this.lado = lado;
    }

    public clsCuadrado(float lado, float base, float altura) {
        super(base, altura);
        this.lado = lado;
    }

    public clsCuadrado(float lado) {
        this.lado = lado;
    }
    
    
    
    

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    
     @Override
    public float obtenerArea (){
        float area =lado*lado;
        
        return area;
    }
    
    
     @Override
    public float obtenerPerimetro (){
        float perimetro =4*lado;
        
        return perimetro;
    }

  
    
}
