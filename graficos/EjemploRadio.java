package graficos;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class EjemploRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEjemploRadio mimarco=new MarcoEjemploRadio();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoEjemploRadio extends JFrame{
	 
	public MarcoEjemploRadio(){
		
		setBounds(550, 300, 500, 350);
		
		LaminaEjemploRadio milamina=new LaminaEjemploRadio();
		
		add(milamina);
	}
	
}

class LaminaEjemploRadio extends JPanel{
	
	public LaminaEjemploRadio(){
		
		setLayout(new BorderLayout());
		
		texto=new JLabel("En un lugar de la m,ancha cuyo nombre....");
		
		add(texto, BorderLayout.CENTER);
		
		ButtonGroup migrupo=new ButtonGroup();
		
		boton1=new JRadioButton("Pequeño", false);
		
		boton2=new JRadioButton("Mediano", true);
		
		boton3=new JRadioButton("Grande", false);

		boton4=new JRadioButton("muy_Grande", false);
		
		JPanel laminaRadio=new JPanel();
		
		EventoRadio mievento=new EventoRadio();
		
		boton1.addActionListener(mievento);
		boton2.addActionListener(mievento);
		boton3.addActionListener(mievento);
		boton4.addActionListener(mievento);
		
		migrupo.add(boton1);
		
		migrupo.add(boton2);
		
		migrupo.add(boton3);
		
		migrupo.add(boton4);
		
		laminaRadio.add(boton1);
		laminaRadio.add(boton2);
		laminaRadio.add(boton3);
		laminaRadio.add(boton4);
		
		add(laminaRadio, BorderLayout.SOUTH);
	}
	
	private class EventoRadio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==boton1){
				texto.setFont(new Font("Serif", Font.PLAIN,10));//cambia con font el stily de texto: estilo serif fuente plana y tamaño
			}else if(e.getSource()==boton2){
				texto.setFont(new Font("Serif", Font.PLAIN,12));				
			}else if(e.getSource()==boton3){
				texto.setFont(new Font("Serif", Font.PLAIN,14));
			}else if(e.getSource()==boton4){
				texto.setFont(new Font("Serif", Font.PLAIN,24));
				
			}
				
			}
		}
		
	
	
	private JLabel texto;
	
	private JRadioButton boton1, boton2, boton3, boton4;
}