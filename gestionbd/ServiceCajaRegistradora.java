/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.gestionbd;

/**
 * Clase con las sentencias que se ejecutan en la pantallaCajaRegistradora.
 *
 * Extiende de la clase GestionSql
 *
 * @author Jamal Hassini
 */
public class ServiceCajaRegistradora extends GestionSql {

    public static final String SQLventa = "INSERT INTO " + TABLEVentas
            + " (clientes_IdCliente, Fecha, Hora, Total) VALUES "
            + "((select IdCliente from " + TABLEClientes + " where "
            + "Nombre_Y_Apellidos = ?),?,?,?)";

    public static final String SQLidventas = "SELECT MAX(idVentas) FROM "
            + TABLEVentas + " As Compte";

    public static final String SQL11 = "INSERT INTO " + TABLEDetalle_ventas
            + " (ventas_idVentas, productos_IdProducto, cantidad, descuento, "
            + "subTotal) VALUES (?,(select IdProducto from " + TABLEProductos + " where "
            + "Descripcion=?),?,?,?)";

    public static final String SQLCmbClientes = "SELECT Nombre_Y_Apellidos from "
            + TABLEClientes + " ORDER BY Nombre_Y_Apellidos";

    public static final String SQLStock = "UPDATE " + TABLEProductos + 
            " SET cantidad = cantidad - ? WHERE Descripcion = ?";
    
    public static final String SQLBotonBebidas = "select Nombre, Imagenc from " + TABLECategorias + " WHERE Nombre like 'Bebidas'";
    
    public static final String SQLBotonEntrantes = "select Nombre, Imagenc from " + TABLECategorias + " WHERE Nombre like 'Entrantes'";
    
    public static final String SQLBotonHamburguesas = "select Nombre, Imagenc from " + TABLECategorias + " WHERE Nombre like 'Hamburguesas'";
    
    public static final String SQLBotonComplimentos = "select Nombre, Imagenc from " + TABLECategorias + " WHERE Nombre like 'Complimentos'";
    
    public static final String SQLBotonPostres = "select Nombre, Imagenc from " + TABLECategorias + " WHERE Nombre like 'Postres'";
    
    public static final String SQLBotonCafes = "select Nombre, Imagenc from " + TABLECategorias + " WHERE Nombre like 'Cafes'";

}
