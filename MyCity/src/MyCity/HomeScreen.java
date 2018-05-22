package MyCity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
		homeTitle.setBounds(850, 50, 900, 100);
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
				home.setVisible(false);
				Login.run();
			}
		});
		
		//start questionnaire button
		JButton startQButton = new JButton ("Start Questionnaire");
		startQButton.setFont(new Font("Verdana", Font.BOLD, 40));
		startQButton.setBackground(new Color(182,239,225));
		startQButton.setBounds(700, 200, 550, 75);
		startQButton.setBorderPainted(false);
		home.add(startQButton);
		
		
		home.setVisible(true);
	}
}
