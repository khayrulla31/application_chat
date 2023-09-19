
package Component;

import java.awt.Color;
import javax.swing.Icon;


public class Chat_left extends javax.swing.JLayeredPane {

   
    public Chat_left() {
        initComponents();
        chattttttt1.setBackground(new Color(242,242,242));
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
   
   public void setTime(String time){
        chattttttt1.setTime("10-10");//testing
   }
   public void setFile(String fileName, String fileSize){
       chattttttt1.setFile(fileName, fileSize);
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chattttttt1 = new Component.Chattttttt();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chattttttt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chattttttt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Chattttttt chattttttt1;
    // End of variables declaration//GEN-END:variables
}
