/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Astracta.Dispositivo;

/**
 *
 * @author Sergio
 */
public class Bodega {

    public Bodega() {
    }
    
   
    private Object BD[] = new Object[10];
    private int Contador = 0;

    public int getContador() {
        return Contador;
    }
    

    public boolean agregar(Object tmp) {
        if (Contador < 10) {
            BD[Contador] = tmp;
            Contador++;
            return true;
        } else {
            return false;
        }

    }

    public Object[] GetBD(){
    return BD;
    }
    
    public Dispositivo buscarXID(int id){
        
        Object canasta[] = GetBD();
        for (int i = 0; i <getContador(); i++) {
            Dispositivo Eldispo = (Dispositivo) canasta[i];
            if (Eldispo.getID()== id){
            return Eldispo;
            }
        }
        

        return null;
    
    }
    
}
