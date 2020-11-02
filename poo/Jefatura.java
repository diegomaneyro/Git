package poo;

public class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int año, int mes, int dia){
		super(nom, sue, año, mes, dia);
	}
	public void establece_incentivo(double b){
		incentivo=b;
	}
	public  double dimeSueldo(){
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe + incentivo;
	}
	private double incentivo;
	
	public String tomar_decisiones(String decision){
		return "Un miembro de la direccion ha tomado la decisoin de: " + decision;
	}

	public double establece_bono(double gratificacion){
		double prima=2000;
		return Trabajadores.bono_base+ gratificacion+prima;
}
	

}