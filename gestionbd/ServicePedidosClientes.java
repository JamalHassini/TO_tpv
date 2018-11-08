/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.gestionbd;

/**
 * Clase con las sentencias que se ejecutan en la pantallaPedidosClientes.
 *
 * Extiende de la clase GestionSql
 *
 * @author Jamal Hassini
 */
public class ServicePedidosClientes extends GestionSql {

    public static final String SQLpedidos = "SELECT Nombre_Y_Apellidos,idVentas,"
            + "Fecha,Hora,Total FROM "
            + TABLEVentas + " INNER JOIN " + TABLEClientes
            + " ON ventas.clientes_IdCliente = clientes.IdCliente where "
            + "Nombre_Y_Apellidos=?";

    public static final String SQLCmbClientes1 = "SELECT Nombre_Y_Apellidos FROM "
            + TABLEClientes + " ORDER BY Nombre_Y_Apellidos";
}
