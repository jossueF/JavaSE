package singleton;

public class Logger {

	private static Logger log;
	
	private Logger(){}
	
	public static Logger getInstance(){
		if(log == null){
			log = new Logger();
		}
		return log;
	}
	
	public void log(String msj){
		System.out.println("El mensaje contiene la siguiente informacion: " + msj);
	}
}
