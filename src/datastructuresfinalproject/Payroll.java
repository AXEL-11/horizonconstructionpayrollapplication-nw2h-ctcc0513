/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package datastructuresfinalproject;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.Stack;

public class Payroll extends javax.swing.JFrame {
    
    Stack<String[]> stateStack = new Stack<>();
    
    public Payroll() {
        initComponents();
        Connect();
        dt();
        Fetch();
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Double SPD;

    // Display date
    public void dt() {
        LocalDate today = LocalDate.now();
        txtDate.setText(String.valueOf(today));
    }

    private void saveCurrentState() {
        String[] currentState = {
            txtWD.getText(),
            txtOT.getText(),
            txtLate.getText(),
            txtAbsent.getText(),
            txtDate.getText(),
            txtFirstName.getText(),
            txtLastName.getText(),
            txtID.getText(),
            txtJP.getText(),
            txtSPD.getText(),
            txtS.getText(),
            txtTOT.getText(),
            txtTL.getText(),
            txtTA.getText(),
            txtPH.getText(),
            txtPG.getText(),
            txtSSS.getText()
        };
        stateStack.push(currentState);
    }

    private void restoreLastState() {
        if (!stateStack.isEmpty()) {
            String[] lastState = stateStack.pop();
            txtWD.setText(lastState[0]);
            txtOT.setText(lastState[1]);
            txtLate.setText(lastState[2]);
            txtAbsent.setText(lastState[3]);
            txtDate.setText(lastState[4]);
            txtFirstName.setText(lastState[5]);
            txtLastName.setText(lastState[6]);
            txtID.setText(lastState[7]);
            txtJP.setText(lastState[8]);
            txtSPD.setText(lastState[9]);
            txtS.setText(lastState[10]);
            txtTOT.setText(lastState[11]);
            txtTL.setText(lastState[12]);
            txtTA.setText(lastState[13]);
            txtPH.setText(lastState[14]);
            txtPG.setText(lastState[15]);
            txtSSS.setText(lastState[16]);
        } else {
            JOptionPane.showMessageDialog(this, "No previous state to undo!");
        }
    }

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
         // Set the information on the table from the database
    
    private void Fetch(){
        try {
            int q;
            pst = con.prepareStatement("SELECT * FROM employees");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            q =rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a=1; a<= q; a++){
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("FirstName"));
                    v2.add(rs.getString("LastName"));
                    v2.add(rs.getString("Rate"));
                    v2.add(rs.getString("JobPosition"));
                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*public void Select(){
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        try {
            int rowindex = jTable1.getSelectedRow();
            int columnindex = 0;
            String value = jTable1.getValueAt(rowindex,columnindex ).toString();
            
            
            pst = con.prepareStatement("SELECT * FROM employees WHERE id=?");
            pst.setString(1, value);
            rs = pst.executeQuery();
            
            if(rs.next()==true){
                
                
                txtWD.setText(rs.getString(2));
                
                
                
            }else{
                JOptionPane.showMessageDialog(this, "No record found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Payroll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtWD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSPD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtOT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTOT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtLate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAbsent = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTL = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTA = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSSS = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPG = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPH = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txtTS = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnPr = new javax.swing.JButton();
        btnCompute = new javax.swing.JButton();
        btnSave1 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        txtJP = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        btnClear1 = new javax.swing.JButton();
        btnUndo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1125, 680));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "FirstName", "LastName", "Rate", "Job"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 48, 300, 336);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("INCOME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(339, 6, 89, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(16, 32, 284, 10);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(760, 10, 15, 630);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("EMPLOYEES");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(16, 6, 90, 20);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(339, 32, 403, 10);

        jLabel3.setText("Salary per day:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(548, 51, 100, 16);

        txtWD.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtWDAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(txtWD);
        txtWD.setBounds(439, 48, 91, 30);

        jLabel4.setText("Working Days:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(345, 51, 76, 16);

        txtSPD.setEditable(false);
        txtSPD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtSPD);
        txtSPD.setBounds(651, 48, 91, 32);

        jLabel5.setText("Salary:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(548, 101, 100, 16);

        txtS.setEditable(false);
        txtS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtS);
        txtS.setBounds(651, 98, 91, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("OVERTIME");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(339, 138, 89, 20);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(339, 164, 403, 10);

        jLabel7.setText("Regular OT(hr/s):");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(335, 183, 100, 16);
        getContentPane().add(txtOT);
        txtOT.setBounds(441, 180, 91, 30);

        jLabel8.setText("Total OT:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(550, 183, 60, 16);

        txtTOT.setEditable(false);
        txtTOT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtTOT);
        txtTOT.setBounds(651, 180, 91, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("DEDUCTIONS");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(339, 214, 96, 20);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(339, 240, 403, 10);

        jLabel10.setText("Late (hr/s):");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(345, 265, 80, 16);
        getContentPane().add(txtLate);
        txtLate.setBounds(440, 262, 91, 22);

        jLabel11.setText("Absent:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(352, 305, 80, 16);
        getContentPane().add(txtAbsent);
        txtAbsent.setBounds(441, 302, 91, 22);

        jLabel12.setText("Total Late: ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(550, 265, 80, 16);

        txtTL.setEditable(false);
        txtTL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtTL);
        txtTL.setBounds(651, 262, 90, 22);

        jLabel13.setText("Total Absent:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(550, 305, 77, 16);

        txtTA.setEditable(false);
        txtTA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtTA);
        txtTA.setBounds(651, 302, 91, 22);

        jLabel14.setText("SSS(4.5%): ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(550, 428, 70, 16);

        txtSSS.setEditable(false);
        txtSSS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtSSS);
        txtSSS.setBounds(651, 422, 91, 22);

        jLabel15.setText("Pag-IBIG(2%):");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(550, 385, 100, 16);

        txtPG.setEditable(false);
        txtPG.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtPG);
        txtPG.setBounds(651, 382, 91, 22);

        jLabel16.setText("PhilHealth(5%):");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(550, 345, 100, 16);

        txtPH.setEditable(false);
        txtPH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtPH);
        txtPH.setBounds(651, 342, 91, 22);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("SALARY");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(339, 457, 403, 20);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(339, 483, 403, 10);

        jLabel18.setText("Total Salary:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(339, 502, 65, 16);

        txtTS.setEditable(false);
        txtTS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtTS);
        txtTS.setBounds(440, 499, 91, 22);

        btnPrint.setText("Generate Receipt");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint);
        btnPrint.setBounds(339, 574, 123, 23);

        btnSave.setText("SELECT");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(16, 390, 123, 23);

        btnPr.setText("Print");
        btnPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrActionPerformed(evt);
            }
        });
        getContentPane().add(btnPr);
        btnPr.setBounds(780, 560, 123, 23);

        btnCompute.setText("Compute");
        btnCompute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputeActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompute);
        btnCompute.setBounds(339, 539, 123, 23);

        btnSave1.setText("Save");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave1);
        btnSave1.setBounds(474, 539, 123, 23);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(16, 419, 284, 10);

        jLabel19.setText("Date:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(16, 438, 42, 16);

        jLabel21.setText("FirstName:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(16, 478, 66, 16);

        jLabel22.setText("LastName:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(16, 524, 66, 16);

        jLabel23.setText("ID:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(16, 565, 66, 16);

        txtLastName.setEditable(false);
        txtLastName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtLastName);
        txtLastName.setBounds(110, 521, 90, 22);

        txtFirstName.setEditable(false);
        txtFirstName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtFirstName);
        txtFirstName.setBounds(110, 475, 90, 22);

        txtID.setEditable(false);
        txtID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtID);
        txtID.setBounds(110, 565, 90, 22);

        txtDate.setEditable(false);
        txtDate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtDate);
        txtDate.setBounds(110, 435, 90, 22);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1000, 600, 90, 32);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(318, 14, 15, 620);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("RECEIPT");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(770, 10, 89, 20);
        getContentPane().add(jSeparator10);
        jSeparator10.setBounds(770, 30, 320, 10);

        txtJP.setEditable(false);
        txtJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtJP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJPActionPerformed(evt);
            }
        });
        getContentPane().add(txtJP);
        txtJP.setBounds(110, 610, 90, 22);

        jLabel24.setText("Job Position");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(20, 610, 66, 16);

        area.setColumns(20);
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(780, 40, 308, 510);

        btnClear1.setText("Clear");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear1);
        btnClear1.setBounds(609, 539, 123, 23);

        btnUndo.setText("Undo");
        btnUndo.setMaximumSize(new java.awt.Dimension(121, 23));
        btnUndo.setPreferredSize(new java.awt.Dimension(121, 23));
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });
        getContentPane().add(btnUndo);
        btnUndo.setBounds(474, 574, 123, 23);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtWDAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtWDAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWDAncestorAdded

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // fill textboxes with information from the selected table
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() ==1){
        try {
            int rowindex = jTable1.getSelectedRow();
            int columnindex = 0;
            String value = jTable1.getValueAt(rowindex,columnindex ).toString();
            
            
            pst = con.prepareStatement("SELECT * FROM employees WHERE id=?");
            pst.setString(1, value);
            rs = pst.executeQuery();
            
            if(rs.next()==true){
                txtID.setText(rs.getString(1));
                txtFirstName.setText(rs.getString(2));
                txtLastName.setText(rs.getString(3));
                txtSPD.setText(rs.getString(5));
                txtJP.setText(rs.getString(6));
                SPD = Double.parseDouble(rs.getString(5));
        
            }else{
                JOptionPane.showMessageDialog(this, "No record found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Payroll.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty.");
            }else{
                JOptionPane.showMessageDialog(this, "Please select single row for Delete");
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComputeActionPerformed
        
        if((txtWD.getText() == null || txtWD.getText().trim().isEmpty()) || (txtOT.getText() == null || txtOT.getText().trim().isEmpty()) ||
           (txtLate.getText() == null || txtLate.getText().trim().isEmpty()) || (txtAbsent.getText() == null || txtAbsent.getText().trim().isEmpty())){
            // Error message if one of the textboxes is empty
            JOptionPane.showMessageDialog(this, "Please fill all the necessary information");
        }else{
        //Compute the salry and deductions
        Double S;
        Double OT;
        Double TOT;
        Double TL;
        Double TA;
        Double PH;
        Double PG;
        Double SSS;
        Double TS;
      
        S = Double.parseDouble(txtWD.getText()) * SPD;
        txtS.setText(String.valueOf(S));
        
        OT = (SPD/8 + ((SPD/8)*0.25));
        TOT = Double.parseDouble(txtOT.getText()) * OT;
        txtTOT.setText(String.valueOf(TOT));
        
        TL = Double.parseDouble(txtLate.getText()) * (SPD/8);
        txtTL.setText(String.valueOf(TL));
        
        TA = Double.parseDouble(txtAbsent.getText()) * SPD;
        txtTA.setText(String.valueOf(TA));   
        
        PH = SPD * 0.05;
        txtPH.setText(String.valueOf(PH));
        PG = SPD * 0.02;
        txtPG.setText(String.valueOf(PG));
        SSS = SPD * 0.045;
        txtSSS.setText(String.valueOf(SSS));
        
        TS = (S + TOT) - (TL + TA + PH + PG + SSS);
        txtTS.setText(String.valueOf(TS));
        saveCurrentState();
        }
    }//GEN-LAST:event_btnComputeActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
         if((txtWD.getText() == null || txtWD.getText().trim().isEmpty()) || (txtOT.getText() == null || txtOT.getText().trim().isEmpty()) ||
           (txtLate.getText() == null || txtLate.getText().trim().isEmpty()) || (txtAbsent.getText() == null || txtAbsent.getText().trim().isEmpty())){
             // Error message if one of the textboxes is empty
            JOptionPane.showMessageDialog(this, "Please fill all the necessary information");
        }else{
        try {
            // save the information on the report database
            pst = con.prepareStatement("INSERT INTO Report (Date, ID, FirstName, LastName, WorkingDays, SalaryperDay, Salary, RegularOT, TotalOt, Late, Absent, TotalLate, TotalAbsent, Philhealth, PagIBIG, SSS, TotalSalary)VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, txtDate.getText());
            pst.setString(2, txtID.getText());
            pst.setString(3, txtFirstName.getText());
            pst.setString(4, txtLastName.getText());
            pst.setString(5, txtWD.getText());
            pst.setString(6, txtSPD.getText());
            pst.setString(7, txtS.getText());
            pst.setString(8, txtOT.getText());
            pst.setString(9, txtTOT.getText());
            pst.setString(10, txtLate.getText());
            pst.setString(11, txtAbsent.getText());
            pst.setString(12, txtTL.getText());
            pst.setString(13, txtTA.getText());
            pst.setString(14, txtPH.getText());
            pst.setString(15, txtPG.getText());
            pst.setString(16, txtSSS.getText());
            pst.setString(17, txtTS.getText());
            
            

            int k = pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(this, "Record saved successfully");
               
                
                
            }else{
                JOptionPane.showMessageDialog(this, "failed");
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(addEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Go back to main menu
        MainMenu MM = new MainMenu();
        MM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        if((txtWD.getText() == null || txtWD.getText().trim().isEmpty()) || (txtOT.getText() == null || txtOT.getText().trim().isEmpty()) ||
           (txtLate.getText() == null || txtLate.getText().trim().isEmpty()) || (txtAbsent.getText() == null || txtAbsent.getText().trim().isEmpty())){
            // Error message if one of the textboxes is empty
            JOptionPane.showMessageDialog(this, "Please fill all the necessary information");
        }else{
            // generate the recceipt and display it
        area.setText("************************************************************\n");
        area.setText(area.getText()+"*                          Fees Recipt System                          *\n");
        area.setText(area.getText()+"************************************************************\n");
        
        Date obj = new Date();
        
        String date = obj.toString();
        
        // employee information
        area.setText(area.getText()+"\n"+date+"\n\n");
        area.setText(area.getText()+"EMPLOYEE'S INFORMATION\n");
        area.setText(area.getText()+"************************************************************\n\n");
        area.setText(area.getText()+"Employee's FirstName:   "+txtFirstName.getText()+"\n");
        area.setText(area.getText()+"Employee's LastName:   "+txtLastName.getText()+"\n");
        area.setText(area.getText()+"Job Position:   "+txtJP.getText()+"\n");
        area.setText(area.getText()+"ID:   "+txtID.getText()+"\n");
        // salary deductions
        area.setText(area.getText()+"\n");
        area.setText(area.getText()+"SALARY\n");
        area.setText(area.getText()+"************************************************************\n\n");
        area.setText(area.getText()+"Rate:   ₱"+txtSPD.getText()+"\n");
        area.setText(area.getText()+"Salary:   ₱"+txtS.getText()+"\n");
        area.setText(area.getText()+"Overtime:   ₱"+txtOT.getText()+"\n");
        area.setText(area.getText()+"\n");
        area.setText(area.getText()+"DEDUCTION\n");
        area.setText(area.getText()+"************************************************************\n\n");
        area.setText(area.getText()+"Total Late:   ₱"+txtTL.getText()+"\n");
        area.setText(area.getText()+"Total Absent:   ₱"+txtTA.getText()+"\n");
        area.setText(area.getText()+"PhilHealth:   ₱"+txtPH.getText()+"\n");
        area.setText(area.getText()+"Pag-IBIG:   ₱"+txtPG.getText()+"\n");
        area.setText(area.getText()+"SSS:   ₱"+txtSSS.getText()+"\n");
        // total salary
        area.setText(area.getText()+"\n");
        area.setText(area.getText()+"TOTAL PAYMENT\n");
        area.setText(area.getText()+"************************************************************\n\n");
        area.setText(area.getText()+"Total Salary:   ₱"+txtTS.getText()+"\n");
        }
        
    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtJPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJPActionPerformed

    private void btnPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrActionPerformed
        // prin the receipt
        try {
            area.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Payroll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // clear all textboxes
       // txtDate.setText("");
        txtID.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtWD.setText("");
        txtSPD.setText("");
        txtS.setText("");
        txtOT.setText("");
        txtTOT.setText("");
        txtLate.setText("");
        txtAbsent.setText("");
        txtTL.setText("");
        txtTA.setText("");
        txtPH.setText("");
        txtPG.setText("");
        txtSSS.setText("");
        txtTS.setText("");
        txtJP.setText("");
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
        restoreLastState();
    }//GEN-LAST:event_btnUndoActionPerformed

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
            java.util.logging.Logger.getLogger(Payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payroll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnCompute;
    private javax.swing.JButton btnPr;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnUndo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAbsent;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJP;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLate;
    private javax.swing.JTextField txtOT;
    private javax.swing.JTextField txtPG;
    private javax.swing.JTextField txtPH;
    private javax.swing.JTextField txtS;
    private javax.swing.JTextField txtSPD;
    private javax.swing.JTextField txtSSS;
    private javax.swing.JTextField txtTA;
    private javax.swing.JTextField txtTL;
    private javax.swing.JTextField txtTOT;
    private javax.swing.JTextField txtTS;
    private javax.swing.JTextField txtWD;
    // End of variables declaration//GEN-END:variables
}
