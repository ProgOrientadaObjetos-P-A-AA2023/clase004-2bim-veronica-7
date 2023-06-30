/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Ciudad c1 = new Ciudad("Zamora", "Zamora Chincipe");
        Ciudad c2 = new Ciudad("Quito", "Pichincha");
        Ciudad c3 = new Ciudad("Loja", "Loja");
        Ciudad c4 = new Ciudad("Cuenca", "Azuay");
        
        Persona p1 = new Persona("Maria Soledad Perez", 23, c1);
        Persona p2 = new Persona("Marco Arturo Picoita", 20, c2);
        Persona p3 = new Persona("Orlando Polibio Rojas", 4, c3);
        Persona p4 = new Persona("Bolivia Martha Gordillo", 50, c4);
        
        OperacionesEstudiantes op1 = new OperacionesEstudiantes();
        
        ArrayList<Persona> lista = new ArrayList();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
        System.out.println("Edades: ");
        System.out.printf("\t%s\n",p1.obtenerEdad());
        System.out.printf("\t%s\n",p2.obtenerEdad());
        System.out.printf("\t%s\n",p3.obtenerEdad());
        System.out.printf("\t%s\n",p4.obtenerEdad());
        System.out.println("");
        
        op1.establecerEstudiante(lista);
        op1.establecerPromedioEdades();
        op1.establecerEdadMinima();
        op1.establecerEdadMaxima();
        op1.establecerListaCiudades();
        
        System.out.println("Operaciones:");
        System.out.printf("\tPromedio edad: %.2f\n",op1.obtenerPromedioEdades());
        System.out.printf("\tEdad Minima: %d\n",op1.obtenerEdadMinima());
        System.out.printf("\tEdad Maxima: %d\n",op1.obtenerEdadMaxima());
        System.out.printf("\tListar Ciudades:\n%s\n",op1.obtenerListaCiudades());
        
    }
}
