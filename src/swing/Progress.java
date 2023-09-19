
package swing;

import javax.swing.Icon;
import javax.swing.JProgressBar;
import javax.swing.plaf.ComponentUI;


public class Progress extends JProgressBar {
   
    
    
    public Progress() {
        setOpaque(false);
        setUI(new ProgressCircleUI(this));
    }
    public static enum ProgresType{
        NON,DOWN_FILE, CANCEL,FILE 
    };

    private ProgresType progresType=ProgresType.NON;

    public ProgresType getProgresType() {
        return progresType;
    }

    public void setProgresType(ProgresType progresType) {
        this.progresType = progresType;
        repaint();
    }

    
}
