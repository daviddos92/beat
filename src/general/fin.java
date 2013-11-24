package general;

import org.lwjgl.opengl.Display;

public class fin {
		
	
	public static void draw(String name) {
		Button background = new Button();
		background.addButton(0, 0, "../gamejam/src/Textures/victory.png");
		
	     Character player1char=null;
	    
		if(name=="Lady Lara")  {
			 player1char=new Lady_Lara(new Status( new Position(500,218),0,true),"Lady Lara",1000,new Weapon());		
		}
		if(name=="Emma")			{
			player1char=new Emma(new Status( new Position(200,320),0,true),"Emma",1000,new Weapon());		
		}
		if(name=="Tom")			{
			 player1char=new Tom(new Status( new Position(200,320),0,true),"Tom",1000,new Weapon());		
		}
		if(name=="Sigmund")		{
			 player1char=new Sigmund(new Status( new Position(500,200),0,true),"Sigmund",1000,new Weapon());		
		}
		player1char.setSprites();
			
		Button player1charbutt=new Button();
			
		player1charbutt.addButton(player1char.getStatus().getPosition().getX(), player1char.getStatus().getPosition().getY(),player1char.getSprite()[0]);
		while(!Display.isCloseRequested()) {
			
			background.Draw();
			player1charbutt.Draw();
			
			Display.update();
			
		}
		Display.destroy();
	}
}
