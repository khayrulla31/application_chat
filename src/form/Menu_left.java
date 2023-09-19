
package form;

import Component.Item_people;
import Events.EventMenuLeft;
import Events.PublicEvent;
import java.util.List;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;
import Model.Model_user_account;
import java.util.ArrayList;

public class Menu_left extends javax.swing.JPanel {

    private List<Model_user_account> userAccount;
 
    public Menu_left() {
        initComponents();
        init();
        
    }
    private void init(){
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
        MenuList.setLayout(new MigLayout("fillx","0[]0","3[]3"));
        userAccount=new ArrayList<>();
        PublicEvent.getInstance().addEventMenuLeft(new EventMenuLeft(){
            @Override
            public void newUser(List<Model_user_account> users) {
                for (Model_user_account d : users) {
                    userAccount.add(d);
                   MenuList.add(new Item_people(d),"wrap");
                   refreshMenuList();
                }
           }

            @Override
            public void userConnect(int userId) {
            for (Model_user_account u : userAccount) {
                    if (u.getUserId() == userId) {
                        u.setStatus(true);
                        PublicEvent.getInstance().getEventMain().updateUser(u);
                        break;
                    }
                }
                if (menuMesage.isSelected()) {
                    for (java.awt.Component com : MenuList.getComponents()) {
                        Item_people item = (Item_people) com;
                        if (item.getUser().getUserId() == userId) {
                            item.updateStatus();
                            break;
                        }
                    }
                }
            }

            @Override
            public void userDisconnect(int userId) {
           for (Model_user_account u : userAccount) {
                    if (u.getUserId() == userId) {
                        u.setStatus(false);
                        PublicEvent.getInstance().getEventMain().updateUser(u);
                        break;
                    }
                }
                if (menuMesage.isSelected()) {
                    for (java.awt.Component com : MenuList.getComponents()) {
                        Item_people item = (Item_people) com;
                        if (item.getUser().getUserId() == userId) {
                            item.updateStatus();
                            break;
                        }
                    }
                }
            }
        });
        showMessage();
    }
    
    private void showMessage(){
        MenuList.removeAll();
        for (Model_user_account d:userAccount) {
            MenuList.add(new Item_people(null),"wrap");
        }
        refreshMenuList();
    }
    private void showGroup(){
        MenuList.removeAll();
        for (int i = 0; i < 3; i++) {
            MenuList.add(new Item_people(null), "wrap");
        }
        refreshMenuList();
    }
    
    private void showBox(){
        MenuList.removeAll();
        for (int i = 0; i < 5; i++) {
            MenuList.add(new Item_people(null), "wrap");
        }
        refreshMenuList();
    }
    
    private void refreshMenuList(){//написали отдельно метод чтобы обновлять меню левое при смене иконки!!!
        MenuList.repaint();
        MenuList.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JLayeredPane();
        menuMesage = new Component.MenuButtom();
        menuGroup = new Component.MenuButtom();
        menuBox = new Component.MenuButtom();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenuList = new javax.swing.JLayeredPane();

        menu.setBackground(new java.awt.Color(229, 229, 229));
        menu.setOpaque(true);
        menu.setLayout(new java.awt.GridLayout(1, 3));

        menuMesage.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/icons/purp/new_purp_selected_chat.png"))); // NOI18N
        menuMesage.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/icons/purp/purp_massage.png"))); // NOI18N
        menuMesage.setSelected(true);
        menuMesage.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purp/new_purp_selected_chat.png"))); // NOI18N
        menuMesage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMesageActionPerformed(evt);
            }
        });
        menu.add(menuMesage);

        menuGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purp/purp_group.png"))); // NOI18N
        menuGroup.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/icons/purp/new_purp_selected_group.png"))); // NOI18N
        menuGroup.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/icons/purp/purp_group.png"))); // NOI18N
        menuGroup.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purp/new_purp_selected_group.png"))); // NOI18N
        menuGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupActionPerformed(evt);
            }
        });
        menu.add(menuGroup);

        menuBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purp/purp_box.png"))); // NOI18N
        menuBox.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/icons/purp/purp_selected_bpxxx.png"))); // NOI18N
        menuBox.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/icons/purp/purp_box.png"))); // NOI18N
        menuBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purp/purp_selected_bpxxx.png"))); // NOI18N
        menuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBoxActionPerformed(evt);
            }
        });
        menu.add(menuBox);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        MenuList.setOpaque(true);

        javax.swing.GroupLayout MenuListLayout = new javax.swing.GroupLayout(MenuList);
        MenuList.setLayout(MenuListLayout);
        MenuListLayout.setHorizontalGroup(
            MenuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MenuListLayout.setVerticalGroup(
            MenuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(MenuList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );
    }// </editor-fold>//GEN-END:initComponents
/*
    private void menuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBoxActionPerformed
       if (!menuBox.isSelected()) {  
        menuMesage.setSelected(false);
        menuGroup.setSelected(false);
        menuBox.setSelected(true);
        showBox();
        }
    }//GEN-LAST:event_menuBoxActionPerformed

    private void menuMesageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMesageActionPerformed
        if (!menuMesage.isSelected()) {
            menuMesage.setSelected(true);
            menuGroup.setSelected(false);
            menuBox.setSelected(false);
            showMessage();
        }
        
    }//GEN-LAST:event_menuMesageActionPerformed

    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupActionPerformed
        if (!menuGroup.isSelected()) {
        menuMesage.setSelected(false);
        menuGroup.setSelected(true);
        menuBox.setSelected(false);
        showGroup();
    }
    }//GEN-LAST:event_menuGroupActionPerformed
*/
    private void menuMesageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtom111ActionPerformed
          if (!menuMesage.isSelected()) {
            menuMesage.setSelected(true);
            menuGroup.setSelected(false);
            menuBox.setSelected(false);
            showMessage();
        }
    }//GEN-LAST:event_menuButtom111ActionPerformed

    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtom222ActionPerformed
            if (!menuGroup.isSelected()) {
        menuMesage.setSelected(false);
        menuGroup.setSelected(true);
        menuBox.setSelected(false);
        showGroup();
    }
    }//GEN-LAST:event_menuButtom222ActionPerformed

    private void menuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtom333ActionPerformed
    if (!menuBox.isSelected()) {  
        menuMesage.setSelected(false);
        menuGroup.setSelected(false);
        menuBox.setSelected(true);
        showBox();
        }
    }//GEN-LAST:event_menuButtom333ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane MenuList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane menu;
    private Component.MenuButtom menuBox;
    private Component.MenuButtom menuGroup;
    private Component.MenuButtom menuMesage;
    // End of variables declaration//GEN-END:variables
}
