package decoratorPattern;

public class EmployeeTwo implements Industry{
	
	Industry industry;

	public EmployeeTwo() {
		this.industry = new Employee();
	}

	public String getSalesReports() {
		return "All "+industry.getSalesReports()+" in order";
	}

}
