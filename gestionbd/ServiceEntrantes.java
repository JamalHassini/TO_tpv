/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.gestionbd;

/**
 * Clase con las sentencias que se ejecutan en el panelEntrantes.
 *
 * Extiende de la clase GestionSql
 *
 * @author Jamal Hassini
 */
public class ServiceEntrantes extends GestionSql {

    public static final String SQLEnsalada = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Ensalada Mediterranea'";

    public static final String SQLCesar = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Ensalada cesar'";

    public static final String SQLNachos = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Nachos'";

    public static final String SQLMontadito = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Montaditos'";

    public static final String SQLEnsaladilla = "SELECT Descripcion,Precio FROM "
            + TABLEProductos + " WHERE Descripcion like 'Ensaladilla rusa'";
    
    public static final String SQLBotonEnsaladaCesar = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Ensalada cesar'";
    public static final String SQLBotonEnsaladaMediterranea = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Ensalada mediterranea'";
    public static final String SQLBotonEnsaladillaRusa = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Ensaladilla rusa'";
    public static final String SQLBotonMontaditos = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Montaditos'";
    public static final String SQLBotonNachos = "select Descripcion, Imagen from " + TABLEProductos + " WHERE Descripcion like 'Nachos'"; 

}
