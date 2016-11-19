/* HAL -- Developed to guard computer while away and automate needed functions.
 * HAL -- Heuristically-programmed Algorithmic Computer 
 * 
 * Created by: Jim Bodden on: 10/13/2016
 * Modified by: Jim Bodden on: 10/14/2016
 * 
 * HAL Version 2.3
 */

import java.awt.*;
import javax.swing.JFrame;

public class Hal{

	public static void main(String[] args) throws Exception{
		
		Viewer mouser = new Viewer();
		mouser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    	Robot hal = new Robot();
    	int x; int y;
    	while(true){
    		for(int minutes=0;minutes<5;minutes++){hal.delay(1000 * 60);}
    		Point mPos = MouseInfo.getPointerInfo().getLocation();
    		//System.out.println(mPos);
    		x = mPos.x; y = mPos.y;
    		x = x+1; y=y+1;
    		hal.mouseMove(x,y);
    		x = x-1; y=y-1;
    		hal.mouseMove(x,y);
    	}
    }
}
