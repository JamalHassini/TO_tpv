/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.gestionbd;

/**
 * Clase con las sentencias que se ejecutan en el panelBebedas
 *
 * Extiende de la clase GestionSql
 *
 * @author Jamal Hassini
 */
public class ServiceBebidas extends GestionSql {

    public static final String SQLAgua= "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion LIKE 'Agua'";

    public static final String SQLZumos = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion LIKE 'Zumos'";

    public static final String SQLCervezas = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion LIKE 'Cervezas'";

    public static final String SQLCervezasSin = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion LIKE 'Cervezas sin'";

    public static final String SQLRefrescos = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion LIKE 'Refrescos'";

    public static final String SQLCubatas = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion LIKE 'Cubatas'";
    
    
    public static final String SQLBotonAgua = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Agua'";
    public static final String SQLBotonZumos = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Zumos'";
    public static final String SQLBotonCervezas = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Cervezas'";
    public static final String SQLBotonCervezasSin = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Cervezas sin'";
    public static final String SQLBotonRefrescos = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Refrescos'";    
    public static final String SQLBotonCubatas = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Cubatas'";
}
