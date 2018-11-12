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
                          //Constructor
        Banco bMiCuenta = new Banco();
        System.out.println("Nombre del Cliente" + bMiCuenta.getNombreCliente());
        System.out.println("Saldo" + bMiCuenta.getSaldo());
        
        Banco bMiCuenta2 = new Banco("Carolina" ,500);
        System.out.println("Nombre del Cliente" + bMiCuenta2.getNombreCliente());
        System.out.println("Saldo" + bMiCuenta2.getSaldo());
    }
    
}
class Banco{
    private String NombreCliente;
    private double Saldo;

    public Banco() { 
        NombreCliente ="Daniel Elias Yañez Ponce"; //Dandole atributos al constructor
        Saldo= 500;
    }

    public Banco(String NombreCliente, double Saldo) { // Sobre carga de metodos(Over Ride)
                                                       //Cuando se encuentran varios constructores
        this.NombreCliente = NombreCliente;
        this.Saldo = Saldo;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
}
