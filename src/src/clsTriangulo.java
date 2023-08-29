/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author CENTIC
 */
public class clsTriangulo extends clsFiguras{
    private float base;
    private float altura;
    private float lado1;
    private float lado2;

    public clsTriangulo(float base, float altura, float lado1, float lado2, float x, float y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public clsTriangulo(float base, float altura, float lado1, float lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

   

    

    public clsTriangulo() {
    }
    @Override
    public float obtenerArea (){
        float area =(base*altura)/2;
        
        return area;
    }
    @Override
    public float obtenerPerimetro (){
        float perimetro =base+lado1+lado1;
        
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

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    
    
}
