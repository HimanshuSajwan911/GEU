package experiment;

public class Commandline {

	public static void main(String[] args){
		
		System.out.println("Name: " + args[0]);
		System.out.println("UniversityRollNo: " + Integer.parseInt(args[2]));
		System.out.println("Course: " + args[1]);
		System.out.println("Semester: " + Integer.parseInt(args[3]));
		
	}
}
