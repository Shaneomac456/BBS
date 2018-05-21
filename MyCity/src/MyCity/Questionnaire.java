

package MyCity;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Questionnaire {
	public static void main(String[] args) {
		run();
	}

	public static void run() {
		
		// Font
		Font font = new Font("Verdana", Font.BOLD, 28);
		Font font2 = new Font("Verdana", Font.PLAIN, 24);
		
		// Create the frame
		JFrame q = new JFrame("Questionnaire");
		q.setLayout(null);
		q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		q.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		// Top JPanel
		JPanel jpt = new JPanel();
		jpt.setBackground(new Color(13,229,175));
		jpt.setBounds(0,0,1920, 100);

		// Bottom JPanel
		GridLayout gl = new GridLayout(1400, 1, 0, 5);
		gl.setVgap(10);
		JPanel jp = new JPanel();
		jp.setLayout(gl);
		jp.setBackground(new Color(13,229,175));
		jp.setBounds(200, 100, 1000, 1000);
	
		// Title
		JLabel title = new JLabel("Questionnaire");
		title.setFont(new Font("Verdana", Font.PLAIN, 82));
		title.setBounds(700, 0, 700, 100);
		jpt.add(title);

		// Questions
		Questions(font, font2, jp, gl);

		// JPanel scrollable
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		JScrollPane sp = new JScrollPane(jp);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		sp.setBounds(0, 100, 1920, 900);
		sp.setBorder(border);
		sp.setAutoscrolls(true);
        
		// Displays
		q.add(jpt);
		q.getContentPane().add(sp);
		q.setVisible(true);

	}
	
	public static void Questions(Font font, Font font2, JPanel jp, GridLayout gl) {
		// Q1
		JLabel q1 = new JLabel("1) What is your regional preference?");
		q1.setSize(900,500);
		q1.setFont(font);
		JRadioButton q1o1 = new JRadioButton("Southeast");
		JRadioButton q1o2 = new JRadioButton("Southwest");
		JRadioButton q1o3 = new JRadioButton("Northeast");
		JRadioButton q1o4 = new JRadioButton("Mid-West");
		JRadioButton q1o5 = new JRadioButton("North West");
		JRadioButton q1o6 = new JRadioButton("West");
		
		// Bounds and Format
		q1o1.setSize(400, 50);
		q1o1.setFont(font2);
		q1o2.setSize(400, 50);
		q1o2.setFont(font2);
		q1o3.setSize(400, 50);
		q1o3.setFont(font2);
		q1o4.setSize(500, 50);
		q1o4.setFont(font2);
		q1o5.setSize(400, 50);
		q1o5.setFont(font2);
		q1o6.setSize(400, 50);
		q1o6.setFont(font2);
		q1o1.setBackground(new Color(13,229,175));
		q1o2.setBackground(new Color(13,229,175));
		q1o3.setBackground(new Color(13,229,175));
		q1o4.setBackground(new Color(13,229,175));
		q1o5.setBackground(new Color(13,229,175));
		q1o6.setBackground(new Color(13,229,175));
	
		
		// Add to frame
		jp.add(q1);
		jp.add(q1o1);
		jp.add(q1o2);
		jp.add(q1o3);
		jp.add(q1o4);
		jp.add(q1o5);
		jp.add(q1o6);
		
		// Button Group
		ButtonGroup bgq1 = new ButtonGroup();
		bgq1.add(q1o1);
		bgq1.add(q1o2);
		bgq1.add(q1o3);
		bgq1.add(q1o4);
		bgq1.add(q1o5);
		bgq1.add(q1o6);
		
		// Q2
		JLabel q2 = new JLabel("2) What is your preferred community level?");
		q2.setSize(900, 500);
		q2.setFont(font);
		JRadioButton q2o1 = new JRadioButton("Megacity(>10 million).");
		JRadioButton q2o2 = new JRadioButton("Metropolis(1-3 million).");
		JRadioButton q2o3 = new JRadioButton("Large City(<1 million but over 300,000).");
		JRadioButton q2o4 = new JRadioButton("City(100,000-300,000).");
		JRadioButton q2o5 = new JRadioButton("Large town(20,000-100,000).");
		JRadioButton q2o6 = new JRadioButton("Town(1,000-20,000).");
		
		// Bounds and Format
		q2o1.setBounds(1000, 50, 400, 50);
		q2o1.setFont(font2);
		q2o2.setBounds(1000, 100, 400, 50);
		q2o2.setFont(font2);
		q2o3.setBounds(1000, 150, 400, 50);
		q2o3.setFont(font2);
		q2o4.setBounds(1000, 200, 500, 50);
		q2o4.setFont(font2);
		q2o5.setBounds(1000, 250, 600, 50);
		q2o5.setFont(font2);
		q2o6.setBounds(1000, 300, 800, 50);
		q2o6.setFont(font2);
		q2o1.setBackground(new Color(13,229,175));
		q2o2.setBackground(new Color(13,229,175));
		q2o3.setBackground(new Color(13,229,175));
		q2o4.setBackground(new Color(13,229,175));
		q2o5.setBackground(new Color(13,229,175));
		q2o6.setBackground(new Color(13,229,175));
		
		// Add to frame
		jp.add(q2);
		jp.add(q2o1);
		jp.add(q2o2);
		jp.add(q2o3);
		jp.add(q2o4);
		jp.add(q2o5);
		jp.add(q2o6);
		
		// Button Group
		ButtonGroup bgq2 = new ButtonGroup();
		bgq2.add(q2o1);
		bgq2.add(q2o2);
		bgq2.add(q2o3);
		bgq2.add(q2o4);
		bgq2.add(q2o5);
		bgq2.add(q2o6);
		
		// Q3
		JLabel q3 = new JLabel("3) How close to a major city would you like to be?");
		q3.setSize(900,500);
		q3.setFont(font);
		JRadioButton q3o1 = new JRadioButton("30 minutes(25 miles).");
		JRadioButton q3o2 = new JRadioButton("Within an hour(50 miles).");
		JRadioButton q3o3 = new JRadioButton("Within 2 hours(100 miles)");
		JRadioButton q3o4 = new JRadioButton("Within 3 hours(150 miles)");
		JRadioButton q3o5 = new JRadioButton("Within 4-8 hours(200-400 miles).");
		JRadioButton q3o6 = new JRadioButton("I want to be far from a major city(days away).");
		
		// Bounds and Format
		q3o1.setBounds(100, 450, 400, 50);
		q3o1.setFont(font2);
		q3o2.setBounds(100, 500, 400, 50);
		q3o2.setFont(font2);
		q3o3.setBounds(100, 550, 400, 50);
		q3o3.setFont(font2);
		q3o4.setBounds(100, 600, 500, 50);
		q3o4.setFont(font2);
		q3o5.setBounds(100, 650, 600, 50);
		q3o5.setFont(font2);
		q3o6.setBounds(100, 700, 800, 50);
		q3o6.setFont(font2);
		q3o1.setBackground(new Color(13,229,175));
		q3o2.setBackground(new Color(13,229,175));
		q3o3.setBackground(new Color(13,229,175));
		q3o4.setBackground(new Color(13,229,175));
		q3o5.setBackground(new Color(13,229,175));
		q3o6.setBackground(new Color(13,229,175));
		
		// Add to frame
		jp.add(q3);
		jp.add(q3o1);
		jp.add(q3o2);
		jp.add(q3o3);
		jp.add(q3o4);
		jp.add(q3o5);
		jp.add(q3o6);
		
		// Button Group
		ButtonGroup bgq3 = new ButtonGroup();
		bgq3.add(q3o1);
		bgq3.add(q3o2);
		bgq3.add(q3o3);
		bgq3.add(q3o4);
		bgq3.add(q3o5);
		bgq3.add(q3o6); 
		
		//Q4
		JLabel q4 = new JLabel("4) What job industry do you currently work in or aspire to work in?");
		q4.setBounds(100, 750, 900, 500);
		q4.setFont(font);
		JRadioButton q4o1 = new JRadioButton("Government.");
		JRadioButton q4o2 = new JRadioButton("Technology.");
		JRadioButton q4o3 = new JRadioButton("Manufacturing.");
		JRadioButton q4o4 = new JRadioButton("Agriculture.");
		JRadioButton q4o5 = new JRadioButton("Education.");
		JRadioButton q4o6 = new JRadioButton("Finance.");
		
		// Bounds and Format
		q4o1.setBounds(100, 800, 400, 50);
		q4o1.setFont(font2);
		q4o2.setBounds(100, 850, 400, 50);
		q4o2.setFont(font2);
		q4o3.setBounds(100, 900, 400, 50);
		q4o3.setFont(font2);
		q4o4.setBounds(100, 950, 500, 50);
		q4o4.setFont(font2);
		q4o5.setBounds(100, 1000, 600, 50);
		q4o5.setFont(font2);
		q4o6.setBounds(100, 1050, 800, 50);
		q4o6.setFont(font2);
		q4o1.setBackground(new Color(13,229,175));
		q4o2.setBackground(new Color(13,229,175));
		q4o3.setBackground(new Color(13,229,175));
		q4o4.setBackground(new Color(13,229,175));
		q4o5.setBackground(new Color(13,229,175));
		q4o6.setBackground(new Color(13,229,175));
		
		// Add to frame
		jp.add(q4);
		jp.add(q4o1);
		jp.add(q4o2);
		jp.add(q4o3);
		jp.add(q4o4);
		jp.add(q4o5);
		jp.add(q4o6);
	//Question 5
		JLabel q5 = new JLabel("5) What type of climate do you want to live in?");
		q5.setSize(900,500);
		q5.setFont(font);
		JRadioButton q5o1 = new JRadioButton("Tropical climate.");
		JRadioButton q5o2 = new JRadioButton("Desert climate.");
		JRadioButton q5o3 = new JRadioButton("Semi-arid climate");
		JRadioButton q5o4 = new JRadioButton("Mediterranean climate");
		JRadioButton q5o5 = new JRadioButton("Subtropical climate");
		JRadioButton q5o6 = new JRadioButton("Humid continental climate");
		
		// Bounds and Format for Q5
		q5o1.setSize(400, 50);
		q5o1.setFont(font2);
		q5o2.setSize(400, 50);	
		q5o2.setFont(font2);
		q5o3.setSize(400, 50);
		q5o3.setFont(font2);
		q5o4.setSize(400, 50);
		q5o4.setFont(font2);
		q5o5.setSize(400, 50);
		q5o5.setFont(font2);
		q5o6.setSize(400, 50);
		q5o6.setFont(font2);
		q5o1.setBackground(new Color(13,229,175));
		q5o2.setBackground(new Color(13,229,175));
		q5o3.setBackground(new Color(13,229,175));
		q5o4.setBackground(new Color(13,229,175));
		q5o5.setBackground(new Color(13,229,175));
		q5o6.setBackground(new Color(13,229,175));
	
		// Add to frame
		jp.add(q5);
		jp.add(q5o1);
		jp.add(q5o2);
		jp.add(q5o3);
		jp.add(q5o4);
		jp.add(q5o5);
		jp.add(q5o6);
	
		// Button Group for Q5
		ButtonGroup bgq5 = new ButtonGroup();
		bgq5.add(q5o1);
		bgq5.add(q5o2);
		bgq5.add(q5o3);
		bgq5.add(q5o4);
		bgq5.add(q5o5);
		bgq5.add(q5o6);
		
		//Question 6
		JLabel q6 = new JLabel("6) How close do you want to be to the beach?");
		q6.setSize(900,500);
		q6.setFont(font);
		JRadioButton q6o1 = new JRadioButton("Walking distance.");
		JRadioButton q6o2 = new JRadioButton("10-30 minute drive.");
		JRadioButton q6o3 = new JRadioButton("An hour drive.");
		JRadioButton q6o4 = new JRadioButton("2-5 hour drive.");
		JRadioButton q6o5 = new JRadioButton("A flight away.");
		JRadioButton q6o6 = new JRadioButton("Nowhere close to one.");
		
		// Bounds and Format for Q6
		q6o1.setSize(400, 50);
		q6o1.setFont(font2);
		q6o2.setSize(400, 50);	
		q6o2.setFont(font2);
		q6o3.setSize(400, 50);
		q6o3.setFont(font2);
		q6o4.setSize(400, 50);
		q6o4.setFont(font2);
		q6o5.setSize(400, 50);
		q6o5.setFont(font2);
		q6o6.setSize(400, 50);
		q6o6.setFont(font2);
		q6o1.setBackground(new Color(13,229,175));
		q6o2.setBackground(new Color(13,229,175));
		q6o3.setBackground(new Color(13,229,175));
		q6o4.setBackground(new Color(13,229,175));
		q6o5.setBackground(new Color(13,229,175));
		q6o6.setBackground(new Color(13,229,175));
			
		// Add to frame
		jp.add(q6);
		jp.add(q6o1);
		jp.add(q6o2);
		jp.add(q6o3);
		jp.add(q6o4);
		jp.add(q6o5);
		jp.add(q6o6);	
				
		// Button Group for Q6
		ButtonGroup bgq6 = new ButtonGroup();
		bgq6.add(q6o1);
		bgq6.add(q6o2);
		bgq6.add(q6o3);
		bgq6.add(q6o4);
		bgq6.add(q6o5);
		bgq6.add(q6o6);
		
		//Question 7
		JLabel q7 = new JLabel("7) How close to an airport would you like to be?");
		q7.setSize(900,500);
		q7.setFont(font);
		JRadioButton q7o1 = new JRadioButton("Less than 10 minutes.");
		JRadioButton q7o2 = new JRadioButton("Less than 30 minutes.");
		JRadioButton q7o3 = new JRadioButton("An hour drive.");
		JRadioButton q7o4 = new JRadioButton("2-3 hour drive.");
		JRadioButton q7o5 = new JRadioButton("4+ hour drive.");
		JRadioButton q7o6 = new JRadioButton("I don't travel so I don't need to be close at all.");
				
		// Bounds and Format for Q7
		q7o1.setSize(400, 50);
		q7o1.setFont(font2);
		q7o2.setSize(400, 50);	
		q7o2.setFont(font2);
		q7o3.setSize(400, 50);
		q7o3.setFont(font2);
		q7o4.setSize(400, 50);
		q7o4.setFont(font2);
		q7o5.setSize(400, 50);
		q7o5.setFont(font2);
		q7o6.setSize(400, 50);
		q7o6.setFont(font2);
		q7o1.setBackground(new Color(13,229,175));
		q7o2.setBackground(new Color(13,229,175));
		q7o3.setBackground(new Color(13,229,175));
		q7o4.setBackground(new Color(13,229,175));
		q7o5.setBackground(new Color(13,229,175));
		q7o6.setBackground(new Color(13,229,175));
					
		// Add to frame
		jp.add(q7);
		jp.add(q7o1);
		jp.add(q7o2);
		jp.add(q7o3);
		jp.add(q7o4);
		jp.add(q7o5);
		jp.add(q7o6);	
				
		// Button Group for Q7
		ButtonGroup bgq7 = new ButtonGroup();
		bgq7.add(q7o1);
		bgq7.add(q7o2);
		bgq7.add(q7o3);
		bgq7.add(q7o4);
		bgq7.add(q7o5);
		bgq7.add(q7o6);
		
		//Question 8
		JLabel q8 = new JLabel("8) How close do you want to be to the beach?");
		q8.setSize(900,500);
		q8.setFont(font);
		JRadioButton q8o1 = new JRadioButton("Walking distance.");
		JRadioButton q8o2 = new JRadioButton("10-30 minute drive.");
		JRadioButton q8o3 = new JRadioButton("An hour drive.");
		JRadioButton q8o4 = new JRadioButton("2-5 hour drive.");
		JRadioButton q8o5 = new JRadioButton("A flight away.");
		JRadioButton q8o6 = new JRadioButton("Nowhere close to one.");
				
		// Bounds and Format for Q5
		q8o1.setSize(400, 50);
		q8o1.setFont(font2);
		q8o2.setSize(400, 50);	
		q8o2.setFont(font2);
		q8o3.setSize(400, 50);
		q8o3.setFont(font2);
		q8o4.setSize(400, 50);
		q8o4.setFont(font2);
		q8o5.setSize(400, 50);
		q8o5.setFont(font2);
		q8o6.setSize(400, 50);
		q8o6.setFont(font2);
		q8o1.setBackground(new Color(13,229,175));
		q8o2.setBackground(new Color(13,229,175));
		q8o3.setBackground(new Color(13,229,175));
		q8o4.setBackground(new Color(13,229,175));
		q8o5.setBackground(new Color(13,229,175));
		q8o6.setBackground(new Color(13,229,175));
					
		// Add to frame
		jp.add(q8);
		jp.add(q8o1);
		jp.add(q8o2);
		jp.add(q8o3);
		jp.add(q8o4);
		jp.add(q8o5);
		jp.add(q8o6);	
						
		// Button Group for Q5
		ButtonGroup bgq8 = new ButtonGroup();
		bgq8.add(q8o1);
		bgq8.add(q8o2);
		bgq8.add(q8o3);
		bgq8.add(q8o4);
		bgq8.add(q8o5);
		bgq8.add(q8o6);
	}
}


