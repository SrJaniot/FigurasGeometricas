/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author CENTIC
 */
public class clsRectangulo extends clsFiguras{
    private float base;
    private float altura;

    public clsRectangulo(float base, float altura, float x, float y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public clsRectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    

    public clsRectangulo() {
    }
    
    
    @Override
    public float obtenerArea (){
        float area =base*altura;
        
        return area;
    }
    
    @Override
        public float obtenerPerimetro (){
        float perimetro =2*base+2*altura;
        
        return perimetro;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
