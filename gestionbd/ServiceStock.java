/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.gestionbd;

/**
 *
 * @author Usuario1
 */
public class ServiceStock extends GestionSql{
    
    public static final String StockEntrantes = "SELECT Descripcion,Cantidad FROM " + TABLEProductos + " WHERE categorias_Id = 1";
    public static final String StockHamburguesas = "SELECT Descripcion,Cantidad FROM " + TABLEProductos + " WHERE categorias_Id = 2";
    public static final String StockCafes = "SELECT Descripcion,Cantidad FROM " + TABLEProductos + " WHERE categorias_Id = 3";    
    public static final String StockBebidas = "SELECT Descripcion,Cantidad FROM " + TABLEProductos + " WHERE categorias_Id = 4";    
    public static final String StockPostres = "SELECT Descripcion,Cantidad FROM " + TABLEProductos + " WHERE categorias_Id = 5";    
    public static final String StockComplimentos = "SELECT Descripcion, Cantidad FROM " + TABLEProductos + " WHERE categorias_Id = 6";
    
    
}
