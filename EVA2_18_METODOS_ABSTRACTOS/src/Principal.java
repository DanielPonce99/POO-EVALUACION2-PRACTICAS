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
        Horse.Comer();}
    Aveztruz Aveztru = new Aveztruz();
      
    }
    


class Aveztruz extends Animal{
    @Override
    public void Movimiento(){
         
        System.out.println("Corre");

    }
    @Override
    public void Comer(){
        System.out.println("Comer");
    }
    }
class Caballo extends Animal{
    @Override
    public void Movimiento(){
         
        System.out.println("Galopar");

    }
    @Override
    public void Comer(){
        System.out.println("Comer");
    }
    }
abstract class Animal{
    abstract public void Movimiento();// Abstrac en metodos no va hacer nada hasta que lo imlementas
    abstract public void Comer();     
}
