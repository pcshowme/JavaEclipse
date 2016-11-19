import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;

public class HelloWorldExe {

	private JFrame frame;
	private JTextField textField;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorldExe window = new HelloWorldExe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloWorldExe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 102, 204));
		frame.setBounds(100, 100, 396, 291);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Say Hi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("Hello World!!!");
			}
		});
		btnNewButton.setBounds(44, 152, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Say Bye");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("Goodbye Cruel World!!!");
			}
		});
		button.setBounds(231, 152, 97, 25);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setBounds(44, 45, 284, 73);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnClear.setBounds(138, 190, 97, 25);
		frame.getContentPane().add(btnClear);
		
		JLabel lblSaraJims = new JLabel("Sara & Jim's first executable Java app");
		lblSaraJims.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSaraJims.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaraJims.setBounds(44, 13, 284, 16);
		frame.getContentPane().add(lblSaraJims);
	}
}
