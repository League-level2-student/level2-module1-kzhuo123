package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button1;
	String s;
	String t;
	
public static void main(String[] args) {
	GuestBook run = new GuestBook();
	run.makeButtons();
}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// TODO Auto-generated method stub
	

	public void makeButtons() {
		frame=new JFrame();
		panel=new JPanel();
		button= new JButton();
		button1= new JButton();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		button.setText("Add Name");
		button1.setText("View Names");
		button.addActionListener(this);
			frame.pack();
			
			}
		

	


	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> names = new ArrayList<String>();
		 JButton buttonClicked = (JButton) e.getSource();
		 if (buttonClicked== button) {
		names.add(JOptionPane.showInputDialog("Enter a Name"));
		}
		 if (buttonClicked == button1) {
			 for(int i = 1; i < names.size(); i++){
					String s = names.get(i);
					JOptionPane.showMessageDialog(null, ("Guest Number # " + i + s));
				}
		}
		 
		 
	}	
		
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}