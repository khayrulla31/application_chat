
package Component;

import Events.PublicEvent;
import Model.Model_send_message;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import swing.JIMSendTextPane;
import swing.ScrollBar;
import Model.Model_user_account;
import Service.Service;

public class Chat_Button extends javax.swing.JPanel {
    
    private Model_user_account user;

    public Model_user_account getUser() {
        return user;
    }

    public void setUser(Model_user_account user) {
        this.user = user;
    }
    

    public Chat_Button() {
        initComponents();
        init();
    }
    private void init(){
        mig=new MigLayout("fillx,filly","0[fill]0[]0[]2","2[fill]2[]0");
        setLayout(mig);
        JScrollPane scroll=new JScrollPane();
        scroll.setBorder(null);
        JIMSendTextPane txt=new JIMSendTextPane();
        
        txt.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e) {
              refresh();
                if (e.getKeyChar()==10&&e.isControlDown()) {
                    eventSend(txt);
                }
            }    
        });
        txt.setBorder(new EmptyBorder(5,5,5,5));
        txt.setHintText("Write your massage here..");
        scroll.setViewportView(txt);
        ScrollBar sb=new ScrollBar();       
        sb.setBackground(new Color(229,229,229));
        sb.setPreferredSize(new Dimension(2,10));
        scroll.setVerticalScrollBar(sb);
        add(sb);
        add(scroll," w 100%");
        JPanel panel=new JPanel();
        panel.setLayout(new MigLayout("filly","0[]3[]0","0[bottom]0"));
        panel.setPreferredSize(new Dimension(30,28));
        panel.setBackground(Color.WHITE);
        JButton cmd=new JButton();
        cmd.setIcon(new ImageIcon(getClass().getResource("/icons/send.png")));
        cmd.setBorder(null);
        cmd.setContentAreaFilled(false);
        cmd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                eventSend(txt);
            }
        });
          JButton cmdMore=new JButton();
        cmdMore.setIcon(new ImageIcon(getClass().getResource("/icons/more_disable.png")));
        cmdMore.setBorder(null);
        cmdMore.setContentAreaFilled(false);
        cmdMore.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdMore.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                   if (panelMore.isVisible()) {
                    cmdMore.setIcon(new ImageIcon(getClass().getResource("/icons/more_disable.png")));
                    panelMore.setVisible(false);
                    mig.setComponentConstraints(panelMore,"dock south, h 0!");
                    revalidate();
                   }else{
                        cmdMore.setIcon(new ImageIcon(getClass().getResource("/icons/more.png")));
                         panelMore.setVisible(true);
                         mig.setComponentConstraints(panelMore,"dock south, h 140!");
                         revalidate();
                   }
              
            }
        });
        panel.add(cmdMore);
        panel.add(cmd);       
        add(panel, "wrap");
        panelMore=new Panel_more();
        panelMore.setVisible(false);
        add(panelMore, "dock south, h 0!");//set height 0
        
    }

    private void refresh(){
        revalidate();
    }
    
    public void send(Model_send_message data){
        Service.getInstance().getClient().emit("send_to_user", data.toJsonObject());
    }
    
    private void eventSend(JIMSendTextPane txt){
     String text=txt.getText().trim();
                if (!text.equals("")) {
                    Model_send_message message=new Model_send_message(Service.getInstance().getUser().getUserId(), user.getUserId(), text);
                    send(message);
                    PublicEvent.getInstance().getEventChat().sendMessage(message);
                    txt.setText("");
                    txt.grabFocus();
                    refresh();
                }else{
                txt.grabFocus();
                }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(230, 230, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
private Panel_more panelMore;
private MigLayout mig;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
