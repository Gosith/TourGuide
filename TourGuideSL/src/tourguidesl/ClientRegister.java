/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tourguidesl;

import DatabaseConnection.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class ClientRegister extends javax.swing.JFrame {

    private String gender;
    JFrame f;

    /**
     * Creates new form clientRegister
     */
    public ClientRegister() {
        initComponents();
        groupRadio();
        refreshtbl();

    }

    public void groupRadio() {
        buttonGroup1.add(male);
        buttonGroup1.add(female);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        emailfield = new java.awt.TextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        contactfield = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        other = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namefield = new java.awt.TextField();
        agefield = new java.awt.TextField();
        countryfield = new java.awt.TextField();
        clearbtn = new javax.swing.JButton();
        registerbtn1 = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        recordtbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel8.setFont(new java.awt.Font("Amiri", 1, 18)); // NOI18N
        jLabel8.setText("Enter client details");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Amiri", 1, 18)); // NOI18N
        jLabel1.setText("Enter client details");

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 241, 30));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 53, -1));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 64, -1));
        jPanel1.add(contactfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 241, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        buttonGroup1.add(other);
        other.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        other.setForeground(new java.awt.Color(255, 255, 255));
        other.setText("Prefer not to tell");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });
        jPanel1.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 41, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 41, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Country");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 41, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 60, -1));
        jPanel1.add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 241, 30));
        jPanel1.add(agefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 241, 30));
        jPanel1.add(countryfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 241, 30));

        clearbtn.setForeground(new java.awt.Color(153, 0, 0));
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 73, -1));

        registerbtn1.setForeground(new java.awt.Color(153, 0, 0));
        registerbtn1.setText("Register");
        registerbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(registerbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 73, -1));

        updatebtn.setForeground(new java.awt.Color(153, 0, 0));
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 73, -1));

        deletebtn.setForeground(new java.awt.Color(153, 0, 0));
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 70, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(102, 0, 0));

        recordtbl.setBackground(new java.awt.Color(153, 0, 0));
        recordtbl.setForeground(new java.awt.Color(255, 255, 255));
        recordtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Email", "Gender", "Country", "Age", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recordtbl.getTableHeader().setResizingAllowed(false);
        recordtbl.getTableHeader().setReorderingAllowed(false);
        recordtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordtblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(recordtbl);
        if (recordtbl.getColumnModel().getColumnCount() > 0) {
            recordtbl.getColumnModel().getColumn(0).setResizable(false);
            recordtbl.getColumnModel().getColumn(1).setResizable(false);
            recordtbl.getColumnModel().getColumn(2).setResizable(false);
            recordtbl.getColumnModel().getColumn(3).setResizable(false);
            recordtbl.getColumnModel().getColumn(4).setResizable(false);
            recordtbl.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 590, 270));

        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(464, 464, 464)
                            .addComponent(jLabel1))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        gender = male.getText();
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        gender = female.getText();
    }//GEN-LAST:event_femaleActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
        gender = other.getText();
    }//GEN-LAST:event_otherActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        emailfield.setEditable(true);
        contactfield.setText("");
        countryfield.setText("");
        emailfield.setText("");
        agefield.setText("");
        namefield.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_clearbtnActionPerformed

    
    private void registerbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtn1ActionPerformed

        String name = namefield.getText();
        String country = countryfield.getText();
        String age = agefield.getText();
        String email = emailfield.getText();
        String contact = contactfield.getText();

        try {
            DBConnection dbcon = new DBConnection();
            if (!"".equals(name) && !"".equals(country) && !"".equals(age) && !"".equals(contact)) {
                String Query = "INSERT into client (name,email,country,contact,gender,age) values('" + name + "','" + email + "','" + country + "','" + contact + "','" + gender + "','" + age + "');";

                dbcon.ExecuteQuery(Query);

                contactfield.setText("");
                countryfield.setText("");
                emailfield.setText("");
                agefield.setText("");
                namefield.setText("");
            } else {
                JOptionPane.showMessageDialog(f, "Please check for null fields, cannot enter null values to database");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientRegister.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_registerbtn1ActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        if(recordtbl.getSelectedRowCount()==1){
            
        String name = namefield.getText();
        String country = countryfield.getText();
        String age = agefield.getText();
        String email = emailfield.getText();
        String contact = contactfield.getText();
        
        
        
        
        try {
            DBConnection dbcon = new DBConnection();
            if (!"".equals(name) && !"".equals(country) && !"".equals(age) && !"".equals(contact)) {
                String Query = "UPDATE client SET name='"+name+"',country='"+country+"',age='"+age+"',contact ='"+contact+"',gender='"+gender+"' where email='"+email+"'";

                dbcon.ExecuteQuery(Query);

                contactfield.setText("");
                countryfield.setText("");
                emailfield.setText("");
                agefield.setText("");
                namefield.setText("");
            } else {
                JOptionPane.showMessageDialog(f, "Please check for null fields, cannot enter null values to database");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(f, "Table is empty");
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refreshtbl();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        ClientDetails client = new ClientDetails();
        client.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        int row = recordtbl.getSelectedRow();
        
        try {
            String user = (String) recordtbl.getModel().getValueAt(row, 1);
            String sql = "DELETE from client where email='"+user+"'";
            
            try {
                DBConnection dbcon = new DBConnection();
                dbcon.ExecuteQuery(sql);
                JOptionPane.showMessageDialog(f, "Record deleted successfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(f, "Record could not be deleted successfully");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(f, "Please select a record to be deleted");
        }


    }//GEN-LAST:event_deletebtnActionPerformed

    public void loadrecord(){
        int row = recordtbl.getSelectedRow();
       
        
       namefield.setText((String) recordtbl.getModel().getValueAt(row, 0));
       agefield.setText((String) recordtbl.getModel().getValueAt(row, 4));
       countryfield.setText((String) recordtbl.getModel().getValueAt(row, 3));
       emailfield.setText((String) recordtbl.getModel().getValueAt(row, 1));
       contactfield.setText((String) recordtbl.getModel().getValueAt(row, 5));
       emailfield.setEditable(false);
       if(recordtbl.getModel().getValueAt(row, 2).toString().equalsIgnoreCase("male")){
           male.setSelected(true);
       }else{
           female.setSelected(true);
       }
       emailfield.setEditable(false);
    }
    
    private void refreshtbl(){
        DefaultTableModel tblmdel = (DefaultTableModel) recordtbl.getModel();
        tblmdel.setRowCount(0);
        try {
            String query = "SELECT * from client";
            DBConnection dbcon = new DBConnection();
            ResultSet rs = dbcon.GetQuery(query);

            while (rs.next()) {
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String email = rs.getString("email");
                String age = String.valueOf(rs.getInt("age"));
                String contact = rs.getString("contact");
                String country = rs.getString("country");

                String tbdata[] = {name, email, gender, country, age, contact};

                tblmdel.addRow(tbdata);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientRegister.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void recordtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordtblMouseClicked
       loadrecord();
    }//GEN-LAST:event_recordtblMouseClicked

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
            java.util.logging.Logger.getLogger(ClientRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientRegister().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField agefield;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearbtn;
    private java.awt.TextField contactfield;
    private java.awt.TextField countryfield;
    private javax.swing.JButton deletebtn;
    private java.awt.TextField emailfield;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton male;
    private java.awt.TextField namefield;
    private javax.swing.JRadioButton other;
    private javax.swing.JTable recordtbl;
    private javax.swing.JButton registerbtn1;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
