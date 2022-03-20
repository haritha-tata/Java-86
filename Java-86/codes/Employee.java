class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Sachin";
		sal=5250.5f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}

	public static void main(String[] args) 
	{
		//--create an instance of Employee type
		Employee emp = new Employee();
		System.out.println("Type of emp = " + emp.getClass().getName());

		//--get the state of object with reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//--get the state of object with method
		emp.getDetails();

		//--change the state of object with reference
		emp.empno = 101;
		emp.name = "Sunil Joseph";
		emp.sal = 2500f;

		emp.getDetails();

		//--change the state of object with method
		emp.setDetails();
		emp.getDetails();
	}
}
