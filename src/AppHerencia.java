import com.appstracta.herencia.Bus;
import com.appstracta.herencia.Coche;
import com.appstracta.herencia.Moto;
import com.appstracta.herencia.Vehiculo;

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

		// Muestra toString
		System.out.println(coche.toString());

		// Creamos instancia de moto
		Moto moto = new Moto();

		System.out.println("Moto :: " + moto.doblar());
		System.out.println("Coche :: " + coche.doblar());

		// Creamos objeto de Bus
		Bus bus = new Bus();
		bus.setEjes(3);
		System.out.println("número ejes del bus :: " + bus.getEjes());

		// Polimorfismo
		Vehiculo bus2 = new Bus();
		bus2.setColor("Blanco");

		System.out.println("Color del bus 2 :: " + bus2.getColor());

	}

}
