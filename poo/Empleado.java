package poo;

import java.util.Date;
import java.util.GregorianCalendar;


public class Empleado implements Comparable, Trabajadores {
	
	
	private final String nombre;
	private double sueldo;
	private Date altaContrato;	
	private String seccion;
	private static int idSiguiente=1;
	public int id;
	
	
	public Empleado(String nom, double sue, int dia, int mes, int año){
		nombre=nom;
		sueldo=sue;
		GregorianCalendar Calendario=new GregorianCalendar(año, mes-1, dia);
		altaContrato=Calendario.getTime();
		id=idSiguiente;
		idSiguiente++;		
	}





public Empleado(String nom){
	nombre=nom;
	seccion="Administraiòn";
		
	}
public String dimeEmpleado(){
	return nombre;
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
public String dameNombre(){//getter
	return nombre;
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
public String devuelveDato(){
	return "El nombre es " + nombre + " y la seccion es: " + seccion + ", id: " + id;
}

public int compareTo(Object miObjeto){
	
	Empleado otroEmpleado=(Empleado) miObjeto;
	
	if(this.sueldo<otroEmpleado.sueldo){
		return -1;
	}
	if(this.sueldo>otroEmpleado.sueldo){
		return 1;
	}
	return 0;
	}
public double establece_bono(double gratificacion){
	return Trabajadores.bono_base+ gratificacion;

}
}