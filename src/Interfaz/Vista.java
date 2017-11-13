/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Teclado.Teclado;
import DAO.MonitorDAO;
import DAO.MarcaDAO;
import DAO.cpuDAO;



/**
 *
 * @author Sergio
 */
public class Vista {

    public static void main(String[] args) {

        Teclado TE = new Teclado();
        MonitorDAO LosMoni = new MonitorDAO();
        
        

        int opcion = TE.capInt("ingrese opcion: \n 1 GESTIONAR MONITOR \n 2 GESTIONAR CPU \n 3 GESTIONAR IMPRESORA  \n 4 GESTIONAR PERSONA \n 5 SALIR");

        while (opcion != 6) {

            switch (opcion) {
                case 1:
                    int opcion1 = TE.capInt("ingrese opcion: \n 1 AGREGAR \n 2 LISTAR \n 3 CUANTOS \n 4 GUARDAR EN FILE \n 5 SALIR");
                    while (opcion1 != 6) {
                        switch (opcion1) {
                            case 1:

                                String tipo = TE.Captext("ingrese tipo");
                                int ID = TE.capInt("ingrese ID");
                                String Serie = TE.Captext("ingrese serie");
                                String marca = TE.Captext("ingrese marca");
                                String resolucion = TE.Captext("ingrese resolucion");
                        {
                         
                            if (LosMoni.almacenar(tipo, ID, Serie, marca,resolucion)) {
                                TE.Msn("monitor registrado");
                            } else {
                                TE.Msn("no hay disponibilidad");
                            }
                        }
                                break;
                            case 2:
                                TE.Msn(LosMoni.listaMonitor());
                                break;
                            case 3:
                                TE.Msn("numero de monitores registrados" + LosMoni.Size());
                                break;
                            case 4:
                                if (LosMoni.Guardar()) {
                                    TE.Msn("el archivo fue generado");
                                } else {
                                    TE.Msn("error al generar archivo");
                                }
                                break;
                            case 5:
                                break;
                            default:
                                TE.Msn("opcion no valida");
                                break;
                        }

                        opcion1 = TE.capInt("ingrese opcion: \n 1 AGREGAR \n 2 LISTAR \n 3 CUANTOS \n 4 GUARDAR EN FILE \n 5 SALIR");
                    }
                    break;

                case 2:
                    int opcion2 = TE.capInt("ingrese opcion: \n 1 AGREGAR \n 2 LISTAR \n 3 CUANTOS \n 4 GUARDAR EN FILE \n 5 SALIR");
                    while (opcion2 != 5) {
                        switch (opcion2) {
                            case 1:

                                String tipo = TE.Captext("ingrese tipo");
                                int ID = TE.capInt("ingrese ID");
                                String Serie = TE.Captext("ingrese serie");
                                String marca = TE.Captext("ingrese marca");
                                String resolucion = TE.Captext("ingrese resolucion");
                        {
                           
                            if (LosMoni.almacenar(tipo, ID, Serie, marca,resolucion)) {
                                TE.Msn("cpu registrada");
                            } else {
                                TE.Msn("no hay disponibilidad");
                            }
                        }
                                break;
                            case 2:
                                TE.Msn(LosMoni.listaMonitor());
                                break;
                            case 3:
                                TE.Msn("numero de cpu registradas" + LosMoni.Size());
                                break;
                            case 4:
                                if (LosMoni.Guardar()) {
                                    TE.Msn("el archivo fue generado");
                                } else {
                                    TE.Msn("error al generar archivo");
                                }
                                break;
                            case 5:
                                break;
                            default:
                                TE.Msn("opcion no valida");
                                break;
                        }

                        opcion2 = TE.capInt("ingrese opcion: \n 1 AGREGAR \n 2 LISTAR \n 3 CUANTOS \n 4 GUARDAR EN FILE \n 5 SALIR");
                    }
                    
                    break;
                case 3:
                    
                    int opcion3 = TE.capInt("ingrese opcion: \n 1 AGREGAR \n 2 LISTAR \n 3 CUANTOS \n 4 GUARDAR EN FILE \n 5 SALIR");
                    while (opcion3 != 5) {
                        switch (opcion3) {
                            case 1:

                                String tipo = TE.Captext("ingrese tipo");
                                int ID = TE.capInt("ingrese ID");
                                String Serie = TE.Captext("ingrese serie");
                                String marca = TE.Captext("ingrese marca");
                                String resolucion = TE.Captext("ingrese resolucion");
                        {
                           
                            if (LosMoni.almacenar(tipo, ID, Serie, marca,resolucion)) {
                                TE.Msn("Impresora registrada");
                            } else {
                                TE.Msn("no hay disponibilidad");
                            }
                        }
                                break;
                            case 2:
                                TE.Msn(LosMoni.listaMonitor());
                                break;
                            case 3:
                                TE.Msn("numero de impresoras registradas" + LosMoni.Size());
                                break;
                            case 4:
                                if (LosMoni.Guardar()) {
                                    TE.Msn("el archivo fue generado");
                                } else {
                                    TE.Msn("error al generar archivo");
                                }
                                break;
                            case 5:
                                break;
                            default:
                                TE.Msn("opcion no valida");
                                break;
                        }

                        opcion3 = TE.capInt("ingrese opcion: \n 1 AGREGAR \n 2 LISTAR \n 3 CUANTOS \n 4 GUARDAR EN FILE \n 5 SALIR");
                    }
                    
                    break;
                case 4:
int opcion4 = TE.capInt("ingrese opcion: \n 1 AGREGAR \n 2 LISTAR \n 3 CUANTOS \n 4 GUARDAR EN FILE \n 5 SALIR");
                    while (opcion4 != 5) {
                        switch (opcion4) {
                            case 1:

                                String tipo = TE.Captext("ingrese tipo");
                                int ID = TE.capInt("ingrese ID");
                                String Serie = TE.Captext("ingrese serie");
                                String marca = TE.Captext("ingrese marca");
                                String resolucion = TE.Captext("ingrese resolucion");
                        {
                            
                            if (LosMoni.almacenar(tipo, ID, Serie, marca,resolucion)) {
                                TE.Msn("persona registrada");
                            } else {
                                TE.Msn("no hay disponibilidad");
                            }
                        }
                                break;
                            case 2:
                                TE.Msn(LosMoni.listaMonitor());
                                break;
                            case 3:
                                TE.Msn("numero de personas registradas" + LosMoni.Size());
                                break;
                            case 4:
                                if (LosMoni.Guardar()) {
                                    TE.Msn("el archivo fue generado");
                                } else {
                                    TE.Msn("error al generar archivo");
                                }
                                break;
                            case 5:
                                break;
                            default:
                                TE.Msn("opcion no valida");
                                break;
                        }

                        opcion4 = TE.capInt("ingrese opcion: \n 1 AGREGAR \n 2 LISTAR \n 3 CUANTOS \n 4 GUARDAR EN FILE \n 5 SALIR");
                    }
                    
                    break;

                case 5:
                    break;

                default:
                    TE.Msn("opcion NO valida");
                    break;

            }
            opcion = TE.capInt("ingrese opcion: \n 1 GESTIONAR MONITOR \n 2 GESTIONAR CPU \n 3 GESTIONAR IMPRESORA  \n 4 GESTIONAR PERSONA \n 5 SALIR");

        }
    }

}
