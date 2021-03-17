package juego_principal;

import java.util.Scanner;

public class juego_principal {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Scanner scNum = new Scanner(System.in);
		int opcion;

		System.out.println("##### COMIENZA EL JUEGO DE TU VIDA ######");
		System.out.println("Vas por la calle , sales del portal , y de repente ...");
		System.out.println("PISAS UNA MIERDA !!!");
		do {
			System.out.println("\n¿¿¿Que haces ahora??? Elige una opcion y verás el resultado...");
			System.out.println("OPCION 1\nOPCION 2\nOPCION 3");
			opcion = scNum.nextInt();

			switch (opcion) {
			case 1:
				pisaMierda1();
				break;
			case 2:
				pisaMierda2();
				break;
			case 3:
				pisaMierda3();
				break;
			default:
				System.out.println("Eleccion incorrecta.");
			}
		} while (opcion < 1 || opcion > 3);
		
		if(opcion != 2) {
			do {
				System.out.println("\nEntonces llegas al trabajo, irónicamente trabajas en una pequeña oficina con 4 compañeros");
				System.out.println("Al ser 21 de Julio , el calor es agobiante , y no hay aire acondicionado...");
				System.out.println("De repente , entra tu jefa alterada ...Tiene algo que decir !");
				System.out.println( "Elige una opcion y verás el resultado...");
				System.out.println("OPCION 1\nOPCION 2\nOPCION 3");
				opcion = scNum.nextInt();

				switch (opcion) {
					case 1:
						noticiaJefa1();
						break;
					case 2:
						noticiaJefa2();
						break;
					case 3:
						noticiaJefa3();
						break;
					default:
						System.out.println("Eleccion incorrecta.");
					}
			} while (opcion < 1 || opcion > 3);
		}
		
		
		
		
		System.out.println("FIN . Se acabó.");
	}

	static void pisaMierda1() {
		System.out
				.println("Disimulas , y mientras vas andando , arrastras la suela de la zapatilla disimuladamente...");
	}

	static void pisaMierda2() {
		System.out.println(
				"Justo aparece la chica que te gusta , y mientras habla contigo , denota el edor ... y se aleja con una excusa y mirandote con cara rara...");
		System.out.println(
				"A la desesperada , y debido a la distancia alzanado la voz , de tu boca sale lo siguiente : ");
		System.out.println("No soy yo ...Yo me ducho !!! No soy raroooo....tia que me gustas mucho!!! ");
		System.out.println("... ... ... ... obviamente .... esto es un GAME OVER !!!!");
	}

	static void pisaMierda3() {
		System.out.println(
				"Al ser tan supersticioso , continuas alegremente confiando en que hoy sera tu día de suerte .");
	}

	static void noticiaJefa1() {
		System.out.println("Tu jefa : ");
		System.out.println("LO SABÍA!!! Es la tercera vez esta semana que la pisas !! Tus compañeros no pueden seguir así");
		System.out.println("Estás despedido !! GAME OVER muchacho....Búscate un trabajo.");
	}

	static void noticiaJefa2() {
		System.out.println("Chicos ! Día libre , nos vamos al Acuopoliiiiiiiiiis!!! wiiiiiiiiii");
	}

	static void noticiaJefa3() {
		System.out.println("Atención! Teneis 2 horas para terminar el proyecto GitHub o estaréis en serios problemas .");
		System.out.println("Podéis consultar a vuestro encargado , Rafa , que no bromeo ...no me tiembla el pulso a la hora de despedir a gente, y buscar nuevos empleados .");
		System.out.println("El tiempo empieza ya !! Vamos.");
	}

}
