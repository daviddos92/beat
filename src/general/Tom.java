package general;

public class Tom extends Character{ 
	
	Tom(Status _current, String _Name, int _Life, Weapon _Weapon) {
		super(_current, _Name, _Life, _Weapon);
	}
	
	public void setSprites() {
		Sprite[0]="../GameJam/src/Textures/Minimie_360_Idle.png"; 				// normal
		Sprite[1]="../GameJam/src/Textures/Minimie_360_Attack.png";				// hit
		Sprite[2]="../GameJam/src/Textures/Minimie_360_Block.png";				// block
		Sprite[3]="../GameJam/src/Textures/Minimie_360_Jump.png";				// jump
		Sprite[4]=null;															// special
		Sprite[5]="../GameJam/src/Textures/Minimie_360_Idle_inverted.png"; 		// normal inverted
		Sprite[6]="../GameJam/src/Textures/Minimie_360_Attack_inverted.png";	// hit inverted
		Sprite[7]="../GameJam/src/Textures/Minimie_360_Block_inverted.png";		// block inverted
		Sprite[8]="../GameJam/src/Textures/Minimie_360_Jump_inverted.png";		// jump inverted
		Sprite[9]=null;															// special inverted
	}

}
