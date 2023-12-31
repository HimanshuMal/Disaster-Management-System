/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DisasterHelpProviderOrganisationAdmin;

import BusinessModel.Employee.Employee;
import BusinessModel.Organization.DisasterHelpProviderOrganization;
import BusinessModel.Organization.Organization;
import BusinessModel.Organization.OrganizationDirectory;
//import com.sun.glass.events.KeyEvent;
import java.awt.event.KeyEvent;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author pulkitprakash
 */
public class ManageEmployee extends javax.swing.JPanel {
    String selectedImagePath;

    /**
     * Creates new form ManageEmployee
     */
    private OrganizationDirectory orgdirectory;
    private JPanel downJPanel;
    public ManageEmployee(JPanel downJPanel,OrganizationDirectory orgdirectory) {
        initComponents();
        this.downJPanel = downJPanel;
        this.orgdirectory = orgdirectory;
        populateOrganizationJComboBox();
        populateOrganizationEmployeeJComboBox();
        
    }
    
    public void populateOrganizationJComboBox(){
        organizationJComboBox.removeAllItems();
        
        for (Organization organization : orgdirectory.getOrganizationList()){
            if(organization instanceof DisasterHelpProviderOrganization)
            organizationJComboBox.addItem(organization);
            
        }
    }
    
    public void populateOrganizationEmployeeJComboBox(){
        selectOrganizationJComboBox.removeAllItems();
        
        for (Organization organization : orgdirectory.getOrganizationList()){
             if(organization instanceof DisasterHelpProviderOrganization)
            selectOrganizationJComboBox.addItem(organization);
            
        }
    }
    
    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[3];
            row[0] = employee;
            row[2] = employee.getId();
            row[1] = organization.getName();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        selectOrganizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        ProfileTxtField = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 255, 255));

        addBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type of Organization", "ID"
            }
        ));
        jScrollPane1.setViewportView(employeeTable);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Manage Organization Employee");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        backBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 46, -1, 29));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setText("Organization: ");

        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Organization: ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Name:");

        ProfileTxtField.setBackground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel7.setText("Sex:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectOrganizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ProfileTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(242, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectOrganizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(addBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(ProfileTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
       Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
       Matcher matcher = pattern.matcher(nameTxtField.getText());
        
        if(nameTxtField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Employee Name can't be empty");
        }
       else if(!matcher.matches())
       {
         JOptionPane.showMessageDialog(null,"Name field should contain only characters");
       }
       else{
        
        Organization organization =(Organization)selectOrganizationJComboBox.getSelectedItem();
        String name = nameTxtField.getText();
        
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable(organization);
        
        nameTxtField.setText("");
      }
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        downJPanel.remove(this);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.previous(downJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization)organizationJComboBox.getSelectedItem();

        if (organization != null)
        {
            populateTable(organization);

        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProfileTxtField;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable employeeTable;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JComboBox selectOrganizationJComboBox;
    // End of variables declaration//GEN-END:variables
}
