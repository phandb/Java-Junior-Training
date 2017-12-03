package AssignmentTwo;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		/*Create a student database with the following attributes:
		 * New student constructor that takes name and SSN in the arguments
		 * Automatically create an email ID based on the name
		 * Set a private static ID
		 * Generate a user ID that is combination of static ID, random 4-digit number between 1000 and 9000, 
		 * and last 4 of SSN
		 * Methods: enroll(), pay(), checkBalance(), toString(), showCourse()
		 * Use encapsulation to set variables (phone, city, state)
		 * 
		 */
		StudentDatabase std1 = new StudentDatabase("Dalton", "Phan", "671326482");
		std1.enroll("Become Junior Java Developer", 1000.0);
		std1.enroll("C#", 700.0);
		std1.enroll("Java Spring Framework", 500.0);
		std1.pay(1500);
		
		std1.setPhone("5123006238");
		std1.setCity("Austin");
		std1.setState("texas");
		System.out.println(std1.toString());
		
		StudentDatabase std2 = new StudentDatabase("Tim", "Short", "671326483");
		std2.enroll("Master Java Developer", 1000.0);
		std2.enroll("PHP", 800.0);
		std2.enroll("C#", 500.0);
		std2.pay(1700);
		std2.setPhone("71423006238");
		std2.setCity("Santa Anna");
		std2.setState("California");
		System.out.println(std2.toString());
	}
 
}

class StudentDatabase {
	//properties of student database
	private static int iD = 10;
	private String fName;
	private String lName;
	private String SSN;
	private String studentEmail; //email ID based on the name
	private String studentID;  //ID + random 4-digit number between 1000 and 9000 + last 4 SSN
	private String phone;
	private String city;
	private String state;
	private double balance = 0.0;
	private String courseName = "";
	
	//Constructors
	public StudentDatabase(String fName, String lName, String SSN) {
		System.out.println("New Student Account Created");
		this.fName = fName;
		this.lName = lName;
		this.SSN = SSN;
		iD++;
		setStudentEmail();
		setStudentID();
	}
	
	private void setStudentEmail() {
		studentEmail = fName.toLowerCase() + "." + lName.toLowerCase() + "@udemy.com";
		System.out.println("Your Email Address: " + studentEmail);
	}
	
	private void setStudentID() {
		int max = 9000;
		int min = 1000;
		//random number between 1000 and 9000 >> random*(range+1)+min 
		int random = (int)(Math.random()*((max-min) +1) +1000); 
		studentID = iD + "" + random + SSN.substring(5);
		System.out.println("Your ID Number: " + studentID);
	}
	
	//Methods: enroll(), pay(), checkBalance(), toString(), showCourse()
	
	public void enroll(String courseName, double coursePrice) {
		this.courseName = this.courseName +  courseName + ", ";
		balance = balance + coursePrice;
		showCourse();		
	}
	
	public void pay(double amount) {
		balance = balance - amount;
		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	public void showCourse() {
		System.out.println(fName + " " + lName + " Enrolled in " + courseName );
	}
	
	@Override
	public String toString() {
		return "[Name: " + fName + " " + lName + "]\n[Student ID: " + studentID + "]\n[Phone: " +
	            phone + "]\n[City: " + city + "]\n[state: " + state + "]\n[Course Enrolled: "
				+ courseName + "]\n[Balance: " + balance + "]\n";
		
	}
	//Encapsulate to set and get phone, city, and state;
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	 public String getPhone() {
		 return phone;
	 }
	 
	 public void setCity(String city) {
		 this.city = city;
	 }
	 
	 public String getCity() {
		 return city;
	 }
	 
	 public void setState(String state) {
		 this.state = state;
	 }
	 
	 public String getState() {
		 return state;
	 }
}
