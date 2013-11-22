package general;

import org.lwjgl.*;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Main {

	/**
	 * @param args
	 * @throws LWJGLException 
	 */
	public static void main(String[] args) throws LWJGLException {
		//new Window("Test");
		Display.setDisplayMode(new DisplayMode(800,600));
		Display.create();
		
		Mouse.create();
		
		while (!Display.isCloseRequested()) {
			Display.update();
			int x = Mouse.getX();
			int y = Mouse.getY();
			if(Mouse.isButtonDown(0)){
				System.out.println(x + " " + y);
			}
		}
		
		
		
	}

}
