package MyCity;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class HomeScreen {
	public static void main(String [] args) {
		run();
	}
	public static void run() {
		
		//Creating and Formatting JFrame for forgot password screen
		JFrame home = new JFrame("Home Page");
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		home.setLayout(null);
		home.setExtendedState(JFrame.MAXIMIZED_BOTH);
		home.getContentPane().setBackground(new Color(13,229,175));
		
		//title for home page
		JLabel homeTitle = new JLabel("Home");
		homeTitle.setBounds(850, 5, 900, 75);
		homeTitle.setFont(new Font("Verdana", Font.BOLD, 72));
		home.add(homeTitle);
		
		//logout button
		JButton LogoutButton = new JButton ("Logout");
		LogoutButton.setFont(new Font("Verdana", Font.BOLD, 30));
		LogoutButton.setBackground(new Color(182,239,225));
		LogoutButton.setBounds(1550, 90, 175, 50);
		LogoutButton.setBorderPainted(false);
		home.add(LogoutButton);
		
		//action listener to go to back to login screen
		LogoutButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				Component parent = null;
				int option = JOptionPane.showConfirmDialog(parent, "Are you sure you want to logout?", "Are you sure?",  JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE);
				if(option == 0) {
					home.setVisible(false);
					Login.run();
				}
			}
		});
		
		//manage account button
		JButton manageAccButton = new JButton ("Manage Account");
		manageAccButton.setFont(new Font("Verdana", Font.BOLD, 30));
		manageAccButton.setBackground(new Color(182,239,225));
		manageAccButton.setBounds(1470, 150, 350, 50);
		manageAccButton.setBorderPainted(false);
		home.add(manageAccButton);
		
		//action listener to manage account
		manageAccButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				
			home.setVisible(false);
			
			//new j-frame to update account
			JFrame updateAcc = new JFrame("Update");
			updateAcc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			updateAcc.setLayout(null);
			updateAcc.setExtendedState(JFrame.MAXIMIZED_BOTH);
			updateAcc.getContentPane().setBackground(new Color(13,229,175));
			
			//title for manage account screen
			JLabel manAccTitle = new JLabel ("Manage Your Account");
			manAccTitle.setBounds(550, 5, 900, 100);
			manAccTitle.setFont(new Font("Verdana", Font.BOLD, 72));
			updateAcc.add(manAccTitle);
			
			//font for all JLabels for create account screen
			Font accFont = new Font("Verdana", Font.PLAIN, 28);
			
			//first name JLabel
			JLabel FirstName = new JLabel("First Name:");
			FirstName.setFont(accFont);
			FirstName.setBounds(600, 150, 200, 30);
			updateAcc.add(FirstName);
			
			//text box for first name
			JTextField fNameField = new JTextField();
			fNameField.setBounds(600, 190, 275, 30);
			fNameField.setBackground(Color.WHITE);
			fNameField.setVisible(true);
			updateAcc.add(fNameField);
			
			//middle name JLabel
			JLabel middleName = new JLabel("Middle Name:");
			middleName.setFont(accFont);
			middleName.setBounds(600, 225, 200, 30);
			updateAcc.add(middleName);
			
			//text box for middle name
			JTextField mNameField = new JTextField();
			mNameField.setBounds(600, 265, 275, 30);
			mNameField.setBackground(Color.WHITE);
			mNameField.setVisible(true);
			updateAcc.add(mNameField);
			
			//last name JLabel
			JLabel LastName = new JLabel("Last Name:");
			LastName.setFont(accFont);
			LastName.setBounds(600, 300, 200, 30);
			updateAcc.add(LastName);
					
			//text box for last name
			JTextField lNameField = new JTextField();
			lNameField.setBounds(600, 340, 275, 30);
			lNameField.setBackground(Color.WHITE);
			lNameField.setVisible(true);
			updateAcc.add(lNameField);
		
			//address JLabel
			JLabel addressLabel = new JLabel("Address:");
			addressLabel.setFont(accFont);
			addressLabel.setBounds(600, 375, 200, 30);
			updateAcc.add(addressLabel);
			
			//text box for address
			JTextField addressField = new JTextField();
			addressField.setBounds(600, 415, 275, 30);
			addressField.setBackground(Color.WHITE);
			addressField.setVisible(true);
			updateAcc.add(addressField);
			
			//email JLabel
			JLabel emailLabel = new JLabel("Email Address:");
			emailLabel.setFont(accFont);
			emailLabel.setBounds(600, 450, 250, 30);
			updateAcc.add(emailLabel);
			
			//text box for email
			JTextField emailField = new JTextField();
			emailField.setBounds(600, 490, 275, 30);
			emailField.setBackground(Color.WHITE);
			emailField.setVisible(true);
			updateAcc.add(emailField);
			
			//username JLabel
			JLabel usernameLabel = new JLabel("Create Username:");
			usernameLabel.setFont(accFont);
			usernameLabel.setBounds(1050, 150, 300, 30);
			updateAcc.add(usernameLabel);
			
			//text box for username
			JTextField usernameField = new JTextField();
			usernameField.setBounds(1050, 190, 275, 30);
			usernameField.setBackground(Color.WHITE);
			usernameField.setVisible(true);
			updateAcc.add(usernameField);
			
			//create password JLabel
			JLabel createPassLabel = new JLabel("Create Password:");
			createPassLabel.setFont(accFont);
			createPassLabel.setBounds(1050, 225, 300, 30);
			updateAcc.add(createPassLabel);
			
			//create password text box
			JPasswordField conPassField = new JPasswordField();
			conPassField.setBounds(1050, 265, 275, 30);
			conPassField.setBackground(Color.WHITE);
			conPassField.setVisible(true);
			updateAcc.add(conPassField);
			
			//confirm password JLabel
			JLabel confirmPassLabel = new JLabel("Confirm Password:");
			confirmPassLabel.setFont(accFont);
			confirmPassLabel.setBounds(1050, 300, 300, 30);
			updateAcc.add(confirmPassLabel);
			
			//confirm password text box
			JPasswordField conPassField2 = new JPasswordField();
			conPassField2.setBounds(1050, 340, 275, 30);
			conPassField2.setBackground(Color.WHITE);
			conPassField2.setVisible(true);
			updateAcc.add(conPassField2);
			
			//security question JLabel
			JLabel securityQLabel = new JLabel("Security Question:");
			securityQLabel.setFont(accFont);
			securityQLabel.setBounds(1050, 375, 300, 30);
			updateAcc.add(securityQLabel);
			
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
			updateAcc.add(questionList);
			
			//security answer JLabel
			JLabel securityALabel = new JLabel("Security Answer:");
			securityALabel.setFont(accFont);
			securityALabel.setBounds(1050, 450, 300, 30);
			updateAcc.add(securityALabel);
			
			//security answer text box
			JTextField securityAField = new JTextField();
			securityAField.setBounds(1050, 490, 275, 30);
			securityAField.setBackground(Color.WHITE);
			securityAField.setVisible(true);
			updateAcc.add(securityAField);
			
			//save and exit button
			JButton saveAndExit = new JButton("Save and Exit");
			saveAndExit.setFont(new Font("Verdana", Font.BOLD, 40));
			saveAndExit.setBackground(new Color(182,239,225));
			saveAndExit.setBounds(675, 700, 550, 75);
			saveAndExit.setBorderPainted(false);
			updateAcc.add(saveAndExit);
			
			//action listener save and exit button
			saveAndExit.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					updateAcc.setVisible(false);
					home.setVisible(true);
				}
			});
			
			updateAcc.setVisible(true);
			}
		});
	
		//start questionnaire button
		JButton startQButton = new JButton ("Start Questionnaire");
		startQButton.setFont(new Font("Verdana", Font.BOLD, 40));
		startQButton.setBackground(new Color(182,239,225));
		startQButton.setBounds(700, 150, 550, 75);
		startQButton.setBorderPainted(false);
		home.add(startQButton);
		
		//action listener to go to back to questionnaire screen
		startQButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				home.setVisible(false);
				Questionnaire.run();
			}
		});
		
		//Map Picture
		JLabel pic = new JLabel(new ImageIcon ("Map2Resize.png"));
		pic.setBounds(500, 275, 992, 715);
		home.add(pic);
		
		
		home.setVisible(true);
	}
}
