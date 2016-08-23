/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.adf.framework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/**
 *
 * @author mario
 */
public class Write {

    public Write(String ruta) {
        try {

            File archivo = new File(ruta);
            BufferedWriter bw;
            Persona persona = new Persona();
            persona.setNombre("Mime");
            persona.setCedula(1020809399);
            persona.setSexo("mujer");
            persona.setEdad(18);
            String[] chart = Read.lista.get(1).split(" ");
            String[] chart2 = Read.lista.get(2).split(" ");
            String[] chart3 = Read.lista.get(3).split(" ");
             String[] chart4 = Read.lista.get(4).split(" ");
             System.out.println(""+chart4[2]);
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true)));
            bw.write(String.format("%1$-" + chart[2] + "s", persona.getNombre())+
                    String.format("%1$-" + chart2[2] + "s", persona.getCedula())+
                    String.format("%1$-" + chart3[2] + "s", persona.getSexo())+
                    String.format("%1$-" + chart4[2] + "s", persona.getEdad()) + "\n");

            //bw.write(persona.getNombre(), 0, Integer.parseInt(chart[2]));
            bw.close();
        } catch (Exception e) {
        }
    }

}
