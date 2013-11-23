package general;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class ChoosePlayer {

	public boolean start() {
		Button Domina = new Button();
		Domina.addButton(300, 200, "../gamejam/src/Textures/Domina_Portrait.png");
		Button Rentner = new Button();
		Rentner.addButton(400, 200, "../gamejam/src/Textures/Rentner_Portrait.png");
		Button Wheelgirl = new Button();
		Wheelgirl.addButton(300,300, "../gamejam/src/Textures/Wheelgirl_Portrait.png");
		Button MiniMie = new Button();
		MiniMie.addButton(400,300,"../gamejam/src/Textures/MiniMie_Portrait.png");	
		Button Bereit = new Button();
		Bereit.addButton(800,500,"../gamejam/src/Textures/Bereit.png");
		Button Nichtbereit = new Button();
		Nichtbereit.addButton(800, 500, "../gamejam/src/Textures/Nichtbereit.png");

        Button black = new Button();
        black.addButton(0, 0, "../gamejam/src/Textures/schwarz.png");
        
        String player1 = "";
        String player2 = "";
		
		while (!Display.isCloseRequested()) {
			black.Draw();
			Domina.Draw();
			Rentner.Draw();
			Wheelgirl.Draw();
			MiniMie.Draw();
			
			
			if(Domina.isClicked){
				player1 = "Lady Lara";
			}			
			if(Domina.bounds.contains(Mouse.getX(),(720-Mouse.getY()))&&Mouse.isButtonDown(1)){
				player2 = "Lady Lara";
			}
			
			if(Rentner.isClicked){
				player1 = "Sigmund";
			}
			if(Rentner.bounds.contains(Mouse.getX(),(720-Mouse.getY()))&&Mouse.isButtonDown(1)){
				player2 = "Sigmund";
			}
			
			if(Wheelgirl.isClicked){
				player1 = "Emma";
			}
			if(Wheelgirl.bounds.contains(Mouse.getX(),(720-Mouse.getY()))&&Mouse.isButtonDown(1)){
				player2 = "Emma";
			}
			
			if(MiniMie.isClicked){
				player1 = "Tom";
			}
			if(MiniMie.bounds.contains(Mouse.getX(),(720-Mouse.getY()))&&Mouse.isButtonDown(1)){
				player2 = "Tom";
			}
			
			if((player1!="")&&(player2!="")){			
				Bereit.Draw();
				
				
			}
			else{
				Nichtbereit.Draw();
			}			
			if(Bereit.isClicked){
				ingame.draw(player1,player2);
			}
		
			Display.update();
		}
		return false;
	}

}
