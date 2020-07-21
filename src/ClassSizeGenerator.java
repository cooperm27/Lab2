import java.util.Scanner;

public class ClassSizeGenerator {

	public static void main(String[] args) {

		double width;
		double length;
		double height;
		int roomCount = 0;
		String playAgain = "";
		
		Scanner scnr = new Scanner(System.in);


		do {
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			System.out.println(" ");
			System.out.println("Enter Length:");
			length = scnr.nextDouble();
			System.out.println("Enter Width:");
			width = scnr.nextDouble();
			System.out.println("Enter Height:");
			height = scnr.nextDouble();
			scnr.nextLine();
			
			double area = (length*width);
			double perimeter = ((2 * length) + (2 * width));
			double volume = (length * width * height);
			
			System.out.println("Area: " + area);
			System.out.println("Perimiter: " + perimeter);
			System.out.println("Volume: " + volume);
			System.out.println(" ");
			System.out.println("Continue Y/N ");
			playAgain = scnr.nextLine();
			roomCount++;
			}
			while (playAgain.equalsIgnoreCase ("y")); {	
			}
			if (playAgain.equalsIgnoreCase ("N")) {
				System.out.println("Thank you, you measured " + roomCount++ + " room(s).");
			}
			scnr.close();
		}
	}


