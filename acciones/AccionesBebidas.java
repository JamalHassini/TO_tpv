/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.acciones;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import punto.de.venta.gestionbd.ServiceBebidas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import punto.de.venta.pantallas.PanelBebidas;
import static punto.de.venta.pantallas.PantallaCajaRegistradora.tblSumaPedidos;

/**
 * Clase que captura las acciones que se hacen sobre los botones del
 * panelBebidas
 *
 * @author Jamal Hassini
 */
public class AccionesBebidas extends ServiceBebidas {

    private PanelBebidas panel;
    DefaultTableModel modelo = (DefaultTableModel) tblSumaPedidos.getModel();
    int descuento = 0;
    double subtotal;
    int cantidad = 1;

    /**
     * Constructor de la clase AccionesBebidas.
     *
     * @param panel PanelBebidas el panel del que se pretende manejar eventos.
     */
    public AccionesBebidas(PanelBebidas panel) {
        this.panel = panel;
    }

    /**
     * Metodo que carga el producto "agua" y sus detalles en una fila del modelo
     * de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverAgua() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLAgua);

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
     * Metodo que carga el producto "aquarius" y sus detalles en una fila del
     * modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverZumos() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLZumos);

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
     * Metodo que carga el producto "estrella" y sus detalles en una fila del
     * modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverCervezas() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLCervezas);

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
     * Metodo que carga el producto "estrella damm" y sus detalles en una fila
     * del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverCervezasSin() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLCervezasSin);

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
     * Metodo que carga el producto "cocacola" y sus detalles en una fila del
     * modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverRefrescos() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLRefrescos);

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
     * Metodo que carga el producto "fanta naranja" y sus detalles en una fila
     * del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverCubatas() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLCubatas);

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
    
    public void botonAgua() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonAgua);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnAgua().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                Icon foprueba= new ImageIcon(jk1.getImage().getScaledInstance(panel.getBtnAgua().getWidth(), panel.getBtnAgua().getHeight(), Image.SCALE_DEFAULT));
                panel.getBtnAgua().setIcon(foprueba);
                panel.getBtnAgua().setSize(120, 120);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void botonZumos() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonZumos);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnZumos().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnZumos().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void botonCervezas() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonCervezas);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnCervezas().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnCervezas().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void botonCervezasSin() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonCervezasSin);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnCervezasSin().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                
                panel.getBtnCervezasSin().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void botonRefrescos() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonRefrescos);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnRefrescos().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnRefrescos().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void botonCubatas() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonCubatas);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnCubatas().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnCubatas().setIcon(jk1);
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
