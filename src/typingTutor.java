import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	static char currentLetter;
	
	public static void main(String[] args) {
		
		typingTutor typing = new typingTutor();
		typing.create();
		currentLetter = generateRandomLetter();
		
	}
	
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	
	void create() {
		
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
	
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		frame.setSize(300, 300);
		
		panel.add(label);
	    frame.add(panel);
	    frame.pack();
	    
		}
	
		static char generateRandomLetter() {
		      Random r = new Random();
		      return (char) (r.nextInt(26) + 'a');
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e.getKeyChar());
			
			if(e.getKeyChar() == (currentLetter)) {
				frame.setBackground(Color.GREEN);
				System.out.println("Correct");
				
			} else {
				
				frame.setBackground(Color.RED);
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			currentLetter = generateRandomLetter();
			label.setText(currentLetter + "") ;
			
		}
}
