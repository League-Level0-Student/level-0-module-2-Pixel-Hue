//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		for (int i = 0; i < 10; i++) {
			
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if (randomNumber==0) {
	JOptionPane.showMessageDialog(null, "Your an excellent person and are valued by many!");
}
else if(randomNumber==1) {
	JOptionPane.showMessageDialog(null, "Your a positive and supportive person... Thanks!");
}
else if(randomNumber==2) {
	JOptionPane.showMessageDialog(null, "Your the MVP!");
}
else if(randomNumber==3) {
	JOptionPane.showMessageDialog(null, "YOUR AMAZING!!!");
	
}
else if(randomNumber==4) {
	JOptionPane.showMessageDialog(null, "Your a great person in general :D !");
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
		}
	}
}
