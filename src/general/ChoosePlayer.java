package general;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class ChoosePlayer {
	
	static int p1 = 1;
	static int p2 = 1;

	public boolean start() {
		
		p1 = 1;
		p2 = 1;
		Button BG11 = new Button();
		BG11.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT11.png");
		Button BG12 = new Button();
		BG12.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT12.png");
		Button BG13 = new Button();
		BG13.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT13.png");
		Button BG14 = new Button();
		BG14.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT14.png");
		Button BG21 = new Button();
		BG21.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT21.png");
		Button BG22 = new Button();
		BG22.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT22.png");
		Button BG23 = new Button();
		BG23.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT23.png");
		Button BG24 = new Button();
		BG24.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT24.png");
		Button BG31 = new Button();
		BG31.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT31.png");
		Button BG32 = new Button();
		BG32.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT32.png");
		Button BG33 = new Button();
		BG33.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT33.png");
		Button BG34 = new Button();
		BG34.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT34.png");
		Button BG41 = new Button();
		BG41.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT41.png");
		Button BG42 = new Button();
		BG42.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT42.png");
		Button BG43 = new Button();
		BG43.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT43.png");
		Button BG44 = new Button();
		BG44.addButton(0,0,"../gamejam/src/ChoosePlayerPics/CharauswahlBEREIT44.png");		
		
		
		Button BackgroundNichtBereit = new Button();
		BackgroundNichtBereit.addButton(0,0,"../gamejam/src/Textures/CharauswahlNICHTBEREIT.png");
		Button BackgroundBereit = new Button();
		BackgroundBereit.addButton(0,0,"../gamejam/src/Textures/CharauswahlBEREIT.png");
		Button Domina = new Button();
		Domina.addButton(399, 175, "../gamejam/src/Textures/Domina_Portrait_Neu2.png");
		Button Rentner = new Button();
		Rentner.addButton(107, 186, "../gamejam/src/Textures/Rentner_Portrait_Neu2.png");
		Button Wheelgirl = new Button();
		Wheelgirl.addButton(999,184, "../gamejam/src/Textures/Wheelgirl_Portrait_Neu2.png");
		Button MiniMie = new Button();
		MiniMie.addButton(705,199,"../gamejam/src/Textures/MiniMie_Portrait_Neu2.png");	
		Button Bereit = new Button();
		Bereit.addButton(1050,589,"../gamejam/src/Textures/Bereit2.png");
		Button Back = new Button();
		Back.addButton(36,590, "../gamejam/src/Textures/Zurück2.png");

        Button black = new Button();
        black.addButton(0, 0, "../gamejam/src/Textures/schwarz.png");
        
        String player1 = "Sigmund";
        String player2 = "Sigmund";
        
        //opi: 151,373; 234,370
        //dom: 441,365; 515,365
        //kid: 762,358; 824,354
        //mädel: 1026,358; 1092,365
        
        
        
		while (!Display.isCloseRequested()) {
		
			black.Draw();
			Rentner.Draw();   //107,186
			Domina.Draw();   //399,175
			MiniMie.Draw();   //705,199
			Wheelgirl.Draw();  //999,184
			Bereit.Draw();
			Back.Draw();
			
			// bereit button 1050,589		
			// zurück 36,590
			
			if(p1==1){
				if(p2==1){BG11.Draw();}
				if(p2==2){BG12.Draw();}
				if(p2==3){BG13.Draw();}
				if(p2==4){BG14.Draw();}
			}
			if(p1==2){
				if(p2==1){BG21.Draw();}
				if(p2==2){BG22.Draw();}
				if(p2==3){BG23.Draw();}
				if(p2==4){BG24.Draw();}
			}
			if(p1==3){
				if(p2==1){BG31.Draw();}
				if(p2==2){BG32.Draw();}
				if(p2==3){BG33.Draw();}				
				if(p2==4){BG34.Draw();}
			}
			if(p1==4){
				if(p2==1){BG41.Draw();}
				if(p2==2){BG42.Draw();}
				if(p2==3){BG43.Draw();}
				if(p2==4){BG44.Draw();}
			}
			
			if(Rentner.isClicked){
				player1 = "Sigmund";p1=1;
			}
			if(Rentner.bounds.contains(Mouse.getX(),(720-Mouse.getY()))&&Mouse.isButtonDown(1)){
				player2 = "Sigmund";p2=1;
			}			

			if(Domina.isClicked){
				player1 = "Lady Lara";p1=2;
			}			
			if(Domina.bounds.contains(Mouse.getX(),(720-Mouse.getY()))&&Mouse.isButtonDown(1)){
				player2 = "Lady Lara";p2=2;
			}

			if(MiniMie.isClicked){
				player1 = "Tom";p1=3;
			}
			if(MiniMie.bounds.contains(Mouse.getX(),(720-Mouse.getY()))&&Mouse.isButtonDown(1)){
				player2 = "Tom";p2=3;
			}
			
			if(Wheelgirl.isClicked){
				player1 = "Emma";p1=4;
			}
			if(Wheelgirl.bounds.contains(Mouse.getX(),(720-Mouse.getY()))&&Mouse.isButtonDown(1)){
				player2 = "Emma";p2=4;
			}
			
			
			if (Bereit.isClicked){
				ingame.draw(player1,player2);
				break;
			}
			
			if(Back.isClicked){
				return true;
			}
			Display.update();
			
		}
		Display.destroy();
		return false;
	}
}