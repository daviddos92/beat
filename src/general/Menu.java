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

	private static final String TEXPATH = "../gamejam/src/Textures/PlayKLEIN.png";
	private static final String TEXPATH2 = "../gamejam/src/Textures/OptionsKLEIN.png";
	private static final String TEXPATH3 = "../gamejam/src/Textures/CreditsKLEIN.png";
	private static final String TEXPATH4 = "../gamejam/src/Textures/ExitKLEIN.png";

	private static final String schwarz = "../gamejam/src/Textures/schwarz.png";

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
		Button play = new Button();
		play.addButton(550, 200, TEXPATH);

		Button options = new Button();
		options.addButton(460, 300, TEXPATH2);

		Button credits = new Button();
		credits.addButton(460, 400, TEXPATH3);

		Button exit = new Button();
		exit.addButton(550, 500, TEXPATH4);

		Button black = new Button();
		black.addButton(0, 0, schwarz);

		while (!Display.isCloseRequested()) {

			// render OpenGL here
			black.Draw();
			play.Draw();
			options.Draw();
			credits.Draw();
			exit.Draw();

			if (play.isClicked) {
				ChoosePlayerMode next = new ChoosePlayerMode();
				if (!next.start()) {
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
				ingame.draw();
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