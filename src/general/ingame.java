package general;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

@SuppressWarnings("unused")
public class ingame {

	private static long frame = 0;

	private static final String Hintergrundpath = "../GameJam/src/Textures/background.png";
	private static final String schwarz = "../GameJam/src/Textures/schwarz.png";

	private static final String Lebensbalken = "../GameJam/src/Textures/LebensBalken.png";

	public static void draw() {
	
	
	Button Hintergrund=new Button();
	Hintergrund.addButton(0,0, Hintergrundpath);
	
	Button Hintergrund2=new Button();
	Hintergrund2.addButton(100,0, schwarz);
	
	Sigmund opi=new Sigmund(new Status( new Position(200,320),1,true),"Opa",1000,new Weapon());	
	opi.setSprites();
	Emma opi2=new Emma(new Status( new Position(400,320),1,true),"Emma",1000,new Weapon());
	opi2.setSprites();
	
	Button opibutt=new Button();
	Button opibutt2=new Button();
	
	opibutt.addButton(opi.getStatus().getPosition().getX(), opi.getStatus().getPosition().getY(),opi.getSprite()[0]);
	opibutt2.addButton(opi2.getStatus().getPosition().getX(), opi2.getStatus().getPosition().getY(),opi2.getSprite()[0]);
	
	
	
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
    System.out.println(Keyboard.areRepeatEventsEnabled());
	

    
    //Spielschleife
	while (!Display.isCloseRequested()) {
				
		if (opi.jump!=0) {opi.getStatus().getPosition().setY(opi.getStatus().getPosition().getY()-2*settings.deltaMove);opi.jump--;}
		Gravitation(opi);
		if (opi2.jump!=0) {opi2.getStatus().getPosition().setY(opi2.getStatus().getPosition().getY()-2*settings.deltaMove);opi2.jump--;}
		Gravitation(opi2);
		
		
		
		Hintergrund.Draw();
		
		Keyboard.poll();
		Keyboard.next();
		
		//opi lebensbalken
		int n=opi.getLife()/200;
		if(n-->0) lebensbutton1.Draw();
		if(n-->0) lebensbutton2.Draw();
		if(n-->0) lebensbutton3.Draw();
		if(n-->0) lebensbutton4.Draw();
		if(n-->0) lebensbutton5.Draw();
		
		
		
		//op2 lebensbalken
		n=Math.round(opi2.getLife()/200);
		
		if(n-->0) lebensbutton6.Draw();
		if(n-->0) lebensbutton7.Draw();
		if(n-->0) lebensbutton8.Draw();
		if(n-->0) lebensbutton9.Draw();
		if(n-->0) lebensbutton10.Draw();
		
			
		
		

	
			 if(Keyboard.isKeyDown(Keyboard.KEY_A)) {

				 opi.MoveLeft();	 
			 }
			 if(Keyboard.isKeyDown(Keyboard.KEY_D)) {

				 opi.MoveRight(); }
			 
			 if(Keyboard.isKeyDown(Keyboard.KEY_W)) {

				 opi.Jump();	
			 }
				 if(Keyboard.isKeyDown(Keyboard.KEY_S)) {

				 opi.Block();	    
				 }
				 if(Keyboard.isKeyDown(Keyboard.KEY_C)) {

			     opi.Hit(opi2);	    }
				//	 if(Keyboard.isKeyDown(Keyboard.KEY_V)) {
					
				//       opi.Special(opi2);	    }

		 
		
		 
			
				

					 if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {

						 opi2.MoveLeft();	 }
					 if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {

						 opi2.MoveRight(); }
					 
					 if(Keyboard.isKeyDown(Keyboard.KEY_UP)) {

						 opi2.Jump();	    }
					 if(Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
						 opi2.Block();	    }
					 if(Keyboard.isKeyDown(Keyboard.KEY_M)) {
			
					     opi2.Hit(opi);	    }
					// if(Keyboard.isKeyDown(Keyboard.KEY_COMMA)) {
			
				//       opi2.Special(opi);	    }
					 
					
		 
		 opibutt.addButton(opi.getStatus().getPosition().getX(), opi.getStatus().getPosition().getY(), opi.getSprite()[opi.getStatus().getSpriteID()]);
		 opibutt2.addButton(opi2.getStatus().getPosition().getX(), opi2.getStatus().getPosition().getY(), opi2.getSprite()[opi2.getStatus().getSpriteID()]);
		 
		opibutt.Draw();
		opibutt2.Draw();
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