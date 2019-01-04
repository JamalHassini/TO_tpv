/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.principal;

import punto.de.venta.pantallas.PanelAcceso;

/**
 * Clase lanzadora de la aplicación.
 *
 * @author Jamal Hassini
 */
public class LanzadorAplicacion {

    /**
     * Método lanzador.
     *
     * @param args String[] parámetros main.
     */
    public static void main(String[] args) {
        
//        PuntoDeVentaFrame frame = new PuntoDeVentaFrame();
//
//        frame.setSize(1000, 700);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);


        PanelAcceso frame= new PanelAcceso();
        
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
