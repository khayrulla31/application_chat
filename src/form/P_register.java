
package form;

import Events.EventMessage;
import Events.PublicEvent;
import Model.Model_message;
import Model.Model_register;


public class P_register extends javax.swing.JPanel {

  
    public P_register() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IdTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        cmdRegister = new javax.swing.JButton();
        cmdGoBackLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        IdError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        IdTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        IdTitle.setForeground(new java.awt.Color(86, 86, 86));
        IdTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IdTitle.setText("Register");

        jLabel1.setText("UserName");

        jLabel2.setText("Password");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        cmdRegister.setText("Register");
        cmdRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegisterActionPerformed(evt);
            }
        });

        cmdGoBackLogin.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        cmdGoBackLogin.setForeground(new java.awt.Color(46, 173, 207));
        cmdGoBackLogin.setText("go back");
        cmdGoBackLogin.setContentAreaFilled(false);
        cmdGoBackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdGoBackLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGoBackLoginActionPerformed(evt);
            }
        });

        jLabel4.setText("Confirm Password");

        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });

        IdError.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        IdError.setForeground(new java.awt.Color(255, 0, 51));
        IdError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IdTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdGoBackLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(cmdRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IdError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IdTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IdError, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdGoBackLogin)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void cmdRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegisterActionPerformed
        String userName=txtUser.getText().trim();
        String password=String.valueOf(txtPassword.getPassword());
        String confirmPassword=String.valueOf(txtConfirmPassword.getPassword());
        if (userName.equals("")) {
            txtUser.grabFocus();           
        }else if (password.equals("")) {
            txtPassword.grabFocus();
        }else if (!password.equals(confirmPassword)) {
            txtPassword.grabFocus();
        }else{
            Model_register data=new Model_register(userName, password);
            PublicEvent.getInstance().getEventLogin().register(data, new EventMessage() {
                @Override
                public void callMessage(Model_message message) {
                    if (message.isAction()==false) {
                        IdError.setText(message.getMessage());
                    }else{
                        PublicEvent.getInstance().getEventMain().initChat();
                    }
                }
            });
        }       
    }//GEN-LAST:event_cmdRegisterActionPerformed

    private void cmdGoBackLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGoBackLoginActionPerformed
        PublicEvent.getInstance().getEventLogin().goLogin();
    }//GEN-LAST:event_cmdGoBackLoginActionPerformed

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdError;
    private javax.swing.JLabel IdTitle;
    private javax.swing.JButton cmdGoBackLogin;
    private javax.swing.JButton cmdRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
