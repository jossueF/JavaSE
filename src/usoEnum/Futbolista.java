package usoEnum;

public class Futbolista {
	private int dorsal;
	private String nombre;
	private Demarcacion demarcacion;
	private Equipo equipo;
	
	public Futbolista(){
		
	}
	
	public Futbolista(int dorsal, String nombre, Demarcacion demarcacion, Equipo equipo){
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.demarcacion = demarcacion;
		this.equipo = equipo;
	}

	public String prueba(){
		return equipo.getNombreClub();
	}
	
	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", nombre=" + nombre + ", demarcacion=" + demarcacion + ", equipo="
				+ equipo + "]";
	}
	
}
