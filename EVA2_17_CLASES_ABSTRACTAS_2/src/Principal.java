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
        Caballo Horse = new Caballo();
        Horse.Movimiento();
        
    }
    
}
class Caballo extends Animal{
     @Override
     public void Movimiento(){
         super.Movimiento(); //Super es un llamador del constructor es parecido al this que llama a la clase base
        System.out.println("Galopar");
}
}
abstract class Animal{ // Abstract para no crear objetos en ello
    public void Movimiento(){
        System.out.println("Algun tipo de movimiento");
    }
}
