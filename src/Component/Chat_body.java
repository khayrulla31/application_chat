
package Component;

import java.awt.Adjustable;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.Icon;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;
import Model.Model_send_message;
import Model.Model_recieve_message;

public class Chat_body extends javax.swing.JPanel {

    public Chat_body() {
        initComponents();
        init(); 
    }

private void init(){
    bodyyy.setLayout(new MigLayout("fillx","","5[]5"));
    bodyy_scroll.setVerticalScrollBar(new ScrollBar());
    bodyy_scroll.getVerticalScrollBar().setBackground(Color.WHITE);
}



public void addItemLeft(Model_recieve_message data){
    Chat_left item=new Chat_left();
    item.setText(data.getText());
    //item.setTime();  
    bodyyy.add(item,"wrap, w 100 :: 80%");
    repaint();
    revalidate();
}


public void addItemFile(String text, String user, String fileName, String fileSize){
    Chat_left_with_profile item=new Chat_left_with_profile();
    item.setText(text);
    item.setFile(fileName, fileSize);
    item.setTime(text);
    item.setUserProfile(user);
    bodyyy.add(item,"wrap, w 100 :: 80%");
    bodyyy.repaint();
    bodyyy.revalidate();
}

public void addItemLeft(String text, String user, String[]image){
    Chat_left_with_profile item=new Chat_left_with_profile();
    item.setText(text);
    item.setImage(image);
    item.setTime(text);
    item.setUserProfile(user);
    bodyyy.add(item,"wrap, w 100 :: 80%");
    bodyyy.repaint();
    bodyyy.revalidate();
}



public void addItemFileRight(String text,String fileName, String fileSize){
    Chat_right item=new Chat_right();
    item.setText(text);
    item.setFile(fileName, fileSize);
    bodyyy.add(item,"wrap,al right, w 100 :: 80%");
    bodyyy.repaint();
    bodyyy.revalidate();
}


public void addItemRight(Model_send_message data){
    Chat_right item=new Chat_right();
    item.setText(data.getText());
   // item.setTime();
    bodyyy.add(item,"wrap,al right, w 100 :: 80%");
    repaint();
    revalidate();
    scrollToBottom();
}

public void addDate(String date){
Chat_date item=new Chat_date();
item.setDate(date);
    bodyyy.add(item, "wrap, al center");
    bodyyy.repaint();
    bodyyy.revalidate();
}

public void clearChat(){
    bodyyy.removeAll();
    repaint();
    revalidate();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyy_scroll = new javax.swing.JScrollPane();
        bodyyy = new javax.swing.JPanel();

        bodyy_scroll.setBorder(null);

        bodyyy.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bodyyyLayout = new javax.swing.GroupLayout(bodyyy);
        bodyyy.setLayout(bodyyyLayout);
        bodyyyLayout.setHorizontalGroup(
            bodyyyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        bodyyyLayout.setVerticalGroup(
            bodyyyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );

        bodyy_scroll.setViewportView(bodyyy);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyy_scroll, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyy_scroll)
        );
    }// </editor-fold>//GEN-END:initComponents
private void scrollToBottom() {
        JScrollBar verticalBar = bodyy_scroll.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane bodyy_scroll;
    private javax.swing.JPanel bodyyy;
    // End of variables declaration//GEN-END:variables
}
