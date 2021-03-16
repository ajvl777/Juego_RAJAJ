package juego_principal;

import java.util.Scanner;

public class juego_principal {

	public static void main(String[] args) {

		Scanner scNum = new Scanner(System.in);
		int primeraOpcion;
		int segundaOpcion;

		System.out.println("##### COMIENZA EL JUEGO DE TU VIDA ######");
		System.out.println("Eres un chico joven, con el tipico trabajo que te da lo justo para vivir");
		System.out.println("Estas en tu casa, pensando en tus quehaceres");
		
		do {
			System.out.println("\n¿Que haces?");
			System.out.println("Opcion 1: Sales de tu casa para hacer la compra");
			System.out.println("Opcion 2: Decides limpiar el coche");
			System.out.println("Opcion 3: Decides cocinar la comida de mañana");
			primeraOpcion = scNum.nextInt();

			switch (primeraOpcion) {
			case 1:

				switch (decisionAlSalirDeCasa()) {

				case 1:

					opcionViejoConocido();
					break;
				case 2:

					opcionExnovia();
					break;
				case 3:

					opcionMejorAmigo();
					break;
				}

				break;
			}
		} while (primeraOpcion < 1 || primeraOpcion > 3);
		
	}

	static int decisionAlSalirDeCasa() {

		int decision = 0;
		System.out.println("Sales de casa y lo primero que encuentras cuando sales por la puerta es...");

		do {

			System.out.println("Selecciona una de las siguientes opciones");
			System.out.println("Opcion 1: A un viejo conocido");
			System.out.println("Opcion 2: A tu exnovia");
			System.out.println("Opcion 3: A tu mejor amigo");

			Scanner teclado = new Scanner(System.in);
			decision = teclado.nextInt();

			switch (decision) {

			case 1:

				System.out.println("Este viejo conocido te ofrece unirte a un nuevo modelo de negocio");
				break;

			case 2:

				System.out.println("Tu exnovia ha venido a decirte que esta embarazada");
				break;

			case 3:

				System.out.println("Tu mejor amigo ha venido a pedirte dinero");
				break;
			}

		} while (decision < 1 || decision > 3);

		return decision;
	}

	static int opcionViejoConocido() {

		int decision = 0;
		System.out.println("Hablas con el sobre el tipo de trabajo");

		do {

			System.out.println("Selecciona una de las siguientes opciones");
			System.out.println("Opcion 1: La aceptas, te hace falta dinero y te parece una buena oportunidad");
			System.out.println("Opcion 2: Lo rechazas, ya has probado antes ese tipo de trabajos");
			Scanner teclado = new Scanner(System.in);
			decision = teclado.nextInt();

			switch (decision) {

			case 1:

				System.out.println("Es un modelo de estafa piramidal ¡Estas arruinado!");
				break;

			case 2:

				System.out.println("De momento mantienes tu ahorros...");
				break;
			}

		} while (decision < 1 || decision > 2);

		return decision;
	}

	static int opcionExnovia() {

		int decision = 0;
		System.out.println("Dice que no sabe si el hijo es tuyo...");

		do {

			System.out.println("Selecciona una de las siguientes opciones");
			System.out.println("Opcion 1: Es imposible, no te salen las cuentas...");
			System.out.println("Opcion 2: Piensas que es posible, pero no quieres hacerte cargo de el");
			System.out.println("Opcion 3: Solo puede ser tuyo, y...¡le pides matrimonio ahi mismo!");

			Scanner teclado = new Scanner(System.in);
			decision = teclado.nextInt();

			switch (decision) {

			case 1:

				System.out.println("Y piensas bien, es imposible que sea tuyo!");
				break;

			case 2:

				System.out.println("Tu Exnovia te hace pagarle una pension y te exprime hasta el final");
				System.out.println("Estas arruinado!");
				break;

			case 3:

				System.out.println("Te casaste! La Cagaste!");
				break;
			}

		} while (decision < 1 || decision > 3);

		return decision;
	}

	static int opcionMejorAmigo() {

		int decision = 0;
		System.out.println("Te dice que lo necesita para pagar el alquiler");

		do {

			System.out.println("Selecciona una de las siguientes opciones");
			System.out.println("Opcion 1: Le dices que no puedes dejarle nada, pero le ofreces vivir contigo");
			System.out.println("Opcion 2: Le das todo lo que tienes, aunque sabes que le va a durar poco");
			System.out.println("Opcion 3: Le dejas lo justo para pagar este mes, y le ayudas a buscar trabajo");

			Scanner teclado = new Scanner(System.in);
			decision = teclado.nextInt();

			switch (decision) {

			case 1:

				System.out.println("Vivis juntos, y asi pagas menos alquiler!");
				break;

			case 2:

				System.out.println("Tu amigo tarda poco en fundir el dinero en bares y fiestas");
				System.out.println("¡Estas arruinado!");
				break;

			case 3:

				System.out.println("Acaba encontrando trabajo...Es tu nuevo compañero!");
				break;
			}

		} while (decision < 1 || decision > 3);

		return decision;

	}

}
