package ooprog;
import java.util.Scanner;
public class Payroll {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = -1;
        try {
            String hoursInput = scanner.nextLine().trim();
            hoursWorked = Double.parseDouble(hoursInput);
            
            if (hoursWorked < 0) {
                System.err.println("Error: Hours worked must be non-negative.");
                return;
            }
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input for hours worked.");
            return;
        }

        System.out.print("What is your regular pay rate? ");
        double payRate = -1;
        try {
            String rateInput = scanner.nextLine().trim();
            payRate = Double.parseDouble(rateInput);
            
            if (payRate < 0) {
                System.err.println("Error: Pay rate must be non-negative.");
                return;
            }
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input for regular pay rate.");
            return;
        } finally {
            scanner.close();
        }
        
        Employee employee = new Employee(1001, payRate);

        double regularPay = employee.calculateRegularPay(hoursWorked);
        double overtimePay = employee.calculateOvertimePay(hoursWorked);

        System.out.printf("Regular pay is %.1f%n", regularPay);
        System.out.printf("Overtime pay is %.1f%n", overtimePay);

        System.out.println("\n----jGRASP: Operation complete.");
    }
}