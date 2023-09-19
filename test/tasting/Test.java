
package tasting;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import swing.blurHash.BlurHash;

public class Test {
    public static void main(String[] args) {
        try{
         BufferedImage image = ImageIO.read(new File("/Users/nikolaj/Desktop/dog.jpg"));
            String blurhashStr = BlurHash.encode(image);
            System.out.println(blurhashStr);
    }catch(Exception e){
        e.printStackTrace();
    }
        //LRMj,K-:?G9G_JIon}WqD~ITRPs,
        
    }
}
