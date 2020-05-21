
package _99_extra;

import javax.swing.JOptionPane;

/* NASA wants to shoot a rocket into orbit. 
  * Somebody has to do the countdown or the rocket won't launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0. 
 * 
 * (example for '11': 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
	public static void main(String[] args) throws InterruptedException {
		// 2. Use a pop-up to ask the user where to start counting from
		String countdown = JOptionPane.showInputDialog("What number shall we start counting down from? ");
		// 3. Change the countdown to use the new starting point
		int count = Integer.parseInt(countdown);
		
		for (int i = count; i >= 0; i--) {
			int count1 = count;
			
			JOptionPane.showMessageDialog(null, "" + count1);
			count -=1;
		}
		
		
		JOptionPane.showMessageDialog(null, "blastoff!");
		// 1. Print a countdown from 10 to 0 on the console
		System.out.println(10);
		System.out.println(9);
		System.out.println(8);
		System.out.println(7);
		System.out.println(6);
		System.out.println(5);
		System.out.println(4);
		System.out.println(3);
		System.out.println(2);
		System.out.println(1);
		// 4. Use the speak method to hear the countdown.

		// 6. Use the following code to make the program wait one second for each


		// 5. when the counting is done, speak "blastoff!"
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
