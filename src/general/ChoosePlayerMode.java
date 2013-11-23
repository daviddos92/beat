package general;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
@SuppressWarnings("unused")
public class ChoosePlayerMode {

        public boolean start() {
//                Button choosePlayer = new Button();
//                choosePlayer.addButton(350, 150, "../gamejam/src/Textures/PlayKLEIN.png");
                Button player1 = new Button();
                player1.addButton(350, 140, "../gamejam/src/Textures/Single.png");
                Button player2 = new Button();
                player2.addButton(350, 450, "../gamejam/src/Textures/Multi.png");
                Button back = new Button();
                back.addButton(1000, 600, "../gamejam/src/Textures/back.png");

                Button black = new Button();
                black.addButton(0, 0, "../gamejam/src/Textures/schwarz.png");

                while (!Display.isCloseRequested()) {
                        black.Draw();
                        player1.Draw();
                        player2.Draw();
                        back.Draw();

//                      if (player1.isClicked) {
//                                // ChooseCharacter x = new ChooseCharacter();
//                                // x.start();
//                                break;
//                       }
                        if (player2.isClicked) {
                                ChoosePlayer nextOne = new ChoosePlayer();
                                 nextOne.start();
                                break;
                        }
                        if (back.isClicked) {
                                return true;
                        }
                        Display.update();
                }
                return false;
        }
}