package proyectofinalprogra2;

import java.awt.Color;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class frmPantallaDeCarga extends javax.swing.JFrame implements Runnable {

    private Thread tiempo = null;
    private JLabel lblImagen, lblProgreso, lblRecomendacion, lblGif;
    private JProgressBar barra;
    private String[] recomendaciones = {"Puedes iterar con las celdas de las tablas dando click sobre ellas", "Recuerda tener precaución al elegir fiesta", "Controla, visualiza y administra la información de tu fiesta"};
    private Random rnd = new Random();

    public frmPantallaDeCarga() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        lblImagen = new JLabel();
        ImageIcon imagen;
        String dir = "/Imagenes/PantallaCarga.png";
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        lblImagen.setIcon(imagen);
        lblImagen.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        lblImagen.setLocation(417, 200);
        this.add(lblImagen);

        barra = new JProgressBar();
        barra.setSize(500, 30);
        barra.setLocation(380, 570);
        barra.setForeground(new Color(0, 153, 153));
        this.add(barra);

        lblProgreso = new JLabel();
        lblProgreso.setSize(100, 30);
        lblProgreso.setLocation(900, 568);
        this.add(lblProgreso);

        lblRecomendacion = new JLabel();
        String texto = recomendaciones[rnd.nextInt(recomendaciones.length)];
        lblRecomendacion.setText(texto);
        lblRecomendacion.setSize(600, 30);
        lblRecomendacion.setLocation(440, 610);
        this.add(lblRecomendacion);
        
        lblGif = new JLabel();
        ImageIcon imagen2;
        String dir2 = "/Imagenes/Engranaje.gif";
        URL url2 = this.getClass().getResource(dir2);
        imagen2 = new ImageIcon(url2);
        lblGif.setIcon(imagen2);
        lblGif.setSize(imagen2.getIconWidth(), imagen2.getIconHeight());
        lblGif.setLocation(10, 10);
        this.add(lblGif);

        tiempo = new Thread(this);
        tiempo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmPantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPantallaDeCarga().setVisible(true);
            }
        });
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 100; i++) {
                barra.setValue(i);
                lblProgreso.setText(barra.getValue() + "%");
                Thread.sleep(40);
                lblGif.repaint();
            }
            this.setVisible(false);
            new frmPrincipal().setVisible(true);
        } catch (InterruptedException ex) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
