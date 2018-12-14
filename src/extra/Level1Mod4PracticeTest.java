package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Level1Mod4PracticeTest implements ActionListener{
	JButton but1 = new JButton("submit");
	JButton but2 = new JButton("hint");
	JTextField tex = new JTextField();
	
public static void main(String[] args) {
	Level1Mod4PracticeTest x = new Level1Mod4PracticeTest();
	x.dotheprogram();
}
void Level1Mod4PracticeTest() {
	
}
	
	public void dotheprogram(){
		JFrame fra = new JFrame();
		JPanel pan = new JPanel();
		JLabel lab = new JLabel("what is the integral of 2x");
		
		
		
		
		but1.addActionListener(this);
		but2.addActionListener(this);
		tex.setText("answer");
		pan.add(lab);
		pan.add(tex);
		pan.add(but1);
		pan.add(but2);
		fra.add(pan);
		fra.pack();
		fra.setSize(500,100);
		fra.setDefaultCloseOperation(fra.EXIT_ON_CLOSE);
		fra.setVisible(true);
	}
	
	
	
	


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==but1) {
	if(tex.getText().equalsIgnoreCase("x^2+C")) {
		JOptionPane.showMessageDialog(null, "Correct");
	} else {
		JOptionPane.showMessageDialog(null, "Incorrect");
	}
	}
	if(e.getSource()==but2) {
		JOptionPane.showMessageDialog(null, "It's x^2+C");
	}
}
}
