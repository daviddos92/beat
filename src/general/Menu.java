package general;

import org.lwjgl.*;
import org.lwjgl.openal.AL;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.LWJGLException;
import org.newdawn.slick.openal.*;
import org.newdawn.slick.*;
@SuppressWarnings("unused")
public class Menu {

	private static final String backpath = "../gamejam/src/Textures/Menu Back2.png";
	private static final String TEXPATH = "../gamejam/src/Textures/PlayKLEIN.png";
	private static final String TEXPATH2 = "../gamejam/src/Textures/OptionsKLEIN.png";
	private static final String TEXPATH3 = "../gamejam/src/Textures/CreditsKLEIN.png";
	private static final String TEXPATH4 = "../gamejam/src/Textures/ExitKLEIN.png";

	public void start() {
		try {
			Display.setDisplayMode(new DisplayMode(1280, 720));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		try {
			Music openingMusic = new Music("../gamejam/src/Musik/menumusic.ogg");
			openingMusic.play(1,3);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
		
		// init OpenGL here
		Button background = new Button();
		background.addButton(0,0, backpath);
		
		Button play = new Button();
		play.addButton(550, 160, TEXPATH);

		Button options = new Button();
		options.addButton(460, 270, TEXPATH2);

		Button credits = new Button();
		credits.addButton(460, 390, TEXPATH3);

		Button exit = new Button();
		exit.addButton(550, 500, TEXPATH4);


		while (!Display.isCloseRequested()) {

			// render OpenGL here
			background.Draw();
			play.Draw();
			options.Draw();
			credits.Draw();
			exit.Draw();

			if (play.isClicked) {
				
				ChoosePlayerMode next = new ChoosePlayerMode();
				if(!next.start()) {
				exit=null;
				credits=null;
				options=null;
				play=null;
				background=null;
				
				
						
					break;
				}
				
			}

			if (options.isClicked) {
				Options next = new Options();
				next.start();
				 
				 
			}

			if (credits.isClicked) {
				Credits next = new Credits();
				next.start();

			}
			if (exit.isClicked) {
				exit=null;
				credits=null;
				options=null;
				play=null;
				background=null;
				break;
			}

			Display.update();
			Display.sync(60);

		}
		Display.destroy();
		AL.destroy();

	}

	public static void main(String[] argv) {
		Menu displayExample = new Menu();
		displayExample.start();
	}

}