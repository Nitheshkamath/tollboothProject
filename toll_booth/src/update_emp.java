
import Connectror.jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.HeadlessException;
import static java.lang.reflect.Array.set;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Nitesh
 */
public class update_emp extends javax.swing.JFrame {

    /**
     * Creates new form update_emp
     */
    public update_emp() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(700, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel1.setText("emp_id");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setText("ename");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 126, 70, 20));

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setText("DOB");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 40, 20));

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setText("ADDRESS");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setText("PHONENO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 200, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 200, -1));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 210, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 230, 30));

        jButton6.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        jButton6.setText("UPDATE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setText("UPDATE EMPLOYEE DETAILS");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 640, 20));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nitesh\\Downloads\\icons8-search-more-42.png")); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 130, 40));

        jButton2.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, 30));

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

     
     String emp_id=jTextField1.getText();  
String ename=jTextField2.getText();
SimpleDateFormat dFormat=new SimpleDateFormat("yyyy-MM-dd");
String dob=dFormat.format(jDateChooser1.getDate());
String address=jTextArea1.getText();
String phoneno=jTextField3.getText(); 
try{
     Connection con=jdbc.getCon();
     Statement st=con.createStatement();
     st.executeUpdate("update employee set ename='"+ename+"',dob='"+dob+"',address='"+address+"',phoneno='"+phoneno+"' where emp_id='"+emp_id+"'");

   //statement st=(statement) con.createStatement();
   //st.executeUpdate("insert into emp( 'emp_id','ename','address','phoneno')values('"+emp_id+"','"+ename+"','"+address+"','"+phoneno+"')");
   JOptionPane.showMessageDialog(null,"successfully updated");
   setVisible(false);
   new update_emp().setVisible(true);
 
   
}
catch(Exception e)
        {
      JOptionPane.showMessageDialog(null,"not updated.already present");     
}

      
   
   //statement st=(statement) con.createStatement();
   //st.executeUpdate("insert into emp( 'emp_id','ename','address','phoneno')values('"+emp_id+"','"+ename+"','"+address+"','"+phoneno+"')");
  
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          operation in=new operation();
        in.show();
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       setVisible(false);
       new update_emp().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String emp_id=jTextField1.getText();
       try{
            Connection con=jdbc.getCon();
     Statement st=con.createStatement();
     java.sql.ResultSet rs=st.executeQuery("select * from employee where emp_id='"+emp_id+"'");
     if(rs.next())
     {
         
         jTextField2.setText(rs.getString(2));
         jDateChooser1.setDate(rs.getDate(3));
         jTextArea1.setText(rs.getString(4));
         jTextField3.setText(rs.getString(5));
jTextField1.setEditable(false);
     }
       
        else
        {
          JOptionPane.showMessageDialog(null,"EMPLYOEE ID NOT EXIST");
                
                } 
       }
        catch(Exception e)
                {
                 
                }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

        


    /**
     * @param args the command line arguments
     */
public static void main(String args[]){
  
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
            java.util.logging.Logger.getLogger(update_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_emp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}