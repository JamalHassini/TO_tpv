/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.gestionbd;

/**
 * Clase con las sentencias que se ejecutan en el panelPostres.
 *
 * Extiende de la clase GestionSql
 *
 * @author Jamal Hassini
 */
public class ServicePostres extends GestionSql {

    public static final String SQLpostreTartaChocolate = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Tarta de chocolate'";

    public static final String SQLpostreTartaArandanos = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Tarta de arandanos'";

    public static final String SQLpostreMacedonia = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Macedonia'";

    public static final String SQLpostreHeladoChocolate = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Helado de chocolate'";

    public static final String SQLpostreHeladoFresas = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Helado de fresas'";

    public static final String SQLpostreCremaCatalana = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Crema catalana'";

    public static final String SQLBotonTartaChocolate = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Tarta de chocolate'";
    public static final String SQLBotonTartaArandanos = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Tarta de arandanos'";
    public static final String SQLBotonMacedonia = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Macedonia'";
    public static final String SQLBotonHeladoChocolate = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Helado de chocolate'";
    public static final String SQLBotonHeladoFresas = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Helado de fresas'";
    public static final String SQLBotonCremaCatalana = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Crema catalana'";
}
