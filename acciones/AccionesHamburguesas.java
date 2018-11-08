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
import punto.de.venta.gestionbd.ServiceHamburguesas;

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

import punto.de.venta.pantallas.PanelHamburguesas;
import static punto.de.venta.pantallas.PantallaCajaRegistradora.tblSumaPedidos;

/**
 * Clase que captura las acciones que se hacen sobre los botones del
 * panelHamburguesas
 *
 * @author Jamal Hassini
 */
public class AccionesHamburguesas extends ServiceHamburguesas {

    private PanelHamburguesas panel;
    DefaultTableModel modelo = (DefaultTableModel) tblSumaPedidos.getModel();
    int descuento = 0;
    double subtotal;
    int cantidad = 1;

    /**
     * Constructor de la clase AccionesHamburguesas.
     *
     * @param panel PanelHamburguesas el panel del que se pretende manejar eventos.
     */
    public AccionesHamburguesas(PanelHamburguesas panel) {

        this.panel = panel;
    }

    /**
     * Metodo que carga el producto "hamburguesa normal" y sus detalles en una
     * fila del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverNormal() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLburguerNormal);

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
     * Metodo que carga el producto "hamburgeusa doble" y sus detalles en una
     * fila del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverDoble() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLburguerDoble);

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
     * Metodo que carga el producto "hamburguesa de pollo" y sus detalles en una
     * fila del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverPollo() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLburguerPollo);

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

            //Cierre de conexion 
            try {
                if (conexion != null) {
                    conexion.close();
                }

            } catch (SQLException se) {
            }
        }
    }

    /**
     * Metodo que carga el producto "hamburguesa doble de pollo" y sus detalles
     * en una fila del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverDoblePollo() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLburguerDoblePollo);

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
     * Metodo que carga el producto "hamburguesa de ternera" y sus detalles en
     * una fila del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverTernera() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLburguerTernera);

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
     * Metodo que carga el producto "hamburguesa de ternera de 200g" y sus
     * detalles en una fila del modelo de la tblSumaPedidos
     *
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverTernera200() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLburguerTernera200g);

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


    
    public void botonHamburguesaNormal() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonHamburguesaNormal);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnHamburguesaNormal().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnHamburguesaNormal().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonHamburguesaDoble() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonHamburguesaDoble);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnHamburguesaDoble().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnHamburguesaDoble().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonHamburguesaPollo() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonHamburguesaPollo);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnHamburguesaPollo().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnHamburguesaPollo().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonHamburguesaDoblePollo() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonHamburguesaDoblePollo);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnHamburguesaDoblePollo().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnHamburguesaDoblePollo().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonHamburguesaTernera() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonHamburguesaTernera);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnHamburguesaTernera().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnHamburguesaTernera().setIcon(jk1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void botonHamburguesaTernera200g() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonHamburguesaTernera200g);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnHamburguesaTernera200g().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                panel.getBtnHamburguesaTernera200g().setIcon(jk1);
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




