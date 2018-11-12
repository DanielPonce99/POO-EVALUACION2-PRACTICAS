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
        Test Obj = new Test();
        Test Copia = Obj;
        Obj.iVal = 100;
        System.out.println(Obj.iVal);
        System.out.println(Obj);
        System.out.println(Copia);
        Obj = new Test();
        System.out.println("Señor Slim, usted tiene" + Obj.iVal);
        Obj = null;
        System.out.println(Obj);
        System.out.println("Tranquilo Sr.Slim tiene" + Copia);
    }
    
}
class Test{
    int iVal;
}
