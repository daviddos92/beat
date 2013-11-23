package general;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class ingame {
	
	public static int jump=0;
	private static final String Hintergrund = "../GameJam/src/general/background.png";
	private static final String test2 = "../GameJam/src/general/test1.png";
	
	private static final String Lebensbalken = "../GameJam/src/general/LebensBalken.png";
public static void draw() {
	
	
	Button testbutton=new Button();
	testbutton.addButton(0,0, Hintergrund);
	
	Button testbutton2=new Button();
	testbutton2.addButton(100,0, test2);
	
	Character opi=new Character(new Status( new Position(200,320),1,true),"Opa",100,new Weapon());
	Button opibutt=new Button();
	opibutt.addButton(opi.getStatus().getPosition().getX(), opi.getStatus().getPosition().getY(), "../GameJam/src/general/Rentner_Idle.png");
	
	Button lebensbutton=new Button();
	lebensbutton.addButton(5,5, Lebensbalken);
	
	

	while (!Display.isCloseRequested()) {
		
		if (jump!=0) opi.getStatus().getPosition().setY(opi.getStatus().getPosition().getY()-1);
		
		
		testbutton.Draw();
		
		
		lebensbutton.Draw();
		Keyboard.next();
		 if (Keyboard.getEventKeyState()) {
		if(Keyboard.getEventKey()==Keyboard.KEY_W) {
			
			opibutt.addButton(opi.getStatus().getPosition().getX(), opi.getStatus().getPosition().getY(), "../GameJam/src/general/Rentner_Idle.png");
			
			opi.getStatus().setPosition(new Position(opi.getStatus().getPosition().getX()+2,opi.getStatus().getPosition().getY()));
			
			
			

		}
		if(Keyboard.getEventKey()==Keyboard.KEY_SPACE) {
		
		    opi.Jump();
		
		 }
		 }
		 
		 
		 opibutt.addButton(opi.getStatus().getPosition().getX(), opi.getStatus().getPosition().getY(), "../GameJam/src/general/Rentner_Idle.png");
		 
		opibutt.Draw();
		Display.update();
		
	}
	Display.destroy();
}
}
