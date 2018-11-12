
import Clase.Cliente;
import Clase.Empleados;
import Clase.EstadoCivil;
import Clase.Persona;

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
        Persona Obj = new Persona();
        System.out.println("PERSONA");
        /*Obj.setNombre("Daniel");
        Obj.setApellido("Yañez");
        Obj.setEstadoCivil(EstadoCivil.Viudo);*/
        System.out.println(Obj.getNombre() + " " + Obj.getApellido() + " " + Obj.getEdad());
        Empleados Obj1 = new Empleados();
        System.out.println("EMPLEADOS");
        /*Obj1.setNombre("Juan");
        Obj1.setApellido("Perez");
        Obj1.setEstadoCivil(EstadoCivil.Casado);
        Obj1.setSalario(1);*/
        System.out.println(Obj1.getNombre() + " " + Obj1.getApellido() + " " + Obj1.getEdad());
        Cliente Obj2 = new Cliente();
        System.out.println("CLIENTES");
        /*Obj2.setNombre("Rodrigo");
        Obj2.setApellido("Gonzalez");
        Obj2.getRFC("DAY");*/
            System.out.println(Obj2.getNombre() + " " + Obj2.getApellido() + " " + Obj2.getEdad());
            
    }

    public Principal() {
    }
    }
    

