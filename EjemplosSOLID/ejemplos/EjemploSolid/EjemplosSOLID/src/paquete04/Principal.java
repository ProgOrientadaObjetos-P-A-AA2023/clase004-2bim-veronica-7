/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TranporteTransvia trans = new TranporteTransvia();
        trans.establecerCooperativaTransvia("Rutas Loja");
        trans.establecerTarifa();
         
                
        TiposTransporte tipos = new TiposTransporte();
        
        ArrayList<Transporte> listaTransportes = new ArrayList();
        listaTransportes.add(bus);
        listaTransportes.add(taxi);
        listaTransportes.add(trans);
        tipos.establecerTransportes(listaTransportes);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        
    }
}
