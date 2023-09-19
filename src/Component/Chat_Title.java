
package Component;

import Model.Model_user_account;
import java.awt.Color;

public class Chat_Title extends javax.swing.JPanel {

   private Model.Model_user_account user;

    public Model_user_account getUser() {
        return user;
    }
    
   
    public Chat_Title() {
        initComponents();
    }

    public void  setUserName(Model_user_account user){
        this.user=user;
        IdName.setText(user.getUserName());
        if (user.isStatus()) {
            statusActiveNow();          
        }else{
            setStatusText("offline");
        }
    }
    
    public void updateUser(Model_user_account user){
        if (this.user==user) {
            IdName.setText(user.getUserName());
            if (user.isStatus()) {
                statusActiveNow();          
            }else{
                setStatusText("offline");
            }
        }
    }
    
    private void statusActiveNow(){
    IdStatus.setText("Online");
    IdStatus.setForeground(new java.awt.Color(112, 170, 82));
     }
    
    private void setStatusText(String text){
    IdStatus.setText(text);
    IdStatus.setForeground(new Color(158,158,158));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layer = new javax.swing.JLayeredPane();
        IdName = new javax.swing.JLabel();
        IdStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 230, 230));

        layer.setPreferredSize(new java.awt.Dimension(205, 44));
        layer.setLayout(new java.awt.GridLayout(0, 1));

        IdName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        IdName.setForeground(new java.awt.Color(66, 66, 66));
        IdName.setText("name");
        layer.add(IdName);

        IdStatus.setForeground(new java.awt.Color(112, 170, 82));
        IdStatus.setText("Online");
        layer.add(IdStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdName;
    private javax.swing.JLabel IdStatus;
    private javax.swing.JLayeredPane layer;
    // End of variables declaration//GEN-END:variables
}
