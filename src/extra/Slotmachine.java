package extra;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slotmachine {
	
	public static void main(String[] args) {
		
		Slotmachine Machine = new Slotmachine();
		Machine.create();
	}
	
	void create() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JLabel label = new JLabel();
		
		String Strawberry = "Strawberry.png";
		label = loadImageFromComputer(Strawberry);
		frame.add(label);
		String Orange = "Orange.png";
		frame.pack();
	}
	
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}
