package MyCity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

public class CreateAccount {
	static String username = "";
	static String password = "";
	static  JFormattedTextField conPassField = new JFormattedTextField();

	public static void main(String[]args) {
		run();
		//encrypt();
	}
	
	public static void run() {
		
		//JFrame for create account screen
		JFrame createAcc = new JFrame("Create New Account");
		createAcc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createAcc.setLayout(null);
		createAcc.setExtendedState(JFrame.MAXIMIZED_BOTH);
		createAcc.getContentPane().setBackground(new Color(13,229,175));
		
		//title for create account screen
		JLabel createAccTitle = new JLabel ("Create New Account");
		createAccTitle.setBounds(550, 5, 900, 100);
		createAccTitle.setFont(new Font("Verdana", Font.BOLD, 72));
		createAcc.add(createAccTitle);
		
		//font for all JLabels for create account screen
		Font accFont = new Font("Verdana", Font.PLAIN, 28);
		
		//first name JLabel
		JLabel FirstName = new JLabel("First Name:");
		FirstName.setFont(accFont);
		FirstName.setBounds(600, 150, 200, 30);
		createAcc.add(FirstName);
		
		//text box for first name
		try {
			JFormattedTextField fNameField = new JFormattedTextField(new MaskFormatter("********************"));
			fNameField.setBounds(600, 190, 275, 30);
			fNameField.setBackground(Color.WHITE);
			fNameField.setVisible(true);
			createAcc.add(fNameField);
		}
		catch(Exception ex) {
			System.out.println("k");
		}
		
		//middle name JLabel
		JLabel middleName = new JLabel("Middle Name:");
		middleName.setFont(accFont);
		middleName.setBounds(600, 225, 200, 30);
		createAcc.add(middleName);
		
		//text box for middle name
		try {
			JFormattedTextField mNameField = new JFormattedTextField(new MaskFormatter("********************"));
			mNameField.setBounds(600, 265, 275, 30);
			mNameField.setBackground(Color.WHITE);
			mNameField.setVisible(true);
			createAcc.add(mNameField);
		}
		catch(Exception ex) {
			System.out.println("k");
		}
		
		//last name JLabel
		JLabel LastName = new JLabel("Last Name:");
		LastName.setFont(accFont);
		LastName.setBounds(600, 300, 200, 30);
		createAcc.add(LastName);
				
		//text box for last name
		try {
			JFormattedTextField lNameField = new JFormattedTextField(new MaskFormatter("******************************"));
			lNameField.setBounds(600, 340, 275, 30);
			lNameField.setBackground(Color.WHITE);
			lNameField.setVisible(true);
			createAcc.add(lNameField);
		}
		catch(Exception ex) {
			System.out.println("k");
		}
		
		//address JLabel
		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setFont(accFont);
		addressLabel.setBounds(600, 375, 200, 30);
		createAcc.add(addressLabel);
		
		//text box for address
		try {
			JFormattedTextField addressField = new JFormattedTextField(new MaskFormatter("********************************************************************"));
			addressField.setBounds(600, 415, 275, 30);
			addressField.setBackground(Color.WHITE);
			addressField.setVisible(true);
			createAcc.add(addressField);
		}
		catch(Exception ex) {
			System.out.println("k");
		}
		
		//email JLabel
		JLabel emailLabel = new JLabel("Email Address:");
		emailLabel.setFont(accFont);
		emailLabel.setBounds(600, 450, 250, 30);
		createAcc.add(emailLabel);
		
		//text box for email
		try {
			JFormattedTextField addressField = new JFormattedTextField(new MaskFormatter("*********************************************************"));
			addressField.setBounds(600, 490, 275, 30);
			addressField.setBackground(Color.WHITE);
			addressField.setVisible(true);
			createAcc.add(addressField);
		}
		catch(Exception ex) {
			System.out.println("k");
		}
		
		//username JLabel
		JLabel usernameLabel = new JLabel("Create Username:");
		usernameLabel.setFont(accFont);
		usernameLabel.setBounds(1050, 150, 300, 30);
		createAcc.add(usernameLabel);
		
		//text box for username
		try {
			JFormattedTextField usernameField = new JFormattedTextField(new MaskFormatter("******************************"));
			usernameField.setBounds(1050, 190, 275, 30);
			usernameField.setBackground(Color.WHITE);
			usernameField.setVisible(true);
			createAcc.add(usernameField);
		}
		catch(Exception ex) {
			System.out.println("k");
		}
		
		//create password JLabel
		JLabel createPassLabel = new JLabel("Create Password:");
		createPassLabel.setFont(accFont);
		createPassLabel.setBounds(1050, 225, 300, 30);
		createAcc.add(createPassLabel);
		
		//create password text box
		try {
			conPassField.setBounds(1050, 265, 275, 30);
			conPassField.setBackground(Color.WHITE);
			conPassField.setVisible(true);
			createAcc.add(conPassField);
		}
		catch(Exception ex) {
			System.out.println("k");
		}
		
		//confirm password JLabel
		JLabel confirmPassLabel = new JLabel("Confirm Password:");
		confirmPassLabel.setFont(accFont);
		confirmPassLabel.setBounds(1050, 300, 300, 30);
		createAcc.add(confirmPassLabel);
		
		//confirm password text box
		try {
			JFormattedTextField conPassField2 = new JFormattedTextField(new MaskFormatter("******************************"));
			conPassField2.setBounds(1050, 340, 275, 30);
			conPassField2.setBackground(Color.WHITE);
			conPassField2.setVisible(true);
			createAcc.add(conPassField2);
		}
		catch(Exception ex) {
			System.out.println("k");
		}
		
		//security question JLabel
		JLabel securityQLabel = new JLabel("Security Question:");
		securityQLabel.setFont(accFont);
		securityQLabel.setBounds(1050, 375, 300, 30);
		createAcc.add(securityQLabel);
		
		//security question drop down combo-box
		String[] questions = {"What is your pet's name?", 
				"What is the name of your hometown?", 
				"What is your favorite sport?", 
				"What is your mother's maiden name?", 
				"What is your favorite beverage?", 
				"What is your favorite movie?" };
		JComboBox questionList = new JComboBox(questions);
		questionList.setBounds(1050, 415, 275, 30);
		questionList.setSelectedIndex(0);
		questionList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionList.setSelectedIndex(questionList.getSelectedIndex());
			}
		});
		questionList.setBackground(Color.WHITE);
		createAcc.add(questionList);
		
		//security answer JLabel
		JLabel securityALabel = new JLabel("Security Answer:");
		securityALabel.setFont(accFont);
		securityALabel.setBounds(1050, 450, 300, 30);
		createAcc.add(securityALabel);
		
		//security answer text box
		try {
			JFormattedTextField securityAField = new JFormattedTextField(new MaskFormatter("******************************"));
			securityAField.setBounds(1050, 490, 275, 30);
			securityAField.setBackground(Color.WHITE);
			securityAField.setVisible(true);
			createAcc.add(securityAField);
		}
		catch(Exception ex) {
			System.out.println("k");
		}
		
		//button to create account
		JButton createAccButton = new JButton("Create Account");
		createAccButton.setFont(new Font("Verdana", Font.BOLD, 40));
		createAccButton.setBackground(new Color(182,239,225));
		createAccButton.setBounds(850, 700, 400, 75);
		createAccButton.setBorderPainted(false);
		createAccButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			password = conPassField.getText();
			encrypt();
			}
		});
		createAcc.add(createAccButton);
		
		
		createAcc.setVisible(true);
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



