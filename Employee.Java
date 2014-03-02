public class Employee {

	private String FirstName;
	private String LastName;
	private Double SalaryValue;
	
	//constructor
	public Employee( String FirstNameParameter, String LastNameParameter, Double SalaryValueParameter )
	{
		FirstName = FirstNameParameter;
		LastName = LastNameParameter;
		if( SalaryValueParameter <0 )
			SalaryValue = 0.0;
		else
			SalaryValue = SalaryValueParameter;
	
	} //end constructor
	
	//Set methods
	
	void setFirstName( String FirstNameParameter )
	{
		FirstName = FirstNameParameter;
	}
	
	void setLastName( String LastNameParameter )
	{
		LastName = LastNameParameter;
	}
	
	void setSalaryValue( Double doubleSalaryValue )
	{
		if(doubleSalaryValue < 0 )
			SalaryValue = 0.0;
		else
			SalaryValue = doubleSalaryValue;
			
	}
	
	//Get methods
	String getFirstName()
	{
		return FirstName;
	}
	
	String getLastName()
	{
		return LastName;
	}
	
	Double getSalaryValue()
	{
		return SalaryValue;
	}
	
}
