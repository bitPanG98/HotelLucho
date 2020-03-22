/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingreso;

import Conectar.Conectar;
import com.sun.awt.AWTUtilities;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import javax.swing.*;
import javax.swing.Timer;

/**
 * 156 23
 *
 * @author Irvin
 */
public class Sesion extends javax.swing.JFrame {

    String tema = "javax.swing.plaf.metal.MetalLookAndFeel";

    Timer hora;

    private Thread Mover = new Banner();

    int posX, posY;

    //======================HACEMOS MOVER LOS JLABEL ===================================================
    private class Banner extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    for (int i = -420; i < (jPanel2.getHeight() + 300); i++) {
                        Mover.join(8);
                        jLabel_Logo.setLocation(i, 250);
//                        jLabel_logo.setLocation(i, 250);
//                       jLabel_logo.setLocation(120, i);
                    }
                } catch (InterruptedException ex) {
                }
            }
        }
    }

    //=============================================================================
    public Sesion() {
        //le quitamos los bordes
        setUndecorated(true);
        //llamamos al metodo Opacity , le pasamos n float entre 0 y 1 como parametro Para que nuestro jframe tenga un 50% de transpariencia 
        setOpacity(0.9f);

        initComponents();

        //centrar el jframe
        setLocationRelativeTo(this);
        //focus al campo usuario
        jTextFieldUsuario.requestFocus();
        //Activar el movimiento del jlabel
        Mover.start();


        /*Los 2 primeros ceros son la posicion en la pantalla que seran dadas por el setlocationRelativeto , luego tenemos que la forma que estamos crendo  tendran
         * los limites que el jframe , xlo que los datos seran dados x sus mismos limites los Ultimosparametros representan l curvatura del borde redondeado  */
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30);
//      Shape forma =   new Ellipse2D.Float(0, 0, getWidth(), getHeight());
        AWTUtilities.setWindowShape(this, forma);

        //Fecha Actual del computador
        FechaActual();

        LookAndFeel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Boton_Entrar = new javax.swing.JButton();
        Boton_Cerrrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Hora = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_Fecha = new javax.swing.JLabel();
        jLabel_Logo2 = new javax.swing.JLabel();
        jLabel_Logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jRadioButton_Mostrar = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_Usuario.png"))); // NOI18N
        panelImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelImage1MousePressed(evt);
            }
        });
        panelImage1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelImage1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelImage1MouseMoved(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Acceso al Sistema");

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.png"))); // NOI18N
        cerrar.setToolTipText("Cerrar");
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cerrarMousePressed(evt);
            }
        });

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar.png"))); // NOI18N
        Minimizar.setToolTipText("Minimizar");
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MinimizarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(Minimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cerrar)
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
            .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario :");

        jTextFieldUsuario.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUsuario.setBorder(null);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Clave :");

        Boton_Entrar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        Boton_Entrar.setText("Entrar");
        Boton_Entrar.setToolTipText("Entrar Al Sistema");
        Boton_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EntrarActionPerformed(evt);
            }
        });

        Boton_Cerrrar.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Boton_Cerrrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        Boton_Cerrrar.setText("Salir");
        Boton_Cerrrar.setToolTipText("Cerrar el Sistema");
        Boton_Cerrrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CerrrarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hora :");

        jLabel_Hora.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel_Hora.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha :");

        jLabel_Fecha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel_Fecha.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Hora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel_Logo2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_Logo2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel_Logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Logo2.setText("Hotel Lucho  ");

        jLabel_Logo.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel_Logo.setForeground(new java.awt.Color(0, 255, 0));
        jLabel_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Logo.setText("* El Placer De Dormir, Como En El Cielo *");

        jSeparator1.setBackground(new java.awt.Color(0, 255, 51));

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login_user1.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );

        jRadioButton_Mostrar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jRadioButton_Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton_MostrarMouseClicked(evt);
            }
        });
        jRadioButton_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)))
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton_Mostrar))))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addComponent(Boton_Cerrrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(Boton_Entrar)))
                .addGap(12, 12, 12)
                .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                        .addComponent(jLabel_Logo)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                        .addComponent(jLabel_Logo2)
                        .addGap(154, 154, 154))))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Logo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRadioButton_Mostrar))
                        .addGap(18, 18, 18)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_Cerrrar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void Boton_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EntrarActionPerformed

        try {

            boolean verifica = jTextFieldUsuario.getText().isEmpty() || jPasswordFieldContraseña.getText().isEmpty();
            if (verifica) {
                JOptionPane.showMessageDialog(this, " Rellene Todos Los Campos");
            } else {

                String usua, contra;
                usua = jTextFieldUsuario.getText();
                String pass = jPasswordFieldContraseña.getText();

                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(pass.getBytes(), 0, pass.length());
                pass = new BigInteger(1, md.digest()).toString();
                acceder(usua, pass);
                Principal.jLabelUsuarioConectado.setText(usua);

            }
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }

    }//GEN-LAST:event_Boton_EntrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        hora = new Timer(100, new Hora());
        hora.start();

    }//GEN-LAST:event_formWindowOpened

    private void Boton_CerrrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CerrrarActionPerformed

        String mensaje = "<html> <body> <b style = \" font-size : 12; color :red; \"> Desea Cerrar El Sistema</b> </body> </html>";
        int salir = JOptionPane.showConfirmDialog(null, mensaje, "Aviso", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_CANCEL_OPTION);

        if (salir == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_Boton_CerrrarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed


    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

    }//GEN-LAST:event_formMouseDragged

    private void MinimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMousePressed

        setExtendedState(ICONIFIED);

    }//GEN-LAST:event_MinimizarMousePressed

    private void cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMousePressed

        int salir = JOptionPane.showConfirmDialog(this, " ¿ Desea Cerrar El Sistema ? ", " AVISO ", JOptionPane.YES_NO_OPTION);
        if (salir == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_cerrarMousePressed

    private void panelImage1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelImage1MousePressed

        posX = evt.getX();
        posY = evt.getY();

    }//GEN-LAST:event_panelImage1MousePressed

    private void panelImage1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelImage1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_panelImage1MouseMoved

    private void panelImage1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelImage1MouseDragged

        int x = evt.getXOnScreen() - posX;
        int y = evt.getYOnScreen() - posY;

        setLocation(x, y);

    }//GEN-LAST:event_panelImage1MouseDragged

    private void jRadioButton_MostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton_MostrarMouseClicked

    }//GEN-LAST:event_jRadioButton_MostrarMouseClicked

    private void jRadioButton_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MostrarActionPerformed

        if (jRadioButton_Mostrar.isSelected() == true) {

            char c = 0;
            jPasswordFieldContraseña.setEchoChar(c);

        } else if (jRadioButton_Mostrar.isSelected() == false) {

            char c = (char) 2000;
            jPasswordFieldContraseña.setEchoChar(c);
        }
    }//GEN-LAST:event_jRadioButton_MostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sesion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Cerrrar;
    private javax.swing.JButton Boton_Entrar;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Fecha;
    private javax.swing.JLabel jLabel_Hora;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Logo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JRadioButton jRadioButton_Mostrar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldUsuario;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    // End of variables declaration//GEN-END:variables

    Conectar cBD = new Conectar();
    Connection con = cBD.Conectar();

    //==============================================================================================
    public class Hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            GregorianCalendar tiempo = new GregorianCalendar();
            int hora, minuto, segundo;

            hora = tiempo.get(Calendar.HOUR);
            minuto = tiempo.get(Calendar.MINUTE);
            segundo = tiempo.get(Calendar.SECOND);

            jLabel_Hora.setText(hora + ":" + minuto + ":" + segundo);

        }
    }

    //====================================================================================================
    private void FechaActual() {

        String formato = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        Date dato = new Date();
        String Fecha = sdf.format(dato);
        jLabel_Fecha.setText(Fecha);

    }
    //==============================================================================================

    void acceder(String usuario, String contraseña) {

        String capturar_Datos = "";
        String sql = "SELECT * FROM usuarios WHERE usuario='" + usuario + "' && contraseña='" + contraseña + "'";

        try {

            if (jTextFieldUsuario.getText().equals("") || jPasswordFieldContraseña.getText().equals("")) {
                String mensaje = "<html> <body> <b style = \" font-size : 12; color :red; \"> Rellene Todos Los Campos </b> </body> </html>";
                JOptionPane.showMessageDialog(null, mensaje, "Aviso", JOptionPane.WARNING_MESSAGE);

            } else {

                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {

                    capturar_Datos = rs.getString("tipo_usuario");

                }
                if (capturar_Datos.equals("Administrador")) {

                    AudioClip mp3;
                    mp3 = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/Administrador.wav"));
                    mp3.play();

                    Principal p = new Principal();
                    p.setVisible(true);
                    p.Boton_Mantenimiento.setEnabled(true);
                    p.Boton_HacerHabitacion.setEnabled(true);
                    p.Boton_Movimientos.setEnabled(true);
                    dispose();

                    p.setLocationRelativeTo(null);

                } else if (capturar_Datos.equals("Recepcionista")) {

                    Principal p = new Principal();
                    p.setVisible(true);
                    p.Boton_Mantenimiento.setEnabled(false);
                    p.Boton_HacerHabitacion.setEnabled(true);
                    p.Boton_Movimientos.setEnabled(true);
                    dispose();

                    p.setLocationRelativeTo(null);

                } else if ((!capturar_Datos.equals("Administrador")) && (!capturar_Datos.equals("Recepcionista"))) {

                    JOptionPane.showMessageDialog(this, "No existen sus datos, Usuario No Registrado", "Error", JOptionPane.WARNING_MESSAGE);

                }

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error");

        } catch (NullPointerException ex) {

            JOptionPane.showMessageDialog(this, " Error con base de datos ", "Error", JOptionPane.WARNING_MESSAGE);

        }

    }

    public void LookAndFeel() {

        try {

            UIManager.setLookAndFeel(tema);
            SwingUtilities.updateComponentTreeUI(this);

        } catch (Exception erro) {
            System.out.println("Error al cargar el tema");
        }
    }
}
