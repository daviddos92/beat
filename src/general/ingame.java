package general;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;

@SuppressWarnings("unused")
public class ingame {
	
	

	private static long frame = 0;

	private static final String Hintergrundpath = "../GameJam/src/Textures/background.png";
	private static final String schwarz = "../GameJam/src/Textures/schwarz.png";

	private static final String Lebensbalken = "../GameJam/src/Textures/LebensBalken.png";

	public static void draw(String Player1, String Player2) {
	
try {
			
			Music fightMusic = new Music("../gamejam/src/Musik/fightmusic.ogg");
			fightMusic.play(1,3);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
     Character player1char=null;
     Character player2char=null;
	if(Player1=="Lady Lara")  {
		 player1char=new Lady_Lara(new Status( new Position(200,320),0,true),"Lady Lara",1000,new Weapon());		
	}
	if(Player1=="Emma")			{
		player1char=new Emma(new Status( new Position(200,320),0,true),"Emma",1000,new Weapon());		
	}
	if(Player1=="Tom")			{
		 player1char=new Tom(new Status( new Position(200,320),0,true),"Tom",1000,new Weapon());		
	}
	if(Player1=="Sigmund")		{
		 player1char=new Sigmund(new Status( new Position(200,320),0,true),"Sigmund",1000,new Weapon());		
	}
					
	if(Player2=="Lady Lara") {
		 player2char=new Lady_Lara(new Status( new Position(950,320),0,false),"Lady Lara",1000,new Weapon());		
	}
	if(Player2=="Emma") {
		 player2char=new Emma(new Status( new Position(950,320),0,false),"Emma",1000,new Weapon());	
	}
	if(Player2=="Tom") {
		 player2char=new Tom(new Status( new Position(950,320),0,false),"Tom",1000,new Weapon());		
	}
	if(Player2=="Sigmund")	{
		player2char=new Sigmund(new Status( new Position(950,320),0,false),"Sigmund",1000,new Weapon());		
	}
	
	Button Hintergrund=new Button();
	Hintergrund.addButton(0,0, Hintergrundpath);
	
	Button Hintergrund2=new Button();
	Hintergrund2.addButton(100,0, schwarz);
	
	player1char.setSprites();
	player2char.setSprites();
	
	Button player1charbutt=new Button();
	Button player1charbutt2=new Button();
	
	player1charbutt.addButton(player1char.getStatus().getPosition().getX(), player1char.getStatus().getPosition().getY(),player1char.getSprite()[0]);
	player1charbutt2.addButton(player2char.getStatus().getPosition().getX(), player2char.getStatus().getPosition().getY(),player2char.getSprite()[5]);
	player2char.MoveLeft();
	
	
	Button lebensbutton1=new Button();
	lebensbutton1.addButton(5,5, Lebensbalken);
	
	Button lebensbutton2=new Button();
	lebensbutton2.addButton(65,5, Lebensbalken);
	Button lebensbutton3=new Button();
	lebensbutton3.addButton(125,5, Lebensbalken);
	Button lebensbutton4=new Button();
	lebensbutton4.addButton(185,5, Lebensbalken);
	Button lebensbutton5=new Button();
	lebensbutton5.addButton(245,5, Lebensbalken);
	Button lebensbutton6=new Button();
	lebensbutton6.addButton(1140,5, Lebensbalken);
	Button lebensbutton7=new Button();
	lebensbutton7.addButton(1080,5, Lebensbalken);
	Button lebensbutton8=new Button();
	lebensbutton8.addButton(1020,5, Lebensbalken);
	Button lebensbutton9=new Button();
	lebensbutton9.addButton(960,5, Lebensbalken);
	Button lebensbutton10=new Button();
	lebensbutton10.addButton(900,5, Lebensbalken);

	Keyboard.enableRepeatEvents(false);

	

    
    //Spielschleife
	while (!Display.isCloseRequested()) {
		
				
		if (player1char.jump!=0) {player1char.getStatus().getPosition().setY(player1char.getStatus().getPosition().getY()-2*settings.deltaMove);player1char.jump--;}
		Gravitation(player1char);
		if (player2char.jump!=0) {player2char.getStatus().getPosition().setY(player2char.getStatus().getPosition().getY()-2*settings.deltaMove);player2char.jump--;}
		Gravitation(player2char);
		
		
		
		Hintergrund.Draw();
		
		Keyboard.poll();
		Keyboard.next();
		
		//player1char lebensbalken
		int n=player1char.getLife()/200;
		if(n-->0) lebensbutton1.Draw();
		if(n-->0) lebensbutton2.Draw();
		if(n-->0) lebensbutton3.Draw();
		if(n-->0) lebensbutton4.Draw();
		if(n-->0) lebensbutton5.Draw();
		
		
		
		//op2 lebensbalken
		n=Math.round(player2char.getLife()/200);
		
		if(n-->0) lebensbutton6.Draw();
		if(n-->0) lebensbutton7.Draw();
		if(n-->0) lebensbutton8.Draw();
		if(n-->0) lebensbutton9.Draw();
		if(n-->0) lebensbutton10.Draw();
		
			
		
		

	
			 if(Keyboard.isKeyDown(Keyboard.KEY_A)) {

				 player1char.MoveLeft();	 
			 }
			 if(Keyboard.isKeyDown(Keyboard.KEY_D)) {

				 player1char.MoveRight(); }
			 
			 if(Keyboard.isKeyDown(Keyboard.KEY_W)) {

				 player1char.Jump();	
			 }
				 if(Keyboard.isKeyDown(Keyboard.KEY_S)) {

				 player1char.Block();	    
				 }
				 if(Keyboard.isKeyDown(Keyboard.KEY_C)) {

			     player1char.Hit(player2char);	    }
				//	 if(Keyboard.isKeyDown(Keyboard.KEY_V)) {
					
				//       player1char.Special(player2char);	    }

		 
		
		 
			
				

					 if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {

						 player2char.MoveLeft();	 }
					 if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {

						 player2char.MoveRight(); }
					 
					 if(Keyboard.isKeyDown(Keyboard.KEY_UP)) {

						 player2char.Jump();	    }
					 if(Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
						 player2char.Block();	    }
					 if(Keyboard.isKeyDown(Keyboard.KEY_M)) {
			
					     player2char.Hit(player1char);	    }
					// if(Keyboard.isKeyDown(Keyboard.KEY_COMMA)) {
			
				//       player2char.Special(player1char);	    }
					 
					
		 
		 player1charbutt.addButton(player1char.getStatus().getPosition().getX(), player1char.getStatus().getPosition().getY(), player1char.getSprite()[player1char.getStatus().getSpriteID()]);
		 player1charbutt2.addButton(player2char.getStatus().getPosition().getX(), player2char.getStatus().getPosition().getY(), player2char.getSprite()[player2char.getStatus().getSpriteID()]);
		 
		player1charbutt.Draw();
		player1charbutt2.Draw();
		Display.update();
		
	}
	Display.destroy();
	
}

	public static void Gravitation(Character c) {
		if (c.getStatus().getPosition().getY() < 320)
			c.getStatus()
					.getPosition()
					.setY(c.getStatus().getPosition().getY()
							+ settings.deltaMove);

	}
}