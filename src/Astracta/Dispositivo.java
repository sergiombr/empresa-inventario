/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Astracta;

/**
 *
 * @author Sergio
 */
public abstract class Dispositivo {
    
    private int ID;
    private String Serie;
    private String marca;

    public Dispositivo() {
    }

    public Dispositivo(int ID, String Serie, String marca) {
        this.ID = ID;
        this.Serie = Serie;
        this.marca = marca;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
