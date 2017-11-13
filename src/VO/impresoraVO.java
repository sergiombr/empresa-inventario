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
public class impresoraVO extends Dispositivo{

    
    
    private String tipo;

    public impresoraVO() {
    }

    public impresoraVO(String tipo, int ID, String Serie, String marca) {
        super(ID, Serie, marca);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean almacenar(String tipo, int ID, String Serie, String marca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
