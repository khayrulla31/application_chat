
package Component;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.Icon;


public class OptionButtom extends JButton{
    
    public OptionButtom() {
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    @Override
    public void setSelected(boolean b) {
        super.setSelected(b);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (isSelected()) {
            g.setColor(new Color(173,56,209));
            g.fillRect(0, getHeight()-2, getWidth(), getHeight());
        }
    } 
}
