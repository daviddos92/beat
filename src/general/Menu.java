package general;

import java.awt.GridLayout;
import java.awt.PopupMenu;

public class Menu{
	
	public Menu(){
		Window fMenu = new Window("Menü");
		fMenu.setLayout(new GridLayout(3,1));
		PopupMenu test = null;
		fMenu.add(test);
	}
}
