/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimiento;

import Clases.MyRenderer;
import Conectar.Conectar;
import Consultas.Consulta_Productos;
import static Movimiento.Consumos.jLabel_DNI;
import static Movimiento.Consumos.tabla_Consumos;
import static Movimiento.Datos_Consumo.jLabel_DNIhuesped;
import static Movimiento.Datos_Consumo.jLabel_nHabitacion;
import static Movimiento.Datos_Consumo.jTextField_ImporteConsumo;
import static Movimiento.Datos_Consumo.jtext_PorConcepto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.print.PrinterException;
import java.sql.*;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Clarisse_Naoemi-PC
 */
public class Movimiento_Huespedes extends javax.swing.JFrame {

    DefaultTableModel modelo_tablaConsumos = new DefaultTableModel();
    DefaultTableModel modelo_tablaFactura = new DefaultTableModel();
    DefaultTableModel modelo_tablaHuespedes = new DefaultTableModel();
    DefaultTableModel modelotablaDetalle = new DefaultTableModel();
    String importeH, fechaH, Concepto = " (A)=> ALOJAMIENTO";

    public Movimiento_Huespedes() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        Cabezera();
        AparienciaCabezera();
        cabezeraDialogoDetalle();
        CabezeraFactura();
        Mostrar();
        Inhabilitar();

        CabezeraDialogo();

        Fecha();
        jLabel_DNI111.setVisible(false);
        jLabel_IDHUESPEDS.setVisible(false);
        jLabel_COSTO_HABIT.setVisible(false);
        jLabel_CANTIDAD_DIAS.setVisible(false);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana_Consumos = new javax.swing.JDialog();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabelUsuarioHuesped = new javax.swing.JLabel();
        jLabel_NHabitacion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_DNI = new javax.swing.JLabel();
        BotonCerra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Consumos = new javax.swing.JTable();
        Boton_AgregarConsumo = new javax.swing.JButton();
        Boton_Actualizar_Consumos = new javax.swing.JButton();
        Ventana_AgregarConsumo = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        Boton_Cerrar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Boton_GuardarDatosConsumo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox_PorConcepto = new javax.swing.JComboBox<String>();
        jTextField_nºConsumo = new javax.swing.JTextField();
        jTextField_FechaEmision = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtext_PorConcepto = new javax.swing.JEditorPane();
        jLabel10 = new javax.swing.JLabel();
        jTextField_ImporteConsumo = new javax.swing.JTextField();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem_Modificar = new javax.swing.JMenuItem();
        jMenuItem_Eliminar = new javax.swing.JMenuItem();
        Ventana_DetalleHuespedes = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabelUsuarioHuesped1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel_DNI1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel_NHabitacion1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_detalleConsumos = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField_TotalPagar_Cliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Boton_GuardarVenta = new javax.swing.JButton();
        Boton_CerrrarD = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel_IDHUESPEDS = new javax.swing.JLabel();
        jLabel_COSTO_HABIT = new javax.swing.JLabel();
        jLabel_CANTIDAD_DIAS = new javax.swing.JLabel();
        jLabel_ID_HABITACION = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        Ventana_Factura = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField_Factura_NA_CLIENTE = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField_F_DNI_C = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        RUC_FACTURA = new javax.swing.JTextField();
        numero_factura = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_Factura = new javax.swing.JTable();
        jTextField_TotalPagar_Factura = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        Boton_ImprimirFact = new javax.swing.JButton();
        Boton_GuardarDatos = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel_IdHuespedes = new javax.swing.JLabel();
        jLabel_NUMERO_HABIT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_MovHuespedes = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        Boton_Consumos = new javax.swing.JButton();
        BotonDetalle = new javax.swing.JButton();
        Boton_Cerrar = new javax.swing.JButton();
        jLabel_DNI111 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelUsuarioHuesped.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel_NHabitacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Huesped :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("N° Habitacion :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("DNI :");

        jLabel_DNI.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsuarioHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_NHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelUsuarioHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_NHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jLabel4)
                .addComponent(jLabel_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BotonCerra.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BotonCerra.setText("Cerrar");
        BotonCerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerraActionPerformed(evt);
            }
        });

        tabla_Consumos.setBackground(new java.awt.Color(0, 255, 102));
        tabla_Consumos.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        tabla_Consumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº ", "Fecha", "Concepto De : ", "Descripcion", "Importe"
            }
        ));
        tabla_Consumos.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(tabla_Consumos);

        Boton_AgregarConsumo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Boton_AgregarConsumo.setText("Agregar");
        Boton_AgregarConsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_AgregarConsumoMouseClicked(evt);
            }
        });
        Boton_AgregarConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AgregarConsumoActionPerformed(evt);
            }
        });

        Boton_Actualizar_Consumos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Boton_Actualizar_Consumos.setText("Actualizar");
        Boton_Actualizar_Consumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Actualizar_ConsumosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ventana_ConsumosLayout = new javax.swing.GroupLayout(Ventana_Consumos.getContentPane());
        Ventana_Consumos.getContentPane().setLayout(Ventana_ConsumosLayout);
        Ventana_ConsumosLayout.setHorizontalGroup(
            Ventana_ConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Ventana_ConsumosLayout.createSequentialGroup()
                .addGroup(Ventana_ConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Ventana_ConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Ventana_ConsumosLayout.createSequentialGroup()
                            .addComponent(Boton_AgregarConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Boton_Actualizar_Consumos)
                            .addGap(415, 415, 415)
                            .addComponent(BotonCerra))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Ventana_ConsumosLayout.setVerticalGroup(
            Ventana_ConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventana_ConsumosLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(Ventana_ConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton_AgregarConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Ventana_ConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Boton_Actualizar_Consumos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotonCerra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Datos De Consumo");

        Boton_Cerrar1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Cerrar1.setText("Cerrar");
        Boton_Cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Cerrar1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Nº Consumo :");

        Boton_GuardarDatosConsumo.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_GuardarDatosConsumo.setText("Guardar");
        Boton_GuardarDatosConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarDatosConsumoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Fecha Emision :");

        jComboBox_PorConcepto.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jComboBox_PorConcepto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccionar>", "Productos", "Lavanderia", "Otros" }));
        jComboBox_PorConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_PorConceptoActionPerformed(evt);
            }
        });

        jTextField_nºConsumo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTextField_FechaEmision.setEditable(false);
        jTextField_FechaEmision.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_FechaEmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FechaEmisionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Por Concepto De :");

        jtext_PorConcepto.setEditable(false);
        jtext_PorConcepto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(jtext_PorConcepto);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Importe S/ :");

        jTextField_ImporteConsumo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel6))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(jTextField_nºConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addComponent(jTextField_FechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addComponent(jComboBox_PorConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addGap(45, 45, 45)
                .addComponent(jTextField_ImporteConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(Boton_GuardarDatosConsumo)
                .addGap(18, 18, 18)
                .addComponent(Boton_Cerrar1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_nºConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_FechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9))
                    .addComponent(jComboBox_PorConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10))
                    .addComponent(jTextField_ImporteConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton_GuardarDatosConsumo)
                    .addComponent(Boton_Cerrar1)))
        );

        javax.swing.GroupLayout Ventana_AgregarConsumoLayout = new javax.swing.GroupLayout(Ventana_AgregarConsumo.getContentPane());
        Ventana_AgregarConsumo.getContentPane().setLayout(Ventana_AgregarConsumoLayout);
        Ventana_AgregarConsumoLayout.setHorizontalGroup(
            Ventana_AgregarConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Ventana_AgregarConsumoLayout.setVerticalGroup(
            Ventana_AgregarConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventana_AgregarConsumoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuItem_Modificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_Modificar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jMenuItem_Modificar.setText("Modificar");
        jMenuItem_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ModificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem_Modificar);

        jMenuItem_Eliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_Eliminar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jMenuItem_Eliminar.setText("Eliminar");
        jMenuItem_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem_Eliminar);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Huesped :");

        jLabelUsuarioHuesped1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("DNI :");

        jLabel_DNI1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("N° Habitacion :");

        jLabel_NHabitacion1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsuarioHuesped1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_DNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_NHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelUsuarioHuesped1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_NHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11)
                .addComponent(jLabel15)
                .addComponent(jLabel12)
                .addComponent(jLabel_DNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabla_detalleConsumos.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        tabla_detalleConsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabla_detalleConsumos);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setText("Leyenda");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setText("(A) Alojamiento");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel16.setText("(C) Consumos");

        jTextField_TotalPagar_Cliente.setEditable(false);
        jTextField_TotalPagar_Cliente.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel18.setText("Total A Pagar :");

        Boton_GuardarVenta.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_GuardarVenta.setText("Realizar Pago");
        Boton_GuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarVentaActionPerformed(evt);
            }
        });

        Boton_CerrrarD.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_CerrrarD.setText("Cerrar");
        Boton_CerrrarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CerrrarDActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel17.setText("S/");

        javax.swing.GroupLayout Ventana_DetalleHuespedesLayout = new javax.swing.GroupLayout(Ventana_DetalleHuespedes.getContentPane());
        Ventana_DetalleHuespedes.getContentPane().setLayout(Ventana_DetalleHuespedesLayout);
        Ventana_DetalleHuespedesLayout.setHorizontalGroup(
            Ventana_DetalleHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Ventana_DetalleHuespedesLayout.createSequentialGroup()
                .addGroup(Ventana_DetalleHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Ventana_DetalleHuespedesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Ventana_DetalleHuespedesLayout.createSequentialGroup()
                .addGroup(Ventana_DetalleHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Ventana_DetalleHuespedesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(Ventana_DetalleHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13)
                            .addGroup(Ventana_DetalleHuespedesLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_TotalPagar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Ventana_DetalleHuespedesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Boton_GuardarVenta)
                        .addGroup(Ventana_DetalleHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Ventana_DetalleHuespedesLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel_IDHUESPEDS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_COSTO_HABIT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_CANTIDAD_DIAS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ventana_DetalleHuespedesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_ID_HABITACION)
                                .addGap(142, 142, 142)))
                        .addComponent(Boton_CerrrarD)))
                .addContainerGap())
        );
        Ventana_DetalleHuespedesLayout.setVerticalGroup(
            Ventana_DetalleHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventana_DetalleHuespedesLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel13)
                .addGap(3, 3, 3)
                .addGroup(Ventana_DetalleHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18)
                    .addComponent(jTextField_TotalPagar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(3, 3, 3)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Ventana_DetalleHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ventana_DetalleHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Boton_CerrrarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_ID_HABITACION))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ventana_DetalleHuespedesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Ventana_DetalleHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_IDHUESPEDS, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ventana_DetalleHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel_COSTO_HABIT)
                                .addComponent(jLabel_CANTIDAD_DIAS))
                            .addComponent(Boton_GuardarVenta, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", 0, 0, new java.awt.Font("Times New Roman", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel21.setText("Nombre y Apellidos :");

        jTextField_Factura_NA_CLIENTE.setEditable(false);
        jTextField_Factura_NA_CLIENTE.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel22.setText("DNI  :");

        jTextField_F_DNI_C.setEditable(false);
        jTextField_F_DNI_C.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_F_DNI_C, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Factura_NA_CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField_Factura_NA_CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField_F_DNI_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel19.setText("N° Factura :");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel20.setText("Ruc :");

        RUC_FACTURA.setEditable(false);
        RUC_FACTURA.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        RUC_FACTURA.setText("1234567890");

        numero_factura.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numero_factura)
                    .addComponent(RUC_FACTURA, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(numero_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(RUC_FACTURA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla_Factura.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        tabla_Factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tabla_Factura);

        jTextField_TotalPagar_Factura.setEditable(false);
        jTextField_TotalPagar_Factura.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel23.setText("Total A Pagar :");

        Boton_ImprimirFact.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Boton_ImprimirFact.setText("IMPRIMIR");
        Boton_ImprimirFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ImprimirFactActionPerformed(evt);
            }
        });

        Boton_GuardarDatos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Boton_GuardarDatos.setText("GUARDAR DATOS");
        Boton_GuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarDatosActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ventana_FacturaLayout = new javax.swing.GroupLayout(Ventana_Factura.getContentPane());
        Ventana_Factura.getContentPane().setLayout(Ventana_FacturaLayout);
        Ventana_FacturaLayout.setHorizontalGroup(
            Ventana_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator7)
            .addComponent(jSeparator8)
            .addGroup(Ventana_FacturaLayout.createSequentialGroup()
                .addComponent(Boton_ImprimirFact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_GuardarDatos)
                .addGap(80, 80, 80)
                .addComponent(jLabel_NUMERO_HABIT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
            .addGroup(Ventana_FacturaLayout.createSequentialGroup()
                .addGroup(Ventana_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ventana_FacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Ventana_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5)
                            .addGroup(Ventana_FacturaLayout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ventana_FacturaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jTextField_TotalPagar_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel_IdHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Ventana_FacturaLayout.setVerticalGroup(
            Ventana_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventana_FacturaLayout.createSequentialGroup()
                .addComponent(jLabel_IdHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Ventana_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ventana_FacturaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Ventana_FacturaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Ventana_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField_TotalPagar_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Ventana_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_ImprimirFact)
                    .addComponent(Boton_GuardarDatos)
                    .addComponent(jButton2)
                    .addComponent(jLabel_NUMERO_HABIT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabla_MovHuespedes.setBackground(new java.awt.Color(0, 255, 102));
        tabla_MovHuespedes.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tabla_MovHuespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_MovHuespedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_MovHuespedesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_MovHuespedes);

        Boton_Consumos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Boton_Consumos.setText("Consumos");
        Boton_Consumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_ConsumosMouseClicked(evt);
            }
        });
        Boton_Consumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ConsumosActionPerformed(evt);
            }
        });

        BotonDetalle.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BotonDetalle.setText("Pagar");
        BotonDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonDetalleMouseClicked(evt);
            }
        });
        BotonDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetalleActionPerformed(evt);
            }
        });
        BotonDetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotonDetalleKeyPressed(evt);
            }
        });

        Boton_Cerrar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Boton_Cerrar.setText("Cerrar");
        Boton_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CerrarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Boton_Consumos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel_DNI111, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                        .addComponent(Boton_Cerrar)))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotonDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton_Consumos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_DNI111)
                    .addComponent(Boton_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonDetalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotonDetalleKeyPressed
    }//GEN-LAST:event_BotonDetalleKeyPressed

    private void BotonDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDetalleMouseClicked
    }//GEN-LAST:event_BotonDetalleMouseClicked

    private void Boton_ConsumosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ConsumosMouseClicked
    }//GEN-LAST:event_Boton_ConsumosMouseClicked

    private void tabla_MovHuespedesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_MovHuespedesMousePressed

        int filaseleccionada = tabla_MovHuespedes.getSelectedRow();

        jLabel_DNI111.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 2).toString());

        jLabelUsuarioHuesped.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 1).toString());
        jLabel_DNI.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 2).toString());
        jLabel_NHabitacion.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 3).toString());

        jLabel_IDHUESPEDS.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 0).toString());
        jLabel_CANTIDAD_DIAS.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 10).toString());
        jLabel_COSTO_HABIT.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 5).toString());
        jLabel_ID_HABITACION.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 3).toString());

        habilitar();

    }//GEN-LAST:event_tabla_MovHuespedesMousePressed

    private void Boton_ConsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ConsumosActionPerformed

        int fila;

        fila = tabla_MovHuespedes.getSelectedRow();

        if (fila >= 0) {

            MostrarConsumosPor();
//        Ventana_Consumos.setModal(true);
            Ventana_Consumos.setMinimumSize(new Dimension(679, 405));
            Ventana_Consumos.setLocationRelativeTo(this);
            Ventana_Consumos.setResizable(false);
            Ventana_Consumos.setVisible(true);

        } else {

            JOptionPane.showMessageDialog(null, "La Tabla Esta Vacia O Seleccione Una Fila", " :( Error ", JOptionPane.ERROR_MESSAGE);

        }





        /*    
         Consumos c = new Consumos();
         c.setAlwaysOnTop(true);
         //        this.enable(false);
         c.setVisible(true);

         int filaseleccionada = tabla_MovHuespedes.getSelectedRow();

         Consumos.jLabelUsuarioHuesped.setText(" " + tabla_MovHuespedes.getValueAt(filaseleccionada, 0).toString());
         Consumos.jLabel_DNI.setText(" " + tabla_MovHuespedes.getValueAt(filaseleccionada, 1));
         Consumos.jLabel_NHabitacion.setText("" + tabla_MovHuespedes.getValueAt(filaseleccionada, 2).toString());

         //        modelo_tablaConsumos.addColumn("Nº Consumo");
         //        modelo_tablaConsumos.addColumn("Fecha ");
         //        modelo_tablaConsumos.addColumn("Por Concepto De ");
         //        modelo_tablaConsumos.addColumn("Importe");
         //        tabla_Consumos.setModel(modelo_tablaConsumos);


         MostrarConsumosPor();*/

    }//GEN-LAST:event_Boton_ConsumosActionPerformed

    private void BotonDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetalleActionPerformed

//        MostrarConsumosPor();

        int fila;

        fila = tabla_MovHuespedes.getSelectedRow();

        if (fila >= 0) {

            Ventana_DetalleHuespedes.setMinimumSize(new Dimension(615, 450));
            Ventana_DetalleHuespedes.setModal(true);
            Ventana_DetalleHuespedes.setLocationRelativeTo(this);

            int filaseleccionada = tabla_MovHuespedes.getSelectedRow();
            jLabelUsuarioHuesped1.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 1).toString());
            jLabel_DNI1.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 2).toString());
            jLabel_NHabitacion1.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 3).toString());

            importeH = tabla_MovHuespedes.getValueAt(filaseleccionada, 11).toString();
            fechaH = tabla_MovHuespedes.getValueAt(filaseleccionada, 8).toString();

            MostrarConsumosDetalle();
            CargarCH();
            Sumar();

            Ventana_DetalleHuespedes.setVisible(true);



        } else {

            JOptionPane.showMessageDialog(null, "La Tabla Esta Vacia O Seleccione Una Fila", " :( Error ", JOptionPane.ERROR_MESSAGE);

        }



        //        Detalle_MovHuepsed dmh = new Detalle_MovHuepsed();
//        dmh.setVisible(true);
//
//        int filaseleccionada = tabla_MovHuespedes.getSelectedRow();
//        Detalle_MovHuepsed.jLabelUsuarioHuesped1.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 0).toString());
//        Detalle_MovHuepsed.jLabel_DNI1.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 1).toString());
//        Detalle_MovHuepsed.jLabel_NHabitacion1.setText(tabla_MovHuespedes.getValueAt(filaseleccionada, 2).toString());
//        dmh.setLocationRelativeTo(this);
    }//GEN-LAST:event_BotonDetalleActionPerformed

    private void Boton_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_Boton_CerrarActionPerformed

    private void BotonCerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerraActionPerformed

        Ventana_Consumos.dispose();
        //        Movimiento_Huespedes mh = new Movimiento_Huespedes();
        //        mh.setVisible(true);
    }//GEN-LAST:event_BotonCerraActionPerformed

    private void Boton_AgregarConsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_AgregarConsumoMouseClicked
    }//GEN-LAST:event_Boton_AgregarConsumoMouseClicked

    private void Boton_AgregarConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AgregarConsumoActionPerformed

//        String DNI = jLabel_DNI.getText();
//        String N_hABIT = jLabel_NHabitacion.getText();
//
//        Ventana_AgregarConsumo.setVisible(true);
//        Ventana_AgregarConsumo.setModal(true);
//        Ventana_AgregarConsumo.setMinimumSize(new Dimension(520, 290));
//        Ventana_AgregarConsumo.setLocationRelativeTo(null);
//        jLabel_nHabitacion.setText(N_hABIT);
//        jLabel_DNIhuesped.setText(DNI);


        Datos_Consumo dc = new Datos_Consumo();
        dc.setVisible(true);

        Datos_Consumo.Boton_ModificarConsumos.setVisible(false);

        String DNI = jLabel_DNI.getText();
        String N_hABIT = jLabel_NHabitacion.getText();
        Datos_Consumo.jLabel_nHabitacion.setText(N_hABIT);
        Datos_Consumo.jLabel_DNIhuesped.setText(DNI);

    }//GEN-LAST:event_Boton_AgregarConsumoActionPerformed

    private void jTextField_FechaEmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FechaEmisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FechaEmisionActionPerformed

    private void jComboBox_PorConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_PorConceptoActionPerformed

        int indice = jComboBox_PorConcepto.getSelectedIndex();
        jComboBox_PorConcepto.setSelectedIndex(indice);

        if (indice == 1) {

            Consulta_Productos cp = new Consulta_Productos();
            cp.setVisible(true);
            cp.setLocationRelativeTo(this);

            Consulta_Productos.Boton_Modificar.setVisible(false);
            Consulta_Productos.Boton_Eliminar.setVisible(false);

            jtext_PorConcepto.setEditable(true);

        } else if (indice == 2) {

            jtext_PorConcepto.setEditable(false);
            jtext_PorConcepto.setText(" Lavanderia ");

        } else if (indice == 3) {

            jtext_PorConcepto.setEditable(true);
            jtext_PorConcepto.setText("");
            jTextField_ImporteConsumo.setText("");

        }
    }//GEN-LAST:event_jComboBox_PorConceptoActionPerformed

    private void Boton_GuardarDatosConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarDatosConsumoActionPerformed

        guardarConsumo();
    }//GEN-LAST:event_Boton_GuardarDatosConsumoActionPerformed

    private void Boton_Cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Cerrar1ActionPerformed
        Ventana_AgregarConsumo.dispose();
    }//GEN-LAST:event_Boton_Cerrar1ActionPerformed

    private void jMenuItem_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ModificarActionPerformed

        //mostramos el formulario   
        Datos_Consumo dc = new Datos_Consumo();
        dc.setVisible(true);

        //PASAMOS LOS DATOS AL FORMULLARIO DATOS CONSUMO PARA MODIFICARSLOS
        int filaseleccionada = tabla_Consumos.getSelectedRow();
        Datos_Consumo.jTextField_nºConsumo.setText(tabla_Consumos.getValueAt(filaseleccionada, 0).toString());
        Datos_Consumo.jTextField_FechaEmision.setText(tabla_Consumos.getValueAt(filaseleccionada, 1).toString());
        Datos_Consumo.jComboBox_PorConcepto.setSelectedItem(tabla_Consumos.getValueAt(filaseleccionada, 2));
        Datos_Consumo.jtext_PorConcepto.setText(tabla_Consumos.getValueAt(filaseleccionada, 3).toString());
        Datos_Consumo.jTextField_ImporteConsumo.setText(tabla_Consumos.getValueAt(filaseleccionada, 4).toString());

        //NO MOSTRAMOS EL BOTON GUARDAR
        Datos_Consumo.Boton_GuardarDatosConsumo.setVisible(false);
        // PONEMOS NO EDITABLE EL ID  DE CONSUMO 
        Datos_Consumo.jTextField_nºConsumo.setEditable(false);

    }//GEN-LAST:event_jMenuItem_ModificarActionPerformed

    private void Boton_Actualizar_ConsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Actualizar_ConsumosActionPerformed
        MostrarConsumosPor();
    }//GEN-LAST:event_Boton_Actualizar_ConsumosActionPerformed

    private void jMenuItem_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EliminarActionPerformed
        Eliminar();
    }//GEN-LAST:event_jMenuItem_EliminarActionPerformed

    private void Boton_CerrrarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CerrrarDActionPerformed
        Ventana_DetalleHuespedes.dispose();
    }//GEN-LAST:event_Boton_CerrrarDActionPerformed

    private void Boton_GuardarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarVentaActionPerformed

        String us = jLabelUsuarioHuesped1.getText();
        String d = jLabel_DNI1.getText();
        int numeroH = Integer.parseInt(jLabel_NHabitacion1.getText());

        jTextField_Factura_NA_CLIENTE.setText(us);
        jTextField_F_DNI_C.setText(d);
        jLabel_NUMERO_HABIT.setText(String.valueOf(numeroH));

        Ventana_Factura.setModal(true);
        Ventana_Factura.setMinimumSize(new Dimension(690, 633));
        Ventana_Factura.setLocationRelativeTo(this);

        MostrarConsumosDetalleFactura();
        CargarCHFactura();
        SumarFactura();

        Ventana_Factura.setVisible(true);

        CabezeraFactura();



    }//GEN-LAST:event_Boton_GuardarVentaActionPerformed

    private void Boton_GuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarDatosActionPerformed
        GuardarVenta();
    }//GEN-LAST:event_Boton_GuardarDatosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Ventana_Factura.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Mostrar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Boton_ImprimirFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ImprimirFactActionPerformed

             // IMPRIMIR 
        //Si la Tabla no tiene Datos no Imprimira
        try {
            //Mensaje de encabezado
            MessageFormat headerFormat = new MessageFormat("Cliente :"+jTextField_Factura_NA_CLIENTE.getText()+ " \n * Pagar : "+jTextField_TotalPagar_Factura.getText());
            //Mensaje en el pie de pagina
            MessageFormat footerFormat = new MessageFormat("     HOTEL ** LUCHO **    \n GRACIAS POR SU PREFERENCIA :)   ");
            //Imprimir JTable
            tabla_Factura.print(JTable.PrintMode.FIT_WIDTH, headerFormat, footerFormat);

        } catch (PrinterException ex) {

        }


    }//GEN-LAST:event_Boton_ImprimirFactActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Movimiento_Huespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimiento_Huespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimiento_Huespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimiento_Huespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movimiento_Huespedes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerra;
    private javax.swing.JButton BotonDetalle;
    private javax.swing.JButton Boton_Actualizar_Consumos;
    private javax.swing.JButton Boton_AgregarConsumo;
    private javax.swing.JButton Boton_Cerrar;
    private javax.swing.JButton Boton_Cerrar1;
    private javax.swing.JButton Boton_CerrrarD;
    private javax.swing.JButton Boton_Consumos;
    private javax.swing.JButton Boton_GuardarDatos;
    private javax.swing.JButton Boton_GuardarDatosConsumo;
    private javax.swing.JButton Boton_GuardarVenta;
    private javax.swing.JButton Boton_ImprimirFact;
    private javax.swing.JTextField RUC_FACTURA;
    private javax.swing.JDialog Ventana_AgregarConsumo;
    private javax.swing.JDialog Ventana_Consumos;
    private javax.swing.JDialog Ventana_DetalleHuespedes;
    private javax.swing.JDialog Ventana_Factura;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox_PorConcepto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabelUsuarioHuesped;
    public static javax.swing.JLabel jLabelUsuarioHuesped1;
    private javax.swing.JLabel jLabel_CANTIDAD_DIAS;
    private javax.swing.JLabel jLabel_COSTO_HABIT;
    public static javax.swing.JLabel jLabel_DNI;
    public static javax.swing.JLabel jLabel_DNI1;
    private javax.swing.JLabel jLabel_DNI111;
    private javax.swing.JLabel jLabel_IDHUESPEDS;
    private javax.swing.JLabel jLabel_ID_HABITACION;
    private javax.swing.JLabel jLabel_IdHuespedes;
    public static javax.swing.JLabel jLabel_NHabitacion;
    public static javax.swing.JLabel jLabel_NHabitacion1;
    private javax.swing.JLabel jLabel_NUMERO_HABIT;
    private javax.swing.JMenuItem jMenuItem_Eliminar;
    private javax.swing.JMenuItem jMenuItem_Modificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField_F_DNI_C;
    private javax.swing.JTextField jTextField_Factura_NA_CLIENTE;
    private javax.swing.JTextField jTextField_FechaEmision;
    public static javax.swing.JTextField jTextField_ImporteConsumo;
    private javax.swing.JTextField jTextField_TotalPagar_Cliente;
    private javax.swing.JTextField jTextField_TotalPagar_Factura;
    private javax.swing.JTextField jTextField_nºConsumo;
    public static javax.swing.JEditorPane jtext_PorConcepto;
    private javax.swing.JTextField numero_factura;
    public static javax.swing.JTable tabla_Consumos;
    private javax.swing.JTable tabla_Factura;
    private javax.swing.JTable tabla_MovHuespedes;
    private javax.swing.JTable tabla_detalleConsumos;
    // End of variables declaration//GEN-END:variables
    Conectar conect = new Conectar();
    Connection con = conect.Conectar();

    void Cabezera() {

        modelo_tablaHuespedes.addColumn(" Codigo");
        modelo_tablaHuespedes.addColumn(" Nombre y Apellidos ");
        modelo_tablaHuespedes.addColumn(" DNI ");
        modelo_tablaHuespedes.addColumn(" Nº Habitacion ");
        modelo_tablaHuespedes.addColumn(" Tipo Habitacion ");
        modelo_tablaHuespedes.addColumn(" Precio .U ");
        modelo_tablaHuespedes.addColumn(" Descripcion ");
        modelo_tablaHuespedes.addColumn(" Estado Habitacion ");
        modelo_tablaHuespedes.addColumn(" Fecha Entrada ");
        modelo_tablaHuespedes.addColumn(" Fecha Salida");
        modelo_tablaHuespedes.addColumn(" Dias");
        modelo_tablaHuespedes.addColumn(" Pago T. Habit ");
        modelo_tablaHuespedes.addColumn("Estado Pago");
        tabla_MovHuespedes.setModel(modelo_tablaHuespedes);

//              // CONFIGURAR el de ancho de la cabecera de la tabla
//        int[] anchos = {5, 50, 50, 15};
//
//        for (int i = 0; i < tabla_detalleConsumos.getColumnCount(); i++) {
//            tabla_detalleConsumos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
//        }

    }

    void AparienciaCabezera() {

        tabla_MovHuespedes.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_MovHuespedes.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_MovHuespedes.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_MovHuespedes.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_MovHuespedes.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_MovHuespedes.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_MovHuespedes.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_MovHuespedes.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_MovHuespedes.getColumnModel().getColumn(8).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_MovHuespedes.getColumnModel().getColumn(9).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_MovHuespedes.getColumnModel().getColumn(10).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_MovHuespedes.getColumnModel().getColumn(11).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_MovHuespedes.getColumnModel().getColumn(12).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));

    }

    void Mostrar() {

        Statement sta = null;
        String estado = "Por Cancelar";
        String sql = "SELECT * FROM huespedes Where estado_pago LIKE'%" + estado + "%'";
        Object mostrar[] = new Object[13];

        try {
            int f;
            sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql);

            f = tabla_MovHuespedes.getRowCount();
            for (int j = 0; j < f; j++) {
                modelo_tablaHuespedes.removeRow(0);
            }

            while (rs.next()) {

                for (int i = 0; i < 13; i++) {
                    mostrar[i] = rs.getObject(i + 1);
                }

                modelo_tablaHuespedes.addRow(mostrar);
            }

        } catch (SQLException ex) {
        }

    }

    void Inhabilitar() {
        Boton_Consumos.setEnabled(false);
        BotonDetalle.setEnabled(false);

    }

    void habilitar() {
        Boton_Consumos.setEnabled(true);
        BotonDetalle.setEnabled(true);

    }

    //===========================================================================================================  
    //MOSTRAMOS LOS CONSUMOS 
    void MostrarConsumosPor() {

        try {

            String mostrar[] = new String[6];
            String DNI_BUSCAR = jLabel_DNI111.getText();

            String ConsultaMostrar = "SELECT *  FROM consumos WHERE dni_huesped LIKE '%" + DNI_BUSCAR + "%'";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(ConsultaMostrar);

//            int f = Consumos.tabla_Consumos.getRowCount();
//            for (int i = 0; i < f; i++) {
//                modelo_tablaConsumos.removeRow(0);
//            }
            int f = tabla_Consumos.getRowCount();
            for (int i = 0; i < f; i++) {
                modelo_tablaConsumos.removeRow(0);
            }
            while (rs.next()) {

                mostrar[0] = rs.getString("Id_consumo");
//                mostrar[1] = rs.getString("n_consumo");
                mostrar[1] = rs.getString("fecha_consumo");
                mostrar[2] = rs.getString("concepto_consumo");
                mostrar[3] = rs.getString("descripcion_consumo");
                mostrar[4] = rs.getString("importe_consumo");
                modelo_tablaConsumos.addRow(mostrar);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Consumos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //METODO Cabezera Del JDIALOGO CONSUMOS
    void CabezeraDialogo() {

        modelo_tablaConsumos.addColumn("ID Consumo");
//        modelo_tablaConsumos.addColumn("Nº Consumo");
        modelo_tablaConsumos.addColumn("Fecha ");
        modelo_tablaConsumos.addColumn("Por Concepto De ");
        modelo_tablaConsumos.addColumn("Descripcion :  ");
        modelo_tablaConsumos.addColumn("Importe");
        tabla_Consumos.setModel(modelo_tablaConsumos);

    }

    //Crgamos LOS REGSITROS ALA TABLA DE CONSUMOS DEL CLIENTE EN EL JDIALOGO CONSUMOS
    void CargarDialogo() {

        try {
            String mostrar[] = new String[6];

            String consulta = " SELECT * FROM consumos";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(consulta);

            int f = tabla_Consumos.getRowCount();
            for (int i = 0; i < f; i++) {
                modelo_tablaConsumos.removeRow(0);
            }
            while (rs.next()) {

                mostrar[0] = rs.getString("id_consumo");
//                mostrar[1] = rs.getString("n_consumo");
                mostrar[1] = rs.getString("n_consumo");
                mostrar[2] = rs.getString("fecha_consumo");
                mostrar[3] = rs.getString("concepto_consumo");
                mostrar[4] = rs.getString("importe_consumo");
                modelo_tablaConsumos.addRow(mostrar);

            }
        } catch (SQLException ex) {
        }

    }

    //=======================================================================================================================  
    //Metodo Para el Jdialogo Agregar Consumo  POR EL MOMENTO NO SE UTLIZA
    void guardarConsumo() {

        boolean verifica = jTextField_nºConsumo.getText().isEmpty() || jComboBox_PorConcepto.getSelectedIndex() == 0 || jTextField_ImporteConsumo.getText().isEmpty()
                || jtext_PorConcepto.getText().isEmpty();

        if (verifica) {

            JOptionPane.showMessageDialog(this, "PorFavor Rellene Todos Los Campos ", "AVISO ", JOptionPane.WARNING_MESSAGE);

        } else {

            try {
                String consultaGuardar = " INSERT INTO  consumos (Id_Consumo, n_consumo, fecha_consumo, concepto_consumo, importe_consumo, dni_huesped, n_habitacion) "
                        + "VALUES(?,?,?,?,?,?,?)";

                PreparedStatement prep = con.prepareStatement(consultaGuardar);

                prep.setString(1, null);
                prep.setString(2, jTextField_nºConsumo.getText());
                prep.setString(3, jTextField_FechaEmision.getText());
                prep.setString(4, jtext_PorConcepto.getText());
                prep.setString(5, jTextField_ImporteConsumo.getText());
                prep.setString(6, jLabel_DNIhuesped.getText());
                prep.setString(7, jLabel_nHabitacion.getText());

                int g = prep.executeUpdate();
                if (g > 0) {
                    JOptionPane.showMessageDialog(this, " Datos Guardados Correctamete ", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, " Error Al Guardar Los Datos ", "AVISO", JOptionPane.WARNING_MESSAGE);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, " Error Al Guardar Los Datos " + ex, "AVISO", JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    //==================================================================================================================
    void Fecha() {

        SimpleDateFormat formato = new SimpleDateFormat("dd - MM - YYYY");
        java.util.Date dat = new java.util.Date();
        String Dia = formato.format(dat);

        //============================================
        GregorianCalendar hora = new GregorianCalendar();
        int h, m, s;
        h = hora.get(Calendar.HOUR);
        m = hora.get(Calendar.MINUTE);
        s = hora.get(Calendar.SECOND);
        //========================================
        jTextField_FechaEmision.setText(Dia);
//        jTextField_FechaEmision.setText(Dia +  "  <=> "+h+" : "+m+" : "+s);

    }

    void Eliminar() {

        try {
            int filaS = tabla_Consumos.getSelectedRow();

            int opcion = JOptionPane.showConfirmDialog(this, " ¿Desea Eliminarlo ?", " Confirmar ", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {

                String consulta = "DELETE FROM consumos WHERE id_consumo=" + tabla_Consumos.getValueAt(filaS, 0) + "";
                Statement sta = con.createStatement();
                int e = sta.executeUpdate(consulta);

                if (e > 0) {
                    JOptionPane.showMessageDialog(this, " Consumo Fue Eliminado Exitosamente ", " EXITO", JOptionPane.WARNING_MESSAGE);
                }

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, " Error Al Eliminar " + e, " ERROR ", JOptionPane.WARNING_MESSAGE);
        }


    }

    void MostrarConsumosDetalle() {

        try {

            String mostrar[] = new String[4];
//            String mostrar1[] = new String[3];
//            String DNI_BUSCAR = jLabel_DNI1.getText();

            int filaS = tabla_MovHuespedes.getSelectedRow();
            String ConsultaMostrar = "SELECT  * FROM consumos WHERE dni_huesped LIKE '%" + tabla_MovHuespedes.getValueAt(filaS, 2) + "%'";
//            String consultaMH = " SELECT * FROM huespedes WHERE dni_huesped LIKE'%" + tabla_MovHuespedes.getValueAt(filaS, 1)+"%'";
//            String consultaMH = " SELECT h.fecha_entrada, h.Pagar_TotalHabitacion FROM huespedes h WHERE h.dni_huesped =" + tabla_MovHuespedes.getValueAt(filaS, 1) ;

            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(ConsultaMostrar);




            int f = tabla_detalleConsumos.getRowCount();
            for (int i = 0; i < f; i++) {
                modelotablaDetalle.removeRow(0);
            }
            while (rs.next()) {

                mostrar[0] = rs.getString("Id_consumo");
//                mostrar[1] = rs.getString("n_consumo");
                mostrar[1] = rs.getString("fecha_consumo");
                mostrar[2] = " (C)=> " + rs.getString("concepto_consumo");
                mostrar[3] = rs.getString("importe_consumo");
                modelotablaDetalle.addRow(mostrar);

            }


        } catch (SQLException ex) {
            System.out.println("" + ex);
        }

    }

    void cabezeraDialogoDetalle() {

        modelotablaDetalle.addColumn(" Id Consumo ");
        modelotablaDetalle.addColumn(" Fecha");
        modelotablaDetalle.addColumn(" Por Concepto de : ");
        modelotablaDetalle.addColumn(" Importe");
        tabla_detalleConsumos.setModel(modelotablaDetalle);
        // CONFIGURAR el de ancho de la cabecera de la tabla
        int[] anchos = {5, 50, 50, 15};

        for (int i = 0; i < tabla_detalleConsumos.getColumnCount(); i++) {
            tabla_detalleConsumos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }

    void GuardarVenta() {


        try {

            if (numero_factura.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Dijite numero de factura");
            } else {
                String consulta = " INSERT INTO comprobante VALUES (?,?,?,?)";
                String consulta1 = "INSERT INTO detalle_comprobante VALUES (?,?,?,?)";
                PreparedStatement prepa = con.prepareCall(consulta);
                PreparedStatement prepa1 = con.prepareCall(consulta1);

                String estado = "CANCELADO";
                String modificar = " UPDATE huespedes SET estado_pago = '" + estado + "' WHERE id_huespedes='" + jLabel_IDHUESPEDS.getText() + "'";
                PreparedStatement prepaM = con.prepareCall(modificar);
                prepaM.executeUpdate();

                String estadoH = "Disponible";
                String modificarH = " UPDATE habitacion SET estado_habitacion = '" + estadoH + "' WHERE numero_habitacion='" + jLabel_IDHUESPEDS.getText() + "'";
                PreparedStatement prepaH = con.prepareCall(modificarH);
                prepaH.executeUpdate();

                prepa.setString(1, numero_factura.getText());
                prepa.setString(2, RUC_FACTURA.getText());
                prepa.setString(3, jTextField_FechaEmision.getText());
                prepa.setString(4, jLabel_IDHUESPEDS.getText());

                prepa1.setString(1, jLabel_CANTIDAD_DIAS.getText());
                prepa1.setString(2, jLabel_COSTO_HABIT.getText());
                prepa1.setString(3, jTextField_TotalPagar_Factura.getText());
                prepa1.setString(4, numero_factura.getText());

                int g = prepa.executeUpdate();
                int g1 = prepa1.executeUpdate();
                if (g > 0) {

                    JOptionPane.showMessageDialog(this, "  PAGO HECHO SATISFACTORIAMENTE  ");
                    JOptionPane.showMessageDialog(this, " Datos Guardados  ");
                    Mostrar();

                }

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, " Numero Factura Duplicado " + e);
        }


    }

    void CargarCH() {

        String Cargar[] = new String[4];
        Cargar[0] = "";
        Cargar[1] = fechaH;
        Cargar[2] = Concepto;
        Cargar[3] = importeH;
        modelotablaDetalle.addRow(Cargar);

    }

    void Sumar() {

        String a = "";
        double total = 0;
        double b = 0;

        for (int fila = 0; fila < tabla_detalleConsumos.getRowCount(); fila++) {
            a = String.valueOf(tabla_detalleConsumos.getValueAt(fila, 3));
            b = Double.valueOf(a);
            total = total + b;
        }
        jTextField_TotalPagar_Cliente.setText(String.valueOf(total));

    }

    void CabezeraFactura() {
        modelo_tablaFactura.addColumn(" Id Consumo ");
        modelo_tablaFactura.addColumn(" Fecha");
        modelo_tablaFactura.addColumn(" Por Concepto de : ");
        modelo_tablaFactura.addColumn(" Importe");
        tabla_Factura.setModel(modelo_tablaFactura);

    }

    void MostrarConsumosDetalleFactura() {


        try {

            String mostrar[] = new String[4];
//            String mostrar1[] = new String[3];
//            String DNI_BUSCAR = jLabel_DNI1.getText();

            int filaS = tabla_MovHuespedes.getSelectedRow();
            String ConsultaMostrar = "SELECT  * FROM consumos WHERE dni_huesped LIKE '%" + jLabel_DNI1.getText() + "%'";
//            String consultaMH = " SELECT * FROM huespedes WHERE dni_huesped LIKE'%" + tabla_MovHuespedes.getValueAt(filaS, 1)+"%'";
//            String consultaMH = " SELECT h.fecha_entrada, h.Pagar_TotalHabitacion FROM huespedes h WHERE h.dni_huesped =" + tabla_MovHuespedes.getValueAt(filaS, 1) ;

            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(ConsultaMostrar);




            int f = tabla_Factura.getRowCount();
            for (int i = 0; i < f; i++) {
                modelo_tablaFactura.removeRow(0);
            }
            while (rs.next()) {

                mostrar[0] = rs.getString("Id_consumo");
//                mostrar[1] = rs.getString("n_consumo");
                mostrar[1] = rs.getString("fecha_consumo");
                mostrar[2] = " (C)=> " + rs.getString("concepto_consumo");
                mostrar[3] = rs.getString("importe_consumo");
                modelo_tablaFactura.addRow(mostrar);

            }


        } catch (SQLException ex) {
            System.out.println("" + ex);
        }


    }

    void CargarCHFactura() {

        String Cargar[] = new String[4];
        Cargar[0] = "";
        Cargar[1] = fechaH;
        Cargar[2] = Concepto;
        Cargar[3] = importeH;
        modelo_tablaFactura.addRow(Cargar);

    }

    void SumarFactura() {

        String a = "";
        double total = 0;
        double b = 0;

        for (int fila = 0; fila < tabla_Factura.getRowCount(); fila++) {
            a = String.valueOf(tabla_Factura.getValueAt(fila, 3));
            b = Double.valueOf(a);
            total = total + b;
        }
        jTextField_TotalPagar_Factura.setText(String.valueOf(total));


    }
}
