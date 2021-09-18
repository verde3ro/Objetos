import com.appstracta.herencia.Coche;

public class AppHerencia {

	public static void main(String[] args) {
		Coche coche = new Coche();

		// Propiedades de la clase Padre
		coche.setRuedas(4);
		coche.setColor("Rojo");
		coche.setMotor(true);
		coche.setVelocidad(200);

		// Proíedades de clase Hija
		coche.setMarca("Ford");

		System.out.println("Ruedas del coche :: " + coche.getRuedas());
		System.out.println("Marca del coche :: " + coche.getMarca());
	}

}
