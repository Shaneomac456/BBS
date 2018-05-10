package MyCity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

public class ForgotPassword {
	public static void main(String[]args) {
		
		run();
	}
	
	public static void run() {
		
		//Creating and Formatting JFrame for forgot password screen
		JFrame forgotPassword = new JFrame("Forgot Password?");
		forgotPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		forgotPassword.setLayout(null);
		forgotPassword.setExtendedState(JFrame.MAXIMIZED_BOTH);
		forgotPassword.getContentPane().setBackground(new Color(13,229,175));
	
		//Forgot Password title
		JLabel forgotPTitle = new JLabel("Forgot Password");
		forgotPTitle.setBounds(600, 50, 900, 100);
		forgotPTitle.setFont(new Font("Verdana", Font.BOLD, 72));
		forgotPassword.add(forgotPTitle);
		
		//Username JLabel 
		JLabel username = new JLabel("Username:");
		username.setBounds(750, 250, 200, 100);
		username.setFont(new Font("Verdana", Font.PLAIN, 32));
		forgotPassword.add(username);
				
		//Username text box
		try {
			JFormattedTextField usernameField = new JFormattedTextField(new MaskFormatter("********************"));
			usernameField.setBounds(750, 350, 400, 50);
			usernameField.setBackground(Color.WHITE);
			usernameField.setVisible(true);
			forgotPassword.add(usernameField);
		}
		catch(Exception e) {
			System.out.println("k");
		}
		
		//Email JLabel 
		JLabel email = new JLabel("E-mail Address:");
		email.setBounds(750, 400, 300, 100);
		email.setFont(new Font("Verdana", Font.PLAIN, 32));
		forgotPassword.add(email);
						
		//Email text box
		try {
			JFormattedTextField emailField = new JFormattedTextField(new MaskFormatter("*****************************************"));
			emailField.setBounds(750, 500, 400, 50);
			emailField.setBackground(Color.WHITE);
			emailField.setVisible(true);
			forgotPassword.add(emailField);
		}
		catch(Exception e) {
			System.out.println("k");
		}
		
		//next button to continue to security questions
		JButton nextButton = new JButton ("Next");
		nextButton.setFont(new Font("Verdana", Font.BOLD, 40));
		nextButton.setBackground(new Color(182,239,225));
		nextButton.setBounds(850, 700, 200, 75);
		nextButton.setBorderPainted(false);
		forgotPassword.add(nextButton);
		
		forgotPassword.setVisible(true);
		
		//action listener to go to security question
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				forgotPassword.setVisible(false);
				forgotPassword.getContentPane().removeAll();
				
				//title for security question page
				JLabel securityQTitle = new JLabel("Security Question");
				securityQTitle.setBounds(590, 50, 900, 100);
				securityQTitle.setFont(new Font("Verdana", Font.BOLD, 72));
				forgotPassword.add(securityQTitle);
				
				//security question JLabel
				JLabel securityQ = new JLabel("Security Question:");
				securityQ.setBounds(800, 250, 400, 100);
				securityQ.setFont(new Font("Verdana", Font.PLAIN, 32));
				forgotPassword.add(securityQ);
						
				//security question drop down menu
				String[] questions = {"What is your pet's name?", 
						"What is the name of your hometown?", 
						"What is your favorite sport?", 
						"What is your mother's maiden name?", 
						"What is your favorite beverage?", 
						"What is your favorite movie?" };
				JComboBox questionList = new JComboBox(questions);
				questionList.setBounds(800, 350, 300, 50);
				questionList.setSelectedIndex(0);
				questionList.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						questionList.setSelectedIndex(questionList.getSelectedIndex());
					}
				});
				questionList.setBackground(Color.WHITE);
				forgotPassword.add(questionList);
				
				//security answer JLabel
				JLabel securityA = new JLabel("Security Answer:");
				securityA.setBounds(800, 400, 400, 100);
				securityA.setFont(new Font("Verdana", Font.PLAIN, 32));
				forgotPassword.add(securityA);
				
				//security answer textbox
				try {
					JFormattedTextField securityAField = new JFormattedTextField(new MaskFormatter("******************************************"));
					securityAField.setBounds(800, 500, 300, 50);
					securityAField.setBackground(Color.WHITE);
					securityAField.setVisible(true);
					forgotPassword.add(securityAField);
				}
				catch(Exception ex) {
					System.out.println("k");
				}
				
				
				//next button to move onto reset password
				JButton nextButton2 = new JButton ("Next");
				nextButton2.setFont(new Font("Verdana", Font.BOLD, 40));
				nextButton2.setBackground(new Color(182,239,225));
				nextButton2.setBounds(850, 700, 200, 75);
				nextButton2.setBorderPainted(false);
				forgotPassword.add(nextButton2);
				
				nextButton2.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						forgotPassword.setVisible(false);
						forgotPassword.getContentPane().removeAll();
						
						//reset password page title
						JLabel resetPassTitle = new JLabel("Reset Password");
						resetPassTitle.setBounds(650, 50, 900, 100);
						resetPassTitle.setFont(new Font("Verdana", Font.BOLD, 72));
						forgotPassword.add(resetPassTitle);
						
						//Create new password JLabel
						JLabel createNewP = new JLabel("Create New Password:");
						createNewP.setBounds(800, 250, 400, 50);
						createNewP.setFont(new Font("Verdana", Font.PLAIN, 32));
						forgotPassword.add(createNewP);
						
						//create new password textbox
						try {
							JFormattedTextField newPassField = new JFormattedTextField(new MaskFormatter("********************"));
							newPassField.setBounds(800, 350, 350, 50);
							newPassField.setBackground(Color.WHITE);
							newPassField.setVisible(true);
							forgotPassword.add(newPassField);
						}
						catch(Exception ex) {
							System.out.println("k");
						}
						
						//confirm password JLabel
						JLabel confirmNewP = new JLabel("Confirm New Password:");
						confirmNewP.setBounds(800, 450, 400, 50);
						confirmNewP.setFont(new Font("Verdana", Font.PLAIN, 32));
						forgotPassword.add(confirmNewP);
						
						//confirm password textbox
						try {
							JFormattedTextField confirmPassField = new JFormattedTextField(new MaskFormatter("********************"));
							confirmPassField.setBounds(800, 550, 350, 50);
							confirmPassField.setBackground(Color.WHITE);
							confirmPassField.setVisible(true);
							forgotPassword.add(confirmPassField);
						}
						catch(Exception ex) {
							System.out.println("k");
						}
						
						//reset password button which will return user to login screen
						JButton resetPass = new JButton("Reset Password");
						resetPass.setFont(new Font("Verdana", Font.BOLD, 40));
						resetPass.setBackground(new Color(182,239,225));
						resetPass.setBounds(775, 700, 400, 75);
						resetPass.setBorderPainted(false);
						forgotPassword.add(resetPass);
						
						//action listener for reset password button that returns user to login screen
						resetPass.addActionListener(new ActionListener() {
							public void actionPerformed (ActionEvent e) {
								forgotPassword.setVisible(false);
								Login.run();
							}
						});
						
						forgotPassword.setVisible(true);
					}
				});
			
				forgotPassword.setVisible(true);
			}

		});
		
	}
}
