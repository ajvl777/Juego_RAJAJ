package juego_principal;

import java.util.Scanner;

public class juego_principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scNum = new Scanner(System.in);
		int opcion;
		
		System.out.println("##### COMIENZA EL JUEGO DE TU VIDA ######");
		System.out.println("Vas por la calle , sales del portal , y de repente ...");
		System.out.println("PISAS UNA MIERDA !!!");
		do {
			System.out.println("\n¿¿¿Que haces ahora??? Elige una opcion y verás el resultado...");
			System.out.println("OPCION 1\nOPCION 2\nOPCION 3");
			opcion = scNum.nextInt();		
			
			switch(opcion) {
			case 1:
				pisaMierda1();
				break;
			case 2 :
				pisaMierda2();
				break;
			case 3 :
				pisaMierda3();
				break;
			default: System.out.println("Eleccion incorrecta.");	
			}
		}while(opcion<1 || opcion>3);
	}
	
	

}
