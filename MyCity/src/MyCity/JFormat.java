package MyCity;

import java.awt.*;
import javax.swing.*;

public class JFormat {
	private int x;
	private int y;
	private int height;
	private int length;
	private Font font;
	private JLabel jl;

	public JFormat() {
		this.x = 0;
		this.y = 0;
		this.height = 0;
		this.length = 0;
		this.font = null;
	}
	public JFormat (int x, int y, int height, int length, Font font) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.length = length;
		this.font = font;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setHeight (int height) {
		this.height = height;
	}
	public void setLength (int length) {
		this.length = length;
	}
	public void setFont(Font font) {
		this.font = font;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getHeight() {
		return this.height;
	}
	public int getLength() {
		return this.length;
	}
	public Font getFont() {
		return this.font;
	}
	public JLabel getJLab() {
		return jl;
	}
	public void pack(){
		this.jl.setBounds(x,y, height, length);
		this.jl.setFont(font);
	}
}
