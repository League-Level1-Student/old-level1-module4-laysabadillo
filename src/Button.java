import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Button {

	public static void main(String[] args) {
		
		Button button = new Button();
		button.create();
		
	}
	
	void create() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		frame.setVisible(true);
		panel.add(button);
		frame.add(panel);
		frame.pack();
		
	}
}
