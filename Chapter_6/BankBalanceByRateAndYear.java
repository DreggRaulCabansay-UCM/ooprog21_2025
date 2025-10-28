package oprog;
import java.util.Scanner;
	class BankBalanceByRateAndYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        double balance;
        double[] interestRates = {0.02, 0.03, 0.04, 0.05};

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        // Outer loop for each interest rate
        for (int i = 0; i < interestRates.length; i++) {
            double rate = interestRates[i];
            double newBalance = balance; // reset for each rate

            System.out.println("\nWith an initial balance of $" + balance +
                    " at an interest rate of " + rate);

            // Inner loop for 1–4 years
            for (int year = 1; year <= 4; year++) {
                newBalance = newBalance + (newBalance * rate);
                System.out.println("After year " + year + " balance is $" + newBalance);
            }
        }

        input.close();
    }
}