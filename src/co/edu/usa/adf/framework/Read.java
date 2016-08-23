/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.adf.framework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Read {

    public static ArrayList<String> lista = new ArrayList<>();
    public static ArrayList<Persona> per = new ArrayList<>();

    public Read() {

    }

    public void readPersona(String ruta) {
        try {
            
            String cadena;
            FileReader f = new FileReader(ruta);
            BufferedReader b = new BufferedReader(f);
            String[] chart = Read.lista.get(1).split(" ");
            String[] chart2 = Read.lista.get(2).split(" ");
            String[] chart3 = Read.lista.get(3).split(" ");
            String[] chart4 = Read.lista.get(4).split(" ");
            Persona persona = new Persona();
           
            Class<?> cls = Class.forName(Read.lista.get(0));
            Object clase = cls.newInstance();
            Method x = cls.getMethod("set"+chart[1], String.class);
            
            while ((cadena = b.readLine()) != null) {
                System.out.println(cadena.substring(0, Integer.parseInt(chart[2])));
            }
            b.close();
        } catch (Exception e) {
        }
    }

    public void readDescriptor(String ruta) {
        try {
            String cadena;
            FileReader f = new FileReader(ruta);
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                lista.add(cadena);
            }
            b.close();
        } catch (Exception e) {
        }
    }
}
