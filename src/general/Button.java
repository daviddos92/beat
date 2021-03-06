package general;
import java.awt.Rectangle;
import java.io.IOException;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;
@SuppressWarnings("unused")

public class Button {

    public int X;
    public int Y;
    public Texture buttonTexture;
    public boolean isClicked=false;
    public Rectangle bounds = new Rectangle();
   


    public void addButton(int x, int y , String TEXPATH){
        X=x;
        Y=y;
        try {
            buttonTexture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream(TEXPATH));
           // System.out.println(buttonTexture.getWidth());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        bounds.x=X;
        bounds.y=Y;
        bounds.height=buttonTexture.getImageHeight();
        bounds.width=buttonTexture.getImageWidth();
 
      //  System.out.println(""+bounds.x+" "+bounds.y+" "+bounds.width+" "+bounds.height);
    }

    public void Draw(){
        if(bounds.contains(Mouse.getX(),(720-Mouse.getY()))&&Mouse.isButtonDown(0)){
            isClicked=true;

        }else{
            isClicked=false;
        }
       GL11.glEnable(GL11.GL_BLEND);
       GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
       GL11.glLoadIdentity(); // Resets any previous projection matrices
       GL11.glOrtho(0, 1280, 720, 0, 1, -1);    
       
       buttonTexture.bind(); // or GL11.glBind(texture.getTextureID());     
         
        GL11.glBegin(GL11.GL_QUADS);          	
           GL11.glTexCoord2f(0,0);
           GL11.glVertex2f(X,Y);
           GL11.glTexCoord2f(1,0);
           GL11.glVertex2f(X+buttonTexture.getTextureWidth(),Y);
           GL11.glTexCoord2f(1,1);
           GL11.glVertex2f(X+buttonTexture.getTextureWidth(),Y+buttonTexture.getTextureHeight());
           GL11.glTexCoord2f(0,1);
           GL11.glVertex2f(X,Y+buttonTexture.getTextureHeight());        
       GL11.glEnd();
       
       GL11.glDisable(GL11.GL_BLEND);
       GL11.glMatrixMode(GL11.GL_MODELVIEW);
      
        }
    public void destroy(){
    	try {
			this.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    }