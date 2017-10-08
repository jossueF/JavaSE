package basico;

import java.util.Arrays;
import java.util.Random;

public class Arreglos {

	public static void main(String[] args) {
		int[] numbersRandoms = new int[10];
		Random random = new Random();
		
		for(int i = 0; i < numbersRandoms.length; i++){
			numbersRandoms[i] = random.nextInt(10);
		}
		
		System.out.println(Arrays.toString(numbersRandoms) + "\n");
		
		/////////////////////////////////////////////////////////
		
		int[][] numberMatriz = new int[10][10];
		
		for(int i = 0; i < numberMatriz.length; i++){
			for(int j = 0; j < numberMatriz[i].length; j++){
				numberMatriz[i][j] = random.nextInt(10);
				System.out.print("| " + numberMatriz[i][j] + " ");
			}
			System.out.println("|");
		}
		System.out.println();
		
		////////////////////////////////////////////////////////////
		
		int[][] numberMatriz2 = new int[10][10];
		for(int i = 0; i < numberMatriz2.length; i++){
			for(int j = 0; j < numberMatriz2[i].length; j++){
				System.out.print("| " + i + j + " ");
			}
			System.out.println("|");
		}
		
		/////////////////////////////////////////////////////////////
		// Use foreach
		
		int[][] numberMatriz3 = new int[10][10];
		int fila = 0, col = 0;
		
		System.out.println("\nUse foreach");
		for(int[] i : numberMatriz3){
			for(int j : i){
				System.out.print("| " + fila + col + " ");
				col++;
			}
			System.out.println("|");
			col = 0;
			fila++;
		}
	}

}
