import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jim20160929a {

	public JFrame frame;
	public JTextField firstName;
	public JTextField lastName;
	public JTextField city;
	public JTextField state;
	public final ButtonGroup buttonGroup_1 = new ButtonGroup();
	String fName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jim20160929a window = new Jim20160929a();
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
	public Jim20160929a() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 529, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInfogrinder = new JLabel("InfoGrinder");
		lblInfogrinder.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInfogrinder.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfogrinder.setBounds(0, 5, 511, 16);
		frame.getContentPane().add(lblInfogrinder);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(283, 256, 97, 25);
		frame.getContentPane().add(btnCancel);
		
		firstName = new JTextField();
		firstName.setBounds(102, 34, 191, 22);
		frame.getContentPane().add(firstName);
		firstName.setColumns(10); fName = firstName.getText();
		
		JLabel lblName = new JLabel("First Name:");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(10, 34, 80, 16);
		frame.getContentPane().add(lblName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge.setBounds(34, 109, 56, 16);
		frame.getContentPane().add(lblAge);
		
		lastName = new JTextField();
		lastName.setBounds(102, 69, 191, 22);
		frame.getContentPane().add(lastName);
		lastName.setColumns(10); String lName = lastName.getText();
		
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGender.setBounds(34, 141, 56, 16);
		frame.getContentPane().add(lblGender);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(102, 171, 191, 22);
		frame.getContentPane().add(city); String yourCity = city.getText();
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setBounds(34, 174, 56, 16);
		frame.getContentPane().add(lblCity);
		
		state = new JTextField();
		state.setColumns(10);
		state.setBounds(102, 206, 191, 22);
		frame.getContentPane().add(state); String yourState = state.getText();
		
		JSpinner age = new JSpinner();
		age.setBounds(102, 106, 56, 22);
		frame.getContentPane().add(age);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup_1.add(rdbtnFemale);
		rdbtnFemale.setBounds(102, 137, 78, 25);
		frame.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup_1.add(rdbtnMale);
		rdbtnMale.setBounds(184, 137, 127, 25);
		frame.getContentPane().add(rdbtnMale);
		
		JLabel lblState = new JLabel("State:");
		lblState.setHorizontalAlignment(SwingConstants.RIGHT);
		lblState.setBounds(34, 209, 56, 16);
		frame.getContentPane().add(lblState);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(10, 72, 77, 16);
		frame.getContentPane().add(lblLastName);
		
		JTextPane txtpnThisIsThe = new JTextPane();
		txtpnThisIsThe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtpnThisIsThe.setForeground(Color.BLUE);
		// txtpnThisIsThe.setText("Your name is "+fName+" "+lName+" and you are from "+yourCity+", "+yourState+" and you love Purple Puppies!!!");
		txtpnThisIsThe.setBounds(319, 34, 165, 194);
		frame.getContentPane().add(txtpnThisIsThe);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				txtpnThisIsThe.setText("Your name is "+fName+" "+lName+" and you are from "+yourCity+", "+yourState+" and you love Purple Puppies!!!");
			}
		});
		btnSubmit.setBounds(388, 256, 97, 25);
		frame.getContentPane().add(btnSubmit);
		

		
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(106, 256, 146, 14);
		frame.getContentPane().add(progressBar);
		
	}
}
