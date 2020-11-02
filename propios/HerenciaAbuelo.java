package propios;

public class HerenciaAbuelo extends bienes {//clase publica abuelo

private int CuentaCorriente;
private String vehiculo;
private String casa;
private String nombre;
	
	public HerenciaAbuelo(String nom, int cuenta, String vehi, String casa){
		super(nom);
		CuentaCorriente=cuenta;
		vehiculo=vehi;
		this.casa=casa;
		nombre=nom;
		
}
public int Dime_CuentaCorriente(){
	return CuentaCorriente;
}
public String Dime_bote(){
	return vehiculo;
}
public String Dime_Vivienda(){
	return casa;
	}
public String dameBienes(){
	return "nombre: " + nombre +" vehiculo: "+  vehiculo +" vivienda: "+ casa + " Cuenta: " + CuentaCorriente;
	}

}


abstract class bienes{//clase abstracta
	private String nombre;

	public bienes(String nom){
		nombre=nom;
	}
	public String dimePariente(){
		return nombre;
	}
	public abstract String dameBienes();
}
