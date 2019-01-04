/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.pantallas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import punto.de.venta.acciones.AccionesCajaRegistradora;
import punto.de.venta.acciones.AccionesUsuarios;
import punto.de.venta.principal.PuntoDeVentaFrame;

/**
 * Clase con la pantalla de la caja registradora
 *
 * @author Jamal Hassini
 */
public class PantallaCajaRegistradora extends javax.swing.JPanel {

    private PuntoDeVentaFrame frame;
    private AccionesCajaRegistradora acciones;
    public AccionesUsuarios accione;

    /**
     * Constructor de la pantallaCajaRegistradora
     *
     * @param frame PuntoDeVentaFrame ventana en la que se mostrará la pantalla
     */
    public PantallaCajaRegistradora(PuntoDeVentaFrame frame) {

        acciones = new AccionesCajaRegistradora(this);
        accione = new AccionesUsuarios(this);
        this.frame = frame;
        frame.setTitle("Caja registradora");
        initComponents();

        acciones.fecha();// Metodo de la clase accionesCajaRegistradora que muestra la fecha en el JTextField txtFecha
        acciones.hora(); // Metodo de la clase accionesCajaRegistradora que muestra la hora en el JTextField txtHora
        acciones.ajustarCeldas();// Metodo de la clase accionesCajaRegistradora que ajusta el encabezado y las celdas de la tblSumaPedidos
        acciones.devuelveClientes();// Metodo de la clase accionesCajaRegistradora que carga los clientes en el JCombobox cmbClientes
        acciones.ultimasession();
        acciones.getIdVentas();// Metodo de la clase accionesCajaRegistradora que muestra el id del nuevo pedido a hacer en el JTextField txtCodPedido
        acciones.comboCantidad(); // Metodo de la clase accionesCajaRegistradora que muestra el JComboBox en la columna cantidad
        acciones.calculaSubtotal();// Metodo de la clase accionesCajaRegistradora que calcula la columna subtotal de cada fila
        acciones.sumaTotal();// Metodo de la clase accionesCajaRegistradora que calcula la suma los valores de la columna subtotal de la tabla tblSumaPedidos
        acciones.botonBebidas();
        acciones.botonEntrantes();
        acciones.botonHamburguesas();
        acciones.botonComplimentos();
        acciones.botonPostres();
        acciones.botonCafes();
        
        PanelBebidas panelBebidas = new PanelBebidas(this);
        pnlProductos.add(panelBebidas, java.awt.BorderLayout.CENTER);
        pnlProductos.repaint();
        
    }

    public PantallaCajaRegistradora() {
        
        initComponents();
        
    }

    /**
     *
     * @return
     */
    public static JLabel getLblOperario() {
        return lblOperario;
    }

    public JTable getTblSumaPedidos() {
        return tblSumaPedidos;
    }

    public JButton getBtnEntrantes() {

        return btnEntrantes;
    }

    public JButton getBtnBebidas() {
        return btnBebidas;
    }

    public JButton getBtnHamburguesas() {
        return btnHamburguesas;
    }

    public JButton getBtnPostres() {
        return btnPostres;
    }

    public JButton getBtnCafes() {
        return btnCafes;
    }

    public JButton getBtnComplimentos() {
        return btnComplimentos;
    }

    /**
     * Getter del combobox de clientes.
     *
     * @return JComboBox cmbClientes donde se pueden seleccionar clientes.
     */
    public JComboBox getCmbClientes() {
        return cmbClientes;
    }

    /**
     * Getter del campo de texto del total.
     *
     * @return JTextField txtTotal donde va el total de la suma de la columna
     * subtotal.
     */
    public JTextField getTxtTotal() {
        return txtTotal;
    }

    /**
     * Getter del campo de texto del cambio.
     *
     * @return JTextField txtCambio donde va el cambio a devolver.
     */
    public JTextField getTxtCambio() {
        return txtCambio;
    }

    /**
     * Getter del campo de texto de la fecha.
     *
     * @return JTextField txtFecha donde se muestra la fecha.
     */
    public JTextField getTxtFecha() {
        return txtFecha;
    }

    /**
     * Getter del campo de texto de la hora.
     *
     * @return JTextField txtFecha donde se muestra la hora.
     */
    public JTextField getTxtHora() {
        return txtHora;
    }

    /**
     * Getter del campo de texto pagado.
     *
     * @return JTextField txtFecha donde va la suma entregada.
     */
    public JTextField getTxtPagado() {
        return txtPagado;
    }

    /**
     * Getter del campo de texto cod pedido.
     *
     * @return JTextField txtFecha donde se muestra el numero del pedido a
     * hacer.
     */
    public JTextField getTxtCodPedido() {
        return txtCodPedido;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodPedidotxt = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblNomCliente = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        pnlPedidos = new javax.swing.JPanel();
        pnlSumaPedidos = new javax.swing.JScrollPane();
        tblSumaPedidos = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnDescartar = new javax.swing.JButton();
        btnPedir = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        lblPagado = new javax.swing.JLabel();
        lblCambio = new javax.swing.JLabel();
        txtPagado = new javax.swing.JTextField();
        txtCambio = new javax.swing.JTextField();
        btnCambio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlProductos = new javax.swing.JPanel();
        pnlCategorias = new javax.swing.JPanel();
        btnEntrantes = new javax.swing.JButton();
        btnComplimentos = new javax.swing.JButton();
        btnPostres = new javax.swing.JButton();
        btnBebidas = new javax.swing.JButton();
        btnCafes = new javax.swing.JButton();
        btnHamburguesas = new javax.swing.JButton();
        txtCodPedido = new javax.swing.JTextField();
        cmbClientes = new javax.swing.JComboBox<>();
        lblOperario = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setName("panelCaja"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setLayout(null);

        lblCodPedidotxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCodPedidotxt.setText("Pedido Numero ");
        add(lblCodPedidotxt);
        lblCodPedidotxt.setBounds(150, 0, 100, 20);

        lblFecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFecha.setText("Fecha");
        add(lblFecha);
        lblFecha.setBounds(290, 0, 50, 20);

        lblHora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblHora.setText("Hora");
        add(lblHora);
        lblHora.setBounds(450, 0, 40, 20);

        lblNomCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNomCliente.setText("Cliente");
        add(lblNomCliente);
        lblNomCliente.setBounds(560, 0, 90, 20);

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(51, 0, 102));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtFecha);
        txtFecha.setBounds(290, 20, 100, 23);

        txtHora.setEditable(false);
        txtHora.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtHora.setForeground(new java.awt.Color(51, 0, 102));
        txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora.setToolTipText("hora:minutos:segundos");
        add(txtHora);
        txtHora.setBounds(450, 20, 100, 23);

        pnlPedidos.setBackground(new java.awt.Color(255, 255, 204));
        pnlPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedidos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 102))); // NOI18N
        pnlPedidos.setName("Pedidos"); // NOI18N
        pnlPedidos.setLayout(null);

        pnlSumaPedidos.setBackground(new java.awt.Color(255, 204, 153));

        tblSumaPedidos.setBackground(new java.awt.Color(204, 204, 255));
        tblSumaPedidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblSumaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion", "Cant", "Precio", "Dto.", "SubTotal"
            }
        ));
        tblSumaPedidos.setCellSelectionEnabled(true);
        tblSumaPedidos.setGridColor(new java.awt.Color(102, 0, 102));
        tblSumaPedidos.setRowHeight(24);
        tblSumaPedidos.setRowMargin(2);
        pnlSumaPedidos.setViewportView(tblSumaPedidos);

        pnlPedidos.add(pnlSumaPedidos);
        pnlSumaPedidos.setBounds(10, 20, 520, 250);

        lblTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTotal.setText("Total");
        pnlPedidos.add(lblTotal);
        lblTotal.setBounds(350, 350, 50, 30);

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 51, 51));
        pnlPedidos.add(txtTotal);
        txtTotal.setBounds(390, 340, 120, 50);

        btnDescartar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDescartar.setForeground(new java.awt.Color(0, 0, 102));
        btnDescartar.setText("Descartar fila");
        btnDescartar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        pnlPedidos.add(btnDescartar);
        btnDescartar.setBounds(10, 280, 140, 40);

        btnPedir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPedir.setForeground(new java.awt.Color(0, 0, 102));
        btnPedir.setText("Guardar pedido");
        btnPedir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirActionPerformed(evt);
            }
        });
        pnlPedidos.add(btnPedir);
        btnPedir.setBounds(350, 280, 180, 40);

        btn3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn3.setMaximumSize(new java.awt.Dimension(39, 39));
        btn3.setMinimumSize(new java.awt.Dimension(39, 39));
        btn3.setPreferredSize(new java.awt.Dimension(39, 39));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        pnlPedidos.add(btn3);
        btn3.setBounds(170, 340, 70, 50);

        btn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn1.setMaximumSize(new java.awt.Dimension(39, 39));
        btn1.setMinimumSize(new java.awt.Dimension(39, 39));
        btn1.setPreferredSize(new java.awt.Dimension(39, 39));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        pnlPedidos.add(btn1);
        btn1.setBounds(10, 340, 70, 50);

        btn2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn2.setMaximumSize(new java.awt.Dimension(39, 39));
        btn2.setMinimumSize(new java.awt.Dimension(39, 39));
        btn2.setPreferredSize(new java.awt.Dimension(39, 39));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        pnlPedidos.add(btn2);
        btn2.setBounds(90, 340, 70, 50);

        btn4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn4.setMaximumSize(new java.awt.Dimension(39, 39));
        btn4.setMinimumSize(new java.awt.Dimension(39, 39));
        btn4.setPreferredSize(new java.awt.Dimension(39, 39));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        pnlPedidos.add(btn4);
        btn4.setBounds(10, 400, 70, 50);

        btn5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn5.setMaximumSize(new java.awt.Dimension(39, 39));
        btn5.setMinimumSize(new java.awt.Dimension(39, 39));
        btn5.setPreferredSize(new java.awt.Dimension(39, 39));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        pnlPedidos.add(btn5);
        btn5.setBounds(90, 400, 70, 50);

        btn6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn6.setMaximumSize(new java.awt.Dimension(39, 39));
        btn6.setMinimumSize(new java.awt.Dimension(39, 39));
        btn6.setPreferredSize(new java.awt.Dimension(39, 39));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        pnlPedidos.add(btn6);
        btn6.setBounds(170, 400, 70, 50);

        btn7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn7.setMaximumSize(new java.awt.Dimension(39, 39));
        btn7.setMinimumSize(new java.awt.Dimension(39, 39));
        btn7.setPreferredSize(new java.awt.Dimension(39, 39));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        pnlPedidos.add(btn7);
        btn7.setBounds(10, 460, 70, 50);

        btn8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn8.setMaximumSize(new java.awt.Dimension(39, 39));
        btn8.setMinimumSize(new java.awt.Dimension(39, 39));
        btn8.setPreferredSize(new java.awt.Dimension(39, 39));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        pnlPedidos.add(btn8);
        btn8.setBounds(90, 460, 70, 50);

        btn9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn9.setMaximumSize(new java.awt.Dimension(39, 39));
        btn9.setMinimumSize(new java.awt.Dimension(39, 39));
        btn9.setPreferredSize(new java.awt.Dimension(39, 39));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        pnlPedidos.add(btn9);
        btn9.setBounds(170, 460, 70, 50);

        btnC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnC.setText("c");
        btnC.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnC.setMaximumSize(new java.awt.Dimension(39, 39));
        btnC.setMinimumSize(new java.awt.Dimension(39, 39));
        btnC.setPreferredSize(new java.awt.Dimension(39, 39));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        pnlPedidos.add(btnC);
        btnC.setBounds(10, 520, 70, 50);

        btn0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn0.setMaximumSize(new java.awt.Dimension(39, 39));
        btn0.setMinimumSize(new java.awt.Dimension(39, 39));
        btn0.setPreferredSize(new java.awt.Dimension(39, 39));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        pnlPedidos.add(btn0);
        btn0.setBounds(90, 520, 70, 50);

        btnPunto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPunto.setText(".");
        btnPunto.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnPunto.setMaximumSize(new java.awt.Dimension(39, 39));
        btnPunto.setMinimumSize(new java.awt.Dimension(39, 39));
        btnPunto.setPreferredSize(new java.awt.Dimension(39, 39));
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        pnlPedidos.add(btnPunto);
        btnPunto.setBounds(170, 520, 70, 50);

        lblPagado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPagado.setText("Pagado");
        pnlPedidos.add(lblPagado);
        lblPagado.setBounds(350, 420, 60, 30);

        lblCambio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCambio.setText("Cambio");
        pnlPedidos.add(lblCambio);
        lblCambio.setBounds(350, 530, 80, 40);

        txtPagado.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pnlPedidos.add(txtPagado);
        txtPagado.setBounds(410, 410, 100, 40);

        txtCambio.setEditable(false);
        txtCambio.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pnlPedidos.add(txtCambio);
        txtCambio.setBounds(410, 520, 100, 40);

        btnCambio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCambio.setForeground(new java.awt.Color(0, 0, 102));
        btnCambio.setText("Calcular cambio");
        btnCambio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioActionPerformed(evt);
            }
        });
        pnlPedidos.add(btnCambio);
        btnCambio.setBounds(360, 460, 170, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("€");
        pnlPedidos.add(jLabel1);
        jLabel1.setBounds(520, 520, 10, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("€");
        pnlPedidos.add(jLabel2);
        jLabel2.setBounds(520, 350, 10, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("€");
        pnlPedidos.add(jLabel3);
        jLabel3.setBounds(520, 410, 10, 30);

        add(pnlPedidos);
        pnlPedidos.setBounds(10, 60, 540, 580);

        pnlProductos.setBackground(new java.awt.Color(255, 204, 204));
        pnlProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        pnlProductos.setAlignmentX(0.1F);
        pnlProductos.setAlignmentY(0.1F);
        pnlProductos.setLayout(null);
        add(pnlProductos);
        pnlProductos.setBounds(560, 60, 430, 300);

        pnlCategorias.setBackground(new java.awt.Color(153, 204, 255));
        pnlCategorias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorias", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N
        pnlCategorias.setName(""); // NOI18N
        pnlCategorias.setLayout(null);

        btnEntrantes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEntrantes.setBorder(null);
        btnEntrantes.setBorderPainted(false);
        btnEntrantes.setContentAreaFilled(false);
        btnEntrantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntrantes.setIconTextGap(5);
        btnEntrantes.setPreferredSize(new java.awt.Dimension(120, 120));
        btnEntrantes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEntrantes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEntrantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrantesMouseClicked(evt);
            }
        });
        pnlCategorias.add(btnEntrantes);
        btnEntrantes.setBounds(150, 20, 130, 120);

        btnComplimentos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnComplimentos.setBorder(null);
        btnComplimentos.setBorderPainted(false);
        btnComplimentos.setContentAreaFilled(false);
        btnComplimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComplimentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComplimentos.setIconTextGap(5);
        btnComplimentos.setPreferredSize(new java.awt.Dimension(120, 120));
        btnComplimentos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnComplimentos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnComplimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComplimentosActionPerformed(evt);
            }
        });
        pnlCategorias.add(btnComplimentos);
        btnComplimentos.setBounds(10, 160, 130, 110);

        btnPostres.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPostres.setBorder(null);
        btnPostres.setBorderPainted(false);
        btnPostres.setContentAreaFilled(false);
        btnPostres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPostres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPostres.setIconTextGap(5);
        btnPostres.setPreferredSize(new java.awt.Dimension(120, 120));
        btnPostres.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnPostres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostresActionPerformed(evt);
            }
        });
        pnlCategorias.add(btnPostres);
        btnPostres.setBounds(150, 160, 130, 110);

        btnBebidas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBebidas.setBorder(null);
        btnBebidas.setContentAreaFilled(false);
        btnBebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBebidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBebidas.setIconTextGap(5);
        btnBebidas.setMaximumSize(new java.awt.Dimension(180, 180));
        btnBebidas.setMinimumSize(new java.awt.Dimension(80, 80));
        btnBebidas.setPreferredSize(new java.awt.Dimension(120, 120));
        btnBebidas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBebidas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });
        pnlCategorias.add(btnBebidas);
        btnBebidas.setBounds(10, 20, 130, 120);

        btnCafes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCafes.setBorder(null);
        btnCafes.setBorderPainted(false);
        btnCafes.setContentAreaFilled(false);
        btnCafes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCafes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCafes.setIconTextGap(5);
        btnCafes.setPreferredSize(new java.awt.Dimension(120, 120));
        btnCafes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCafes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCafes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafesActionPerformed(evt);
            }
        });
        pnlCategorias.add(btnCafes);
        btnCafes.setBounds(290, 160, 130, 110);

        btnHamburguesas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnHamburguesas.setBorder(null);
        btnHamburguesas.setBorderPainted(false);
        btnHamburguesas.setContentAreaFilled(false);
        btnHamburguesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHamburguesas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHamburguesas.setIconTextGap(5);
        btnHamburguesas.setPreferredSize(new java.awt.Dimension(120, 120));
        btnHamburguesas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnHamburguesas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHamburguesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHamburguesasMouseClicked(evt);
            }
        });
        pnlCategorias.add(btnHamburguesas);
        btnHamburguesas.setBounds(290, 20, 130, 120);

        add(pnlCategorias);
        pnlCategorias.setBounds(560, 360, 430, 280);

        txtCodPedido.setEditable(false);
        txtCodPedido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCodPedido.setForeground(new java.awt.Color(0, 0, 102));
        txtCodPedido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodPedido.setBorder(null);
        txtCodPedido.setPreferredSize(new java.awt.Dimension(6, 23));
        add(txtCodPedido);
        txtCodPedido.setBounds(150, 20, 90, 20);

        cmbClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(cmbClientes);
        cmbClientes.setBounds(560, 20, 320, 23);

        lblOperario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblOperario.setForeground(new java.awt.Color(153, 0, 153));
        lblOperario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOperario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario1\\Desktop\\Sin título.jpg")); // NOI18N
        lblOperario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblOperario.setAlignmentY(0.0F);
        lblOperario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblOperario);
        lblOperario.setBounds(10, 10, 130, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrantesMouseClicked
        // Este bloque muestra el panelEntrantes en el panelProductos de la pantallaCajaRegistradora 
        pnlProductos.removeAll();
        PanelEntrantes panelEntrantes = new PanelEntrantes(this);
        pnlProductos.add(panelEntrantes, java.awt.BorderLayout.CENTER);
        pnlProductos.repaint();
    }//GEN-LAST:event_btnEntrantesMouseClicked

    private void btnComplimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComplimentosActionPerformed
        // Este bloque muestra el PanelComplimentos en el panelProductos de la pantallaCajaRegistradora
        pnlProductos.removeAll();
        PanelComplimentos panelComplimentos = new PanelComplimentos(this);
        pnlProductos.add(panelComplimentos, java.awt.BorderLayout.CENTER);
        pnlProductos.repaint();
    }//GEN-LAST:event_btnComplimentosActionPerformed

    private void btnPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostresActionPerformed
        // Este bloque muestra el PanelPostres en el panelProductos de la pantallaCajaRegistradora
        pnlProductos.removeAll();
        PanelPostres panelPostres = new PanelPostres(this);
        pnlProductos.add(panelPostres, java.awt.BorderLayout.CENTER);
        pnlProductos.repaint();
    }//GEN-LAST:event_btnPostresActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
        // Este bloque muestra el PanelBebidas en el panelProductos de la pantallaCajaRegistradora

        pnlProductos.removeAll();
        PanelBebidas panelBebidas = new PanelBebidas(this);
        pnlProductos.add(panelBebidas, java.awt.BorderLayout.CENTER);
        pnlProductos.repaint();
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnCafesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafesActionPerformed
        // Este bloque muestra el PanelCafes en el panelProductos de la pantallaCajaRegistradora
        pnlProductos.removeAll();
        PanelCafes panelCafes = new PanelCafes(this);
        pnlProductos.add(panelCafes, java.awt.BorderLayout.CENTER);
        pnlProductos.repaint();
    }//GEN-LAST:event_btnCafesActionPerformed

    private void btnPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirActionPerformed
        // Metodo de la clase accionesCajaRegistradora que guarda los pedidos      
        acciones.guardarPedido();
        // Metodo de la clase accionesCajaRegistradora que guarda los detalles de los pedidos
        acciones.guardarDetalles();
        acciones.actualizaStock();
        //acciones.ultimasession();
    }//GEN-LAST:event_btnPedirActionPerformed

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed
        // Metodo de la clase accionesCajaRegistradora que resta una fila de la estructura de la tblSumaPedidos
        acciones.restarFila();
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
        // Metodo de la clase accionesCajaRegistradora que calcula el cambio a devolver
        acciones.calculaCambio();
    }//GEN-LAST:event_btnCambioActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        txtPagado.setText(txtPagado.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        txtPagado.setText(txtPagado.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        txtPagado.setText(txtPagado.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        txtPagado.setText(txtPagado.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        txtPagado.setText(txtPagado.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        txtPagado.setText(txtPagado.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        txtPagado.setText(txtPagado.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        txtPagado.setText(txtPagado.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        txtPagado.setText(txtPagado.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        txtPagado.setText(txtPagado.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        txtPagado.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        // TODO add your handling code here:
        txtPagado.setText(txtPagado.getText() + ".");
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnHamburguesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHamburguesasMouseClicked
        // TODO add your handling code here:
        pnlProductos.removeAll();
        PanelHamburguesas panelHamburguesas = new PanelHamburguesas(this);
        pnlProductos.add(panelHamburguesas, java.awt.BorderLayout.CENTER);
        pnlProductos.repaint();
    }//GEN-LAST:event_btnHamburguesasMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCafes;
    private javax.swing.JButton btnCambio;
    private javax.swing.JButton btnComplimentos;
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnEntrantes;
    private javax.swing.JButton btnHamburguesas;
    private javax.swing.JButton btnPedir;
    private javax.swing.JButton btnPostres;
    private javax.swing.JButton btnPunto;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblCodPedidotxt;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNomCliente;
    public static javax.swing.JLabel lblOperario;
    private javax.swing.JLabel lblPagado;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlCategorias;
    public static javax.swing.JPanel pnlPedidos;
    private javax.swing.JPanel pnlProductos;
    private javax.swing.JScrollPane pnlSumaPedidos;
    public static javax.swing.JTable tblSumaPedidos;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCodPedido;
    public javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtPagado;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
