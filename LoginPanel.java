package hotelmanagement;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginPanel extends javax.swing.JFrame {

    public LoginPanel() {
        initComponents();
        jPanel3.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Log = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        statu_text = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NameArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SurnameArea = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(24, 220, 255));

        jLabel_Log.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ramazan\\Documents\\NetBeansProjects\\HotelManagement\\icon\\enter_filled_50px.png")); // NOI18N
        jLabel_Log.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LogMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Enter");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jButton1.setText("Customer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        statu_text.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        statu_text.setEnabled(false);
        statu_text.setOpaque(false);
        statu_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                statu_textFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                statu_textFocusLost(evt);
            }
        });
        statu_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statu_textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Log, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statu_text, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(statu_text, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Log)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 628, 869, -1));

        jPanel2.setBackground(new java.awt.Color(24, 220, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hotel Management System ");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Login");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ramazan\\Documents\\NetBeansProjects\\HotelManagement\\icon\\Back To_50px.png")); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(23, 192, 235));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel3.setText("Password :");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel4.setText("Name :");

        NameArea.setText("Please Enter Your Name");
        NameArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NameArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameAreaFocusLost(evt);
            }
        });
        NameArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameAreaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel5.setText("Surname :");

        SurnameArea.setText("Please Enter Your Surname");
        SurnameArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SurnameAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SurnameAreaFocusLost(evt);
            }
        });
        SurnameArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurnameAreaActionPerformed(evt);
            }
        });

        jPasswordField1.setPreferredSize(new java.awt.Dimension(163, 22));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ramazan\\Documents\\NetBeansProjects\\HotelManagement\\icon\\key_2_50px.png")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ramazan\\Documents\\NetBeansProjects\\HotelManagement\\icon\\name_50px.png")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ramazan\\Documents\\NetBeansProjects\\HotelManagement\\icon\\name_50px.png")); // NOI18N

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 16)); // NOI18N
        jLabel13.setText("Click here If you don't have account.");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(68, 68, 68)
                        .addComponent(NameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SurnameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(SurnameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 141, 869, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
     RegisterForm rg =new RegisterForm();
     rg.setVisible(true);
     rg.setLocationRelativeTo(null);
     dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel_LogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LogMouseClicked
        
        PreparedStatement ps;
        ResultSet rs;
        String uname=NameArea.getText();
        String lname=SurnameArea.getText();
        String pass=String.valueOf(jPasswordField1.getPassword());
        String type=String.valueOf(statu_text.getText());
        
        
        String query="SELECT * FROM `app_users` WHERE `u_name` =? AND `u_surname` =? AND `u_password`=?  " ;
        //String query="SELECT `u_name`,`u_surname`,`u_password` FROM `app_users` WHERE `statu`=1 " ;
        //JOptionPane.showMessageDialog(null,"Hata ---1");
        try {
            ps=MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1,uname);
            ps.setString(2,lname);
            ps.setString(3,pass);
            
            
            //JOptionPane.showMessageDialog(null,query);
            rs=ps.executeQuery();
            //JOptionPane.showMessageDialog(null,"Hata 1");
            String query2="SELECT `statu` FROM `app_users` WHERE `u_password LIKE '% " + SurnameArea.getText() + NameArea.getText() + jPasswordField1.getText() +"%' ";
            if(rs.next()){
                int deger = rs.getInt("statu");
                
                //JOptionPane.showMessageDialog(null,deger);
            if(deger == 0){
                CustomerForm cf=new CustomerForm();
                cf.setVisible(true);
                cf.setLocationRelativeTo(null);
                cf.jLabel_Name.setText("Welcome "+uname+"");
                cf.statu_label.setText("Statu"+deger+"");
                dispose();
            }
            else if (deger == 1)
            {
                ControlPanel rp=new ControlPanel();
                rp.setVisible(true);
                rp.pack();
                rp.setLocationRelativeTo(null);
                rp.setExtendedState(JFrame.MAXIMIZED_HORIZ);
                rp.jLabel_Name.setText("Welcome "+uname+"");
                rp.statu_label.setText("Statu"+deger+"");
                
                dispose();
            }

            }
//            JOptionPane.showMessageDialog(null,query2);
//            if(Integer.parseInt(query2) == 0){
//                CustomerForm cf=new CustomerForm();
//                cf.setVisible(true);
//                cf.setLocationRelativeTo(null);
//                dispose();
//            }
//            else if (Integer.parseInt(query2) == 1)
//            {
//                ControlPanel rp=new ControlPanel();
//                rp.setVisible(true);
//                rp.pack();
//                rp.setLocationRelativeTo(null);
//                rp.setExtendedState(JFrame.MAXIMIZED_HORIZ);
//                rp.jLabel_Name.setText("Welcome "+uname+"");
//                
//                dispose();
//            }
            
            
            
//            if(rs.next())
//            {
//                ControlPanel rp=new ControlPanel();
//                rp.setVisible(true);
//                rp.pack();
//                rp.setLocationRelativeTo(null);
//                rp.setExtendedState(JFrame.MAXIMIZED_HORIZ);
//                rp.jLabel_Name.setText("Welcome "+uname+"");
//                
//                dispose();
//            }

            else
            {
                JOptionPane.showMessageDialog(null,"Incorrect Name,Surname or Password","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_jLabel_LogMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        JOptionPane.showMessageDialog(this,"Database Kontrol!!!");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void NameAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameAreaActionPerformed
      
    }//GEN-LAST:event_NameAreaActionPerformed

    private void NameAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameAreaFocusGained
        if(NameArea.getText().trim().equals("Please Enter Your Name")){
            NameArea.setText("");
        }
    }//GEN-LAST:event_NameAreaFocusGained

    private void NameAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameAreaFocusLost
        if(NameArea.getText().trim().equals("")){
            NameArea.setText("Please Enter Your Name");
        }
    }//GEN-LAST:event_NameAreaFocusLost

    private void SurnameAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurnameAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SurnameAreaActionPerformed

    private void SurnameAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SurnameAreaFocusGained
        if(SurnameArea.getText().trim().equals("Please Enter Your Surname")){
            SurnameArea.setText("");
        }
            
    }//GEN-LAST:event_SurnameAreaFocusGained

    private void SurnameAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SurnameAreaFocusLost
        if(SurnameArea.getText().trim().equals("")){
            SurnameArea.setText("Please Enter Your Surname");
        }
    }//GEN-LAST:event_SurnameAreaFocusLost

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost

    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained

    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        CustomerForm cf=new CustomerForm();
        cf.setVisible(true);
        cf.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void statu_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statu_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statu_textActionPerformed

    private void statu_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statu_textFocusLost
        if(statu_text.getText().trim().equals("")){
            statu_text.setText("Please Enter Your Statu");
        }
    }//GEN-LAST:event_statu_textFocusLost

    private void statu_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statu_textFocusGained
        if(statu_text.getText().trim().equals("Please Enter Your Statu")){
            statu_text.setText("");
        }
    }//GEN-LAST:event_statu_textFocusGained

    

    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField NameArea;
    private javax.swing.JTextField SurnameArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Log;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField statu_text;
    // End of variables declaration//GEN-END:variables
}
