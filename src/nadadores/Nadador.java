/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadadores;

/**
 *
 * @author victor
 */
public class Nadador {
    private int dorsal; // Solo lectura. Sin setter
    private String nombre;
    private int edad;
    private String club;

    public Nadador(String nombre, int edad, String club) {
        this.nombre = nombre;
        this.edad = edad;
        this.club = club;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
      
}
