/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplyChainManagementEnterpriseAdmin;
import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author AkshitSaxena
 */
public class SupplyChainManagementEnterpriseAdminWorkArea extends javax.swing.JPanel {
    private JPanel downJPanel;
    private EcoSystem ecosystem;
    private Enterprise enterprise;
    private Organization org;
    private UserAccount UserAccount;
    /**
     * Creates new form SupplierAdministratorWorkArea
     */
    public SupplyChainManagementEnterpriseAdminWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem) {
        initComponents();
        this.downJPanel = downJPanel;
        this.ecosystem = ESystem;
        this.enterprise = enterprise;
        this.UserAccount = UserAccount;
        this.org = org;
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
        jLabel1 = new javax.swing.JLabel();
        mngOrganisationBtn = new javax.swing.JButton();
        mngEmployeeBtn = new javax.swing.JButton();
        mngUserAccountBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setText("Supply Chain Management Enterprise Admin Work Area");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 40, -1, -1));

        mngOrganisationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/urban-time-management.png"))); // NOI18N
        mngOrganisationBtn.setText("Manage Organization");
        mngOrganisationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngOrganisationBtnActionPerformed(evt);
            }
        });

        mngEmployeeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage-employee.jpeg"))); // NOI18N
        mngEmployeeBtn.setText("Manage Organization Employee");
        mngEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngEmployeeBtnActionPerformed(evt);
            }
        });

        mngUserAccountBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage-user-account.jpeg"))); // NOI18N
        mngUserAccountBtn.setText("Manage User Account");
        mngUserAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngUserAccountBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Manage Organization Employee");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("Manage User Account");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setText("Manage Organization");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1166, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel4)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(mngOrganisationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(mngEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(mngUserAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mngOrganisationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mngEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mngUserAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mngOrganisationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngOrganisationBtnActionPerformed
        // TODO add your handling code here:
        ManageOrganization mng = new ManageOrganization(downJPanel, enterprise.getOrganizationDirectory());
        downJPanel.add("ManageOrganization", mng);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_mngOrganisationBtnActionPerformed

    private void mngEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngEmployeeBtnActionPerformed
        // TODO add your handling code here:
        ManageOrganizationEmployee mng = new ManageOrganizationEmployee(downJPanel, enterprise.getOrganizationDirectory());
        downJPanel.add("ManageEmployee", mng);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_mngEmployeeBtnActionPerformed

    private void mngUserAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngUserAccountBtnActionPerformed
        // TODO add your handling code here:
        ManageUserAccount mng = new ManageUserAccount(downJPanel, enterprise);
        downJPanel.add("ManageUserAccount", mng);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_mngUserAccountBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mngEmployeeBtn;
    private javax.swing.JButton mngOrganisationBtn;
    private javax.swing.JButton mngUserAccountBtn;
    // End of variables declaration//GEN-END:variables
}
