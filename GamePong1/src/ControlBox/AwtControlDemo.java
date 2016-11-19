package ControlBox;
import java.awt.*;
import java.awt.event.*;


// AWT Checkbox demo

public class AwtControlDemo {

   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public AwtControlDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      AwtControlDemo  awtControlDemo = new AwtControlDemo();
      awtControlDemo.showCheckBoxDemo();
   }

   private void prepareGUI(){
      mainFrame = new Frame("Java AWT Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showCheckBoxDemo(){

      headerLabel.setText("Control in action: CheckBox"); 

      Checkbox chkApple = new Checkbox("Apple");
      Checkbox chkMango = new Checkbox("Mango");
      Checkbox chkPeer = new Checkbox("Peer");


      chkApple.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {             
            statusLabel.setText("Apple Checkbox: " 
            + (e.getStateChange()==1?"checked":"unchecked"));
         }
      });

      chkMango.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {
            statusLabel.setText("Mango Checkbox: " 
            + (e.getStateChange()==1?"checked":"unchecked"));
         }
      });

      chkPeer.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {
            statusLabel.setText("Peer Checkbox: " 
            + (e.getStateChange()==1?"checked":"unchecked"));
         }
      });

      controlPanel.add(chkApple);
      controlPanel.add(chkMango);
      controlPanel.add(chkPeer);       

      mainFrame.setVisible(true);  
   }
}