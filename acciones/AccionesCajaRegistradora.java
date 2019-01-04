
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.acciones;

import punto.de.venta.gestionbd.ServiceCajaRegistradora;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import punto.de.venta.pantallas.PantallaCajaRegistradora;

/**
 * Clase que configura componentes de la pantallaCajaRegistradora y captura las
 * acciones que se realizan sobre ella.
 *
 * @author Jamal Hassini
 */

public class AccionesCajaRegistradora extends ServiceCajaRegistradora {

    private PantallaCajaRegistradora panel;
    
    /**
     * Constructor de la clase accionesCajaRegistradora.
     *
     * @param panel PantallaCajaRegistradora el panel del que se pretende
     * manejar eventos.
     */
    public AccionesCajaRegistradora(PantallaCajaRegistradora panel) {
        this.panel = panel;
    }

    /**
     * Metodo de la clase accionesCajaRegistradora que muestra el JComboBox en
     * la columna cantidad de la tblSumaPedidos
     */
    public void comboCantidad() {

        String[] cantidad = {"1", "2", "3", "4", "5"};
        JComboBox cmb = new JComboBox(cantidad);

        panel.getTblSumaPedidos().getColumnModel().getColumn(1).
                setCellEditor(new DefaultCellEditor(cmb));
    }

    /**
     * Metodo que ajusta el encabezado y las celdas de la tblSumaPedidos
     */
    public void ajustarCeldas() {

        TableColumnModel columnModel = panel.getTblSumaPedidos().getColumnModel();
        JTableHeader cabecera = panel.getTblSumaPedidos().getTableHeader();
        cabecera.setBackground(Color.pink);
        cabecera.setFont(new Font("Arial", Font.BOLD, 14));
        cabecera.setForeground(Color.BLACK);

        columnModel.getColumn(0).setPreferredWidth(195);
        columnModel.getColumn(1).setPreferredWidth(15);
        columnModel.getColumn(2).setPreferredWidth(25);
        columnModel.getColumn(3).setPreferredWidth(10);
        columnModel.getColumn(4).setPreferredWidth(40);
    }

    /**
     * Metodo que muestra la fecha en el JTextField txtFecha
     */
    public void fecha() {
        Date fec = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        panel.getTxtFecha().setText(formatoFecha.format(fec));
    }

    /**
     * Metodo que muestra la hora en el JTextField txtHora
     */
    public void hora() {
        Date hor = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("HH:mm");
        panel.getTxtHora().setText(formatoFecha.format(hor));
    }

    /**
     * Metodo que carga los clientes en el JCombobox cmbClientes
     */
    public void devuelveClientes() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLCmbClientes);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String clientes = rs.getString("Nombre_Y_Apellidos");
                panel.getCmbClientes().addItem(clientes);
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
     * Metodo que calcula la columna descuento y la columna subtotal de cada
     * fila de la tblSumaPedidos dependiendo del valor de la columna cantidad
     */
    public void calculaSubtotal() {

        DefaultTableModel modelo = (DefaultTableModel) panel.getTblSumaPedidos().getModel();
        modelo.addTableModelListener((TableModelEvent evento) -> {
            if (evento.getType() == TableModelEvent.UPDATE) {
                
                int fil = evento.getFirstRow();
                int column = evento.getColumn();
                if (column == 1) {
                    
                    int cantidad = Integer.parseInt(modelo.getValueAt(fil, 1).toString());
                    double precio = Double.parseDouble(modelo.getValueAt(fil, 2).toString());
                    float descuento = Float.parseFloat(modelo.getValueAt(fil, 3).toString());
                    float subtotal = (float) (cantidad * precio);
                    
                    if (cantidad == 5) {
                        
                        descuento = (float) (subtotal * 0.10);
                        panel.getTblSumaPedidos().setValueAt(descuento, fil, 3);
                    }
                    
                    panel.getTblSumaPedidos().setValueAt(subtotal - descuento, fil, 4);
                }
            }
        } /**
         * Metodo sobre escrito que captura los cambios hechos sobre la
         * tabla tblSumaPedidos
         *
         * @param evento calcula las columnas descuento y subtotal segun el
         * valor de la columna cantidad
         */ );
    }

    /**
     * Metodo que calcula la suma de los valores de la columna subtotal de la
     * tabla tblSumaPedidos
     */
    public void sumaTotal() {
        DefaultTableModel modelo = (DefaultTableModel) panel.getTblSumaPedidos().getModel();
        modelo.addTableModelListener(new TableModelListener() {

            /**
             * Metodo sobre escrito que captura los cambios hechos sobre la
             * tabla tblSumaPedidos para reflejarlos en el JTextField txtTotal
             *
             * @param evento calcula los valores de la columna subtotal y lo
             * muestra en el JTextField txtTotal
             */
            @Override
            public void tableChanged(TableModelEvent evento) {

                double sumatoria;
                double sumatoria1 = 0;

                int totalRow = panel.getTblSumaPedidos().getRowCount();

                totalRow = totalRow - 1;

                for (int i = 0; i <= (totalRow); i++) {

                    sumatoria = Double.parseDouble(String.valueOf(panel.getTblSumaPedidos().getValueAt(i, 4)));
                    sumatoria1 += sumatoria;
                }

                panel.getTxtTotal().setText(String.valueOf((float) sumatoria1));
            }
        });
    }

    /**
     * Metodo que guarda los pedidos (las facturas) en la tabla correspondiente
     * de la bbdd y devuelve un JOptionPane que confirma el guardado de datos
     */
    public void guardarPedido() {

        if ("".equals(panel.getTxtTotal().getText())) {
            JOptionPane.showMessageDialog(panel, "No hay pedidos que guardar. Intentelo de nuevo;P ");
        } else {
            int opcion = JOptionPane.showConfirmDialog(panel, "¿Guragdar pedido?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {

                Connection conexion = getConnection();

                String IdCliente = (String) panel.getCmbClientes().getSelectedItem();
                String Fecha = panel.getTxtFecha().getText();
                String Hora = panel.getTxtHora().getText();
                String Total = panel.getTxtTotal().getText();

                try {

                    PreparedStatement ps = conexion.prepareStatement(SQLventa);

                    ps.setString(1, IdCliente);
                    ps.setString(2, Fecha);
                    ps.setString(3, Hora);
                    ps.setString(4, Total);

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
                JOptionPane.showMessageDialog(panel, "pedido guardado correctamente");

            } else {
                JOptionPane.showMessageDialog(panel, "¡ATTENCION! No se ha guardado el pedido");
            }
        }
    }
   
    public void ultimasession(){
        Connection conexion = getConnection();
        
        String nombre = PantallaCajaRegistradora.getLblOperario().getText();
        String Fecha = panel.getTxtFecha().getText();
        String Hora = panel.getTxtHora().getText();
        String lstsession = Fecha +" "+ Hora;
        
        try {

                    PreparedStatement ps = conexion.prepareStatement(SQLUltimaSession);

                    ps.setString(1, lstsession);
                    ps.setString(2, nombre);

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
    }

    /**
     * Metodo que guarda los detalles de los pedidos (detalles de facturas) en
     * la tabla correspondiente de la bbdd
     */
    public void guardarDetalles() {

        Connection conexion = getConnection();
        int totalRow = panel.getTblSumaPedidos().getRowCount();

        for (int i = 0; i < totalRow; i++) {

            String ventas_idVentas = panel.getTxtCodPedido().getText();
            String productos_IdProducto = panel.getTblSumaPedidos().getValueAt(i, 0).toString();
            String cantidad = panel.getTblSumaPedidos().getValueAt(i, 1).toString();
            String descuento = panel.getTblSumaPedidos().getValueAt(i, 3).toString();
            String subTotal = panel.getTblSumaPedidos().getValueAt(i, 4).toString();

            try {

                PreparedStatement ps = conexion.prepareStatement(SQL11);

                ps.setString(1, ventas_idVentas);
                ps.setString(2, productos_IdProducto);
                ps.setString(3, cantidad);
                ps.setString(4, descuento);
                ps.setString(5, subTotal);

                ps.executeUpdate();

            } catch (SQLException se) {
            }

        }
        try {
            if (conexion != null) {
                conexion.close();
            }

        } catch (SQLException se) {
        }
    }

    /**
     * Metodo que resta una fila de la estructura de la tabla tblSumaPedidos
     */
    public void restarFila() {

        DefaultTableModel modelo = (DefaultTableModel) panel.getTblSumaPedidos().getModel();
        int fila = 0;
        fila = panel.getTblSumaPedidos().getSelectedRow();
        if (fila >= 1) {
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(panel, "Por favor, seleccione una fila");
        }
    }

    /**
     * Metodo que muestra el id del nuevo pedido a hacer en el JTextField
     * txtCodPedido
     */
    public void getIdVentas() {

        Connection conexion = getConnection();
        String idPedido = "";
        int i = 0;

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLidventas);

            ResultSet rs;
            rs = ps.executeQuery();

            try {

                rs.next();
                i = rs.getInt(1) + 1;
                panel.getTxtCodPedido().setText(idPedido.concat(Integer.toString(i)));

            } catch (SQLException e) {

            }

        } catch (SQLException e) {

        }

        try {
            if (conexion != null) {
                conexion.close();
            }

        } catch (SQLException se) {
        }
    }

    /**
     * Metodo que calcula el cambio a devolver restando el valor del txtTotal al
     * de txtPagado
     */
    public void calculaCambio() {

        if ("".equals(panel.getTxtPagado().getText())) {
            JOptionPane.showMessageDialog(panel, "Por favor , introduzca la cantidad pagada");
        } else if("".equals(panel.getTxtTotal().getText())){
            
            
                JOptionPane.showMessageDialog(panel, "El campo total esta vacio!!!!");
                } else {
           

            double total = Double.parseDouble(panel.getTxtTotal().getText());
            double pagado = Double.parseDouble(panel.getTxtPagado().getText());

            double resultado = pagado - total;
            
            
            
            panel.getTxtCambio().setText(String.valueOf((float) resultado));
        }
        
    }

    public void actualizaStock() {

        Connection conexion = getConnection();
        int totalRow = panel.getTblSumaPedidos().getRowCount();
        for (int i = 0; i < totalRow; i++) {

            String cantidad = panel.getTblSumaPedidos().getValueAt(i, 1).toString();
            String descripcion = panel.getTblSumaPedidos().getValueAt(i, 0).toString();

            try {
                PreparedStatement ps = conexion.prepareStatement(SQLStock);

                ps.setInt(1, Integer.parseInt(cantidad));
                ps.setString(2, descripcion);
                ps.executeUpdate();

            } catch (SQLException ex) {

            }
        }
    }
    
    public void botonBebidas() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonBebidas);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Nombre");
                Blob img = rs.getBlob("Imagenc");

                panel.getBtnBebidas().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                      
                Icon foprueba= new ImageIcon(jk1.getImage().getScaledInstance(panel.getBtnBebidas().getWidth(), panel.getBtnBebidas().getHeight(), Image.SCALE_DEFAULT));
                
                panel.getBtnBebidas().setIcon(foprueba);
                panel.getBtnBebidas().setSize(120, 120);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonEntrantes() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonEntrantes);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Nombre");
                Blob img = rs.getBlob("Imagenc");

                panel.getBtnEntrantes().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                Icon foprueba= new ImageIcon(jk1.getImage().getScaledInstance(panel.getBtnEntrantes().getWidth(), panel.getBtnEntrantes().getHeight(), Image.SCALE_DEFAULT));
                panel.getBtnEntrantes().setIcon(foprueba);
                panel.getBtnEntrantes().setSize(120, 120);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonHamburguesas() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonHamburguesas);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Nombre");
                Blob img = rs.getBlob("Imagenc");

                panel.getBtnHamburguesas().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                Icon foprueba= new ImageIcon(jk1.getImage().getScaledInstance(panel.getBtnHamburguesas().getWidth(), panel.getBtnHamburguesas().getHeight(), Image.SCALE_DEFAULT));
                panel.getBtnHamburguesas().setIcon(foprueba);
                panel.getBtnHamburguesas().setSize(120, 120);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonComplimentos() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonComplimentos);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Nombre");
                Blob img = rs.getBlob("Imagenc");

                panel.getBtnComplimentos().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                Icon foprueba= new ImageIcon(jk1.getImage().getScaledInstance(panel.getBtnComplimentos().getWidth(), panel.getBtnComplimentos().getHeight(), Image.SCALE_DEFAULT));
                panel.getBtnComplimentos().setIcon(foprueba);
                panel.getBtnComplimentos().setSize(120, 120);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonPostres() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonPostres);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Nombre");
                Blob img = rs.getBlob("Imagenc");

                panel.getBtnPostres().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                Icon foprueba= new ImageIcon(jk1.getImage().getScaledInstance(panel.getBtnPostres().getWidth(), panel.getBtnPostres().getHeight(), Image.SCALE_DEFAULT));
                panel.getBtnPostres().setIcon(foprueba);
                panel.getBtnPostres().setSize(120, 120);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccionesCajaRegistradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void botonCafes() {

        Connection conexion = getConnection();

        try {

            PreparedStatement ps = conexion.prepareStatement(SQLBotonCafes);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {

                String nom = rs.getString("Nombre");
                Blob img = rs.getBlob("Imagenc");

                panel.getBtnCafes().setText(nom);

                byte[] imageData = null;
                imageData = img.getBytes(1, (int) img.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imageData));
                ImageIcon jk1 = new ImageIcon(imag);
                Icon foprueba= new ImageIcon(jk1.getImage().getScaledInstance(panel.getBtnCafes().getWidth(), panel.getBtnCafes().getHeight(), Image.SCALE_DEFAULT));
                panel.getBtnCafes().setIcon(foprueba);
                panel.getBtnCafes().setSize(120, 120);
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
