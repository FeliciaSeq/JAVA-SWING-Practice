/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.EmployeeData;

/**
 *
 * @author felsparkle
 */
public class AddJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddJPanel
     */
    EmployeeData Data;
    
    public AddJPanel(EmployeeData Data) {
        initComponents();
        this.Data = Data;
        
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPhoneNumber = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lblemailID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        txtPositionTitle = new javax.swing.JTextField();
        lblPositionTitle = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        txtID1 = new javax.swing.JTextField();
        lblID1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtName1 = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        txtID2 = new javax.swing.JTextField();
        lblID2 = new javax.swing.JLabel();
        txtAge1 = new javax.swing.JTextField();
        lblAge1 = new javax.swing.JLabel();
        txtGender1 = new javax.swing.JTextField();
        lblGender1 = new javax.swing.JLabel();
        txtStartDate1 = new javax.swing.JTextField();
        lblStartDate1 = new javax.swing.JLabel();
        lblPhoneNumber1 = new javax.swing.JLabel();
        txtEmailID1 = new javax.swing.JTextField();
        lblemailID1 = new javax.swing.JLabel();
        txtLevel1 = new javax.swing.JTextField();
        txtTeamInfo1 = new javax.swing.JTextField();
        lblLevel1 = new javax.swing.JLabel();
        lblTeamInfo1 = new javax.swing.JLabel();
        txtPositionTitle1 = new javax.swing.JTextField();
        lblPositionTitle1 = new javax.swing.JLabel();
        txtPhoneNo1 = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();

        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNumber.setText("Phone No:");

        lblemailID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblemailID.setText("Email ID:");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        lblID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID.setText("ID:");

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age:");

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");

        lblStartDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStartDate.setText("Start Date:");

        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLevel.setText("Level:");

        lblTeamInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTeamInfo.setText("Team Info:");

        lblPositionTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPositionTitle.setText("Position Title:");

        txtID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID1ActionPerformed(evt);
            }
        });

        lblID1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID1.setText("ID:");

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Search Employee Details");

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Cell No", "Email ID"
            }
        ));
        jScrollPane1.setViewportView(tblEmployee);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName1ActionPerformed(evt);
            }
        });

        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName1.setText("Name:");

        txtID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID2ActionPerformed(evt);
            }
        });

        lblID2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID2.setText("ID:");

        txtAge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAge1ActionPerformed(evt);
            }
        });

        lblAge1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge1.setText("Age:");

        txtGender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGender1ActionPerformed(evt);
            }
        });

        lblGender1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender1.setText("Gender:");

        txtStartDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDate1ActionPerformed(evt);
            }
        });

        lblStartDate1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStartDate1.setText("Start Date:");

        lblPhoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNumber1.setText("Phone No:");

        txtEmailID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailID1ActionPerformed(evt);
            }
        });

        lblemailID1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblemailID1.setText("Email ID:");

        txtLevel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevel1ActionPerformed(evt);
            }
        });

        txtTeamInfo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamInfo1ActionPerformed(evt);
            }
        });

        lblLevel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLevel1.setText("Level:");

        lblTeamInfo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTeamInfo1.setText("Team Info:");

        txtPositionTitle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionTitle1ActionPerformed(evt);
            }
        });

        lblPositionTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPositionTitle1.setText("Position Title:");

        txtPhoneNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNo1ActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStartDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStartDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPositionTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblemailID1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPositionTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailID1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTeamInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTeamInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPhoneNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(180, 180, 180))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnView))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTeamInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeamInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPositionTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPositionTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStartDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemailID1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName1ActionPerformed

    private void txtID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID1ActionPerformed

    private void txtID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID2ActionPerformed

    private void txtAge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAge1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAge1ActionPerformed

    private void txtGender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGender1ActionPerformed

    private void txtStartDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDate1ActionPerformed

    private void txtEmailID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailID1ActionPerformed

    private void txtLevel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevel1ActionPerformed

    private void txtTeamInfo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamInfo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamInfo1ActionPerformed

    private void txtPositionTitle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionTitle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionTitle1ActionPerformed

    private void txtPhoneNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNo1ActionPerformed

    
    
    
    
    
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         // TODO add your handling code here:
         int selectedRowIndex = tblEmployee.getSelectedRow();
         if (selectedRowIndex<0){
             
             JOptionPane.showMessageDialog(this,"Select a row to delete.");
             return;
         
         }
         
             DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
             Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex,0);
             
             Data.deleteEmployee(selectedEmployee);
             
             JOptionPane.showMessageDialog(this,"Employee detail deleted.");
             populateTable();
    

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblEmployee.getSelectedRow();
         if (selectedRowIndex<0){
             
             JOptionPane.showMessageDialog(this,"Select a row to View.");
             return;
         
         }
         
             DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
             Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex,0);
             
             txtName1.setText(selectedEmployee.getName());
             txtID2.setText(selectedEmployee.getEmployeeID());
             txtAge1.setText(selectedEmployee.getAge());
             txtGender1.setText(selectedEmployee.getGender());
             txtStartDate1.setText(selectedEmployee.getStartDate());
             txtLevel1.setText(selectedEmployee.getLevel());
             txtTeamInfo1.setText(selectedEmployee.getTeamInfo());
             txtPositionTitle1.setText(selectedEmployee.getPositionTitle());
             txtPhoneNo1.setText(selectedEmployee.getCellNo());
             txtEmailID1.setText(selectedEmployee.getEmail());
             
        
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model =(DefaultTableModel) tblEmployee.getModel();
      if(tblEmployee.getSelectedRowCount()==1){
         
     
        String name = txtName1.getText();
        String EmployeeID = txtID2.getText();
        String Age = txtAge1.getText();
        String Gender= txtGender1.getText();
        String StartDate = txtStartDate1.getText();
        String Level= txtLevel1.getText();
        String TeamInfo = txtTeamInfo1.getText();
        String PositionTitle= txtPositionTitle1.getText();
        String CellNo= txtPhoneNo1.getText();
        String Email= txtEmailID1.getText();
        
       
        model.setValueAt(name,tblEmployee.getSelectedRow(),0);
        model.setValueAt(EmployeeID,tblEmployee.getSelectedRow(),1);
        model.setValueAt(Age,tblEmployee.getSelectedRow(),2);
        model.setValueAt(Gender,tblEmployee.getSelectedRow(),3);
        model.setValueAt(StartDate,tblEmployee.getSelectedRow(),4);
        model.setValueAt(Level,tblEmployee.getSelectedRow(),5);
        
        model.setValueAt(TeamInfo,tblEmployee.getSelectedRow(),6);
        model.setValueAt(PositionTitle,tblEmployee.getSelectedRow(),7);
        model.setValueAt(CellNo,tblEmployee.getSelectedRow(),8);
        model.setValueAt(Email,tblEmployee.getSelectedRow(),9);
       
       
        JOptionPane.showMessageDialog(this,"Employee Details Updated Successfully.");
        populateTable();
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

                 
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAge1;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGender1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblLevel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoneNumber1;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblPositionTitle1;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblStartDate1;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTeamInfo1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblemailID;
    private javax.swing.JLabel lblemailID1;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAge1;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtEmailID1;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtGender1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID1;
    private javax.swing.JTextField txtID2;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtLevel1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtPhoneNo1;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtPositionTitle1;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtStartDate1;
    private javax.swing.JTextField txtTeamInfo;
    private javax.swing.JTextField txtTeamInfo1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        model.setRowCount(0);
        
        for(Employee em : Data .getData()){
            
            Object [] row = new Object[10];
            row[0] = em;
            row[1] = em.getEmployeeID();
            row[2] = em.getAge();
            row[3] = em.getGender();
            row[4] = em.getStartDate();
            row[5] = em.getLevel();
            row[6] = em.getTeamInfo();
            row[7] = em.getPositionTitle();
            row[8] = em.getCellNo();
            row[9] = em.getEmail();
            
            model.addRow(row);
            
                    
            
        }
    }
}
