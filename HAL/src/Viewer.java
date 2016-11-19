//Viewer.java file

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Viewer extends JFrame{
	
	public Viewer(){
		
		super("HAL");
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		JFrame frame = new JFrame ("HAL");
		frame.setSize(400,100);
		int xPos = (dim.width / 2) - (frame.getWidth() / 2);
		int yPos = (dim.height / 3) - (frame.getHeight() / 2);
		frame.setLocation(xPos, yPos);
		frame.getContentPane().setBackground(Color.RED);
		JLabel item1 = new JLabel("HAL Protection Activated", SwingConstants.CENTER);
		item1.setFont (item1.getFont().deriveFont(28.0f));
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.setVisible(true);
		
		frame.add(item1);
	
	}	
}
