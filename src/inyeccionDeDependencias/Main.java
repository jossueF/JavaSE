package inyeccionDeDependencias;

public class Main {

	public static void main(String[] args) {
		Messi messi = new Messi(new Barcelona());
		messi.mostrarEquipo();
		
		Messi messi2 = new Messi(new Juventus());
		messi2.mostrarEquipo();
	}

}
