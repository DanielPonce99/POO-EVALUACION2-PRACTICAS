/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_interfaces;

/**
 *
 * @author Daniel Elias Yañez Ponce 18550346
 */
public class EVA2_19_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class Caballo implements ComportamientoAnimal{
    @Override
    public void Movimiento(){
        System.out.println("Galopar");
    }
    @Override
    public void Comer(){
        System.out.println("Avena");
    }
            
}
interface ComportamientoAnimal{//Define uncomportamiento estandar a una clase
    public void Movimiento();
    public void Comer();
}