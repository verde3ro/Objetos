import com.appstracta.Carro;

public class App {
	public static void main(String[] args) throws Exception {
		Carro carro = new Carro("Blanco", 200); // crear objeto o instancia

		carro.setMotor(true);
		carro.setVelocidad(100);
		System.out.println("Color :: " + carro.getColor());
		System.out.println("Motor :: " + carro.isMotor());
		System.out.println("Velocidad :: " + carro.getVelocidad());

	}

}
