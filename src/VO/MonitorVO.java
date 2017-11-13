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
public class MonitorVO extends Dispositivo {

    private String tipo;
    private String resolucion;
   

    public MonitorVO() {
    }
    
      public MonitorVO(String resolucion) {
        this.resolucion = resolucion;
    }


    public MonitorVO(String tipo, int ID, String Serie, String marca, String resolucion) {
        super(ID, Serie, marca);
        this.tipo = tipo;
        this.resolucion= resolucion;
     
    }

   

    public String getTipo() {
        return tipo;
    }

    public String getresolucion() {
        return resolucion;
    }

    public void setresolucion(String resolucion) {
        this.resolucion = resolucion;
    }

   
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

  
 
    
    }

    


