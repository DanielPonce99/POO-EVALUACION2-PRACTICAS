/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Elias Yañez Ponce
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Area de un cuadrado de lado 100 = " +Operaciones.AreaCuadrado(100));
        System.out.println("Area de un Triangulo de lado base 50 por 100 de altura = " +Operaciones.AreaTriangulo(50,100));
        System.out.println(" Area de un rectangulo de 100, 100 = " +Operaciones.AreaRectangulo(100, 100));
        System.out.println("Area de un trapecio de 20,10 y 5 = " +Operaciones.AreaTrapecio(20, 10, 5));
        System.out.println("Area de un rombo de 20, 10 = " + Operaciones.AreaRombo(20, 10));
        System.out.println("Area de una esfera con radio de 20 es = " +Operaciones.AreaEsfera(20));
        System.out.println("Area de un cono con radio de 20 y g= 30 es =" +Operaciones.AreaCono(20, 30)); 
        System.out.println("Area de un poligono regular 20,30 = "+Operaciones.AreaPoligonoRegular(20, 30));
        System.out.println("Area de un romboide de 20, 30 = " +Operaciones.AreaRomboide(20, 30));
        System.out.println("Area de un circulo con radio de 10 = " +Operaciones.AreaCirculo(10));
        
        
    }
    
}
class Operaciones{
    //  Los metodos estaticos existen desde que el programa inicia, y solamete
    //se pueden usar a traves de la clase a la que pertenecen NO SON INSTANCIABLES
    //Son utiles para crear librerias de constantes y funciones, para usarlas sin crear objetos
    public static double AreaCuadrado (double Lado){
        return Lado * Lado;
    }
    public static double AreaTriangulo (double Base, double Altura){
        return (Base * Altura) /2;
    }
    public static double AreaRectangulo (double Base, double Altura){
        return (Base * Altura);
    }
    public static double AreaTrapecio (double Base, double BaseMenor, double Altura){
        return ((Base + BaseMenor)*Altura)/2;
    }
    public static double AreaRombo (double DistanciaBase, double DistanciaAltura){
        return (DistanciaBase * DistanciaAltura)/2;
    }      
    public static double AreaEsfera (double radio){
    return 4*(3.14 * (radio*radio) );
     }  
    public static double AreaCono (double rad, double g){
         return (3.14 * rad) *( g+rad);
}
    public static double AreaPoligonoRegular (double peri, double apo){
         return (peri * apo)/2;
}
    public static double AreaRomboide (double base, double al){
         return base * al;
}
    public static double AreaCirculo ( double radio){
         return (3*14 * ((radio)*(radio)));
    }
        }
    
