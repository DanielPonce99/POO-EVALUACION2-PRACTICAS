/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author invitado
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private int Estadocivil;

    public Persona() {
        Nombre= "Daniel";
        Apellido = "Yañez";
        Edad = 18;
        Estadocivil = EstadoCivil.Casado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getEstadoCivil() {
        return Estadocivil;
    }

    public void setEstadoCivil(int EstadoCivil) {
        this.Estadocivil = EstadoCivil;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    private String Direccion;
}
