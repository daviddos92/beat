package general;
import org.lwjgl.*;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.LWJGLException;




import java.awt.GridLayout;
import java.awt.PopupMenu;

public class Menu{
	
	private static final String TEXPATH = "C:/Users/David Schulte/Desktop/GameJam/bin/general/test2.png";
	private static final String TEXPATH2 = "C:/Users/David Schulte/Desktop/GameJam/bin/general/test.png";
	public void start() {
		try {
			Display.setDisplayMode(new DisplayMode(1280,720));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		// init OpenGL here
		Button testbutton=new Button();
		testbutton.addButton(120,100, TEXPATH);
		
		Button testbutton2=new Button();
		testbutton2.addButton(300,250, TEXPATH2);
		
//		
//		Button testbutton3=new Button();
//		testbutton3.addButton(450,400, TEXPATH);
		
		while (!Display.isCloseRequested()) {
			
			// render OpenGL here
//			int mousex = Mouse.getX(); // will return the X coordinate on the Display.
//			int mousey = Mouse.getY(); // will return the Y coordinate on the Display.
		
			testbutton.Draw();
			testbutton2.Draw();
//			testbutton3.Draw();
			Display.update();

		Display.sync(60);
			
		}
		
		Display.destroy();
	}
	
	public static void main(String[] argv) {
		Menu displayExample = new Menu();
		displayExample.start();
	}
}
