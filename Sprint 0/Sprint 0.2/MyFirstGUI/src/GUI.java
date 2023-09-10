import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
//import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class GUI {
	JFrame frame;
	JLabel label;
	JPanel panel;
	
	//Constructor
	public GUI() {
		frame = new JFrame();
		
		//Label and Buttons
		label = new JLabel("Choose your team");
		JRadioButton b1 = new JRadioButton("Red");
		JRadioButton b2 = new JRadioButton("Blue");
		JButton button = new JButton ("Click here");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				String team = " ";
				
				if (b1.isSelected() && b2.isSelected()) {
					team = "Purple";
				}
				else if (b2.isSelected()) {
					team = "Blue";
				}
				else if (b1.isSelected()) {
					team = "Red";
				}
				else {
					team = "Hello! This is a secret message from Dylan Karr. "
							+ "If you found this, I genuinely hope you have "
							+ "a good day!";
				}
				
				JOptionPane.showMessageDialog(button, team);
			}
		});
		JCheckBox c1 = new JCheckBox("Are you Legendary?");
		
		
		//Panel settings
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.setOpaque(false);
		panel.add(label);
		panel.add(b1);
		panel.add(b2);
		panel.add(button);
		panel.add(c1);
		
		//Frame settings
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI by Dylan Karr");
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.getContentPane().add(new LineDrawing ());
	}

	public static void main(String args[]) {
		new GUI(); //Calls GUI and causes my GUI to appear.
	}
}