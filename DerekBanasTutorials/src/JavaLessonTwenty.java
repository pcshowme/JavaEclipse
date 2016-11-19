//https://www.youtube.com/watch?v=3XB3in9Xqy8&list=PLfyq5A05w62_verkKr3DWKWbttvdgexH3

import java.awt.Dimension; //Heights and Widths
import java.awt.Toolkit; //Ask questions of OS (AWT - Abstract Window Toolkit)
import javax.swing.*; //Make the objects

public class JavaLessonTwenty extends JFrame{

	public static void main(String[] args) {
		// Begin form creation

		new JavaLessonTwenty(); // Make a call to constructor file
		
		
	}

	
	public JavaLessonTwenty(){ // Create NEW JavaLessonTwenty() object
		
		this.setSize(400,400);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width / 2) - (this.getWidth() / 2); // get dim to center frame
		int yPos = (dim.height / 2) - (this.getHeight() / 2); // get dim to center frame
		System.out.println("Scr W: "+dim.getWidth()+"this W: "+this.getWidth());
		
		this.setLocation(xPos, yPos);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Frame Title");
		
		JPanel thePanel = new JPanel();
		JLabel label1 = new JLabel("Tell me something");
		
		label1.setText("New Text");
		label1.setToolTipText("Doesn't do much");
		
		thePanel.add(label1);
		
		JButton button1 = new JButton("Send");
		button1.setText("New Button");
		button1.setToolTipText("It's a button!");
		thePanel.add(button1);
		
		JTextField textField1 = new JTextField("Type here", 15);
		textField1.setToolTipText("It's a text field!");
		thePanel.add(textField1);
		
		JTextArea textArea1 = new JTextArea(15,20);
		textArea1.setText("Just a whole bunch of text that is really important");
		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		thePanel.add(scrollbar1);
		
		
		
		
		this.add(thePanel);
		
		this.setVisible(true);
		
		textField1.requestFocus();
	}
	
}
