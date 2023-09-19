
package Component;

import java.awt.Color;
import javax.swing.Icon;


public class Chat_right extends javax.swing.JLayeredPane {

   
    public Chat_right() {
        initComponents();
        txt.setBackground(new Color(179,233,255));
    }

  public void setText(String someText){
       if (someText.equals("")) {
           txt.hideText();
       }else{
        txt.setText(someText);
       }
       txt.seen();
   }
    public void setImage(Icon ...image){
        txt.setImage(true,image);
   }
     public void setImage(String ...image){
        txt.setImage(false,image);
   }
   
   public void setTime(String time){
        txt.setTime("20-03");//testing
   }
   public void setFile(String fileName, String fileSize){
       txt.setFile(fileName, fileSize);
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new Component.Chattttttt();

        setLayer(txt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Chattttttt txt;
    // End of variables declaration//GEN-END:variables
}
