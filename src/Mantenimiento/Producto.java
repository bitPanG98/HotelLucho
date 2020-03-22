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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Clarisse_Naoemi-PC
 */
public class Producto extends javax.swing.JFrame {

    DefaultTableModel modelo_producto = new DefaultTableModel();

    public Producto() {
        initComponents();

        Producto.this.setResizable(false);
        Producto.this.setLocationRelativeTo(null);
        Producto.this.setTitle(" Mantenimiento Producto");
        setResizable(false);

        CabezeraTabla();
        CargarDatos();

        Boton_Modificar.setEnabled(false);
        Boton_Eliminar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuItem_Seleccionar = new javax.swing.JMenuItem();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldId_Producto = new javax.swing.JTextField();
        jTextFieldNombreProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPrecioU = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtextDescripcion = new javax.swing.JEditorPane();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Boton_Guardar = new javax.swing.JButton();
        Boton_Cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_producto = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Boton_Eliminar = new javax.swing.JButton();
        Boton_Modificar = new javax.swing.JButton();
        Boton_Cerrar = new javax.swing.JButton();

        menuItem_Seleccionar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        menuItem_Seleccionar.setText("Seleccionar a Modificar");
        menuItem_Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_SeleccionarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuItem_Seleccionar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripcion :");

        jTextFieldId_Producto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldId_Producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldId_ProductoKeyTyped(evt);
            }
        });

        jTextFieldNombreProducto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Stock :");

        jTextFieldStock.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldStockKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio U :");

        jTextFieldPrecioU.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Id :");

        jtextDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(jtextDescripcion);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre :");

        Boton_Guardar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Guardar.setText("Guardar");
        Boton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarActionPerformed(evt);
            }
        });

        Boton_Cancelar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Cancelar.setText("Cancelar");
        Boton_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CancelarActionPerformed(evt);
            }
        });

        tabla_producto.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        tabla_producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_producto.setComponentPopupMenu(jPopupMenu1);
        tabla_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_productoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_producto);

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

        Boton_Cerrar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Cerrar.setText("Cerrrar");
        Boton_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Boton_Eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton_Cerrar))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jTextFieldPrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jTextFieldId_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jTextFieldNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(Boton_Guardar)
                        .addGap(29, 29, 29)
                        .addComponent(Boton_Cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel4)
                        .addGap(105, 105, 105)
                        .addComponent(jTextFieldPrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldId_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel5)))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Guardar)
                    .addComponent(Boton_Cancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Eliminar)
                    .addComponent(Boton_Modificar)
                    .addComponent(Boton_Cerrar))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldId_ProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldId_ProductoKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_jTextFieldId_ProductoKeyTyped

    private void jTextFieldStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldStockKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_jTextFieldStockKeyTyped

    private void Boton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarActionPerformed
        Guardar();
    }//GEN-LAST:event_Boton_GuardarActionPerformed

    private void Boton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CancelarActionPerformed
        Limpiar();
        Boton_Modificar.setEnabled(false);
        Boton_Eliminar.setEnabled(false);
        Boton_Guardar.setEnabled(true);
        jTextFieldId_Producto.setEditable(true);


    }//GEN-LAST:event_Boton_CancelarActionPerformed

    private void Boton_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CerrarActionPerformed
        Producto.this.dispose();
    }//GEN-LAST:event_Boton_CerrarActionPerformed

    private void Boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarActionPerformed
        Eliminar();
    }//GEN-LAST:event_Boton_EliminarActionPerformed

    private void Boton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ModificarActionPerformed
        Modificar();
    }//GEN-LAST:event_Boton_ModificarActionPerformed

    private void tabla_productoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_productoMousePressed

        Boton_Eliminar.setEnabled(true);
        Boton_Modificar.setEnabled(false);


    }//GEN-LAST:event_tabla_productoMousePressed

    private void menuItem_SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_SeleccionarActionPerformed

        Boton_Modificar.setEnabled(true);
        Boton_Eliminar.setEnabled(false);
        Boton_Guardar.setEnabled(false);
        jTextFieldId_Producto.setEditable(false);

        int filaS = tabla_producto.getSelectedRow();

        jTextFieldId_Producto.setText(tabla_producto.getValueAt(filaS, 0).toString());
        jTextFieldNombreProducto.setText(tabla_producto.getValueAt(filaS, 1).toString());
        jtextDescripcion.setText(tabla_producto.getValueAt(filaS, 2).toString());
        jTextFieldStock.setText(tabla_producto.getValueAt(filaS, 3).toString());
        jTextFieldPrecioU.setText(tabla_producto.getValueAt(filaS, 4).toString());


    }//GEN-LAST:event_menuItem_SeleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Cancelar;
    private javax.swing.JButton Boton_Cerrar;
    private javax.swing.JButton Boton_Eliminar;
    private javax.swing.JButton Boton_Guardar;
    private javax.swing.JButton Boton_Modificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldId_Producto;
    private javax.swing.JTextField jTextFieldNombreProducto;
    private javax.swing.JTextField jTextFieldPrecioU;
    private javax.swing.JTextField jTextFieldStock;
    private javax.swing.JEditorPane jtextDescripcion;
    private javax.swing.JMenuItem menuItem_Seleccionar;
    private javax.swing.JTable tabla_producto;
    // End of variables declaration//GEN-END:variables
    Conectar conectr = new Conectar();
    Connection con = conectr.Conectar();

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

    private void Guardar() {

        boolean verificar = jTextFieldNombreProducto.getText().isEmpty() || jTextFieldNombreProducto.getText().isEmpty() || jTextFieldPrecioU.getText().isEmpty()
                || jTextFieldStock.getText().isEmpty() || jtextDescripcion.getText().isEmpty();

        if (verificar) {

            JOptionPane.showMessageDialog(this, " PorFavor Rellene Todos Los Campos ", " AVISO ", JOptionPane.WARNING_MESSAGE);

        } else {

            try {

                int opcion = JOptionPane.showConfirmDialog(this, " Desea Guardar Los Datos ", " AVISO", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {

                    String sql = "INSERT INTO producto  VALUES(?,?,?,?,?) ";

                    PreparedStatement prst = con.prepareCall(sql);
                    prst.setString(1, null);
                    prst.setString(2, jTextFieldNombreProducto.getText());
                    prst.setString(3, jtextDescripcion.getText());
                    prst.setString(4, jTextFieldStock.getText());
                    prst.setString(5, jTextFieldPrecioU.getText());

                    int a = prst.executeUpdate();
                    if (a > 0) {

                        JOptionPane.showMessageDialog(null, " Datos De Producto Guardado ", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                        CargarDatos();
                        Limpiar();

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error al Guardar Datos De Producto", "Aviso ", JOptionPane.WARNING_MESSAGE);
                    }

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, " Error  " + e, "Verificar", JOptionPane.WARNING_MESSAGE);

            }
        }

    }

    private void Limpiar() {
        jTextFieldId_Producto.setText("");
        jTextFieldNombreProducto.setText("");
        jTextFieldPrecioU.setText("");
        jTextFieldStock.setText("");
        jtextDescripcion.setText("");
        jTextFieldNombreProducto.requestFocus();


        Boton_Modificar.setEnabled(false);
        Boton_Eliminar.setEnabled(false);
        Boton_Guardar.setEnabled(true);
    }

    private void CabezeraTabla() {

        modelo_producto.addColumn(" Codigo ");
        modelo_producto.addColumn(" Nombre  ");
        modelo_producto.addColumn(" Descripcion ");
        modelo_producto.addColumn(" Stock ");
        modelo_producto.addColumn(" Precio U");
        tabla_producto.setModel(modelo_producto);

    }

    private void CargarDatos() {

        try {

            String cargar[] = new String[5];
            String consulta = "SELECT *  FROM producto ";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(consulta);

            int f = tabla_producto.getRowCount();
            for (int i = 0; i < f; i++) {
                modelo_producto.removeRow(0);
            }
            while (rs.next()) {

                cargar[0] = rs.getString("id_producto");
                cargar[1] = rs.getString("nombre_producto");
                cargar[2] = rs.getString("descripcion_producto");
                cargar[3] = rs.getString("stock_producto");
                cargar[4] = rs.getString("precioU_producto");
                modelo_producto.addRow(cargar);

            }

        } catch (Exception e) {
            System.out.println("" + e);
        }

    }

    void Eliminar() {

        try {
            int elegir = tabla_producto.getRowCount();

            if (elegir == -1) {
                JOptionPane.showMessageDialog(this, " Seleccione Un Registro  ", " AVIS", JOptionPane.WARNING_MESSAGE);
            } else {
                int opcion = JOptionPane.showConfirmDialog(this, " Desea Eliminar El Registro Seleccionado  ", " AVISO", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {

                    int filaS = tabla_producto.getSelectedRow();
                    String consultaEliminar = "DELETE FROM producto WHERE id_producto =" + tabla_producto.getValueAt(filaS, 0);

                    Statement sta = con.createStatement();
                    int e = sta.executeUpdate(consultaEliminar);
                    if (e > 0) {
                        JOptionPane.showMessageDialog(this, " Regsitro Eliminado Exitosamente ", " EXITO ", JOptionPane.INFORMATION_MESSAGE);
                        CargarDatos();
                        Boton_Eliminar.setEnabled(false);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, " Error  " + e, " ERROR ", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    void Modificar() {

        try {

            boolean verificar = jTextFieldNombreProducto.getText().isEmpty() || jTextFieldNombreProducto.getText().isEmpty() || jTextFieldPrecioU.getText().isEmpty()
                    || jTextFieldStock.getText().isEmpty() || jtextDescripcion.getText().isEmpty();

            if (verificar) {

                JOptionPane.showMessageDialog(this, " PorFavor Rellene Todos Los Campos ", " AVISO ", JOptionPane.WARNING_MESSAGE);

            } else {

                int opcion = JOptionPane.showConfirmDialog(this, " Desea Modificar El Registro Seleccionado  ", " AVISO", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {

                    String consultaTelefono = " UPDATE producto SET  nombre_producto ='" + jTextFieldNombreProducto.getText() + "', descripcion_producto='"
                            + jtextDescripcion.getText() + "' , stock_producto ='" + jTextFieldStock.getText() + "', precioU_producto =' " + jTextFieldPrecioU.getText()
                            + "' WHERE id_producto = '" + jTextFieldId_Producto.getText() + "'";

                    PreparedStatement prepa1 = con.prepareCall(consultaTelefono);

                    int mt = prepa1.executeUpdate();

                    if (mt > 0) {
                        JOptionPane.showMessageDialog(this, " Regsitro Modificado Exitosamente ", " EXITO", JOptionPane.INFORMATION_MESSAGE);
                        CargarDatos();
                        Limpiar();
                        Boton_Modificar.setEnabled(false);
                        jTextFieldId_Producto.setEditable(true);

                    }
                }

            }
        } catch (SQLException e) {
            System.out.println("" + e);
        }

    }
}
