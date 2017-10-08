package usoEnum;
//BARCA, REAL_MADRID, etc son los nombres del enumerado u objetos de la clase y tienen como atributos
//"nombreClub" y "puestoLiga"
public enum Equipo {
	BARCA("FC Barcelona", 1),
	REAL_MADRID("Real Madrid", 2),
	SEVILLA("Sevilla FC", 4),
	VILLAREAL("Villareal", 7);
	
	private String nombreClub;
	private int puestoLiga;
	
	private Equipo(String nombreClub, int puestoLiga){
		this.nombreClub = nombreClub;
		this.puestoLiga = puestoLiga;
	}
	
	public String getNombreClub(){
		return nombreClub;
	}
	
	public int getPuestoLiga(){
		return puestoLiga;
	}
}
