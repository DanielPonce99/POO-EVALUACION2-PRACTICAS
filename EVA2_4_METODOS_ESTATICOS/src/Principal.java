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
       //Operaciones oObj = new Operaciones();
        System.out.println("Hola" +Operaciones.iValor);
        
    }
    
}
class Operaciones{
    static int iValor=100;
     public static int suma(int iVal1, int iVal2){//Todo lo que esta en estatico cuando arranca el programa se crea
                                                  //El static principalmente se crea para crear librerias
        return iVal1 + iVal2;
    }
    public static String suma(String sVal1, String sVal2){
        return sVal1 + sVal2;
    }
    public static boolean suma(boolean bVal1, boolean bVal2){
        return bVal1 && bVal2;
    }
}
