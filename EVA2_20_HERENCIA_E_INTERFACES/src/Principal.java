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
    Hijo hi = new Hijo();
        hi.Algo();
        hi.Mensaje();
        hi.OtroMensaje();
    }
    
}
    


    

class Hijo extends Padre implements Accesorio, AlgoMas{

    @Override
    public void Mensaje() {
        System.out.println("Que onda Bro");
       
    }

    @Override
    public void OtroMensaje() {
       System.out.println("Que onda Bro");
    }
 }
class Padre {
    public void Algo(){
        System.out.println("Mesaje de la clase base");
    }
}

interface Accesorio{
    public void Mensaje();
}
interface AlgoMas{
    public void OtroMensaje();
}