package portafolio;

import java.util.Scanner;

public class claseb {

	public static void main(String[] args) {

	Scanner Teclado=new Scanner(System.in);
		
		
		System.out.println("ingresa tu nombre"); 
		String nombre=Teclado.nextLine();
		System.out.println("Tu nombre en mayusculas");
		System.out.println(nombre.toUpperCase());
		System.out.println("Tu nombre en minusculas");
		System.out.println(nombre.toLowerCase());

	}

}
