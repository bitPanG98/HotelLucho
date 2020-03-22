
package Mantenimiento;

import Mantenimiento.Empleado;
import Mantenimiento.Habitacion;
import Mantenimiento.Producto;
import Mantenimiento.Usuario;


public class Ventana_Seleccion_Registrar extends javax.swing.JFrame {

   int posx, posy;
    public Ventana_Seleccion_Registrar() {
        setUndecorated(true);
        initComponents();
        setTitle(" Seleccionar ");
        setResizable(false);
        setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelRegistrar_Usuario = new javax.swing.JLabel();
        jLabelRegistrar_Empleado = new javax.swing.JLabel();
        jLabelRegistrar_Productos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCerraVentana = new javax.swing.JLabel();
        jLabelRegistrar_Habitacion = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabelRegistrar_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar_trabajador.png"))); // NOI18N
        jLabelRegistrar_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrar_UsuarioMouseClicked(evt);
            }
        });

        jLabelRegistrar_Empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar_empleadoo.png"))); // NOI18N
        jLabelRegistrar_Empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrar_EmpleadoMouseClicked(evt);
            }
        });

        jLabelRegistrar_Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar_Productos.png"))); // NOI18N
        jLabelRegistrar_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrar_ProductosMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Productos");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Empleado");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  Usuarios");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_Ventanas_Seleccion.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabelCerraVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jLabelCerraVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerraVentanaMouseClicked(evt);
            }
        });

        jLabelRegistrar_Habitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hotel-64.png"))); // NOI18N
        jLabelRegistrar_Habitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrar_HabitacionMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Habitaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelRegistrar_Habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabelRegistrar_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabelCerraVentana))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabelRegistrar_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelRegistrar_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRegistrar_Habitacion)
                    .addComponent(jLabelRegistrar_Productos))
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addGap(33, 33, 33)
                .addComponent(jLabelCerraVentana))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabelRegistrar_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabelRegistrar_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        posx = evt.getX();
        posy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

        int xp =evt.getXOnScreen() - posx;
        int yp = evt.getYOnScreen() - posy;
        this.setLocation(xp, yp);
    }//GEN-LAST:event_formMouseDragged

    private void jLabelCerraVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerraVentanaMouseClicked

        dispose();
    }//GEN-LAST:event_jLabelCerraVentanaMouseClicked

    private void jLabelRegistrar_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrar_UsuarioMouseClicked

       Usuario u = new Usuario();
       u.setVisible(true);
        
//        Usuario u = new Usuario();
//        u.setVisible(true);
//        u.setLocationRelativeTo(null);

    }//GEN-LAST:event_jLabelRegistrar_UsuarioMouseClicked

    private void jLabelRegistrar_EmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrar_EmpleadoMouseClicked

        Empleado e = new Empleado();
        e.setVisible(true);
        e.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabelRegistrar_EmpleadoMouseClicked

    private void jLabelRegistrar_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrar_ProductosMouseClicked

        Producto p = new Producto();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabelRegistrar_ProductosMouseClicked

    private void jLabelRegistrar_HabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrar_HabitacionMouseClicked

         Habitacion  h = new Habitacion();
        h.setVisible(true);
        h.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jLabelRegistrar_HabitacionMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_Seleccion_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Seleccion_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Seleccion_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Seleccion_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Seleccion_Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCerraVentana;
    private javax.swing.JLabel jLabelRegistrar_Empleado;
    private javax.swing.JLabel jLabelRegistrar_Habitacion;
    private javax.swing.JLabel jLabelRegistrar_Productos;
    private javax.swing.JLabel jLabelRegistrar_Usuario;
    // End of variables declaration//GEN-END:variables
}
