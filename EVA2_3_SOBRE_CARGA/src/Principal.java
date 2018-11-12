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
        Operaciones Obj = new Operaciones();
        System.out.println("La suma de 5 y 7" +Obj.suma(5 , 7));
        System.out.println("La suma de Juan y Perez es " + Obj.suma("Juan", "Perez"));
        System.out.println("true AND false" +Obj.suma(true, false));
        
    }
    
}
class Operaciones{
    // Sobre cagarga de metodos 
    public int suma(int iVal1, int iVal2){
    return iVal1 + iVal2; //Suma
}
    public String suma(String sVal1, String sVal2){
            return sVal1 + sVal2;// Concatenado
                    }
    public boolean suma(boolean bVal1, boolean bVal2){
            return bVal1 && bVal2;// AND
    }
    //Tarea constructor privado para que sirve
    }

