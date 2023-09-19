
package Emogi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class Emogi {
    private static Emogi instance;

    
    public static Emogi getInstance(){
        if (instance==null) {
            instance=new Emogi();
        }
    return instance;
    }
    private Emogi(){ 
    }
    
    public List<Model_emogi> getStyle1(){
        List<Model_emogi> list=new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
        list.add(new Model_emogi(i, new ImageIcon(getClass().getResource("/Emogi/iconEmoji/"+i+".png"))));
    }
        return list;
    }
    
    public List<Model_emogi> getStyle2(){
        List<Model_emogi> list=new ArrayList<>();
        for (int i = 21; i <= 30; i++) {
        list.add(new Model_emogi(i, new ImageIcon(getClass().getResource("/Emogi/iconEmoji/"+i+".png"))));
    }
        return list;
    }
    
   
    public Model_emogi getEmogi(int id){
    return new Model_emogi(id, new ImageIcon(getClass().getResource("/Emogi/iconEmoji/"+id+".png")));
    }
}
