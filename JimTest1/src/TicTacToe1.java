import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;

// https://www.youtube.com/watch?v=Db3cC5iPrOM

public class TicTacToe1 extends JFrame{
	JPanel p=new JPanel();
	XOButton buttons[]=new XOButton[9];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new TicTacToe1();
	}

	public TicTacToe1(){
		super("TicTacToe");
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		p.setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++){
			buttons[i]=new XOButton();
			add(buttons[i]);
		}
		add(p);	
	}
}
