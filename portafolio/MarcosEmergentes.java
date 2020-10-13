package portafolio;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MarcosEmergentes {

	public static void main(String[] args) {
	
		MarcoPrincipal mimarco=new MarcoPrincipal();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPrincipal extends JFrame{
	
	public MarcoPrincipal(){
		
		setVisible(true);
		
		setBounds(450, 50, 400, 300);
		
		Lamina milamina=new Lamina();
		
		add(milamina);
	}
}

class Lamina extends JPanel{
	
	public Lamina(){
		
		JButton botonCrear=new JButton("Crear nueva Ventana");
		
		add(botonCrear);
		
		botonCerrar=new JButton("Cerrar Ventanas");
		
		add(botonCerrar);
		
		OyenteNuevo oyente=new OyenteNuevo();
		
		botonCrear.addActionListener(oyente);
	}
	
	
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		VentanasEmergentes ventanas=new VentanasEmergentes(botonCerrar);
		
		}	
	}
	
	JButton botonCerrar;
}

class VentanasEmergentes extends JFrame{
	
	private static int contador=0;
	
	public VentanasEmergentes(JButton boton_de_principal){
		
		contador++;
		
		setTitle("Ventana " + contador);
		
		setBounds(40*contador, 40*contador, 400, 300);
		
		setVisible(true);
		
		CerrarTodo Oyentecerrar=new CerrarTodo();
		
		boton_de_principal.addActionListener(Oyentecerrar);
	}
class CerrarTodo implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dispose();
	}
	
}
	
}