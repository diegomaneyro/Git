package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		Persona[] lasPersonas=new Persona[2];
		lasPersonas[0]=new Empleado2("Luis conde", 50000, 2009,02,25);
		lasPersonas[1]=new Alumno("Ana Lopez", "Biologia");

		for (Persona p:lasPersonas){
			System.out.println(p.dameNombre()+","+p.dameDescripcion());
		}
	}

}
abstract class Persona{//clase abstract `porque tiene un metodo abstract
	public Persona(String nom){
		nombre=nom;
	}
	public String dameNombre(){
	return nombre;
	}
	public abstract String dameDescripcion();//defrien un ametodo abstracto geter 
	
	private String nombre;
}


class Empleado2 extends Persona {
	
	
	private double sueldo;
	private Date altaContrato;	
	private String seccion;
	private static int idSiguiente=1;
	public int id;
	
	
	public Empleado2(String nom,double sue, int dia, int mes, int año){
		super(nom);
		sueldo=sue;
		GregorianCalendar Calendario=new GregorianCalendar(año, mes-1, dia);
		altaContrato=Calendario.getTime();
		id=idSiguiente;
		idSiguiente++;		
	}
	
public String dameDescripcion(){
	return "Este empleado tine un id: " +id+ ", con un sueldo de: "+sueldo;
}
public Date dimeAltaContato(){
	return altaContrato;
}
public void estableceSueldo(double aumento){
	sueldo+=sueldo*aumento/100;
}
public void CambiaSeccion(String seccion){
	this.seccion=seccion;
}
public double dimeSueldo(){
	return sueldo;
}
public Double dameSueldo(){//getter
	return sueldo;
}
public Date dameFechaContrato(){
	return altaContrato;
}
public void subeSueldo(double porcentaje){
	double aumento=sueldo*porcentaje/100;
	sueldo+=aumento;
}
public static int DimeProximoId(){
	return idSiguiente;
	}
}
class Alumno extends Persona{
	public Alumno(String nom, String car){	
		super(nom);
		carrera=car;
	}		
public String dameDescripcion(){
	return "Este alumno esta estudiando la carrera: " + carrera ;
	}
	private String carrera;
}



