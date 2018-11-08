/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.gestionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que establece la conexion con la bbdd
 *
 * @author Jamal Hassini
 */
public class GestionSql {

    public static final String DATABASE = "tpv";
    public static final String TABLEProductos = "productos";
    public static final String TABLEVentas = "ventas";
    public static final String TABLEClientes = "clientes";
    public static final String TABLEDetalle_ventas = "detalle_ventas";
    public static final String TABLECategorias = "categorias"; 
    public static final String TABLEUsuarios = "usuarios";
    public static final String URL = "jdbc:mysql://localhost:3306/" + DATABASE;
    public static final String USERNAME = "seas";
    public static final String PASSWORD = "seas2018";

    public Connection conexion = null;

    /**
     * Metodo que devuelve la conexion a la bbdd
     *
     * @return java.sql.Connection conexion
     */
    public Connection getConnection() {

        try {

            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException se) {
        }

        return conexion;
    }
}
