//Enum es un tipo de dato que solo permite crear los objetos que se hayan definido en el.
//Los enumerados son objetos y no Strings definidos dentro de su misma clase con constructor privado
// y si tienen atributos estos solo tienen metodos getter para obtener el valor del atributo.

package usoEnum;

public class Main {

	enum ABECEDARIO {A,B,C,D,E,F};
	
	enum TALLA {
		MINI, 
		MEDIANO,  //Lista finita de objetos o enumerados
		GRANDE, 
		MUY_GRANDE
	};
	
	enum TALLA_2 {
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private TALLA_2(String abreviatura){
			this.abreviatura = abreviatura;
		}
		private String abreviatura;
		
		public String getAbreviatura(){
			return abreviatura;
		}
	}
	
	public static void main(String[] args) {
		ABECEDARIO abc = null;
		System.out.println(ABECEDARIO.A);
		System.out.println(abc.B);
		System.out.println();
		///////////////////////////////////////////////
		
		TALLA_2 talla2 = Enum.valueOf(TALLA_2.class, "GRANDE");
		System.out.println("Talla = " + talla2);
		System.out.println(TALLA_2.GRANDE);
		System.out.println(talla2.getAbreviatura());
		System.out.println();
		
		for(TALLA_2 s : TALLA_2.values()){
			System.out.println(s.toString());
		}
		System.out.println();
		////////////////////////////////////////////////////
		
		Demarcacion delantero = Demarcacion.DELANTERO;
		System.out.println(delantero.name());
		System.out.println(delantero.toString());
		System.out.println(delantero.ordinal());
		System.out.println();
		/////////////////////////////////////////////////////
		
		Equipo villareal = Equipo.VILLAREAL;
		System.out.println(villareal.name());
		System.out.println(villareal.getNombreClub());
		System.out.println(villareal.getPuestoLiga());
		System.out.println(villareal.getClass());
		System.out.println();
		//////////////////////////////////////////////////
		
		Futbolista casillas = new Futbolista(1, "Casillas", Demarcacion.PORTERO, Equipo.REAL_MADRID);
		System.out.println(casillas.toString());
		System.out.println(casillas.prueba());
	}
}
