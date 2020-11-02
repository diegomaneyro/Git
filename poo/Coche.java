package poo;

public class Coche {
	
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private boolean asientos_cuero,climatizador;
	private int peso_total;
	private int ruedas;
	


public Coche(){
	
	ruedas=4;
	largo=2000;
	ancho=200;
	motor=1600;
	peso_plataforma=500;
	
}
public String datos_generales(){
	return "Motor " + motor + "cc. "  + largo + " cm de largo. " + ancho + " cm de ancho. " + peso_plataforma + " kg de peso," +" ruedas: " + ruedas; 
}
public void define_color(String color_coche){
	color=color_coche;
}
public String dime_color(){
	return"Color: " + color;
}
public void define_asientos(String asientos){
	if(asientos.equalsIgnoreCase("si")){
		asientos_cuero=true;
	}
	else
		asientos_cuero=false;
}
public String dime_asientos(){
	if(asientos_cuero==true){
		return "Asientos: deportivos";
	}
	else
		return "Asientos: De fabrica";
}
public void climatizador(String configure_climatizador){
	if(configure_climatizador.equalsIgnoreCase("mejorado")){
		climatizador=true;
	}else{
		climatizador=false;
	}
}
public String dime_climatizador(){
	if(climatizador==true){
		return "Climatizacion: climatizador electronico";
	}else{
		return "Climatizacion: Aire acondicionado de fabrica";
	}
}
public String dime_motor(){
	return "Motor: 1600cc";
}
public int dime_ruedas(){
	return ruedas;
}

public void establece_peso_final(){
	int peso_carroceria=500;
	peso_total=peso_plataforma + peso_carroceria;
	if(asientos_cuero=true){
		peso_total=peso_total+100;}
	if(climatizador=true){
		peso_total=peso_total+100;
	}
}

public String dime_peso_final(){	
	return "Peso final: " + peso_total + " kg";
	}	

public String establece_precio(){
	int precio_final=10000;
	if(asientos_cuero=true){
		precio_final+=100;
		}
	if(climatizador=true){
		precio_final+=150;
	}
		return "Precio final es : u$s " + precio_final;
	}
}
















