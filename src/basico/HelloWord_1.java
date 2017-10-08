package basico;

public class HelloWord_1 {

	static String randomString = "String to print";
	static final double PINUM = 3.141529;
	
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		System.out.println(randomString);
		System.out.println(PINUM);
		
		int integerOne = 22;
		int integerTwo = integerOne + 1;
		
		System.out.println(integerTwo);
		
		char randomChar = 65;
		char anotherChar = 'A';
		
		System.out.println(randomChar);
		
		/*
		 * toString() - metodo para convertir variables primitivas a String
		 * 
		 * parseInt(), parseShort(), parseLong(), parseByte(), parseFloat(), 
		 * parseDouble(), parseBoolean() - metodos para convertir un String 
		 * en variables primitivas
		 * 
		 * (int), (byte), (short), (long), (double) parseo, float, boolean y char
		 * no funcionan como parseo
		 * 
		 */
		
	}

}
