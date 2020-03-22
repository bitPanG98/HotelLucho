/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;

import Conectar.Conectar;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.math.BigInteger;
//import static java.awt.SystemColor.text;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
//import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Clarisse_Naoemi-PC
 */
public class Usuario extends javax.swing.JFrame {

    DefaultTableModel modelo_usuario = new DefaultTableModel();
    Statement st = null;

    public Usuario() {
        initComponents();

        AutoCompletar(0);

        Usuario.this.setLocationRelativeTo(null);
        Usuario.this.setResizable(false);
        Usuario.this.setTitle(" Mantenimiento Usuarios ");

        CabezeraTabla();
        CargarDatos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuItem_Selleccionar = new javax.swing.JMenuItem();
        jcombobox_TipoUsuario = new javax.swing.JComboBox();
        JtextFieldContraseña = new javax.swing.JPasswordField();
        jtextFieldUsuario_U = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Boton_Guardar = new javax.swing.JButton();
        Boton_Cancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuario = new javax.swing.JTable();
        Botn_Eliminar = new javax.swing.JButton();
        Boton_Modifcar = new javax.swing.JButton();
        jLabel_Contraseña_Cidfi = new javax.swing.JLabel();

        menuItem_Selleccionar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        menuItem_Selleccionar.setText("Seleccionar a Modificar");
        menuItem_Selleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_SelleccionarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuItem_Selleccionar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jcombobox_TipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jcombobox_TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Recepcionista" }));

        JtextFieldContraseña.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jtextFieldUsuario_U.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtextFieldUsuario_U.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextFieldUsuario_UKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("* Usuario :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("* Password:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("* Tipo Usuario:");

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

        tabla_usuario.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        tabla_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_usuario.setComponentPopupMenu(jPopupMenu1);
        tabla_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_usuarioMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_usuario);

        Botn_Eliminar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Botn_Eliminar.setText("Eliminar");
        Botn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botn_EliminarActionPerformed(evt);
            }
        });

        Boton_Modifcar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Modifcar.setText("Modificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JtextFieldContraseña)
                    .addComponent(jtextFieldUsuario_U)
                    .addComponent(jcombobox_TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Botn_Eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_Modifcar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton_Guardar)
                .addGap(18, 18, 18)
                .addComponent(Boton_Cancelar)
                .addGap(64, 64, 64))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel_Contraseña_Cidfi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_Contraseña_Cidfi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtextFieldUsuario_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JtextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcombobox_TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Guardar)
                    .addComponent(Boton_Cancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botn_Eliminar)
                    .addComponent(Boton_Modifcar))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botn_EliminarActionPerformed
        Eliminar();
    }//GEN-LAST:event_Botn_EliminarActionPerformed

    private void Boton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CancelarActionPerformed
        Limpiar();
    }//GEN-LAST:event_Boton_CancelarActionPerformed

    private void jtextFieldUsuario_UKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextFieldUsuario_UKeyTyped

//        char c = evt.getKeyChar();
//        if ((c < '0' || c > '9')) {
//            evt.consume();
//        }

    }//GEN-LAST:event_jtextFieldUsuario_UKeyTyped

    private void Boton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarActionPerformed
        try {
            Guardar();
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_Boton_GuardarActionPerformed

    private void tabla_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuarioMousePressed


    }//GEN-LAST:event_tabla_usuarioMousePressed

    private void menuItem_SelleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_SelleccionarActionPerformed

        int filaS = tabla_usuario.getSelectedRow();
        jtextFieldUsuario_U.setText(tabla_usuario.getValueAt(filaS, 1).toString());
        JtextFieldContraseña.setText(tabla_usuario.getValueAt(filaS, 2).toString());

        jLabel_Contraseña_Cidfi.setText(tabla_usuario.getValueAt(filaS, 2).toString());

//


    }//GEN-LAST:event_menuItem_SelleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botn_Eliminar;
    private javax.swing.JButton Boton_Cancelar;
    private javax.swing.JButton Boton_Guardar;
    private javax.swing.JButton Boton_Modifcar;
    private javax.swing.JPasswordField JtextFieldContraseña;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Contraseña_Cidfi;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox jcombobox_TipoUsuario;
    private javax.swing.JTextField jtextFieldUsuario_U;
    private javax.swing.JMenuItem menuItem_Selleccionar;
    private javax.swing.JTable tabla_usuario;
    // End of variables declaration//GEN-END:variables

    Conectar coneect = new Conectar();
    Connection con = coneect.Conectar();

    void CabezeraTabla() {

        modelo_usuario.addColumn(" Codigo  ");
        modelo_usuario.addColumn("Usuario ( DNI) ");
        modelo_usuario.addColumn("Contraseña");
        tabla_usuario.setModel(modelo_usuario);

    }

    void CargarDatos() {

        Statement sta = null;
        String sql = "SELECT * FROM usuarios";
        String mostrar[] = new String[43];

        try {
            int f;
            sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql);

            //Codigo para hacer que cuando se meuestren los datos al momento de presionar
            //de nuevo el boton Mostrar registros tya no se vuelvan a repetir
            f = tabla_usuario.getRowCount();
            for (int j = 0; j < f; j++) {
                modelo_usuario.removeRow(0);
            }

            while (rs.next()) {
                mostrar[0] = rs.getString("id_usuario");
                mostrar[1] = rs.getString("usuario");
                mostrar[2] = rs.getString("contraseña");
                modelo_usuario.addRow(mostrar);
            }

        } catch (SQLException ex) {

        }

    }

    void Limpiar() {

        jtextFieldUsuario_U.setText("");
        JtextFieldContraseña.setText("");
        jtextFieldUsuario_U.requestFocus();

    }

    private void Eliminar() {

        int fila_seleccionada = tabla_usuario.getSelectedRow();

        if (fila_seleccionada < 0) {
            String mensaje = "<html> <body> <b style = \" font-size : 12; color :red; \"> Seleccione Un Registro De la Tabla </b> </body> </html>";
            JOptionPane.showMessageDialog(null, mensaje);
        } else {

            String sql;
            int resp;
            String mensaje = "<html> <body> <b style = \" font-size : 12; color :red; \"> ¿Deseas Eliminar El Usuario? </b> </body> </html>";
            resp = JOptionPane.showConfirmDialog(null, mensaje, "Pregunta", JOptionPane.INFORMATION_MESSAGE);

            if (resp == 0) {

                try {
                    int registros = tabla_usuario.getSelectedRow();
                    sql = "DELETE FROM usuarios where id_usuario=" + tabla_usuario.getValueAt(registros, 0);

                    st = con.createStatement();
                    int n = st.executeUpdate(sql);

                    if (n > 0) {
                        String mensaje1 = "<html> <body> <b style = \" font-size : 12; color :red; \">Usuario Eliminado exitosamente  </b> </body> </html>";
                        JOptionPane.showMessageDialog(null, mensaje1, "Aviso", JOptionPane.WARNING_MESSAGE);
                        CargarDatos();
                    }

                } catch (SQLException | HeadlessException e) {

                }
            }
        }

    }

    void Guardar() throws InvalidKeyException, NoSuchAlgorithmException {

        boolean verificar = jtextFieldUsuario_U.getText().isEmpty() || JtextFieldContraseña.getText().isEmpty() ;

        if (verificar) {
            JOptionPane.showMessageDialog(null, " PorFavor Rellene Todos Los Campos", "Aviso", JOptionPane.WARNING_MESSAGE);

        } else {

            try {
                String tipo, sql;
             

                    String pass = JtextFieldContraseña.getText();
              
                    
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update(pass.getBytes(), 0 , pass.length());
                    pass = new BigInteger(1, md.digest()).toString();
                    
                    //=================================================================================
                    sql = "INSERT INTO usuarios VALUES(?,?,?,?)";
                    PreparedStatement pst = con.prepareCall(sql);
                    pst.setString(1, null);
                    pst.setString(2, jtextFieldUsuario_U.getText());
//                    pst.setString(3, encryptedString);
                    pst.setString(3, pass);
                    pst.setString(4, jcombobox_TipoUsuario.getSelectedItem().toString());
                    

                    int a = pst.executeUpdate();
                    if (a > 0) {
                        String mensaje = "<html> <body> <b style = \" font-size : 12; color :red; \">  Usuario registrado </b> </body> </html>";
                        JOptionPane.showMessageDialog(null, mensaje);
                        Limpiar();
                        CargarDatos();

                    }
                    //===========================================================================================      


            } catch (SQLException sqlE) {

//                String mensaje = "<html> <body> <b style = \" font-size : 12; color :red; \"> Ya existe un Usuario con un mismo Id </b> </body> </html>";
                JOptionPane.showMessageDialog(null, ","+sqlE);

            } 
            //===========================================================================================================
        }

    }

    public void AutoCompletar(int op) {
        // crear la variable acutocompletar
        TextAutoCompleter ac = new TextAutoCompleter(jtextFieldUsuario_U);

        switch (op) {
            // Caso por "ID"
            case 0:
                try {
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select dni_empleado from empleado");
                    ac.removeAll();
                    while (rs.next()) {
                        ac.addItem(rs.getString("dni_empleado"));
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;

        }
    }
}
