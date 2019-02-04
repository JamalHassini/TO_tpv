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

    public static final String SQLGuardaUsuario = "INSERT INTO " + TABLEUsuarios + "(Nombre, IdTipo, Password) VALUES(?,?,?)";
    public static final String SQLCmbTipoUsuario = "SELECT NomTipo FROM tipo_usuario";
    public static final String SQLAcceso = "SELECT IdTipo, Nombre, Password FROM usuarios WHERE Nombre = ? && Password = ?"; 
            //"WHERE IdTipo = SELECT NomTipo FROM tipo_usuario where IdTipo = ?";
           // " INNER JOIN " +TableTipo + " ON usuarios.IdTipo = tipo_usuario.IdTipo WHERE NomTipo = ? ";
    public static final String SQLListaUsuarios = "SELECT IdUsuario, Nombre, IdTipo, Password, Lastsession FROM " + TABLEUsuarios;
    public static final String SQLEliminarUsuario = "DELETE FROM " + TABLEUsuarios + " WHERE Nombre = ?";
    public static final String SQLModificaUsuario = "UPDATE " + TABLEUsuarios + " SET Nombre= ?, IdTipo= ?, Password= ?, Lastsession = ?  WHERE IdUsuario= ?";
}
