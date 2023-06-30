/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Rene", 39);
        Persona persona2 = new Persona("Santiago", 20);
         
        System.out.printf("%s\n", persona1.obtenerEdad());
        System.out.printf("%s\n", persona2.obtenerEdad());
         
        ArrayList<Persona> miLista = new ArrayList<>();
        miLista.add(persona1);
        miLista.add(persona2);
        double promedio = persona1.promedioEdades(miLista);
        System.out.printf("%.2f\n", promedio);
    }
    
}
