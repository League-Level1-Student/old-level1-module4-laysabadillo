import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class Chuckle_Clicker implements MouseListener {
	
	public static void main(String[] args) {
		
		Chuckle_Clicker clicker = new Chuckle_Clicker();
		clicker.makeButtons();

	}

	JButton button2 = new JButton();
	JButton button = new JButton();
	
void makeButtons() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
	
	button.setText("Joke");
	button.addMouseListener(this);
	button.setSize(50, 50);
	panel.add(button);
	
	button2.setText("Punchline");
	panel.add(button2);
	button2.addMouseListener(this);
	button2.setSize(50, 50);
	
	frame.pack();
	
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	if(e.getSource() == button) {
		JOptionPane.showMessageDialog(null, "What Do You Call A Fake Noodle?");
	}
	
		if(e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "An Impasta!");
		}
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