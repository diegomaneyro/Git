package propios;

public class HerenciaPadre extends HerenciaAbuelo{

	private	String casa;
	private	int CuentaCorriente;
	private String vehiculo;
	private String nombre;
	
	public HerenciaPadre(String nom, int cuenta, String vehi, String casa){
			super(nom, cuenta, vehi, casa);
	this.casa=casa;
	CuentaCorriente=cuenta;
	vehiculo=vehi;
	nombre=nom;
	
	}	
	public int Dime_CuentaCorrinete(){
		return CuentaCorriente;
	}
	public String Dime_casa(){
		return casa ;
	}
	public String dameBienes(){
		return "nombre: " + nombre +" vehiculo: "+  vehiculo +" vivienda: "+ casa + " Cuenta: " + CuentaCorriente;
		}
}
	