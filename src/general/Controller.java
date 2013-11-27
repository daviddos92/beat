package general;


public class Controller {
	
	public static void Left(Character c) {
		// TODO Auto-generated method stub
		if(ingame.controller.getAxisValue(1)<-.5) {

			 c.MoveLeft();	 
		 }
	}

	public static void Right(Character c) {
		// TODO Auto-generated method stub
		if(ingame.controller.getAxisValue(1)>.5) {

			 c.MoveRight(); }
		
	}

	public static void Up(Character c) {
		// TODO Auto-generated method stub
		 if(ingame.controller.isButtonPressed(0)) {  	// A

			 c.Jump();	
		 }
		
	}

	public static void Down(Character c) {
		// TODO Auto-generated method stub
		if(ingame.controller.isButtonPressed(1)) {  	// B

			 c.Block();	    
			 }
	}

	public static void A1(Character c, Character e) {
		// TODO Auto-generated method stub
		 if(ingame.controller.isButtonPressed(2)) {		// X

		     c.Hit(e);	    }
		
	}

	public static void A2(Character c, Character e) {
		// TODO Auto-generated method stub
		 if(ingame.controller.isButtonPressed(3)) {		// Y
				
		      c.UseSkill(e);	    }
		
	}

	public static void round(Character c, Character e) {
		// TODO Auto-generated method stub
		Left(c);
		Right(c);
		Up(c);
		Down(c);
		A1(c,e);
		A2(c,e);
		
	}

}
