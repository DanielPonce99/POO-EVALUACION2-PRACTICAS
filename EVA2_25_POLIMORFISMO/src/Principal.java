
import Vehiculos.Automovil;
import Vehiculos.Avion;
import Vehiculos.Motocicleta;

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
       Automovil Tsuru = new Automovil();
       Motocicleta Harley = new Motocicleta();
       Avion Boeing = new Avion();
       Tsuru.Seguridad();
       Tsuru.setRuedas(4);
        System.out.println("Ruedas del vehiculo:" + Tsuru.getRuedas());
        
        Harley.Chopper();
       Harley.setRuedas(2);
        System.out.println("Ruedas del vehiculo:" + Harley.getRuedas());
        
       Boeing.Movimiento();
       Boeing.setRuedas(24);
        System.out.println("Ruedas del vehiculo:" + Tsuru.getRuedas());
    }
        public static void imprimirRuedas(Automovil arg){
  System.out.println("Ruedas del vehiculo:" + arg.getRuedas());
  //Si es un automovil, imprimir la segurridad
  if(arg instanceof Automovil){
      //Convertir el vehiculo a aUTOMOVIL
      
  }
} 
}



