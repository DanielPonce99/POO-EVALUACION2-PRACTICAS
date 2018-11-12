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
        //REFERENCIAS:  Variable que guarda una direccion de memoria
        //APUNTADORES
        Prueba Obj = new Prueba ();
        Obj.iValor = 100;
        System.out.println("El valor es" +Obj.iValor);
        //COPIA
        int Algo =70;
        int Copia = Algo;
        System.out.println("Algo  =" +Algo);
        System.out.println("Copia =" +Copia);
        Algo = 1000;
        System.out.println("Algo  =" +Algo);
        System.out.println("Copia =" +Copia);
        //COPIA DEL OBJETO
        Prueba CopiaObj = Obj;
        System.out.println("El valor es: " +Obj.iValor);
        System.out.println("El valor es: " +CopiaObj.iValor);
        Obj.iValor =9999;
        System.out.println("El valor es: " +Obj.iValor);
        System.out.println("El valor es: " +CopiaObj.iValor);
    }
    
}
class Prueba{
    int iValor; //4 BYTES
}
