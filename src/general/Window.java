package general;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JFrame;

public class Window extends JFrame{

	public Window(String title){
		super(title);
		setBounds(100, 100, 500, 500);		
		setBackground(new Color(100, 100, 100));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		setFont(new Font("Arial", Font.PLAIN, 20));
		setLayout(new BorderLayout());
		setExtendedState(Frame.MAXIMIZED_BOTH);
	}
}
