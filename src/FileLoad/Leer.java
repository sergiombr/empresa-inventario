

package FileLoad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author servermini
 */
public class Leer {
    public BufferedReader cargaBU(String FileName) {
        File Archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Archivo = new File(FileName + ".CSV");
        try {
            fr = new FileReader(Archivo);
            br = new BufferedReader(fr);
            return br;
        } catch (FileNotFoundException ex) {
            return null;
        }
    }
}