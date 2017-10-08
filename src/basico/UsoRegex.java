package basico;

import java.util.regex.*;

public class UsoRegex {

	public static void main(String[] args) {
		String longString = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
		String strangeString = " 1Z aaa **** *** {{{ {{ { ";
		
		//Buscar palabra con 2 a 20 caracteres
		//[A-Za-z]{2,20} == \\w{2,20}
		//regexChecker("[A-Za-z.@]{2,21}\\s", longString);
		
		//Verificar si el código postal tiene 5 digitos
		//\\d{5}
		//Debe empezar y terminar con un espacio en blanco
		//regexChecker("\\d{5}\\s", longString);
		
		//Dos caracteres que comiencen con A ó C
		//regexChecker("A[K]|C[Aa]", longString);
		
		//{5,} valor minimo de caracteres
		
		//Buscar si el mensaje contiene 1 o mas estrellas.
		//regexChecker("\\*{1,}", strangeString);

		//Busca la palabra exacta "com"
		//regexChecker("com", longString);
		
		//Permite todos los caracteres
		//regexChecker(".", longString);
		
		//Encuentra que la frase coincida al principio del mensaje
		//regexChecker("^ Derek", longString);
		
		//Encuentra que la frase coincida al final del mensaje 
		//regexChecker("1234 $", longString);
	}

	public static void regexChecker(String regexExp, String msj){
		Pattern pattern = Pattern.compile(regexExp);
		Matcher matcher = pattern.matcher(msj);
		
		while(matcher.find()){
			if(matcher.group().length() != 0){
				System.out.println(matcher.group().trim());
			}
		}
	}
	
}
