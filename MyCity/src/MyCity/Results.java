package MyCity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Results {
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
		JLabel num1 = new JLabel ("1. " + city1);
		num1.setFont(topFont);
		num1.setBounds(825, 200, 600, 75);
		results.add(num1);
		
		//JLabel for second pick
		city2 = "Jacksonville, Florida";
		JLabel num2 = new JLabel ("2. " + city2);
		num2.setFont(topFont);
		num2.setBounds(825, 250, 600, 75);
		results.add(num2);
		
		//JLabel for third pick
		city3 = "Daytona, Florida";
		JLabel num3 = new JLabel ("3. " + city3);
		num3.setFont(topFont);
		num3.setBounds(825, 300, 600, 75);
		results.add(num3);
				
		//JLabel for fourth pick
		city4 = "Orlando, Florida";
		JLabel num4 = new JLabel ("4. " + city4);
		num4.setFont(topFont);
		num4.setBounds(825, 350, 600, 75);
		results.add(num4);		
				
		//JLabel for fifth pick
		city5 = "Miami, Florida";
		JLabel num5 = new JLabel ("5. " + city5);
		num5.setFont(topFont);
		num5.setBounds(825, 400, 600, 75);
		results.add(num5);	
		
		//JLabel for sixth pick
		city6 = "West Palm Beach, Florida";
		JLabel num6 = new JLabel ("6. " + city6);
		num6.setFont(topFont);
		num6.setBounds(825, 450, 600, 75);
		results.add(num6);
		
		//JLabel for seventh pick
		city7 = "Tampa, Florida";
		JLabel num7 = new JLabel ("7. " + city7);
		num7.setFont(topFont);
		num7.setBounds(825, 500, 600, 75);
		results.add(num7);
		
		//JLabel for eighth pick
		city8 = "Daytona, Florida";
		JLabel num8 = new JLabel ("8. " + city8);
		num8.setFont(topFont);
		num8.setBounds(825, 550, 600, 75);
		results.add(num8);
		
		//JLabel for ninth pick
		city9 = "Sarasota, Florida";
		JLabel num9 = new JLabel ("9. " + city9);
		num9.setFont(topFont);
		num9.setBounds(825, 600, 600, 75);
		results.add(num9);
		
		//JLabel for tenth pick
		city10 = "Gainesville, Florida";
		JLabel num10 = new JLabel ("10. " + city10);
		num10.setFont(topFont);
		num10.setBounds(825, 650, 600, 75);
		results.add(num10);		
				
		//button to view results on map screen
		JButton viewMap = new JButton ("View Cities on Map");
		viewMap.setFont(new Font("Verdana", Font.BOLD, 40));
		viewMap.setBackground(new Color(182,239,225));
		viewMap.setBounds(500, 800, 500, 75);
		viewMap.setBorderPainted(false);
		results.add(viewMap);
		
		
		// viewMap Event Listener
		viewMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] opt = {city1S, city2S, city3S, city4S, city5S, city6S, city7S, city8S, city9S, city10S};
				MapScreen.run(opt);
			}
		});
		
		
		
		//button to view results on map screen
		JButton save = new JButton ("Save Results");
		save.setFont(new Font("Verdana", Font.BOLD, 40));
		save.setBackground(new Color(182,239,225));
		save.setBounds(1100, 800, 400, 75);
		save.setBorderPainted(false);
		results.add(save);
		
		
		results.setVisible(true);
		
	}
		public static String[] sort(String result) {
		String[] opt = new String[10];
		return opt;
	}
}
