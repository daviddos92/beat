package general;

import java.awt.GridLayout;
import java.awt.PopupMenu;

public class Menu{
	
	public Menu(){
		Window fMenu = new Window("Men�");
		fMenu.setLayout(new GridLayout(3,1));
		PopupMenu test = null;
		fMenu.add(test);
	}
}
