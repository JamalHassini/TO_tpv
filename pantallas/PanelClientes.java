/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.pantallas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import punto.de.venta.acciones.AccionesClientes;
import punto.de.venta.acciones.AccionesUsuarios;
import punto.de.venta.principal.PuntoDeVentaFrame;

/**
 * Clase con el panel de eliminar clientes.
 *
 * @author Jamal Hassini
 */
public class PanelClientes extends javax.swing.JPanel {

    private PuntoDeVentaFrame frame;
    private AccionesClientes acciones;
    private AccionesUsuarios acciones1;

    /**
     * Constructor del PanelEliminarClientes.
     *
     * @param frame PuntoDeVentaFrame ventana en la que se mostrará el panel.
     */
    public PanelClientes(PuntoDeVentaFrame frame) {

        acciones = new AccionesClientes(this);
        acciones1 = new AccionesUsuarios(this);
        this.frame = frame;
        frame.setTitle("Eliminar clientes");
        initComponents();
        acciones.consultaClientes();
    }
    
    public PanelClientes(){
        initComponents();
    }

    public void setFrame(PuntoDeVentaFrame frame) {
        this.frame = frame;
    }

    public void setAcciones(AccionesClientes acciones) {
        this.acciones = acciones;
    }

    public void setAcciones1(AccionesUsuarios acciones1) {
        this.acciones1 = acciones1;
    }

    public void setBtnEliminarCliente(JButton btnEliminarCliente) {
        this.btnEliminarCliente = btnEliminarCliente;
    }

    public static void setBtnGuardarCliente(JButton btnGuardarCliente) {
        PanelClientes.btnGuardarCliente = btnGuardarCliente;
    }

    public static void setBtnModificarCliente(JButton btnModificarCliente) {
        PanelClientes.btnModificarCliente = btnModificarCliente;
    }

    public static void setjScrollPane1(JScrollPane jScrollPane1) {
        PanelClientes.jScrollPane1 = jScrollPane1;
    }

    public static void setLblCorreo(JLabel lblCorreo) {
        PanelClientes.lblCorreo = lblCorreo;
    }

    public static void setLblEdad(JLabel lblEdad) {
        PanelClientes.lblEdad = lblEdad;
    }

    public static void setLblEliminarCliente(JLabel lblEliminarCliente) {
        PanelClientes.lblEliminarCliente = lblEliminarCliente;
    }

    public static void setLblIdCliente(JLabel lblIdCliente) {
        PanelClientes.lblIdCliente = lblIdCliente;
    }

    public static void setLblNombre(JLabel lblNombre) {
        PanelClientes.lblNombre = lblNombre;
    }

    public static void setLblTelefono(JLabel lblTelefono) {
        PanelClientes.lblTelefono = lblTelefono;
    }

    public static void setTblClientes(JTable tblClientes) {
        PanelClientes.tblClientes = tblClientes;
    }

    public static void setTxtCorreo(JTextField txtCorreo) {
        PanelClientes.txtCorreo = txtCorreo;
    }

    public static void setTxtEdad(JTextField txtEdad) {
        PanelClientes.txtEdad = txtEdad;
    }

    public static void setTxtIdCliente(JTextField txtIdCliente) {
        PanelClientes.txtIdCliente = txtIdCliente;
    }

    public static void setTxtNombre(JTextField txtNombre) {
        PanelClientes.txtNombre = txtNombre;
    }

    public static void setTxtTelefono(JTextField txtTelefono) {
        PanelClientes.txtTelefono = txtTelefono;
    }

    public PuntoDeVentaFrame getFrame() {
        return frame;
    }

    public AccionesClientes getAcciones() {
        return acciones;
    }

    public AccionesUsuarios getAcciones1() {
        return acciones1;
    }

    public static JButton getBtnGuardarCliente() {
        return btnGuardarCliente;
    }

    public static JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public static JLabel getLblCorreo() {
        return lblCorreo;
    }

    public static JLabel getLblEdad() {
        return lblEdad;
    }

    public static JLabel getLblEliminarCliente() {
        return lblEliminarCliente;
    }

    public static JLabel getLblIdCliente() {
        return lblIdCliente;
    }

    public static JLabel getLblNombre() {
        return lblNombre;
    }

    public static JLabel getLblTelefono() {
        return lblTelefono;
    }

    public JTable getTblClientes() {
        return tblClientes;
    }

    public JTextField getTxtIdCliente() {
        return txtIdCliente;
    }

    /**
     * Getter del campo de texto del nombre.
     *
     * @return JTextField txtNombre donde va el nombre del cliente a eliminar.
     */
    public JTextField getTxtNombre() {
        return txtNombre;
    }

    /**
     * Getter del campo de texto del telefono.
     *
     * @return JTextField txtTelefono donde va el numero de telefono.
     */
    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    /**
     * Getter del campo de texto de la edad.
     *
     * @return JTextField txtEdad donde va la edad.
     */
    public JTextField getTxtEdad() {
        return txtEdad;
    }

    /**
     * Getter del campo de texto del correo electronico.
     *
     * @return JTextField txtCorreo donde va el correo electronico.
     */
    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public static JButton getBtnEliminarCliente() {
        return btnEliminarCliente;
    }

    public JButton getBtnModificarCliente() {
        return btnModificarCliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnModificarCliente = new javax.swing.JButton();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblEliminarCliente = new javax.swing.JLabel();
        btnEliminarCliente = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        lblIdCliente = new javax.swing.JLabel();
        btnGuardarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 204));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setLayout(null);

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(51, 51, 0));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre y Apellidos");
        add(lblNombre);
        lblNombre.setBounds(20, 200, 237, 20);

        lblTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(51, 51, 0));
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefono.setText("Telefono");
        add(lblTelefono);
        lblTelefono.setBounds(20, 390, 230, 20);

        lblCorreo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(51, 51, 0));
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreo.setText("Correo Electronico");
        add(lblCorreo);
        lblCorreo.setBounds(20, 480, 237, 20);

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtNombre);
        txtNombre.setBounds(20, 230, 237, 30);

        txtTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtTelefono);
        txtTelefono.setBounds(50, 420, 170, 30);

        txtCorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtCorreo);
        txtCorreo.setBounds(20, 510, 237, 30);

        btnModificarCliente.setBackground(new java.awt.Color(102, 0, 102));
        btnModificarCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnModificarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarCliente.setText("Modificar Cliente");
        btnModificarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarClienteMouseClicked(evt);
            }
        });
        add(btnModificarCliente);
        btnModificarCliente.setBounds(530, 50, 190, 53);

        lblEdad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(51, 51, 0));
        lblEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEdad.setText("Edad");
        add(lblEdad);
        lblEdad.setBounds(20, 290, 230, 22);

        txtEdad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtEdad);
        txtEdad.setBounds(100, 320, 70, 32);

        lblEliminarCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEliminarCliente.setText("ELIMINAR CLIENTES");
        add(lblEliminarCliente);
        lblEliminarCliente.setBounds(10, 11, 204, 22);

        btnEliminarCliente.setBackground(new java.awt.Color(102, 0, 102));
        btnEliminarCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar cliente");
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarClienteMouseClicked(evt);
            }
        });
        add(btnEliminarCliente);
        btnEliminarCliente.setBounds(780, 50, 190, 53);

        txtIdCliente.setEditable(false);
        txtIdCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtIdCliente);
        txtIdCliente.setBounds(100, 140, 60, 30);

        lblIdCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblIdCliente.setText("Id");
        add(lblIdCliente);
        lblIdCliente.setBounds(60, 140, 40, 30);

        btnGuardarCliente.setBackground(new java.awt.Color(102, 0, 102));
        btnGuardarCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnGuardarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCliente.setText("Guardar Cliente");
        btnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarClienteMouseClicked(evt);
            }
        });
        add(btnGuardarCliente);
        btnGuardarCliente.setBounds(270, 50, 190, 53);

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 153));

        tblClientes.setBackground(new java.awt.Color(204, 204, 255));
        tblClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdCliente", "Nombre_Y_Apellidos", "Edad", "Telefono", "Correo_Electronico"
            }
        ));
        tblClientes.setGridColor(new java.awt.Color(0, 0, 0));
        tblClientes.setRowHeight(23);
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        add(jScrollPane1);
        jScrollPane1.setBounds(270, 120, 710, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarClienteMouseClicked
        // Metodo de la clase AccionesClientes que se encarga de mostrar clientes en los JTextField

        acciones.editaCliente();
        acciones.consultaClientes();
        //btnEliminarCliente.setVisible(false);
    }//GEN-LAST:event_btnModificarClienteMouseClicked

    private void btnEliminarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarClienteMouseClicked
        // Metodo de la clase AccionesClientes que se encarga de eliminar clientes
        acciones.eliminarCliente();
        acciones.consultaClientes();
    }//GEN-LAST:event_btnEliminarClienteMouseClicked

    private void btnGuardarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarClienteMouseClicked
        // TODO add your handling code here:
        acciones.guardarCliente();
        acciones.consultaClientes();
        //btnEliminarCliente.setVisible(true);
    }//GEN-LAST:event_btnGuardarClienteMouseClicked

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        // TODO add your handling code here:
        acciones.cargarTextField();

    }//GEN-LAST:event_tblClientesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnEliminarCliente;
    private static javax.swing.JButton btnGuardarCliente;
    public static javax.swing.JButton btnModificarCliente;
    private static javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel lblCorreo;
    private static javax.swing.JLabel lblEdad;
    private static javax.swing.JLabel lblEliminarCliente;
    private static javax.swing.JLabel lblIdCliente;
    private static javax.swing.JLabel lblNombre;
    private static javax.swing.JLabel lblTelefono;
    private static javax.swing.JTable tblClientes;
    private static javax.swing.JTextField txtCorreo;
    private static javax.swing.JTextField txtEdad;
    private static javax.swing.JTextField txtIdCliente;
    private static javax.swing.JTextField txtNombre;
    private static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
