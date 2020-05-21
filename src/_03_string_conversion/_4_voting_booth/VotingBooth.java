package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
String age = JOptionPane.showInputDialog("How old are you?");
int ageA = Integer.parseInt(age);
if (ageA >= 18) {
	JOptionPane.showInputDialog(null, "Who should the next president be?");
}
else if (ageA < 18) {
	JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
}
	
	
	
	
}
}
