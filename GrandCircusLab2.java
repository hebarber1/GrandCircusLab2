import java.util.Scanner;

public class GrandCircusLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, x = 0;
		
		System.out.println("Enter a number between 1 and 100:");
		Scanner scnr = new Scanner (System.in);
		
		num = scnr.nextInt();
		x = num % 2;
		
		// branch for even numbers
		if ( x == 0) {
			if (num >= 2 && num <= 25) {
				System.out.println("Even and less than 25.");
			}
			else if (num >=26 && num <=60) {
				System.out.println("Even.");
			}
			else {
				System.out.println(num + " Even.");
			}
			
			}
		
		else if (num > 60) {
			System.out.println(num + " Odd and over 60.");
			}
		
		else {
			System.out.println(num + " Odd.");
		}
		
		
		}
		 
	}



