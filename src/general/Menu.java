package general;
import org.lwjgl.*;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.LWJGLException;

public class Menu{
	
	private static final String TEXPATH = "C:/Users/Lennart/Pictures/PlayKLEIN.png";
	private static final String TEXPATH2 = "C:/Users/Lennart/Pictures/OptionsKLEIN.png";
	private static final String TEXPATH3 = "C:/Users/Lennart/Pictures/CreditsKLEIN.png";
	private static final String TEXPATH4 = "C:/Users/Lennart/Pictures/ExitKLEIN.png";
	
	public void start() {
		try {
			Display.setDisplayMode(new DisplayMode(1280,720));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		// init OpenGL here
		Button play = new Button();
		play.addButton(550,200,TEXPATH);
		
		Button options = new Button();
		options.addButton(460,300,TEXPATH2);
		
		Button credits = new Button();
		credits.addButton(460,400,TEXPATH3);
		
		Button exit = new Button();
		exit.addButton(550, 500, TEXPATH4);		

		Button black = new Button();
		black.addButton(0, 0, "C:/Users/Lennart/Pictures/schwarz.png");
		
		
		while (!Display.isCloseRequested()) {
			
			// render OpenGL here
			black.Draw();		
			play.Draw();
			options.Draw();	
			credits.Draw();
			exit.Draw();
			
			
			if(play.isClicked){
				System.out.println("Play");
				ChoosePlayer next = new ChoosePlayer();
				if(!next.start()){
					break;
				}
			}
			
			if(options.isClicked){
				System.out.println("Options");
				Options next = new Options();
				next.start();
				break;
			}
			
			if(credits.isClicked){
				System.out.println("Credits");
				Credits next = new Credits();
				next.start();
				break;
			}
			if(exit.isClicked){
				break;
			}
			
			Display.update();
			Display.sync(60);
			
		}		
		Display.destroy();
	}
	
	public void mainmenu(){
		Menu displayExample = new Menu();
		displayExample.start();
	}
	
	public static void main(String[] argv) {
		Menu shit = new Menu();
		shit.mainmenu();
	}
}
