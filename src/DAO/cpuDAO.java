/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.Bodega;
import FileLoad.Leer;
import FileSave.Guardar;
import Tabla.TablaSimple;
import VO.MarcaVO;
import VO.cpuVO;
import java.io.BufferedReader;

/**
 *
 * @author Sergio
 */
public final class cpuDAO {
    
    private Bodega BDcpu = new Bodega();

    public boolean almacenar(String tipo, int ID, String Serie, String marca) {

        cpuVO tmp = new cpuVO(tipo, ID, Serie, marca);
        return BDcpu.agregar(tmp);

    }

    public int Size() {
        return BDcpu.getContador();

    }

    public String listaMonitor(MarcaDAO LasMarcas) {
        String lista = "cpu almacenados\n";
        Object tmp[] = BDcpu.GetBD();
        for (int i = 0; i < BDcpu.getContador(); i++) {
            cpuVO cp = (cpuVO) tmp[i];
            MarcaVO estaES = LasMarcas.BuscarNombre(Integer.parseInt(cp.getMarca()));
            lista += (i + 1) + " El ID es  "  +  cp.getID()  +  "  la serie es  " + cp.getSerie() +  " tipo " + cp.getTipo() + " la marca es " + estaES.getNombre() + "\n";

        }
        return lista;

    }

    public boolean Guardar() {
        String cadena = "";
        Object tmp[] = BDcpu.GetBD();
        for (int i = 0; i < BDcpu.getContador(); i++) {
            cpuVO cp = (cpuVO) tmp[i];
            cadena += cp.getMarca() + ";" + cp.getSerie() + ";" + cp.getTipo() + ";" + cp.getID() + cp.getMarca() + "\r\n";
        }
        Guardar send = new Guardar();

        return send.almacenar("las cpu", cadena);

    }

    public void CargarFile() {

        try {
            Leer subir = new Leer();
            BufferedReader tmp = subir.cargaBU("LosMonitores");
            do {
                String texto[];
                texto = tmp.readLine().split(";");
                almacenar(texto[2], Integer.parseInt(texto[3]), texto[1], texto[0]);
                System.out.println(tmp.readLine());

            } while (tmp.ready());
        } catch (Exception e) {
            System.out.println("no hay BD");

        }

    }

    public boolean Salvar() {
        String LaData = "";
        Object canasta[] = BDcpu.GetBD();
        for (int i = 0; i < BDcpu.getContador(); i++) {
            cpuVO Elcp = (cpuVO) canasta[i];
            LaData += Elcp.getMarca() + ";" + Elcp.getSerie() + ";" + Elcp.getTipo() + ";" + Elcp.getID() + "\r\n";
        }
        Guardar send = new Guardar();

        return send.almacenar("Lascpu", LaData);

    }

    public cpuDAO() {
        this.CargarFile();
    }

    public cpuVO buscarXID(int id) {

        return (cpuVO) this.BDcpu.buscarXID(id);
    }

    public String listaMonitor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public TablaSimple crearTabla(MarcaDAO LasMarcas){
    String titulos[]={"ID","MARCA","SERIE","TIPO"};
    int limite = Size();
        
        String datos[][]= new String[limite][titulos.length];
        Object canasta[]=BDcpu.GetBD();
          for (int i = 0; i < BDcpu.getContador(); i++) {
          cpuVO cp =(cpuVO)canasta[i];
          datos[i][0]=""+ cp.getID();
          MarcaVO estaES = LasMarcas.BuscarNombre(Integer.parseInt(cp.getMarca()));
          datos[i][1]= estaES.getNombre();
          datos[i][2]= cp.getSerie();
          datos[i][3]=cp.getTipo();
          }
              
        TablaSimple tmp= new TablaSimple(titulos, datos);
        return tmp;
    }
    

}

    

