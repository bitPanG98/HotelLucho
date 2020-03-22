package Hacer_habitacion;

import Clases.MyRenderer;
import Conectar.Conectar;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Hacer_habitacion.hacer_habitacion.*;

public class buscar_habitacion extends javax.swing.JFrame {

    DefaultTableModel modelotablaBuscarHabitaciones = new DefaultTableModel();
    private TableRowSorter Filtrar;

    public buscar_habitacion() {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);
        
        Cabezera();
        AparienciaCabezera();

        MostrarDisponibles();

        jLabel1.setVisible(false);
        jTextFieldBuscarTipo.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem_EnviarDatos = new javax.swing.JMenuItem();
        jRadioButtonDisponibles_Habitaciones = new javax.swing.JRadioButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_HabitacionesBuscar = new javax.swing.JTable();
        jRadioButtonTipo_Habitacion = new javax.swing.JRadioButton();
        jTextFieldBuscarTipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Boton_Cerrar = new javax.swing.JButton();

        jMenuItem_EnviarDatos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jMenuItem_EnviarDatos.setText("Enviar Datos");
        jMenuItem_EnviarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_EnviarDatosActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem_EnviarDatos);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(jRadioButtonDisponibles_Habitaciones);
        jRadioButtonDisponibles_Habitaciones.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jRadioButtonDisponibles_Habitaciones.setSelected(true);
        jRadioButtonDisponibles_Habitaciones.setText("Disponibles");
        jRadioButtonDisponibles_Habitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonDisponibles_HabitacionesMousePressed(evt);
            }
        });

        tabla_HabitacionesBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        tabla_HabitacionesBuscar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tabla_HabitacionesBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_HabitacionesBuscar.setComponentPopupMenu(jPopupMenu1);
        tabla_HabitacionesBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_HabitacionesBuscarMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_HabitacionesBuscar);

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        buttonGroup1.add(jRadioButtonTipo_Habitacion);
        jRadioButtonTipo_Habitacion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jRadioButtonTipo_Habitacion.setText("Tipo");
        jRadioButtonTipo_Habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTipo_HabitacionActionPerformed(evt);
            }
        });

        jTextFieldBuscarTipo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldBuscarTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarTipoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarTipoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Tipo :");

        Boton_Cerrar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Boton_Cerrar.setText("Cerrar");
        Boton_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLayeredPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldBuscarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(229, 229, 229))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioButtonDisponibles_Habitaciones)
                                .addGap(55, 55, 55)
                                .addComponent(jRadioButtonTipo_Habitacion)
                                .addGap(283, 283, 283))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Boton_Cerrar)
                                .addGap(359, 359, 359))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonDisponibles_Habitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonTipo_Habitacion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldBuscarTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Cerrar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonDisponibles_HabitacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonDisponibles_HabitacionesMousePressed
        jLabel1.setVisible(false);
        jTextFieldBuscarTipo.setVisible(false);
        MostrarDisponibles();

    }//GEN-LAST:event_jRadioButtonDisponibles_HabitacionesMousePressed

    private void jTextFieldBuscarTipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarTipoKeyReleased
    }//GEN-LAST:event_jTextFieldBuscarTipoKeyReleased

    private void jTextFieldBuscarTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarTipoKeyTyped

        jTextFieldBuscarTipo.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {

                String cadena = (jTextFieldBuscarTipo.getText());
                jTextFieldBuscarTipo.setText(cadena);
                repaint();
                filtro();
            }
        });
        Filtrar = new TableRowSorter(tabla_HabitacionesBuscar.getModel());
        tabla_HabitacionesBuscar.setRowSorter(Filtrar);

    }//GEN-LAST:event_jTextFieldBuscarTipoKeyTyped

    private void jRadioButtonTipo_HabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTipo_HabitacionActionPerformed
        jTextFieldBuscarTipo.setVisible(true);
        jLabel1.setVisible(true);

    }//GEN-LAST:event_jRadioButtonTipo_HabitacionActionPerformed

    private void Boton_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_Boton_CerrarActionPerformed

    private void tabla_HabitacionesBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_HabitacionesBuscarMousePressed

     


    }//GEN-LAST:event_tabla_HabitacionesBuscarMousePressed

    private void jMenuItem_EnviarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EnviarDatosActionPerformed

        int filaseleccionada = tabla_HabitacionesBuscar.getSelectedRow();
        
        hacer_habitacion.jTextFieldNºHabitaciopn.setText(tabla_HabitacionesBuscar.getValueAt(filaseleccionada, 0).toString());
        hacer_habitacion.jComboBoxTipo_Habtacion.setText(tabla_HabitacionesBuscar.getValueAt(filaseleccionada, 1).toString());
        hacer_habitacion.jTextFielddescripcion.setText(tabla_HabitacionesBuscar.getValueAt(filaseleccionada, 2).toString());
        hacer_habitacion.jTextFieldPrecio.setText(tabla_HabitacionesBuscar.getValueAt(filaseleccionada, 4).toString());

        dispose();
    }//GEN-LAST:event_jMenuItem_EnviarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(buscar_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscar_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscar_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscar_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscar_habitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Cerrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuItem jMenuItem_EnviarDatos;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButtonDisponibles_Habitaciones;
    private javax.swing.JRadioButton jRadioButtonTipo_Habitacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldBuscarTipo;
    private javax.swing.JTable tabla_HabitacionesBuscar;
    // End of variables declaration//GEN-END:variables

    Conectar conect = new Conectar();
    Connection con = conect.Conectar();

    void MostrarDisponibles() {

        String estado = "Disponible";
        Statement sta = null;
        String sql = "SELECT * FROM habitacion Where estado_habitacion LIKE'%" + estado + "%'";
        String mostrar[] = new String[5];

        try {
            int f;
            sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql);

            f = tabla_HabitacionesBuscar.getRowCount();
            for (int j = 0; j < f; j++) {
                modelotablaBuscarHabitaciones.removeRow(0);
            }

            while (rs.next()) {

                mostrar[0] = rs.getString("numero_habitacion");
                mostrar[1] = rs.getString("tipo_habitacion");
                mostrar[2] = rs.getString("descripcion_habitacion");
                mostrar[3] = rs.getString("estado_habitacion");
                mostrar[4] = rs.getString("precio_habitacion");

                modelotablaBuscarHabitaciones.addRow(mostrar);
            }

        } catch (SQLException ex) {

        }

    }

    void Cabezera() {
        modelotablaBuscarHabitaciones.addColumn(" Nº ");
        modelotablaBuscarHabitaciones.addColumn("Tipo");
        modelotablaBuscarHabitaciones.addColumn("Descripcion");
        modelotablaBuscarHabitaciones.addColumn("Estado");
        modelotablaBuscarHabitaciones.addColumn("Precio");
        tabla_HabitacionesBuscar.setModel(modelotablaBuscarHabitaciones);
    }

    void Buscar() {
        int f;
        if (jRadioButtonTipo_Habitacion.isSelected() == true) {

            String tipo = jTextFieldBuscarTipo.getText();
            String Consulta = "SELECT *FROM habitacion WHERE tipo_habitacion LIKE'%" + tipo + "%'";
            String mostar[] = new String[5];

            try {

                Statement sta = con.createStatement();
                ResultSet rs = sta.executeQuery(Consulta);

                f = tabla_HabitacionesBuscar.getRowCount();
                for (int i = 0; i < f; i++) {
                    modelotablaBuscarHabitaciones.removeRow(0);
                }

                while (rs.next()) {
                    mostar[0] = rs.getString("numero_habitacion");
                    mostar[1] = rs.getString("tipo_habitacion");
                    mostar[2] = rs.getString("descripcion_habitacion");
                    mostar[3] = rs.getString("estado_habitacion");
                    mostar[4] = rs.getString("precio_habitacion");
                    modelotablaBuscarHabitaciones.addRow(mostar);

                }

            } catch (Exception e) {

            }

        }

    }

    void filtro() {

        int columnaABuscar = 0;
        String texto = "Tipo";

        columnaABuscar = 1;

        Filtrar.setRowFilter(RowFilter.regexFilter(jTextFieldBuscarTipo.getText(), columnaABuscar));
    }

    void AparienciaCabezera() {

        tabla_HabitacionesBuscar.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_HabitacionesBuscar.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_HabitacionesBuscar.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_HabitacionesBuscar.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));
        tabla_HabitacionesBuscar.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(Color.RED, Color.orange));

    }

}
