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
import punto.de.venta.gestionbd.ServicePostres;
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

import punto.de.venta.pantallas.PanelPostres;
import static punto.de.venta.pantallas.PantallaCajaRegistradora.tblSumaPedidos;

/**
 * Clase que captura las acciones que se hacen sobre los botones del
 * panelPostres
 *
 * @author Jamal Hassini
 */
public class AccionesPostres extends ServicePostres {

    private PanelPostres panel;
    DefaultTableModel modelo = (DefaultTableModel) tblSumaPedidos.getModel();
    int descuento = 0;
    double subtotal;
    int cantidad = 1;

    /**
     * Constructor de la clase AccionesPostres.
     *
     * @param panel PanelPostres el panel del que se pretende manejar eventos.
     */
    public AccionesPostres(PanelPostres panel) {

        this.panel = panel;
    }

    /**
     * Metodo que carga el producto "tarta de chocolate" y sus detalles en una
     * fila del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverTartaChocolate() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLpostreTartaChocolate);

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
     * Metodo que carga el producto "tarta de arandanos" y sus detalles en una
     * fila del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverTartaArandanos() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLpostreTartaArandanos);

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
     * Metodo que carga el producto "crema catalana" y sus detalles en una fila
     * del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverCremaCatalana() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLpostreCremaCatalana);

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
     * Metodo que carga el producto "helado de chocolate" y sus detalles en una
     * fila del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverHeladoChocolate() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLpostreHeladoChocolate);

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
     * Metodo que carga el producto "helado de fresas" y sus detalles en una
     * fila del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverHeladoFresas() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLpostreHeladoFresas);

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
     * Metodo que carga el producto "macedonia" y sus detalles en una fila del
     * modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverMacedonia() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLpostreMacedonia);

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


    
    
    
    
    
    public void botonTartaChocolate() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonTartaChocolate);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnTartaChocolate().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnTartaChocolate().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonTartaArandanos() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonTartaArandanos);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnTartaArandanos().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnTartaArandanos().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonMacedonia() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonMacedonia);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnMacedonia().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnMacedonia().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonHeladoChocolate() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonHeladoChocolate);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnHeladoChocolate().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnHeladoChocolate().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonHeladoFresas() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonHeladoFresas);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnHeladoFresas().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnHeladoFresas().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void botonCremaCatalana() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonCremaCatalana);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnCremaCatalana().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnCremaCatalana().setIcon(jk1);
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
