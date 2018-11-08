/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.gestionbd;

/**
 * Clase con las sentencias que se ejecutan en el panelComplimentos.
 *
 * Extiende de la clase GestionSql
 *
 * @author Jamal Hassini
 */
public class ServiceComplimentos extends GestionSql {

   
    
    public static final String SQLProductos = "SELECT Descripcion,Precio FROM "
            + TABLEProductos;
    
    public static final String SQLFritas = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Patatas fritas'";

    /**
     *
     */
    public static String SQLAsadas = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Patatas asadas'";

    public static final String SQLAros = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Aros de cebolla'";

    
    public static String SQLBotonPatatasAsadas = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Patatas asadas'";
    public static final String SQLBotonPatatasFritas = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Patatas fritas'";
    public static final String SQLBotonArosDeCebolla = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Aros de cebolla'";
}
