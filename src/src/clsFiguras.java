package src;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CENTIC
 */
public abstract  class clsFiguras {
    private float x;
    private float y;

    public clsFiguras(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    
    

    public clsFiguras() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    
  public abstract double calcularArea();
  public abstract double calcularPerimetro();
    
    
}
