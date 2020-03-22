package Hacer_habitacion;

import Conectar.Conectar;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Clarisse_Naoemi-PC
 */
public class hacer_habitacion extends javax.swing.JFrame {
    
    int posx, posy;
    
    public hacer_habitacion() {
        
        setUndecorated(true);
        
        initComponents();
        
        setResizable(false);
        setLocationRelativeTo(null);
        
        jTextFieldNombreCliente.requestFocus();
        
        Calendar c1 = GregorianCalendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy  ||  hh:mm:ss");
        jFechaEntrada.setCalendar(c1);
        
        jFechaSalida.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombreCliente = new javax.swing.JTextField();
        jTextFieldDNI_Cliente = new javax.swing.JTextField();
        jLabel_EddarError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNºHabitaciopn = new javax.swing.JTextField();
        jTextFielddescripcion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel_AbrirBuscador = new javax.swing.JLabel();
        jComboBoxTipo_Habtacion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Boton_Guardar = new javax.swing.JLabel();
        Boton_Cancelar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jFechaSalida = new com.toedter.calendar.JDateChooser();
        jFechaEntrada = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jspinner_dias = new javax.swing.JSpinner();

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Hacer Habitacion");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", 0, 0, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Nombre (s) :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("DNI :");

        jTextFieldNombreCliente.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreClienteKeyTyped(evt);
            }
        });

        jTextFieldDNI_Cliente.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldDNI_Cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDNI_ClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDNI_ClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldDNI_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EddarError, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDNI_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel_EddarError, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Habitacion", 0, 0, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Nº :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Tipo :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Descripcion :");

        jTextFieldNºHabitaciopn.setEditable(false);
        jTextFieldNºHabitaciopn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTextFielddescripcion.setEditable(false);
        jTextFielddescripcion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Precio :");

        jTextFieldPrecio.setEditable(false);
        jTextFieldPrecio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel8.setText("$");

        jLabel_AbrirBuscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar1.JPG"))); // NOI18N
        jLabel_AbrirBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AbrirBuscadorMouseClicked(evt);
            }
        });

        jComboBoxTipo_Habtacion.setEditable(false);
        jComboBoxTipo_Habtacion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFielddescripcion)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextFieldNºHabitaciopn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_AbrirBuscador))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 26, Short.MAX_VALUE)))
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBoxTipo_Habtacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_AbrirBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldNºHabitaciopn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxTipo_Habtacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextFielddescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Boton_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        Boton_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Boton_GuardarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton_GuardarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Boton_GuardarMouseReleased(evt);
            }
        });

        Boton_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        Boton_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Boton_CancelarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton_CancelarMousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setText("Fecha Entrada :");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel15.setText("Fecha Salida :");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel16.setText("Dias :");

        jFechaSalida.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jFechaEntrada.setBackground(new java.awt.Color(0, 0, 0));
        jFechaEntrada.setForeground(new java.awt.Color(0, 255, 51));
        jFechaEntrada.setEnabled(false);
        jFechaEntrada.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calcular.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jspinner_dias.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jspinner_dias.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        jspinner_dias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jspinner_diasKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(jLabel12))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel16)
                        .addGap(20, 20, 20)))
                .addGap(5, 5, 5)
                .addComponent(jFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jspinner_dias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(Boton_Guardar)
                .addGap(107, 107, 107)
                .addComponent(Boton_Cancelar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jspinner_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton_Guardar)
                    .addComponent(Boton_Cancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked
    
    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked
    
    private void jLabel_AbrirBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AbrirBuscadorMouseClicked
        
        buscar_habitacion ba = new buscar_habitacion();
        ba.setVisible(true);
        ba.setLocationRelativeTo(this);
    }//GEN-LAST:event_jLabel_AbrirBuscadorMouseClicked
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
        posx = evt.getX();
        posy = evt.getY();
        
    }//GEN-LAST:event_formMousePressed
    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen() - posx;
        int y = evt.getYOnScreen() - posy;
        setLocation(x, y);
    }//GEN-LAST:event_formMouseDragged
    
    private void Boton_GuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_GuardarMousePressed
        Guardar();
    }//GEN-LAST:event_Boton_GuardarMousePressed
    
    private void Boton_GuardarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_GuardarMouseReleased
    }//GEN-LAST:event_Boton_GuardarMouseReleased
    
    private void Boton_GuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_GuardarMouseEntered
        Boton_Guardar.setToolTipText("Guardar");
        
    }//GEN-LAST:event_Boton_GuardarMouseEntered
    
    private void Boton_CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_CancelarMouseEntered
        Boton_Cancelar.setToolTipText("Cancelar");
    }//GEN-LAST:event_Boton_CancelarMouseEntered
    
    private void jTextFieldDNI_ClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNI_ClienteKeyTyped
        
        validarNumeros(evt);
       
          if (jTextFieldDNI_Cliente.getText().length() == 8) {
            jLabel_EddarError.setText("solo 8 digitos");
            jLabel_EddarError.setForeground(Color.red);
            jTextFieldDNI_Cliente.setText("");
            jTextFieldDNI_Cliente.grabFocus();
        }
        if (jTextFieldDNI_Cliente.getText().length() < 8) {
            jLabel_EddarError.setText("digitando..");
            jLabel_EddarError.setForeground(Color.blue);
        }
        if (jTextFieldDNI_Cliente.getText().length() == 7) {
            jLabel_EddarError.setText("");
        }
        
        
        
    }//GEN-LAST:event_jTextFieldDNI_ClienteKeyTyped
    
    private void jTextFieldNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreClienteKeyTyped
        validarLetras(evt);
        
        String texto = jTextFieldNombreCliente.getText();
        if (texto.length() > 0) {
            char primeraletra = texto.charAt(0);
            texto = Character.toUpperCase(primeraletra) + texto.substring(1, texto.length());
            jTextFieldNombreCliente.setText(texto);
        }
    }//GEN-LAST:event_jTextFieldNombreClienteKeyTyped
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Calendar c12 = GregorianCalendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy  ||  hh:mm:ss");
        
        int dias = (int) jspinner_dias.getValue();
        c12.add(Calendar.DATE, dias);
        jTextField1.setText(c12.getTime().toLocaleString());
//            jFechaSalida.setCalendar(c12);

        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jspinner_diasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jspinner_diasKeyReleased
        
        Calendar c12 = GregorianCalendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy  ||  hh:mm:ss");
        
        jFechaEntrada.setCalendar(c12);
        jFechaSalida.setCalendar(c12);
        jTextField1.setText(c12.getTime().toLocaleString());
        
    }//GEN-LAST:event_jspinner_diasKeyReleased

    private void jTextFieldDNI_ClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNI_ClienteKeyReleased

        
        if (!jTextFieldDNI_Cliente.getText().matches("[0-9--]*")) {
            jLabel_EddarError.setText("Error");
            jLabel_EddarError.setForeground(Color.red);
            jTextFieldDNI_Cliente.setText("");
            jTextFieldDNI_Cliente.grabFocus();
        }
    }//GEN-LAST:event_jTextFieldDNI_ClienteKeyReleased

    private void Boton_CancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_CancelarMousePressed

        Limpiar();
    }//GEN-LAST:event_Boton_CancelarMousePressed

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
            java.util.logging.Logger.getLogger(hacer_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hacer_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hacer_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hacer_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hacer_habitacion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Boton_Cancelar;
    private javax.swing.JLabel Boton_Guardar;
    private javax.swing.JButton jButton1;
    public static javax.swing.JTextField jComboBoxTipo_Habtacion;
    private com.toedter.calendar.JDateChooser jFechaEntrada;
    private com.toedter.calendar.JDateChooser jFechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_AbrirBuscador;
    private javax.swing.JLabel jLabel_EddarError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldDNI_Cliente;
    private javax.swing.JTextField jTextFieldNombreCliente;
    public static javax.swing.JTextField jTextFieldNºHabitaciopn;
    public static javax.swing.JTextField jTextFieldPrecio;
    public static javax.swing.JTextField jTextFielddescripcion;
    private javax.swing.JSpinner jspinner_dias;
    // End of variables declaration//GEN-END:variables
    Conectar conect = new Conectar();
    Connection con = conect.Conectar();
    
    void Limpiar() {
        
        jTextFieldNombreCliente.setText("");
        jTextFieldDNI_Cliente.setText("");
        jTextFieldNºHabitaciopn.setText("");
        jTextFielddescripcion.setText("");
        jComboBoxTipo_Habtacion.setText("");
        jTextFieldPrecio.setText("");
        jTextField1.setText("");
//        jTextFieldDias.setText("");
        jTextFieldNombreCliente.requestFocus();
        
    }
    
    void Guardar() {
        
        Calendar cal = GregorianCalendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy  ||  hh:mm:ss");
        
        boolean verificar = jTextFieldNombreCliente.getText().isEmpty() || jTextFieldDNI_Cliente.getText().isEmpty() || jTextFieldNºHabitaciopn.getText().isEmpty() || jFechaEntrada.getDate() == null;
        
        if (verificar) {
            
            JOptionPane.showMessageDialog(this, "Por Favor rellene Todos Los Campos ", " AVISO", JOptionPane.WARNING_MESSAGE);
            
        } else {
            
            try {
                
                String estado = "Ocupada";
                String EstadoPago = " Por Cancelar ";
                int dias = (int) jspinner_dias.getValue();
                
                String consultaGuardar = "INSERT INTO huespedes  VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                String guardarHuesped = "INSERT INTO huesped(codigo_huesped, dni_huesped, nombres_huesped) VALUES(?,?,?)";
                
                String consulta1 = "UPDATE habitacion SET estado_habitacion='"
                        + estado + "' WHERE numero_habitacion='" + jTextFieldNºHabitaciopn.getText() + "'";
                
                PreparedStatement pre = con.prepareCall(consultaGuardar);
                PreparedStatement pre1 = con.prepareStatement(consulta1);
                PreparedStatement prep2 = con.prepareCall(guardarHuesped);
                
                Double precioHab = Double.parseDouble(jTextFieldPrecio.getText());
                Double TotalPagarHabit = (precioHab * dias);
                
                pre.setString(1,null);
                pre.setString(2, jTextFieldNombreCliente.getText());
                pre.setString(3, jTextFieldDNI_Cliente.getText());
                pre.setString(4, jTextFieldNºHabitaciopn.getText());
                pre.setString(5, jComboBoxTipo_Habtacion.getText());
                pre.setString(6, jTextFieldPrecio.getText());
                pre.setString(7, jTextFielddescripcion.getText());
                pre.setString(8, "Ocupada");
                pre.setString(9, cal.getTime().toString());
                pre.setString(10, jTextField1.getText() + "");
                pre.setInt(11, dias);
                pre.setDouble(12, TotalPagarHabit);
                pre.setString(13, EstadoPago);
                //==================================
                prep2.setString(1, null);
                prep2.setString(2, jTextFieldDNI_Cliente.getText());
                prep2.setString(3, jTextFieldNombreCliente.getText());
                //=========================================
                prep2.executeUpdate();
                pre1.executeUpdate();
                int g = pre.executeUpdate();
                
                if (g > 0) {
                    JOptionPane.showMessageDialog(rootPane, " Datos Guardados Exitosamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                    Limpiar();
                    
                } else {
                    
                    JOptionPane.showMessageDialog(rootPane, " Error al Guardar Datos ", "Verifique Datos, DNI ", JOptionPane.INFORMATION_MESSAGE);
                    
                }
                
            } catch (MySQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(rootPane, " Error al Guardar Datos ", "Verifique Datos, DNI ", JOptionPane.WARNING_MESSAGE);
                System.out.println("" + e);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, " Error al Guardar Datos ", "Verifique Datos", JOptionPane.WARNING_MESSAGE);
                System.out.println("" + ex);
            }
            
        }
        
    }

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
}
//        System.out.println("Fecha actual: " + c1.getTime().toLocaleString());
//       System.out.println("Fecha Formateada: " + sdf.format(c1.getTime()));
////     sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
////      System.out.println("Fecha Formateada: " + sdf.format(c1.getTime()));
//        System.out.println("Fecha Formateada: " + sdf.format(c1.getTime()));
//        String Feha = sdf.format(c1.getTime());
//            String formato = "dd-MM-YYYY";
//            SimpleDateFormat fecha = new SimpleDateFormat(formato);
//            Date dat = new Date();
//            Date dat1 = new Date();
//            dat = jFechaSalida.getDate();
//            dat1 = jFechaEntrada.getDate();
//            String DiaS = fecha.format(dat);
//            String DiaE = fecha.format(dat1);

