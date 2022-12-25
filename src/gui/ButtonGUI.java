/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;



/**
 *
 * @author ACER
 */
public class ButtonGUI extends javax.swing.JFrame {

    /**
     * Creates new form ButtonGUI
     */
    public ButtonGUI() {
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

        buttonPanel = new javax.swing.JPanel();
        wordBT = new javax.swing.JButton();
        excelBT = new javax.swing.JButton();
        powerpointBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        wordLB = new javax.swing.JLabel();
        excelLB = new javax.swing.JLabel();
        powerpointLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wordBT.setText("Word");
        wordBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordBTActionPerformed(evt);
            }
        });
        buttonPanel.add(wordBT);

        excelBT.setText("Excel");
        excelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelBTActionPerformed(evt);
            }
        });
        buttonPanel.add(excelBT);

        powerpointBT.setText("PowerPoint");
        powerpointBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerpointBTActionPerformed(evt);
            }
        });
        buttonPanel.add(powerpointBT);

        exitBT.setText("Exit");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });
        buttonPanel.add(exitBT);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.CENTER);

        imagePanel.setLayout(new java.awt.CardLayout());

        wordLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\PenampilGambar\\Microsoft Word.png")); // NOI18N
        wordLB.setFocusable(false);
        imagePanel.add(wordLB, "0");

        excelLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\PenampilGambar\\Microsoft Excel.png")); // NOI18N
        imagePanel.add(excelLB, "1");

        powerpointLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\PenampilGambar\\Microsoft PowerPoint.png")); // NOI18N
        imagePanel.add(powerpointLB, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

    private void wordBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordBTActionPerformed
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_wordBTActionPerformed

    private void excelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelBTActionPerformed
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_excelBTActionPerformed

    private void powerpointBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerpointBTActionPerformed
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_powerpointBTActionPerformed

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
            java.util.logging.Logger.getLogger(ButtonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ButtonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ButtonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ButtonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ButtonGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton excelBT;
    private javax.swing.JLabel excelLB;
    private javax.swing.JButton exitBT;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton powerpointBT;
    private javax.swing.JLabel powerpointLB;
    private javax.swing.JButton wordBT;
    private javax.swing.JLabel wordLB;
    // End of variables declaration//GEN-END:variables
}
