import com.appstracta.Carro;

public class App {
	public static void main(String[] args) throws Exception {
		Carro carro = new Carro("Blanco", 0, true); // crear objeto o instancia

		// Seteo de propiedades
		carro.setMotor(true);
		carro.setVelocidad(0);

		// llamado de propiedades
		System.out.println("Color :: " + carro.getColor());
		System.out.println("Motor :: " + carro.isMotor());
		System.out.println("Velocidad :: " + carro.getVelocidad());

		// Llamado de metodos
		System.out.println("arrancar :: " + carro.arrancar());
		carro.incrementarVelocidad(100);
		System.out.println("arrancar :: " + carro.getVelocidad());
		System.out.println("apagar :: " + carro.apagar());
	}

}
