
import Clases.Animal;
import Clases.reproduccion1;
import Clases.Aves;
import Clases.Mamiferos;
import Clases.Piel;
import Clases.Reptiles;
import java.util.Scanner;

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
              Scanner sc = new Scanner ( System .in);
        Animal an = new Animal();
        System.out.println("Cuantas extremidades tiene");
        an.setExtrem(sc.nextInt());
        System.out.println("Cuantos ojos tiene");
        an.setOjos(sc.nextInt());
        
        an.setReproduccion(reproduccion1.Oviparo);
        
        an.setTippiel(Piel.Peludo);
        System.out.println(" Tiene " +an.getExtrem() +" Extremidades " + " Tiene "+an.getOjos()+ " ojos " +an.getReproduccion() + " Tipo de piel "+an.getTippiel());
        
        
        System.out.println("");
        
        Aves av = new Aves();
        System.out.println("Cuantas extremedidades tiene:  ");
        av.setExtrem(sc.nextInt());
        System.out.println(" Tiene " +av.getExtrem() +" Extremidades " + " Tiene "+av.getOjos()+ " ojos " +av.getReproduccion() + " "+av.getTippiel()  );
        Mamiferos ma = new Mamiferos (); 
        System.out.println("Cuantas extremidades tiene: ");
        ma.setExtrem(sc.nextInt());
        System.out.println(" Tiene " +ma.getExtrem() +" Extremidades " + " Tiene "+ma.getOjos()+ " ojos " +ma.getReproduccion() + " "+ma.getTippiel() +" " + ma.getSangre());
        Reptiles re = new Reptiles ();
        System.out.println(" Tiene " +re.getExtrem() +" Extremidades " + " Tiene "+re.getOjos()+ " ojos " +re.getReproduccion() + " "+re.getTippiel());
        
    }
    
}
