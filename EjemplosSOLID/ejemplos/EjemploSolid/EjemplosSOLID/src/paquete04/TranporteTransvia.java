/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author Usuario
 */
public class TranporteTransvia extends Transporte{
    private String cooperativaTranvia;
    
    
    public void establecerCooperativaTransvia(String n){
        cooperativaTranvia = n;
    }
    
    @Override
    public void establecerTarifa(){
        tarifa = 20.00 + 10.00;
    }
    
    public String obtenerCooperativaTranvia(){
        return cooperativaTranvia;
    }
}
