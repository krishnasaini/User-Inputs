import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// create scanner object
		Scanner input = new Scanner(System.in);
		// output the prompt
		System.out.println("Enter a Line of Text: ");
		// wait for the user to enter a line of text
		String line = input.nextLine();
		// tell them what they entered
		System.out.println("You Entered: " + line);
	}

}