/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;

import Conectar.Conectar;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.*;

/**
 *
 * @author Clarisse_Naoemi-PC
 */
public class Empleado extends javax.swing.JFrame {

    DefaultTableModel modelo_empleado = new DefaultTableModel();
    SpinnerNumberModel modelo_spinner;

    public Empleado() {
        initComponents();

        Empleado.this.setResizable(false);
        Empleado.this.setLocationRelativeTo(null);
        Empleado.this.setTitle(" Mantenimiento Empleado ");

        CabezeraTabla();
        MostrarDatos();

        Boton_Eliminar.setEnabled(false);
        Boton_Modificar.setEnabled(false);
        jLabel_edad.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuItem_Seleccionar = new javax.swing.JMenuItem();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCargo_Empleado = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldId_Empleado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<String>();
        jTextFieldNombre_Empleado = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldApellidos_Empleado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldDNI_EMPLEADO = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_empleado = new javax.swing.JTable();
        Boton_GUardar = new javax.swing.JButton();
        Boton_CANcelar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Boton_Eliminar = new javax.swing.JButton();
        Boton_Modificar = new javax.swing.JButton();
        Boton_Cerrrar = new javax.swing.JButton();
        jTextFieldEdad_Empleado = new javax.swing.JSpinner();
        jLabel_edad = new javax.swing.JLabel();
        jLabel_Id_Empleado = new javax.swing.JLabel();
        jLabel_Error = new javax.swing.JLabel();
        jLabel_EddarError = new javax.swing.JLabel();

        menuItem_Seleccionar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        menuItem_Seleccionar.setText("Seleccionar a Modificar");
        menuItem_Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_SeleccionarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuItem_Seleccionar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Cargo :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Nombre (s) :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Estado :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Apellidos :");

        jComboBoxCargo_Empleado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBoxCargo_Empleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccionar>", "Administrador", "Recepcionista" }));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("DNI :");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Id Empleado :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Edad");

        jTextFieldId_Empleado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldId_Empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldId_EmpleadoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Direccion");

        jComboBoxEstado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));

        jTextFieldNombre_Empleado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldNombre_Empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombre_EmpleadoKeyTyped(evt);
            }
        });

        jTextFieldTelefono.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyTyped(evt);
            }
        });

        jTextFieldApellidos_Empleado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldApellidos_Empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidos_EmpleadoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Telefono :");

        jTextFieldDNI_EMPLEADO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldDNI_EMPLEADO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDNI_EMPLEADOKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDNI_EMPLEADOKeyTyped(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tabla_empleado.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        tabla_empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_empleado.setComponentPopupMenu(jPopupMenu1);
        tabla_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_empleadoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_empleado);

        Boton_GUardar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_GUardar.setText("Guardar");
        Boton_GUardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GUardarActionPerformed(evt);
            }
        });

        Boton_CANcelar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_CANcelar.setText("Cancelar");
        Boton_CANcelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CANcelarActionPerformed(evt);
            }
        });

        Boton_Eliminar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Eliminar.setText("Eliminar");
        Boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarActionPerformed(evt);
            }
        });

        Boton_Modificar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Modificar.setText("Modificar");
        Boton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ModificarActionPerformed(evt);
            }
        });

        Boton_Cerrrar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Cerrrar.setText("Cerrar");
        Boton_Cerrrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CerrrarActionPerformed(evt);
            }
        });

        jTextFieldEdad_Empleado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldEdad_Empleado.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(18), null, null, Integer.valueOf(1)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)
                                .addComponent(jTextFieldApellidos_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(52, 52, 52)
                                .addComponent(jTextFieldDNI_EMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_EddarError, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(13, 13, 13)
                                .addComponent(jTextFieldId_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(19, 19, 19)
                                .addComponent(jTextFieldNombre_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(31, 31, 31)
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(46, 46, 46)
                                        .addComponent(jComboBoxCargo_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(41, 41, 41)
                                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldEdad_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(Boton_GUardar)
                        .addGap(134, 134, 134)
                        .addComponent(Boton_CANcelar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_Modificar)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel_edad)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Id_Empleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton_Cerrrar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldId_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNombre_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldApellidos_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_EddarError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jTextFieldDNI_EMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldEdad_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxCargo_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_GUardar)
                    .addComponent(Boton_CANcelar))
                .addGap(9, 9, 9)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Eliminar)
                    .addComponent(Boton_Modificar)
                    .addComponent(Boton_Cerrrar)
                    .addComponent(jLabel_edad)
                    .addComponent(jLabel_Id_Empleado)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombre_EmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombre_EmpleadoKeyTyped
        validarLetras(evt);
    }//GEN-LAST:event_jTextFieldNombre_EmpleadoKeyTyped

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped


//        char c = evt.getKeyChar();
//
//        if (c < '0' || c > '9') {
//            evt.consume();
//        }

        if (jTextFieldTelefono.getText().length() == 9) {
            jLabel_Error.setText("solo 9 digitos");
            jLabel_Error.setForeground(Color.red);
            jTextFieldTelefono.setText("");
            jTextFieldTelefono.grabFocus();
        }
        if (jTextFieldTelefono.getText().length() < 9) {
            jLabel_Error.setText("digitando..");
            jLabel_Error.setForeground(Color.blue);
        }
        if (jTextFieldTelefono.getText().length() == 8) {
            jLabel_Error.setText("");
        }
        validarNumeros(evt);
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jTextFieldApellidos_EmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidos_EmpleadoKeyTyped
        validarLetras(evt);
    }//GEN-LAST:event_jTextFieldApellidos_EmpleadoKeyTyped

    private void jTextFieldDNI_EMPLEADOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNI_EMPLEADOKeyTyped

        validarNumeros(evt);
        if (jTextFieldDNI_EMPLEADO.getText().length() == 8) {
            jLabel_EddarError.setText("solo 8 digitos");
            jLabel_EddarError.setForeground(Color.red);
            jTextFieldDNI_EMPLEADO.setText("");
            jTextFieldDNI_EMPLEADO.grabFocus();
        }
        if (jTextFieldDNI_EMPLEADO.getText().length() < 8) {
            jLabel_EddarError.setText("digitando..");
            jLabel_EddarError.setForeground(Color.blue);
        }
        if (jTextFieldDNI_EMPLEADO.getText().length() == 7) {
            jLabel_EddarError.setText("");
        }
    }//GEN-LAST:event_jTextFieldDNI_EMPLEADOKeyTyped

    private void Boton_GUardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GUardarActionPerformed
        Guardar();
    }//GEN-LAST:event_Boton_GUardarActionPerformed

    private void tabla_empleadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_empleadoMousePressed

        Limpiar();
        Boton_Eliminar.setEnabled(true);
        Boton_Modificar.setEnabled(false);
        Boton_GUardar.setEnabled(true);


    }//GEN-LAST:event_tabla_empleadoMousePressed

    private void Boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarActionPerformed
        Eliminar();
    }//GEN-LAST:event_Boton_EliminarActionPerformed

    private void Boton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ModificarActionPerformed
        Modificar();
    }//GEN-LAST:event_Boton_ModificarActionPerformed

    private void Boton_CerrrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CerrrarActionPerformed
        Empleado e = new Empleado();
        e.dispose();
////        Empleado.this.dispose();
//        
//       
//         try {
//            /*Agrego el jtable a un ArrayList*/
//            List<JTable> tb = new ArrayList<JTable>();
//            tb.add(tabla_empleado);
//            
//            ExportatExcel excellExporter = new ExportatExcel(tb, new File("REGISTRO DE EMPLEADOS.xls"));
//            if(excellExporter.Export())
//            {
//                System.out.println("DATOS EXPORTADOS CON EXITO");
//            }            
//            llamaExcel();
//        } catch (Exception e) {
//            System.out.println("No se pudo");
//        }
    }//GEN-LAST:event_Boton_CerrrarActionPerformed

    private void menuItem_SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_SeleccionarActionPerformed

        Boton_Eliminar.setEnabled(false);
        Boton_Modificar.setEnabled(true);
        Boton_GUardar.setEnabled(false);

        int filaseleccionada = tabla_empleado.getSelectedRow();
        jTextFieldId_Empleado.setText(tabla_empleado.getValueAt(filaseleccionada, 0).toString());
        jTextFieldNombre_Empleado.setText(tabla_empleado.getValueAt(filaseleccionada, 1).toString());
        jTextFieldApellidos_Empleado.setText(tabla_empleado.getValueAt(filaseleccionada, 2).toString());
        jTextFieldDNI_EMPLEADO.setText(tabla_empleado.getValueAt(filaseleccionada, 3).toString());

        jLabel_edad.setText(tabla_empleado.getValueAt(filaseleccionada, 4).toString());
        int edad = Integer.parseInt(jLabel_edad.getText());
        modelo_spinner = new SpinnerNumberModel(edad, 18, 100, 1);
        jTextFieldEdad_Empleado.setModel(modelo_spinner);

        jTextField5.setText(tabla_empleado.getValueAt(filaseleccionada, 5).toString());
        jTextFieldTelefono.setText(tabla_empleado.getValueAt(filaseleccionada, 6).toString());

        jComboBoxCargo_Empleado.setSelectedItem(tabla_empleado.getValueAt(filaseleccionada, 7));
        jComboBoxEstado.setSelectedItem(tabla_empleado.getValueAt(filaseleccionada, 8));


    }//GEN-LAST:event_menuItem_SeleccionarActionPerformed

    private void jTextFieldId_EmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldId_EmpleadoKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_jTextFieldId_EmpleadoKeyTyped

    private void Boton_CANcelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CANcelarActionPerformed

        Limpiar();
    }//GEN-LAST:event_Boton_CANcelarActionPerformed

    private void jTextFieldTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyReleased

        if (!jTextFieldTelefono.getText().matches("[0-9--]*")) {
            jLabel_Error.setText("Error");
            jLabel_Error.setForeground(Color.red);
            jTextFieldTelefono.setText("");
            jTextFieldTelefono.grabFocus();
        }
    }//GEN-LAST:event_jTextFieldTelefonoKeyReleased

    private void jTextFieldDNI_EMPLEADOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNI_EMPLEADOKeyReleased

        if (!jTextFieldDNI_EMPLEADO.getText().matches("[0-9--]*")) {
            jLabel_EddarError.setText("Error");
            jLabel_EddarError.setForeground(Color.red);
            jTextFieldDNI_EMPLEADO.setText("");
            jTextFieldDNI_EMPLEADO.grabFocus();
        }
    }//GEN-LAST:event_jTextFieldDNI_EMPLEADOKeyReleased

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_CANcelar;
    private javax.swing.JButton Boton_Cerrrar;
    private javax.swing.JButton Boton_Eliminar;
    private javax.swing.JButton Boton_GUardar;
    private javax.swing.JButton Boton_Modificar;
    private javax.swing.JComboBox<String> jComboBoxCargo_Empleado;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_EddarError;
    private javax.swing.JLabel jLabel_Error;
    private javax.swing.JLabel jLabel_Id_Empleado;
    private javax.swing.JLabel jLabel_edad;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldApellidos_Empleado;
    private javax.swing.JTextField jTextFieldDNI_EMPLEADO;
    private javax.swing.JSpinner jTextFieldEdad_Empleado;
    private javax.swing.JTextField jTextFieldId_Empleado;
    private javax.swing.JTextField jTextFieldNombre_Empleado;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JMenuItem menuItem_Seleccionar;
    private javax.swing.JTable tabla_empleado;
    // End of variables declaration//GEN-END:variables
    Conectar conect = new Conectar();
    Connection con = conect.Conectar();

    //======================================================================
    public void validarLetras(KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }

    public void validarNumeros(KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }
    //==============================================================================================

    void Guardar() {

        boolean verifica = jTextFieldId_Empleado.getText().isEmpty() || jTextFieldNombre_Empleado.getText().isEmpty() || jTextFieldDNI_EMPLEADO.getText().isEmpty()
                || jTextFieldApellidos_Empleado.getText().isEmpty() || jTextField5.getText().isEmpty() || jTextFieldTelefono.getText().isEmpty()
                || jComboBoxCargo_Empleado.getSelectedIndex() == 0;

        if (verifica) {

            JOptionPane.showMessageDialog(this, " Por Favor Rellene Todos Los Campos ", "AVISO", JOptionPane.WARNING_MESSAGE);

        } else {

            int opcion = JOptionPane.showConfirmDialog(this, " Desea Guardar Los Datos ", " AVISO", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {

                try {
                    String sql = "INSERT INTO empleado(id_empleado, nombre_empleado, apellidos_empleado, dni_empleado,edad_empleado, direccion_empleado, cargo_empleado, estado_empleado) VALUES(?,?,?,?,?,?,?,?)";
                    String sql1 = "INSERT INTO telefono(numero,id_empleado) VALUES (?,?)";

                    PreparedStatement prsta = con.prepareCall(sql);
                    PreparedStatement prst = con.prepareCall(sql1);

                    prsta.setString(1, jTextFieldId_Empleado.getText());
                    prsta.setString(2, jTextFieldNombre_Empleado.getText());
                    prsta.setString(3, jTextFieldApellidos_Empleado.getText());
                    prsta.setString(4, jTextFieldDNI_EMPLEADO.getText());
                    prsta.setInt(5, (int) jTextFieldEdad_Empleado.getValue());
                    prsta.setString(6, jTextField5.getText());
                    prsta.setString(7, jComboBoxCargo_Empleado.getSelectedItem().toString());
                    prsta.setString(8, jComboBoxEstado.getSelectedItem().toString());

                    prst.setString(1, jTextFieldTelefono.getText());
                    prst.setString(2, jTextFieldId_Empleado.getText());

                    
                    int g = prsta.executeUpdate();
                    prst.executeUpdate();

                    if (g > 0) {
                        JOptionPane.showMessageDialog(this, " Datos De Empleado Guardados Correctamente ", " AVISO ", JOptionPane.INFORMATION_MESSAGE);
                        Limpiar();
                        MostrarDatos();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(rootPane, "Error Al Guardar los Datos" + e, "Vericar", JOptionPane.WARNING_MESSAGE);
                }
            }

        }

    }

    void CabezeraTabla() {

        modelo_empleado.addColumn(" Codigo ");
        modelo_empleado.addColumn(" Nombre (s) ");
        modelo_empleado.addColumn(" Apellidos ");
        modelo_empleado.addColumn(" DNI ");
        modelo_empleado.addColumn(" Edad ");
        modelo_empleado.addColumn(" Direccion ");
        modelo_empleado.addColumn(" Telefono ");
        modelo_empleado.addColumn(" Cargo ");
        modelo_empleado.addColumn("  Estado");
        tabla_empleado.setModel(modelo_empleado);
    }

    void MostrarDatos() {

        try {

            String cargar[] = new String[9];
            String consulta = "SELECT *  FROM empleado ";
            String consulta1 = "SELECT *  FROM  telefono ";

            Statement sta = con.createStatement();
            Statement sta1 = con.createStatement();
            ResultSet rs = sta.executeQuery(consulta);

            ResultSet rs1 = sta1.executeQuery(consulta1);

            int f = tabla_empleado.getRowCount();
            for (int i = 0; i < f; i++) {
                modelo_empleado.removeRow(0);
            }
            while (rs.next() && rs1.next()) {

                cargar[0] = rs.getString("id_empleado");
                cargar[1] = rs.getString("nombre_empleado");
                cargar[2] = rs.getString("apellidos_empleado");
                cargar[3] = rs.getString("dni_empleado");
                cargar[4] = rs.getString("edad_empleado");
                cargar[5] = rs.getString("direccion_empleado");
                cargar[6] = rs1.getString("numero");
                cargar[7] = rs.getString("cargo_empleado");
                cargar[8] = rs.getString("estado_empleado");
                modelo_empleado.addRow(cargar);

            }

        } catch (Exception e) {
            System.out.println("" + e);
        }

    }

    private void Limpiar() {

        jTextField5.setText("");
        jTextFieldApellidos_Empleado.setText("");
        jTextFieldDNI_EMPLEADO.setText("");
        jTextFieldEdad_Empleado.setValue(18);
        jTextFieldNombre_Empleado.setText("");
        jTextFieldTelefono.setText("");
        jComboBoxCargo_Empleado.setSelectedIndex(0);
        jComboBoxEstado.setSelectedIndex(0);
        jTextFieldNombre_Empleado.requestFocus();
        Boton_Eliminar.setEnabled(false);
        Boton_Modificar.setEnabled(false);
        Boton_GUardar.setEnabled(true);

    }

    void Eliminar() {

        try {

            int opcion = JOptionPane.showConfirmDialog(this, " Desea Eliminar el Regsitro Seleccionado ", " Confirmacion", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {

                int filaseleccionada = tabla_empleado.getSelectedRow();
                String consultaEliminar = " DELETE FROM  empleado  WHERE id_empleado=" + tabla_empleado.getValueAt(filaseleccionada, 0);

                Statement sta = con.createStatement();
                int e = sta.executeUpdate(consultaEliminar);

                if (e > 0) {
                    JOptionPane.showMessageDialog(this, " Registro Eliminado Exitosamente ", " EXITO", JOptionPane.INFORMATION_MESSAGE);
                    MostrarDatos();
                    Limpiar();

                }

            }

        } catch (SQLException e) {
        }

    }

    void Modificar() {

        try {

            boolean verifica = jTextFieldId_Empleado.getText().isEmpty() || jTextFieldNombre_Empleado.getText().isEmpty() || jTextFieldDNI_EMPLEADO.getText().isEmpty()
                    || jTextFieldApellidos_Empleado.getText().isEmpty() || jTextField5.getText().isEmpty() || jTextFieldTelefono.getText().isEmpty()
                    || jComboBoxCargo_Empleado.getSelectedIndex() == 0;

            if (verifica) {

                JOptionPane.showMessageDialog(this, " Por Favor Rellene Todos Los Campos ", "AVISO", JOptionPane.WARNING_MESSAGE);

            } else {
                int opcion = JOptionPane.showConfirmDialog(this, " Desea Modificar El Registro Seleccionado  ", " AVISO", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {

                    String consultaModificar = "UPDATE  empleado SET nombre_empleado='" + jTextFieldNombre_Empleado.getText() + "', apellidos_empleado='" + jTextFieldApellidos_Empleado.getText() + "', dni_empleado ='"
                            + jTextFieldDNI_EMPLEADO.getText() + "', edad_empleado='" + jTextFieldEdad_Empleado.getValue() + "', direccion_empleado='" + jTextField5.getText() + "', cargo_empleado ='" + jComboBoxCargo_Empleado.getSelectedItem()
                            + " ', estado_empleado='" + jComboBoxEstado.getSelectedItem() + "' WHERE id_empleado ='" + jTextFieldId_Empleado.getText() + "'";

                    String consultaTelefono = " UPDATE telefono SET  numero ='" + jTextFieldTelefono.getText() + "' WHERE id_empleado = '" + jTextFieldId_Empleado.getText() + "'";
                    ;
                    PreparedStatement prepa = con.prepareCall(consultaModificar);
                    PreparedStatement prepa1 = con.prepareCall(consultaTelefono);

                    prepa1.executeUpdate();
                    int m = prepa.executeUpdate();
                    int mt = prepa1.executeUpdate();

                    if (m > 0) {
                        JOptionPane.showMessageDialog(this, " Regsitro Modificado Exitosamente ", " EXITO", JOptionPane.INFORMATION_MESSAGE);
                        MostrarDatos();
                        Limpiar();

                    }

                }
            }
        } catch (SQLException e) {
            System.out.println("" + e);
        }

    }
    
    
      public void llamaExcel()
    {
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"REGISTRO DE EMPLEADOS.xls");
        } catch (Exception e) {
            System.out.println("No se pudo");
        }
    }
}
