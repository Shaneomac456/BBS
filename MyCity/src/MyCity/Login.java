package MyCity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Login {
	public static void main(String[]args) {
		
		run();
	}
	public static void run() {
		//JFrame for the login screen
		JFrame loginScreen = new JFrame("Welcome to MyCity");
		loginScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginScreen.setLayout(null);
		
		//sets the size of the JFrame to the size of the screen
		loginScreen.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//JFrame background color
		loginScreen.getContentPane().setBackground(new Color(13,229,175));
		
		//Login title
		JLabel loginTitle = new JLabel("Welcome to MyCity");
		loginTitle.setBounds(575, 5, 900, 100);
		loginTitle.setFont(new Font("Verdana", Font.BOLD, 72));
		loginScreen.add(loginTitle);
		
		//Username JLabel 
		JLabel username = new JLabel("Username:");
		username.setBounds(625, 150, 200, 100);
		username.setFont(new Font("Verdana", Font.PLAIN, 32));
		loginScreen.add(username);
		
		//Username text box
		JTextField usernameField = new JTextField();
		usernameField.setBounds(800, 175, 400, 50);
		usernameField.setBackground(Color.WHITE);
		usernameField.setVisible(true);
		loginScreen.add(usernameField);
	
		//Password JLabel
		JLabel password = new JLabel("Password:");
		password.setBounds(625, 300, 200, 100);
		password.setFont(new Font("Verdana", Font.PLAIN, 32));
		loginScreen.add(password);
		
		//Password test box
		JPasswordField passwordField =  new JPasswordField();
		passwordField.setBounds(800, 325, 400, 50);
		passwordField.setBackground(Color.WHITE);
		passwordField.setVisible(true);
		loginScreen.add(passwordField);
		
		//forgot password button
		JButton forgotP = new JButton("<html><u>Forgot Password?</u><html>");
		forgotP.setFont(new Font("Verdana", Font.ITALIC, 20));
		forgotP.setForeground(Color.blue);
		forgotP.setBounds(875, 375, 250, 50);
		forgotP.setOpaque(false);
		forgotP.setContentAreaFilled(false);
		forgotP.setBorderPainted(false);
		loginScreen.add(forgotP);
	
		//action listener for forgotPassword button
		forgotP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ForgotPassword.run();
				loginScreen.dispose();
			}
		});
		
		//create account button
		JButton createAccount = new JButton("<html><u>Create Account</u><html>");
		createAccount.setFont(new Font("Verdana", Font.PLAIN, 20));
		createAccount.setBounds(850, 525, 200, 100);
		createAccount.setOpaque(false);
		createAccount.setContentAreaFilled(false);
		createAccount.setBorderPainted(false);
		loginScreen.add(createAccount);
		
		//action listener for create account button
		createAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateAccount.run();
				loginScreen.dispose();
			}
		});
		
		//login button
		JButton login = new JButton ("Login");
		login.setFont(new Font("Verdana", Font.BOLD, 40));
		login.setBackground(new Color(182,239,225));
		login.setBounds(850, 600, 200, 75);
		login.setBorderPainted(false);
		loginScreen.add(login);
		
		//action listener for login button
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen.run();
				loginScreen.dispose();
			}
		});
		
		//continue as a guest button
		JButton guest = new JButton("<html><u>Continue as Guest</u><html>");
		guest.setFont(new Font("Verdana", Font.PLAIN, 20));
		guest.setBounds(800, 650, 300, 100);
		guest.setOpaque(false);
		guest.setContentAreaFilled(false);
		guest.setBorderPainted(false);
		loginScreen.add(guest);
		
		//action listener for guest button
		guest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen.run();
				loginScreen.dispose();
			}
		});
		
		
		loginScreen.setVisible(true);
	}
}
