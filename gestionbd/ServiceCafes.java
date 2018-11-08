/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.gestionbd;

/**
 * Clase con las sentencias que se ejecutan en el panelCafes.
 * 
 * Extiende de la clase GestionSql
 *
 * @author Jamal Hassini
 */
public class ServiceCafes extends GestionSql {

    public static final String SQLcafeCortado = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Cafe cortado'";

    public static final String SQLcafeSolo = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Cafe solo'";

    public static final String SQLCarajillos = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Carajillos'";

    public static final String SQLManzanilla = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Manzanilla'";

    public static final String SQLTe = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Te'";
    
    public static final String SQLCafeConLeche = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Cafe con leche'";   
    
    public static final String SQLBotonCafeSolo = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Cafe solo'";
    public static final String SQLBotonCafeCortado = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Cafe cortado'";
    public static final String SQLBotonTe = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Te'";
    public static final String SQLBotonManzanilla = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Manzanilla'";
    public static final String SQLBotonCarajillos = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Carajillos'"; 
    public static final String SQLBotonCafeConLeche = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Cafe con leche'"; 
    
    
}
