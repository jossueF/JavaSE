//El patron singleton permite hacer una sola instancia de una clase/objeto.

package singleton;

public class App {

	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		logger.log("mensaje aleatorio");
	}

}
