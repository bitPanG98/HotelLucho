/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingreso;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author Irvin
 */
public class Pantallaso extends javax.swing.JFrame {

    String tema = "javax.swing.plaf.metal.MetalLookAndFeel";

    //========================
    Timer tiempo;
    //===========================

    //============================
    private Timer progres;
    int con;
    private final static int Segundos = 30;
    //=====================================

    public Pantallaso() {

        //le quitamos los bordes
        setUndecorated(true);
        //llamamos al metodo Opacity , le pasamos n float entre 0 y 1 como parametro Para que nuestro jframe tenga un 90% de transpariencia 
        setOpacity(0.9f);

        initComponents();
        //Centramos nuestro jframe 
        setLocationRelativeTo(this);

        LookAndFeel();

        // cargarIcono();
        /*Los 2 primeros ceros son la posicion en la pantalla que seran dadas por 
         * el setlocationRelativeto , luego tenemos que la forma que estamos crendo  tendran
         * los limites que el jframe , xlo que los datos seran dados x sus mismos limites
         * los Ultimosparametros representan l curvatura del borde redondeado  */
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
//        Shape forma =   new Ellipse2D.Float(0, 0, getWidth(), getHeight());
        AWTUtilities.setWindowShape(this, forma);
        correr();

    }

    //===============================================================================================
    void esconder() {
        setVisible(false);
    }

    void activar() {
        //Activamos el Progresbar
        progres.start();
    }

    public void correr() {

        jProgressBar1.setVisible(true);
        con = -1;
        jProgressBar1.setValue(0);
        jProgressBar1.setStringPainted(true);
        progres = new Timer(Segundos, new TimerListener());
        activar();
    }

    class TimerListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            con++;
            jProgressBar1.setValue(con);
            if (con == 5) {

                jLabel_Cargando.setText("Cargando.......!!!");
//                jLabel_Cargando.setForeground(Color.red);

            } else if (con == 30) {

                jLabel_Cargando.setText("Cargando Base de Datos..!!!");

            } else if (con == 40) {

                jLabel_Cargando.setText("Cargando Modulos....!!!");

            } else if (con == 60) {

                jLabel_Cargando.setText("Cargando Datos...!!!");

            } else if (con == 100) {

                //verificamos si el contador llega a 100 para detener el tiempo del progress bar
                progres.stop();
                esconder();
                //Mostramos el Jframe Menu 

                Sesion is = new Sesion();
                is.setVisible(true);
                //========================

                setVisible(false);

            }

        }

    }
    //==============================================================================================================

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel_Cargando = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Splash.png"))); // NOI18N

        jProgressBar1.setBackground(new java.awt.Color(0, 204, 204));
        jProgressBar1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_Cargando.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_Cargando.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_Cargando.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Cargando.setText("Cargando");

        org.jdesktop.layout.GroupLayout panelImage2Layout = new org.jdesktop.layout.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelImage2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .add(jProgressBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 356, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(42, 42, 42))
            .add(panelImage2Layout.createSequentialGroup()
                .add(39, 39, 39)
                .add(jLabel_Cargando, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 161, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelImage2Layout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .add(jLabel_Cargando, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jProgressBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelImage2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelImage2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Pantallaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantallaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantallaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantallaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantallaso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Cargando;
    private javax.swing.JProgressBar jProgressBar1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    // End of variables declaration//GEN-END:variables

    void cargarIcono() {
        try {
            java.awt.Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/i481.png"));
            setIconImage(icon);
            ;
        } catch (Exception e) {
            System.out.println("No se pudo cargo icono");
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
