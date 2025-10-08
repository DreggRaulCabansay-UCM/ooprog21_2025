package ooprog;

public class Employee {
	private int employeeNumber;
    private double payRate;
    
    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double MAX_RATE = 60.00;
    public static final double OVERTIME_MULTIPLIER = 1.5;
    public static final int REGULAR_HOURS_LIMIT = 40;

    public Employee(int employeeNumber, double payRate) {
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public double calculateRegularPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, REGULAR_HOURS_LIMIT);
        return regularHours * payRate;
    }

    public double calculateOvertimePay(double hoursWorked) {
        if (hoursWorked <= REGULAR_HOURS_LIMIT) {
            return 0.0;
        }

        double overtimeHours = hoursWorked - REGULAR_HOURS_LIMIT;
        double overtimeRate = payRate * OVERTIME_MULTIPLIER;
        return overtimeHours * overtimeRate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }
}