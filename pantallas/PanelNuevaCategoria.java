/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.pantallas;

import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import punto.de.venta.acciones.AccionesAjustesProductos;

/**
 *
 * @author Usuario1
 */
public class PanelNuevaCategoria extends javax.swing.JFrame {

    //private PanelAjustesProductos panel2;
    private AccionesAjustesProductos acciones;

    /**
     * Creates new form PanelNuevaCategoria
     */
    public PanelNuevaCategoria() {
        acciones = new AccionesAjustesProductos(this);
        this.setTitle("Nueva Categoria");
        //this.setDefaultCloseOperation(PanelNuevaCategoria.DISPOSE_ON_CLOSE);
        initComponents();
        
    }

    public JTextField getTxtNuevaCategoria() {
        return txtNuevaCategoria;
    }

    
    public JLabel getLblNuevaImagenC(){
        
        return lblNuevaImagenC;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNuevaCategoria = new javax.swing.JPanel();
        lblNuevaCategoria = new javax.swing.JLabel();
        btnGuardarNuevaCategoria = new javax.swing.JButton();
        txtNuevaCategoria = new javax.swing.JTextField();
        lblNuevaImagenC = new javax.swing.JLabel();
        btnBuscarImagenC = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlNuevaCategoria.setBackground(new java.awt.Color(51, 204, 0));
        pnlNuevaCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNuevaCategoria.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblNuevaCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuevaCategoria.setText("Nueva categoria");
        pnlNuevaCategoria.add(lblNuevaCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 36));

        btnGuardarNuevaCategoria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnGuardarNuevaCategoria.setText("Guardar");
        btnGuardarNuevaCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarNuevaCategoriaMouseClicked(evt);
            }
        });
        pnlNuevaCategoria.add(btnGuardarNuevaCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 178, 165, 53));

        txtNuevaCategoria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pnlNuevaCategoria.add(txtNuevaCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 104, 270, 41));

        lblNuevaImagenC.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblNuevaImagenC.setForeground(new java.awt.Color(204, 204, 204));
        lblNuevaImagenC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuevaImagenC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlNuevaCategoria.add(lblNuevaImagenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 190, 180));

        btnBuscarImagenC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscarImagenC.setText("BUSCAR IMAGEN");
        btnBuscarImagenC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarImagenCMouseClicked(evt);
            }
        });
        pnlNuevaCategoria.add(btnBuscarImagenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, 50));

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        pnlNuevaCategoria.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 253, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarNuevaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarNuevaCategoriaMouseClicked
        // TODO add your handling code here:
        acciones.nuevaCategoria();

        dispose();
    }//GEN-LAST:event_btnGuardarNuevaCategoriaMouseClicked

    private void btnBuscarImagenCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarImagenCMouseClicked
        // TODO add your handling code here:
        
        acciones.modificaImagenCategoriaN();
        
    }//GEN-LAST:event_btnBuscarImagenCMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarImagenC;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarNuevaCategoria;
    private javax.swing.JLabel lblNuevaCategoria;
    private javax.swing.JLabel lblNuevaImagenC;
    private javax.swing.JPanel pnlNuevaCategoria;
    private javax.swing.JTextField txtNuevaCategoria;
    // End of variables declaration//GEN-END:variables
}
