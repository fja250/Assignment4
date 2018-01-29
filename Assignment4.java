
import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String userInput = input.nextLine();

		char ch = userInput.charAt(0);		
		int result = ch - 'A' + 'A';	
		System.out.println(result);
	
	}

}
