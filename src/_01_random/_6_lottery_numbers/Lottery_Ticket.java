package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Ticket {
public static void main(String[] args) {
int num = 0;
	num = new Random().nextInt(1000000);
	System.out.println(num);
	JOptionPane.showMessageDialog(null, "Lottery Ticket\n" + num);
}
}

