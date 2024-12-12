
package datastructuresfinalproject;
import java.sql.Connection;
public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        menuBar3 = new java.awt.MenuBar();
        menu5 = new java.awt.Menu();
        menu6 = new java.awt.Menu();
        menuBar4 = new java.awt.MenuBar();
        menu7 = new java.awt.Menu();
        menu8 = new java.awt.Menu();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnPR = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnME = new javax.swing.JButton();
        btnLO = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        menu5.setLabel("File");
        menuBar3.add(menu5);

        menu6.setLabel("Edit");
        menuBar3.add(menu6);

        menu7.setLabel("File");
        menuBar4.add(menu7);

        menu8.setLabel("Edit");
        menuBar4.add(menu8);

        jButton4.setText("jButton1");

        jLabel1.setText("jLabel1");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setPreferredSize(new java.awt.Dimension(776, 475));
        getContentPane().setLayout(null);

        btnPR.setBackground(new java.awt.Color(0, 51, 102));
        btnPR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPR.setForeground(new java.awt.Color(51, 255, 255));
        btnPR.setText("PAYROLL");
        btnPR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRActionPerformed(evt);
            }
        });
        getContentPane().add(btnPR);
        btnPR.setBounds(90, 120, 170, 83);

        btnR.setBackground(new java.awt.Color(0, 51, 102));
        btnR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnR.setForeground(new java.awt.Color(51, 255, 255));
        btnR.setText("REPORT");
        btnR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });
        getContentPane().add(btnR);
        btnR.setBounds(90, 230, 170, 83);

        btnME.setBackground(new java.awt.Color(0, 51, 102));
        btnME.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnME.setForeground(new java.awt.Color(51, 255, 255));
        btnME.setText(" EMPLOYEES");
        btnME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnME.setIconTextGap(2);
        btnME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMEActionPerformed(evt);
            }
        });
        getContentPane().add(btnME);
        btnME.setBounds(90, 20, 170, 80);

        btnLO.setBackground(new java.awt.Color(0, 51, 102));
        btnLO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLO.setForeground(new java.awt.Color(51, 255, 255));
        btnLO.setText("LOGOUT");
        btnLO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLOActionPerformed(evt);
            }
        });
        getContentPane().add(btnLO);
        btnLO.setBounds(90, 330, 170, 83);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(252, 32, 37, 0);

        jLabel5.setBackground(new java.awt.Color(0, 153, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel\\OneDrive\\Desktop\\Tambakan ng Docs and shit\\iconuser.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 20, 90, 80);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel\\OneDrive\\Desktop\\Tambakan ng Docs and shit\\horizon3.png")); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 40, 410, 330);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(270, 10, 10, 410);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 80, 80);

        jLabel7.setBackground(new java.awt.Color(0, 153, 255));
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel\\OneDrive\\Desktop\\Tambakan ng Docs and shit\\iconuser.png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 20, 90, 80);

        jLabel8.setBackground(new java.awt.Color(0, 153, 255));
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel\\OneDrive\\Desktop\\Tambakan ng Docs and shit\\iconuser.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 20, 90, 80);

        jLabel9.setBackground(new java.awt.Color(0, 153, 255));
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel\\OneDrive\\Desktop\\Tambakan ng Docs and shit\\iconuser.png")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 20, 90, 80);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel\\OneDrive\\Desktop\\Tambakan ng Docs and shit\\iconuser3.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 230, 90, 80);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 230, 80, 80);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel\\OneDrive\\Desktop\\Tambakan ng Docs and shit\\iconuser4.png")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 120, 90, 80);

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 120, 80, 80);

        jPanel5.setBackground(new java.awt.Color(0, 51, 102));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel\\OneDrive\\Desktop\\Tambakan ng Docs and shit\\iconuser5.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 330, 80, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel\\OneDrive\\Desktop\\Tambakan ng Docs and shit\\bgc2.png")); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1200, 1600));
        jLabel4.setMinimumSize(new java.awt.Dimension(1200, 1400));
        jLabel4.setPreferredSize(new java.awt.Dimension(1200, 1600));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 760, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMEActionPerformed
        // Direct to Employee Form
        addEmployee AE = new addEmployee();
        AE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMEActionPerformed

    private void btnPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRActionPerformed
        // Direct to Payroll Form
        Payroll AE = new Payroll();
        AE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPRActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
       // Direct to Report Form
        Report AE = new Report();
        AE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRActionPerformed

    private void btnLOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLOActionPerformed
        // Direct to Login Form
        Login AE = new Login();
        AE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLOActionPerformed

   
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLO;
    private javax.swing.JButton btnME;
    private javax.swing.JButton btnPR;
    private javax.swing.JButton btnR;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.Menu menu6;
    private java.awt.Menu menu7;
    private java.awt.Menu menu8;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuBar menuBar3;
    private java.awt.MenuBar menuBar4;
    // End of variables declaration//GEN-END:variables
}
