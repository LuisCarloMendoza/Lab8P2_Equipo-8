/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_equipo.pkg8;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author luiscarlomendoza
 */
public class Universo implements Serializable {
    private String nombre;
    private ArrayList<SerVivo> seresVivos = new ArrayList();
    private int id;

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<SerVivo> getSeresVivos() {
        return seresVivos;
    }

    public void setSeresVivos(ArrayList<SerVivo> seresVivos) {
        this.seresVivos = seresVivos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
