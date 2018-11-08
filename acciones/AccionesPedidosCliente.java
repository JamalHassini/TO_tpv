/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.acciones;

import punto.de.venta.gestionbd.ServicePedidosClientes;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import punto.de.venta.pantallas.PantallaPedidosCliente;

/**
 * Clase que configura componentes de la pantallaPedidosCliente y captura las acciones que se
 * realizan sobre ella.
 *
 * @author Jamal Hassini
 */
public class AccionesPedidosCliente extends ServicePedidosClientes {

    private PantallaPedidosCliente panel;
    double sumatoria;
    double sumatoria1 = 0;

    /**
     * Constructor de la clase accionesPedidosClientes.
     *
     * @param panel PantallaPedidosCliente el panel del que se pretende manejar eventos.
     */
    public AccionesPedidosCliente(PantallaPedidosCliente panel) {
        this.panel = panel;
    }
    
    /**
     * Metodo que ajusta el encabezado y las celdas de la tabla tblPedidosCliente
     */
    public void ajustarCeldas() {

        TableColumnModel columnModel = panel.getTblPedidosClientes().getColumnModel();
        JTableHeader cabecera = panel.getTblPedidosClientes().getTableHeader();
        cabecera.setBackground(Color.LIGHT_GRAY);
        cabecera.setFont(new Font("Arial", Font.BOLD, 14));
        cabecera.setForeground(Color.BLACK);

        columnModel.getColumn(0).setPreferredWidth(200);
        columnModel.getColumn(1).setPreferredWidth(10);
        columnModel.getColumn(2).setPreferredWidth(60);
        columnModel.getColumn(3).setPreferredWidth(80);
        columnModel.getColumn(4).setPreferredWidth(40);
    }
    
    /**
     * Metodo que carga los clientes en el JCombobos cmbClientes1 
     */
    public void devuelveClientes() {

        Connection conexion = getConnection();

        try {
            PreparedStatement ps = conexion.prepareStatement(SQLCmbClientes1);
            ResultSet rs;

            rs = ps.executeQuery();
            while (rs.next()) {
                String clientes1 = rs.getString("Nombre_Y_Apellidos");
                panel.getCmbClientes1().addItem(clientes1);
            }

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
    
    /**
     * Metodo que devuelve los pedidos por cliente en la tabla tblPedidosClientes
     */
    public void consultaPedidos() {

        Connection conexion = getConnection();

        String Nombre = (String) panel.getCmbClientes1().getSelectedItem();
        try {

            PreparedStatement ps = conexion.prepareStatement(SQLpedidos);

            ResultSet rs;
            ps.setString(1, Nombre);

            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumnas = rsmd.getColumnCount();

            DefaultTableModel modeloTabla = new DefaultTableModel();
            panel.getTblPedidosClientes().setModel(modeloTabla);

            for (int j = 1; j <= numColumnas; j++) {

                modeloTabla.addColumn(rsmd.getColumnLabel(j));
            }

            while (rs.next()) {

                Object[] fila = new Object[numColumnas];
                for (int y = 0; y < numColumnas; y++) {
                    fila[y] = rs.getObject(y + 1);
                }

                modeloTabla.addRow(fila);

            }
            ajustarCeldas();
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
    
    /**
     * Metodo que suma los valores de la columna total de tblPedidosClientes y lo muestra en el JTextField txtTotalPedidos
     */
    public void sumaPedidosCliente() {

        double sum = 0;

        for (int i = 0; i < panel.getTblPedidosClientes().getRowCount(); i++) {

            sum = sum + Double.parseDouble(panel.getTblPedidosClientes().getValueAt(i, 4).toString());
        }

        panel.getTxtTotalPedidos().setText(String.valueOf((float) sum) + " €");
    }
}
