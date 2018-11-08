/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.acciones;

import punto.de.venta.gestionbd.ServiceClientes;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import punto.de.venta.pantallas.PanelClientes;

/**
 * Clase que captura las acciones que se realizan sobre los paneles
 * panelAltaClientes,panelEliminarClientes y panelListarClientes
 *
 * @author Jamal Hassini
 */
public class AccionesClientes extends ServiceClientes {

    private PanelClientes panel1;

    /**
     * Constructor de la clase AccionesClientes.
     *
     * @param panel1 PanelClientes el panel del que se pretende manejar eventos.
     */
    public AccionesClientes(PanelClientes panel1) {
        this.panel1 = panel1;
    }

    /**
     * Metodo que ajusta las filas y columnas de la tabla tblClientes en la
     * clase AccionesListarClientes
     */
    public void anchoCeldas() {

        TableColumnModel columnModel = panel1.getTblClientes().getColumnModel();

        JTableHeader cabecera = panel1.getTblClientes().getTableHeader();
        cabecera.setBackground(Color.LIGHT_GRAY);
        cabecera.setFont(new Font("Arial", Font.BOLD, 14));
        cabecera.setForeground(Color.BLACK);

        columnModel.getColumn(0).setPreferredWidth(35);
        columnModel.getColumn(1).setPreferredWidth(170);
        columnModel.getColumn(2).setPreferredWidth(5);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(200);

    }

    /**
     * Metodo que se encarga de guardar clientes en la bbdd con un JOptionPane
     * que pide confirmar el guardado del cliente y otro que confirma la accion
     * realizada
     */
    public void guardarCliente() {

        if ("".equals(panel1.getTxtNombre().getText())) {
            JOptionPane.showMessageDialog(panel1, "Por favor rellene los datos del cliente a añadir");
        } else {
            int opcion = JOptionPane.showConfirmDialog(panel1, "¿Agregar cliente?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {

                Connection conexion = getConnection();

                String Nombre = panel1.getTxtNombre().getText();
                String Edad = panel1.getTxtEdad().getText();
                String Telefono = panel1.getTxtTelefono().getText();
                String Correo_Electronico = panel1.getTxtCorreo().getText();

                try {

                    PreparedStatement ps = conexion.prepareStatement(SQLC1);

                    ps.setString(1, Nombre);
                    ps.setString(2, Edad);
                    ps.setString(3, Telefono);
                    ps.setString(4, Correo_Electronico);

                    ps.executeUpdate();

                    //Este bloque limpia los campos de texto en el PanelAltaClientes.                
                    panel1.getTxtNombre().setText("");
                    panel1.getTxtEdad().setText("");
                    panel1.getTxtTelefono().setText("");
                    panel1.getTxtCorreo().setText("");

                } catch (SQLException se) {
                } finally {

                    try {
                        if (conexion != null) {
                            conexion.close();
                        }

                    } catch (SQLException se) {
                    }
                }
                JOptionPane.showMessageDialog(panel1, "Cliente guardado correctamente");
            } else {
                JOptionPane.showMessageDialog(panel1, "No se ha guardado el cliente");
            }
        }
    }

    /**
     * Metodo que se encarga de eliminar clientes de la bbdd con un JOptionPane
     * que pide confirmar eliminar clientes y otro que confirma la accion
     * realizada
     */
    public void eliminarCliente() {

        if ("1".equals(panel1.getTxtIdCliente().getText())) {
            JOptionPane.showMessageDialog(panel1, "Este registro no se puede eliminar");
        } else {
            if ("".equals(panel1.getTxtNombre().getText())) {
                JOptionPane.showMessageDialog(panel1, "Por favor , seleccione un cliente");
            } else {
                int opcion = JOptionPane.showConfirmDialog(panel1, "¿Eliminar Cliente?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (opcion == 0) {

                    Connection conexion = getConnection();

                    String Nombre = panel1.getTxtNombre().getText();

                    try {

                        PreparedStatement ps = conexion.prepareStatement(SQLC3);

                        ps.setString(1, Nombre);

                        ps.executeUpdate();

                        //Este bloque limpia los campos de texto en el PanelBajaClientes. 
                        panel1.getTxtIdCliente().setText("");
                        panel1.getTxtNombre().setText("");
                        panel1.getTxtEdad().setText("");
                        panel1.getTxtTelefono().setText("");
                        panel1.getTxtCorreo().setText("");

                    } catch (SQLException se) {
                    } catch (Exception e) {
                    } finally {

                        try {
                            if (conexion != null) {
                                conexion.close();
                            }

                        } catch (SQLException se) {
                        }
                    }

                    JOptionPane.showMessageDialog(panel1, "Cliente eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(panel1, "No se ha eliminado el cliente");
                }
            }
        }
    }

    public void editaCliente() {

        if ("".equals(panel1.getTxtNombre().getText())) {
            JOptionPane.showMessageDialog(panel1, "Por favor seleccione cliente a modificar y realice cambios a efectuar  ");
        } else {

            int opcion = JOptionPane.showConfirmDialog(panel1, "¿Modificar cliente?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {
                Connection conexion = getConnection();
                int Id = Integer.parseInt(panel1.getTxtIdCliente().getText());
                String Nombre_Y_Apellidos = panel1.getTxtNombre().getText();
                String Edad = panel1.getTxtEdad().getText();
                String Telefono = panel1.getTxtTelefono().getText();
                String Correo_Electronico = panel1.getTxtCorreo().getText();

                try {

                    //Sentencia Preparada para actualizar los registros de la tabla en la BD.
                    PreparedStatement ps = conexion.prepareStatement(SQLModifica);

                    //paso de valores y su posicion en la tabla a la BD.
                    ps.setString(1, Nombre_Y_Apellidos);
                    ps.setString(2, Edad);
                    ps.setString(3, Telefono);
                    ps.setString(4, Correo_Electronico);
                    ps.setInt(5, Id);

                    //Ejecucion de la sentencia.
                    ps.executeUpdate();

                    /**
                     * Este bloque limpia los campos de texto en el
                     * PanelEditaClientes.
                     */
                    panel1.getTxtIdCliente().setText("");
                    panel1.getTxtNombre().setText("");
                    panel1.getTxtEdad().setText("");
                    panel1.getTxtTelefono().setText("");
                    panel1.getTxtCorreo().setText("");

                } catch (SQLException se) {
                } finally {
                    //Cierre de conexion 
                    try {
                        if (conexion != null) {
                            conexion.close();
                        }

                    } catch (SQLException se) {
                    }

                }
                JOptionPane.showMessageDialog(panel1, "Cliente modificado correctamente");
            } else {
                JOptionPane.showMessageDialog(panel1, "No se ha modificado el cliente");
            }

        }
    }

    /**
     * Metod que se encargga de listar clientes de la bbdd en la tabla
     * tblClientes
     */
    public void consultaClientes() {

        Connection conexion = getConnection();

        try {

            Statement stm = conexion.createStatement();

            ResultSet rs = stm.executeQuery(SQLC4);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumnas = rsmd.getColumnCount();

            DefaultTableModel modeloTabla = new DefaultTableModel();
            panel1.getTblClientes().setModel(modeloTabla);

            for (int j = 1; j <= numColumnas; j++) {

                modeloTabla.addColumn(rsmd.getColumnLabel(j));
            }

            while (rs.next()) {

                Object[] fila = new Object[numColumnas];
                for (int y = 0; y < numColumnas; y++) {
                    fila[y] = rs.getObject(y + 1);
                }
                modeloTabla.addRow(fila);
                anchoCeldas();

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

    public void cargarTextField() {

        DefaultTableModel modelo = (DefaultTableModel) panel1.getTblClientes().getModel();
        int row = panel1.getTblClientes().getSelectedRow();

        panel1.getTxtIdCliente().setText(modelo.getValueAt(row, 0).toString());
        panel1.getTxtNombre().setText(modelo.getValueAt(row, 1).toString());
        panel1.getTxtEdad().setText(modelo.getValueAt(row, 2).toString());
        panel1.getTxtTelefono().setText(modelo.getValueAt(row, 3).toString());
        panel1.getTxtCorreo().setText(modelo.getValueAt(row, 4).toString());
    }
}
