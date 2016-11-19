/* HAL -- Developed to guard computer while away and automate needed functions.
 * HAL -- Heuristically-programmed Algorithmic Computer 
 * 
 * Created by: Jim Bodden on: 10/13/2016
 * Modified by: Jim Bodden on: 10/13/2016
 * 
 * HAL Version 2.1
 */

import java.awt.*;
import java.util.*;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Hal{

	public static void main(String[] args) throws Exception{
		

		Viewer mouser = new Viewer();
		mouser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	Robot hal = new Robot();
    	Random random = new Random();
    	while(true){
    		for(int minutes=0;minutes<15;minutes++){hal.delay(1000 * 60);}
    		int x = random.nextInt() % 640;
    		int y = random.nextInt() % 480;
    		hal.mouseMove(x,y);
    	}
    }
}



// Used to be Viewer.java file

class Viewer extends JFrame{
	
	public Viewer(){
		
		super("HAL");
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		JFrame frame = new JFrame ("HAL");
		frame.setSize(400,100);
		int xPos = (dim.width - 250) - (frame.getWidth() / 2);
		int yPos = (dim.height -150) - (frame.getHeight() / 2);
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

