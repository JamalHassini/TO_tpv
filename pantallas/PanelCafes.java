/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.pantallas;

import javax.swing.JButton;
import punto.de.venta.acciones.AccionesCafes;

/**
 * Clase del panel de cafes
 *
 * @author Jamal Hassini
 */
public class PanelCafes extends javax.swing.JPanel {

    public PantallaCajaRegistradora panel;
    private AccionesCafes acciones;

    /**
     * constructor del panel de cafes
     *
     * @param panel es el panel donde se mostraran los botones de cafes
     */
    public PanelCafes(PantallaCajaRegistradora panel) {
        acciones = new AccionesCafes(this);
        this.panel = panel;
        setSize(400, 250);
        setLocation(10, 15);
        initComponents();
        
        acciones.botonCafeCortado();
        acciones.botonCafeConLeche();
        acciones.botonCafeSolo();
        acciones.botonCarajillos();
        acciones.botonManzanilla();
        acciones.botonTe();
    }
    
    
    public JButton getBtnCafeCortado() {
        
        return btnCafeCortado;
    }
    
    public JButton getBtnTe() {
        
        return btnTe;
    }
    
    public JButton getBtnManzanilla() {
        
        return btnManzanilla;
    }
    
    public JButton getBtnCarajillos() {
        
        return btnCarajillos;
    }
    
    public JButton getBtnCafeSolo() {
        
        return btnCafeSolo;
    }
    
    public JButton getBtnCafeConLeche() {
        
        return btnCafeConLeche;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTe = new javax.swing.JButton();
        btnCafeCortado = new javax.swing.JButton();
        btnCafeSolo = new javax.swing.JButton();
        btnCafeConLeche = new javax.swing.JButton();
        btnManzanilla = new javax.swing.JButton();
        btnCarajillos = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setMinimumSize(new java.awt.Dimension(280, 195));
        setLayout(null);

        btnTe.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTe.setToolTipText("");
        btnTe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTe.setBorderPainted(false);
        btnTe.setContentAreaFilled(false);
        btnTe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTe.setIconTextGap(5);
        btnTe.setPreferredSize(new java.awt.Dimension(100, 100));
        btnTe.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnTe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeActionPerformed(evt);
            }
        });
        add(btnTe);
        btnTe.setBounds(150, 140, 110, 110);

        btnCafeCortado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCafeCortado.setToolTipText("");
        btnCafeCortado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCafeCortado.setBorderPainted(false);
        btnCafeCortado.setContentAreaFilled(false);
        btnCafeCortado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCafeCortado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCafeCortado.setIconTextGap(5);
        btnCafeCortado.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCafeCortado.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCafeCortado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCafeCortado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafeCortadoActionPerformed(evt);
            }
        });
        add(btnCafeCortado);
        btnCafeCortado.setBounds(10, 10, 110, 110);

        btnCafeSolo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCafeSolo.setToolTipText("");
        btnCafeSolo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCafeSolo.setBorderPainted(false);
        btnCafeSolo.setContentAreaFilled(false);
        btnCafeSolo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCafeSolo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCafeSolo.setIconTextGap(5);
        btnCafeSolo.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCafeSolo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCafeSolo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCafeSolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafeSoloActionPerformed(evt);
            }
        });
        add(btnCafeSolo);
        btnCafeSolo.setBounds(150, 10, 110, 110);

        btnCafeConLeche.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCafeConLeche.setToolTipText("");
        btnCafeConLeche.setBorder(new javax.swing.border.MatteBorder(null));
        btnCafeConLeche.setBorderPainted(false);
        btnCafeConLeche.setContentAreaFilled(false);
        btnCafeConLeche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCafeConLeche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCafeConLeche.setIconTextGap(5);
        btnCafeConLeche.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCafeConLeche.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCafeConLeche.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCafeConLeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafeConLecheActionPerformed(evt);
            }
        });
        add(btnCafeConLeche);
        btnCafeConLeche.setBounds(290, 140, 110, 110);

        btnManzanilla.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnManzanilla.setToolTipText("");
        btnManzanilla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManzanilla.setBorderPainted(false);
        btnManzanilla.setContentAreaFilled(false);
        btnManzanilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManzanilla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnManzanilla.setIconTextGap(5);
        btnManzanilla.setPreferredSize(new java.awt.Dimension(100, 100));
        btnManzanilla.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnManzanilla.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnManzanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManzanillaActionPerformed(evt);
            }
        });
        add(btnManzanilla);
        btnManzanilla.setBounds(10, 140, 110, 110);

        btnCarajillos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCarajillos.setToolTipText("");
        btnCarajillos.setBorder(new javax.swing.border.MatteBorder(null));
        btnCarajillos.setBorderPainted(false);
        btnCarajillos.setContentAreaFilled(false);
        btnCarajillos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarajillos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCarajillos.setIconTextGap(5);
        btnCarajillos.setPreferredSize(new java.awt.Dimension(100, 100));
        btnCarajillos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCarajillos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCarajillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarajillosActionPerformed(evt);
            }
        });
        add(btnCarajillos);
        btnCarajillos.setBounds(290, 10, 110, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCafeCortadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafeCortadoActionPerformed
        // Metodo de la clase AccionesCafes que muestra cafe cortado en la tabla pedidos
        acciones.devolverCortado();
    }//GEN-LAST:event_btnCafeCortadoActionPerformed

    private void btnCafeSoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafeSoloActionPerformed
        // Metodo de la clase AccionesCafes que muestra cafe solo en la tabla pedidos
        acciones.devolverSolo();
    }//GEN-LAST:event_btnCafeSoloActionPerformed

    private void btnCafeConLecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafeConLecheActionPerformed
        // Metodo de la clase AccionesCafes que muestra carajillo en la tabla pedidos
        acciones.devolverCafeConLeche();
    }//GEN-LAST:event_btnCafeConLecheActionPerformed

    private void btnManzanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManzanillaActionPerformed
        // Metodo de la clase AccionesCafes que muestra manzanilla en la tabla pedidos
        acciones.devolverManzanilla();
    }//GEN-LAST:event_btnManzanillaActionPerformed

    private void btnTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeActionPerformed
        // Metodo de la clase AccionesCafes que muestra te en la tabla pedidos
        acciones.devolverTe();
    }//GEN-LAST:event_btnTeActionPerformed

    private void btnCarajillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarajillosActionPerformed
        // TODO add your handling code here:
        acciones.devolverCarajillo();
    }//GEN-LAST:event_btnCarajillosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCafeConLeche;
    private javax.swing.JButton btnCafeCortado;
    private javax.swing.JButton btnCafeSolo;
    private javax.swing.JButton btnCarajillos;
    private javax.swing.JButton btnManzanilla;
    private javax.swing.JButton btnTe;
    // End of variables declaration//GEN-END:variables

}
