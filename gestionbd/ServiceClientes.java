/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.gestionbd;

/**
 * Clase con las sentencias que se ejecutan en los paneles panelAltaClientes,
 * panelEliminarClientes y PanelListarClientes.
 *
 * Extiende de la clase GestionSql
 *
 * @author Jamal Hassini
 */
public class ServiceClientes extends GestionSql {

    public static final String SQLC1 = "INSERT INTO " + TABLEClientes
            + " (Nombre_Y_Apellidos, Edad, Telefono, Correo_Electronico) "
            + "VALUES (?,?,?,?)";

    //public static final String SQLC2 = "SELECT * FROM " + TABLEClientes
           // + " WHERE Nombre_Y_Apellidos=?";

    public static final String SQLC3 = "DELETE FROM " + TABLEClientes
            + " WHERE Nombre_Y_Apellidos=?";

    public static final String SQLC4 = "SELECT * FROM " + TABLEClientes;

    public static final String SQLModifica = ("UPDATE " + TABLEClientes + 
            " SET Nombre_Y_Apellidos=?, Edad=?, Telefono=?,"
            + " Correo_Electronico=? WHERE IdCliente=?");

}
