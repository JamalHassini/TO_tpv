/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.pantallas;

import javax.swing.JButton;
import punto.de.venta.acciones.AccionesPostres;

/**
 * Clase con el panel de postres
 *
 * @author Jamal Hassini
 */
public class PanelPostres extends javax.swing.JPanel {

    public PantallaCajaRegistradora panel;
    private AccionesPostres acciones;

    /**
     * constructor del PanelPostres
     *
     * @param panel es el panel donde se mostraran los botones de postres
     */
    public PanelPostres(PantallaCajaRegistradora panel) {

        acciones = new AccionesPostres(this);
        this.panel = panel;
        setSize(400, 250);
        setLocation(10, 15);
        initComponents();
        
        acciones.botonCremaCatalana();
        acciones.botonHeladoChocolate();
        acciones.botonHeladoFresas();
        acciones.botonMacedonia();
        acciones.botonTartaArandanos();
        acciones.botonTartaChocolate();
    }
    
     public JButton getBtnTartaChocolate() {
        
        return btnTartaChocolate;
    }
    
    public JButton getBtnTartaArandanos() {
        
        return btnTartaArandanos;
    }
    
    public JButton getBtnMacedonia() {
        
        return btnMacedonia;
    }
    
    public JButton getBtnHeladoChocolate() {
        
        return btnHeladoChocolate;
    }
    
    public JButton getBtnHeladoFresas() {
        
        return btnHeladoFresas;
    }
    
    public JButton getBtnCremaCatalana() {
        
        return btnCremaCatalana;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTartaChocolate = new javax.swing.JButton();
        btnTartaArandanos = new javax.swing.JButton();
        btnHeladoChocolate = new javax.swing.JButton();
        btnHeladoFresas = new javax.swing.JButton();
        btnMacedonia = new javax.swing.JButton();
        btnCremaCatalana = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(null);

        btnTartaChocolate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTartaChocolate.setToolTipText("");
        btnTartaChocolate.setBorder(null);
        btnTartaChocolate.setBorderPainted(false);
        btnTartaChocolate.setContentAreaFilled(false);
        btnTartaChocolate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTartaChocolate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTartaChocolate.setIconTextGap(3);
        btnTartaChocolate.setPreferredSize(new java.awt.Dimension(90, 102));
        btnTartaChocolate.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnTartaChocolate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTartaChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTartaChocolateActionPerformed(evt);
            }
        });
        add(btnTartaChocolate);
        btnTartaChocolate.setBounds(20, 10, 110, 110);

        btnTartaArandanos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTartaArandanos.setToolTipText("");
        btnTartaArandanos.setBorder(null);
        btnTartaArandanos.setBorderPainted(false);
        btnTartaArandanos.setContentAreaFilled(false);
        btnTartaArandanos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTartaArandanos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTartaArandanos.setIconTextGap(3);
        btnTartaArandanos.setPreferredSize(new java.awt.Dimension(90, 102));
        btnTartaArandanos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnTartaArandanos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTartaArandanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTartaArandanosActionPerformed(evt);
            }
        });
        add(btnTartaArandanos);
        btnTartaArandanos.setBounds(150, 10, 110, 110);

        btnHeladoChocolate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnHeladoChocolate.setToolTipText("");
        btnHeladoChocolate.setBorder(null);
        btnHeladoChocolate.setBorderPainted(false);
        btnHeladoChocolate.setContentAreaFilled(false);
        btnHeladoChocolate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHeladoChocolate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHeladoChocolate.setIconTextGap(3);
        btnHeladoChocolate.setPreferredSize(new java.awt.Dimension(90, 102));
        btnHeladoChocolate.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnHeladoChocolate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHeladoChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeladoChocolateActionPerformed(evt);
            }
        });
        add(btnHeladoChocolate);
        btnHeladoChocolate.setBounds(150, 140, 110, 110);

        btnHeladoFresas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnHeladoFresas.setToolTipText("");
        btnHeladoFresas.setBorder(null);
        btnHeladoFresas.setBorderPainted(false);
        btnHeladoFresas.setContentAreaFilled(false);
        btnHeladoFresas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHeladoFresas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHeladoFresas.setIconTextGap(3);
        btnHeladoFresas.setPreferredSize(new java.awt.Dimension(90, 102));
        btnHeladoFresas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnHeladoFresas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHeladoFresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeladoFresasActionPerformed(evt);
            }
        });
        add(btnHeladoFresas);
        btnHeladoFresas.setBounds(20, 140, 110, 110);

        btnMacedonia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMacedonia.setToolTipText("");
        btnMacedonia.setBorder(null);
        btnMacedonia.setBorderPainted(false);
        btnMacedonia.setContentAreaFilled(false);
        btnMacedonia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMacedonia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMacedonia.setIconTextGap(3);
        btnMacedonia.setPreferredSize(new java.awt.Dimension(90, 102));
        btnMacedonia.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMacedonia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMacedonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMacedoniaActionPerformed(evt);
            }
        });
        add(btnMacedonia);
        btnMacedonia.setBounds(280, 140, 110, 110);

        btnCremaCatalana.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCremaCatalana.setToolTipText("");
        btnCremaCatalana.setBorder(null);
        btnCremaCatalana.setBorderPainted(false);
        btnCremaCatalana.setContentAreaFilled(false);
        btnCremaCatalana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCremaCatalana.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCremaCatalana.setIconTextGap(3);
        btnCremaCatalana.setPreferredSize(new java.awt.Dimension(90, 102));
        btnCremaCatalana.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCremaCatalana.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCremaCatalana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCremaCatalanaActionPerformed(evt);
            }
        });
        add(btnCremaCatalana);
        btnCremaCatalana.setBounds(280, 10, 110, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTartaChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTartaChocolateActionPerformed
        // Metodo de la clase AccionesPostres que muestra tarta de chocolate en la tabla pedidos
        acciones.devolverTartaChocolate();
    }//GEN-LAST:event_btnTartaChocolateActionPerformed

    private void btnTartaArandanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTartaArandanosActionPerformed
        // Metodo de la clase AccionesPostres que muestra tarta de arandanos en la tabla pedidos
        acciones.devolverTartaArandanos();
    }//GEN-LAST:event_btnTartaArandanosActionPerformed

    private void btnCremaCatalanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCremaCatalanaActionPerformed
        // Metodo de la clase AccionesPostres que muestra la crema catalana en la tabla pedidos
        acciones.devolverCremaCatalana();
    }//GEN-LAST:event_btnCremaCatalanaActionPerformed

    private void btnHeladoFresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeladoFresasActionPerformed
        // Metodo de la clase AccionesPostres que muestra helado de fresas en la tabla pedidos
        acciones.devolverHeladoFresas();
    }//GEN-LAST:event_btnHeladoFresasActionPerformed

    private void btnHeladoChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeladoChocolateActionPerformed
        // Metodo de la clase AccionesPostres que muestra helado de chocolate en la tabla pedidos
        acciones.devolverHeladoChocolate();
    }//GEN-LAST:event_btnHeladoChocolateActionPerformed

    private void btnMacedoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMacedoniaActionPerformed
        // Metodo de la clase AccionesPostres que muestra la macedonia en la tabla pedidos
        acciones.devolverMacedonia();
    }//GEN-LAST:event_btnMacedoniaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCremaCatalana;
    private javax.swing.JButton btnHeladoChocolate;
    private javax.swing.JButton btnHeladoFresas;
    private javax.swing.JButton btnMacedonia;
    private javax.swing.JButton btnTartaArandanos;
    private javax.swing.JButton btnTartaChocolate;
    // End of variables declaration//GEN-END:variables
}
