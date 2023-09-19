
package Emogi;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Model_emogi {
    int Id;
    Icon icon;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Model_emogi() {
    }

    public Model_emogi(int Id, Icon icon) {
        this.Id = Id;
        this.icon = icon;
    }
    
    public Model_emogi toSize(int x, int y){
        return new Model_emogi(Id, new ImageIcon(((ImageIcon)icon).getImage().getScaledInstance(x, y,Image.SCALE_SMOOTH)));
    }

}
