package MyCity;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import javax.swing.*;
import java.awt.*;

public class MapTests {
    public static void main(String[] args) {
    	run();
    }
    public static void run() {
    	
    	String place = "San Francisco"; 	
    	
    	// Build the Browser Frame
        Browser browser = new Browser();
        BrowserView view = new BrowserView(browser);        
        JFrame bframe = new JFrame("JxBrowser Google Maps");
        bframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        bframe.add(view, BorderLayout.CENTER);
        bframe.setSize(800, 800);
        bframe.setLocationRelativeTo(null);
        bframe.setVisible(true);
        bframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        browser.loadURL("https://www.google.com/maps/place/" + place);
        
        
        // Button stuff
    }
}