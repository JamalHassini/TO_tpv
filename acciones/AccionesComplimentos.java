/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.acciones;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import punto.de.venta.gestionbd.ServiceComplimentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import punto.de.venta.pantallas.PanelComplimentos;
import static punto.de.venta.pantallas.PantallaCajaRegistradora.tblSumaPedidos;

/**
 * Clase que captura las acciones que se hacen sobre los botones del
 * panelComplimentos
 *
 * @author Jamal Hassini
 */
public class AccionesComplimentos extends ServiceComplimentos {

    private PanelComplimentos panel;
    DefaultTableModel modelo = (DefaultTableModel) tblSumaPedidos.getModel();
    int descuento = 0;
    double subtotal;
    int cantidad = 1;
    

    /**
     * Constructor de la clase PanelComplimentos.
     *
     * @param panel PanelComplimentos el panel del que se pretende manejar eventos.
     */
    public AccionesComplimentos(PanelComplimentos panel) {
        this.panel = panel;
    }

    /**
     * Metodo que carga el producto "patatas fritas" y sus detalles en una fila
     * del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverFritas() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLFritas);

            ResultSet rs;
            rs = ps.executeQuery();

            Vector fila = new Vector();

            while (rs.next()) {

                subtotal = cantidad * Double.parseDouble(rs.getString("Precio"));
                
                fila.add(rs.getString("Descripcion"));
                fila.add(cantidad);
                fila.add(rs.getString("Precio"));
                fila.add(descuento);
                fila.add(subtotal);
                modelo.insertRow(0, fila);
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
     * Metodo que carga el producto "patatas asadas" y sus detalles en una fila
     * del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverAsadas() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLAsadas);

            ResultSet rs;
            rs = ps.executeQuery();

            Vector fila = new Vector();

            while (rs.next()) {

                subtotal = cantidad * Double.parseDouble(rs.getString("Precio"));
                
                fila.add(rs.getString("Descripcion"));
                fila.add(cantidad);
                fila.add(rs.getString("Precio"));
                fila.add(descuento);
                fila.add(subtotal);
                modelo.insertRow(0, fila);
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
     * Metodo que carga el producto "aros de cebolla" y sus detalles en una fila
     * del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverAros() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLAros);

            ResultSet rs;
            rs = ps.executeQuery();

            Vector fila = new Vector();

            while (rs.next()) {

                subtotal = cantidad * Double.parseDouble(rs.getString("Precio"));
                
                fila.add(rs.getString("Descripcion"));
                fila.add(cantidad);
                fila.add(rs.getString("Precio"));
                fila.add(descuento);
                fila.add(subtotal);
                modelo.insertRow(0, fila);
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
    
    public void botonPatatasAsadas() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonPatatasAsadas);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnPatatasAsadas().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnPatatasAsadas().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void botonPatatasFritas() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonPatatasFritas);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnPatatasFritas().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnPatatasFritas().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void botonArosDeCebolla() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonArosDeCebolla);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnArosDeCebolla().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnArosDeCebolla().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
