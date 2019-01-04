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
public class ServiceUsuarios extends GestionSql {

    public static final String SQLGuardaUsuario = "INSERT INTO " + TABLEUsuarios + "(Nombre, Tipo_Usuario, Password) VALUES(?,?,?)";
    public static final String SQLCmbTipoUsuario = "SELECT Nombre FROM tipo_usuario";
    public static final String SQLAcceso = "SELECT Nombre, Tipo_Usuario, Password FROM " + TABLEUsuarios + " WHERE Nombre = ? && Password = ?";
    public static final String SQLListaUsuarios = "SELECT IdUsuario, Nombre, Tipo_Usuario, Password, Lastsession FROM " + TABLEUsuarios;
    public static final String SQLEliminarUsuario = "DELETE FROM " + TABLEUsuarios + " WHERE Nombre = ?";
    public static final String SQLModificaUsuario = "UPDATE " + TABLEUsuarios + " SET Nombre= ?, Tipo_Usuario= ?, Password= ? WHERE IdUsuario= ?";
}
