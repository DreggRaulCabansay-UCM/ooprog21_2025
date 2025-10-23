package oprog;
import java.util.Scanner;
	class BankBalance2 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        final double INTEREST_RATE = 0.03;
	        double balance;
	        int year = 0;
	        int choice;

	        System.out.print("Enter initial bank balance > ");
	        balance = input.nextDouble();

	        do {
	            year++;
	            balance = balance + (balance * INTEREST_RATE);
	            System.out.println("After year " + year + " at " + INTEREST_RATE + " interest rate, balance is $" + balance);

	            System.out.println("Do you want to see the balance at the end of another year?");
	            System.out.print("Enter 1 for yes or any other number for no >> ");
	            choice = input.nextInt();

	        } while (choice == 1);

	        input.close();
	    }
	}