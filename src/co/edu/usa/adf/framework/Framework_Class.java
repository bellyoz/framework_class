/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.adf.framework;



/**
 *
 * @author mario
 */
public class Framework_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("");
        Read leer = new Read();
        leer.readDescriptor("C:\\Users\\mario\\Documents\\NetBeansProjects\\Framework_Class\\src\\co\\edu\\usa\\adf\\framework\\descriptor.txt");
        //new Write("C:\\Users\\mario\\Documents\\NetBeansProjects\\Framework_Class\\src\\co\\edu\\usa\\adf\\framework\\archivo.txt");
        leer.readPersona("C:\\Users\\mario\\Documents\\NetBeansProjects\\Framework_Class\\src\\co\\edu\\usa\\adf\\framework\\archivo.txt");
    }
    
}
