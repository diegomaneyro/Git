package pruebas;

import java.util.Scanner;

public class uso_tallas {
	
	enum talla{
		MINI("s"),MEDIANO("m"),GRANDE("g"),MUY_GRANDE("xl");
		
			private talla(String abreviaturas){
				this.abreviaturas=abreviaturas;
					}
		
			public String dame_abreviaturas(){
			return abreviaturas;
					}
		
		private String abreviaturas;	
	}
		
	
	
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Escribe una talla: mini,mediano,grande, muy grande" );
		String entrada_datos=entrada.next().toUpperCase();//pasa a mayusculas lo introducido en onsla
		
		talla la_talla=Enum.valueOf(talla.class, entrada_datos);
		System.out.println("Talla=" + la_talla);
		System.out.println("Abreviatura=" + la_talla.dame_abreviaturas());
		
	}

}
