/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.acciones;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import punto.de.venta.gestionbd.ServiceUsuarios;
import punto.de.venta.pantallas.PanelAcceso;
import punto.de.venta.pantallas.PanelAjustesUsuarios;
import punto.de.venta.pantallas.PanelClientes;
import punto.de.venta.pantallas.PanelListaUsuarios;
import punto.de.venta.pantallas.PantallaCajaRegistradora;
import punto.de.venta.principal.PuntoDeVentaFrame;

/**
 *
 * @author Jamal Hassini
 */
public class AccionesUsuarios extends ServiceUsuarios {

    private PanelAjustesUsuarios panel;
    private PanelAcceso panel1;
    private PanelClientes panel2;
    private PantallaCajaRegistradora panel3;
    private PanelListaUsuarios panel4;

    public AccionesUsuarios(PanelAjustesUsuarios panel) {
        this.panel = panel;
    }

    public AccionesUsuarios(PanelAcceso panel1) {
        this.panel1 = panel1;
    }

    public AccionesUsuarios(PanelClientes panel2) {
        this.panel2 = panel2;
    }

    public AccionesUsuarios(PantallaCajaRegistradora panel3) {
        this.panel3 = panel3;
    }

    public AccionesUsuarios(PanelListaUsuarios panel4) {
        this.panel4 = panel4;
    }
    

    public void ajustartblusuarios() {

        TableColumnModel columnModel = panel4.getTblListaUsuarios().getColumnModel();
        JTableHeader cabecera = panel4.getTblListaUsuarios().getTableHeader();
        cabecera.setBackground(Color.pink);
        cabecera.setFont(new Font("Arial", Font.BOLD, 14));
        cabecera.setForeground(Color.BLACK);

        columnModel.getColumn(0).setPreferredWidth(10);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(35);
        columnModel.getColumn(3).setPreferredWidth(45);
        columnModel.getColumn(4).setPreferredWidth(80);
    }

    public void acceder() {

        String tipousuario = "";
        String operario = "";

        if ("".equals(panel1.getTxtUsuario().getText()) || "".equals(Arrays.toString(panel1.getTxtPass().getPassword()))) {

            JOptionPane.showMessageDialog(null, "NO hay datos introducidos");

        } else {
            Connection conexion = getConnection();

            String usu = panel1.getTxtUsuario().getText();
            String pas = panel1.getTxtPass().getText();

            try {

                PreparedStatement ps = conexion.prepareStatement(SQLAcceso);

                ResultSet rs;
                ps.setString(1, usu);
                ps.setString(2, pas);
                rs = ps.executeQuery();

                while (rs.next()) {

                    operario = rs.getString("Nombre");
                    tipousuario = rs.getString("Tipo_Usuario");
                }

                switch (tipousuario) {
                    case "Root": {
                        PuntoDeVentaFrame frame = new PuntoDeVentaFrame();
                        frame.setSize(1000, 700);
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);
                        PantallaCajaRegistradora.getLblOperario().setText(operario);
                        break;
                    }
                    case "Admin": {
                        PuntoDeVentaFrame frame = new PuntoDeVentaFrame();
                        frame.setSize(1000, 700);
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);
                        frame.getMntmConfBotones().setVisible(false);
                        PantallaCajaRegistradora.getLblOperario().setText(operario);
                        break;
                    }
                    case "Operario": {
                        PuntoDeVentaFrame frame = new PuntoDeVentaFrame();
                        frame.setSize(1000, 700);
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);
                        frame.getMnuUsuarios().setVisible(false);
                        frame.getMnuProductos().setVisible(false);
                        PantallaCajaRegistradora.getLblOperario().setText(operario);
                        break;
                    }
                    default:
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos!!!");
                        break;

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

    }

   
    
    public void cargaComboTipoUsuario() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLCmbTipoUsuario);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String combousuario = rs.getString("Nombre");
                panel.getCmbTipoUsuario().addItem(combousuario);
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

    public void guardaUsuario() {

        if ("".equals(panel.getTxtNombre().getText()) || "".equals(panel.getTxtConfPass().getText()) || "".equals(panel.getTxtPass().getText())) {

            JOptionPane.showMessageDialog(panel, "Uno o varios campos de texto están vacios!!!");

        } else if (!Arrays.toString(panel.getTxtConfPass().getPassword()).equals(Arrays.toString(panel.getTxtPass().getPassword()))) {

            JOptionPane.showMessageDialog(panel, "la contraseña no coincide");

        } else {

            int opcion = JOptionPane.showConfirmDialog(panel, "¿Agregar Usuario?", "Confirmar", JOptionPane.YES_NO_OPTION);

            if (opcion == 0) {

                Connection conexion = getConnection();

                String Nombre = panel.getTxtNombre().getText();
                String Usuario = panel.getCmbTipoUsuario().getSelectedItem().toString();
                String Pass = panel.getTxtPass().getText();
//                String lstsessionf = panel3.getTxtFecha().getText();
//                String lstsessionh = panel3.getTxtHora().getText();
//                String lastsession = lstsessionf+lstsessionh;

                try {

                    PreparedStatement ps = conexion.prepareStatement(SQLGuardaUsuario);

                    ps.setString(1, Nombre);
                    ps.setString(2, Usuario);
                    ps.setString(3, Pass);
                    //ps.setString(4, lastsession);

                    ps.executeUpdate();

                    panel.getTxtNombre().setText("");
                    panel.getTxtPass().setText("");
                    panel.getTxtConfPass().setText("");

                } catch (SQLException se) {
                } finally {

                    try {
                        if (conexion != null) {
                            conexion.close();
                        }

                    } catch (SQLException se) {
                    }
                }
                JOptionPane.showMessageDialog(panel, "Usuario guardado correctamente");
            } else {
                JOptionPane.showMessageDialog(panel, "No se ha guardado el usuario");
            }
        }

    }

    public void consultaUsuarios() {

        Connection conexion = getConnection();

        DefaultTableModel dtm = new DefaultTableModel();
        ResultSet rs;

        try {

            dtm.addColumn("Id");
            dtm.addColumn("Nombre");
            dtm.addColumn("Tipo");
            dtm.addColumn("Password");
            dtm.addColumn("Lastsession");

            PreparedStatement ps = conexion.prepareStatement(SQLListaUsuarios);

            rs = ps.executeQuery();

            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }

            panel4.getTblListaUsuarios().setModel(dtm);

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

    public void eliminarUsuario() {

        int row = panel4.getTblListaUsuarios().getSelectedRow();
        if (row >= 0) {

            int opcion = JOptionPane.showConfirmDialog(panel4, "¿Eliminar Usuario?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {
                Connection conexion = getConnection();

                DefaultTableModel modelo = (DefaultTableModel) panel4.getTblListaUsuarios().getModel();

                String nombre = modelo.getValueAt(row, 0).toString();
                try {
                    PreparedStatement ps = conexion.prepareStatement(SQLEliminarUsuario);
                    ps.setString(1, nombre);
                    ps.executeUpdate();

                } catch (SQLException e) {

                } finally {

                    try {
                        if (conexion != null) {
                            conexion.close();
                        }

                    } catch (SQLException se) {
                    }
                }

                JOptionPane.showMessageDialog(panel, "Usuario eliminado");

                modelo.removeRow(row);

            } else {
                JOptionPane.showMessageDialog(panel, "No se ha eliminado el usuario");
            }
        } else {
            JOptionPane.showMessageDialog(panel, "Por favor seleccione un usuario");
        }
    }

    public void modificarUsuario() {

        int opcion = JOptionPane.showConfirmDialog(panel, "¿Modificar usuario?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {

            Connection conexion = getConnection();

            DefaultTableModel mode = (DefaultTableModel) panel4.getTblListaUsuarios().getModel();
            int row = panel4.getTblListaUsuarios().getSelectedRow();

            String Id = mode.getValueAt(row, 0).toString();
            String nombre = mode.getValueAt(row, 1).toString();
            String tipousuario = mode.getValueAt(row, 2).toString();
            String pass = mode.getValueAt(row, 3).toString();

            try {

                PreparedStatement ps = conexion.prepareStatement(SQLModificaUsuario);

                ps.setString(1, nombre);
                ps.setString(2, tipousuario);
                ps.setString(3, pass);
                ps.setString(4, Id);

                ps.executeUpdate();

            } catch (SQLException se) {
            } finally {

                try {
                    if (conexion != null) {
                        conexion.close();
                    }

                } catch (SQLException se) {
                }
            }
            JOptionPane.showMessageDialog(panel, "Usuario modificado correctamente");

        } else {
            JOptionPane.showMessageDialog(panel, "No se ha modificado el usuario");
        }
    }

}
