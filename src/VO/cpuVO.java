/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import Astracta.Dispositivo;

/**
 *
 * @author Sergio
 */
public class cpuVO extends Dispositivo{

 
 
    
    private String tipo;

    public cpuVO() {
    }

    public cpuVO(String tipo, int ID, String Serie, String marca) {
        super(ID, Serie, marca);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
