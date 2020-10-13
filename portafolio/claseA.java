package portafolio;

import java.util.Scanner;

public class claseA {

	public static void main(String[] args) {
		
	Scanner Entrada=new Scanner(System.in);

	
		System.out.println("Introduce tu primer nombre");
		String nombrePila=Entrada.nextLine();
		System.out.println("Introduce tu segundo nombre");
		String nombreSegundo=Entrada.nextLine();
		System.out.println("Introduce tu apellido materno");
		String apellidoMaterno=Entrada.nextLine();
		System.out.println("Introduce tu apellido paterno");
		String apellidoPaterno=Entrada.nextLine();
		String nombreCompleto=(nombrePila + nombreSegundo + apellidoMaterno + apellidoPaterno);
		System.out.println("Tu nombre completo tiene: " + nombreCompleto.length() + " caracteres de logitud");
		
	
	}

}
