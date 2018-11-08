/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.acciones;

import punto.de.venta.gestionbd.ServiceVentasDia;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import punto.de.venta.pantallas.PantallaVentasDia;

/**
 * Clase que configura componentes de la pantallaVentasDia y captura las acciones que se
 * realizan sobre ella.
 *
 * @author Jamal Hassini
 */
public class AccionesVentasDia extends ServiceVentasDia {

    private PantallaVentasDia panel;
    double sumatoria;
    double sumatoria1 = 0;

    /**
     * Constructor de la clase AccionesVentasDia.
     *
     * @param panel PantallaVentasDia el panel del que se pretende manejar eventos.
     */
    public AccionesVentasDia(PantallaVentasDia panel) {
        this.panel = panel;
    }
    
    
     /**
     * Metodo que ajusta el encabezado y las celdas de la tabla tblVentasDia
     */
     
    public void ajustarCeldas() {

        TableColumnModel columnModel = panel.getTblVentasDia().getColumnModel();
        JTableHeader cabecera = panel.getTblVentasDia().getTableHeader();
        cabecera.setBackground(Color.LIGHT_GRAY);
        cabecera.setFont(new Font("Arial", Font.BOLD, 14));
        cabecera.setForeground(Color.BLACK);

        columnModel.getColumn(0).setPreferredWidth(60);
        columnModel.getColumn(1).setPreferredWidth(30);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(10);
        columnModel.getColumn(4).setPreferredWidth(20);
    }

    /**
     * Método que devuelve las ventas por dia en la tabla tblVentasDia
     */
    public void consultaVentas() {

        DefaultTableModel modelo = new DefaultTableModel();
        panel.getTblVentasDia().setModel(modelo);

        Connection conexion = getConnection();

        String desde = ((JTextField) panel.getDtChooser1().getDateEditor().getUiComponent()).getText();
        String hasta = ((JTextField) panel.getDtChooserf().getDateEditor().getUiComponent()).getText();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLVentas);

            ResultSet rs;
            ps.setString(1, desde);
            ps.setString(2, hasta);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumnas = rsmd.getColumnCount();

            for (int j = 1; j <= numColumnas; j++) {

                modelo.addColumn(rsmd.getColumnLabel(j));
            }

            while (rs.next()) {

                Object[] fila = new Object[numColumnas];
                for (int y = 0; y < numColumnas; y++) {
                    fila[y] = rs.getObject(y + 1);
                }

                modelo.addRow(fila);

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
     * Metodo que suma los valores de la columna total de tblVentasDia y lo muestra en el txtTotalVentas
     */
    public void sumaVentas() {

        double sum = 0;

        for (int i = 0; i < panel.getTblVentasDia().getRowCount(); i++) {

            sum = sum + Double.parseDouble(panel.getTblVentasDia().getValueAt(i, 4).toString());
        }

        panel.getTxtTotalVentas().setText(String.valueOf((float) sum) + " €");
    }
}
