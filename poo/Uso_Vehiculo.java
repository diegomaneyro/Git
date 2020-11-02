package poo;



public class Uso_Vehiculo {

	public static void main(String[] args) {
		
	Coche micoche1=new Coche();
	micoche1.define_color("Rojo");
	Furgoneta mifurgoneta=new Furgoneta( 7, 580);
	mifurgoneta.define_color("azul");
	mifurgoneta.define_asientos("si");
	mifurgoneta.climatizador("mejorado");
	System.out.println(micoche1.datos_generales()+micoche1.dime_color());
	System.out.println(mifurgoneta.datos_generales() + mifurgoneta.dimeDatosFurgoneta());
	}

}
