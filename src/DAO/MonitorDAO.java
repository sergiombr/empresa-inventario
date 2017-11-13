/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.MarcaVO;
import VO.MonitorVO;
import BD.Bodega;
import FileLoad.Leer;
import FileSave.Guardar;
import Tabla.TablaSimple;
import java.io.BufferedReader;

/**
 *
 * @author Sergio
 */
public final class MonitorDAO {

    private Bodega BDMonitor = new Bodega();

    public boolean almacenar(String tipo, int ID, String Serie, String marca, String resolucion) {
        
        MonitorVO tmp = new MonitorVO(tipo, ID, Serie, marca, resolucion);
        return BDMonitor.agregar(tmp);

    }

    public int Size() {
        return BDMonitor.getContador();

    }

    public String listaMonitor(MarcaDAO LasMarcas) {
        String lista = "monitores almacenados\n";
        Object tmp[] = BDMonitor.GetBD();
        for (int i = 0; i < BDMonitor.getContador(); i++) {
            MonitorVO Moni = (MonitorVO) tmp[i];
            MarcaVO estaES = LasMarcas.BuscarNombre(Integer.parseInt(Moni.getMarca()));
            lista += (i + 1) + " El ID es  "  +  Moni.getID()  +  "  la serie es  " + Moni.getSerie() +  " tipo " + Moni.getTipo() + " la marca es " + estaES.getNombre() + "la resolucion es " + Moni.getresolucion() + "\n";
        }
        return lista;

    }

    public boolean Guardar() {
        String cadena = "";
        Object tmp[] = BDMonitor.GetBD();
        for (int i = 0; i < BDMonitor.getContador(); i++) {
            MonitorVO Moni = (MonitorVO) tmp[i];
            cadena += Moni.getMarca() + ";" + Moni.getSerie() + ";" + Moni.getTipo() + ";" + Moni.getID() + Moni.getMarca() + Moni.getresolucion()+ "\r\n";
        }
        Guardar send = new Guardar();

        return send.almacenar("los monitores", cadena);

    }

    public void CargarFile() {

        try {
            Leer subir = new Leer();
            BufferedReader tmp = subir.cargaBU("LosMonitores");
            do {
                String texto[];
                texto = tmp.readLine().split(";");
                almacenar(texto[2], Integer.parseInt(texto[3]), texto[1], texto[0],texto[4]);
                System.out.println(tmp.readLine());

            } while (tmp.ready());
        } catch (Exception e) {
            System.out.println("no hay BD");

        }

    }

    public boolean Salvar() {
        String LaData = "";
        Object canasta[] = BDMonitor.GetBD();
        for (int i = 0; i < BDMonitor.getContador(); i++) {
            MonitorVO Elmonitor = (MonitorVO) canasta[i];
            LaData += Elmonitor.getMarca() + ";" + Elmonitor.getSerie() + ";" + Elmonitor.getTipo() + ";" + Elmonitor.getID() + Elmonitor.getresolucion()+  "\r\n";
        }
        Guardar send = new Guardar();

        return send.almacenar("LosMonitores", LaData);

    }

    public MonitorDAO() {
        this.CargarFile();
    }

    public MonitorVO buscarXID(int id) {

        return (MonitorVO) this.BDMonitor.buscarXID(id);
    }

        

    
    public TablaSimple crearTabla(MarcaDAO LasMarcas){
    String titulos[]={"ID","MARCA","SERIE","TIPO","RESOLUCION"};
    int limite = Size();
        
        String datos[][]= new String[limite][titulos.length];
        Object canasta[]=BDMonitor.GetBD();
          for (int i = 0; i < BDMonitor.getContador(); i++) {
          MonitorVO Moni =(MonitorVO)canasta[i];
          datos[i][0]=""+ Moni.getID();
          MarcaVO estaES = LasMarcas.BuscarNombre(Integer.parseInt(Moni.getMarca()));
          datos[i][1]= estaES.getNombre();
          datos[i][2]= Moni.getSerie();
          datos[i][3]=Moni.getTipo();
          datos[i][4]=Moni.getresolucion();
          }
              
        TablaSimple tmp= new TablaSimple(titulos, datos);
        return tmp;
    }

    private void almacenar(String string, int parseInt, String string0,String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String listaMonitor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
