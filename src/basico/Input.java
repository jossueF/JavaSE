package basico;

import java.util.Random;
import java.util.Scanner;

public class Input {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		int randomNumber = new Random().nextInt(10);
		System.out.print("Adivina el numero del 1 al 10: ");
		
		while(userInput.nextInt() != randomNumber){
			System.out.print("Error. Intentalo otra vez: ");
		}
		
		System.out.println("Correcto, el numero " + randomNumber + " es igual a " + randomNumber);
	}

}
