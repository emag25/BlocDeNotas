package mernotes;

import java.io.*;

public class MERfile {

    BufferedWriter bw;
    BufferedReader br;
    private String contenido;
    
    public String Abrir(String nfile) {
        File f = new File(nfile);
        try {
            br = new BufferedReader(new FileReader(f));
            String linea;
            contenido = "";
            while ((linea = br.readLine()) != null) {
                contenido = contenido + linea + "\r\n";
            }
        } catch (IOException e) {;
        }
        return contenido;
    }
    
    public void GuardarComo(String nfile, String texto) {
        try {
            try (RandomAccessFile random = new RandomAccessFile(new File(nfile), "rw")) {
                random.seek(0);
                random.writeBytes(texto);
            }
        } catch (IOException e) {
        }
    }
    
    public void Guardar(File f, String texto) {
        try {
            bw = new BufferedWriter(new FileWriter(f));
            bw.write(texto);
        } catch (IOException e) {
        }
    }

}
