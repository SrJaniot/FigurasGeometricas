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

    public clsCuadrado(float lado, float x, float y) {
        super(x, y);
        this.lado = lado;
    }

    public clsCuadrado(float lado) {
        this.lado = lado;
    }

   

    public clsCuadrado() {
        
        
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
