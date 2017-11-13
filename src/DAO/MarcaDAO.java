/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.Bodega;
import VO.MarcaVO;


/**
 *
 * @author Sergio
 */
public class MarcaDAO {

    private Bodega BDMarca = new Bodega();

    public Object[] getBDMarca() {
        return this.BDMarca.GetBD();
    }

    public MarcaDAO() {

        MarcaVO tmp0 = new MarcaVO(0, "Seleccione");
        BDMarca.agregar(tmp0);
        MarcaVO tmp1 = new MarcaVO(4, "Sony");
        BDMarca.agregar(tmp1);
        MarcaVO tmp2 = new MarcaVO(13, " HP");
        BDMarca.agregar(tmp2);
        MarcaVO tmp3 = new MarcaVO(44, "LG");
        BDMarca.agregar(tmp3);

    }
    
 

    public int getSize() {
        return BDMarca.getContador();
    }

    public MarcaVO BuscarNombre(int id) {
        Object tmp[] = getBDMarca();
        for (int i = 0; i < BDMarca.getContador(); i++) {
            MarcaVO Marca = (MarcaVO) tmp[i];
            if (Marca.getID() == id) {
                return Marca;
            }

        }

        return null;

    }
}
