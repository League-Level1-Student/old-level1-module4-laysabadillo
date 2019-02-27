package extra;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements MouseListener {
	
	public static void main(String[] args) {

		PigLatin word = new PigLatin();
		word.create();
}
	JTextField textbox = new JTextField(10);
	JTextField textbox2 = new JTextField(10);
	JButton button = new JButton();
	
	void create() {
	
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.add(textbox); 
		textbox.setSize(200, 300);
		
		panel.add(textbox2);
		textbox2.setSize(200, 300);
		
		panel.add(button);
		button.setText("Translate");
		button.setSize(50, 50);
		button.addMouseListener(this);
		
		frame.setSize(300, 100);
}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
