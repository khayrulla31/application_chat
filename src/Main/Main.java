
package Main;

import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import Events.EventImageView;
import Events.EventMain;
import Events.PublicEvent;
import Model.Model_user_account;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import newchatting.ComponentResizer;
import Service.Service;


public class Main extends javax.swing.JFrame {


    public Main() {
        initComponents();
        init();
    }
private void init(){
     setIconImage(new ImageIcon(getClass().getResource("/icons/arrow-back.png")).getImage());
    ComponentResizer com=new ComponentResizer();
    com.registerComponent(this);//добавляем этот класс в сом!!
    com.setMinimumSize(new Dimension(900,500));//задаем минимальный размер окна
    com.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());//максимально на сколько можкм растягивать окно
    com.setSnapSize(new Dimension(10,10));//?
    login.setVisible(true);
    loading.setVisible(false);
    view_Image.setVisible(false);
    home.setVisible(false);
    initEvent();
    Service.getInstance().startServer();    
}
    
    private void initEvent(){
        PublicEvent.getInstance().addEventMain(new EventMain(){
            @Override
            public void showLoading(boolean show) {
                loading.setVisible(show);
   }
            @Override
            public void initChat() {
                home.setVisible(true);
                login.setVisible(false);               
                Service.getInstance().getClient().emit("list_user", Service.getInstance().getUser().getUserId());
            }

            @Override
            public void selectUser(Model_user_account user) {
                    home.setUser(user);
            }

            @Override
            public void updateUser(Model_user_account user) {
                     home.updateUser(user);
            }
        });
        
        PublicEvent.getInstance().addEventImageView(new EventImageView(){
            @Override
            public void viewImage(Icon image) {
                view_Image.viewImage(image);
            }           

            @Override
            public void saveImage(Icon image) {
                System.out.println("next update");
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        border = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        cmdClose = new javax.swing.JButton();
        cndMinimize1 = new javax.swing.JButton();
        bodyy = new javax.swing.JLayeredPane();
        loading = new form.Loading();
        login = new form.Login();
        view_Image = new form.View_Image();
        home = new form.Home();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        border.setBackground(new java.awt.Color(229, 229, 229));

        background.setBackground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(229, 229, 229));
        title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleMouseDragged(evt);
            }
        });
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleMousePressed(evt);
            }
        });

        cmdClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        cmdClose.setBorder(null);
        cmdClose.setContentAreaFilled(false);
        cmdClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        cndMinimize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimize.png"))); // NOI18N
        cndMinimize1.setBorder(null);
        cndMinimize1.setContentAreaFilled(false);
        cndMinimize1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cndMinimize1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cndMinimize1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(928, Short.MAX_VALUE)
                .addComponent(cndMinimize1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cndMinimize1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bodyy.setLayout(new java.awt.CardLayout());
        bodyy.add(loading, "card5");
        bodyy.add(login, "card4");
        bodyy.setLayer(view_Image, javax.swing.JLayeredPane.POPUP_LAYER);
        bodyy.add(view_Image, "card3");
        bodyy.add(home, "card2");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bodyy))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyy, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout borderLayout = new javax.swing.GroupLayout(border);
        border.setLayout(borderLayout);
        borderLayout.setHorizontalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        borderLayout.setVerticalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //добавляем переменные для работы мышки
    private int pX;
    private int pY;
    private void titleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseDragged
this.setLocation(this.getLocation().x + evt.getX() - pX,
                            this.getLocation().y + evt.getY() - pY);
    }//GEN-LAST:event_titleMouseDragged

    private void titleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMousePressed
        pX = evt.getX();
                    pY = evt.getY();
    }//GEN-LAST:event_titleMousePressed

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
       System.exit(0);
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cndMinimize1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cndMinimize1ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_cndMinimize1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatArcIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLayeredPane bodyy;
    private javax.swing.JPanel border;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cndMinimize1;
    private form.Home home;
    private form.Loading loading;
    private form.Login login;
    private javax.swing.JPanel title;
    private form.View_Image view_Image;
    // End of variables declaration//GEN-END:variables
}
