package Assessment;

import java.util.Scanner;

public class Eggs {
	public void calculate() {
		System.out.println("Enter the quantity of eggs : ");
		Scanner sc = new Scanner(System.in);
		int eggs = sc.nextInt();
		int gross;
		int aboveGross;
		int dozens;
		int eggExtra;
		
		gross = eggs / 144;
		aboveGross = eggs % 144;
		dozens = aboveGross / 12;
		eggExtra = aboveGross % 12;
		System.out.print("Your number of eggs is ");
	      System.out.print(gross);
	      System.out.print(" gross, ");
	      System.out.print(dozens);
	      System.out.print(" dozen, and ");
	      System.out.print(eggExtra);
	      System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eggs e = new Eggs();
		e.calculate();
	}

}
