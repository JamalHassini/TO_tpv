/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.gestionbd;

/**
 * Clase con las sentencias que se ejecutan en el panelHamburguesas.
 *
 * Extiende de la clase GestionSql
 *
 * @author Jamal Hassini
 */
public class ServiceHamburguesas extends GestionSql {

    public static final String SQLburguerNormal = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Hamburguesa normal'";

    public static final String SQLburguerDoble = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Hamburguesa doble'";

    public static final String SQLburguerPollo = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Hamburguesa de pollo'";

    public static final String SQLburguerDoblePollo = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Hamburguesa doble pollo'";

    public static final String SQLburguerTernera = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Hamburguesa de ternera'";

    public static final String SQLburguerTernera200g = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Hamburguesa de ternera 200g'";
    
    public static final String SQLBotonHamburguesaNormal = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Hamburguesa normal'";
    public static final String SQLBotonHamburguesaDoble = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Hamburguesa doble'";
    public static final String SQLBotonHamburguesaPollo = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Hamburguesa de pollo'";
    public static final String SQLBotonHamburguesaDoblePollo = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Hamburguesa doble pollo'";
    public static final String SQLBotonHamburguesaTernera= "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Hamburguesa de ternera'"; 
    public static final String SQLBotonHamburguesaTernera200g = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Hamburguesa de ternera 200g'"; 
}
