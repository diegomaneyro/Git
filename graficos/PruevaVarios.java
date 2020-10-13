package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruevaVarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_principal mimarco=new Marco_principal();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class Marco_principal extends JFrame{
	
	public Marco_principal(){
		
		setTitle("Prueva Varios");
		
		setBounds(1300, 100, 300, 200);
		
		Lamina_Principal lamina=new Lamina_Principal();
		
		add(lamina);
	}
}

class Lamina_Principal extends JPanel{
	
	public Lamina_Principal(){
		
		JButton boton_nuevo=new JButton("Nuevo");
		
		boton_cerrar=new JButton("cerrar todo");
		
		add(boton_nuevo);
		
		add(boton_cerrar);
		
		OyenteNuevo miOyente=new OyenteNuevo();
		
		boton_nuevo.addActionListener(miOyente);
		
		
	}
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Marco_Emergente marco=new Marco_Emergente(boton_cerrar);
			
			marco.setVisible(true);
		}
		
	}
	
	
		JButton boton_cerrar;
}

class Marco_Emergente extends JFrame{
	
	public Marco_Emergente(JButton boton_de_principal){
		
		
		
		contador++;
		
		setTitle("Ventana " + contador);
		
		setBounds(40*contador, 40*contador, 300, 150);
	
		CierraTodos oyenteCerrar=new CierraTodos();
		
		boton_de_principal.addActionListener(oyenteCerrar);
	
	}
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();// cuando se llama a este metodo cirra todo y livera memoria
		}
		
	}
	
	private static int contador=0;

}

