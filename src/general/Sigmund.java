package general;

public class Sigmund extends Character{ 
	
												

	 
	
	Sigmund(Status _current, String _Name, int _Life, Weapon _Weapon) {
		super(_current, _Name, _Life, _Weapon);
	}
	
	public void setSprites() {
		Sprite[0]="../GameJam/src/Textures/Rentner_Idle.png"; 							// normal
		Sprite[1]="../GameJam/src/Textures/Rentner_Attack.png";							// hit
		Sprite[2]="../GameJam/src/Textures/Rentner_Block.png";							// block
		Sprite[3]="../GameJam/src/Textures/Rentner_Jump.png";							// jump
		Sprite[4]="../GameJam/src/Textures/Rentner_Attack_Toilet_Brush.png";			// special
		Sprite[5]="../GameJam/src/Textures/Rentner_Idle_inverted.png";					// normal inverted
		Sprite[6]="../GameJam/src/Textures/Rentner_Attack_inverted.png";				// hit inverted	
		Sprite[7]="../GameJam/src/Textures/Rentner_Block_inverted.png";					// block inverted
		Sprite[8]="../GameJam/src/Textures/Rentner_Jump_inverted.png";					// jump inverted
		Sprite[9]="../GameJam/src/Textures/Rentner_Attack_Toilet_Brush_inverted.png";	// special inverted
	}

}
