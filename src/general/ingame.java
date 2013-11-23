package general;

import org.lwjgl.opengl.Display;

public class ingame {
	
	private static final String Hintergrund = "C:/Users/David Schulte/Desktop/GameJam/background.png";
public static void draw() {
	
	
	Button testbutton=new Button();
	testbutton.addButton(0,0, Hintergrund);
	

	while (!Display.isCloseRequested()) {
		
		
		testbutton.Draw();
		
		
		Display.update();
		
	}
	Display.destroy();
}
}
