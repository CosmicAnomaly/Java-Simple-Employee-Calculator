import java.util.Scanner;
public class PayCalculator {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		for(int count = 0; count < 3; count++)
		{
		System.out.print("Please enter the employees first name: ");
		String firstName = input.nextLine();
		System.out.print("Please enter the employees last name: ");
		String lastName = input.nextLine();
		System.out.print("Please enter the employee number: ");
		String empNumber = input.nextLine();
		System.out.print("Please enter the hours worked: ");
		double hours = input.nextDouble();
		System.out.print("Please enter the employees pay rate: ");
		double payRate = input.nextDouble();
		input.nextLine();
		
		HourlyEmployee hourlyEmployee1 = new HourlyEmployee(firstName, lastName, empNumber, hours, payRate);
		double totalPay = hourlyEmployee1.calculatePay();
		
		System.out.printf("Employee %s has a gross pay of: $%.2f\n", hourlyEmployee1, totalPay);
		System.out.println();
		}

		input.close();

	}

}
