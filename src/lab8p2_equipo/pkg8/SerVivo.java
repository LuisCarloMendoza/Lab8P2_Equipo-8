/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_equipo.pkg8;

import java.io.Serializable;

/**
 *
 * @author luiscarlomendoza
 */
public class SerVivo implements Serializable{
    
    private String nombre;
    private int ID;
    private int poder;
    private int anios;
    private String raza;
    private String universoProcedencia;

    public SerVivo() {
    }

    public SerVivo(String nombre, int ID, int poder, int anios, String raza, String universoProcedencia) {
        this.nombre = nombre;
        this.ID = ID;
        this.poder = poder;
        this.anios = anios;
        this.raza = raza;
        this.universoProcedencia = universoProcedencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getUniversoProcedencia() {
        return universoProcedencia;
    }

    public void setUniversoProcedencia(String universoProcedencia) {
        this.universoProcedencia = universoProcedencia;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public String toString2(){
        
        String l = "-" + nombre + "\n" +
               "-" + ID + "\n" +
               "-" + poder + "\n" +
               "-" + anios + "\n" +
               "-" + raza + "\n" +
               "-" + universoProcedencia + "\n";
        
        return l;
    }
    
    
    
}
