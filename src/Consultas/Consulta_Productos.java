package Consultas;

import Conectar.Conectar;
import Movimiento.Datos_Consumo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Consulta_Productos extends javax.swing.JFrame {
    
    DefaultTableModel modelo_tablaProductos = new DefaultTableModel();
    
    public Consulta_Productos() {
        initComponents();
        setTitle(" ** CONSULTA PRODUCTOS ** ");
        setResizable(false);
        setLocationRelativeTo(this);
        
        Cabezera();
        
        Cargar();
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem_EnviarDatos = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Productos = new javax.swing.JTable();
        Boton_Cerrrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Boton_Modificar = new javax.swing.JButton();
        Boton_Eliminar = new javax.swing.JButton();

        jMenuItem_EnviarDatos.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jMenuItem_EnviarDatos.setText("Enviar Datos");
        jMenuItem_EnviarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_EnviarDatosActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem_EnviarDatos);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabla_Productos.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_Productos.setComponentPopupMenu(jPopupMenu1);
        tabla_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Productos);

        Boton_Cerrrar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Cerrrar.setText("Cerrar");
        Boton_Cerrrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CerrrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Productos");

        Boton_Modificar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Modificar.setText("Modificar");
        Boton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ModificarActionPerformed(evt);
            }
        });

        Boton_Eliminar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Eliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(Boton_Modificar))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(Boton_Eliminar))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(Boton_Cerrrar))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton_Modificar)
                            .addComponent(Boton_Eliminar)
                            .addComponent(Boton_Cerrrar)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ProductosMouseClicked
    }//GEN-LAST:event_tabla_ProductosMouseClicked
    
    private void Boton_CerrrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CerrrarActionPerformed
        
        dispose();
    }//GEN-LAST:event_Boton_CerrrarActionPerformed
    
    private void jMenuItem_EnviarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EnviarDatosActionPerformed
        
        int filaseleccionada = tabla_Productos.getSelectedRow();
        Datos_Consumo.jLabel_Codigo_Pr.setText(tabla_Productos.getValueAt(filaseleccionada, 0).toString());
        Datos_Consumo.jtext_PorConcepto.setText(tabla_Productos.getValueAt(filaseleccionada, 1).toString() + " ");
//        Datos_Consumo.jTextField_ImporteConsumo.setText(tabla_Productos.getValueAt(filaseleccionada, 4).toString());
        Datos_Consumo.jLabel_PrecioU.setText(tabla_Productos.getValueAt(filaseleccionada, 4).toString());
        Datos_Consumo.jLabel_StockProducto.setText(tabla_Productos.getValueAt(filaseleccionada, 3).toString());
        
        dispose();
    }//GEN-LAST:event_jMenuItem_EnviarDatosActionPerformed
    
    private void Boton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_ModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Consulta_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_Productos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Cerrrar;
    public static javax.swing.JButton Boton_Eliminar;
    public static javax.swing.JButton Boton_Modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem_EnviarDatos;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla_Productos;
    // End of variables declaration//GEN-END:variables
    Conectar conect = new Conectar();
    Connection con = conect.Conectar();
    
    void Cabezera() {
        
        modelo_tablaProductos.addColumn("  Codigo ");
        modelo_tablaProductos.addColumn("  Nombre  ");
        modelo_tablaProductos.addColumn("  Descripcion  ");
        modelo_tablaProductos.addColumn(" Stock  ");
        modelo_tablaProductos.addColumn(" Precio U ");
        tabla_Productos.setModel(modelo_tablaProductos);
        
    }
    
    void Cargar() {
        
        try {
            String mostrar[] = new String[5];
            
            String consultaMostrar = " SELECT * FROM producto";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(consultaMostrar);
            int f = tabla_Productos.getRowCount();
            for (int i = 0; i < f; i++) {
                modelo_tablaProductos.removeRow(0);
            }
            while (rs.next()) {
                
                mostrar[0] = rs.getString("id_producto");
                mostrar[1] = rs.getString("nombre_producto");
                mostrar[2] = rs.getString("descripcion_producto");
                mostrar[3] = rs.getString("stock_producto");
                mostrar[4] = rs.getString("precioU_producto");
                modelo_tablaProductos.addRow(mostrar);
                
                
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(this, "Error al Cargar los Datos " + ex);
        }
        
    }
}
