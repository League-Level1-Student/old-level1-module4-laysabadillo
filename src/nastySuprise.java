import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySuprise implements ActionListener {

	public static void main(String[] args) {
		
		nastySuprise picture = new nastySuprise();
		picture.create();
		
	}
	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JButton button2 = new JButton();
		JLabel label = new JLabel();
		String Puppy = "Puppy.jpg";
		String Clown = "Clown.jpeg";
		
	void create(){
		
		frame.setVisible(true);
		frame.add(panel);
		button.addActionListener(this);
		panel.add(button);
		button2.addActionListener(this);
		panel.add(button2);
		button.setText("Trick");
		button2.setText("Treat");
		frame.pack();
	}
	
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button2) {
			panel.remove(label);
			label = loadImageFromComputer(Puppy);
			panel.add(label);
			frame.pack();
		}
		if(e.getSource()== button) {
			panel.remove(label);
			label = loadImageFromComputer(Clown);
			panel.add(label);
			frame.pack();
			
		}
		
		
	}
	
}
