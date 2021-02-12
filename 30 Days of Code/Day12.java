import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	int sum = 0;
    public Student(String fname,String lname,int id,int testScores[]){
        super(fname,lname,id);
        sum = (Arrays.stream(testScores).sum())/testScores.length;
    }
    public char calculate(){
        if (sum>=90&&sum<=100) {
           	return 'O';
        }else if(sum>=80&&sum<90){
        	return 'E';
        }
        else if(sum>=70&&sum<80){
        	return 'A';
        }else if(sum>=55&&sum<70){
        	return 'P';
        }else if(sum>=40&&sum<55){
        	return 'D';
        }else{
        	return 'T';
        }   
    }
}

class Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}