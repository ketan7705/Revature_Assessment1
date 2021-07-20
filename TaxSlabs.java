package Assessment;

import java.util.Scanner;

public class TaxSlabs {
	public void menTax() {
		System.out.println("Enter Your Gender 1 for men and 2 for women : ");
		Scanner g = new Scanner(System.in);
		int a = g.nextInt();
		if(a==1) {
			System.out.println("Enter Your Income : ");
			Scanner sc =new Scanner(System.in);
			int income = sc.nextInt();
		
			if(income < 180000 && income > 0 )
				System.out.println("No Tax");
			else if(income < 500000 && income > 180001)
				System.out.println("10 % Tax you have to Pay");
			else if(income < 800000 && income > 500001)
				System.out.println("20 % Tax you have to Pay");
			else
				System.out.println("30 % Tax you have to Pay");
		}
		else {
			System.out.println("Enter Your Income : ");
			Scanner z =new Scanner(System.in);
			int income = z                               .nextInt();
		
			if(income < 190000 && income > 0 )
				System.out.println("No Tax");
			else if(income < 500000 && income > 190001)
				System.out.println("10 % Tax you have to Pay");
			else if(income < 800000 && income > 500001)
				System.out.println("20 % Tax you have to Pay");
			else
				System.out.println("30 % Tax you have to Pay");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxSlabs taxSlabs = new TaxSlabs();
		taxSlabs.menTax();
	}

}
