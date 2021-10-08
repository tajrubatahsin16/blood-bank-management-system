/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JForms.ListsAndUpdates;

import JForms.Pages.recipientPage;
import JForms.Pages.recipientPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author ONLINE
 */
public class recipientList extends javax.swing.JFrame {

    /**
     * Creates new form employeeList
     */
    public recipientList() {
        initComponents();
        try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;user=sa;password=123456;" +
            "databaseName=BloodBankMS;");
            
   
             Statement statement = connection.createStatement();  
               
             ResultSet rs = statement.executeQuery("SELECT RecipientID , RecipientName ,RecipientAge ,RecipientGender ,RecipientBloodGroup ,RecipientAddress , RecipientArea , RecipientPhoneNumber , DonationNumber  from Recipient");  
             ResultSetMetaData  rsmetadata = rs.getMetaData(); 
              int  columns = rsmetadata.getColumnCount();   
              DefaultTableModel dtm = new DefaultTableModel(); 
              Vector columns_name=new Vector();
              Vector data_rows=new Vector();
              for(int  i= 1; i < columns+1; i++)  
                {             
                        columns_name.addElement (rsmetadata.getColumnLabel(i));  
                }                 
              
              dtm.setColumnIdentifiers(columns_name);
                   while (rs.next())  
           {  
               data_rows = new Vector(); 
               for (int j = 1; j <columns+1; j++)  
               {  
                   data_rows.addElement(rs.getString(j)) ;
               }  
               dtm.addRow(data_rows);  
               
       }   
          rcpTable.setModel(dtm); 
             
         } catch (Exception e) {  
             e.printStackTrace();  
         }
    }
    
    public recipientList(String value) {
         initComponents();
        try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;user=sa;password=123456;" +
            "databaseName=BloodBankMS;");
            
   
               Statement statement = connection.createStatement();  
         
             ResultSet rs = statement.executeQuery("SELECT  * from Recipient where RecipientBloodGroup = '"+value+"'"+"or RecipientName = '"+value+"'"+"or RecipientArea = '"+value+"'"
                                                    +"or DonationNumber = '"+value.toString()+"'");  
             ResultSetMetaData  rsmetadata = rs.getMetaData(); 
              int  columns = rsmetadata.getColumnCount();   
              DefaultTableModel dtm = new DefaultTableModel(); 
              Vector columns_name=new Vector();
              Vector data_rows=new Vector();
              for(int  i= 1; i < columns+1; i++)  
                {             
                        columns_name.addElement (rsmetadata.getColumnLabel(i));  
                }                 
              
              dtm.setColumnIdentifiers(columns_name);
                   while (rs.next())  
           {  
               data_rows = new Vector(); 
               for (int j = 1; j <columns+1; j++)  
               {  
                   data_rows.addElement(rs.getString(j)) ;
               }  
               dtm.addRow(data_rows);  
               
       }   
          rcpTable.setModel(dtm); 
             
         } catch (Exception e) {  
             e.printStackTrace();  
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

        jScrollPane1 = new javax.swing.JScrollPane();
        rcpTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btn_BACK = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rcpTable.setBackground(new java.awt.Color(255, 255, 153));
        rcpTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rcpTable.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        rcpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "AGE", "GENDER", "BLOOD GROUP", "ADDRESS", "AREA", "PHONE NO", "DONATION NO"
            }
        ));
        jScrollPane1.setViewportView(rcpTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 153, 1101, 410));

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel8.setText("           RECIPIENTS LIST");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 370, 70));

        btn_BACK.setBackground(new java.awt.Color(255, 255, 153));
        btn_BACK.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btn_BACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn_BACK.setText("BACK");
        btn_BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BACKActionPerformed(evt);
            }
        });
        getContentPane().add(btn_BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        btn_update.setBackground(new java.awt.Color(255, 255, 153));
        btn_update.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update details.png"))); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        btn_delete.setBackground(new java.awt.Color(255, 255, 153));
        btn_delete.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LISTPAGER5.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BACKActionPerformed
        // TODO add your handling code here:
        recipientPage window;
        window = new recipientPage();
        window.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_BACKActionPerformed

    UpdateRecipientList jtRowData = new UpdateRecipientList();
    
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        UpdateRecipientList window;
        window = new UpdateRecipientList();
        window.setVisible(true);
        this.setVisible(false);
        /*
         int index = rcpTable.getSelectedRow();
        TableModel model = rcpTable.getModel();
        String RecipientID = model.getValueAt(index, 0).toString();
        String RecipientName = model.getValueAt(index, 1).toString();
        String RecipientAge = model.getValueAt(index, 2).toString();
        String RecipientGender = model.getValueAt(index, 3).toString();
        String RecipientBloodGroup = model.getValueAt(index, 4).toString();
        String RecipientAddress = model.getValueAt(index, 5).toString();
         String RecipientArea = model.getValueAt(index, 6).toString();
          String  RecipientPhoneNumber = model.getValueAt(index, 7).toString();
           String DonationNumber = model.getValueAt(index,8).toString();
           
        jtRowData.setVisible(true);
        jtRowData.pack();
        jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(false);

        jtRowData.txt_id.setText(RecipientID);
        jtRowData.txt_name.setText(RecipientName);
        jtRowData.txt_area.setText(RecipientArea);
        jtRowData.txt_address.setText(RecipientAddress); 
        jtRowData.txt_gender.setText(RecipientGender);
        jtRowData.txt_blood.setText(RecipientBloodGroup);
        jtRowData.txt_phone.setText(RecipientPhoneNumber);
        jtRowData.txt_age.setText(RecipientAge);
        jtRowData.txt_Dno.setText(DonationNumber);*/
        

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        int row = rcpTable.getSelectedRow();
        int col = 0;
        Object id = rcpTable.getValueAt( row, col );
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;user=sa;password=123456;" +
                "databaseName=BloodBankMS;");

            Statement statement = connection.createStatement();
            String query="delete from Recipient where RecipientId="+id;
            statement.execute(query);
            JOptionPane.showMessageDialog(null, "Delete Successful!");

        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(recipientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recipientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recipientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recipientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recipientList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BACK;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable rcpTable;
    // End of variables declaration//GEN-END:variables
}
