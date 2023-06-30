/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author Usuario
 */
public class TransporteMaritimo {
     private String cooperativaMaritimo;
    private double tarifa;
    
    public void establecerCooperativaTaxi(String n){
        cooperativaMaritimo = n;
    }
    
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    public String obtenerCooperativaTaxi(){
        return cooperativaMaritimo;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
