

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class Calculator implements ActionListener {

	public static void main(String[] args) {
			
		Calculator calculator = new Calculator();
		calculator.create();	
	}
	
	JTextField textbox = new JTextField(10);
	JTextField textbox2 = new JTextField(10);
	JLabel label = new JLabel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	void create() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.add(textbox); 
		textbox.setSize(200, 300);
		
		panel.add(textbox2);
		textbox2.setSize(200, 300);
		
		label.setText("0");
		
		panel.add(button);
		button.setText("Add");
		button.setSize(50, 50);
		button.addActionListener(this);
		
		panel.add(button2);
		button2.setText("Subtract");
		button2.setSize(50, 50);
		button2.addActionListener(this);
		
		panel.add(button3);
		button3.setText("Multiply");
		button3.setSize(50, 50);
		button3.addActionListener(this);
		
		panel.add(button4);
		button4.setText("Divide");
		button4.setSize(50, 50);
		button4.addActionListener(this);
		
		label.setFont(new Font("Arial", Font.BOLD, 60));
		panel.add(label);
	
		frame.setSize(200, 235);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
int a = Integer.parseInt(textbox.getText());	
int b = Integer.parseInt(textbox2.getText());
		
if(e.getSource() == button)	{
	label.setText("" + (a+b));
}

if(e.getSource() == button2) {
	label.setText("" + (a-b));
}

if(e.getSource() == button3) {
	label.setText("" + (a*b));
}

if(e.getSource() == button4) {
	label.setText("" + (a/b));
}

	}
}
