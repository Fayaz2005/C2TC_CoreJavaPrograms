package entityclassassignment1;

public class Customer {
	    public int rollNo;
	    public String name;
	    public String department;

	    public Customer(int rollNo, String name, String department) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.department = department;
	    }

	    public void display() {
	        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Department: " + department);
	    }
	}
