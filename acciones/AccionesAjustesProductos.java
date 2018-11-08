/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.acciones;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import punto.de.venta.gestionbd.ServiceAjustesProductos;
import static punto.de.venta.gestionbd.ServiceAjustesProductos.SQLCmbCategorias;
import static punto.de.venta.gestionbd.ServiceAjustesProductos.SQLProductosBebidas;
import static punto.de.venta.gestionbd.ServiceAjustesProductos.SQLProductosCafes;
import static punto.de.venta.gestionbd.ServiceAjustesProductos.SQLProductosComplimentos;
import static punto.de.venta.gestionbd.ServiceAjustesProductos.SQLProductosEntrantes;
import static punto.de.venta.gestionbd.ServiceAjustesProductos.SQLProductosHamburguesas;
import static punto.de.venta.gestionbd.ServiceAjustesProductos.SQLProductosPostres;
import static punto.de.venta.gestionbd.ServiceAjustesProductos.SQLTblCategorias;
import punto.de.venta.pantallas.PanelAjustesProductos;
import static punto.de.venta.pantallas.PanelAjustesProductos.tblCategorias;
import static punto.de.venta.pantallas.PanelAjustesProductos.tblProductos;
import punto.de.venta.pantallas.PanelModificaCategoria;
import punto.de.venta.pantallas.PanelModificaProducto;
import punto.de.venta.pantallas.PanelNuevaCategoria;
import punto.de.venta.pantallas.PanelNuevoProducto;

/**
 *
 * @author Jamal Hassini
 */
public class AccionesAjustesProductos extends ServiceAjustesProductos {

    private PanelAjustesProductos panel;
    private PanelNuevaCategoria panel2;
    private PanelNuevoProducto panel3;
    private PanelModificaProducto panel4;
    private PanelModificaCategoria panel5;
    int longitudBytes;
    FileInputStream fis;

    DefaultTableModel dtm = new DefaultTableModel();

    public AccionesAjustesProductos(PanelAjustesProductos panel) {
        this.panel = panel;
    }

    public AccionesAjustesProductos(PanelNuevaCategoria panel2) {
        this.panel2 = panel2;
    }

    public AccionesAjustesProductos(PanelNuevoProducto panel3) {
        this.panel3 = panel3;
    }

    public AccionesAjustesProductos(PanelModificaProducto panel4) {
        this.panel4 = panel4;
    }

    public AccionesAjustesProductos(PanelModificaCategoria panel5) {
        this.panel5 = panel5;
    }

    public void anchoCeldasC() {

        TableColumnModel columnModel = panel.getTblCategorias().getColumnModel();

        JTableHeader cabecera = panel.getTblCategorias().getTableHeader();
        cabecera.setBackground(Color.LIGHT_GRAY);
        cabecera.setFont(new Font("Arial", Font.BOLD, 14));
        cabecera.setForeground(Color.BLACK);

        columnModel.getColumn(0).setPreferredWidth(5);
        columnModel.getColumn(1).setPreferredWidth(180);
        columnModel.getColumn(2).setPreferredWidth(180);

    }

    public void anchoCeldasP() {

        TableColumnModel columnModel = panel.getTblProductos().getColumnModel();

        JTableHeader cabecera = panel.getTblProductos().getTableHeader();
        cabecera.setBackground(Color.LIGHT_GRAY);
        cabecera.setFont(new Font("Arial", Font.BOLD, 14));
        cabecera.setForeground(Color.BLACK);

        columnModel.getColumn(0).setPreferredWidth(5);
        columnModel.getColumn(1).setPreferredWidth(180);
        columnModel.getColumn(2).setPreferredWidth(15);
        columnModel.getColumn(3).setPreferredWidth(10);
        columnModel.getColumn(4).setPreferredWidth(200);
    }

    public void cargaComboProductosCategorias() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLCmbCategorias);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String categorias = rs.getString("Nombre");
                panel.getCmbProductosCategoria().addItem(categorias);
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

    public void eliminarProducto() {

        int row = panel.getTblProductos().getSelectedRow();
        if (row >= 0) {

            int opcion = JOptionPane.showConfirmDialog(panel, "¿Eliminar Producto?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {
                Connection conexion = getConnection();

                DefaultTableModel modelo = (DefaultTableModel) panel.getTblProductos().getModel();

                String Id = modelo.getValueAt(row, 0).toString();
                try {
                    PreparedStatement ps = conexion.prepareStatement(SQLEliminarProducto);
                    ps.setString(1, Id);
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

                JOptionPane.showMessageDialog(panel, "Producto eliminado");

                modelo.removeRow(row);

            } else {
                JOptionPane.showMessageDialog(panel, "No se ha eliminado el producto");
            }
        } else {
            JOptionPane.showMessageDialog(panel, "Por favor seleccione un producto");
        }
    }

    public void eliminarCategoria() {

        int row = panel.getTblCategorias().getSelectedRow();
        if (row >= 0) {

            int opcion = JOptionPane.showConfirmDialog(panel, "¿Eliminar Categoria?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {
                Connection conexion = getConnection();

                DefaultTableModel modelo = (DefaultTableModel) panel.getTblCategorias().getModel();

                String Id = modelo.getValueAt(row, 0).toString();

                try {
                    PreparedStatement ps = conexion.prepareStatement(SQLEliminarCategoria);
                    ps.setString(1, Id);
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

                JOptionPane.showMessageDialog(panel, "Categoria eliminada");
                modelo.removeRow(row);
            } else {
                JOptionPane.showMessageDialog(panel, "No se ha eliminado la categoria");
            }
        } else {

            JOptionPane.showMessageDialog(panel, "Por favor seleccione una categoria");
        }
    }

    public void consultaProductos() {

        Connection conexion = getConnection();

        DefaultTableModel dtm = new DefaultTableModel();
        ResultSet rs;
        dtm.addColumn("Id");
        dtm.addColumn("Descripcion");
        dtm.addColumn("Precio");
        dtm.addColumn("Cant");
        dtm.addColumn("Imagen");

        if (panel.getCmbProductosCategoria().getSelectedItem().equals("Entrantes")) {

            try {

                PreparedStatement ps = conexion.prepareStatement(SQLProductosEntrantes);

                rs = ps.executeQuery();

                while (rs.next()) {

                    dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBlob(5)});
                }

                panel.getTblProductos().setModel(dtm);

            } catch (SQLException se) {
            } finally {

                try {
                    if (conexion != null) {
                        conexion.close();
                    }

                } catch (SQLException se) {
                }
            }
        } else {
            if (panel.getCmbProductosCategoria().getSelectedItem().equals("Complimentos")) {

                try {

                    PreparedStatement ps = conexion.prepareStatement(SQLProductosComplimentos);

                    rs = ps.executeQuery();

                    while (rs.next()) {

                        dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBlob(5)});
                    }

                    panel.getTblProductos().setModel(dtm);

                } catch (SQLException se) {
                } finally {

                    try {
                        if (conexion != null) {
                            conexion.close();
                        }

                    } catch (SQLException se) {
                    }
                }
            } else {
                if (panel.getCmbProductosCategoria().getSelectedItem().equals("Hamburguesas")) {

                    try {

                        PreparedStatement ps = conexion.prepareStatement(SQLProductosHamburguesas);

                        rs = ps.executeQuery();

                        while (rs.next()) {

                            dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBlob(5)});
                        }

                        panel.getTblProductos().setModel(dtm);

                    } catch (SQLException se) {
                    } finally {

                        try {
                            if (conexion != null) {
                                conexion.close();
                            }

                        } catch (SQLException se) {
                        }
                    }
                } else {
                    if (panel.getCmbProductosCategoria().getSelectedItem().equals("Complimentos")) {

                        try {

                            PreparedStatement ps = conexion.prepareStatement(SQLProductosComplimentos);

                            rs = ps.executeQuery();

                            while (rs.next()) {

                                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBlob(5)});
                            }

                            panel.getTblProductos().setModel(dtm);

                        } catch (SQLException se) {
                        } finally {

                            try {
                                if (conexion != null) {
                                    conexion.close();
                                }

                            } catch (SQLException se) {
                            }
                        }
                    } else {
                        if (panel.getCmbProductosCategoria().getSelectedItem().equals("Postres")) {

                            try {

                                PreparedStatement ps = conexion.prepareStatement(SQLProductosPostres);

                                rs = ps.executeQuery();

                                while (rs.next()) {

                                    dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBlob(5)});
                                }

                                panel.getTblProductos().setModel(dtm);

                            } catch (SQLException se) {
                            } finally {

                                try {
                                    if (conexion != null) {
                                        conexion.close();
                                    }

                                } catch (SQLException se) {
                                }
                            }
                        } else {
                            if (panel.getCmbProductosCategoria().getSelectedItem().equals("Bebidas")) {

                                try {

                                    PreparedStatement ps = conexion.prepareStatement(SQLProductosBebidas);

                                    rs = ps.executeQuery();

                                    while (rs.next()) {

                                        dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBlob(5)});
                                    }

                                    panel.getTblProductos().setModel(dtm);

                                } catch (SQLException se) {
                                } finally {

                                    try {
                                        if (conexion != null) {
                                            conexion.close();
                                        }

                                    } catch (SQLException se) {
                                    }
                                }
                            } else {
                                if (panel.getCmbProductosCategoria().getSelectedItem().equals("Cafes")) {

                                    try {

                                        PreparedStatement ps = conexion.prepareStatement(SQLProductosCafes);

                                        rs = ps.executeQuery();

                                        while (rs.next()) {

                                            dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBlob(5)});
                                        }

                                        panel.getTblProductos().setModel(dtm);

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
                        }
                    }
                }
            }
        }
        anchoCeldasP();
    }

    public void listarCategorias() {

        Connection conexion = getConnection();

        DefaultTableModel dtm = new DefaultTableModel();
        ResultSet rs;

        try {

            dtm.addColumn("Id");
            dtm.addColumn("Nombre");
            dtm.addColumn("Imagen");

            PreparedStatement ps = conexion.prepareStatement(SQLTblCategorias);

            rs = ps.executeQuery();

            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getBlob(3)});
            }

            panel.getTblCategorias().setModel(dtm);

        } catch (SQLException se) {
        } finally {

            try {
                if (conexion != null) {
                    conexion.close();
                }

            } catch (SQLException se) {
            }
        }
        anchoCeldasC();
    }

    public void modificarPoducto() {
        Connection conexion = getConnection();

        try {
            DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
            int rows = tblProductos.getSelectedRow();

            PreparedStatement ps = conexion.prepareStatement(SQLCmbCategorias);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String categoria = rs.getString("Nombre");

                panel4.getCmbCategorias().addItem(categoria);

                panel4.getTxtId().setText(modelo.getValueAt(rows, 0).toString());
                panel4.getTxtDescripcion().setText(modelo.getValueAt(rows, 1).toString());
                panel4.getTxtPrecio().setText(modelo.getValueAt(rows, 2).toString());
                panel4.getTxtCantidad().setText(modelo.getValueAt(rows, 3).toString());

                Blob imgp = (Blob) modelo.getValueAt(rows, 4);
                byte[] imageDatap = null;
                imageDatap = imgp.getBytes(1, (int) imgp.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageDatap));
                ImageIcon jk1p = new ImageIcon(imag);
                Icon fopruebap = new ImageIcon(jk1p.getImage().getScaledInstance(panel4.getLblNuevaImagenP().getWidth(), panel4.getLblNuevaImagenP().getHeight(), Image.SCALE_DEFAULT));
                panel4.getLblNuevaImagenP().setIcon(fopruebap);

            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesAjustesProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesAjustesProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizaProducto() {

        int opcion = JOptionPane.showConfirmDialog(panel, "¿Modificar producto?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {

            Connection conexion = getConnection();

            String Id = panel4.getTxtId().getText();
            String descripcion = panel4.getTxtDescripcion().getText();
            String categoria = (String) panel4.getCmbCategorias().getSelectedItem();
            String precio = panel4.getTxtPrecio().getText();
            String cantidad = panel4.getTxtCantidad().getText();

            try {
          
                PreparedStatement ps = conexion.prepareStatement(SQLActualizaproducto);

                ps.setString(1, descripcion);
                ps.setString(2, categoria);
                ps.setString(3, precio);
                ps.setString(4, cantidad);

//                FileInputStream archivoFoto;
//                archivoFoto = new FileInputStream(panel4.getTxtRuta().getText());
                ps.setBinaryStream(5, fis, longitudBytes);

                ps.setString(6, Id);

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
            JOptionPane.showMessageDialog(panel, "producto modificado correctamente");

        } else {
            JOptionPane.showMessageDialog(panel, "No se ha modificado el producto");
        }
    }
    
    public void modificaImagenCategoriaN() {
        
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);//solo archivos y no carpetas
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(j.getSelectedFile());

                this.longitudBytes = (int) j.getSelectedFile().length();

                try {
                    Image icono = ImageIO.read(j.getSelectedFile()).getScaledInstance(panel2.getLblNuevaImagenC().getWidth(), panel2.getLblNuevaImagenC().getHeight(), Image.SCALE_DEFAULT);
                    panel2.getLblNuevaImagenC().setIcon(new ImageIcon(icono));

                } catch (IOException ex) {

                }
            } catch (FileNotFoundException ex) {
            }
        }
        
    }
    
    public void modificaImagenProducto() {
        
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);//solo archivos y no carpetas
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(j.getSelectedFile());

                this.longitudBytes = (int) j.getSelectedFile().length();

                try {
                    Image icono = ImageIO.read(j.getSelectedFile()).getScaledInstance(panel4.getLblNuevaImagenP().getWidth(), panel4.getLblNuevaImagenP().getHeight(), Image.SCALE_DEFAULT);
                    panel4.getLblNuevaImagenP().setIcon(new ImageIcon(icono));

                } catch (IOException ex) {

                }
            } catch (FileNotFoundException ex) {
            }
        }
        
    }
    
    public void modificaImagenProductoN() {
        
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);//solo archivos y no carpetas
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(j.getSelectedFile());

                this.longitudBytes = (int) j.getSelectedFile().length();

                try {
                    Image icono = ImageIO.read(j.getSelectedFile()).getScaledInstance(panel3.getLblNuevaImagenP().getWidth(), panel3.getLblNuevaImagenP().getHeight(), Image.SCALE_DEFAULT);
                    panel3.getLblNuevaImagenP().setIcon(new ImageIcon(icono));

                } catch (IOException ex) {

                }
            } catch (FileNotFoundException ex) {
            }
        }
        
        
    }
 
    public void modificaImagenCategoria() {

        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);//solo archivos y no carpetas
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(j.getSelectedFile());

                this.longitudBytes = (int) j.getSelectedFile().length();

                try {
                    Image icono = ImageIO.read(j.getSelectedFile()).getScaledInstance(panel5.getLblNuevaImagenC().getWidth(), panel5.getLblNuevaImagenC().getHeight(), Image.SCALE_DEFAULT);
                    panel5.getLblNuevaImagenC().setIcon(new ImageIcon(icono));

                } catch (IOException ex) {

                }
            } catch (FileNotFoundException ex) {
            }
        }
    }

    public void modificaCategoria() {

        Connection conexion = getConnection();

        try {
            DefaultTableModel modelo = (DefaultTableModel) tblCategorias.getModel();
            int rowss = tblCategorias.getSelectedRow();

            panel5.getTxtNuevaCategoria().setText(modelo.getValueAt(rowss, 1).toString());

            Blob imgp = (Blob) modelo.getValueAt(rowss, 2);
            byte[] imageDatap = null;
            imageDatap = imgp.getBytes(1, (int) imgp.length());
            BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageDatap));
            ImageIcon jk1p = new ImageIcon(imag);
            Icon fopruebap = new ImageIcon(jk1p.getImage().getScaledInstance(panel5.getLblNuevaImagenC().getWidth(), panel5.getLblNuevaImagenC().getHeight(), Image.SCALE_DEFAULT));
            panel5.getLblNuevaImagenC().setIcon(fopruebap);

        } catch (SQLException ex) {
            Logger.getLogger(AccionesAjustesProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesAjustesProductos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editaCategoria() {

        DefaultTableModel modelo = (DefaultTableModel) tblCategorias.getModel();
        int row = tblCategorias.getSelectedRow();

        try {
            PreparedStatement ps = conexion.prepareStatement(SQLModificaC);

            ps.setString(1, modelo.getValueAt(row, 1).toString());
            ps.setBinaryStream(2, fis, longitudBytes);

            ps.setString(3, modelo.getValueAt(row, 0).toString());
            ps.execute();

            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(AccionesAjustesProductos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void nuevaCategoria() {

        Connection conexion = getConnection();

        String nombre = panel2.getTxtNuevaCategoria().getText();

        try {
            PreparedStatement ps = conexion.prepareStatement(SQLGuardaCategoria);

            ps.setString(1, nombre);

//            FileInputStream archivoFoto;
//            archivoFoto = new FileInputStream(panel2.getTxtRutaC().getText());
            ps.setBinaryStream(2, fis, longitudBytes);

            ps.executeUpdate();

            panel2.getTxtNuevaCategoria().setText("");

        } catch (SQLException se) {
        } finally {

            try {
                if (conexion != null) {
                    conexion.close();
                }

            } catch (SQLException se) {
            }
        }
        JOptionPane.showMessageDialog(panel2, "Categoria guardada");
    }

    public void cargaComboCategorias() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLCmbCategorias);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String categoria = rs.getString("Nombre");
                panel3.getCmbCategorias().addItem(categoria);
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

    public void imagenCategoria() {

        DefaultTableModel modelo = (DefaultTableModel) panel.getTblCategorias().getModel();
        int row = panel.getTblCategorias().getSelectedRow();

        Blob img = (Blob) modelo.getValueAt(row, 2);
        if (modelo.getValueAt(row, 2) == null) {
            JOptionPane.showMessageDialog(panel, "Esta categoria no tiene foto");
        } else {
            try {

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                Icon foprueba = new ImageIcon(jk1.getImage().getScaledInstance(panel.getLblImagenC().getWidth(), panel.getLblImagenC().getHeight(), Image.SCALE_DEFAULT));
                panel.getLblImagenC().setIcon(foprueba);

            } catch (SQLException ex) {
                Logger.getLogger(AccionesAjustesProductos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AccionesAjustesProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void imagenProducto() {

        DefaultTableModel modelo = (DefaultTableModel) panel.getTblProductos().getModel();
        int row = panel.getTblProductos().getSelectedRow();

        Blob imgp = (Blob) modelo.getValueAt(row, 4);

        if (modelo.getValueAt(row, 4) == null) {
            JOptionPane.showMessageDialog(panel, "Este producto no tiene foto");
        } else {
            try {

                byte[] imageDatap = null;
                imageDatap = imgp.getBytes(1, (int) imgp.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageDatap));
                ImageIcon jk1p = new ImageIcon(imag);
                Icon fopruebap = new ImageIcon(jk1p.getImage().getScaledInstance(panel.getLblImagenP().getWidth(), panel.getLblImagenP().getHeight(), Image.SCALE_DEFAULT));
                panel.getLblImagenP().setIcon(fopruebap);

            } catch (IOException ex) {
                Logger.getLogger(AccionesAjustesProductos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AccionesAjustesProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void guardarProducto() {

        int opcion = JOptionPane.showConfirmDialog(panel, "¿Guragdar producto?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {

            Connection conexion = getConnection();

            String descripcion = panel3.getTxtDescripcion().getText();
            String categoria = (String) panel3.getCmbCategorias().getSelectedItem();
            String precio = panel3.getTxtPrecio().getText();
            String cantidad = panel3.getTxtCantidad().getText();

            try {

                PreparedStatement ps = conexion.prepareStatement(SQLproducto);

                ps.setString(1, descripcion);
                ps.setString(2, categoria);
                ps.setString(3, precio);
                ps.setString(4, cantidad);

//                FileInputStream archivoFoto;
//                archivoFoto = new FileInputStream(panel3.getTxtRuta().getText());
//                ps.setBinaryStream(5, archivoFoto);
                ps.setBinaryStream(5, fis, longitudBytes);
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
            JOptionPane.showMessageDialog(panel, "producto guardado correctamente");

        } else {
            JOptionPane.showMessageDialog(panel, "No se ha guardado el producto");
        }

    }

}
