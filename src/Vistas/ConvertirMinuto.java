/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ERWIN
 */
public class ConvertirMinuto extends javax.swing.JFrame {

    /**
     * Creates new form ConvertirMinuto
     * @param parent
     * @param modal
     */
    public ConvertirMinuto(java.awt.Frame parent, boolean modal) {
       
        initComponents();
        // Centra el panel en la pantalla
        this.setLocationRelativeTo(null);
         //Nombre a la etiqueta
        this.BtnCalcular2.setToolTipText("Calcular");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new org.edisoncor.gui.panel.Panel();
        lblHoras4 = new org.edisoncor.gui.label.LabelMetric();
        lblHoras5 = new org.edisoncor.gui.label.LabelMetric();
        txtMinutos2 = new org.edisoncor.gui.textField.TextField();
        txtSegundos2 = new org.edisoncor.gui.textField.TextField();
        BtnCalcular2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Convertir Minutos");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Calcular.png")).getImage());
        setResizable(false);

        lblHoras4.setText("Minuto(s):");
        lblHoras4.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N

        lblHoras5.setText("Segundos:");
        lblHoras5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N

        txtMinutos2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMinutos2.setToolTipText("");
        txtMinutos2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtSegundos2.setBackground(new java.awt.Color(51, 204, 0));
        txtSegundos2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSegundos2.setEnabled(false);
        txtSegundos2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        BtnCalcular2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnCalcular2.setForeground(new java.awt.Color(204, 102, 0));
        BtnCalcular2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculadora.png"))); // NOI18N
        BtnCalcular2.setText("Calcular");
        BtnCalcular2.setBorderPainted(false);
        BtnCalcular2.setContentAreaFilled(false);
        BtnCalcular2.setFocusable(false);
        BtnCalcular2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCalcular2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcular2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHoras4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoras5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSegundos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMinutos2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(BtnCalcular2)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoras4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinutos2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHoras5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundos2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(BtnCalcular2)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcular2ActionPerformed

        try{
        
            int minutos=Integer.parseInt(txtMinutos2.getText());
            int resul=minutos*60;
            String numCadena= resul+"";
            txtSegundos2.setText(numCadena);
        
        }
        
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debes digitar un número.",".:Error:.",JOptionPane.ERROR_MESSAGE);
            txtSegundos2.requestFocus();
        }
    }//GEN-LAST:event_BtnCalcular2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConvertirMinuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvertirMinuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvertirMinuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertirMinuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            ConvertirMinuto dialog = new ConvertirMinuto(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular2;
    private org.edisoncor.gui.label.LabelMetric lblHoras4;
    private org.edisoncor.gui.label.LabelMetric lblHoras5;
    private org.edisoncor.gui.panel.Panel panel3;
    private org.edisoncor.gui.textField.TextField txtMinutos2;
    private org.edisoncor.gui.textField.TextField txtSegundos2;
    // End of variables declaration//GEN-END:variables
}
