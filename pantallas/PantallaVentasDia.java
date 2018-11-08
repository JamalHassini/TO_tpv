
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.pantallas;

import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import javax.swing.JTextField;
import punto.de.venta.acciones.AccionesVentasDia;
import punto.de.venta.principal.PuntoDeVentaFrame;

/**
 * Calse con la pantallaVentasDia
 *
 * @author Jamal Hassini
 */
public class PantallaVentasDia extends javax.swing.JPanel {

    private PuntoDeVentaFrame frame;
    private AccionesVentasDia acciones;

    /**
     * Constructor de la PantallaVentasDia
     *
     * @param frame PuntoDeVentaFrame ventana en la que se mostrará la pantalla
     */
    public PantallaVentasDia(PuntoDeVentaFrame frame) {

        acciones = new AccionesVentasDia(this);
        this.frame = frame;
        frame.setTitle("Ventas del día");
        initComponents();
        acciones.ajustarCeldas();
    }

    /**
     * Getter de la tabla ventas del día.
     *
     * @return JTable tblVentasDia donde se muestran las ventas por día.
     */
    public JTable getTblVentasDia() {
        return tblVentasDia;

    }

    /**
     * Getter del calendario
     *
     * @return JDateChooser dtChooser para poder seleccionar fecha
     */
    public JDateChooser getDtChooserf() {
        return dtChooserf;
    }
    
    public JDateChooser getDtChooser1() {
        return dtChooser1;
    }
    /**
     * Getter del campo de texto total de ventas
     *
     * @return JTextField txtTotalVentas donde se suma el total de ventas del
     * dia seleccionado
     */
    public JTextField getTxtTotalVentas() {
        return txtTotalVentas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentasDia = new javax.swing.JTable();
        lblVentas = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        lblTotalVentas = new javax.swing.JLabel();
        dtChooserf = new com.toedter.calendar.JDateChooser();
        txtTotalVentas = new javax.swing.JTextField();
        dtChooser1 = new com.toedter.calendar.JDateChooser();
        lblHasta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setLayout(null);

        tblVentasDia.setBackground(new java.awt.Color(204, 204, 255));
        tblVentasDia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblVentasDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Nombre_Y_Apellidos", "IdVentas", "Total"
            }
        ));
        tblVentasDia.setRowHeight(24);
        tblVentasDia.setRowMargin(2);
        jScrollPane1.setViewportView(tblVentasDia);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 150, 910, 400);

        lblVentas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblVentas.setText("Ventas entre fechas");
        lblVentas.setIconTextGap(14);
        add(lblVentas);
        lblVentas.setBounds(360, 10, 270, 50);

        lblFecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFecha.setText("Desde");
        add(lblFecha);
        lblFecha.setBounds(40, 100, 50, 30);

        btnConsultar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMouseClicked(evt);
            }
        });
        add(btnConsultar);
        btnConsultar.setBounds(830, 100, 110, 30);

        lblTotalVentas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTotalVentas.setText("Total ventas");
        add(lblTotalVentas);
        lblTotalVentas.setBounds(780, 590, 100, 30);

        dtChooserf.setBackground(new java.awt.Color(153, 153, 255));
        dtChooserf.setDateFormatString("dd-MM-yyyy");
        dtChooserf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(dtChooserf);
        dtChooserf.setBounds(470, 100, 200, 30);

        txtTotalVentas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtTotalVentas);
        txtTotalVentas.setBounds(870, 590, 80, 30);

        dtChooser1.setBackground(new java.awt.Color(153, 153, 255));
        dtChooser1.setDateFormatString("dd-MM-yyyy");
        dtChooser1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(dtChooser1);
        dtChooser1.setBounds(100, 100, 210, 30);

        lblHasta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblHasta.setText("Hasta");
        add(lblHasta);
        lblHasta.setBounds(420, 100, 60, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseClicked
        // Metodo de la clase accionesVentasDia que devuelve las ventas por dia en la tabla tblVentasDia 
        acciones.consultaVentas();
        // Metodo de la clase accionesVentasDia que suma los valores de la columna total de tblVentasDia y lo muestra en el txtTotalVentas
        acciones.sumaVentas();
    }//GEN-LAST:event_btnConsultarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private com.toedter.calendar.JDateChooser dtChooser1;
    private com.toedter.calendar.JDateChooser dtChooserf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JLabel lblTotalVentas;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JTable tblVentasDia;
    private javax.swing.JTextField txtTotalVentas;
    // End of variables declaration//GEN-END:variables

}
