package general;
import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.Display;

public class Credits{
        public boolean start(){
                Button background = new Button();
                background.addButton(0, 0, "../gamejam/src/Textures/Credits.png");
                
                Button back = new Button();
                back.addButton(1000, 600, "../gamejam/src/Textures/Zurück.png");

                while (!Display.isCloseRequested()) {
                        background.Draw();
                        back.Draw();

                	
                        if (back.isClicked) {
                        	
                            return true;
                    }
                        
                        Display.update();
                        }
                       
                               
                
                return false;                                
        }
}
