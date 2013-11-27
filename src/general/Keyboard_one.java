package general;

import org.lwjgl.input.Keyboard;

public class Keyboard_one{

	public static void Left(Character c) {
		// TODO Auto-generated method stub
		if(Keyboard.isKeyDown(Keyboard.KEY_A)) {

			 c.MoveLeft();	 
		 }
	}

	public static void Right(Character c) {
		// TODO Auto-generated method stub
		if(Keyboard.isKeyDown(Keyboard.KEY_D)) {

			 c.MoveRight(); }
		
	}

	public static void Up(Character c) {
		// TODO Auto-generated method stub
		 if(Keyboard.isKeyDown(Keyboard.KEY_W)) {

			 c.Jump();	
		 }
		
	}

	public static void Down(Character c) {
		// TODO Auto-generated method stub
		if(Keyboard.isKeyDown(Keyboard.KEY_S)) {

			 c.Block();	    
			 }
	}

	public static void A1(Character c, Character e) {
		// TODO Auto-generated method stub
		 if(Keyboard.isKeyDown(Keyboard.KEY_C)) {

		     c.Hit(e);	    }
		
	}

	public static void A2(Character c, Character e) {
		// TODO Auto-generated method stub
		 if(Keyboard.isKeyDown(Keyboard.KEY_V)) {
				
		      c.UseSkill(e);	    }
		
	}

	
	static void round(Character c, Character e) {
		// TODO Auto-generated method stub
		Left(c);
		Right(c);
		Up(c);
		Down(c);
		A1(c,e);
		A2(c,e);
	}
	
}
