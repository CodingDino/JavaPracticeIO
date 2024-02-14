import java.util.Scanner; // Needed for input


public class JavaPracticeIO {

	
	
	public static void main(String[] args) {
		
		// Output Example
		System.out.println("Hello world!");
		
		// Variable used for output
		String toPrint = "What is your favourite colour?";
		System.out.println(toPrint);
		
		// Input example
		Scanner input = new Scanner(System.in); 
		String colourChoice = input.nextLine();
		System.out.println("Ah, I like "+colourChoice+" too!");
	}
	
	
	
}
