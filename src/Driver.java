import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	
	public static String[] TERMS = {"", "+5", "-3", "+x", "-x",
            "+6x", "-9x", "+x^3", "-x^5", "+x^-2",
            "-x^-7", "+7x^4", "-2x^13", "+25x^-8", "-54x^-17"};
	
	
	public static void main(String[] args) {
		
		
		//Driver.mainMenu();
		 
	}
	
	public static void mainMenu() {
		
		int choice = -1;
		Polynomial poly1 = new Polynomial();
		Scanner keyboard = new Scanner(System.in);
		
		while (choice != 2) {
			try {
				System.out.println("Polynomial Creator");
				System.out.println("What would you like to do?");
				System.out.println("1. Create New Polynomial");
				System.out.println("2. Exit");
				System.out.print("Enter Choice Number> ");
			} catch (InputMismatchException ime) {
				keyboard.nextLine();
				System.out.println("You did not enter an integer, or the integer is out of bounds. Please try again.");
			}
			choice = keyboard.nextInt();
		
			if (choice == 1) {
				int secondChoice = -1;
				while(secondChoice !=2) {
					try {
						System.out.println("Creating Empty Polynomial...");
						
						System.out.println("What would you like to do next?");
						System.out.println("1. Add Term to polynomial");
						System.out.println("2. Exit");
						System.out.print("Enter Choice Number> ");
					} catch (InputMismatchException ime) {
						keyboard.nextLine();
						System.out.println("You did not enter an integer, or the integer is out of bounds. Please try again.");
					}
					secondChoice = keyboard.nextInt();
					
					if (secondChoice == 1) {
						
						int tempCoef=0;
						int tempExp=0;
						Term newTerm = new Term();
						try {
							System.out.println("Please enter the coefficient of your polynomial: ");
							System.out.println();
							tempCoef = keyboard.nextInt();
							System.out.println("Please enter the exponent of your polynomial: ");
							System.out.println();
							tempExp = keyboard.nextInt();
						} catch (InputMismatchException ime) {
							keyboard.nextLine();
							System.out.println("You did not enter an integer, or the integer is out of bounds. Please try again.");
						}
						
						newTerm.setCoef(tempCoef);
						newTerm.setExp(tempExp);
						poly1.addTerm(newTerm);
						System.out.println("Here is your term: ");
						System.out.println(newTerm.toString());
						System.out.println("Here is your current Polynomial: ");
						System.out.println(poly1.toString());
						
						
						
					} else if(secondChoice ==2) {
						System.out.println("Goodbye");
					}
				}
			} else if (choice ==2) {
				System.out.println("Goodbye");
			} else {
				System.out.println("Invalid selection, try again...");
			}
		}
		
		keyboard.close();
	}

}
