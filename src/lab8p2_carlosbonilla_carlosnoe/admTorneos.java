/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_carlosbonilla_carlosnoe;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author lospe
 */
public class admTorneos {
            public ArrayList<Torneo> torneos = new ArrayList();
    public File Archive = null;

    public admTorneos(ArrayList<Torneo> MODELITO, String path) {
        Archive = new File(path);
        torneos = MODELITO;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    public File getArchive() {
        return Archive;
    }

    public void setArchive(File Archive) {
        this.Archive = Archive;
    }

    public void cargarArchivo() {
        try {
            ArrayList<Torneo> temp = new ArrayList();
            if (Archive.exists()) {
                FileInputStream entrada
                        = new FileInputStream(Archive);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (ArrayList) objeto.readObject()) != null) {
                        torneos = temp;
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(Archive);
            bw = new ObjectOutputStream(fw);
            ArrayList<Torneo> t = torneos;
            bw.writeObject(t);
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
