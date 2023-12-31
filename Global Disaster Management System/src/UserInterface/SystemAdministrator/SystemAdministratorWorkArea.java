/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdministrator;


import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Network.Network;
import BusinessModel.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


/**
 *
 * @author HM
 */
public class SystemAdministratorWorkArea extends javax.swing.JPanel {

    
    private EcoSystem ecosystem;
    private JPanel downJPanel;
    /**
     * Creates new form SystemAdministratorWorkArea
     */
    public SystemAdministratorWorkArea(JPanel downJPanel,EcoSystem ecosystem) {
        initComponents();
        this.downJPanel=downJPanel;
        this.ecosystem=ecosystem;
       // populateTree();
    }

    
    /*public void populateTree(){
        DefaultTreeModel model = (DefaultTreeModel) networkJTree.getModel();

        
        
        ArrayList<Network> networkList = ecosystem.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        Network network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        
        DefaultMutableTreeNode enterpriseNode;
        
        DefaultMutableTreeNode organizationNode;
        
        for (int i = 0; i < networkList.size(); i++) 
        {
            network = networkList.get(i);
            
            networkNode = new DefaultMutableTreeNode(network.getNetworkname());
            
            networks.insert(networkNode, i);

            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();

            for (int j = 0; j < enterpriseList.size(); j++) 
            {
                enterprise = enterpriseList.get(j);
                
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                
                networkNode.insert(enterpriseNode, j);

                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
                
                for (int k = 0; k < organizationList.size(); k++) 
                {
                    organization = organizationList.get(k);
                    
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }

        model.reload();
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        manageNetworkBtn = new javax.swing.JButton();
        manageEnterpriseBtn = new javax.swing.JButton();
        manageEnterpriseAdministratorBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        manageCustomerBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        jSplitPane1.setDividerLocation(200);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setText("System Administrator Work Area");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-203, 0, 2090, 150));

        manageNetworkBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pablita-woman-with-magnifier-looking-for-empoyees-online.png"))); // NOI18N
        manageNetworkBtn.setToolTipText("");
        manageNetworkBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manageNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkBtnActionPerformed(evt);
            }
        });
        jPanel2.add(manageNetworkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 185, 201, 224));

        manageEnterpriseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage-employee.jpeg"))); // NOI18N
        manageEnterpriseBtn.setText("Manage Enterprise");
        manageEnterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseBtnActionPerformed(evt);
            }
        });
        jPanel2.add(manageEnterpriseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 210, 220));

        manageEnterpriseAdministratorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3d-casual-life-looking-through-resumes.png"))); // NOI18N
        manageEnterpriseAdministratorBtn.setToolTipText("");
        manageEnterpriseAdministratorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseAdministratorBtnActionPerformed(evt);
            }
        });
        jPanel2.add(manageEnterpriseAdministratorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 250, 211));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Network");
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 421, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setText("Manage Enterprise");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setText("Manage Customer");
        jLabel5.setToolTipText("");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 420, -1, -1));

        manageCustomerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clip-man-logging-into-his-account-on-phone.png"))); // NOI18N
        manageCustomerBtn.setText("ManageCustomer");
        manageCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerBtnActionPerformed(evt);
            }
        });
        jPanel2.add(manageCustomerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 260, 220));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel7.setText("Manage Enterprise Administrator");
        jLabel7.setToolTipText("");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 30, -1));

        jSplitPane1.setRightComponent(jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1978, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerBtnActionPerformed
        ManageCustomer system = new ManageCustomer(downJPanel,ecosystem);
        downJPanel.add("ManageCustomer", system);
        CardLayout layout= (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_manageCustomerBtnActionPerformed

    private void manageEnterpriseAdministratorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseAdministratorBtnActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdministrator system = new ManageEnterpriseAdministrator(downJPanel,ecosystem);
        downJPanel.add("ManageEnterpriseAdmin", system);
        CardLayout layout= (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_manageEnterpriseAdministratorBtnActionPerformed

    private void manageEnterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseBtnActionPerformed
        // TODO add your handling code here:
        ManageEnterprise system = new ManageEnterprise(downJPanel,ecosystem);
        downJPanel.add("ManageEnterprise", system);
        CardLayout layout= (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_manageEnterpriseBtnActionPerformed

    private void manageNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkBtnActionPerformed
        // TODO add your handling code here:
        ManageNetwork system = new ManageNetwork(downJPanel,ecosystem);
        downJPanel.add("ManageNetwork", system);
        CardLayout layout= (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_manageNetworkBtnActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton manageCustomerBtn;
    private javax.swing.JButton manageEnterpriseAdministratorBtn;
    private javax.swing.JButton manageEnterpriseBtn;
    private javax.swing.JButton manageNetworkBtn;
    // End of variables declaration//GEN-END:variables
}
