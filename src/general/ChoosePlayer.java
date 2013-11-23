package general;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class ChoosePlayer {

	public void start() {
		/*
		try {
			Display.setDisplayMode(new DisplayMode(800, 600));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		*/
		Button choosePlayer = new Button();
		choosePlayer.addButton(350, 150,"C:/Users/Lennart/Pictures/PlayKLEIN.png");
		Button player1 = new Button();
		player1.addButton(350, 260, "C:/Users/Lennart/Pictures/PlayKLEIN.png");
		Button player2 = new Button();
		player2.addButton(350, 570, "C:/Users/Lennart/Pictures/PlayKLEIN.png");

		Button black = new Button();
		black.addButton(0, 0, "C:/Users/Lennart/Pictures/schwarz.png");

		while (!Display.isCloseRequested()) {
			black.Draw();
			player1.Draw();
			player2.Draw();
			if (player1.isClicked) {
				// ChooseCharacter x = new ChooseCharacter();
				// x.start();
				break;
			}
			if (player2.isClicked) {
				// ChooseCharacter y = new ChooseCharacter();
				// y.start();
				break;
			}
			Display.update();
		}
	}

	public static void main(String[] argv) {
		ChoosePlayer displayExample = new ChoosePlayer();
		displayExample.start();

	}
}