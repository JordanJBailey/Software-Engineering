
package Graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class Spritesheet {
    
    public String path;
    public int height;
    public int width;
    
    public int[] pixels;
    
    public Spritesheet(String path){
    BufferedImage Image = null;
    try{
        Image = ImageIO.read(Spritesheet.class.getResourceAsStream(path));
    }   catch (IOException ex) {    
            ex.printStackTrace();
    }    
     
    if(Image == null){
        return;
    }
    
    this.path = path;
    this.width = Image.getWidth();
    this.height = Image.getHeight();
    }
}
