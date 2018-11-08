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
public class ServiceAjustesProductos extends GestionSql {

    public static final String SQLproducto = "INSERT INTO " + TABLEProductos + " (Descripcion, categorias_Id, Precio, Cantidad, Imagen) VALUES (?,(select Id from categorias where Nombre = ?),?,?,?)";
    public static final String SQLActualizaproducto = ("UPDATE " + TABLEProductos + " SET Descripcion=?, categorias_Id = (SELECT Id from " + TABLECategorias + " where Nombre=?), Precio=?, Cantidad=?, Imagen =? where IdProducto=?");
    public static final String SQLModificaC = ("UPDATE " + TABLECategorias + " SET Nombre=?, Imagenc =? WHERE Id=?");
    public static final String SQLModificaC1 = ("UPDATE " + TABLECategorias + " SET Nombre=?, WHERE Id=?");
    public static final String SQLEliminarCategoria = "DELETE FROM " + TABLECategorias + " WHERE Id = ?";
    public static final String SQLEliminarProducto = "DELETE FROM " + TABLEProductos + " WHERE IdProducto = ?";
    public static final String SQLCStock = "SELECT IdProducto, categorias_Id, Descripcion, Precio, Cantidad FROM " + TABLEProductos;
    public static final String SQLCmbCategorias = "SELECT Nombre FROM " + TABLECategorias;
    public static final String SQLImgProductos = "SELECT Imagen FROM " + TABLEProductos + " WHERE IdProducto = ?";
    public static final String SQLTblCategorias = "SELECT * FROM " + TABLECategorias;
    public static final String SQLGuardaCategoria = "INSERT INTO " + TABLECategorias + " (Nombre, Imagenc) VALUES (?,?)";
    public static final String SQLGuardaFotoCategoria = "INSERT INTO " + TABLECategorias + " Imagen VALUE ?";

    public static final String SQLProductosEntrantes = "SELECT IdProducto, Descripcion, Precio, Cantidad,Imagen FROM productos\n"
            + "INNER JOIN categorias ON productos.categorias_Id = categorias.Id where Nombre like 'Entrantes'";
    
    public static final String SQLProductosHamburguesas = "SELECT IdProducto, Descripcion, Precio, Cantidad,Imagen FROM productos\n"
            + "INNER JOIN categorias ON productos.categorias_Id = categorias.Id where Nombre like 'Hamburguesas'";
    
    public static final String SQLProductosComplimentos = "SELECT IdProducto, Descripcion, Precio, Cantidad,Imagen FROM productos\n"
            + "INNER JOIN categorias ON productos.categorias_Id = categorias.Id where Nombre like 'Complimentos'";
    
    public static final String SQLProductosPostres = "SELECT IdProducto, Descripcion, Precio, Cantidad,Imagen FROM productos\n"
            + "INNER JOIN categorias ON productos.categorias_Id = categorias.Id where Nombre like 'Postres'";
    
    public static final String SQLProductosBebidas = "SELECT IdProducto, Descripcion, Precio, Cantidad,Imagen FROM productos\n"
            + "INNER JOIN categorias ON productos.categorias_Id = categorias.Id where Nombre like 'Bebidas'";
    
    public static final String SQLProductosCafes = "SELECT IdProducto, Descripcion, Precio, Cantidad,Imagen FROM productos\n"
            + "INNER JOIN categorias ON productos.categorias_Id = categorias.Id where Nombre like 'Cafes'";
}
