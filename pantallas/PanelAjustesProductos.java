/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.pantallas;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import punto.de.venta.acciones.AccionesAjustesProductos;
import punto.de.venta.principal.PuntoDeVentaFrame;

/**
 *
 * @author Jamal Hassini
 */
public class PanelAjustesProductos extends javax.swing.JPanel {
    
    private PuntoDeVentaFrame frame;
    private AccionesAjustesProductos acciones;
    
    /**
     * Creates new form PanelListarStock
     * @param frame
     */
    public PanelAjustesProductos(PuntoDeVentaFrame frame) {
        
        acciones = new AccionesAjustesProductos(this);
        this.frame = frame;
        frame.setTitle("Ajustes categorias");
        initComponents();
        acciones.anchoCeldasC();
        acciones.anchoCeldasP();
        acciones.cargaComboProductosCategorias();
        acciones.listarCategorias();        
    }
    
     public JPanel getPnlProductos() {
        return pnlProductos;
    }
    
    public JTable getTblProductos() {
        return tblProductos;
    }
    
    public JTable getTblCategorias() {
        return tblCategorias;
    }
    
    public JComboBox getCmbProductosCategoria() {
        return cmbProductosCategoria;
    }
    public JLabel getLblImagenP() {
        
        return lblImagenP;
    }
    
    public JLabel getLblImagenC() {
        
        return lblImagenC;
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCategorias = new javax.swing.JPanel();
        btnNuevaC = new javax.swing.JButton();
        btnModificaC = new javax.swing.JButton();
        btnEliminaC = new javax.swing.JButton();
        lblImagenC = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCategorias = new javax.swing.JTable();
        btnListarC = new javax.swing.JButton();
        pnlProductos = new javax.swing.JPanel();
        cmbProductosCategoria = new javax.swing.JComboBox<>();
        btnNuevoProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblImagenP = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();

        setBackground(new java.awt.Color(153, 204, 255));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCategorias.setBackground(new java.awt.Color(0, 204, 102));
        pnlCategorias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorias", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        pnlCategorias.setLayout(null);

        btnNuevaC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNuevaC.setText("Nueva");
        btnNuevaC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevaCMouseClicked(evt);
            }
        });
        pnlCategorias.add(btnNuevaC);
        btnNuevaC.setBounds(20, 160, 100, 40);

        btnModificaC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnModificaC.setText("Modificar");
        btnModificaC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificaCMouseClicked(evt);
            }
        });
        pnlCategorias.add(btnModificaC);
        btnModificaC.setBounds(20, 100, 100, 40);

        btnEliminaC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminaC.setText("Eliminar");
        btnEliminaC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminaCMouseClicked(evt);
            }
        });
        pnlCategorias.add(btnEliminaC);
        btnEliminaC.setBounds(20, 220, 100, 40);

        lblImagenC.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblImagenC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlCategorias.add(lblImagenC);
        lblImagenC.setBounds(160, 70, 170, 160);

        tblCategorias.setBackground(new java.awt.Color(204, 255, 255));
        tblCategorias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Imagen"
            }
        ));
        tblCategorias.setRowHeight(23);
        tblCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCategorias);

        pnlCategorias.add(jScrollPane2);
        jScrollPane2.setBounds(370, 40, 570, 220);

        btnListarC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnListarC.setText("Listar");
        btnListarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCActionPerformed(evt);
            }
        });
        pnlCategorias.add(btnListarC);
        btnListarC.setBounds(20, 40, 100, 40);

        add(pnlCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 960, 280));

        pnlProductos.setBackground(new java.awt.Color(255, 153, 51));
        pnlProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        pnlProductos.setName("Productos"); // NOI18N
        pnlProductos.setPreferredSize(new java.awt.Dimension(573, 255));
        pnlProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbProductosCategoria.setEditable(true);
        cmbProductosCategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbProductosCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categorias" }));
        cmbProductosCategoria.setSelectedItem("Categorias");
        cmbProductosCategoria.setToolTipText("");
        cmbProductosCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductosCategoriaActionPerformed(evt);
            }
        });
        pnlProductos.add(cmbProductosCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 206, 39));

        btnNuevoProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNuevoProducto.setText("Nuevo");
        btnNuevoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoProductoMouseClicked(evt);
            }
        });
        pnlProductos.add(btnNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 40));

        btnModificarProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnModificarProducto.setText("Modificar");
        btnModificarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarProductoMouseClicked(evt);
            }
        });
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });
        pnlProductos.add(btnModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 40));

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        pnlProductos.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, 40));

        tblProductos.setBackground(new java.awt.Color(204, 255, 255));
        tblProductos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Precio", "Cant", "Imagen"
            }
        ));
        tblProductos.setRowHeight(23);
        tblProductos.setSurrendersFocusOnKeystroke(true);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        pnlProductos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 630, 240));

        lblImagenP.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblImagenP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlProductos.add(lblImagenP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 170, 150));
        pnlProductos.add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        add(pnlProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 960, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProductosCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductosCategoriaActionPerformed
        // TODO add your handling code here:
        acciones.consultaProductos();
    }//GEN-LAST:event_cmbProductosCategoriaActionPerformed

    private void btnListarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCActionPerformed
        // TODO add your handling code here:
       acciones.listarCategorias();
    }//GEN-LAST:event_btnListarCActionPerformed

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
        acciones.eliminarProducto();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminaCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaCMouseClicked
        // TODO add your handling code here:
        acciones.eliminarCategoria();
    }//GEN-LAST:event_btnEliminaCMouseClicked

    private void btnModificarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarProductoMouseClicked
        // TODO add your handling code here:        
    }//GEN-LAST:event_btnModificarProductoMouseClicked

    private void btnModificaCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificaCMouseClicked
        // TODO add your handling code here:
        PanelModificaCategoria pnlnp= new PanelModificaCategoria();
        pnlnp.setLocationRelativeTo(null);
        pnlnp.setVisible(true);
        
        //dispose();
    }//GEN-LAST:event_btnModificaCMouseClicked

    private void btnNuevaCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaCMouseClicked
        // TODO add your handling code here:
        PanelNuevaCategoria pnlnc1= new PanelNuevaCategoria();
        pnlnc1.setLocationRelativeTo(null);
        pnlnc1.setVisible(true);
        
    }//GEN-LAST:event_btnNuevaCMouseClicked

    private void btnNuevoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoProductoMouseClicked
        // TODO add your handling code here:
        PanelNuevoProducto pnlnp= new PanelNuevoProducto();
        pnlnp.setLocationRelativeTo(null);
        pnlnp.setVisible(true);
    }//GEN-LAST:event_btnNuevoProductoMouseClicked

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
            // TODO add your handling code here:
            acciones.imagenProducto();
        
    }//GEN-LAST:event_tblProductosMouseClicked

    private void tblCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriasMouseClicked
            // TODO add your handling code here:
            acciones.imagenCategoria();
        
    }//GEN-LAST:event_tblCategoriasMouseClicked

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        // TODO add your handling code here:
        
        PanelModificaProducto pnlnp= new PanelModificaProducto();
        pnlnp.setLocationRelativeTo(null);
        pnlnp.setVisible(true);
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminaC;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListarC;
    private javax.swing.JButton btnModificaC;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnNuevaC;
    private javax.swing.JButton btnNuevoProducto;
    private java.awt.Canvas canvas1;
    private javax.swing.JComboBox<String> cmbProductosCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImagenC;
    public static javax.swing.JLabel lblImagenP;
    private javax.swing.JPanel pnlCategorias;
    private javax.swing.JPanel pnlProductos;
    public static javax.swing.JTable tblCategorias;
    public static javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
