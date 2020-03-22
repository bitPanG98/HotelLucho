/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;

import Conectar.Conectar;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Clarisse_Naoemi-PC
 */
public class Habitacion extends javax.swing.JFrame {

    DefaultTableModel modelo_habitacion = new DefaultTableModel();
    SpinnerNumberModel modelo_spinner;
    SpinnerNumberModel modelo_spinner1;

    public Habitacion() {
        initComponents();

        Habitacion.this.setTitle(" Mantenimiento  Habitacion ");
        Habitacion.this.setResizable(false);
        Habitacion.this.setLocationRelativeTo(null);

        CabezeraTabla();
        CargarDatos();

        Boton_Eliminar.setEnabled(false);
        Botom_Modificar.setEnabled(false);
        jComboBoxEstado_hABITACION.setEnabled(false);
        jLabel_Piso.setVisible(false);
        jLabel_precio.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNº_Habitacion = new javax.swing.JTextField();
        jComboBoxTipo_Habtacion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtextFieldDescripcion = new javax.swing.JEditorPane();
        jComboBoxEstado_hABITACION = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerPrecion_habitacion = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Habitaciones = new javax.swing.JTable();
        Boton_Guardar = new javax.swing.JButton();
        Boton_Eliminar = new javax.swing.JButton();
        Botom_Modificar = new javax.swing.JButton();
        Boton_Cancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Boton_Cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jspinner_piso = new javax.swing.JSpinner();
        jLabel_Piso = new javax.swing.JLabel();
        jLabel_precio = new javax.swing.JLabel();

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jMenuItem1.setText("Seleccionar a Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nº :");

        jTextFieldNº_Habitacion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldNº_Habitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNº_HabitacionKeyTyped(evt);
            }
        });

        jComboBoxTipo_Habtacion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBoxTipo_Habtacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Simples", "Dobles", "Matrimoniales" }));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descripcion :");

        jtextFieldDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(jtextFieldDescripcion);

        jComboBoxEstado_hABITACION.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBoxEstado_hABITACION.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupada", "Reparacion" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Estado :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio :");

        jSpinnerPrecion_habitacion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jSpinnerPrecion_habitacion.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));
        jSpinnerPrecion_habitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSpinnerPrecion_habitacionKeyTyped(evt);
            }
        });

        tabla_Habitaciones.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        tabla_Habitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_Habitaciones.setComponentPopupMenu(jPopupMenu1);
        tabla_Habitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_HabitacionesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Habitaciones);

        Boton_Guardar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Guardar.setText("Guardar");
        Boton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarActionPerformed(evt);
            }
        });

        Boton_Eliminar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Eliminar.setText("Eliminar");
        Boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarActionPerformed(evt);
            }
        });

        Botom_Modificar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Botom_Modificar.setText("Modificar");
        Botom_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botom_ModificarActionPerformed(evt);
            }
        });

        Boton_Cancelar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Cancelar.setText("Cancelar");
        Boton_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CancelarActionPerformed(evt);
            }
        });

        Boton_Cerrar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Cerrar.setText("Cerrrar");
        Boton_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Piso :");

        jspinner_piso.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jspinner_piso.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        jLabel_Piso.setText("jLabel7");

        jLabel_precio.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(Boton_Guardar)
                .addGap(143, 143, 143)
                .addComponent(Boton_Cancelar)
                .addContainerGap(157, Short.MAX_VALUE))
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Boton_Eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botom_Modificar)
                .addGap(124, 124, 124)
                .addComponent(jLabel_Piso)
                .addGap(18, 18, 18)
                .addComponent(jLabel_precio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton_Cerrar))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(33, 33, 33)
                        .addComponent(jSpinnerPrecion_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54)
                        .addComponent(jTextFieldNº_Habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33)
                        .addComponent(jComboBoxEstado_hABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTipo_Habtacion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jspinner_piso, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jTextFieldNº_Habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTipo_Habtacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jspinner_piso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxEstado_hABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(jSpinnerPrecion_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Guardar)
                    .addComponent(Boton_Cancelar))
                .addGap(8, 8, 8)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton_Eliminar)
                            .addComponent(Botom_Modificar)
                            .addComponent(Boton_Cerrar))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Piso)
                            .addComponent(jLabel_precio)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNº_HabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNº_HabitacionKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_jTextFieldNº_HabitacionKeyTyped

    private void jSpinnerPrecion_habitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinnerPrecion_habitacionKeyTyped
    }//GEN-LAST:event_jSpinnerPrecion_habitacionKeyTyped

    private void Boton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarActionPerformed
        Guardar();
    }//GEN-LAST:event_Boton_GuardarActionPerformed

    private void Boton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CancelarActionPerformed
        Limpiar();

        Boton_Guardar.setEnabled(true);
        Boton_Eliminar.setEnabled(false);
        Botom_Modificar.setEnabled(false);
    }//GEN-LAST:event_Boton_CancelarActionPerformed

    private void Boton_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CerrarActionPerformed
        Habitacion.this.dispose();
    }//GEN-LAST:event_Boton_CerrarActionPerformed

    private void Boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarActionPerformed
        Eliminar();
    }//GEN-LAST:event_Boton_EliminarActionPerformed

    private void tabla_HabitacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_HabitacionesMousePressed

        Limpiar();

        Boton_Eliminar.setEnabled(true);
        Botom_Modificar.setEnabled(false);
//
    }//GEN-LAST:event_tabla_HabitacionesMousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        Botom_Modificar.setEnabled(true);
        Boton_Guardar.setEnabled(false);
        Boton_Eliminar.setEnabled(false);
        jComboBoxEstado_hABITACION.setEnabled(true);

        int filaS = tabla_Habitaciones.getSelectedRow();

        jTextFieldNº_Habitacion.setText(tabla_Habitaciones.getValueAt(filaS, 0).toString());
        jComboBoxTipo_Habtacion.setSelectedItem(tabla_Habitaciones.getValueAt(filaS, 1).toString());
        jtextFieldDescripcion.setText(tabla_Habitaciones.getValueAt(filaS, 2).toString());

        jLabel_Piso.setText(tabla_Habitaciones.getValueAt(filaS, 3).toString());
        int piso = Integer.parseInt(jLabel_Piso.getText());
        modelo_spinner = new SpinnerNumberModel(piso, 1, 5, 1);
        jspinner_piso.setModel(modelo_spinner);

        jComboBoxEstado_hABITACION.setSelectedItem(tabla_Habitaciones.getValueAt(filaS, 4).toString());

        jLabel_precio.setText(tabla_Habitaciones.getValueAt(filaS, 5).toString());
        double precio = Double.parseDouble(jLabel_precio.getText());
        modelo_spinner1 = new SpinnerNumberModel(precio, 1, 5000, 1);
        jSpinnerPrecion_habitacion.setModel(modelo_spinner1);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void Botom_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botom_ModificarActionPerformed
        Modificar();
    }//GEN-LAST:event_Botom_ModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Habitacion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botom_Modificar;
    private javax.swing.JButton Boton_Cancelar;
    private javax.swing.JButton Boton_Cerrar;
    private javax.swing.JButton Boton_Eliminar;
    private javax.swing.JButton Boton_Guardar;
    private javax.swing.JComboBox<String> jComboBoxEstado_hABITACION;
    private javax.swing.JComboBox<String> jComboBoxTipo_Habtacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Piso;
    private javax.swing.JLabel jLabel_precio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinnerPrecion_habitacion;
    private javax.swing.JTextField jTextFieldNº_Habitacion;
    private javax.swing.JSpinner jspinner_piso;
    private javax.swing.JEditorPane jtextFieldDescripcion;
    private javax.swing.JTable tabla_Habitaciones;
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

    void Limpiar() {
        jTextFieldNº_Habitacion.setText("");
        jtextFieldDescripcion.setText("");
        jComboBoxTipo_Habtacion.setSelectedIndex(0);
        jComboBoxTipo_Habtacion.requestFocus();

        Botom_Modificar.setEnabled(false);
        Boton_Eliminar.setEnabled(false);
        Boton_Guardar.setEnabled(true);

    }

    void Guardar() {

        boolean verifica = jTextFieldNº_Habitacion.getText().isEmpty() || jtextFieldDescripcion.getText().isEmpty()
                || jComboBoxTipo_Habtacion.getSelectedIndex() == 0;

        if (verifica) {

            JOptionPane.showMessageDialog(this, " Por Favor Rellene Todos Los Campos ", "AVISO", JOptionPane.WARNING_MESSAGE);

        } else {

            int opcion = JOptionPane.showConfirmDialog(this, " Desea Guardar Los Datos ", " AVISO", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {

                try {
                    String sql = "INSERT INTO habitacion VALUES (?,?,?,?,?,? )";
                    PreparedStatement prst = con.prepareCall(sql);

                    prst.setString(1, jTextFieldNº_Habitacion.getText());
                    prst.setString(2, jComboBoxTipo_Habtacion.getSelectedItem().toString());
                    prst.setString(3, jtextFieldDescripcion.getText());
                    prst.setInt(4, (int) jspinner_piso.getValue());
                    prst.setString(5, jComboBoxEstado_hABITACION.getSelectedItem().toString());
                    prst.setString(6, jSpinnerPrecion_habitacion.getValue().toString());
                    int g = prst.executeUpdate();

                    if (g > 0) {

                        JOptionPane.showMessageDialog(rootPane, "Datos Guardados Satisfactoriamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                        Limpiar();
//                        jComboBoxTipo_Habtacion.requestFocus();
                        CargarDatos();
                    }

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(rootPane, "Error al Guardar Los Datos " + e, "VERIFICAR", JOptionPane.WARNING_MESSAGE);

                }

            }

        }

    }

    void CabezeraTabla() {

        modelo_habitacion.addColumn(" Codigo ");
        modelo_habitacion.addColumn(" Tipo ");
        modelo_habitacion.addColumn(" Descripcion ");
        modelo_habitacion.addColumn(" Piso  ");
        modelo_habitacion.addColumn(" Estado ");
        modelo_habitacion.addColumn(" Precio ");
        tabla_Habitaciones.setModel(modelo_habitacion);
    }

    void CargarDatos() {

        try {

            String cargar[] = new String[6];
            String consulta = "SELECT *  FROM habitacion ";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(consulta);

            int f = tabla_Habitaciones.getRowCount();
            for (int i = 0; i < f; i++) {
                modelo_habitacion.removeRow(0);
            }
            while (rs.next()) {

                cargar[0] = rs.getString("numero_habitacion");
                cargar[1] = rs.getString("tipo_habitacion");
                cargar[2] = rs.getString("descripcion_habitacion");
                cargar[3] = rs.getString("piso");
                cargar[4] = rs.getString("estado_habitacion");
                cargar[5] = rs.getString("precio_habitacion");
                modelo_habitacion.addRow(cargar);

            }

        } catch (Exception e) {
            System.out.println("" + e);
        }

    }

    void Eliminar() {

        try {

            int opcion = JOptionPane.showConfirmDialog(this, " Desea Eliminar el Regsitro Seleccionado ", " Confirmacion", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {

                int filaseleccionada = tabla_Habitaciones.getSelectedRow();
                String consultaEliminar = " DELETE FROM  habitacion  WHERE numero_habitacion=" + tabla_Habitaciones.getValueAt(filaseleccionada, 0);

                Statement sta = con.createStatement();
                int e = sta.executeUpdate(consultaEliminar);

                if (e > 0) {
                    JOptionPane.showMessageDialog(this, " Registro Eliminado Exitosamente ", " EXITO", JOptionPane.INFORMATION_MESSAGE);
                    CargarDatos();
                    Boton_Eliminar.setEnabled(false);
                    Botom_Modificar.setEnabled(false);
                }

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No Se Puede Eliminar, \n Ya Que Esta Habitacion esta Siendo Ocupada  ", " VERIFICAR ", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    void Modificar() {

        try {

            double precio = (double) jSpinnerPrecion_habitacion.getValue();
            int piso = (int) jspinner_piso.getValue();

            int filaS = tabla_Habitaciones.getSelectedRow();
            int opcion = JOptionPane.showConfirmDialog(this, " Desea Modificarlo ", " AVISO", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {

                String consulta = "UPDATE habitacion SET  precio_habitacion= ' " + precio + " ' , estado_habitacion='" + jComboBoxEstado_hABITACION.getSelectedItem()
                        + " ' ,  piso =' " + piso + " ' , descripcion_habitacion =' " + jtextFieldDescripcion.getText() + " '  , tipo_habitacion = ' " + jComboBoxTipo_Habtacion.getSelectedItem()
                        + "  ' WHERE numero_habitacion=' " + tabla_Habitaciones.getValueAt(filaS, 0) + "'";

                PreparedStatement prepa = con.prepareCall(consulta);
                int g = prepa.executeUpdate();
                if (g > 0) {
                    JOptionPane.showMessageDialog(this, " Datos Modificados Exitosamente ", " EXITO", JOptionPane.INFORMATION_MESSAGE);
                    CargarDatos();
                    Limpiar();
                    jComboBoxEstado_hABITACION.setEnabled(false);


                }

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, " ERROR " + e, " ERROR", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
