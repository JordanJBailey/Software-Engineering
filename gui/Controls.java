/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gui;

/**
 *
 * @author Liam
 */
public class Controls extends javax.swing.JFrame {

    /**
     * Creates new form Controls
     */
    public Controls() {
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

        Controls = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        Back = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setPreferredSize(new java.awt.Dimension(833, 638));
        getContentPane().setLayout(null);

        Controls.setIcon(new javax.swing.ImageIcon("C:\\Users\\Liam Maddren\\Documents\\kiwiIslandTest\\FINAL\\KiwiIsland\\KiwiIsland\\res\\textures\\Controls.png")); // NOI18N
        getContentPane().add(Controls);
        Controls.setBounds(230, 30, 380, 100);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\tMove up\t- W\n\n\tMove Down - S\n\n\tMove Left - A\n\n\tMove Right - D");
        getContentPane().add(jTextArea1);
        jTextArea1.setBounds(230, 210, 340, 200);

        Back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(340, 450, 110, 40);

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Liam Maddren\\Documents\\kiwiIslandTest\\FINAL\\KiwiIsland\\KiwiIsland\\res\\textures\\Game background.png")); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        background.setMinimumSize(new java.awt.Dimension(207, 446));
        getContentPane().add(background);
        background.setBounds(10, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        
        final MainMenu mm = new MainMenu();
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                mm.setVisible(true);
                mm.setLocationRelativeTo(null);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Controls;
    private javax.swing.JLabel background;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
