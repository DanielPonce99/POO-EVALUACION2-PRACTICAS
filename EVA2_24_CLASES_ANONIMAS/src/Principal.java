/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Elias Yañez Ponce
 */
public class Principal  implements ImprimirMensaje{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Principal pObj = new Principal();
        pObj.imprimeMensaje("Daniel");
        
        
        //ImprimirMensaje es una interfaz. NO SE PUEDEN CREAR OBJETOS DE INTERFACES.
        //CREAR UNA INTERFAZ ANÓNIMA QUE IMPLEMENTA LOS MÉTODOS DE LA INTERFAZ
        ImprimirMensaje objImprimir = new ImprimirMensaje(){
            @Override
            public void imprimeMensaje(String sMensa) {
                System.out.println("Hola " + sMensa);
            }
            
        };
        objImprimir.imprimeMensaje("Yañez");
        
    }

    @Override
    public void imprimeMensaje(String sMensa) {
        System.out.println("Hola " + sMensa);
    }
    
}

interface ImprimirMensaje{
    public void imprimeMensaje(String sMensa);
}

