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
        
       clsCuadrado cuadrado =new clsCuadrado(3, 4, 5);
       clsRectangulo rect=new clsRectangulo(5,6 , 0, 0);
       clsCirculo circ=new clsCirculo(5, 0, 0);
       clsTriangulo trian = new clsTriangulo(4, 3, 2, 5, 0, 0);
       
       
       
        System.out.println(cuadrado.obtenerArea()); 
        System.out.println(rect.obtenerArea()); 
        System.out.println(circ.obtenerArea()); 
        System.out.println(trian.obtenerArea()); 
        
      
       
        
        
        
        
        // TODO code application logic here
    }
    
}
