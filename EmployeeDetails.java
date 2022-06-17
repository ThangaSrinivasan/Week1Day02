package week1.day2;

public class EmployeeDetails {

	public void printEmployeeName(String empName, int empId) 
	{
		System.out.println(empName);
		System.out.println(empId);	
	}
	
	public void getEmployeeAddress(String empAddress)
	{
		System.out.println(empAddress);
	}
	
	public void printEmployeeSalary(double empSalary)
	{
		System.out.println(empSalary);
	}
	
	public void printEmployeeMobileNumber(long mobNum)
	{
	System.out.println(mobNum);
	}
	
	public static void main(String[] args) {
		String empName1 = "Thanga";
		int empId1 = 672752;
		String empAddress1 = "Coimbatore";
		double empSalary1 = 9.5;
		long mobNum1 = 9944811899L;
		EmployeeDetails emp = new EmployeeDetails();
		emp.printEmployeeName(empName1, empId1) ;
		emp.getEmployeeAddress(empAddress1);
		emp.printEmployeeSalary(empSalary1);
		emp.printEmployeeMobileNumber(mobNum1);

	}

}
