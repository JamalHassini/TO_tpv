/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.pantallas;

import javax.swing.JTable;
import punto.de.venta.acciones.AccionesStock;
import punto.de.venta.principal.PuntoDeVentaFrame;

/**
 *
 * @author Usuario1
 */
public class PanelStock extends javax.swing.JFrame {
    
    //private PuntoDeVentaFrame frame;
    private AccionesStock acciones;

    public PanelStock() {

        acciones = new AccionesStock(this);
        
        //this.frame = frame;
        //frame.setTitle("Stock");
        initComponents();
        acciones.listarBebidas();
        acciones.listarCafes();
        acciones.listarComplimentos();
        acciones.listarEntrantes();
        acciones.listarHamburguesas();
        acciones.listarPostres();
    }
    
    /**
     * Creates new form PanelStock
     */
//    public PanelStock() {
//        initComponents();
//    }

    public void setTblBebidas(JTable tblBebidas) {
        this.tblBebidas = tblBebidas;
    }

    public void setTblCafes(JTable tblCafes) {
        this.tblCafes = tblCafes;
    }

    public void setTblComplimentos(JTable tblComplimentos) {
        this.tblComplimentos = tblComplimentos;
    }

    public void setTblEntrantes(JTable tblEntrantes) {
        this.tblEntrantes = tblEntrantes;
    }

    public void setTblHamburguesas(JTable tblHamburguesas) {
        this.tblHamburguesas = tblHamburguesas;
    }

    public void setTblPostres(JTable tblPostres) {
        this.tblPostres = tblPostres;
    }

    

    public JTable getTblBebidas() {
        return tblBebidas;
    }

    public JTable getTblCafes() {
        return tblCafes;
    }

    public JTable getTblComplimentos() {
        return tblComplimentos;
    }

    public JTable getTblEntrantes() {
        return tblEntrantes;
    }

    public JTable getTblHamburguesas() {
        return tblHamburguesas;
    }

    public JTable getTblPostres() {
        return tblPostres;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEstadoStock = new javax.swing.JLabel();
        pnlTablas = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblEntrantes = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblBebidas = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblHamburguesas = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblComplimentos = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblCafes = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblPostres = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        lblEstadoStock.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEstadoStock.setText("ESTADO DEL STOCK");

        pnlTablas.setBackground(new java.awt.Color(153, 255, 153));

        tblEntrantes.setBackground(new java.awt.Color(204, 204, 255));
        tblEntrantes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblEntrantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPCION", "CANTIDAD"
            }
        ));
        jScrollPane6.setViewportView(tblEntrantes);

        tblBebidas.setBackground(new java.awt.Color(204, 204, 255));
        tblBebidas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPCION", "CANTIDAD"
            }
        ));
        jScrollPane7.setViewportView(tblBebidas);

        tblHamburguesas.setBackground(new java.awt.Color(204, 204, 255));
        tblHamburguesas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblHamburguesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPCION", "CANTIDAD"
            }
        ));
        jScrollPane8.setViewportView(tblHamburguesas);

        tblComplimentos.setBackground(new java.awt.Color(204, 204, 255));
        tblComplimentos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblComplimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPCION", "CANTIDAD"
            }
        ));
        jScrollPane9.setViewportView(tblComplimentos);

        tblCafes.setBackground(new java.awt.Color(204, 204, 255));
        tblCafes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblCafes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPCION", "CANTIDAD"
            }
        ));
        jScrollPane10.setViewportView(tblCafes);

        tblPostres.setBackground(new java.awt.Color(204, 204, 255));
        tblPostres.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblPostres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPCION", "CANTIDAD"
            }
        ));
        jScrollPane11.setViewportView(tblPostres);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText(" ENTRANTES");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText(" BEBIBDAS");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText(" HAMBURGUESAS");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText(" COMPLIMENTOS");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText(" CAFES");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText(" POSTRES");

        javax.swing.GroupLayout pnlTablasLayout = new javax.swing.GroupLayout(pnlTablas);
        pnlTablas.setLayout(pnlTablasLayout);
        pnlTablasLayout.setHorizontalGroup(
            pnlTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlTablasLayout.createSequentialGroup()
                        .addGroup(pnlTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTablasLayout.setVerticalGroup(
            pnlTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablasLayout.createSequentialGroup()
                .addGroup(pnlTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTablasLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnlTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnlTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(lblEstadoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEstadoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblEstadoStock;
    private javax.swing.JPanel pnlTablas;
    private javax.swing.JTable tblBebidas;
    private javax.swing.JTable tblCafes;
    private javax.swing.JTable tblComplimentos;
    private javax.swing.JTable tblEntrantes;
    private javax.swing.JTable tblHamburguesas;
    private javax.swing.JTable tblPostres;
    // End of variables declaration//GEN-END:variables
}