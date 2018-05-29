package MyCity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Results {
//variables that will show up on results screen
static String city1;
static String city2;
static String city3;
static String city4;
static String city5;
static String city6;
static String city7;
static String city8;
static String city9;
static String city10;

//variables that will be used for map
static String city1S;
static String city2S;
static String city3S;
static String city4S;
static String city5S;
static String city6S;
static String city7S;
static String city8S;
static String city9S;
static String city10S;

	public static void main(String [] args) {
		run();
	}
	
	public static void run() {
		//JFrame for results screen
		JFrame results = new JFrame("Results");
		results.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		results.setLayout(null);
		results.setExtendedState(JFrame.MAXIMIZED_BOTH);
		results.getContentPane().setBackground(new Color(13,229,175));
		
		//title for results page
		JLabel resultTitle = new JLabel("Your Results");
		resultTitle.setBounds(750, 50, 900, 100);
		resultTitle.setFont(new Font("Verdana", Font.BOLD, 72));
		results.add(resultTitle);
		
		//font for top ten
		Font topFont = new Font("Verdana", Font.PLAIN, 30);
		
		//JLabel to list results
		JLabel YourTopTen = new JLabel("Top ten cities for you: ");
		YourTopTen.setFont(topFont);
		YourTopTen.setBounds(825, 150, 400, 75);
		results.add(YourTopTen);
		
		//JLabel for first pick
		city1 = "Houston, Texas";
		city1S = "Houston+TX";
		JLabel num1 = new JLabel ("1. " + city1);
		num1.setFont(topFont);
		num1.setBounds(825, 200, 600, 75);
		results.add(num1);
		
		//JLabel for second pick
		city2 = "Jacksonville, Florida";
		city2S = "Jacksonville+FL";
		JLabel num2 = new JLabel ("2. " + city2);
		num2.setFont(topFont);
		num2.setBounds(825, 250, 600, 75);
		results.add(num2);
		
		//JLabel for third pick
		city3 = "Daytona, Florida";
		city3S = "Daytona+FL";
		JLabel num3 = new JLabel ("3. " + city3);
		num3.setFont(topFont);
		num3.setBounds(825, 300, 600, 75);
		results.add(num3);
				
		//JLabel for fourth pick
		city4 = "Orlando, Florida";
		city4S = "Orlando+FL";
		JLabel num4 = new JLabel ("4. " + city4);
		num4.setFont(topFont);
		num4.setBounds(825, 350, 600, 75);
		results.add(num4);		
				
		//JLabel for fifth pick
		city5 = "Miami, Florida";
		city5S = "Miami+FL";
		JLabel num5 = new JLabel ("5. " + city5);
		num5.setFont(topFont);
		num5.setBounds(825, 400, 600, 75);
		results.add(num5);	
		
		//JLabel for sixth pick
		city6 = "West Palm Beach, Florida";
		city6S = "West Palm Beach+FL";
		JLabel num6 = new JLabel ("6. " + city6);
		num6.setFont(topFont);
		num6.setBounds(825, 450, 600, 75);
		results.add(num6);
		
		//JLabel for seventh pick
		city7 = "Tampa, Florida";
		city7S = "Tampa+FL";
		JLabel num7 = new JLabel ("7. " + city7);
		num7.setFont(topFont);
		num7.setBounds(825, 500, 600, 75);
		results.add(num7);
		
		//JLabel for eighth pick
		city8 = "Daytona, Florida";
		city8S = "Daytona+FL";
		JLabel num8 = new JLabel ("8. " + city8);
		num8.setFont(topFont);
		num8.setBounds(825, 550, 600, 75);
		results.add(num8);
		
		//JLabel for ninth pick
		city9 = "Sarasota, Florida";
		city9S = "Sarasota+FL";
		JLabel num9 = new JLabel ("9. " + city9);
		num9.setFont(topFont);
		num9.setBounds(825, 600, 600, 75);
		results.add(num9);
		
		//JLabel for tenth pick
		city10 = "Gainesville, Florida";
		city10S = "Gainesville+FL";
		JLabel num10 = new JLabel ("10. " + city10);
		num10.setFont(topFont);
		num10.setBounds(825, 650, 600, 75);
		results.add(num10);		
				
		//button to view results on map screen
		JButton viewMap = new JButton ("Cities on Map");
		viewMap.setFont(new Font("Verdana", Font.BOLD, 40));
		viewMap.setBackground(new Color(182,239,225));
		viewMap.setBounds(550, 750, 400, 75);
		viewMap.setBorderPainted(false);
		results.add(viewMap);
		
		// viewMap Event Listener
		viewMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] opt = {city1S, city2S, city3S, city4S, city5S, city6S, city7S, city8S, city9S, city10S};
				MapScreen.run(opt);
			}
		});
		
		
		
		//button to save results 
		JButton save = new JButton ("Save Results");
		save.setFont(new Font("Verdana", Font.BOLD, 40));
		save.setBackground(new Color(182,239,225));
		save.setBounds(1050, 750, 400, 75);
		save.setBorderPainted(false);
		results.add(save);
		
		//action listener for saving results
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Your results have been saved.", "Saved",  JOptionPane.OK_CANCEL_OPTION,  JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//button to go back to home screen
		JButton home = new JButton ("Back to Home");
		home.setFont(new Font("Verdana", Font.BOLD, 40));
		home.setBackground(new Color(182,239,225));
		home.setBounds(800, 850, 400, 75);
		home.setBorderPainted(false);
		results.add(home);
		
		//action listener for back to home screen button
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				results.setVisible(false);
				HomeScreen.run();
			}
		});
		
		
		results.setVisible(true);
	}
}
