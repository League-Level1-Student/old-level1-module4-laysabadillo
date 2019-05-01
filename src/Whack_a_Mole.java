

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_a_Mole implements ActionListener {

	public static void main(String[] args) {
		
		Whack_a_Mole mole = new Whack_a_Mole();
		
		mole.create();
	}
	
	Date D = new Date();
	Random gen = new Random();
	int number = gen.nextInt(24)+1;
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton button10 = new JButton("10");
	JButton button11 = new JButton("11");
	JButton button12 = new JButton("12");
	JButton button13 = new JButton("13");
	JButton button14 = new JButton("14");
	JButton button15 = new JButton("15");
	JButton button16 = new JButton("16");
	JButton button17 = new JButton("17");
	JButton button18 = new JButton("18");
	JButton button19 = new JButton("19");
	JButton button20 = new JButton("20");
	JButton button21 = new JButton("21");
	JButton button22 = new JButton("22");
	JButton button23 = new JButton("23");
	JButton button24 = new JButton("24");
	
	void buttonSetup(JButton button) {
		panel.add(button);
		button.addActionListener(this);
		if(Integer.parseInt(button.getText()) == number) {
			button.setText("mole");
			
		}
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	void create() {
		panel = new JPanel();
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button10 = new JButton("10");
		button11 = new JButton("11");
		button12 = new JButton("12");
		button13 = new JButton("13");
		button14 = new JButton("14");
		button15 = new JButton("15");
		button16 = new JButton("16");
		button17 = new JButton("17");
		button18 = new JButton("18");
		button19 = new JButton("19");
		button20 = new JButton("20");
		button21 = new JButton("21");
		button22 = new JButton("22");
		button23 = new JButton("23");
		button24 = new JButton("24");
		
		frame.setVisible(true);
		frame.setTitle("Whack a Button");
		frame.add(panel);
		buttonSetup(button1);
		buttonSetup(button2);
		buttonSetup(button3);
		buttonSetup(button4);
		buttonSetup(button5);
		buttonSetup(button6);
		buttonSetup(button7);
		buttonSetup(button8);
		buttonSetup(button9);
		buttonSetup(button10);
		buttonSetup(button11);
		buttonSetup(button12);
		buttonSetup(button13);
		buttonSetup(button14);
		buttonSetup(button15);
		buttonSetup(button16);
		buttonSetup(button17);
		buttonSetup(button18);
		buttonSetup(button19);
		buttonSetup(button20);
		buttonSetup(button21);
		buttonSetup(button22);
		buttonSetup(button23);
		buttonSetup(button24);
	
		frame.setSize(250, 300);

	}

	int bad = 0;
	int count = 0;
	int moles = 0;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		if(button.getText().equals("mole")){
			speak("Ahh");
			frame.remove(panel);
			moles++;
			number = gen.nextInt(24)+1;
			create(); 
		} else {
			count++;
			JOptionPane.showMessageDialog(null, "Be Nice");
		}
		if(count>5) {
			JOptionPane.showMessageDialog(null, "You Have Lost");
			endGame(D, moles);
			frame.dispose();
		}
		if(moles>10) {
			JOptionPane.showMessageDialog(null, "You Have Won!");
			endGame(D, moles);
			frame.dispose();
		}
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}

