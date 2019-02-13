package extra;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator {

	public static void main(String[] args) {
			
		Calculator calculator = new Calculator();
		calculator.create();	
	
	}
	void create() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JTextField textfield = new JTextField();
		
	}
}
