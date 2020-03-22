/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimiento;

import Conectar.Conectar;
import Consultas.Consulta_Productos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Clarisse_Naoemi-PC
 */
public class Datos_Consumo extends javax.swing.JFrame {

    public Datos_Consumo() {
        initComponents();


        Datos_Consumo.this.setSize(477, 340);
        Datos_Consumo.this.setTitle(" * Mantenimiento Consumos * ");
        Datos_Consumo.this.setResizable(false);
        Datos_Consumo.this.setLocationRelativeTo(this);

        jLabel_Cantidad.setVisible(false);
        jSpinner_CantidadProductos.setVisible(false);

        Fecha();

        jLabel_DNIhuesped.setVisible(false);
        jLabel_nHabitacion.setVisible(false);
        jLabel_PrecioU.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_nºConsumo = new javax.swing.JTextField();
        jTextField_FechaEmision = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtext_PorConcepto = new javax.swing.JEditorPane();
        jLabel5 = new javax.swing.JLabel();
        jTextField_ImporteConsumo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Boton_Cerrar = new javax.swing.JButton();
        Boton_GuardarDatosConsumo = new javax.swing.JButton();
        jComboBox_PorConcepto = new javax.swing.JComboBox<String>();
        jLabel_nHabitacion = new javax.swing.JLabel();
        jLabel_DNIhuesped = new javax.swing.JLabel();
        Boton_ModificarConsumos = new javax.swing.JButton();
        jLabel_Cantidad = new javax.swing.JLabel();
        jSpinner_CantidadProductos = new javax.swing.JSpinner();
        jLabel_PrecioU = new javax.swing.JLabel();
        jLabel_StockProducto = new javax.swing.JLabel();
        jLabel_Codigo_Pr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Nº Consumo :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Fecha Emision :");

        jTextField_nºConsumo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTextField_FechaEmision.setEditable(false);
        jTextField_FechaEmision.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_FechaEmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FechaEmisionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Por Concepto De :");

        jtext_PorConcepto.setEditable(false);
        jtext_PorConcepto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jtext_PorConcepto);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Importe S/ :");

        jTextField_ImporteConsumo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        Boton_Cerrar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Cerrar.setText("Cerrar");
        Boton_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CerrarActionPerformed(evt);
            }
        });

        Boton_GuardarDatosConsumo.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_GuardarDatosConsumo.setText("Guardar");
        Boton_GuardarDatosConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarDatosConsumoActionPerformed(evt);
            }
        });

        jComboBox_PorConcepto.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jComboBox_PorConcepto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccionar>", "Productos", "Lavanderia", "Otros" }));
        jComboBox_PorConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_PorConceptoActionPerformed(evt);
            }
        });

        Boton_ModificarConsumos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Boton_ModificarConsumos.setText("Modificar");
        Boton_ModificarConsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ModificarConsumosActionPerformed(evt);
            }
        });

        jLabel_Cantidad.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel_Cantidad.setText("Cantidad :");

        jSpinner_CantidadProductos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jSpinner_CantidadProductos.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel_PrecioU.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_nHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_StockProducto)
                .addGap(60, 60, 60)
                .addComponent(jLabel_Codigo_Pr)
                .addGap(124, 124, 124)
                .addComponent(jLabel_PrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_DNIhuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_ImporteConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_PorConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_CantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_nºConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_FechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(Boton_ModificarConsumos)
                .addGap(18, 18, 18)
                .addComponent(Boton_GuardarDatosConsumo)
                .addGap(18, 18, 18)
                .addComponent(Boton_Cerrar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Cantidad)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_nHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_StockProducto)
                        .addComponent(jLabel_Codigo_Pr))
                    .addComponent(jLabel_DNIhuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_PrecioU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_nºConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_FechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox_PorConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Cantidad)
                    .addComponent(jSpinner_CantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_ImporteConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_ModificarConsumos)
                    .addComponent(Boton_GuardarDatosConsumo)
                    .addComponent(Boton_Cerrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

            jLabel_Cantidad.setVisible(true);
            jSpinner_CantidadProductos.setVisible(true);
            jtext_PorConcepto.setEditable(true);

        } else if (indice == 2) {

            jtext_PorConcepto.setEditable(false);
            jtext_PorConcepto.setText(" Lavanderia ");

            jLabel_Cantidad.setVisible(false);
            jSpinner_CantidadProductos.setVisible(false);
        } else if (indice == 3) {

            jtext_PorConcepto.setEditable(true);
            jtext_PorConcepto.setText("");
            jTextField_ImporteConsumo.setText("");
            jLabel_Cantidad.setVisible(false);
            jSpinner_CantidadProductos.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox_PorConceptoActionPerformed

    private void Boton_GuardarDatosConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarDatosConsumoActionPerformed

        guardarConsumo();

    }//GEN-LAST:event_Boton_GuardarDatosConsumoActionPerformed

    private void Boton_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_Boton_CerrarActionPerformed

    private void Boton_ModificarConsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ModificarConsumosActionPerformed
        ModificarConsumos();
    }//GEN-LAST:event_Boton_ModificarConsumosActionPerformed

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
            java.util.logging.Logger.getLogger(Datos_Consumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_Consumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_Consumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_Consumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_Consumo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Cerrar;
    public static javax.swing.JButton Boton_GuardarDatosConsumo;
    public static javax.swing.JButton Boton_ModificarConsumos;
    public static javax.swing.JComboBox<String> jComboBox_PorConcepto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Cantidad;
    public static javax.swing.JLabel jLabel_Codigo_Pr;
    public static javax.swing.JLabel jLabel_DNIhuesped;
    public static javax.swing.JLabel jLabel_PrecioU;
    public static javax.swing.JLabel jLabel_StockProducto;
    public static javax.swing.JLabel jLabel_nHabitacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner_CantidadProductos;
    public static javax.swing.JTextField jTextField_FechaEmision;
    public static javax.swing.JTextField jTextField_ImporteConsumo;
    public static javax.swing.JTextField jTextField_nºConsumo;
    public static javax.swing.JEditorPane jtext_PorConcepto;
    // End of variables declaration//GEN-END:variables
    Conectar conect = new Conectar();
    Connection con = conect.Conectar();

    void guardarConsumo() {

        boolean verifica = jTextField_nºConsumo.getText().isEmpty() || jComboBox_PorConcepto.getSelectedIndex() == 0
                || jtext_PorConcepto.getText().isEmpty();

        if (verifica) {

            JOptionPane.showMessageDialog(this, "PorFavor Rellene Todos Los Campos ", "AVISO ", JOptionPane.WARNING_MESSAGE);

        } else {

            try {

                int indice = jComboBox_PorConcepto.getSelectedIndex();
                jComboBox_PorConcepto.setSelectedIndex(indice);

                if (indice == 1) {

                    String captura = "";

                    int descontar = (int) jSpinner_CantidadProductos.getValue();
                    int stock = Integer.parseInt(jLabel_StockProducto.getText());
                    int codigo_P = Integer.parseInt(jLabel_Codigo_Pr.getText());
                    int desc_final;

//                    String consul = "SELECT * FROM producto WHERE  id_producto='" + codigo_P + "'";
//
//                    Statement sta = con.createStatement();
//                    ResultSet rs = sta.executeQuery(consul);
//                    while (rs.next()) {
//                        captura = rs.getString(4);
//                    }


                    if (descontar > stock || stock < descontar) {

                        JOptionPane.showMessageDialog(this, " La Cantidad Ingresada ,Sobrepasa El Stock Actual Del Producto ", " VERIFICAR", JOptionPane.WARNING_MESSAGE);
                        
                    } else {

                        try {
                            
                      
                        int cantidad = (int) jSpinner_CantidadProductos.getValue();
                        double precioU = Double.parseDouble(jLabel_PrecioU.getText());
                        double importe;

                        String consultaGuardar = " INSERT INTO  consumos VALUES(?,?,?,?,?,?,?)";
                        PreparedStatement prep = con.prepareStatement(consultaGuardar);

                        importe = precioU * cantidad;
                        jTextField_ImporteConsumo.setText("" + importe);

                        prep.setString(1, null);
                        prep.setString(2, jTextField_FechaEmision.getText());
                        prep.setString(3, jComboBox_PorConcepto.getSelectedItem().toString());
                        prep.setString(4, jtext_PorConcepto.getText());
                        prep.setString(5, jTextField_ImporteConsumo.getText());

                        prep.setString(6, jLabel_DNIhuesped.getText());
                        prep.setString(7, jLabel_nHabitacion.getText());

                        int g = prep.executeUpdate();
                        if (g > 0) {

                            JOptionPane.showMessageDialog(this, " Datos Guardados Correctamete ", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                            Limpiar2();
                        } else {

                            JOptionPane.showMessageDialog(this, " Error Al Guardar Los Datos ", "AVISO", JOptionPane.WARNING_MESSAGE);
                        }


                        //===========================================================================0
                        //Modifcar Estock En Producto
                        desc_final = ((stock) - descontar);
                        String modificarStock = "UPDATE producto SET stock_producto='" + desc_final + "' WHERE id_producto = '" + codigo_P + "'";
                        PreparedStatement pst = con.prepareStatement(modificarStock);
                        pst.executeUpdate();
                        //===========================================================================0
                 
                          } catch (SQLException e) {
                              System.out.println("eror" +e);
                        }
                        
                    
                    }//llave 





                } else {

                    String consultaGuardar = " INSERT INTO  consumos VALUES(?,?,?,?,?,?,?)";
                    PreparedStatement prep = con.prepareStatement(consultaGuardar);



                    prep.setString(1, null);
                    prep.setString(2, jTextField_FechaEmision.getText());
                    prep.setString(3, jComboBox_PorConcepto.getSelectedItem().toString());
                    prep.setString(4, jtext_PorConcepto.getText());
                    prep.setString(5, jTextField_ImporteConsumo.getText());

                    prep.setString(6, jLabel_DNIhuesped.getText());
                    prep.setString(7, jLabel_nHabitacion.getText());

                    int g = prep.executeUpdate();
                    if (g > 0) {
                        JOptionPane.showMessageDialog(this, " Datos Guardados Correctamete ", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                        Limpiar2();
                    } else {
                        JOptionPane.showMessageDialog(this, " Error Al Guardar Los Datos ", "AVISO", JOptionPane.WARNING_MESSAGE);
                    }



                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, " Error Al Guardar Los Datos " + ex, "AVISO", JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    void Fecha() {

        SimpleDateFormat formato = new SimpleDateFormat("dd - MM - YYYY");
        Date dat = new Date();
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

    void ModificarConsumos() {

        try {

            int indice = jComboBox_PorConcepto.getSelectedIndex();
            jComboBox_PorConcepto.setSelectedIndex(indice);

            if (indice == 1) {

                int descontar = (int) jSpinner_CantidadProductos.getValue();
                int stock = Integer.parseInt(jLabel_StockProducto.getText());
                int codigo_P = Integer.parseInt(jLabel_Codigo_Pr.getText());
                int desc_final;

                int cantidad = (int) jSpinner_CantidadProductos.getValue();
                double precioU = Double.parseDouble(jLabel_PrecioU.getText());
                double importe;
                importe = precioU * cantidad;
                jTextField_ImporteConsumo.setText("" + importe);


                String consulta = "UPDATE consumos SET concepto_consumo=' " + jComboBox_PorConcepto.getSelectedItem()
                        + " ' ,descripcion_consumo =' " + jtext_PorConcepto.getText()
                        + " ', importe_consumo =' " + jTextField_ImporteConsumo.getText() + " ' WHERE id_consumo ='" + jTextField_nºConsumo.getText() + "'";

                PreparedStatement prepa = con.prepareStatement(consulta);
                int g = prepa.executeUpdate();

                //===========================================================================0
                //Modifcar Estock En Producto
                desc_final = ((stock) - descontar);
                String modificarStock = "UPDATE producto SET stock_producto='" + desc_final + "' WHERE id_producto = '" + codigo_P + "'";
                PreparedStatement pst = con.prepareStatement(modificarStock);
                pst.executeUpdate();
                //=============================================================================0
                if (g > 0) {

                    JOptionPane.showMessageDialog(this, " Datos Modificados Exitosamente ", " EXITO ", JOptionPane.INFORMATION_MESSAGE);
                    Limpiar2();
                }

            } else {



                String consulta = "UPDATE consumos SET concepto_consumo=' " + jComboBox_PorConcepto.getSelectedItem()
                        + " ' ,descripcion_consumo =' " + jtext_PorConcepto.getText()
                        + " ', importe_consumo =' " + jTextField_ImporteConsumo.getText() + " ' WHERE id_consumo ='" + jTextField_nºConsumo.getText() + "'";

                PreparedStatement prepa = con.prepareStatement(consulta);
                int g = prepa.executeUpdate();

                if (g > 0) {

                    JOptionPane.showMessageDialog(this, " Datos Modificados Exitosamente ", " EXITO ", JOptionPane.INFORMATION_MESSAGE);
                    Limpiar2();
                }
            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(this, " Error Al Guardar " + e, " AVISO ", JOptionPane.WARNING_MESSAGE);

        }

    }

    void Limpiar2() {
        jComboBox_PorConcepto.setSelectedIndex(0);
        jtext_PorConcepto.setText("");
        jSpinner_CantidadProductos.setValue(1);
        jTextField_ImporteConsumo.setText("");

    }
}
