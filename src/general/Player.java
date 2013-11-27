package general;

public class Player {
	control type=null;
	Character c=null;
	Character e=null;
	
	
	
	Player(control _type,Character _c,Character _e) {
		type=_type;
		c= _c;
		e= _e;
	}
	
	public void Round() {
		switch (type) {
		case AI: 					//unimplemented
			break;
		case Controller: 		Controller.round(c, e);
			break;
		case Keyboard_one:		Keyboard_one.round(c,e);
			break;
		case Keyboard_two:		Keyboard_two.round(c,e);
			break;
		default:
			break;
		
		}
			
	}

}
