package general;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

public class ingame {
	
	private static final String Hintergrund = "../GameJam/src/general/background.png";
	private static final String test2 = "../GameJam/src/general/test1.png";
public static void draw() {
	
	
	Button testbutton=new Button();
	testbutton.addButton(0,0, Hintergrund);
	int test=0;

	while (!Display.isCloseRequested()) {
		
		 testbutton=new Button();
		testbutton.addButton(0,0, Hintergrund);
		testbutton.Draw();
		Keyboard.next();
		if(Keyboard.getEventKey()==Keyboard.KEY_W) {
			testbutton.addButton(100,test,test2 );
			test++;
			testbutton.Draw();
			System.out.println("test");
		}
		
		Display.update();
		
	}
	Display.destroy();
}
}
