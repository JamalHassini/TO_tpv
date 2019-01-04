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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import punto.de.venta.pantallas.PanelComplimentos;
import punto.de.venta.pantallas.PantallaCajaRegistradora;
import static punto.de.venta.pantallas.PantallaCajaRegistradora.tblSumaPedidos;

/**
 * Clase que captura las acciones que se hacen sobre los botones del
 * panelComplimentos
 *
 * @author Jamal Hassini
 */
public class AccionesComplimentos1 extends ServiceComplimentos {

    private PanelComplimentos panel;
    DefaultTableModel modelo = (DefaultTableModel) tblSumaPedidos.getModel();
    int descuento = 0;
    double subtotal;
    int cantidad = 1;
    private PantallaCajaRegistradora panel1;
    

    /**
     * Constructor de la clase PanelComplimentos.
     *
     * @param panel PanelComplimentos el panel del que se pretende manejar eventos.
     */
    public AccionesComplimentos1(PanelComplimentos panel) {
        
        this.panel = panel;
    }
    public AccionesComplimentos1(PantallaCajaRegistradora panel1) {
        
        this.panel1 = panel1;
    }
    
    
//    public void anchoCeldasP() {
//
//        TableColumnModel columnModel = panel1.getTblSumaPedidos().getColumnModel();
//
//        JTableHeader cabecera = panel1.getTblSumaPedidos().getTableHeader();
//        cabecera.setBackground(Color.LIGHT_GRAY);
//        cabecera.setFont(new Font("Arial", Font.BOLD, 14));
//        cabecera.setForeground(Color.BLACK);
//
//        columnModel.getColumn(0).setPreferredWidth(5);
//        columnModel.getColumn(1).setPreferredWidth(180);
//        columnModel.getColumn(2).setPreferredWidth(15);
//        columnModel.getColumn(3).setPreferredWidth(10);
//        columnModel.getColumn(4).setPreferredWidth(200);
//    }
    
    public void devolverFritas() {

        Connection conexion = getConnection();
        DefaultTableModel dtm = new DefaultTableModel();
        //PreparedStatement ps1 = conexion.prepareStatement(SQLProductos);
        ResultSet rs;//= ps1.executeQuery();
        dtm.addColumn("Descripcion");
        dtm.addColumn("cantidad");
        dtm.addColumn("Precio");
        dtm.addColumn("descuento");
        dtm.addColumn("subtotal");
        
        if (panel.btnPatatasFritas.isSelected()) {
            
            try {
                
                PreparedStatement ps = conexion.prepareStatement(SQLFritas);
                
                rs = ps.executeQuery();
                //subtotal = cantidad * Double.parseDouble(rs.getString("Precio"));
                
                while (rs.next()) {
                    
                    dtm.addRow(new Object[]{rs.getString(1),"cantidad", rs.getString(2), "descuento", "subtotal"});
                }
                
                panel1.getTblSumaPedidos().setModel(dtm);
                
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
            if (panel.btnPatatasAsadas.isSelected()) {
                
                try {
                    
                    PreparedStatement ps = conexion.prepareStatement(SQLAsadas);
                    
                    rs = ps.executeQuery();

                    while (rs.next()) {

                        dtm.addRow(new Object[]{rs.getString(1),cantidad, rs.getString(2), descuento, subtotal});
                    }

                    panel1.getTblSumaPedidos().setModel(dtm);

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
                if (panel.btnArosDeCebolla.isSelected()) {
                    
                    try {
                        
                        PreparedStatement ps = conexion.prepareStatement(SQLAros);
                        
                        rs = ps.executeQuery();

                        while (rs.next()) {

                            dtm.addRow(new Object[]{rs.getString(1),cantidad, rs.getString(2), descuento, subtotal});
                        }

                        panel1.getTblSumaPedidos().setModel(dtm);

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
//        anchoCeldasP();
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
