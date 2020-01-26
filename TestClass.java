
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Administrator admin1 = new Administrator(); 
	Administrator admin2 = new Administrator(); 
	Administrator admin3 = new Administrator(); 
		
// Read data from user 
		
		System.out.println("Admin 1: ");
			admin1.DataScanner();
		System.out.println("Admin 2: ");
			admin2.DataScanner();
		System.out.println("Admin 3: ");
			admin3.DataScanner();
		
	admin1.setName("Juan Morales");
	admin2.setName("Jose Marcano");
	admin3.setName("Jose Marcano"); // testing equals method 
		
	admin1.setHireDate(new Date (7,3,1997));	
	admin2.setHireDate(new Date (3,22,2000));
	admin3.setHireDate(new Date (3,22,2000));
		
	admin1.setSalary(34000);	
	admin2.setSalary(54000);	
	admin3.setSalary(54000);	
	
	//toString method
	
	System.out.println("Admin 1 is: " );
		System.out.println(admin1);
	
	System.out.println("Admin 2 is: " );
		System.out.println(admin2);
	
	System.out.println("Admin 3 is: " );
		System.out.println(admin3);
	
	//equals method
	System.out.println(admin2.equals(admin3));
	
	
	}

}
