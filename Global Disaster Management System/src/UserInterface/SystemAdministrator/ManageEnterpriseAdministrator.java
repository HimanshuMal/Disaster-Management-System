/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdministrator;



import BusinessModel.EcoSystem;
import BusinessModel.Employee.Employee;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Network.Network;
import BusinessModel.Role.HospitalAdminRole;
import BusinessModel.Role.DisasterManagementEnterpriseAdminRole;
import BusinessModel.Role.SuppyChainManagementEnterpriseAdminRole;
//import BusinessModel.Role.SupplierOrganisationAdminRole;
import BusinessModel.Role.EmergencyAssistanceEnterpriseAdminRole;
import BusinessModel.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HM
 */
public class ManageEnterpriseAdministrator extends javax.swing.JPanel {

     private JPanel downJPanel;
     private EcoSystem ecosystem;
    /**
     * Creates new form ManageEnterpriseAdministrator
     */
    public ManageEnterpriseAdministrator(JPanel downJPanel, EcoSystem ecosystem) {
        initComponents();
        UpdtBtn.setVisible(false);
        this.downJPanel = downJPanel;
        this.ecosystem = ecosystem;
        populateJTable();
        populateNetworkJComboBox();
        
    }

    
    private void populateJTable() 
    {
        DefaultTableModel model = (DefaultTableModel) enterpriseAdminJTable.getModel();

        model.setRowCount(0);
        for (Network network : ecosystem.getNetworkList())
        {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
            {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList())
                {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getNetworkname();
                    row[2] = userAccount;

                    model.addRow(row);
                }
            }
        }
    }
    
    private void populateNetworkJComboBox() 
    {
        networkJComboBox.removeAllItems();

        for (Network network : ecosystem.getNetworkList()) 
        {
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network) 
    {
        enterpriseTypeJComboBox.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
        {
            enterpriseTypeJComboBox.addItem(enterprise);
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

        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseAdminJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        nameTxtField = new javax.swing.JTextField();
        usernameTxtField = new javax.swing.JTextField();
        passwordTxtField = new javax.swing.JPasswordField();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        View = new javax.swing.JButton();
        UpdtBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 78, 252));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Enterprise Administrator");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 25, -1, 45));

        enterpriseAdminJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network Name", "Enterprise Admin Username "
            }
        ));
        jScrollPane1.setViewportView(enterpriseAdminJTable);

        jLabel2.setText("Network Name:");

        jLabel3.setText("Enterprise Name:");

        jLabel4.setText("Name:");

        jLabel5.setText("Username:");

        jLabel6.setText("Password:");

        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        UpdtBtn.setText("Update");
        UpdtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdtBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(UpdtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)
                        .addGap(223, 223, 223))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(22, 22, 22)
                                .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UpdtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
Enterprise enterprise = (Enterprise) enterpriseTypeJComboBox.getSelectedItem();
Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
       Matcher matcher = pattern.matcher(nameTxtField.getText());


       String username = usernameTxtField.getText();
        String password = String.valueOf(passwordTxtField.getPassword());
        String name = nameTxtField.getText();
        
        if(name.equals("")|| username.equals("")|| password.equals("") ){
            JOptionPane.showMessageDialog(null, "Any of the above field(s) can't be empty");
                return;
        }
         else if(!matcher.matches())
        {
          JOptionPane.showMessageDialog(null,"Name field should contain only characters");
        }
        
        else{



       Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        if (EcoSystem.checkIfUsernameIsUnique(username)) {
            UserAccount account = null;
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.DisasterManagement) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new DisasterManagementEnterpriseAdminRole());
            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.SupplyChainManagement) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new SuppyChainManagementEnterpriseAdminRole());



           } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.EmergencyAssistance) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new EmergencyAssistanceEnterpriseAdminRole());
            }
            else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.HospitalAssociation) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalAdminRole());
            }



           populateJTable();
            usernameTxtField.setText("");
            passwordTxtField.setText("");
            nameTxtField.setText("");
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a unique username!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        }      
     
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseAdminJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete!", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {

            UserAccount p = (UserAccount) enterpriseAdminJTable.getValueAt(selectedRow, 2);

            for (Network network : ecosystem.getNetworkList()) 
            {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
                {
                    for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList())
                    {
                        if (p == userAccount) {
                            enterprise.getUserAccountDirectory().getUserAccountList().remove(p);
                            break;
                        }

                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Account successfully deleted!");
            populateJTable();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        downJPanel.remove(this);
        Component[] componentArray = downJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        
        SystemAdministratorWorkArea sysAdminwjp = (SystemAdministratorWorkArea) component;
        //sysAdminwjp.populateTree(); //commented for populateTree on 3rd Dec 2022
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.previous(downJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void UpdtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdtBtnActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = enterpriseAdminJTable.getSelectedRow();
        String pass = String.valueOf(passwordTxtField.getPassword());
        DefaultTableModel model = (DefaultTableModel) enterpriseAdminJTable.getModel();
        UserAccount selectedPersonDetails = (UserAccount) model.getValueAt(selectedRowIndex, 2);
        
        if(pass.equals("")){
            JOptionPane.showMessageDialog(null, "Password cannot be empty");
                return;
        }
        else{
        JOptionPane.showMessageDialog(null, "Password Updated");
        selectedPersonDetails.setPassword(pass);
        }          
    }//GEN-LAST:event_UpdtBtnActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = enterpriseAdminJTable.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please Select a Row to View.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) enterpriseAdminJTable.getModel();
        
        UserAccount selectedPersonDetails = (UserAccount) model.getValueAt(selectedRowIndex, 2);
        usernameTxtField.setText(selectedPersonDetails.getUsername());
        passwordTxtField.setText(selectedPersonDetails.getPassword());
        JOptionPane.showMessageDialog(null, "You can Only Change Password");
        usernameTxtField.setEditable(false);
        nameTxtField.setEditable(false);
        UpdtBtn.setVisible(true);
    }//GEN-LAST:event_ViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdtBtn;
    private javax.swing.JButton View;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable enterpriseAdminJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}
