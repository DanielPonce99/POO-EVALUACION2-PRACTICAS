/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {
    int iValor;
    public Principal(){
        iValor=10;
}

    /**
     * @param args the command line arguments
     */
static String Mensaje = "Hola";
    public static void main(String[] args) {
        Principal Obj = new Principal();
        Obj.Imprimir();
        Obj.Imprimir2(100);
        String Mensaje = "Nada de Hola";
        System.out.println(Mensaje);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            
        }
    }
    

//Aqui Muere todo
public void Imprimir(){
System.out.println("Valor =" + iValor);
}
public void Imprimir2(int iValor){
System.out.println("Valor =" +iValor);
System.out.println("Valor del atributo" +iValor); // This Palabra reservada que se usa para acceder a los miembros de la clase
                                         // Apuntador a la instancia  actual
}
}
