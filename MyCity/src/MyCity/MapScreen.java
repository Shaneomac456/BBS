package MyCity;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MapScreen {
	static Font font = new Font("Verdana", Font.PLAIN, 20);
	static String place = "";
	static String[] opt = {"Chicago+IL", "Hampton+VA", "Atlanta+GA", "Boston+MA", "Brooklyn+NY", "Seattle+WA", "Houston+TX", "Marathon+FL", "Hell+MI", "Los Angeles+CA"};
	public static void main(String[] args) {
		run(opt);
	}

	public static void run(String[] opt) {

		// Build the Browser Frame
		JFrame bframe = new JFrame("JxBrowser Google Maps");
		JPanel jp = new JPanel(new BorderLayout());
		bframe.setVisible(false);                                                             
		Browser browser = new Browser();
		BrowserView view = new BrowserView(browser);
		bframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		view.setSize(1500, 1080);
		jp.add(view, BorderLayout.CENTER);
		bframe.add(jp);
		bframe.setVisible(true);
		bframe.setBounds(-8, 0, 1940, 1080);
		browser.loadURL("https://www.google.com/maps/place/" + place);

		
		// JFrame 2 Format
		JPanel jf2 = new JPanel();
		jf2.setLayout(new GridLayout(10, 0));
		jf2.setSize(0, 200);
		jf2.setVisible(true);
		
		
		bframe.add(jf2, BorderLayout.LINE_END);
		// Call options
		options(opt, bframe, jf2);
	}

	public static void options(String[] options, JFrame bframe, JPanel jf2) {
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count10 = 0;
		boolean test = true;
		boolean test2 = true;
		boolean test3 = true;
		boolean test4 = true;
		boolean test5 = true;
		boolean test6 = true;
		boolean test7 = true;
		boolean test8 = true;
		boolean test9 = true;
		boolean test10 = true;
		while (test && count <= options[0].length()) {
			if (options[0].substring(count, count + 1).equals("+")) {
				test = false;
			} else {
				count++;
			}
		}
		while (test2 && count2 < options[1].length()) {
			if (options[1].substring(count2, count2 + 1).equals("+")) {
				test2 = false;
			} else {
				count2++;
			}
		}
		while (test3 && count3 < options[2].length()) {
			if (options[2].substring(count3, count3 + 1).equals("+")) {
				test3 = false;
			} else {
				count3++;
			}
		}
		while (test4 && count4 < options[3].length()) {
			if (options[3].substring(count4, count4 + 1).equals("+")) {
				test4 = false;
			} else {
				count4++;
			}
		}
		while (test5 && count5 < options[4].length()) {
			if (options[4].substring(count5, count5 + 1).equals("+")) {
				test5 = false;
			} else {
				count5++;
			}
		}
		while (test6 && count6 < options[5].length()) {
			if (options[5].substring(count6, count6 + 1).equals("+")) {
				test6 = false;
			} else {
				count6++;
			}
		}
		
		while (test7 && count7 < options[6].length()) {
			if (options[6].substring(count7, count7 + 1).equals("+")) {
				test7 = false;
			} else {
				count7++;
			}
		}
		while (test8 && count8 < options[7].length()) {
			if (options[7].substring(count8, count8 + 1).equals("+")) {
				test8 = false;
			} else {
				count8++;
			}
		}
		while (test9 && count9 < options[8].length()) {
			if (options[8].substring(count9, count9 + 1).equals("+")) {
				test9 = false;
			} else {
				count9++;
			}
		}
		while (test10 && count10 < options[9].length()) {
			if (options[9].substring(count10, count10 + 1).equals("+")) {
				test10 = false;
			} else {
				count10++;
			}
		}
		
		
		
		JButton o1 = new JButton(options[0].substring(0, count));
		o1.setFont(font);
		o1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place = options[0];
				bframe.dispose();
				run(options);
			}
		});
		JButton o2 = new JButton(options[1].substring(0, count2));
		o2.setFont(font);
		o2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place = options[1];
				bframe.dispose();
				run(options);
			}
		});
		JButton o3 = new JButton(options[2].substring(0, count3));
		o3.setFont(font);
		o3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place = options[2];
				bframe.dispose();
				run(options);
			}
		});
		JButton o4 = new JButton(options[3].substring(0, count4));
		o4.setFont(font);
		o4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place = options[3];
				bframe.dispose();
				run(options);
			}
		});
		JButton o5 = new JButton(options[4].substring(0, count5));
		o5.setFont(font);
		o5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place = options[4];
				bframe.dispose();
				run(options);
			}
		});
		JButton o6 = new JButton(options[5].substring(0, count6));
		o6.setFont(font);
		o6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place = options[5];
				bframe.dispose();
				run(options);
			}
		});
		JButton o7 = new JButton(options[6].substring(0, count7));
		o7.setFont(font);
		o7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place = options[6];
				bframe.dispose();
				run(options);
			}
		});
		JButton o8 = new JButton(options[7].substring(0, count8));
		o8.setFont(font);
		o8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place = options[7];
				bframe.dispose();
				run(options);
			}
		});
		JButton o9 = new JButton(options[8].substring(0, count9));
		o9.setFont(font);
		o9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place = options[8];
				bframe.dispose();
				run(options);
			}
		});
		JButton o10 = new JButton(options[9].substring(0, count10));
		o10.setFont(font);
		o10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place = options[9];
				bframe.dispose();
				run(options);
			}
		});
		jf2.add(o1);
		jf2.add(o2);
		jf2.add(o3);
		jf2.add(o4);
		jf2.add(o5);
		jf2.add(o6);
		jf2.add(o7);
		jf2.add(o8);
		jf2.add(o9);
		jf2.add(o10);
	}
}
