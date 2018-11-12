/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Elias Yañez Ponce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado em = new Empleado();
        em.setNombre("Ruben");
        em.setApellido("Hernandez");
        em.setRfc("3242DFS");
        
        System.out.println("");
        Alumno al = new Alumno();
        al.setNombre("Daniel ");
        al.setApellido("Yañez ");
        al.setNoControl("DFSF4W");
        
        imprimirDatos(em);
                imprimirDatos(al);
    }
    private static void imprimirDatos(Persona pPerso){
    pPerso.imprimirNombre();
    }
}
