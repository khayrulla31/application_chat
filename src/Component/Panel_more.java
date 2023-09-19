
package Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import swing.WrapLayout;
import Emogi.Emogi;
import Emogi.Model_emogi;
import java.awt.Cursor;
import javax.swing.border.EmptyBorder;

public class Panel_more extends javax.swing.JPanel {

    public Panel_more() {
        initComponents();
        init();
    }
    private void init(){
        setLayout(new MigLayout("fillx"));
        panelHeader=new JPanel();
        panelHeader.setLayout(new BoxLayout(panelHeader,BoxLayout.LINE_AXIS));
        panelHeader.add(getButtonFile());
        panelHeader.add(getEmojiStyle1());
        panelHeader.add(getEmojiStyle2());
        add(panelHeader,"w 100%, h 30%!, wrap");
        panelDetail=new JPanel();
        panelDetail.setLayout(new WrapLayout(WrapLayout.LEFT));
        
        JScrollPane ch=new JScrollPane(panelDetail);
        ch.setBorder(null);
        ch.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        ch.setVerticalScrollBar(new JScrollBar());
        add(ch, "w 100%, h 100%");
    }
    
    private JButton getButtonFile(){
        OptionButtom cmd=new OptionButtom();
        cmd.setIcon(new ImageIcon(getClass().getResource("/icons/link.png")));
        cmd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser ch=new JFileChooser();
                ch.showOpenDialog(Main.Main.getFrames()[0]);
            }
        });
    return cmd;
    }
       
    private JButton getEmojiStyle1(){
         OptionButtom cmd=new OptionButtom();
         cmd.setIcon(Emogi.getInstance().getEmogi(1).toSize(25, 25).getIcon());
        cmd.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e) {
                 clearSelected();
                 cmd.setSelected(true);
                 panelDetail.removeAll();
                 for (Model_emogi d:Emogi.getInstance().getStyle1() ) {
                     JButton c=new JButton(d.getIcon());
                     c.setName(d.getId()+" ");
                     c.setBorder(new EmptyBorder(3,3,3,3));
                     c.setCursor(new Cursor(Cursor.HAND_CURSOR));
                     c.setContentAreaFilled(false);
                     panelDetail.add(c);
                 }
                 panelDetail.repaint();
                 panelDetail.revalidate();
             }
         });
        return cmd;
    }
    //для второго комплекта emoji
    private JButton getEmojiStyle2(){
         OptionButtom cmd=new OptionButtom();
         cmd.setIcon(Emogi.getInstance().getEmogi(21).toSize(25, 25).getIcon());
         cmd.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e) {
                    clearSelected();
                    cmd.setSelected(true);
                    panelDetail.removeAll();
                 for (Model_emogi d:Emogi.getInstance().getStyle2() ) {
                     JButton c=new JButton(d.getIcon());
                     c.setName(d.getId()+" ");
                     c.setBorder(new EmptyBorder(3,3,3,3));
                     c.setCursor(new Cursor(Cursor.HAND_CURSOR));
                     c.setContentAreaFilled(false);
                     panelDetail.add(c);
                 }
                 panelDetail.repaint();
                 panelDetail.revalidate();
             }
         });
        return cmd;
    }
    
    
    private void clearSelected(){
        for (java.awt.Component c : panelHeader.getComponents()) {
            if (c instanceof OptionButtom) {
                ((OptionButtom)c).setSelected(false);
            }
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
private JPanel panelHeader;
private JPanel panelDetail;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
