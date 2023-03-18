/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_equipo.pkg8;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author luiscarlomendoza
 */
public class adminBarra implements Runnable {

    private JProgressBar barra;
    private ArrayList<SerVivo> seres = new ArrayList();

    public adminBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public ArrayList<SerVivo> getSeres() {
        return seres;
    }

    public void setSeres(ArrayList<SerVivo> seres) {
        this.seres = seres;
    }

    @Override
    public void run() {
        while (true) {
            barra.setValue(barra.getValue() + 100);
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(adminBarra.class.getName()).log(Level.SEVERE, null, ex);
            }
        } //FIN IF
        
    }

}
