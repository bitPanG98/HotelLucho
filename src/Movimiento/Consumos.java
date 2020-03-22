/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimiento;

import Conectar.Conectar;
import javax.swing.table.DefaultTableModel;
import Movimiento.Movimiento_Huespedes.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Clarisse_Naoemi-PC
 */
public class Consumos extends javax.swing.JFrame {

    DefaultTableModel modelo_tablaConsumos = new DefaultTableModel();

    public Consumos() {
        initComponents();
        setResizable(false);
        setTitle("Administrador De Consumos");
        setLocationRelativeTo(null);

        Cabezera();
//        Cargar();
    Sumar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Consumos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelUsuarioHuesped = new javax.swing.JLabel();
        jLabel_NHabitacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_DNI = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTotalConsumos = new javax.swing.JTextField();
        Boton_AgregarConsumo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Boton_ModificarConsumo = new javax.swing.JButton();
        Boton_EliminarConsumo = new javax.swing.JButton();
        BotonCerra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabla_Consumos.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        tabla_Consumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº ", "Fecha", "Por Concepto De : ", "Importe"
            }
        ));
        jScrollPane1.setViewportView(tabla_Consumos);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelUsuarioHuesped.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel_NHabitacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Huesped :");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLabel1)
                .addComponent(jLabel3)
                .addComponent(jLabel4)
                .addComponent(jLabel_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Total Consumos :");

        jTextFieldTotalConsumos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

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

        Boton_ModificarConsumo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Boton_ModificarConsumo.setText("Modificar");

        Boton_EliminarConsumo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Boton_EliminarConsumo.setText("Eliminar");

        BotonCerra.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BotonCerra.setText("Cerrar");
        BotonCerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTotalConsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton_AgregarConsumo)
                        .addGap(18, 18, 18)
                        .addComponent(Boton_ModificarConsumo)
                        .addGap(18, 18, 18)
                        .addComponent(Boton_EliminarConsumo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonCerra)
                        .addContainerGap())))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTotalConsumos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Boton_EliminarConsumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCerra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Boton_AgregarConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton_ModificarConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_AgregarConsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_AgregarConsumoMouseClicked


    }//GEN-LAST:event_Boton_AgregarConsumoMouseClicked

    private void Boton_AgregarConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AgregarConsumoActionPerformed

        Datos_Consumo dc = new Datos_Consumo();
        dc.setVisible(true);

        String DNI = jLabel_DNI.getText();
        String N_hABIT = jLabel_NHabitacion.getText();

        Datos_Consumo.jLabel_nHabitacion.setText(N_hABIT);
        Datos_Consumo.jLabel_DNIhuesped.setText(DNI);

    }//GEN-LAST:event_Boton_AgregarConsumoActionPerformed

    private void BotonCerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerraActionPerformed

        dispose();
//        Movimiento_Huespedes mh = new Movimiento_Huespedes();
//        mh.setVisible(true);
    }//GEN-LAST:event_BotonCerraActionPerformed

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
            java.util.logging.Logger.getLogger(Consumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consumos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerra;
    private javax.swing.JButton Boton_AgregarConsumo;
    private javax.swing.JButton Boton_EliminarConsumo;
    private javax.swing.JButton Boton_ModificarConsumo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabelUsuarioHuesped;
    public static javax.swing.JLabel jLabel_DNI;
    public static javax.swing.JLabel jLabel_NHabitacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldTotalConsumos;
    public static javax.swing.JTable tabla_Consumos;
    // End of variables declaration//GEN-END:variables

    Conectar conect = new Conectar();
    Connection con = conect.Conectar();

    void Cabezera() {

        modelo_tablaConsumos.addColumn("Nº Consumo");
        modelo_tablaConsumos.addColumn("Fecha ");
        modelo_tablaConsumos.addColumn("Por Concepto De ");
        modelo_tablaConsumos.addColumn("Importe");
        tabla_Consumos.setModel(modelo_tablaConsumos);

    }

    void Cargar() {

        try {
            String mostrar[] = new String[4];

            String consulta = " SELECT * FROM consumos";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(consulta);

            int f = tabla_Consumos.getRowCount();
            for (int i = 0; i < f; i++) {
                modelo_tablaConsumos.removeRow(0);
            }
            while (rs.next()) {

                mostrar[0] = rs.getString("n_consumo");
                mostrar[1] = rs.getString("fecha_consumo");
                mostrar[2] = rs.getString("concepto_consumo");
                mostrar[3] = rs.getString("importe_consumo");
                modelo_tablaConsumos.addRow(mostrar);

            }
        } catch (SQLException ex) {

        }

    }

   
 void  Sumar(){
     double sumatoria =0;
     
     int total = tabla_Consumos.getRowCount();
     total -=1;
     for (int i = 0; i <= total; i++) {

         sumatoria = Double.parseDouble(String.valueOf(tabla_Consumos.getValueAt(i, 4)));
     }
     sumatoria = + sumatoria;
     System.out.println(""+sumatoria);
 }
}
