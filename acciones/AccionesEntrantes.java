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
import punto.de.venta.gestionbd.ServiceEntrantes;
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

import punto.de.venta.pantallas.PanelEntrantes;
import static punto.de.venta.pantallas.PantallaCajaRegistradora.tblSumaPedidos;

/**
 * Clase que captura las acciones que se hacen sobre los botones del panelEntrantes
 *
 * @author Jamal Hassini
 */
public class AccionesEntrantes extends ServiceEntrantes {

    private PanelEntrantes panel;
    DefaultTableModel modelo = (DefaultTableModel) tblSumaPedidos.getModel();
    int descuento = 0;
    double subtotal;
    int cantidad = 1;
    
    /**
     * Constructor de la clase AccionesEntrantes.
     *
     * @param panel PanelEntrantes el panel del que se pretende manejar eventos.
     */
    public AccionesEntrantes(PanelEntrantes panel) {

        this.panel = panel;
    }
    
    /**
     * Metodo que carga el producto "ensalada verde" y sus detalles en una fila del modelo de la tblSumaPedidos
     * 
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverEnsalada() {
        
        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLEnsalada);

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
     * Metodo que carga el producto "ensalada cesar" y sus detalles en una fila del modelo de la tblSumaPedidos
     * 
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverCesar() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLCesar);

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
     * Metodo que carga el producto "nachos" y sus detalles en una fila del modelo de la tblSumaPedidos
     * 
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverNachos() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLNachos);

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
     * Metodo que carga el producto "montaditos" y sus detalles en una fila del modelo de la tblSumaPedidos
     * 
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverMontadito() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLMontadito);

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
     * Metodo que carga el producto "ensaladilla rusa" y sus detalles en una fila del modelo de la tblSumaPedidos
     * 
     * Detalles de la fila: Descripcion, cantidad, precio, descuento y subtotal
     */
    public void devolverEnsaladilla() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLEnsaladilla);

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


    
    public void botonEnsaladaCesar() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonEnsaladaCesar);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnEnsaladaCesar().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                Icon foprueba= new ImageIcon(jk1.getImage().getScaledInstance(panel.getBtnEnsaladaCesar().getWidth(), panel.getBtnEnsaladaCesar().getHeight(), Image.SCALE_DEFAULT));
                panel.getBtnEnsaladaCesar().setIcon(foprueba);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonEnsaladaMediterranea() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonEnsaladaMediterranea);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnEnsaladaMediterranea().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                Icon foprueba= new ImageIcon(jk1.getImage().getScaledInstance(panel.getBtnEnsaladaMediterranea().getWidth(), panel.getBtnEnsaladaMediterranea().getHeight(), Image.SCALE_DEFAULT));
                panel.getBtnEnsaladaMediterranea().setIcon(foprueba);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonEnsaladillaRusa() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonEnsaladillaRusa);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnEnsaladillaRusa().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                Icon foprueba= new ImageIcon(jk1.getImage().getScaledInstance(panel.getBtnEnsaladillaRusa().getWidth(), panel.getBtnEnsaladillaRusa().getHeight(), Image.SCALE_DEFAULT));
                panel.getBtnEnsaladillaRusa().setIcon(foprueba);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonMontaditos() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonMontaditos);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnMontaditos().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                Icon foprueba= new ImageIcon(jk1.getImage().getScaledInstance(panel.getBtnMontaditos().getWidth(), panel.getBtnMontaditos().getHeight(), Image.SCALE_DEFAULT));
                panel.getBtnMontaditos().setIcon(foprueba);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonNachos() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonNachos);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Descripcion");
                Blob img = rs.getBlob("Imagen");

                panel.getBtnNachos().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                Icon foprueba= new ImageIcon(jk1.getImage().getScaledInstance(panel.getBtnNachos().getWidth(), panel.getBtnNachos().getHeight(), Image.SCALE_DEFAULT));
                panel.getBtnNachos().setIcon(foprueba);
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
