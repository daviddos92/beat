package general;

public class Sigmund extends Character{ 
	
												

	 
	
	Sigmund(Status _current, String _Name, int _Life, Weapon _Weapon) {
		super(_current, _Name, _Life, _Weapon);
	}
	
	public void setSprites() {
		Sprite[0]="../GameJam/src/Textures/Rentner_Idle.png"; 		// normal
		Sprite[1]="../GameJam/src/Textures/Rentner_Attack.png";		// hit
		Sprite[2]="../GameJam/src/Textures/Rentner_Block.png";		// block
		Sprite[3]="../GameJam/src/Textures/Rentner_Jump.png";		// jump
		Sprite[4]=null;												// special
	}

}
