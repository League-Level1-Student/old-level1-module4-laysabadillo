import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slotmachine implements ActionListener {
	
	public static void main(String[] args) {
		
		Slotmachine Machine = new Slotmachine();
		Machine.create();
		
	}
	
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	String Orange = "Orange.png";
	String Cherry = "Cherry.png";
	String Strawberry = "Strawberry.png";
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	
	void create() {
	
		
		frame.setVisible(true);
		frame.setSize(950, 500);
		
		frame.add(panel);
		
		JButton button = new JButton("Spin");
		button.addActionListener(this);
		panel.add(button);
		
		label = loadImageFromComputer(Strawberry);
		panel.add(label);
		
		label2 = loadImageFromComputer(Orange);
		panel.add(label2);
		
		label3 = loadImageFromComputer(Cherry);
		panel.add(label3);
		
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
		
		panel.remove(label);
		panel.remove(label2);
		panel.remove(label3);
		
			Random gen = new Random();
			int number = gen.nextInt(3)+1;
		
		if(number == 1) {
			label = loadImageFromComputer(Orange);
	}
		if(number == 2) {
			label = loadImageFromComputer(Cherry);
		}
		if(number == 3) {
			label = loadImageFromComputer(Strawberry);	
		}
		number = gen.nextInt(3)+1;
		if(number == 1) {
			label2 = loadImageFromComputer(Orange);
	}
		if(number == 2) {
			label2 = loadImageFromComputer(Cherry);
		}
		if(number == 3) {
			label2 = loadImageFromComputer(Strawberry);	
		}
		number = gen.nextInt(3)+1;
		if(number == 1) {
			label3 = loadImageFromComputer(Orange);
	}
		if(number == 2) {
			label3 = loadImageFromComputer(Cherry);
		}
		if(number == 3) {
			label3 = loadImageFromComputer(Strawberry);	
		}
		
		number = gen.nextInt(3)+1;
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		frame.pack();
		
		System.out.println(label.getIcon());
		System.out.println(label2.getIcon());
		System.out.println(label3.getIcon());
		
		if((label.getIcon().toString().equals(label2.getIcon().toString())) && (label2.getIcon().toString().equals(label3.getIcon().toString()))) {
			JOptionPane.showMessageDialog(null, "You Won!");
		}
		
	}
}
