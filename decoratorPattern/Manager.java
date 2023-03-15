package decoratorPattern;

public class Manager {
	
	public static void main(String[] args) {
		
		Industry industry = new EmployeeTwo();
		
		System.out.println(industry.getSalesReports());
		
	}

}
