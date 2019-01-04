/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.gestionbd;

/**
 * Clase con las sentencias que se ejecutan en la pantallaVentasDia.
 *
 * Extiende de la clase GestionSql
 *
 * @author Jamal Hassini
 */
public class ServiceVentasDia extends GestionSql {

    public static final String SQLVentas = ("SELECT Fecha,Hora,"
            + "Nombre_Y_Apellidos,idVentas,Total FROM " + TABLEVentas 
            + " INNER JOIN " + TABLEClientes + " ON ventas.clientes_IdCliente "
            + "= clientes.IdCliente WHERE fecha >= ? AND fecha  <= ? ORDER BY fecha");

}
