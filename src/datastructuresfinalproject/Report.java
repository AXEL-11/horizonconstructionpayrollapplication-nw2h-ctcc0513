
package datastructuresfinalproject;

import javax.swing.*;
import javax.swing.table.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Report extends javax.swing.JFrame {
    //store array of strings
    private List<String[]> dataArray = new ArrayList<>();
   
    public Report() {
        initComponents();
        Connect();
        Fetch();
    }
     Connection con;
    PreparedStatement pst;
    ResultSet rs;
    // Connect to database
     public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/employeeinfo","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private void loadData() {
    try {
        String query = "SELECT * FROM Report"; // Fetch row from database
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();

        dataArray.clear(); // Clear previous data
        // iterate through resullt set
        while (rs.next()) {
            String[] row = new String[] {
                rs.getString("Date"),
                rs.getString("ID"),
                rs.getString("FirstName"),
                rs.getString("LastName"),
                rs.getString("WorkingDays"),
                rs.getString("SalaryperDay"),
                rs.getString("Salary"),
                rs.getString("RegularOT"),
                rs.getString("TotalOT"),
                rs.getString("Late"),
                rs.getString("Absent"),
                rs.getString("TotalLate"),
                rs.getString("TotalAbsent"),
                rs.getString("PhilHealth"),
                rs.getString("PagIBIG"),
                rs.getString("SSS"),
                rs.getString("TotalSalary")
            };
            dataArray.add(row); // Add row to the list
        }
    } catch (SQLException ex) {
        Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
    }
}
     private void searchArray(String keyword) {
    DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
    df.setRowCount(0); // Clear the table

    //  search through the array
    for (String[] row : dataArray) {
        boolean match = false;
        for (String value : row) {
            if (value != null && value.toLowerCase().contains(keyword.toLowerCase())) {
                match = true; // Mark as match if the keyword is found
                break;
            }
        }
        if (match) {
            Vector<String> v2 = new Vector<>(Arrays.asList(row));// convert string to vector
            df.addRow(v2); // Add matching row to the table
        }
    }
}
    private void Fetch(String keyword) {
    if (dataArray.isEmpty()) {
        loadData(); // Load data if not already loaded
    }
    searchArray(keyword); // Search the array
}
     private void Fetch() {
    Fetch(""); // Call the overloaded Fetch with an empty keyword
}
     // Set the information on the table from the database
      /*private void Fetch(){
        try {
            int q;
            pst = con.prepareStatement("SELECT * FROM Report");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            q =rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a=1; a<= q; a++){
                    v2.add(rs.getString("Date"));
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("FirstName"));
                    v2.add(rs.getString("LastName"));
                    v2.add(rs.getString("WorkingDays"));
                    v2.add(rs.getString("SalaryperDay"));
                    v2.add(rs.getString("Salary"));
                    v2.add(rs.getString("RegularOT"));
                    v2.add(rs.getString("TotalOT"));
                    v2.add(rs.getString("Late"));
                    v2.add(rs.getString("Absent"));
                    v2.add(rs.getString("TotalLate"));
                    v2.add(rs.getString("TotalAbsent"));
                    v2.add(rs.getString("PhilHealth"));
                    v2.add(rs.getString("PagIBIG"));
                    v2.add(rs.getString("SSS"));
                    v2.add(rs.getString("TotalSalary"));
                    
                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("REPORT");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "ID", "FirstName", "LastName", "WorkingDays", "SalaryperDay", "Salary", "RegularOT", "TotalOT", "Late", "Absent", "TotalLate", "TotalAbsent", "PhilHealth", "PagIBIG", "SSS", "TotalSalary"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(3000, 500));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 701, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // go back to main menu
        MainMenu MM = new MainMenu();
        MM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String keyword = txtSearch.getText().trim();
         Fetch(keyword); 
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
