
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author daw1
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOperador1 = new javax.swing.JLabel();
        lblOperador2 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtOperador1 = new javax.swing.JTextField();
        txtOperador2 = new javax.swing.JTextField();
        lblOperacionResul = new javax.swing.JLabel();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOperador1.setText("Operando 1:");
        getContentPane().add(lblOperador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lblOperador2.setText("Operando 2:");
        getContentPane().add(lblOperador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lblResultado.setText("Resultado: ");
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtOperador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOperador1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtOperador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 80, -1));

        txtOperador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOperador2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtOperador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 80, -1));

        lblOperacionResul.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOperacionResul.setText("0");
        lblOperacionResul.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblOperacionResul, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 150, -1));

        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOperador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOperador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOperador1ActionPerformed

    private void txtOperador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOperador2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOperador2ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
        // código a ejecutar al pulsar el botón
        // Aquí tú código
        int sumando1 = Integer.parseInt(txtOperador1.getText());
        int sumando2 = Integer.parseInt(txtOperador2.getText());
        int resultado = sumando1 + sumando2;
        lblOperacionResul.setText(String.valueOf(resultado));
        // fin del código
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        // TODO add your handling code here:
        // código a ejecutar al pulsar el botón
        // Aquí tú código
        int minuendo = Integer.parseInt(txtOperador1.getText());
        int sustraendo = Integer.parseInt(txtOperador2.getText());
        int resultado = minuendo - sustraendo;
        lblOperacionResul.setText(String.valueOf(resultado));
        // fin del código
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        // TODO add your handling code here:
        // código a ejecutar al pulsar el botón
        // Aquí tú código
        int factor1 = Integer.parseInt(txtOperador1.getText());
        int factor2 = Integer.parseInt(txtOperador2.getText());
        int resultado = factor1 * factor2;
        lblOperacionResul.setText(String.valueOf(resultado));
        // fin del código
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        // TODO add your handling code here:
        // código a ejecutar al pulsar el botón
        // Aquí tú código
        int dividiendo = Integer.parseInt(txtOperador1.getText());
        int divisor = Integer.parseInt(txtOperador2.getText());
        if(divisor!=0) {
            int resultado = dividiendo / divisor;
            lblOperacionResul.setText(String.valueOf(resultado));
        } else {
            lblOperacionResul.setText("No valido.");
        }
        // fin del código
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        lblOperacionResul.setText("0");
        txtOperador1.setText("");
        txtOperador2.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel lblOperacionResul;
    private javax.swing.JLabel lblOperador1;
    private javax.swing.JLabel lblOperador2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtOperador1;
    private javax.swing.JTextField txtOperador2;
    // End of variables declaration//GEN-END:variables
}