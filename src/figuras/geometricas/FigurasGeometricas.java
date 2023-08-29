/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras.geometricas;
import src.clsCirculo;
import  src.clsCuadrado;
import src.clsFiguras;
import  src.clsRectangulo;
import src.clsTriangulo;

/**
 *
 * @author CENTIC
 */
public class FigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // TODO code application logic here
       clsCuadrado cuadrado =new clsCuadrado(1, 1, 1, 90, 1);
       clsRectangulo rect=new clsRectangulo(5,6 , 5, 6);
       clsCirculo circ=new clsCirculo(5, 5, 5);
       clsTriangulo trian = new clsTriangulo(4, 3, 2, 5, 5, 5);
       
       
       
        //System.out.println(cuadrado.obtenerArea()); 
        //System.out.println(rect.obtenerArea()); 
        //System.out.println(circ.obtenerArea()); 
        //System.out.println(trian.obtenerArea());
        
        
        
        
        System.out.println(circ.getX()); 
          System.out.println(cuadrado.getX()); 
            System.out.println(rect.getX()); 
              System.out.println(trian.getX()); 
              
              
              
             cuadrado.setX(40);
             System.out.println(cuadrado.getX()); 
        
        
        
    }
    
}
