package entityclassassignment1;

public class MainProgram {

	public class Main {
	    public static void main(String[] args) {
	        Customer s1 = new Customer(101, "Arun", "IT");
	        Customer s2 = new Customer(102, "Divya", "CSE");
	        Customer s3 = new Customer(103, "Kiran", "ECE");

	        System.out.println("Student Details:");
	        s1.display();
	        s2.display();
	        s3.display();
	    }
	}

}
