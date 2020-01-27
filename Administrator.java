
import java.util.Scanner;
//Juan Jose Morales


public class Administrator extends SalariedEmployee {

// instance variables 
	
	private String title; //director or vice
	private String AreaResponsibility; // production, accounting, or personnel
	private String supervisor; // name of the supervisor

// Constructors

public Administrator() {  // no argument constructor
	super();
	title = "<none>";
	AreaResponsibility="<none>";
	supervisor="<none>";
}

//three argument constructor

public Administrator ( String title, String AreaResponsibility, String supervisor  ) {
	this();
	setTitle(title);
	setAreaResponsibility(AreaResponsibility);
	setSupervisor(supervisor);
}

//six argument constructor

public Administrator( String theName, Date theDate, double theSalary, String theTitle, String theAreaResponsibility, String theSupervisor ) {
	
	super(theName, theDate,theSalary);  
	title = theTitle;
	AreaResponsibility = theAreaResponsibility;
	supervisor = theSupervisor; 
}

//mutator methods

public void setTitle (String title) {
	 	this.title = title;
}

public void setAreaResponsibility (String AreaResponsibility) {
		this.AreaResponsibility = AreaResponsibility;
}

public void setSupervisor (String supervisor) {
		this.supervisor = supervisor;
}

//Accessor methods

public String getTitle () {
		return this.title;
}

public String getResponsibility () {
		return this.AreaResponsibility;
}

public String getSupervisor () {
		return this.supervisor;
}

// Reading data method

public void DataScanner() {
	Scanner kbd = new Scanner(System.in);
	
	System.out.print("Please enter the title: ");
			title = kbd.nextLine();
	System.out.print("Please enter the area of responsibility: ");
			AreaResponsibility = kbd.nextLine();
	System.out.print("Please enter the supervisor name: ");
			supervisor = kbd.nextLine();
}

// override equals method

public boolean equals(Administrator otherAdmin) {
	return super.equals(otherAdmin) &&
			title.equals(otherAdmin.title) &&
				AreaResponsibility.equals(otherAdmin.AreaResponsibility) && 
					supervisor.equals(otherAdmin.supervisor);
}

//override toString method

public String toString() {
	
	return super.toString() + ", " + title + ", " + AreaResponsibility +
			 " , supervisor is" + " " + supervisor;
}

}
