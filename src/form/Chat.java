
package form;

import Component.Chat_body;
import Component.Chat_Button;
import Component.Chat_Title;
import Events.ChatEvent;
import Events.PublicEvent;
import Model.Model_recieve_message;
import Model.Model_send_message;
import Model.Model_user_account;
import net.miginfocom.swing.MigLayout;


public class Chat extends javax.swing.JPanel {

    private Chat_Title chatTitle;
    private Chat_body chatBody;
    private Chat_Button chatButton;
    
    public Chat() {
        initComponents();
        init();
    }
    public void init(){
        setLayout(new MigLayout("fillx","0[fill]0","0[]0[100%,fill]0[shrink 0]0"));
        chatTitle=new Chat_Title();
        chatBody=new Chat_body();
        chatButton=new Chat_Button();
        PublicEvent.getInstance().addEventChat(new ChatEvent(){
           
            @Override
            public void sendMessage(Model_send_message data) {
                chatBody.addItemRight(data);
            }

            @Override
            public void receiveMessage(Model_recieve_message data) {
                if (chatTitle.getUser().getUserId()==data.getFromUserId()) {
                     chatBody.addItemLeft(data);
                }
               
            }
        });
        
        add(chatTitle,"wrap");
        add(chatBody,"wrap");
        add(chatButton,"h ::50%");
        
    }

    public void setUser(Model_user_account user){
        chatTitle.setUserName(user);
        chatButton.setUser(user);
        chatBody.clearChat();
    }
    
    public void updateUser(Model_user_account user){
        chatTitle.updateUser(user);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
