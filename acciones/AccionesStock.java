/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.acciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import static punto.de.venta.gestionbd.ServiceAjustesProductos.SQLTblCategorias;
import punto.de.venta.gestionbd.ServiceStock;
import punto.de.venta.pantallas.PanelStock;

/**
 *
 * @author Usuario1
 */
public class AccionesStock extends ServiceStock {

    private PanelStock panel;

    public AccionesStock(PanelStock panel) {
        this.panel = panel;
    }

    

    public void listarEntrantes() {

        Connection conexion = getConnection();

        ResultSet rs;

        try {
             DefaultTableModel dtm = new DefaultTableModel();
             
            dtm.addColumn("Descripcion");
            dtm.addColumn("Cantidad");

            PreparedStatement ps = conexion.prepareStatement(StockEntrantes);

            rs = ps.executeQuery();

            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            }

            panel.getTblEntrantes().setModel(dtm);

        } catch (SQLException se) {
        } finally {

            try {
                if (conexion != null) {
                    conexion.close();
                }

            } catch (SQLException se) {
            }
        }
    }

    public void listarBebidas() {

        Connection conexion = getConnection();

        ResultSet rs;

        try {
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Descripcion");
            dtm.addColumn("Cantidad");

            PreparedStatement ps = conexion.prepareStatement(StockBebidas);

            rs = ps.executeQuery();

            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            }

            panel.getTblBebidas().setModel(dtm);

        } catch (SQLException se) {
        } finally {

            try {
                if (conexion != null) {
                    conexion.close();
                }

            } catch (SQLException se) {
            }
        }
    }

    public void listarComplimentos() {

        Connection conexion = getConnection();

        ResultSet rs;

        try {
             DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Descripcion");
            dtm.addColumn("Cantidad");

            PreparedStatement ps = conexion.prepareStatement(StockComplimentos);

            rs = ps.executeQuery();

            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            }

            panel.getTblComplimentos().setModel(dtm);

        } catch (SQLException se) {
        } finally {

            try {
                if (conexion != null) {
                    conexion.close();
                }

            } catch (SQLException se) {
            }
        }

    }

    public void listarHamburguesas() {

        Connection conexion = getConnection();

        ResultSet rs;

        try {
             DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Descripcion");
            dtm.addColumn("Cantidad");

            PreparedStatement ps = conexion.prepareStatement(StockHamburguesas);

            rs = ps.executeQuery();

            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            }

            panel.getTblHamburguesas().setModel(dtm);

        } catch (SQLException se) {
        } finally {

            try {
                if (conexion != null) {
                    conexion.close();
                }

            } catch (SQLException se) {
            }
        }
    }

    public void listarCafes() {

        Connection conexion = getConnection();

        ResultSet rs;

        try {
             DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Descripcion");
            dtm.addColumn("Cantidad");

            PreparedStatement ps = conexion.prepareStatement(StockCafes);

            rs = ps.executeQuery();

            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            }

            panel.getTblCafes().setModel(dtm);

        } catch (SQLException se) {
        } finally {

            try {
                if (conexion != null) {
                    conexion.close();
                }

            } catch (SQLException se) {
            }
        }
    }

    public void listarPostres() {
        Connection conexion = getConnection();

        ResultSet rs;

        try {
             DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Descripcion");
            dtm.addColumn("Cantidad");

            PreparedStatement ps = conexion.prepareStatement(StockPostres);

            rs = ps.executeQuery();

            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            }

            panel.getTblPostres().setModel(dtm);

        } catch (SQLException se) {
        } finally {

            try {
                if (conexion != null) {
                    conexion.close();
                }

            } catch (SQLException se) {
            }
        }
    }
}
