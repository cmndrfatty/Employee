
public class EmployeeTest {
	
	public static void main(String[] args)
    {

		String temp;
		Double temp2;
		Double temp3;
		
		Employee EmployeeOneObject = new Employee("Diego","Estrada", 15000.0);
		Employee EmployeeTwoObject = new Employee("Armando","Estrada", 17000.0);
		
		temp = EmployeeOneObject.getFirstName();
		System.out.print(temp);
		temp = EmployeeOneObject.getLastName();
		System.out.print(" ");
		System.out.print(temp);
		System.out.print("'s yearly salary is ");
		temp2 = EmployeeOneObject.getSalaryValue();  
		System.out.print(temp2);
		System.out.print("\n");
	
		
		temp = EmployeeTwoObject.getFirstName();
		System.out.print(temp);
		temp = EmployeeTwoObject.getLastName();
		System.out.print(" ");
		System.out.print(temp);
		System.out.print("'s yearly salary is ");
		temp2 = EmployeeTwoObject.getSalaryValue();
		System.out.print(temp2);
		System.out.print("\n");
		
		temp2 = EmployeeOneObject.getSalaryValue();
		temp3 = temp2 * 1.1;
		EmployeeOneObject.setSalaryValue(temp3);
		 
		temp2 = EmployeeTwoObject.getSalaryValue();
		temp3 = temp2 * 1.1;
		EmployeeTwoObject.setSalaryValue(temp3);
		
		System.out.println("\nAfter a 10% raise:\n ");
		
		temp = EmployeeOneObject.getFirstName();
		System.out.print(temp);
		temp = EmployeeOneObject.getLastName();
		System.out.print(" ");
		System.out.print(temp);
		System.out.print("'s new yearly salary is ");
		temp2 = EmployeeOneObject.getSalaryValue();
		System.out.print(temp2);
		System.out.print("\n");
		
		temp = EmployeeTwoObject.getFirstName();
		System.out.print(temp);
		temp = EmployeeTwoObject.getLastName();
		System.out.print(" ");
		System.out.print(temp);
		System.out.print("'s new yearly salary is ");
		temp2 = EmployeeTwoObject.getSalaryValue();
		System.out.print(temp2);
		System.out.print("\n");
		
		}

}
