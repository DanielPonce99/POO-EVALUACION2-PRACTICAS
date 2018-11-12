/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Elias Yañez Ponce 18550346
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Java ----> Le agrega automaticamente un constructor 
        //Default si no lo declara explicitamente el programador
        //Java --->
                             // Constructor
        Principal pObjPpal = new Principal();
        Prueba pObjPrueba = new Prueba();
        System.out.println(pObjPrueba.X);
    }
    
}
class Prueba{
    int X;
    public Prueba() { //Un constructor no regresa valores y sirve para inizializarla
        X=100;
    }
    
}
