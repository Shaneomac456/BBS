package MyCity;

import java.awt.*;
import java.text.Format;
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
		jpt.setBackground(new Color(14, 170, 209));
		jpt.setBounds(0,0,1920, 100);

		// Bottom JPanel
		GridLayout gl = new GridLayout(1920, 900);
		gl.setVgap(10);
		JPanel jp = new JPanel();
		jp.setLayout(gl);
		jp.setBackground(new Color(14, 170, 209));
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
		
		// Displays
		q.add(jpt);
		q.getContentPane().add(sp);
		q.setVisible(true);

	}
	
	public static void Questions(Font font, Font font2, JPanel jp, GridLayout gl) {
		// Q1
		JLabel q1 = new JLabel("1) How long should you have to drive to the beach?", JLabel.CENTER );
		q1.setBounds(0, 0, 900, 50);
		q1.setFont(font);
		JRadioButton q1o1 = new JRadioButton("Less than an hours drive");
		JRadioButton q1o2 = new JRadioButton("2-5 Hours");
		JRadioButton q1o3 = new JRadioButton("6-12 Hours, ROAD TRIP!");
		JRadioButton q1o4 = new JRadioButton("A nice walk");
		JRadioButton q1o5 = new JRadioButton("I don't like the beach");
		JRadioButton q1o6 = new JRadioButton("I don't care");
		
		// Bounds and Format
		q1o1.setBounds(100, 50, 400, 50);
		q1o1.setHorizontalAlignment(SwingConstants.CENTER);
		q1o1.setFont(font2);
		q1o2.setBounds(100, 100, 400, 50);
		q1o2.setHorizontalAlignment(SwingConstants.CENTER);
		q1o2.setFont(font2);
		q1o3.setBounds(100, 150, 400, 50);
		q1o3.setHorizontalAlignment(SwingConstants.CENTER);
		q1o3.setFont(font2);
		q1o4.setBounds(100, 200, 500, 50);
		q1o4.setHorizontalAlignment(SwingConstants.CENTER);
		q1o4.setFont(font2);
		q1o5.setBounds(100, 250, 400, 50);
		q1o5.setHorizontalAlignment(SwingConstants.CENTER);
		q1o5.setFont(font2);
		q1o6.setBounds(100, 300, 400, 50);
		q1o6.setHorizontalAlignment(SwingConstants.CENTER);
		q1o6.setFont(font2);
		q1o1.setBackground(new Color(14, 170, 209));
		q1o2.setBackground(new Color(14, 170, 209));
		q1o3.setBackground(new Color(14, 170, 209));
		q1o4.setBackground(new Color(14, 170, 209));
		q1o5.setBackground(new Color(14, 170, 209));
		q1o6.setBackground(new Color(14, 170, 209));
		
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
		JLabel q2 = new JLabel("2) How often do you need to take flights?");
		q2.setBounds(950, 0, 900, 50);
		q2.setFont(font);
		JRadioButton q2o1 = new JRadioButton("Once or twice a week");
		JRadioButton q2o2 = new JRadioButton("At least every two weeks");
		JRadioButton q2o3 = new JRadioButton("Monthly");
		JRadioButton q2o4 = new JRadioButton("Couple times a year");
		JRadioButton q2o5 = new JRadioButton("Maybe once a year, or every couple years");
		JRadioButton q2o6 = new JRadioButton("Big metal bird? NOPE! I would never set foot on one");
		
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
		q2o1.setBackground(new Color(14, 170, 209));
		q2o2.setBackground(new Color(14, 170, 209));
		q2o3.setBackground(new Color(14, 170, 209));
		q2o4.setBackground(new Color(14, 170, 209));
		q2o5.setBackground(new Color(14, 170, 209));
		q2o6.setBackground(new Color(14, 170, 209));
		
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
		JLabel q3 = new JLabel("3) How many people will be living with you?");
		q3.setBounds(50, 400, 950, 50);
		q3.setFont(font);
		JRadioButton q3o1 = new JRadioButton("I live alone.");
		JRadioButton q3o2 = new JRadioButton("I'm in a relationship, 2 people.");
		JRadioButton q3o3 = new JRadioButton("I have kids, 3-8 people");
		JRadioButton q3o4 = new JRadioButton("I'm an empty nester");
		JRadioButton q3o5 = new JRadioButton("I have people crash on my couch a lot");
		JRadioButton q3o6 = new JRadioButton("I have 17 cats, they are all my children.");
		
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
		q3o6.setBounds(100, 1000, 800, 50);
		q3o6.setFont(font2);
		q3o1.setBackground(new Color(14, 170, 209));
		q3o2.setBackground(new Color(14, 170, 209));
		q3o3.setBackground(new Color(14, 170, 209));
		q3o4.setBackground(new Color(14, 170, 209));
		q3o5.setBackground(new Color(14, 170, 209));
		q3o6.setBackground(new Color(14, 170, 209));
		
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
	}
}
