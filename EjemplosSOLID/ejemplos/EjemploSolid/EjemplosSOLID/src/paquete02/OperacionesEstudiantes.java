/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma += e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public double obtenerPromedioEdades(){
        return promedioEdades;
    }
    
    public void establecerEdadMinima(){
        int aux = obtenerEstudiante().get(0).obtenerEdad();
        for(int i=0;i<obtenerEstudiante().size();i++){
            if (aux>obtenerEstudiante().get(i).obtenerEdad())
                aux = obtenerEstudiante().get(i).obtenerEdad();
        }
        edadminima = aux;
    }
    
    public int obtenerEdadMinima(){
        return edadminima;
    }
    
    public void establecerEdadMaxima(){
        int aux = obtenerEstudiante().get(0).obtenerEdad();
        for(int i=0;i<obtenerEstudiante().size();i++){
            if (aux<obtenerEstudiante().get(i).obtenerEdad())
                aux = obtenerEstudiante().get(i).obtenerEdad();
        }
        edadmaxima = aux;
    }
    
    public int obtenerEdadMaxima(){
        return edadmaxima;
    }
    
    public void establecerListaCiudades(){
        listaCiudadesEstudiantes = "";
        for(int i=0;i<obtenerEstudiante().size();i++){
            listaCiudadesEstudiantes = String.format("%s[%d] %s  - %s\n", 
                    listaCiudadesEstudiantes,i+1,
                    obtenerEstudiante().get(i).obtenerNombre(),
                     obtenerEstudiante().get(i).obtenerCiudad().obtenerNombre());
        }
    }
    
    public String obtenerListaCiudades(){
        return listaCiudadesEstudiantes;
    }
}
