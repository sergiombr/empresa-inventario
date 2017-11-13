/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author Sergio
 */
public class MarcaVO {
    
    private int ID;
    private String nombre;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public MarcaVO(int ID, String nombre ){
    this.ID=ID;
    this.nombre=nombre;
    }
    
    public MarcaVO(){
    } 
    
    public String toString(){
    return nombre;
    }
    
    
}
