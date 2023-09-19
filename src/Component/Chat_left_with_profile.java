
package Component;

import java.awt.Color;
import javax.swing.Icon;


public class Chat_left_with_profile extends javax.swing.JLayeredPane {

   
    public Chat_left_with_profile() {
        initComponents();
        chattttttt1.setBackground(new Color(242,242,242));
    }
    
    public void setUserProfile(String user){
        chattttttt1.setUserProfile(user);
    }
   public void setText(String someText){
       if (someText.equals("")) {
           chattttttt1.hideText();
       }else{
        chattttttt1.setText(someText);
       }
   }
   
   public void setImage(Icon ...image){
        chattttttt1.setImage(false,image);
   }
   
   public void setImage(String ...image){
        chattttttt1.setImage(false,image);
   }
   
   public void setFile(String fileName, String fileSize){
       chattttttt1.setFile(fileName, fileSize);
   }
   
   
   
   public void setTime(String time){
        chattttttt1.setTime("10-10");//testing
   }
   
 
   public void setImageProfile(Icon image){
       iaimage.setImage(image);
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        iaimage = new swing.ImageAvatar();
        chattttttt1 = new Component.Chattttttt();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        iaimage.setBorderSize(0);
        iaimage.setImage(new javax.swing.ImageIcon(getClass().getResource("/icons/brooke-cagle-HRZUzoX1e6w-unsplash.png"))); // NOI18N
        iaimage.setMaximumSize(new java.awt.Dimension(31, 31));
        iaimage.setMinimumSize(new java.awt.Dimension(31, 31));
        iaimage.setPreferredSize(new java.awt.Dimension(31, 31));

        jLayeredPane1.setLayer(iaimage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(iaimage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iaimage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jLayeredPane1);
        add(chattttttt1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Chattttttt chattttttt1;
    private swing.ImageAvatar iaimage;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
