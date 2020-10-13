package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class EjemploRadio2 {

	public static void main(String[] args) {
//otra version de radiobutton
		MarcoRadio2 mimarco=new MarcoRadio2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MarcoRadio2 extends JFrame{
	
	public MarcoRadio2(){
		setTitle("Cambiar Stilos");
		setBounds(200, 150, 550, 400);
		LaminaBotones2 milamina=new LaminaBotones2();
		add(milamina);
	}
}
 class LaminaBotones2 extends JPanel{
	 
	 public LaminaBotones2(){
		 setLayout(new BorderLayout());
		 texto=new JLabel("Este Texto Cambia de estilo con los JRadioButton");
		 add(texto, BorderLayout.CENTER);		 
		 
		 ButtonGroup migrupo=new ButtonGroup();
		 boton1=new JRadioButton("Chico", false);
		 boton2=new JRadioButton("Mediano", true);
		 boton3=new JRadioButton("Grande", false);
		 
		 migrupo.add(boton1);
		 migrupo.add(boton2);
		 migrupo.add(boton3);
		 
		 Lamina3=new JPanel();
		 EventoRadio3 mievento3=new EventoRadio3();
		 
		 boton1.addActionListener(mievento3);
		 boton2.addActionListener(mievento3);
		 boton3.addActionListener(mievento3);
		 
		 Lamina3.add(boton1, BorderLayout.SOUTH);
		 Lamina3.add(boton2, BorderLayout.SOUTH);
		 Lamina3.add(boton3, BorderLayout.SOUTH);
		 
		 add(Lamina3, BorderLayout.SOUTH);
		 
		 
		 
	 }
	private class EventoRadio3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==boton1){
				texto.setFont(new Font("Serif", Font.ITALIC,10));
			}
			if(e.getSource()==boton2){
				texto.setFont(new Font("Serif", Font.PLAIN,12));
			}
			if(e.getSource()==boton3){
				texto.setFont(new Font("Serif", Font.ROMAN_BASELINE,24));
			}
		}
		
	}
	 private JPanel Lamina3;
	 private JRadioButton boton1, boton2, boton3;
	 private JLabel texto;
 }