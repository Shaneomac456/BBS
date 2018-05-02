package MyCity;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MapTests {
	static String place = "";
	static String[] opt = {"Dallas+TX", "Logan+UT"};
	public static void main(String[] args) {
		run(opt);
	}

	public static void run(String[] opt) {

		// Build the Browser Frame
		JFrame bframe = new JFrame("JxBrowser Google Maps");
		bframe.setVisible(false);                                                             
		Browser browser = new Browser();
		BrowserView view = new BrowserView(browser);
		bframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		bframe.add(view, BorderLayout.CENTER);
		bframe.setVisible(true);
		bframe.setBounds(-8, 0, 1700, 1045);
		browser.loadURL("https://www.google.com/maps/place/" + place);

		// JFrame 2 Format
		 JFrame jf2 = new JFrame("Results");
		jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf2.setLayout(null);
		jf2.setBounds(1679, 0, 250, 1045);
		jf2.setVisible(true);
		
		// Call options
		options(opt, bframe, jf2);
	}

	public static void options(String[] options, JFrame bframe, JFrame jf2) {
		int count = 0;
		int count2 = 0;
		boolean test = true;
		boolean test2 = true;
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
		JButton o1 = new JButton(options[0].substring(0, count));

		o1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place = options[0];
				bframe.dispose();
				jf2.dispose();	
				run(options);
			}
		});
		JButton o2 = new JButton(options[1].substring(0, count2));
		o2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place = options[1];
				bframe.dispose();
				jf2.dispose();
				run(options);
			}
		});
		o1.setBounds(0, 0, 245, 100);
		o2.setBounds(0, 100, 245, 100);
		jf2.add(o1);
		jf2.add(o2);
	}
}
