package general;

import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class Lady_Lara extends Character{ 
	
	Lady_Lara(Status _current, String _Name, int _Life, Weapon _Weapon) {
		super(_current, _Name, _Life, _Weapon);
	}
	
	public void setSprites() {
		Sprite[0]="../GameJam/src/Textures/Domina_Idle.png"; 				// normal
		Sprite[1]="../GameJam/src/Textures/Domina_Attack.png";				// hit
		Sprite[2]="../GameJam/src/Textures/Domina_Block.png";				// block
		Sprite[3]="../GameJam/src/Textures/Domina_Jump.png";				// jump
		Sprite[4]="../GameJam/src/Textures/Domina_Attack_Spezial_Attack.png";// special
		Sprite[5]="../GameJam/src/Textures/Domina_Idle_inverted.png"; 		// normal
		Sprite[6]="../GameJam/src/Textures/Domina_Attack_inverted.png";		// hit
		Sprite[7]="../GameJam/src/Textures/Domina_Block_inverted.png";		// block
		Sprite[8]="../GameJam/src/Textures/Domina_Jump_inverted.png";		// jump
		Sprite[9]="../GameJam/src/Textures/Domina_Attack_Spezial_Attack_inverted.png";// special
	}
	public void updateSize() {
		Texture b=null;
	try {
		b = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream(Sprite[this.getStatus().getSpriteID()]));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	this.Height=b.getImageHeight();
	this.Width=b.getImageWidth();
	b=null;
}
}
