package general;
import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.Display;
@SuppressWarnings("unused")
public class Credits{
        public boolean start(){
                Button black = new Button();
                black.addButton(0, 0, "../gamejam/src/Textrues/schwarz.png");
                
                Button credit = new Button();
                credit.addButton(200, 200, "../gamejam/src/Textrues/lecredits.png");
                
                
                int x1 = 0;
                int y = 0;
                while (!Display.isCloseRequested()) {
                        black.Draw();
                        credit.addButton(100, x1, "../gamejam/src/Textrues/lecredits.png");                                
                        credit.Draw();        
                        y++;
                        if (y==10){
                                x1++;
                                y=0;
                        }
                        Display.update();
                }                
                
                return false;                                
        }
}
