package poo;

import java.util.Arrays;

public class Uso_Empleado{

	public static void main(String[] args) {
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000, 2006, 9, 25);
		jefe_RRHH.establece_incentivo(2570);
		
		
		Empleado[] misEmpleados=new Empleado[6];
		misEmpleados[0]=jefe_RRHH; //polimorfismo
		misEmpleados[1]=new Jefatura("Maria", 95000, 1999, 5, 26);
		misEmpleados[2]=new Empleado("Ana", 300000, 2000, 07, 07);
		misEmpleados[3]=new Empleado("Carlos", 500000, 1995, 06, 02);
		misEmpleados[4]=new Empleado("Paco", 250000, 2000, 06, 03);
		misEmpleados[5]=new Empleado("Antonio", 470000, 2009, 11, 9);
		
		jefe_RRHH.establece_incentivo(2570);
		
		Jefatura Jefa_contabilidad=(Jefatura) misEmpleados[1];//refundicion casting
		Jefa_contabilidad.establece_incentivo(55000);
		
		System.out.println("El jefe " + Jefa_contabilidad.dameNombre() + " tiene un bono de: " + Jefa_contabilidad.establece_bono(500));
		System.out.print(misEmpleados[3].dameNombre() + "Tiene un bono de : " + misEmpleados[3].establece_bono(200));
		for(Empleado e:misEmpleados){
			e.subeSueldo(5);
		}
		
		Arrays.sort(misEmpleados);	
		
		
		for(Empleado e:misEmpleados){
			System.out.println("Nombre: " + e.dameNombre() + 
			", Sueldo: " + e.dameSueldo() + ", Fecha de alta: " + e.dameFechaContrato() + ", id:" + e.id);
		}
		
	}
	


	
}

	
		
