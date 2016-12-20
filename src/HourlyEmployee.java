
public class HourlyEmployee {
	private String firstName;
	private String lastName;
	private String empNumber;
	private double hours;
	private double payRate;

	public HourlyEmployee(String firstName, String lastName, String empNumber, double hours, double payRate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empNumber = empNumber;
		this.hours = hours;
		this.payRate = payRate;
	}
	
	HourlyEmployee hourlyemployee1;
	HourlyEmployee hourlyemployee2;
	HourlyEmployee hourlyemployee3;
	
	
	public double calculatePay()
	{
		if(hours > 40)
		{
			double totalPay = (hours - 40) * (payRate * 1.5);
			return totalPay + (40 * payRate);
		}
		else
		{
			double totalPay = (hours * payRate);
			return totalPay;
		}

	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	@Override
	public String toString() {
		return ""+ firstName + " " + lastName + "(" + empNumber + ")";
	}

	
}
