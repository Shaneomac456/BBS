package MyCity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import org.apache.commons.codec.binary.Hex;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CreateAccount {
	static String username = "";
	static String password = "";
	//static JTextField conPassField = new JTextField();
	JTextField fNameField, mNameField, lNameField, addressField, emailField, usernameField, securityAField;
	JPasswordField conPassField, conPassField2;
	JComboBox questionList;
	static AccountInfoDB db;

	public static void main(String[] args) {
		//System.out.println("hello world");
		 run();
		// encrypt();
	}

	public static void run() {

		// JFrame for create account screen
		JFrame createAcc = new JFrame("Create New Account");
		createAcc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createAcc.setLayout(null);
		createAcc.setExtendedState(JFrame.MAXIMIZED_BOTH);
		createAcc.getContentPane().setBackground(new Color(13, 229, 175));

		// title for create account screen
		JLabel createAccTitle = new JLabel("Create New Account");
		createAccTitle.setBounds(550, 5, 900, 100);
		createAccTitle.setFont(new Font("Verdana", Font.BOLD, 72));
		createAcc.add(createAccTitle);

		// font for all JLabels for create account screen
		Font accFont = new Font("Verdana", Font.PLAIN, 28);

		// first name JLabel
		JLabel FirstName = new JLabel("First Name:");
		FirstName.setFont(accFont);
		FirstName.setBounds(600, 150, 200, 30);
		createAcc.add(FirstName);

		// text box for first name
		JTextField fNameField = new JTextField();
		fNameField.setBounds(600, 190, 275, 30);
		fNameField.setBackground(Color.WHITE);
		fNameField.setVisible(true);
		createAcc.add(fNameField);

		// middle name JLabel
		JLabel middleName = new JLabel("Middle Name:");
		middleName.setFont(accFont);
		middleName.setBounds(600, 225, 200, 30);
		createAcc.add(middleName);

		// text box for middle name
		JTextField mNameField = new JTextField();
		mNameField.setBounds(600, 265, 275, 30);
		mNameField.setBackground(Color.WHITE);
		mNameField.setVisible(true);
		createAcc.add(mNameField);

		// last name JLabel
		JLabel LastName = new JLabel("Last Name:");
		LastName.setFont(accFont);
		LastName.setBounds(600, 300, 200, 30);
		createAcc.add(LastName);

		// text box for last name
		JTextField lNameField = new JTextField();
		lNameField.setBounds(600, 340, 275, 30);
		lNameField.setBackground(Color.WHITE);
		lNameField.setVisible(true);
		createAcc.add(lNameField);

		// address JLabel
		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setFont(accFont);
		addressLabel.setBounds(600, 375, 200, 30);
		createAcc.add(addressLabel);

		// text box for address
		JTextField addressField = new JTextField();
		addressField.setBounds(600, 415, 275, 30);
		addressField.setBackground(Color.WHITE);
		addressField.setVisible(true);
		createAcc.add(addressField);

		// email JLabel
		JLabel emailLabel = new JLabel("Email Address:");
		emailLabel.setFont(accFont);
		emailLabel.setBounds(600, 450, 250, 30);
		createAcc.add(emailLabel);

		// text box for email
		JTextField emailField = new JTextField();
		emailField.setBounds(600, 490, 275, 30);
		emailField.setBackground(Color.WHITE);
		emailField.setVisible(true);
		createAcc.add(emailField);

		// username JLabel
		JLabel usernameLabel = new JLabel("Create Username:");
		usernameLabel.setFont(accFont);
		usernameLabel.setBounds(1050, 150, 300, 30);
		createAcc.add(usernameLabel);

		// text box for username
		JTextField usernameField = new JTextField();
		usernameField.setBounds(1050, 190, 275, 30);
		usernameField.setBackground(Color.WHITE);
		usernameField.setVisible(true);
		createAcc.add(usernameField);

		// create password JLabel
		JLabel createPassLabel = new JLabel("Create Password:");
		createPassLabel.setFont(accFont);
		createPassLabel.setBounds(1050, 225, 300, 30);
		createAcc.add(createPassLabel);

		// create password text box
		JPasswordField conPassField = new JPasswordField();
		conPassField.setBounds(1050, 265, 275, 30);
		conPassField.setBackground(Color.WHITE);
		conPassField.setVisible(true);
		createAcc.add(conPassField);

		// confirm password JLabel
		JLabel confirmPassLabel = new JLabel("Confirm Password:");
		confirmPassLabel.setFont(accFont);
		confirmPassLabel.setBounds(1050, 300, 300, 30);
		createAcc.add(confirmPassLabel);

		// confirm password text box
		JPasswordField conPassField2 = new JPasswordField();
		conPassField2.setBounds(1050, 340, 275, 30);
		conPassField2.setBackground(Color.WHITE);
		conPassField2.setVisible(true);
		createAcc.add(conPassField2);

		// security question JLabel
		JLabel securityQLabel = new JLabel("Security Question:");
		securityQLabel.setFont(accFont);
		securityQLabel.setBounds(1050, 375, 300, 30);
		createAcc.add(securityQLabel);

		// security question drop down combo-box
		String[] questions = { "What is your pet's name?", "What is the name of your hometown?",
				"What is your favorite sport?", "What is your mother's maiden name?", "What is your favorite beverage?",
				"What is your favorite movie?" };
		JComboBox questionList = new JComboBox(questions);
		questionList.setBounds(1050, 415, 275, 30);
		questionList.setSelectedIndex(0);
		questionList.setBackground(Color.WHITE);
		createAcc.add(questionList);

		// security answer JLabel
		JLabel securityALabel = new JLabel("Security Answer:");
		securityALabel.setFont(accFont);
		securityALabel.setBounds(1050, 450, 300, 30);
		createAcc.add(securityALabel);

		// security answer text box
		JTextField securityAField = new JTextField();
		securityAField.setBounds(1050, 490, 275, 30);
		securityAField.setBackground(Color.WHITE);
		securityAField.setVisible(true);
		createAcc.add(securityAField);

		//button to cancel account
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setFont(new Font("Verdana", Font.BOLD, 40));
		cancelButton.setBackground(new Color(182,239,225));
		cancelButton.setBounds(1100, 700, 200, 75);
		cancelButton.setBorderPainted(false);
		createAcc.add(cancelButton);
		
		// button to create account
		JButton createAccButton = new JButton("Create Account");
		createAccButton.setFont(new Font("Verdana", Font.BOLD, 40));
		createAccButton.setBackground(new Color(182, 239, 225));
		createAccButton.setBounds(600, 700, 400, 75);
		createAccButton.setBorderPainted(false);
		createAcc.add(createAccButton);
		
		// jdbc object
		try {
			db = new AccountInfoDB();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		createAcc.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Create Account")) {
			boolean access = true;
			if (fNameField.getText() == null) {
				JOptionPane.showMessageDialog(null, "Please enter information for all of the boxes.");
				access = false;
			}
			else if (mNameField.getText() == null) {
				JOptionPane.showMessageDialog(null, "Please enter information for all of the boxes.");
				access = false;
			}
			else if (lNameField.getText() == null) {
				JOptionPane.showMessageDialog(null, "Please enter information for all of the boxes.");
				access = false;
			}
			else if (addressField.getText() == null) {
				JOptionPane.showMessageDialog(null, "Please enter information for all of the boxes.");
				access = false;
			}
			else if (emailField.getText() == null) {
				JOptionPane.showMessageDialog(null, "Please enter information for all of the boxes.");
				access = false;
			}
			else if (usernameField.getText() == null) {
				JOptionPane.showMessageDialog(null, "Please enter information for all of the boxes.");
				access = false;
			}
			else if (conPassField.getPassword() == null) {
				JOptionPane.showMessageDialog(null, "Please enter information for all of the boxes.");
				access = false;
			}
			else if (conPassField2.getPassword() == null) {
				JOptionPane.showMessageDialog(null, "Please enter information for all of the boxes.");
				access = false;
			}
			
			if (access) {
				char[] pass = conPassField.getPassword();
				
				for (int i = 0; i < pass.length; i++) {
					password += pass[i];
				}
				encrypt();
				updateTable();
			}
		}
	}
	
	public void updateTable() {
		try {
			db.createDBTable();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			db.insertRecord(fNameField.getText(), mNameField.getText(), lNameField.getText(), addressField.getText(), emailField.getText(), 
					usernameField.getText(), password, questionList.getSelectedItem().toString(), securityAField.getText());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void isTaken() {
		
	}
	public static void encrypt() {
		MessageDigest messageDigest;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.reset();
			messageDigest.update(password.getBytes(Charset.forName("UTF8")));
			byte[] resultByte = messageDigest.digest();
			String result = new String(Hex.encodeHex(resultByte));
			System.out.println(result);
		} catch (NoSuchAlgorithmException e) {
		}
	}
}
