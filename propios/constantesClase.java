package propios;

public class constantesClase {

	public static void main(String[] args) {
		
		Empleados trabajador1=new Empleados("Diego");
		Empleados trabajador2=new Empleados("Daniel");
		Empleados trabajador3=new Empleados("Maneyro");
		Empleados trabajador4=new Empleados("Britez");
		trabajador1.CambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDato());
		System.out.println(trabajador2.devuelveDato());
		System.out.println(trabajador3.devuelveDato());
		System.out.println(trabajador4.devuelveDato());
		System.out.println("El proximo id es :" + Empleados.DimeProximoId());
	}

}

class Empleados{
	public Empleados(String nom){
		nombre=nom;
		seccion="Administraiòn";
		id=idSiguiente;
		idSiguiente++;
	}
	public static int DimeProximoId(){
		return idSiguiente;
	}
	
	
	public void CambiaSeccion(String seccion){
		this.seccion=seccion;
	}
	
	public String devuelveDato(){
		return "El nombre es " + nombre + " y la seccion es: " + seccion + ", id: " + id;
	}		

	
	private final String nombre;
	private String seccion;
	private static int idSiguiente=1;
	private int id;
}