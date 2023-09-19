
package Component;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.Icon;


public class MenuButtom extends JButton{
  
    public Icon getIconSimple() {
        return IconSimple;
    }

    public void setIconSimple(Icon IconSimple) {
        this.IconSimple = IconSimple;
    }

    public Icon getIconSelected() {
        return IconSelected;
    }

    public void setIconSelected(Icon IconSelected) {
        this.IconSelected = IconSelected;
    }
    private Icon IconSimple;
    private Icon IconSelected;
    
    public MenuButtom() {
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    @Override
    public void setSelected(boolean b) {
        super.setSelected(b);
        if (b) {
            setIcon(IconSelected);
        }else{
            setIcon(IconSimple);}
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (isSelected()) {
            g.setColor(new Color(173,56,209));
            g.fillRect(0, getHeight()-3, getWidth(), getHeight());
        }
    } 
}
