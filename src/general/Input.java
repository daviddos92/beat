package general;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Input {


    public void start() {
        try {
	    Display.setDisplayMode(new DisplayMode(800, 600));
	    Display.create();
	} catch (LWJGLException e) {
	    e.printStackTrace();
	    System.exit(0);
	}

	// init OpenGL here

        while (!Display.isCloseRequested()) {

	    // render OpenGL here
			
	    pollInput();
	    Display.update();
	}

	Display.destroy();
    }

    public void pollInput() {
		
	
	while (Keyboard.next()) {
	    if (Keyboard.getEventKeyState()) {
	    	//PLayer 1
	        if (Keyboard.getEventKey() == Keyboard.KEY_W) {
		    System.out.println("W Key Pressed");			
	        }
	        if (Keyboard.getEventKey() == Keyboard.KEY_A) {
			System.out.println("A Key Pressed");
	        }
	        if (Keyboard.getEventKey() == Keyboard.KEY_S) {
		    System.out.println("S Key Pressed");
	        }
	        if (Keyboard.getEventKey() == Keyboard.KEY_D) {
		    System.out.println("D Key Pressed");
	        }
		    if (Keyboard.getEventKey() == Keyboard.KEY_C) {
			System.out.println("C Key Pressed");    
		    }
		    if (Keyboard.getEventKey() == Keyboard.KEY_V) {
			System.out.println("V Key Pressed");    
		    }
		    //PLayer2
		    if (Keyboard.getEventKey() == Keyboard.KEY_UP) {
			System.out.println("UP Key Pressed");			
		    }
		    if (Keyboard.getEventKey() == Keyboard.KEY_LEFT) {
		    System.out.println("LEFT Key Pressed");
		    }
		    if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT) {
			System.out.println("RIGHT Key Pressed");
		    }
		    if (Keyboard.getEventKey() == Keyboard.KEY_DOWN) {
			System.out.println("DOWN Key Pressed");
		    } 
			if (Keyboard.getEventKey() == Keyboard.KEY_M) {
			System.out.println("M Key Pressed");    
			}
			if (Keyboard.getEventKey() == Keyboard.KEY_N) {
			System.out.println("N Key Pressed");    
			}
	    }
	    else {
	    	
	    	//P1ayer1
	        if (Keyboard.getEventKey() == Keyboard.KEY_W) {
		    System.out.println("W Key Released");
	        }
		    if (Keyboard.getEventKey() == Keyboard.KEY_A) {
			System.out.println("A Key Released");
		    }	       
	    	if (Keyboard.getEventKey() == Keyboard.KEY_S) {
		    System.out.println("S Key Released");
	    	}
	    	if (Keyboard.getEventKey() == Keyboard.KEY_D) {
		    System.out.println("D Key Released");
	    	}  
		    if (Keyboard.getEventKey() == Keyboard.KEY_C) {
			System.out.println("C Key Released");   
		    }
		    if (Keyboard.getEventKey() == Keyboard.KEY_V) {
			System.out.println("V Key Released");   
		    }
		    //PLayer2
		    if (Keyboard.getEventKey() == Keyboard.KEY_UP) {
		    System.out.println("UP Key Realeased");
		    }
			if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT) {
			System.out.println("RIGHT Key Released");
			}
			if (Keyboard.getEventKey() == Keyboard.KEY_LEFT) {
			System.out.println("LEFT Key Released");
			}
			if (Keyboard.getEventKey() == Keyboard.KEY_DOWN) {
			System.out.println("DOWN Key Released");
		    }
			if (Keyboard.getEventKey() == Keyboard.KEY_M) {
			System.out.println("M Key Released");
			}
			if (Keyboard.getEventKey() == Keyboard.KEY_N) {
			System.out.println("N Key Released");
			}    
	    }
	}
}
    
    

    public static void main(String[] argv) {
    Input inputExample = new Input();
	inputExample.start();
    }
}