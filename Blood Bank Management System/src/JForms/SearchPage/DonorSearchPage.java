/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JForms.SearchPage;

import DatabaseFiles.DBConnect;
import JForms.ListsAndUpdates.donorList;
import JForms.Pages.DonorPage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ONLINE
 */
public class DonorSearchPage extends javax.swing.JFrame {

    /**
     * Creates new form DonorSearchPage
     */
    public DonorSearchPage() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NameRadio = new javax.swing.JRadioButton();
        AreaRadio = new javax.swing.JRadioButton();
        BloodGroupRadio = new javax.swing.JRadioButton();
        txt_name = new javax.swing.JTextField();
        btn_name_search = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEARCH PAGE FOR DONOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 16, 370, 50));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("       SEARCH BY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 220, 70));

        NameRadio.setBackground(new java.awt.Color(102, 0, 0));
        NameRadio.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        NameRadio.setForeground(new java.awt.Color(255, 255, 255));
        NameRadio.setText("Name");
        NameRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameRadioActionPerformed(evt);
            }
        });
        getContentPane().add(NameRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 180, -1));

        AreaRadio.setBackground(new java.awt.Color(102, 0, 0));
        AreaRadio.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        AreaRadio.setForeground(new java.awt.Color(255, 255, 255));
        AreaRadio.setText("Area");
        getContentPane().add(AreaRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, -1));

        BloodGroupRadio.setBackground(new java.awt.Color(102, 0, 0));
        BloodGroupRadio.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        BloodGroupRadio.setForeground(new java.awt.Color(255, 255, 255));
        BloodGroupRadio.setText("Blood Group");
        getContentPane().add(BloodGroupRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 170, 40));

        btn_name_search.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        btn_name_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btn_name_search.setText("SEARCH");
        btn_name_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_name_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_name_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        btn_back.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 190, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.jpg"))); // NOI18N
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 490));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        DonorPage window;
        window = new DonorPage();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_name_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_name_searchActionPerformed
        // TODO add your handling code here:
        String value = txt_name.getText();
        
         String radioText = "";
         
        DBConnect ne = new DBConnect();
        Connection con=null; Statement st = null;
        try{
            con = ne.connectToDB();
        }catch(Exception e)
        {
            System.out.println("Database Not Connected") ;
        }
        try{
            st = con.createStatement();

        }catch(Exception e){
            System.out.println("Statement Creation Problem");
        }
        try{
            
            String query = null;
            
                if(NameRadio.isSelected())
            {
                radioText=NameRadio.getText();
                System.out.println(radioText);
                query = "SELECT  * from DONOR where  DonorName = '"+value+"'";
            }
            else if(AreaRadio.isSelected())
             {
                 radioText=AreaRadio.getText();
                 query = "SELECT  * from DONOR where  DonorArea = '"+value+"'";
            }
            else if(BloodGroupRadio.isSelected())
             {
                 radioText=BloodGroupRadio.getText();
                 query = "SELECT  * from DONOR where  DonorBloodGroup = '"+value+"'";
             }
            ResultSet rs = st.executeQuery(query);
            System.out.println(NameRadio);
            int n=0;
            while(rs.next()){
                n++;
            }
            if(n>0){
                donorList window;
                window = new donorList(value);
                window.setVisible(true);
                this.setVisible(false);

            }else{
                JOptionPane.showMessageDialog(null, "Not Found");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Not Found");
        }
    }//GEN-LAST:event_btn_name_searchActionPerformed

    private void NameRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameRadioActionPerformed

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
            java.util.logging.Logger.getLogger(DonorSearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonorSearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonorSearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonorSearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonorSearchPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AreaRadio;
    private javax.swing.JRadioButton BloodGroupRadio;
    private javax.swing.JRadioButton NameRadio;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_name_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
