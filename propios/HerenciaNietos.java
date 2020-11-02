package propios;

public class HerenciaNietos extends HerenciaPadre {
	private	String casa;
	private	int CuentaCorriente;
	private String vehiculo;
	private String nombre;
 
	public HerenciaNietos(String nom, int cuenta, String vehi, String casa){
		super(nom, cuenta, vehi, casa);
		this.casa=casa;
		CuentaCorriente=cuenta;
		vehiculo=vehi;
		nombre=nom;
	}
	public String dameBienes(){
		return  "nombre: " + nombre +" vehiculo: "+  vehiculo +" vivienda: "+ casa + " Cuenta: " + CuentaCorriente;
 }
	public static void main(String[] args) {
		 HerenciaPadre Acumulado=new HerenciaPadre("Padre",50000,"camaro", "casa");
		 HerenciaAbuelo AcumuladoAbuelo=new HerenciaAbuelo("Abuelo",80000,"fuera de borda", "chalet");
		 HerenciaAbuelo HerenciaNietos=new HerenciaNietos("nietos", 12100,"moto", "monoHambiente");

		 
			System.out.println(Acumulado.dameBienes());
			System.out.println(AcumuladoAbuelo.dameBienes());
			System.out.println(HerenciaNietos.dameBienes());
	}
}