package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCalculadora mimarco=new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora(){
		
		setTitle("Calculadora");
		
		setBounds(500, 300, 450, 300);
		
		LaminaCalculadora milamina=new LaminaCalculadora();
		
		add(milamina);
		
		
	}
}

class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora(){
		
		principio=true;
		
		setLayout(new BorderLayout());
		
		pantalla=new JButton("0");
		
		pantalla.setEnabled(false);//desabilita el boton
		
		add(pantalla, BorderLayout.NORTH);//ubuica la lamina en la zona norte
		
		
		milamina2=new JPanel();//crea una lamina dentro del conmstructor de la anterior instanciando a JPanel
		
		milamina2.setLayout(new GridLayout(4, 4));//le da formato a la lamina con GridLayout de 4 x4
		
		ActionListener insertar=new InsertaNumero();
		
		ActionListener orden=new AccionOrden();
		
		
		
		ponerBoton("7", insertar);//llama al metodo que crea un boton
		
		ponerBoton("8", insertar);
		
		ponerBoton("9", insertar);
		
		ponerBoton("/", orden);
		
		ponerBoton("4", insertar);
		
		ponerBoton("5", insertar);
		
		ponerBoton("6", insertar);
		
		ponerBoton("*", orden);
		
		ponerBoton("1", insertar);
		
		ponerBoton("2", insertar);
		
		ponerBoton("3", insertar);
		
		ponerBoton("-", orden);
		
		ponerBoton("0", insertar);
		
		ponerBoton(".", orden);
		
		ponerBoton("=", orden);
		
		ponerBoton("+", orden);
		
		add(milamina2, BorderLayout.CENTER);
		
		ultimaOperacion="=";
		}

	private void ponerBoton(String rotulo, ActionListener oyente){
		
		JButton boton=new JButton(rotulo);
		
		milamina2.add(boton);
		
		boton.addActionListener(oyente);
	}
	
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(principio){//si es verdadero entra solo un avez, 
				
				pantalla.setText(" ");//como principio es true entra y pone la pantalla en blanco
				
				principio=false;//luego la pone en false asi no vuelve a entrar
			}
			
			String entrada=e.getActionCommand();
			
			pantalla.setText(pantalla.getText() + entrada);//el texto mas lo que alla anteriormente
			
		}
		
	}
	
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String operacion=e.getActionCommand();//almacena lo que se presiono 
			
			
			calcular(Double.parseDouble(pantalla.getText())); 
			
			ultimaOperacion=operacion;
			
			principio=true;
			
		}
		public void calcular(double x){
			
			if(ultimaOperacion.equals("+")){
				
				resultado+=x;
			
			}
			else if(ultimaOperacion.equals("/")){
				
				resultado/=x;
			}


			else if(ultimaOperacion.equals("-")){
				
				resultado-=x;
			}

			else if(ultimaOperacion.equals("*")){
				
				resultado*=x;
			}
			else if(ultimaOperacion.equals("=")){
				
				resultado=x;
			}
			pantalla.setText("" + resultado);
		}
	}
	
	private String ultimaOperacion;
	
	private JPanel milamina2;
	
	private JButton pantalla;

	private boolean principio;
	
	private double resultado;
}



