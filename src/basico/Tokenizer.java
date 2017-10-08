package basico;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		String msj = "Mi guitarra, es de color azul.";
		StringTokenizer st = new StringTokenizer(msj, ",");
		
		while(st.hasMoreElements()){
			System.out.println(st.nextToken().trim());
		}
	}

}
